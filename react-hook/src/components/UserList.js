function User({user, onRemove}) {
    return(
        <div>
            <b>{user.username}</b><span>({user.email})</span>
            <button onClick={()=> onRemove(user.id)}>삭제</button>
        </div>
    )
}

export default function UserList({users, onRemove}) {
    return (
        <div>
            {users.map(user => (
                <User user={user} key={user.id} onRemove={onRemove} />
            ))}
        </div>
    )
}