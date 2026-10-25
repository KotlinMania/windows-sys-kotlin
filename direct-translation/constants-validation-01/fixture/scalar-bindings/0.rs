pub struct Code { pub value:u128 }
impl Code { pub const fn from_bits(value:u128)->Self { Self { value } } }
