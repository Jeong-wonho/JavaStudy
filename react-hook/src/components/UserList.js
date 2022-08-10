function User({user}) {
    return(
        <div>
            <b>{user.username}</b><span>({user.email})</span>
        </div>
    )
}

export default function UserList({users}) {
    return (
        <div>
            {users.map(user => (
                <User user={user} key={user.id} />
            ))}
        </div>
    )
}