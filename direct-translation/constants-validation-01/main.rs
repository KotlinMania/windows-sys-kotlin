extern crate self as windows_sys;
#[path="/Volumes/stuff/Projects/kotlinmania/windows-sys-kotlin/tmp/windows-sys/src/core/mod.rs"] pub mod core;
mod probe;
include!("values.rs");
mod Windows { pub mod Win32 { pub mod Foundation { include!("DEVPROPKEY.rs"); } }
pub mod Wdk { pub mod Devices { pub mod Bluetooth { include!("/Volumes/stuff/Projects/kotlinmania/windows-sys-kotlin/tmp/windows-sys/src/Windows/Wdk/Devices/Bluetooth/mod.rs"); } } } }
fn guid(v:&core::GUID)->String { format!("{:08x}|{:04x}|{:04x}|{}",v.data1,v.data2,v.data3,v.data4.iter().map(|x|format!("{:02x}",x)).collect::<String>()) }
fn main() {
println!("v0|{:032x}",V0.value);
println!("v1|{:032x}",V1.value);
println!("v2|{:032x}",V2.value);
println!("v3|{:032x}",V3.value);
println!("v4|{:032x}",V4.value);
println!("v5|{:032x}",V5.value);
println!("v6|{:032x}",V6.value);
println!("key|{}|{:032x}",KEY.tag,KEY.code.value);
println!("DEVPKEY_Bluetooth_ClassOfDevice|{}|{}",guid(&Windows::Wdk::Devices::Bluetooth::DEVPKEY_Bluetooth_ClassOfDevice.fmtid),Windows::Wdk::Devices::Bluetooth::DEVPKEY_Bluetooth_ClassOfDevice.pid);
println!("DEVPKEY_Bluetooth_ClassOfDevice_Deprecated|{}|{}",guid(&Windows::Wdk::Devices::Bluetooth::DEVPKEY_Bluetooth_ClassOfDevice_Deprecated.fmtid),Windows::Wdk::Devices::Bluetooth::DEVPKEY_Bluetooth_ClassOfDevice_Deprecated.pid);
println!("DEVPKEY_Bluetooth_DeviceAddress|{}|{}",guid(&Windows::Wdk::Devices::Bluetooth::DEVPKEY_Bluetooth_DeviceAddress.fmtid),Windows::Wdk::Devices::Bluetooth::DEVPKEY_Bluetooth_DeviceAddress.pid);
println!("DEVPKEY_Bluetooth_DeviceFlags|{}|{}",guid(&Windows::Wdk::Devices::Bluetooth::DEVPKEY_Bluetooth_DeviceFlags.fmtid),Windows::Wdk::Devices::Bluetooth::DEVPKEY_Bluetooth_DeviceFlags.pid);
println!("DEVPKEY_Bluetooth_DeviceManufacturer|{}|{}",guid(&Windows::Wdk::Devices::Bluetooth::DEVPKEY_Bluetooth_DeviceManufacturer.fmtid),Windows::Wdk::Devices::Bluetooth::DEVPKEY_Bluetooth_DeviceManufacturer.pid);
println!("DEVPKEY_Bluetooth_DeviceModelNumber|{}|{}",guid(&Windows::Wdk::Devices::Bluetooth::DEVPKEY_Bluetooth_DeviceModelNumber.fmtid),Windows::Wdk::Devices::Bluetooth::DEVPKEY_Bluetooth_DeviceModelNumber.pid);
println!("DEVPKEY_Bluetooth_DevicePID|{}|{}",guid(&Windows::Wdk::Devices::Bluetooth::DEVPKEY_Bluetooth_DevicePID.fmtid),Windows::Wdk::Devices::Bluetooth::DEVPKEY_Bluetooth_DevicePID.pid);
println!("DEVPKEY_Bluetooth_DeviceProductVersion|{}|{}",guid(&Windows::Wdk::Devices::Bluetooth::DEVPKEY_Bluetooth_DeviceProductVersion.fmtid),Windows::Wdk::Devices::Bluetooth::DEVPKEY_Bluetooth_DeviceProductVersion.pid);
println!("DEVPKEY_Bluetooth_DeviceVID|{}|{}",guid(&Windows::Wdk::Devices::Bluetooth::DEVPKEY_Bluetooth_DeviceVID.fmtid),Windows::Wdk::Devices::Bluetooth::DEVPKEY_Bluetooth_DeviceVID.pid);
println!("DEVPKEY_Bluetooth_DeviceVIDSource|{}|{}",guid(&Windows::Wdk::Devices::Bluetooth::DEVPKEY_Bluetooth_DeviceVIDSource.fmtid),Windows::Wdk::Devices::Bluetooth::DEVPKEY_Bluetooth_DeviceVIDSource.pid);
println!("DEVPKEY_Bluetooth_LastConnectedTime|{}|{}",guid(&Windows::Wdk::Devices::Bluetooth::DEVPKEY_Bluetooth_LastConnectedTime.fmtid),Windows::Wdk::Devices::Bluetooth::DEVPKEY_Bluetooth_LastConnectedTime.pid);
println!("DEVPKEY_Bluetooth_LastConnectedTime_Deprecated|{}|{}",guid(&Windows::Wdk::Devices::Bluetooth::DEVPKEY_Bluetooth_LastConnectedTime_Deprecated.fmtid),Windows::Wdk::Devices::Bluetooth::DEVPKEY_Bluetooth_LastConnectedTime_Deprecated.pid);
println!("DEVPKEY_Bluetooth_LastSeenTime|{}|{}",guid(&Windows::Wdk::Devices::Bluetooth::DEVPKEY_Bluetooth_LastSeenTime.fmtid),Windows::Wdk::Devices::Bluetooth::DEVPKEY_Bluetooth_LastSeenTime.pid);
println!("DEVPKEY_Bluetooth_ServiceGUID|{}|{}",guid(&Windows::Wdk::Devices::Bluetooth::DEVPKEY_Bluetooth_ServiceGUID.fmtid),Windows::Wdk::Devices::Bluetooth::DEVPKEY_Bluetooth_ServiceGUID.pid);
println!("GUID_BTHDDI_PROFILE_DRIVER_INTERFACE|{}",guid(&Windows::Wdk::Devices::Bluetooth::GUID_BTHDDI_PROFILE_DRIVER_INTERFACE));
println!("GUID_BTHDDI_SDP_NODE_INTERFACE|{}",guid(&Windows::Wdk::Devices::Bluetooth::GUID_BTHDDI_SDP_NODE_INTERFACE));
println!("GUID_BTHDDI_SDP_PARSE_INTERFACE|{}",guid(&Windows::Wdk::Devices::Bluetooth::GUID_BTHDDI_SDP_PARSE_INTERFACE));
println!("GUID_BTH_DEVICE_INTERFACE|{}",guid(&Windows::Wdk::Devices::Bluetooth::GUID_BTH_DEVICE_INTERFACE));
}
