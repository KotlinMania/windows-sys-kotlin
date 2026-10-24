// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Mod has no candidate rule
// mod literals;


// UNSUPPORTED Rust 3:1: declaration Use has no candidate rule
// #[doc(hidden)]
// pub use literals::*;


public typealias `BOOL` = Int;
public typealias `HRESULT` = Int;
// UNSUPPORTED Rust 8:1: non-scalar type Ptr unsupported
// pub type PSTR = *mut u8;

// UNSUPPORTED Rust 9:1: non-scalar type Ptr unsupported
// pub type PWSTR = *mut u16;

// UNSUPPORTED Rust 10:1: non-scalar type Ptr unsupported
// pub type PCSTR = *const u8;

// UNSUPPORTED Rust 11:1: non-scalar type Ptr unsupported
// pub type PCWSTR = *const u16;

// UNSUPPORTED Rust 12:1: non-scalar type Ptr unsupported
// pub type BSTR = *const u16;

// UNSUPPORTED Rust 13:1: non-scalar type Ptr unsupported
// pub type HSTRING = *mut core::ffi::c_void;


// UNSUPPORTED Rust 15:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Copy, Clone, Default)]
// pub struct GUID {
//     pub data1: u32,
//     pub data2: u16,
//     pub data3: u16,
//     pub data4: [u8; 8],
// }


// UNSUPPORTED Rust 24:1: declaration Impl has no candidate rule
// impl GUID {
//     pub const fn from_u128(uuid: u128) -> Self {
//         Self { data1: (uuid >> 96) as u32, data2: (uuid >> 80 & 0xffff) as u16, data3: (uuid >> 64 & 0xffff) as u16, data4: (uuid as u64).to_be_bytes() }
//     }
// }


// UNSUPPORTED Rust 30:1: unresolved scalar type GUID
// pub const IID_IUnknown: GUID = GUID::from_u128(0x00000000_0000_0000_c000_000000000046);


// UNSUPPORTED Rust 32:1: declaration Struct has no candidate rule
// #[repr(C)]
// pub struct IUnknown_Vtbl {
//     pub QueryInterface: unsafe extern "system" fn(this: *mut core::ffi::c_void, iid: *const GUID, interface: *mut *mut core::ffi::c_void) -> HRESULT,
//     pub AddRef: unsafe extern "system" fn(this: *mut core::ffi::c_void) -> u32,
//     pub Release: unsafe extern "system" fn(this: *mut core::ffi::c_void) -> u32,
// }


// UNSUPPORTED Rust 39:1: unresolved scalar type GUID
// pub const IID_IInspectable: GUID = GUID::from_u128(0xaf86e2e0_b12d_4c6a_9c5a_d7aa65101e90);


// UNSUPPORTED Rust 41:1: declaration Struct has no candidate rule
// #[repr(C)]
// pub struct IInspectable_Vtbl {
//     pub base: IUnknown_Vtbl,
//     pub GetIids: unsafe extern "system" fn(this: *mut core::ffi::c_void, count: *mut u32, values: *mut *mut GUID) -> HRESULT,
//     pub GetRuntimeClassName: unsafe extern "system" fn(this: *mut core::ffi::c_void, value: *mut *mut core::ffi::c_void) -> HRESULT,
//     pub GetTrustLevel: unsafe extern "system" fn(this: *mut core::ffi::c_void, value: *mut i32) -> HRESULT,
// }

