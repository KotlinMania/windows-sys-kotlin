// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn BackupEventLogA(heventlog : super::super::Foundation:: HANDLE, lpbackupfilename : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn BackupEventLogW(heventlog : super::super::Foundation:: HANDLE, lpbackupfilename : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ClearEventLogA(heventlog : super::super::Foundation:: HANDLE, lpbackupfilename : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ClearEventLogW(heventlog : super::super::Foundation:: HANDLE, lpbackupfilename : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CloseEventLog(heventlog : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn DeregisterEventSource(heventlog : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("wevtapi.dll" "system" fn EvtArchiveExportedLog(session : EVT_HANDLE, logfilepath : windows_sys::core::PCWSTR, locale : u32, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("wevtapi.dll" "system" fn EvtCancel(object : EVT_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("wevtapi.dll" "system" fn EvtClearLog(session : EVT_HANDLE, channelpath : windows_sys::core::PCWSTR, targetfilepath : windows_sys::core::PCWSTR, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("wevtapi.dll" "system" fn EvtClose(object : EVT_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("wevtapi.dll" "system" fn EvtCreateBookmark(bookmarkxml : windows_sys::core::PCWSTR) -> EVT_HANDLE);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("wevtapi.dll" "system" fn EvtCreateRenderContext(valuepathscount : u32, valuepaths : *const windows_sys::core::PCWSTR, flags : u32) -> EVT_HANDLE);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("wevtapi.dll" "system" fn EvtExportLog(session : EVT_HANDLE, path : windows_sys::core::PCWSTR, query : windows_sys::core::PCWSTR, targetfilepath : windows_sys::core::PCWSTR, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("wevtapi.dll" "system" fn EvtFormatMessage(publishermetadata : EVT_HANDLE, event : EVT_HANDLE, messageid : u32, valuecount : u32, values : *const EVT_VARIANT, flags : u32, buffersize : u32, buffer : windows_sys::core::PWSTR, bufferused : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("wevtapi.dll" "system" fn EvtGetChannelConfigProperty(channelconfig : EVT_HANDLE, propertyid : EVT_CHANNEL_CONFIG_PROPERTY_ID, flags : u32, propertyvaluebuffersize : u32, propertyvaluebuffer : *mut EVT_VARIANT, propertyvaluebufferused : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("wevtapi.dll" "system" fn EvtGetEventInfo(event : EVT_HANDLE, propertyid : EVT_EVENT_PROPERTY_ID, propertyvaluebuffersize : u32, propertyvaluebuffer : *mut EVT_VARIANT, propertyvaluebufferused : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("wevtapi.dll" "system" fn EvtGetEventMetadataProperty(eventmetadata : EVT_HANDLE, propertyid : EVT_EVENT_METADATA_PROPERTY_ID, flags : u32, eventmetadatapropertybuffersize : u32, eventmetadatapropertybuffer : *mut EVT_VARIANT, eventmetadatapropertybufferused : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("wevtapi.dll" "system" fn EvtGetExtendedStatus(buffersize : u32, buffer : windows_sys::core::PWSTR, bufferused : *mut u32) -> u32);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("wevtapi.dll" "system" fn EvtGetLogInfo(log : EVT_HANDLE, propertyid : EVT_LOG_PROPERTY_ID, propertyvaluebuffersize : u32, propertyvaluebuffer : *mut EVT_VARIANT, propertyvaluebufferused : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("wevtapi.dll" "system" fn EvtGetObjectArrayProperty(objectarray : isize, propertyid : u32, arrayindex : u32, flags : u32, propertyvaluebuffersize : u32, propertyvaluebuffer : *mut EVT_VARIANT, propertyvaluebufferused : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("wevtapi.dll" "system" fn EvtGetObjectArraySize(objectarray : isize, objectarraysize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("wevtapi.dll" "system" fn EvtGetPublisherMetadataProperty(publishermetadata : EVT_HANDLE, propertyid : EVT_PUBLISHER_METADATA_PROPERTY_ID, flags : u32, publishermetadatapropertybuffersize : u32, publishermetadatapropertybuffer : *mut EVT_VARIANT, publishermetadatapropertybufferused : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("wevtapi.dll" "system" fn EvtGetQueryInfo(queryorsubscription : EVT_HANDLE, propertyid : EVT_QUERY_PROPERTY_ID, propertyvaluebuffersize : u32, propertyvaluebuffer : *mut EVT_VARIANT, propertyvaluebufferused : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("wevtapi.dll" "system" fn EvtNext(resultset : EVT_HANDLE, eventssize : u32, events : *mut isize, timeout : u32, flags : u32, returned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("wevtapi.dll" "system" fn EvtNextChannelPath(channelenum : EVT_HANDLE, channelpathbuffersize : u32, channelpathbuffer : windows_sys::core::PWSTR, channelpathbufferused : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("wevtapi.dll" "system" fn EvtNextEventMetadata(eventmetadataenum : EVT_HANDLE, flags : u32) -> EVT_HANDLE);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("wevtapi.dll" "system" fn EvtNextPublisherId(publisherenum : EVT_HANDLE, publisheridbuffersize : u32, publisheridbuffer : windows_sys::core::PWSTR, publisheridbufferused : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("wevtapi.dll" "system" fn EvtOpenChannelConfig(session : EVT_HANDLE, channelpath : windows_sys::core::PCWSTR, flags : u32) -> EVT_HANDLE);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("wevtapi.dll" "system" fn EvtOpenChannelEnum(session : EVT_HANDLE, flags : u32) -> EVT_HANDLE);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("wevtapi.dll" "system" fn EvtOpenEventMetadataEnum(publishermetadata : EVT_HANDLE, flags : u32) -> EVT_HANDLE);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("wevtapi.dll" "system" fn EvtOpenLog(session : EVT_HANDLE, path : windows_sys::core::PCWSTR, flags : u32) -> EVT_HANDLE);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("wevtapi.dll" "system" fn EvtOpenPublisherEnum(session : EVT_HANDLE, flags : u32) -> EVT_HANDLE);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("wevtapi.dll" "system" fn EvtOpenPublisherMetadata(session : EVT_HANDLE, publisherid : windows_sys::core::PCWSTR, logfilepath : windows_sys::core::PCWSTR, locale : u32, flags : u32) -> EVT_HANDLE);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("wevtapi.dll" "system" fn EvtOpenSession(loginclass : EVT_LOGIN_CLASS, login : *const core::ffi::c_void, timeout : u32, flags : u32) -> EVT_HANDLE);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("wevtapi.dll" "system" fn EvtQuery(session : EVT_HANDLE, path : windows_sys::core::PCWSTR, query : windows_sys::core::PCWSTR, flags : u32) -> EVT_HANDLE);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("wevtapi.dll" "system" fn EvtRender(context : EVT_HANDLE, fragment : EVT_HANDLE, flags : u32, buffersize : u32, buffer : *mut core::ffi::c_void, bufferused : *mut u32, propertycount : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("wevtapi.dll" "system" fn EvtSaveChannelConfig(channelconfig : EVT_HANDLE, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("wevtapi.dll" "system" fn EvtSeek(resultset : EVT_HANDLE, position : i64, bookmark : EVT_HANDLE, timeout : u32, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("wevtapi.dll" "system" fn EvtSetChannelConfigProperty(channelconfig : EVT_HANDLE, propertyid : EVT_CHANNEL_CONFIG_PROPERTY_ID, flags : u32, propertyvalue : *const EVT_VARIANT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("wevtapi.dll" "system" fn EvtSubscribe(session : EVT_HANDLE, signalevent : super::super::Foundation:: HANDLE, channelpath : windows_sys::core::PCWSTR, query : windows_sys::core::PCWSTR, bookmark : EVT_HANDLE, context : *const core::ffi::c_void, callback : EVT_SUBSCRIBE_CALLBACK, flags : u32) -> EVT_HANDLE);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("wevtapi.dll" "system" fn EvtUpdateBookmark(bookmark : EVT_HANDLE, event : EVT_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetEventLogInformation(heventlog : super::super::Foundation:: HANDLE, dwinfolevel : u32, lpbuffer : *mut core::ffi::c_void, cbbufsize : u32, pcbbytesneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetNumberOfEventLogRecords(heventlog : super::super::Foundation:: HANDLE, numberofrecords : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetOldestEventLogRecord(heventlog : super::super::Foundation:: HANDLE, oldestrecord : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn NotifyChangeEventLog(heventlog : super::super::Foundation:: HANDLE, hevent : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn OpenBackupEventLogA(lpuncservername : windows_sys::core::PCSTR, lpfilename : windows_sys::core::PCSTR) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn OpenBackupEventLogW(lpuncservername : windows_sys::core::PCWSTR, lpfilename : windows_sys::core::PCWSTR) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn OpenEventLogA(lpuncservername : windows_sys::core::PCSTR, lpsourcename : windows_sys::core::PCSTR) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn OpenEventLogW(lpuncservername : windows_sys::core::PCWSTR, lpsourcename : windows_sys::core::PCWSTR) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ReadEventLogA(heventlog : super::super::Foundation:: HANDLE, dwreadflags : READ_EVENT_LOG_READ_FLAGS, dwrecordoffset : u32, lpbuffer : *mut core::ffi::c_void, nnumberofbytestoread : u32, pnbytesread : *mut u32, pnminnumberofbytesneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ReadEventLogW(heventlog : super::super::Foundation:: HANDLE, dwreadflags : READ_EVENT_LOG_READ_FLAGS, dwrecordoffset : u32, lpbuffer : *mut core::ffi::c_void, nnumberofbytestoread : u32, pnbytesread : *mut u32, pnminnumberofbytesneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn RegisterEventSourceA(lpuncservername : windows_sys::core::PCSTR, lpsourcename : windows_sys::core::PCSTR) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn RegisterEventSourceW(lpuncservername : windows_sys::core::PCWSTR, lpsourcename : windows_sys::core::PCWSTR) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("advapi32.dll" "system" fn ReportEventA(heventlog : super::super::Foundation:: HANDLE, wtype : REPORT_EVENT_TYPE, wcategory : u16, dweventid : u32, lpusersid : super::super::Security:: PSID, wnumstrings : u16, dwdatasize : u32, lpstrings : *const windows_sys::core::PCSTR, lprawdata : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("advapi32.dll" "system" fn ReportEventW(heventlog : super::super::Foundation:: HANDLE, wtype : REPORT_EVENT_TYPE, wcategory : u16, dweventid : u32, lpusersid : super::super::Security:: PSID, wnumstrings : u16, dwdatasize : u32, lpstrings : *const windows_sys::core::PCWSTR, lprawdata : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 67:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENTLOGRECORD {
//     pub Length: u32,
//     pub Reserved: u32,
//     pub RecordNumber: u32,
//     pub TimeGenerated: u32,
//     pub TimeWritten: u32,
//     pub EventID: u32,
//     pub EventType: REPORT_EVENT_TYPE,
//     pub NumStrings: u16,
//     pub EventCategory: u16,
//     pub ReservedFlags: u16,
//     pub ClosingRecordNumber: u32,
//     pub StringOffset: u32,
//     pub UserSidLength: u32,
//     pub UserSidOffset: u32,
//     pub DataLength: u32,
//     pub DataOffset: u32,
// }

public const val `EVENTLOG_AUDIT_FAILURE`: `REPORT_EVENT_TYPE` = 16u;
public const val `EVENTLOG_AUDIT_SUCCESS`: `REPORT_EVENT_TYPE` = 8u;
public const val `EVENTLOG_ERROR_TYPE`: `REPORT_EVENT_TYPE` = 1u;
// UNSUPPORTED Rust 90:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EVENTLOG_FULL_INFORMATION {
//     pub dwFull: u32,
// }

public const val `EVENTLOG_INFORMATION_TYPE`: `REPORT_EVENT_TYPE` = 4u;
public const val `EVENTLOG_SEEK_READ`: `READ_EVENT_LOG_READ_FLAGS` = 2u;
public const val `EVENTLOG_SEQUENTIAL_READ`: `READ_EVENT_LOG_READ_FLAGS` = 1u;
public const val `EVENTLOG_SUCCESS`: `REPORT_EVENT_TYPE` = 0u;
public const val `EVENTLOG_WARNING_TYPE`: `REPORT_EVENT_TYPE` = 2u;
// UNSUPPORTED Rust 100:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EVENTSFORLOGFILE {
//     pub ulSize: u32,
//     pub szLogicalLogFile: [u16; 256],
//     pub ulNumRecords: u32,
//     pub pEventLogRecords: [EVENTLOGRECORD; 1],
// }

// UNSUPPORTED Rust 108:1: declaration Impl has no candidate rule
// impl Default for EVENTSFORLOGFILE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `EVT_ALL_ACCESS`: UInt = 7u;
public typealias `EVT_CHANNEL_CLOCK_TYPE` = Int;
public typealias `EVT_CHANNEL_CONFIG_PROPERTY_ID` = Int;
public typealias `EVT_CHANNEL_ISOLATION_TYPE` = Int;
public typealias `EVT_CHANNEL_REFERENCE_FLAGS` = UInt;
public typealias `EVT_CHANNEL_SID_TYPE` = Int;
public typealias `EVT_CHANNEL_TYPE` = Int;
public const val `EVT_CLEAR_ACCESS`: UInt = 4u;
public typealias `EVT_EVENT_METADATA_PROPERTY_ID` = Int;
public typealias `EVT_EVENT_PROPERTY_ID` = Int;
public typealias `EVT_EXPORTLOG_FLAGS` = UInt;
public typealias `EVT_FORMAT_MESSAGE_FLAGS` = UInt;
public typealias `EVT_HANDLE` = Long;
public typealias `EVT_LOGIN_CLASS` = Int;
public typealias `EVT_LOG_PROPERTY_ID` = Int;
public typealias `EVT_OPEN_LOG_FLAGS` = UInt;
public typealias `EVT_PUBLISHER_METADATA_PROPERTY_ID` = Int;
public typealias `EVT_QUERY_FLAGS` = UInt;
public typealias `EVT_QUERY_PROPERTY_ID` = Int;
public const val `EVT_READ_ACCESS`: UInt = 1u;
public typealias `EVT_RENDER_CONTEXT_FLAGS` = UInt;
public typealias `EVT_RENDER_FLAGS` = UInt;
// UNSUPPORTED Rust 135:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EVT_RPC_LOGIN {
//     pub Server: windows_sys::core::PWSTR,
//     pub User: windows_sys::core::PWSTR,
//     pub Domain: windows_sys::core::PWSTR,
//     pub Password: windows_sys::core::PWSTR,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 144:1: declaration Impl has no candidate rule
// impl Default for EVT_RPC_LOGIN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `EVT_RPC_LOGIN_FLAGS` = UInt;
public typealias `EVT_SEEK_FLAGS` = UInt;
// UNSUPPORTED Rust 151:1: generic scalar type unsupported
// pub type EVT_SUBSCRIBE_CALLBACK = Option<unsafe extern "system" fn(action: EVT_SUBSCRIBE_NOTIFY_ACTION, usercontext: *const core::ffi::c_void, event: EVT_HANDLE) -> u32>;

public typealias `EVT_SUBSCRIBE_FLAGS` = UInt;
public typealias `EVT_SUBSCRIBE_NOTIFY_ACTION` = Int;
public typealias `EVT_SYSTEM_PROPERTY_ID` = Int;
// UNSUPPORTED Rust 155:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct EVT_VARIANT {
//     pub Anonymous: EVT_VARIANT_0,
//     pub Count: u32,
//     pub Type: u32,
// }

// UNSUPPORTED Rust 163:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for EVT_VARIANT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 169:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union EVT_VARIANT_0 {
//     pub BooleanVal: windows_sys::core::BOOL,
//     pub SByteVal: i8,
//     pub Int16Val: i16,
//     pub Int32Val: i32,
//     pub Int64Val: i64,
//     pub ByteVal: u8,
//     pub UInt16Val: u16,
//     pub UInt32Val: u32,
//     pub UInt64Val: u64,
//     pub SingleVal: f32,
//     pub DoubleVal: f64,
//     pub FileTimeVal: u64,
//     pub SysTimeVal: *mut super::super::Foundation::SYSTEMTIME,
//     pub GuidVal: *mut windows_sys::core::GUID,
//     pub StringVal: windows_sys::core::PCWSTR,
//     pub AnsiStringVal: windows_sys::core::PCSTR,
//     pub BinaryVal: *mut u8,
//     pub SidVal: super::super::Security::PSID,
//     pub SizeTVal: usize,
//     pub BooleanArr: *mut windows_sys::core::BOOL,
//     pub SByteArr: *mut i8,
//     pub Int16Arr: *mut i16,
//     pub Int32Arr: *mut i32,
//     pub Int64Arr: *mut i64,
//     pub ByteArr: *mut u8,
//     pub UInt16Arr: *mut u16,
//     pub UInt32Arr: *mut u32,
//     pub UInt64Arr: *mut u64,
//     pub SingleArr: *mut f32,
//     pub DoubleArr: *mut f64,
//     pub FileTimeArr: *mut super::super::Foundation::FILETIME,
//     pub SysTimeArr: *mut super::super::Foundation::SYSTEMTIME,
//     pub GuidArr: *mut windows_sys::core::GUID,
//     pub StringArr: *mut windows_sys::core::PWSTR,
//     pub AnsiStringArr: *mut windows_sys::core::PSTR,
//     pub SidArr: *mut super::super::Security::PSID,
//     pub SizeTArr: *mut usize,
//     pub EvtHandleVal: EVT_HANDLE,
//     pub XmlVal: windows_sys::core::PCWSTR,
//     pub XmlValArr: *const windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 214:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for EVT_VARIANT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `EVT_VARIANT_TYPE` = Int;
public const val `EVT_VARIANT_TYPE_ARRAY`: UInt = 128u;
public const val `EVT_VARIANT_TYPE_MASK`: UInt = 127u;
public const val `EVT_WRITE_ACCESS`: UInt = 2u;
public const val `EventMetadataEventChannel`: `EVT_EVENT_METADATA_PROPERTY_ID` = 2;
public const val `EventMetadataEventID`: `EVT_EVENT_METADATA_PROPERTY_ID` = 0;
public const val `EventMetadataEventKeyword`: `EVT_EVENT_METADATA_PROPERTY_ID` = 6;
public const val `EventMetadataEventLevel`: `EVT_EVENT_METADATA_PROPERTY_ID` = 3;
public const val `EventMetadataEventMessageID`: `EVT_EVENT_METADATA_PROPERTY_ID` = 7;
public const val `EventMetadataEventOpcode`: `EVT_EVENT_METADATA_PROPERTY_ID` = 4;
public const val `EventMetadataEventTask`: `EVT_EVENT_METADATA_PROPERTY_ID` = 5;
public const val `EventMetadataEventTemplate`: `EVT_EVENT_METADATA_PROPERTY_ID` = 8;
public const val `EventMetadataEventVersion`: `EVT_EVENT_METADATA_PROPERTY_ID` = 1;
public const val `EvtChannelClockTypeQPC`: `EVT_CHANNEL_CLOCK_TYPE` = 1;
public const val `EvtChannelClockTypeSystemTime`: `EVT_CHANNEL_CLOCK_TYPE` = 0;
public const val `EvtChannelConfigAccess`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 5;
public const val `EvtChannelConfigClassicEventlog`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 4;
public const val `EvtChannelConfigEnabled`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 0;
public const val `EvtChannelConfigIsolation`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 1;
public const val `EvtChannelConfigOwningPublisher`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 3;
public const val `EvtChannelConfigPropertyIdEND`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 21;
public const val `EvtChannelConfigType`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 2;
public const val `EvtChannelIsolationTypeApplication`: `EVT_CHANNEL_ISOLATION_TYPE` = 0;
public const val `EvtChannelIsolationTypeCustom`: `EVT_CHANNEL_ISOLATION_TYPE` = 2;
public const val `EvtChannelIsolationTypeSystem`: `EVT_CHANNEL_ISOLATION_TYPE` = 1;
public const val `EvtChannelLoggingConfigAutoBackup`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 7;
public const val `EvtChannelLoggingConfigLogFilePath`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 9;
public const val `EvtChannelLoggingConfigMaxSize`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 8;
public const val `EvtChannelLoggingConfigRetention`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 6;
public const val `EvtChannelPublisherList`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 19;
public const val `EvtChannelPublishingConfigBufferSize`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 13;
public const val `EvtChannelPublishingConfigClockType`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 17;
public const val `EvtChannelPublishingConfigControlGuid`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 12;
public const val `EvtChannelPublishingConfigFileMax`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 20;
public const val `EvtChannelPublishingConfigKeywords`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 11;
public const val `EvtChannelPublishingConfigLatency`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 16;
public const val `EvtChannelPublishingConfigLevel`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 10;
public const val `EvtChannelPublishingConfigMaxBuffers`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 15;
public const val `EvtChannelPublishingConfigMinBuffers`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 14;
public const val `EvtChannelPublishingConfigSidType`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 18;
public const val `EvtChannelReferenceImported`: `EVT_CHANNEL_REFERENCE_FLAGS` = 1u;
public const val `EvtChannelSidTypeNone`: `EVT_CHANNEL_SID_TYPE` = 0;
public const val `EvtChannelSidTypePublishing`: `EVT_CHANNEL_SID_TYPE` = 1;
public const val `EvtChannelTypeAdmin`: `EVT_CHANNEL_TYPE` = 0;
public const val `EvtChannelTypeAnalytic`: `EVT_CHANNEL_TYPE` = 2;
public const val `EvtChannelTypeDebug`: `EVT_CHANNEL_TYPE` = 3;
public const val `EvtChannelTypeOperational`: `EVT_CHANNEL_TYPE` = 1;
public const val `EvtEventMetadataPropertyIdEND`: `EVT_EVENT_METADATA_PROPERTY_ID` = 9;
public const val `EvtEventPath`: `EVT_EVENT_PROPERTY_ID` = 1;
public const val `EvtEventPropertyIdEND`: `EVT_EVENT_PROPERTY_ID` = 2;
public const val `EvtEventQueryIDs`: `EVT_EVENT_PROPERTY_ID` = 0;
public const val `EvtExportLogChannelPath`: `EVT_EXPORTLOG_FLAGS` = 1u;
public const val `EvtExportLogFilePath`: `EVT_EXPORTLOG_FLAGS` = 2u;
public const val `EvtExportLogOverwrite`: `EVT_EXPORTLOG_FLAGS` = 8192u;
public const val `EvtExportLogTolerateQueryErrors`: `EVT_EXPORTLOG_FLAGS` = 4096u;
public const val `EvtFormatMessageChannel`: `EVT_FORMAT_MESSAGE_FLAGS` = 6u;
public const val `EvtFormatMessageEvent`: `EVT_FORMAT_MESSAGE_FLAGS` = 1u;
public const val `EvtFormatMessageId`: `EVT_FORMAT_MESSAGE_FLAGS` = 8u;
public const val `EvtFormatMessageKeyword`: `EVT_FORMAT_MESSAGE_FLAGS` = 5u;
public const val `EvtFormatMessageLevel`: `EVT_FORMAT_MESSAGE_FLAGS` = 2u;
public const val `EvtFormatMessageOpcode`: `EVT_FORMAT_MESSAGE_FLAGS` = 4u;
public const val `EvtFormatMessageProvider`: `EVT_FORMAT_MESSAGE_FLAGS` = 7u;
public const val `EvtFormatMessageTask`: `EVT_FORMAT_MESSAGE_FLAGS` = 3u;
public const val `EvtFormatMessageXml`: `EVT_FORMAT_MESSAGE_FLAGS` = 9u;
public const val `EvtLogAttributes`: `EVT_LOG_PROPERTY_ID` = 4;
public const val `EvtLogCreationTime`: `EVT_LOG_PROPERTY_ID` = 0;
public const val `EvtLogFileSize`: `EVT_LOG_PROPERTY_ID` = 3;
public const val `EvtLogFull`: `EVT_LOG_PROPERTY_ID` = 7;
public const val `EvtLogLastAccessTime`: `EVT_LOG_PROPERTY_ID` = 1;
public const val `EvtLogLastWriteTime`: `EVT_LOG_PROPERTY_ID` = 2;
public const val `EvtLogNumberOfLogRecords`: `EVT_LOG_PROPERTY_ID` = 5;
public const val `EvtLogOldestRecordNumber`: `EVT_LOG_PROPERTY_ID` = 6;
public const val `EvtOpenChannelPath`: `EVT_OPEN_LOG_FLAGS` = 1u;
public const val `EvtOpenFilePath`: `EVT_OPEN_LOG_FLAGS` = 2u;
public const val `EvtPublisherMetadataChannelReferenceFlags`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 10;
public const val `EvtPublisherMetadataChannelReferenceID`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 9;
public const val `EvtPublisherMetadataChannelReferenceIndex`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 8;
public const val `EvtPublisherMetadataChannelReferenceMessageID`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 11;
public const val `EvtPublisherMetadataChannelReferencePath`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 7;
public const val `EvtPublisherMetadataChannelReferences`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 6;
public const val `EvtPublisherMetadataHelpLink`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 4;
public const val `EvtPublisherMetadataKeywordMessageID`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 28;
public const val `EvtPublisherMetadataKeywordName`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 26;
public const val `EvtPublisherMetadataKeywordValue`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 27;
public const val `EvtPublisherMetadataKeywords`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 25;
public const val `EvtPublisherMetadataLevelMessageID`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 15;
public const val `EvtPublisherMetadataLevelName`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 13;
public const val `EvtPublisherMetadataLevelValue`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 14;
public const val `EvtPublisherMetadataLevels`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 12;
public const val `EvtPublisherMetadataMessageFilePath`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 3;
public const val `EvtPublisherMetadataOpcodeMessageID`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 24;
public const val `EvtPublisherMetadataOpcodeName`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 22;
public const val `EvtPublisherMetadataOpcodeValue`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 23;
public const val `EvtPublisherMetadataOpcodes`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 21;
public const val `EvtPublisherMetadataParameterFilePath`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 2;
public const val `EvtPublisherMetadataPropertyIdEND`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 29;
public const val `EvtPublisherMetadataPublisherGuid`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 0;
public const val `EvtPublisherMetadataPublisherMessageID`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 5;
public const val `EvtPublisherMetadataResourceFilePath`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 1;
public const val `EvtPublisherMetadataTaskEventGuid`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 18;
public const val `EvtPublisherMetadataTaskMessageID`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 20;
public const val `EvtPublisherMetadataTaskName`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 17;
public const val `EvtPublisherMetadataTaskValue`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 19;
public const val `EvtPublisherMetadataTasks`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 16;
public const val `EvtQueryChannelPath`: `EVT_QUERY_FLAGS` = 1u;
public const val `EvtQueryFilePath`: `EVT_QUERY_FLAGS` = 2u;
public const val `EvtQueryForwardDirection`: `EVT_QUERY_FLAGS` = 256u;
public const val `EvtQueryNames`: `EVT_QUERY_PROPERTY_ID` = 0;
public const val `EvtQueryPropertyIdEND`: `EVT_QUERY_PROPERTY_ID` = 2;
public const val `EvtQueryReverseDirection`: `EVT_QUERY_FLAGS` = 512u;
public const val `EvtQueryStatuses`: `EVT_QUERY_PROPERTY_ID` = 1;
public const val `EvtQueryTolerateQueryErrors`: `EVT_QUERY_FLAGS` = 4096u;
public const val `EvtRenderBookmark`: `EVT_RENDER_FLAGS` = 2u;
public const val `EvtRenderContextSystem`: `EVT_RENDER_CONTEXT_FLAGS` = 1u;
public const val `EvtRenderContextUser`: `EVT_RENDER_CONTEXT_FLAGS` = 2u;
public const val `EvtRenderContextValues`: `EVT_RENDER_CONTEXT_FLAGS` = 0u;
public const val `EvtRenderEventValues`: `EVT_RENDER_FLAGS` = 0u;
public const val `EvtRenderEventXml`: `EVT_RENDER_FLAGS` = 1u;
public const val `EvtRpcLogin`: `EVT_LOGIN_CLASS` = 1;
public const val `EvtRpcLoginAuthDefault`: `EVT_RPC_LOGIN_FLAGS` = 0u;
public const val `EvtRpcLoginAuthKerberos`: `EVT_RPC_LOGIN_FLAGS` = 2u;
public const val `EvtRpcLoginAuthNTLM`: `EVT_RPC_LOGIN_FLAGS` = 3u;
public const val `EvtRpcLoginAuthNegotiate`: `EVT_RPC_LOGIN_FLAGS` = 1u;
public const val `EvtSeekOriginMask`: `EVT_SEEK_FLAGS` = 7u;
public const val `EvtSeekRelativeToBookmark`: `EVT_SEEK_FLAGS` = 4u;
public const val `EvtSeekRelativeToCurrent`: `EVT_SEEK_FLAGS` = 3u;
public const val `EvtSeekRelativeToFirst`: `EVT_SEEK_FLAGS` = 1u;
public const val `EvtSeekRelativeToLast`: `EVT_SEEK_FLAGS` = 2u;
public const val `EvtSeekStrict`: `EVT_SEEK_FLAGS` = 65536u;
public const val `EvtSubscribeActionDeliver`: `EVT_SUBSCRIBE_NOTIFY_ACTION` = 1;
public const val `EvtSubscribeActionError`: `EVT_SUBSCRIBE_NOTIFY_ACTION` = 0;
public const val `EvtSubscribeOriginMask`: `EVT_SUBSCRIBE_FLAGS` = 3u;
public const val `EvtSubscribeStartAfterBookmark`: `EVT_SUBSCRIBE_FLAGS` = 3u;
public const val `EvtSubscribeStartAtOldestRecord`: `EVT_SUBSCRIBE_FLAGS` = 2u;
public const val `EvtSubscribeStrict`: `EVT_SUBSCRIBE_FLAGS` = 65536u;
public const val `EvtSubscribeToFutureEvents`: `EVT_SUBSCRIBE_FLAGS` = 1u;
public const val `EvtSubscribeTolerateQueryErrors`: `EVT_SUBSCRIBE_FLAGS` = 4096u;
public const val `EvtSystemActivityID`: `EVT_SYSTEM_PROPERTY_ID` = 10;
public const val `EvtSystemChannel`: `EVT_SYSTEM_PROPERTY_ID` = 14;
public const val `EvtSystemComputer`: `EVT_SYSTEM_PROPERTY_ID` = 15;
public const val `EvtSystemEventID`: `EVT_SYSTEM_PROPERTY_ID` = 2;
public const val `EvtSystemEventRecordId`: `EVT_SYSTEM_PROPERTY_ID` = 9;
public const val `EvtSystemKeywords`: `EVT_SYSTEM_PROPERTY_ID` = 7;
public const val `EvtSystemLevel`: `EVT_SYSTEM_PROPERTY_ID` = 4;
public const val `EvtSystemOpcode`: `EVT_SYSTEM_PROPERTY_ID` = 6;
public const val `EvtSystemProcessID`: `EVT_SYSTEM_PROPERTY_ID` = 12;
public const val `EvtSystemPropertyIdEND`: `EVT_SYSTEM_PROPERTY_ID` = 18;
public const val `EvtSystemProviderGuid`: `EVT_SYSTEM_PROPERTY_ID` = 1;
public const val `EvtSystemProviderName`: `EVT_SYSTEM_PROPERTY_ID` = 0;
public const val `EvtSystemQualifiers`: `EVT_SYSTEM_PROPERTY_ID` = 3;
public const val `EvtSystemRelatedActivityID`: `EVT_SYSTEM_PROPERTY_ID` = 11;
public const val `EvtSystemTask`: `EVT_SYSTEM_PROPERTY_ID` = 5;
public const val `EvtSystemThreadID`: `EVT_SYSTEM_PROPERTY_ID` = 13;
public const val `EvtSystemTimeCreated`: `EVT_SYSTEM_PROPERTY_ID` = 8;
public const val `EvtSystemUserID`: `EVT_SYSTEM_PROPERTY_ID` = 16;
public const val `EvtSystemVersion`: `EVT_SYSTEM_PROPERTY_ID` = 17;
public const val `EvtVarTypeAnsiString`: `EVT_VARIANT_TYPE` = 2;
public const val `EvtVarTypeBinary`: `EVT_VARIANT_TYPE` = 14;
public const val `EvtVarTypeBoolean`: `EVT_VARIANT_TYPE` = 13;
public const val `EvtVarTypeByte`: `EVT_VARIANT_TYPE` = 4;
public const val `EvtVarTypeDouble`: `EVT_VARIANT_TYPE` = 12;
public const val `EvtVarTypeEvtHandle`: `EVT_VARIANT_TYPE` = 32;
public const val `EvtVarTypeEvtXml`: `EVT_VARIANT_TYPE` = 35;
public const val `EvtVarTypeFileTime`: `EVT_VARIANT_TYPE` = 17;
public const val `EvtVarTypeGuid`: `EVT_VARIANT_TYPE` = 15;
public const val `EvtVarTypeHexInt32`: `EVT_VARIANT_TYPE` = 20;
public const val `EvtVarTypeHexInt64`: `EVT_VARIANT_TYPE` = 21;
public const val `EvtVarTypeInt16`: `EVT_VARIANT_TYPE` = 5;
public const val `EvtVarTypeInt32`: `EVT_VARIANT_TYPE` = 7;
public const val `EvtVarTypeInt64`: `EVT_VARIANT_TYPE` = 9;
public const val `EvtVarTypeNull`: `EVT_VARIANT_TYPE` = 0;
public const val `EvtVarTypeSByte`: `EVT_VARIANT_TYPE` = 3;
public const val `EvtVarTypeSid`: `EVT_VARIANT_TYPE` = 19;
public const val `EvtVarTypeSingle`: `EVT_VARIANT_TYPE` = 11;
public const val `EvtVarTypeSizeT`: `EVT_VARIANT_TYPE` = 16;
public const val `EvtVarTypeString`: `EVT_VARIANT_TYPE` = 1;
public const val `EvtVarTypeSysTime`: `EVT_VARIANT_TYPE` = 18;
public const val `EvtVarTypeUInt16`: `EVT_VARIANT_TYPE` = 6;
public const val `EvtVarTypeUInt32`: `EVT_VARIANT_TYPE` = 8;
public const val `EvtVarTypeUInt64`: `EVT_VARIANT_TYPE` = 10;
public typealias `READ_EVENT_LOG_READ_FLAGS` = UInt;
public typealias `REPORT_EVENT_TYPE` = UShort;
