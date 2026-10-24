// field positions matter
#[repr(C)]
pub struct Example {
 // flags
 pub flags: u32,
 // bytes
 pub bytes: [u8; 8],
}
windows_link::link!("example.dll" "system" fn F(input: *mut Example) -> u32);
