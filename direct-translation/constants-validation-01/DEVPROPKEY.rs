#[repr(C)]
#[derive(Clone, Copy, Default)]
pub struct DEVPROPKEY {
    pub fmtid: windows_sys::core::GUID,
    pub pid: u32,
}