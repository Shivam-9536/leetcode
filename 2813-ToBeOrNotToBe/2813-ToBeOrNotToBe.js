// Last updated: 16/03/2026, 23:13:02
/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    return {
    toBe: function(val2) {
      if (val === val2) {
        return true;
      }
      throw new Error("Not Equal");
    },
    notToBe: function(val2) {
      if (val !== val2) {
        return true;
      }
      throw new Error("Equal");
    }
  };
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */