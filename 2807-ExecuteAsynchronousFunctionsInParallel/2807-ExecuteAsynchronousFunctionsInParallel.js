// Last updated: 08/04/2026, 14:37:20
/**
 * @param {Array<Function>} functions
 * @return {Promise<any>}
 */
var promiseAll = f => new Promise((res,rej)=>{
  let r=[],c=0;
  f.forEach((fn,i)=>fn().then(v=>{
    r[i]=v; if(++c===f.length) res(r);
  }).catch(rej));
});

/**
 * const promise = promiseAll([() => new Promise(res => res(42))])
 * promise.then(console.log); // [42]
 */