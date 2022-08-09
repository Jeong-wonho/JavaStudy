//@ts

/**
 *
 * @param {object} config
 * @param {string} config.url
 * @param {string} config.def
 * @returns {boolean}
 */
export function init(config) {
  return true;
}

/**
 *
 * @param {number} code
 * @returns {number}
 */
export function exit(code) {
  return code + 1;
}
