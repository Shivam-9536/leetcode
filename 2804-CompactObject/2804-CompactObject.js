// Last updated: 08/04/2026, 14:37:21
/**
 * @param {Object|Array} obj
 * @return {Object|Array}
 */
var compactObject = function(obj) {
  if (Array.isArray(obj)) {
    return obj
      .filter(Boolean)
      .map(compactObject);
  } else if (obj !== null && typeof obj === "object") {
    let res = {};
    for (let key in obj) {
      let val = compactObject(obj[key]);
      if (Boolean(val)) res[key] = val;
    }
    return res;
  }
  return obj;
};