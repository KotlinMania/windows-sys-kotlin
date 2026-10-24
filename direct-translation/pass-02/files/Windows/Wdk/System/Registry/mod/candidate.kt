// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtCommitRegistryTransaction(transactionhandle : super::super::super::Win32::Foundation:: HANDLE, flags : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn NtCreateKey(keyhandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES, titleindex : u32, class : *const super::super::super::Win32::Foundation:: UNICODE_STRING, createoptions : u32, disposition : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn NtCreateKeyTransacted(keyhandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES, titleindex : u32, class : *const super::super::super::Win32::Foundation:: UNICODE_STRING, createoptions : u32, transactionhandle : super::super::super::Win32::Foundation:: HANDLE, disposition : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn NtCreateRegistryTransaction(transactionhandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES, createoptions : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtDeleteKey(keyhandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtDeleteValueKey(keyhandle : super::super::super::Win32::Foundation:: HANDLE, valuename : *const super::super::super::Win32::Foundation:: UNICODE_STRING) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtEnumerateKey(keyhandle : super::super::super::Win32::Foundation:: HANDLE, index : u32, keyinformationclass : KEY_INFORMATION_CLASS, keyinformation : *mut core::ffi::c_void, length : u32, resultlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtEnumerateValueKey(keyhandle : super::super::super::Win32::Foundation:: HANDLE, index : u32, keyvalueinformationclass : KEY_VALUE_INFORMATION_CLASS, keyvalueinformation : *mut core::ffi::c_void, length : u32, resultlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtFlushKey(keyhandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security", feature = "Win32_System_IO"))]
// windows_link::link!("ntdll.dll" "system" fn NtNotifyChangeMultipleKeys(masterkeyhandle : super::super::super::Win32::Foundation:: HANDLE, count : u32, subordinateobjects : *const super::super::Foundation:: OBJECT_ATTRIBUTES, event : super::super::super::Win32::Foundation:: HANDLE, apcroutine : super::super::super::Win32::System::IO:: PIO_APC_ROUTINE, apccontext : *const core::ffi::c_void, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, completionfilter : u32, watchtree : bool, buffer : *mut core::ffi::c_void, buffersize : u32, asynchronous : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn NtOpenKey(keyhandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn NtOpenKeyEx(keyhandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES, openoptions : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn NtOpenKeyTransacted(keyhandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES, transactionhandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn NtOpenKeyTransactedEx(keyhandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES, openoptions : u32, transactionhandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn NtOpenRegistryTransaction(transactionhandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtQueryKey(keyhandle : super::super::super::Win32::Foundation:: HANDLE, keyinformationclass : KEY_INFORMATION_CLASS, keyinformation : *mut core::ffi::c_void, length : u32, resultlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtQueryMultipleValueKey(keyhandle : super::super::super::Win32::Foundation:: HANDLE, valueentries : *mut KEY_VALUE_ENTRY, entrycount : u32, valuebuffer : *mut core::ffi::c_void, bufferlength : *mut u32, requiredbufferlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtQueryValueKey(keyhandle : super::super::super::Win32::Foundation:: HANDLE, valuename : *const super::super::super::Win32::Foundation:: UNICODE_STRING, keyvalueinformationclass : KEY_VALUE_INFORMATION_CLASS, keyvalueinformation : *mut core::ffi::c_void, length : u32, resultlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtRenameKey(keyhandle : super::super::super::Win32::Foundation:: HANDLE, newname : *const super::super::super::Win32::Foundation:: UNICODE_STRING) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtRestoreKey(keyhandle : super::super::super::Win32::Foundation:: HANDLE, filehandle : super::super::super::Win32::Foundation:: HANDLE, flags : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtRollbackRegistryTransaction(transactionhandle : super::super::super::Win32::Foundation:: HANDLE, flags : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtSaveKey(keyhandle : super::super::super::Win32::Foundation:: HANDLE, filehandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtSaveKeyEx(keyhandle : super::super::super::Win32::Foundation:: HANDLE, filehandle : super::super::super::Win32::Foundation:: HANDLE, format : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtSetInformationKey(keyhandle : super::super::super::Win32::Foundation:: HANDLE, keysetinformationclass : KEY_SET_INFORMATION_CLASS, keysetinformation : *const core::ffi::c_void, keysetinformationlength : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn NtSetValueKey(keyhandle : super::super::super::Win32::Foundation:: HANDLE, valuename : *const super::super::super::Win32::Foundation:: UNICODE_STRING, titleindex : u32, r#type : u32, data : *const core::ffi::c_void, datasize : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwCommitRegistryTransaction(transactionhandle : super::super::super::Win32::Foundation:: HANDLE, flags : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn ZwCreateKey(keyhandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES, titleindex : u32, class : *const super::super::super::Win32::Foundation:: UNICODE_STRING, createoptions : u32, disposition : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn ZwCreateKeyTransacted(keyhandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES, titleindex : u32, class : *const super::super::super::Win32::Foundation:: UNICODE_STRING, createoptions : u32, transactionhandle : super::super::super::Win32::Foundation:: HANDLE, disposition : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn ZwCreateRegistryTransaction(transactionhandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES, createoptions : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwDeleteKey(keyhandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwDeleteValueKey(keyhandle : super::super::super::Win32::Foundation:: HANDLE, valuename : *const super::super::super::Win32::Foundation:: UNICODE_STRING) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwEnumerateKey(keyhandle : super::super::super::Win32::Foundation:: HANDLE, index : u32, keyinformationclass : KEY_INFORMATION_CLASS, keyinformation : *mut core::ffi::c_void, length : u32, resultlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwEnumerateValueKey(keyhandle : super::super::super::Win32::Foundation:: HANDLE, index : u32, keyvalueinformationclass : KEY_VALUE_INFORMATION_CLASS, keyvalueinformation : *mut core::ffi::c_void, length : u32, resultlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwFlushKey(keyhandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security", feature = "Win32_System_IO"))]
// windows_link::link!("ntdll.dll" "system" fn ZwNotifyChangeMultipleKeys(masterkeyhandle : super::super::super::Win32::Foundation:: HANDLE, count : u32, subordinateobjects : *const super::super::Foundation:: OBJECT_ATTRIBUTES, event : super::super::super::Win32::Foundation:: HANDLE, apcroutine : super::super::super::Win32::System::IO:: PIO_APC_ROUTINE, apccontext : *const core::ffi::c_void, iostatusblock : *mut super::super::super::Win32::System::IO:: IO_STATUS_BLOCK, completionfilter : u32, watchtree : bool, buffer : *mut core::ffi::c_void, buffersize : u32, asynchronous : bool) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn ZwOpenKey(keyhandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn ZwOpenKeyEx(keyhandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES, openoptions : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn ZwOpenKeyTransacted(keyhandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES, transactionhandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn ZwOpenKeyTransactedEx(keyhandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES, openoptions : u32, transactionhandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
// windows_link::link!("ntdll.dll" "system" fn ZwOpenRegistryTransaction(transactionhandle : *mut super::super::super::Win32::Foundation:: HANDLE, desiredaccess : u32, objectattributes : *const super::super::Foundation:: OBJECT_ATTRIBUTES) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwQueryKey(keyhandle : super::super::super::Win32::Foundation:: HANDLE, keyinformationclass : KEY_INFORMATION_CLASS, keyinformation : *mut core::ffi::c_void, length : u32, resultlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwQueryMultipleValueKey(keyhandle : super::super::super::Win32::Foundation:: HANDLE, valueentries : *mut KEY_VALUE_ENTRY, entrycount : u32, valuebuffer : *mut core::ffi::c_void, bufferlength : *mut u32, requiredbufferlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwQueryValueKey(keyhandle : super::super::super::Win32::Foundation:: HANDLE, valuename : *const super::super::super::Win32::Foundation:: UNICODE_STRING, keyvalueinformationclass : KEY_VALUE_INFORMATION_CLASS, keyvalueinformation : *mut core::ffi::c_void, length : u32, resultlength : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwRenameKey(keyhandle : super::super::super::Win32::Foundation:: HANDLE, newname : *const super::super::super::Win32::Foundation:: UNICODE_STRING) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwRestoreKey(keyhandle : super::super::super::Win32::Foundation:: HANDLE, filehandle : super::super::super::Win32::Foundation:: HANDLE, flags : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwRollbackRegistryTransaction(transactionhandle : super::super::super::Win32::Foundation:: HANDLE, flags : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwSaveKey(keyhandle : super::super::super::Win32::Foundation:: HANDLE, filehandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwSaveKeyEx(keyhandle : super::super::super::Win32::Foundation:: HANDLE, filehandle : super::super::super::Win32::Foundation:: HANDLE, format : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwSetInformationKey(keyhandle : super::super::super::Win32::Foundation:: HANDLE, keysetinformationclass : KEY_SET_INFORMATION_CLASS, keysetinformation : *const core::ffi::c_void, keysetinformationlength : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn ZwSetValueKey(keyhandle : super::super::super::Win32::Foundation:: HANDLE, valuename : *const super::super::super::Win32::Foundation:: UNICODE_STRING, titleindex : u32, r#type : u32, data : *const core::ffi::c_void, datasize : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

public typealias `KEY_INFORMATION_CLASS` = Int;
public typealias `KEY_SET_INFORMATION_CLASS` = Int;
// UNSUPPORTED Rust 71:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KEY_VALUE_ENTRY {
//     pub ValueName: *mut super::super::super::Win32::Foundation::UNICODE_STRING,
//     pub DataLength: u32,
//     pub DataOffset: u32,
//     pub Type: u32,
// }

// UNSUPPORTED Rust 79:1: declaration Impl has no candidate rule
// impl Default for KEY_VALUE_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `KEY_VALUE_INFORMATION_CLASS` = Int;
public const val `KeyBasicInformation`: `KEY_INFORMATION_CLASS` = 0;
public const val `KeyCachedInformation`: `KEY_INFORMATION_CLASS` = 4;
public const val `KeyControlFlagsInformation`: `KEY_SET_INFORMATION_CLASS` = 2;
public const val `KeyFlagsInformation`: `KEY_INFORMATION_CLASS` = 5;
public const val `KeyFullInformation`: `KEY_INFORMATION_CLASS` = 2;
public const val `KeyHandleTagsInformation`: `KEY_INFORMATION_CLASS` = 7;
public const val `KeyLayerInformation`: `KEY_INFORMATION_CLASS` = 9;
public const val `KeyNameInformation`: `KEY_INFORMATION_CLASS` = 3;
public const val `KeyNodeInformation`: `KEY_INFORMATION_CLASS` = 1;
public const val `KeySetDebugInformation`: `KEY_SET_INFORMATION_CLASS` = 4;
public const val `KeySetHandleTagsInformation`: `KEY_SET_INFORMATION_CLASS` = 5;
public const val `KeySetLayerInformation`: `KEY_SET_INFORMATION_CLASS` = 6;
public const val `KeySetVirtualizationInformation`: `KEY_SET_INFORMATION_CLASS` = 3;
public const val `KeyTrustInformation`: `KEY_INFORMATION_CLASS` = 8;
public const val `KeyValueBasicInformation`: `KEY_VALUE_INFORMATION_CLASS` = 0;
public const val `KeyValueFullInformation`: `KEY_VALUE_INFORMATION_CLASS` = 1;
public const val `KeyValueFullInformationAlign64`: `KEY_VALUE_INFORMATION_CLASS` = 3;
public const val `KeyValueLayerInformation`: `KEY_VALUE_INFORMATION_CLASS` = 5;
public const val `KeyValuePartialInformation`: `KEY_VALUE_INFORMATION_CLASS` = 2;
public const val `KeyValuePartialInformationAlign64`: `KEY_VALUE_INFORMATION_CLASS` = 4;
public const val `KeyVirtualizationInformation`: `KEY_INFORMATION_CLASS` = 6;
public const val `KeyWow64FlagsInformation`: `KEY_SET_INFORMATION_CLASS` = 1;
public const val `KeyWriteTimeInformation`: `KEY_SET_INFORMATION_CLASS` = 0;
public const val `MaxKeyInfoClass`: `KEY_INFORMATION_CLASS` = 10;
public const val `MaxKeySetInfoClass`: `KEY_SET_INFORMATION_CLASS` = 7;
public const val `MaxKeyValueInfoClass`: `KEY_VALUE_INFORMATION_CLASS` = 6;
// UNSUPPORTED Rust 111:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REG_ENUMERATE_KEY_INFORMATION {
//     pub Object: *mut core::ffi::c_void,
//     pub Index: u32,
//     pub KeyInformationClass: KEY_INFORMATION_CLASS,
//     pub KeyInformation: *mut core::ffi::c_void,
//     pub Length: u32,
//     pub ResultLength: *mut u32,
//     pub CallContext: *mut core::ffi::c_void,
//     pub ObjectContext: *mut core::ffi::c_void,
//     pub Reserved: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 124:1: declaration Impl has no candidate rule
// impl Default for REG_ENUMERATE_KEY_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 129:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REG_ENUMERATE_VALUE_KEY_INFORMATION {
//     pub Object: *mut core::ffi::c_void,
//     pub Index: u32,
//     pub KeyValueInformationClass: KEY_VALUE_INFORMATION_CLASS,
//     pub KeyValueInformation: *mut core::ffi::c_void,
//     pub Length: u32,
//     pub ResultLength: *mut u32,
//     pub CallContext: *mut core::ffi::c_void,
//     pub ObjectContext: *mut core::ffi::c_void,
//     pub Reserved: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 142:1: declaration Impl has no candidate rule
// impl Default for REG_ENUMERATE_VALUE_KEY_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 147:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REG_QUERY_KEY_INFORMATION {
//     pub Object: *mut core::ffi::c_void,
//     pub KeyInformationClass: KEY_INFORMATION_CLASS,
//     pub KeyInformation: *mut core::ffi::c_void,
//     pub Length: u32,
//     pub ResultLength: *mut u32,
//     pub CallContext: *mut core::ffi::c_void,
//     pub ObjectContext: *mut core::ffi::c_void,
//     pub Reserved: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 159:1: declaration Impl has no candidate rule
// impl Default for REG_QUERY_KEY_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 164:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REG_QUERY_MULTIPLE_VALUE_KEY_INFORMATION {
//     pub Object: *mut core::ffi::c_void,
//     pub ValueEntries: *mut KEY_VALUE_ENTRY,
//     pub EntryCount: u32,
//     pub ValueBuffer: *mut core::ffi::c_void,
//     pub BufferLength: *mut u32,
//     pub RequiredBufferLength: *mut u32,
//     pub CallContext: *mut core::ffi::c_void,
//     pub ObjectContext: *mut core::ffi::c_void,
//     pub Reserved: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 177:1: declaration Impl has no candidate rule
// impl Default for REG_QUERY_MULTIPLE_VALUE_KEY_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 182:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REG_QUERY_VALUE_KEY_INFORMATION {
//     pub Object: *mut core::ffi::c_void,
//     pub ValueName: *mut super::super::super::Win32::Foundation::UNICODE_STRING,
//     pub KeyValueInformationClass: KEY_VALUE_INFORMATION_CLASS,
//     pub KeyValueInformation: *mut core::ffi::c_void,
//     pub Length: u32,
//     pub ResultLength: *mut u32,
//     pub CallContext: *mut core::ffi::c_void,
//     pub ObjectContext: *mut core::ffi::c_void,
//     pub Reserved: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 195:1: declaration Impl has no candidate rule
// impl Default for REG_QUERY_VALUE_KEY_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 200:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REG_SET_INFORMATION_KEY_INFORMATION {
//     pub Object: *mut core::ffi::c_void,
//     pub KeySetInformationClass: KEY_SET_INFORMATION_CLASS,
//     pub KeySetInformation: *mut core::ffi::c_void,
//     pub KeySetInformationLength: u32,
//     pub CallContext: *mut core::ffi::c_void,
//     pub ObjectContext: *mut core::ffi::c_void,
//     pub Reserved: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 211:1: declaration Impl has no candidate rule
// impl Default for REG_SET_INFORMATION_KEY_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

