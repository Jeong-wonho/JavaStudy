import UserList from "./components/UserList";
import {useCallback, useMemo, useReducer, useRef, useState} from "react";
import CreateUser from "./components/CreateUser";

function countActiveUsers(users) {
  console.log('활성 사용자 수를 세는중...');
  return users.filter(user => user.active).length;
}

const initialState = {
  inputs : {
    username:'',
    email:''
  },
  users: [
    {
      id: 1,
      username: 'velopert',
      email: 'public.velopert@gmail.com',
      active: true

    },
    {
      id: 2,
      username: 'tester',
      email: 'tester@example.com',
      active:false
    },
    {
      id: 3,
      username: 'liz',
      email: 'liz@example.com',
      active:false
    }
  ]
}

function reducer(state, action) {
  switch (action.type) {
    case 'CHANGE_INPUT':
      return {
        ...state,
        inputs: {
          ...state.inputs,
          [action.name]: action.value
        }
      };
    case 'CREATE_USER':
      return {
        inputs: initialState.inputs,
        users: state.users.concat(action.user)
      }
    case 'TOGGLE_USER':
      return {
        ...state,
        users: state.users.map(user =>
        user.id === action.id ? {...user, active: !user.active }: user
        )
      };
    case 'REMOVE_USER':
      return {
        ...state,
        users: state.users.filter(user =>user.id !== action.id)
      };
    default:
      return state;
  }

}
function App() {
  // const [inputs, setInputs]=useState({username: '', email: ''});

  // const { username, email } = inputs;
  //
  // const onChange = useCallback(e => {
  //   const {name, value} = e.target;
  //   setInputs({
  //     ...inputs,
  //     [name]: value
  //   })
  // },[]);

  // const [users, setUsers] = useState([
  //   {
  //     id: 1,
  //     username: 'velopert',
  //     email: 'public.velopert@gmail.com',
  //     active: true
  //
  //   },
  //   {
  //     id: 2,
  //     username: 'tester',
  //     email: 'tester@example.com',
  //     active:false
  //   },
  //   {
  //     id: 3,
  //     username: 'liz',
  //     email: 'liz@example.com',
  //     active:false
  //   }
  // ]);

  // const nextId = useRef(4);
  //
  // const onCreate = useCallback(() => {
  //   const user = {
  //     id: nextId.current,
  //     username,
  //     email
  //   };
  //   setUsers(users=>users.concat(user));
  //   setInputs({
  //     username:'',
  //     email:''
  //   });
  //   nextId.current += 1;
  // },[username, email]);
  //
  // const onRemove = useCallback((id) => {
  //   setUsers(users.filter(user => user.id !== id));
  // },[]);
  //
  // const onToggle = useCallback(id => {
  //   setUsers(
  //       users.map(user=>
  //           user.id === id ? {...user, active: !user.active} : user
  //       )
  //   )
  // },[]);
  //
  // const count = useMemo(()=>countActiveUsers(users), [users]);
  const [state, dispatch] = useReducer(reducer, initialState);
  const nextId = useRef(4);

  const {users} = state;
  const {username, email} = state.inputs;

  const onChange = useCallback(e => {
    const {name, value} = e.target;
    dispatch({
      type: 'CHANGE_INPUT',
      name,
      value
    });
  }, []);

  const onCreate = useCallback(() => {
    dispatch({
      type: 'CREATE_USER',
      user: {
        id: nextId.current,
        username,
        email
      }
    });
    nextId.current += 1;
  }, [username, email]);

  const onToggle = useCallback(id => {
    dispatch({
      type:'TOGGLE_USER',
      id
    });
  }, []);

  const onRemove = useCallback(id => {
    dispatch({
      type: 'REMOVE_USER',
      id
    });
  }, []);

  const count = useMemo(() => countActiveUsers(users), [users]);
  return (
      <>
        {/*<CreateUser username={username} email={email} onChange={onChange} onCreate={onCreate}/>*/}
        {/*<UserList users={users} onRemove = {onRemove} onToggle={onToggle}/>*/}
        {/*<div>활성 사용자수 : {count}</div>*/}
        <CreateUser username={username} email={email} onChange={onChange} onCreate={onCreate}/>
        <UserList users={users} onToggle={onToggle} onRemove={onRemove}/>
        <div>활성사용자 수: {count}</div>
      </>
  );
}

export default App;
