// Last updated: 16/03/2026, 23:13:04
/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let x = init
  return {
    increment: () => ++x,
    decrement: () => --x,
    reset: () => (x = init)
  }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */