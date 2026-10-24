// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnCloseEndpoint(endpoint : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnCloseGuestNetworkService(guestnetworkservice : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnCloseLoadBalancer(loadbalancer : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnCloseNamespace(namespace : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnCloseNetwork(network : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnCreateEndpoint(network : *const core::ffi::c_void, id : *const windows_sys::core::GUID, settings : windows_sys::core::PCWSTR, endpoint : *mut *mut core::ffi::c_void, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnCreateGuestNetworkService(id : *const windows_sys::core::GUID, settings : windows_sys::core::PCWSTR, guestnetworkservice : *mut *mut core::ffi::c_void, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnCreateLoadBalancer(id : *const windows_sys::core::GUID, settings : windows_sys::core::PCWSTR, loadbalancer : *mut *mut core::ffi::c_void, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnCreateNamespace(id : *const windows_sys::core::GUID, settings : windows_sys::core::PCWSTR, namespace : *mut *mut core::ffi::c_void, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnCreateNetwork(id : *const windows_sys::core::GUID, settings : windows_sys::core::PCWSTR, network : *mut *mut core::ffi::c_void, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnDeleteEndpoint(id : *const windows_sys::core::GUID, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnDeleteGuestNetworkService(id : *const windows_sys::core::GUID, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnDeleteLoadBalancer(id : *const windows_sys::core::GUID, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnDeleteNamespace(id : *const windows_sys::core::GUID, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnDeleteNetwork(id : *const windows_sys::core::GUID, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnEnumerateEndpoints(query : windows_sys::core::PCWSTR, endpoints : *mut windows_sys::core::PWSTR, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnEnumerateGuestNetworkPortReservations(returncount : *mut u32, portentries : *mut *mut HCN_PORT_RANGE_ENTRY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnEnumerateLoadBalancers(query : windows_sys::core::PCWSTR, loadbalancer : *mut windows_sys::core::PWSTR, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnEnumerateNamespaces(query : windows_sys::core::PCWSTR, namespaces : *mut windows_sys::core::PWSTR, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnEnumerateNetworks(query : windows_sys::core::PCWSTR, networks : *mut windows_sys::core::PWSTR, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnFreeGuestNetworkPortReservations(portentries : *mut HCN_PORT_RANGE_ENTRY));

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnModifyEndpoint(endpoint : *const core::ffi::c_void, settings : windows_sys::core::PCWSTR, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnModifyGuestNetworkService(guestnetworkservice : *const core::ffi::c_void, settings : windows_sys::core::PCWSTR, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnModifyLoadBalancer(loadbalancer : *const core::ffi::c_void, settings : windows_sys::core::PCWSTR, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnModifyNamespace(namespace : *const core::ffi::c_void, settings : windows_sys::core::PCWSTR, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnModifyNetwork(network : *const core::ffi::c_void, settings : windows_sys::core::PCWSTR, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnOpenEndpoint(id : *const windows_sys::core::GUID, endpoint : *mut *mut core::ffi::c_void, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnOpenLoadBalancer(id : *const windows_sys::core::GUID, loadbalancer : *mut *mut core::ffi::c_void, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnOpenNamespace(id : *const windows_sys::core::GUID, namespace : *mut *mut core::ffi::c_void, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnOpenNetwork(id : *const windows_sys::core::GUID, network : *mut *mut core::ffi::c_void, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnQueryEndpointAddresses(endpoint : *const core::ffi::c_void, query : windows_sys::core::PCWSTR, addresses : *mut windows_sys::core::PWSTR, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnQueryEndpointProperties(endpoint : *const core::ffi::c_void, query : windows_sys::core::PCWSTR, properties : *mut windows_sys::core::PWSTR, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnQueryEndpointStats(endpoint : *const core::ffi::c_void, query : windows_sys::core::PCWSTR, stats : *mut windows_sys::core::PWSTR, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnQueryLoadBalancerProperties(loadbalancer : *const core::ffi::c_void, query : windows_sys::core::PCWSTR, properties : *mut windows_sys::core::PWSTR, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnQueryNamespaceProperties(namespace : *const core::ffi::c_void, query : windows_sys::core::PCWSTR, properties : *mut windows_sys::core::PWSTR, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnQueryNetworkProperties(network : *const core::ffi::c_void, query : windows_sys::core::PCWSTR, properties : *mut windows_sys::core::PWSTR, errorrecord : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnRegisterGuestNetworkServiceCallback(guestnetworkservice : *const core::ffi::c_void, callback : HCN_NOTIFICATION_CALLBACK, context : *const core::ffi::c_void, callbackhandle : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnRegisterServiceCallback(callback : HCN_NOTIFICATION_CALLBACK, context : *const core::ffi::c_void, callbackhandle : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle : super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnReserveGuestNetworkServicePort(guestnetworkservice : *const core::ffi::c_void, protocol : HCN_PORT_PROTOCOL, access : HCN_PORT_ACCESS, port : u16, portreservationhandle : *mut super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnReserveGuestNetworkServicePortRange(guestnetworkservice : *const core::ffi::c_void, portcount : u16, portrangereservation : *mut HCN_PORT_RANGE_RESERVATION, portreservationhandle : *mut super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnUnregisterGuestNetworkServiceCallback(callbackhandle : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("computenetwork.dll" "system" fn HcnUnregisterServiceCallback(callbackhandle : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

public typealias `HCN_NOTIFICATIONS` = Int;
// UNSUPPORTED Rust 45:1: generic scalar type unsupported
// pub type HCN_NOTIFICATION_CALLBACK = Option<unsafe extern "system" fn(notificationtype: u32, context: *const core::ffi::c_void, notificationstatus: windows_sys::core::HRESULT, notificationdata: windows_sys::core::PCWSTR)>;

public typealias `HCN_PORT_ACCESS` = Int;
public const val `HCN_PORT_ACCESS_EXCLUSIVE`: `HCN_PORT_ACCESS` = 1;
public const val `HCN_PORT_ACCESS_SHARED`: `HCN_PORT_ACCESS` = 2;
public typealias `HCN_PORT_PROTOCOL` = Int;
public const val `HCN_PORT_PROTOCOL_BOTH`: `HCN_PORT_PROTOCOL` = 3;
public const val `HCN_PORT_PROTOCOL_TCP`: `HCN_PORT_PROTOCOL` = 1;
public const val `HCN_PORT_PROTOCOL_UDP`: `HCN_PORT_PROTOCOL` = 2;
// UNSUPPORTED Rust 53:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HCN_PORT_RANGE_ENTRY {
//     pub OwningPartitionId: windows_sys::core::GUID,
//     pub TargetPartitionId: windows_sys::core::GUID,
//     pub Protocol: HCN_PORT_PROTOCOL,
//     pub Priority: u64,
//     pub ReservationType: u32,
//     pub SharingFlags: u32,
//     pub DeliveryMode: u32,
//     pub StartingPort: u16,
//     pub EndingPort: u16,
// }

// UNSUPPORTED Rust 66:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HCN_PORT_RANGE_RESERVATION {
//     pub startingPort: u16,
//     pub endingPort: u16,
// }

public const val `HcnNotificationFlagsReserved`: `HCN_NOTIFICATIONS` = -268435456;
public const val `HcnNotificationGuestNetworkServiceCreate`: `HCN_NOTIFICATIONS` = 7;
public const val `HcnNotificationGuestNetworkServiceDelete`: `HCN_NOTIFICATIONS` = 8;
public const val `HcnNotificationGuestNetworkServiceInterfaceStateChanged`: `HCN_NOTIFICATIONS` = 18;
public const val `HcnNotificationGuestNetworkServiceStateChanged`: `HCN_NOTIFICATIONS` = 17;
public const val `HcnNotificationInvalid`: `HCN_NOTIFICATIONS` = 0;
public const val `HcnNotificationNamespaceCreate`: `HCN_NOTIFICATIONS` = 5;
public const val `HcnNotificationNamespaceDelete`: `HCN_NOTIFICATIONS` = 6;
public const val `HcnNotificationNetworkCreate`: `HCN_NOTIFICATIONS` = 2;
public const val `HcnNotificationNetworkDelete`: `HCN_NOTIFICATIONS` = 4;
public const val `HcnNotificationNetworkEndpointAttached`: `HCN_NOTIFICATIONS` = 9;
public const val `HcnNotificationNetworkEndpointDetached`: `HCN_NOTIFICATIONS` = 16;
public const val `HcnNotificationNetworkPreCreate`: `HCN_NOTIFICATIONS` = 1;
public const val `HcnNotificationNetworkPreDelete`: `HCN_NOTIFICATIONS` = 3;
public const val `HcnNotificationServiceDisconnect`: `HCN_NOTIFICATIONS` = 16777216;
