const CreateUser = ({ username, email, onChange, onCreate}) => {
    return (
        <div>
            <input type="text" name="username" placeholder="계정명" onChange={onChange} value={username}/>
        </div>
    )
}

export default CreateUser;
