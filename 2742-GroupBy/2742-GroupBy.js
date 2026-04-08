// Last updated: 08/04/2026, 14:37:34
/**
 * @param {Function} fn
 * @return {Object}
 */
Array.prototype.groupBy = function(fn) {
    let res = {};
    for(let item of this){
        let key = fn(item);
        if (!res[key]) res[key] = [];
        res[key].push(item);
  }
  return res;
};

/**
 * [1,2,3].groupBy(String) // {"1":[1],"2":[2],"3":[3]}
 */