// factory record
pub struct Product { pub value:u32 }
impl Factory for Product {
    /// first factory
    fn construct(/* no args */)->Self {
        // preserve nested value scopes
        unsafe { /* caller obligation */ { provider::next(/* once */) } }
    }
}
impl Product {
    /// second factory
    pub fn alternate()->Self { provider::next() }
}
