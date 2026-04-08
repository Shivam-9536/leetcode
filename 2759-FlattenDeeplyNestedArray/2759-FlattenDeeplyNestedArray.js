// Last updated: 08/04/2026, 14:37:27
/**
 * @param {Array} arr
 * @param {number} depth
 * @return {Array}
 */
var flat = (a,n)=>{
  let r=[];
  const f=(x,d)=>{
    for(let v of x)
      Array.isArray(v)&&d>0?f(v,d-1):r.push(v);
  };
  f(a,n);
  return r;
};