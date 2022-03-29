const moment = require("moment");
let now = moment();
console.log(now.format());

let nowFormat = now.format("YYYMMDD");
console.log("포맷적용합니다");
console.log(nowFormat);
