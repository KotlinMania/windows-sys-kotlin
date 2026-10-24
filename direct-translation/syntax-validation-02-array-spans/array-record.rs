#[repr(C)]
pub struct Packet {
    // payload field
    pub data: [u8; /* fixed length */ 16],
    // nested field
    pub pairs: [[u16; 2]; 4],
}
