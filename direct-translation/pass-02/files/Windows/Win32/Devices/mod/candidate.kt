// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Devices_AllJoyn")]
// pub mod AllJoyn;

// UNSUPPORTED Rust 3:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Devices_Beep")]
// pub mod Beep;

// UNSUPPORTED Rust 5:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Devices_BiometricFramework")]
// pub mod BiometricFramework;

// UNSUPPORTED Rust 7:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Devices_Bluetooth")]
// pub mod Bluetooth;

// UNSUPPORTED Rust 9:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Devices_Cdrom")]
// pub mod Cdrom;

// UNSUPPORTED Rust 11:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Devices_Communication")]
// pub mod Communication;

// UNSUPPORTED Rust 13:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Devices_DeviceAndDriverInstallation")]
// pub mod DeviceAndDriverInstallation;

// UNSUPPORTED Rust 15:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Devices_DeviceQuery")]
// pub mod DeviceQuery;

// UNSUPPORTED Rust 17:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Devices_Display")]
// pub mod Display;

// UNSUPPORTED Rust 19:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Devices_Dvd")]
// pub mod Dvd;

// UNSUPPORTED Rust 21:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Devices_Enumeration")]
// pub mod Enumeration;

// UNSUPPORTED Rust 23:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Devices_Fax")]
// pub mod Fax;

// UNSUPPORTED Rust 25:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Devices_HumanInterfaceDevice")]
// pub mod HumanInterfaceDevice;

// UNSUPPORTED Rust 27:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Devices_Nfc")]
// pub mod Nfc;

// UNSUPPORTED Rust 29:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Devices_Nfp")]
// pub mod Nfp;

// UNSUPPORTED Rust 31:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Devices_PortableDevices")]
// pub mod PortableDevices;

// UNSUPPORTED Rust 33:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// pub mod Properties;

// UNSUPPORTED Rust 35:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Devices_Pwm")]
// pub mod Pwm;

// UNSUPPORTED Rust 37:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Devices_Sensors")]
// pub mod Sensors;

// UNSUPPORTED Rust 39:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Devices_SerialCommunication")]
// pub mod SerialCommunication;

// UNSUPPORTED Rust 41:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Devices_Tapi")]
// pub mod Tapi;

// UNSUPPORTED Rust 43:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Devices_Usb")]
// pub mod Usb;

// UNSUPPORTED Rust 45:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Devices_WebServicesOnDevices")]
// pub mod WebServicesOnDevices;

// UNSUPPORTED Rust 47:1: non-scalar type Ptr unsupported
// pub const BUS1394_LOCAL_HOST_INSTANCE_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("LOCAL HOST EUI64");

// UNSUPPORTED Rust 48:1: non-scalar type Ptr unsupported
// pub const BUS1394_VIRTUAL_DEVICE_LIST_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("Virtual Device List");

public const val `IEEE1394API_ACCESS_EXCLUSIVE`: UInt = 64u;
public const val `IEEE1394API_ACCESS_SHARED_READ`: UInt = 16u;
public const val `IEEE1394API_ACCESS_SHARED_WRITE`: UInt = 32u;
public const val `IEEE1394API_BUS_RESET_LOCAL_NODE_INITIATED`: UInt = 4u;
public const val `IEEE1394API_BUS_RESET_LOCAL_NODE_IS_IRM`: UInt = 2u;
public const val `IEEE1394API_BUS_RESET_LOCAL_NODE_IS_ROOT`: UInt = 1u;
public const val `IEEE1394API_DEVICE_OWNERSHIP_LOCAL_NODE`: UInt = 1u;
public const val `IEEE1394API_DEVICE_OWNERSHIP_REMOTE_NODE`: UInt = 4u;
public const val `IEEE1394API_NOTIFICATION_BUS_RESET`: UInt = 2u;
public const val `IEEE1394API_NOTIFICATION_DEVICE_ACCESS`: UInt = 1u;
public const val `IEEE1394API_REMOTE_ACCESS_TRANSFER_REQUEST`: UInt = 1u;
public const val `IEEE1394API_RESOURCE_OWNERSHIP_LOCAL_NODE`: UInt = 2u;
public const val `IEEE1394API_RESOURCE_OWNERSHIP_REMOTE_NODE`: UInt = 8u;
public const val `IEEE1394_API_ADD_VIRTUAL_DEVICE`: UInt = 1u;
public const val `IEEE1394_API_DEVICE_ACCESS_TRANSFER`: UInt = 3u;
public const val `IEEE1394_API_REMOVE_VIRTUAL_DEVICE`: UInt = 2u;
// UNSUPPORTED Rust 65:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IEEE1394_API_REQUEST {
//     pub RequestNumber: u32,
//     pub Flags: u32,
//     pub u: IEEE1394_API_REQUEST_0,
// }

// UNSUPPORTED Rust 72:1: declaration Impl has no candidate rule
// impl Default for IEEE1394_API_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 77:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IEEE1394_API_REQUEST_0 {
//     pub AddVirtualDevice: IEEE1394_VDEV_PNP_REQUEST,
//     pub RemoveVirtualDevice: IEEE1394_VDEV_PNP_REQUEST,
// }

// UNSUPPORTED Rust 83:1: declaration Impl has no candidate rule
// impl Default for IEEE1394_API_REQUEST_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IEEE1394_API_SET_LOCAL_NODE_PROPERTIES`: UInt = 4u;
public const val `IEEE1394_REQUEST_FLAG_PERSISTENT`: UInt = 2u;
public const val `IEEE1394_REQUEST_FLAG_UNICODE`: UInt = 1u;
public const val `IEEE1394_REQUEST_FLAG_USE_LOCAL_HOST_EUI`: UInt = 4u;
// UNSUPPORTED Rust 92:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IEEE1394_VDEV_PNP_REQUEST {
//     pub fulFlags: u32,
//     pub Reserved: u32,
//     pub InstanceId: u64,
//     pub DeviceId: u8,
// }

public const val `IOCTL_IEEE1394_API_REQUEST`: UInt = 2229248u;
