// Last updated: 08/04/2026, 14:37:39
/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
    let m=new Map();
  return (...a)=>m.has(k=JSON.stringify(a))?m.get(k):(m.set(k,fn(...a)),m.get(k));
    
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */