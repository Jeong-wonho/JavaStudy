import {useRef, useState} from "react";


function InputSample() {
    const initialState = { name:"", nickname:""}
    const [inputs, setInputs] = useState(initialState);
    const nameInput = useRef();
    const {name, nickname} = inputs;

    const onChange = (e) => {
        const {value, name} = e.target;
        setInputs({
            ...inputs,
            [name]: value
        });
    }


    const onReset = () => {
        setInputs({
            name:'',
            nickname:'',
        })
        nameInput.current.focus();
    };

    return (
        <div>
            <input placeholder="이름" name="name" onChange={onChange} value={name} ref={nameInput}/>
            <input placeholder="닉네임" name={"nickname"} onChange={onChange} value={nickname}/>
            <button onClick={onReset}>초기화</button>
            <div>
                <b>값</b>
                {name}({nickname})
            </div>
        </div>
    )
}

export default InputSample;