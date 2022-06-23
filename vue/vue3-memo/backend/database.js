const mariadb = require("mariadb");
const pool = mariadb.createPool({
  host: "127.0.0.1",
  user: "root",
  password: "mongta",
  connectionLimit: 5,
  database: "memo",
});
module.exports = {
  async run(query, params) {
    return new Promise((resolve) => {
      pool
        .getConnection()
        .then((conn) => {
          conn
            .query(query, params)
            .then((rows) => {
              resolve(rows);
              console.log(rows);
              conn.end();
            })
            .then((res) => {
              console.log(res); // { affectedRows: 1, insertId: 1, warningStatus: 0 }
              conn.end();
            })
            .catch((err) => {
              //handle error
              console.log(err);
              conn.end();
            });
        })
        .catch((err) => {
          //not connected
        });
    });
  },
};
