// value 0
pub const V0:probe::Code=probe::Code::from_bits(0);
// value 1
pub const V1:probe::Code=probe::Code::from_bits(18446744073709551615);
// value 2
pub const V2:probe::Code=probe::Code::from_bits(18446744073709551616);
// value 3
pub const V3:probe::Code=probe::Code::from_bits(170141183460469231731687303715884105728);
// value 4
pub const V4:probe::Code=probe::Code::from_bits(340282366920938463463374607431768211455);
// value 5
pub const V5:probe::Code=probe::Code::from_bits(0x12345678_9abc_def0_0102_030405060708);
// value 6
pub const V6:probe::Code=probe::Code::from_bits(0o1777777777777777777777u128);
pub struct Key { pub code:probe::Code, pub tag:u32 }
pub const KEY:Key=Key { /* tag first */ tag:7, /* code second */ code:probe::Code::from_bits(0x0102030405060708) };
