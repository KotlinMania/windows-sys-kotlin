// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=BroadcastSystemMessageA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BroadcastSystemMessageA`(`flags` : UInt, `lpinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `msg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=BroadcastSystemMessageExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BroadcastSystemMessageExA`(`flags` : `BROADCAST_SYSTEM_MESSAGE_FLAGS`, `lpinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BROADCAST_SYSTEM_MESSAGE_INFO`>?, `msg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`, `pbsminfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BSMINFO`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=BroadcastSystemMessageExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BroadcastSystemMessageExW`(`flags` : `BROADCAST_SYSTEM_MESSAGE_FLAGS`, `lpinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BROADCAST_SYSTEM_MESSAGE_INFO`>?, `msg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`, `pbsminfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BSMINFO`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=BroadcastSystemMessageW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BroadcastSystemMessageW`(`flags` : `BROADCAST_SYSTEM_MESSAGE_FLAGS`, `lpinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BROADCAST_SYSTEM_MESSAGE_INFO`>?, `msg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CloseDesktop; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CloseDesktop`(`hdesktop` : `HDESK`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CloseWindowStation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CloseWindowStation`(`hwinsta` : `HWINSTA`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CreateDesktopA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
public external fun `CreateDesktopA`(`lpszdesktop` : `windows_sys`.`core`.`PCSTR`, `lpszdevice` : `windows_sys`.`core`.`PCSTR`, `pdevmode` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`DEVMODEA`>?, `dwflags` : `DESKTOP_CONTROL_FLAGS`, `dwdesiredaccess` : UInt, `lpsa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?) : `HDESK`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CreateDesktopExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
public external fun `CreateDesktopExA`(`lpszdesktop` : `windows_sys`.`core`.`PCSTR`, `lpszdevice` : `windows_sys`.`core`.`PCSTR`, `pdevmode` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`DEVMODEA`>?, `dwflags` : `DESKTOP_CONTROL_FLAGS`, `dwdesiredaccess` : UInt, `lpsa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `ulheapsize` : UInt, `pvoid` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `HDESK`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CreateDesktopExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
public external fun `CreateDesktopExW`(`lpszdesktop` : `windows_sys`.`core`.`PCWSTR`, `lpszdevice` : `windows_sys`.`core`.`PCWSTR`, `pdevmode` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`DEVMODEW`>?, `dwflags` : `DESKTOP_CONTROL_FLAGS`, `dwdesiredaccess` : UInt, `lpsa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `ulheapsize` : UInt, `pvoid` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `HDESK`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CreateDesktopW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
public external fun `CreateDesktopW`(`lpszdesktop` : `windows_sys`.`core`.`PCWSTR`, `lpszdevice` : `windows_sys`.`core`.`PCWSTR`, `pdevmode` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`DEVMODEW`>?, `dwflags` : `DESKTOP_CONTROL_FLAGS`, `dwdesiredaccess` : UInt, `lpsa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?) : `HDESK`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CreateWindowStationA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateWindowStationA`(`lpwinsta` : `windows_sys`.`core`.`PCSTR`, `dwflags` : UInt, `dwdesiredaccess` : UInt, `lpsa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?) : `HWINSTA`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CreateWindowStationW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateWindowStationW`(`lpwinsta` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `dwdesiredaccess` : UInt, `lpsa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?) : `HWINSTA`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EnumDesktopWindows; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `EnumDesktopWindows`(`hdesktop` : `HDESK`, `lpfn` : `super`.`super`.`UI`.`WindowsAndMessaging`.`WNDENUMPROC`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EnumDesktopsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumDesktopsA`(`hwinsta` : `HWINSTA`, `lpenumfunc` : `DESKTOPENUMPROCA`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EnumDesktopsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumDesktopsW`(`hwinsta` : `HWINSTA`, `lpenumfunc` : `DESKTOPENUMPROCW`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EnumWindowStationsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumWindowStationsA`(`lpenumfunc` : `WINSTAENUMPROCA`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EnumWindowStationsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumWindowStationsW`(`lpenumfunc` : `WINSTAENUMPROCW`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetProcessWindowStation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetProcessWindowStation`() : `HWINSTA`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetThreadDesktop; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetThreadDesktop`(`dwthreadid` : UInt) : `HDESK`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetUserObjectInformationA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetUserObjectInformationA`(`hobj` : `super`.`super`.`Foundation`.`HANDLE`, `nindex` : `USER_OBJECT_INFORMATION_INDEX`, `pvinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `nlength` : UInt, `lpnlengthneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetUserObjectInformationW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetUserObjectInformationW`(`hobj` : `super`.`super`.`Foundation`.`HANDLE`, `nindex` : `USER_OBJECT_INFORMATION_INDEX`, `pvinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `nlength` : UInt, `lpnlengthneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=OpenDesktopA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenDesktopA`(`lpszdesktop` : `windows_sys`.`core`.`PCSTR`, `dwflags` : `DESKTOP_CONTROL_FLAGS`, `finherit` : `windows_sys`.`core`.`BOOL`, `dwdesiredaccess` : UInt) : `HDESK`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=OpenDesktopW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenDesktopW`(`lpszdesktop` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : `DESKTOP_CONTROL_FLAGS`, `finherit` : `windows_sys`.`core`.`BOOL`, `dwdesiredaccess` : UInt) : `HDESK`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=OpenInputDesktop; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenInputDesktop`(`dwflags` : `DESKTOP_CONTROL_FLAGS`, `finherit` : `windows_sys`.`core`.`BOOL`, `dwdesiredaccess` : `DESKTOP_ACCESS_FLAGS`) : `HDESK`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=OpenWindowStationA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenWindowStationA`(`lpszwinsta` : `windows_sys`.`core`.`PCSTR`, `finherit` : `windows_sys`.`core`.`BOOL`, `dwdesiredaccess` : UInt) : `HWINSTA`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=OpenWindowStationW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenWindowStationW`(`lpszwinsta` : `windows_sys`.`core`.`PCWSTR`, `finherit` : `windows_sys`.`core`.`BOOL`, `dwdesiredaccess` : UInt) : `HWINSTA`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetProcessWindowStation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetProcessWindowStation`(`hwinsta` : `HWINSTA`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetThreadDesktop; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetThreadDesktop`(`hdesktop` : `HDESK`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetUserObjectInformationA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetUserObjectInformationA`(`hobj` : `super`.`super`.`Foundation`.`HANDLE`, `nindex` : Int, `pvinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `nlength` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetUserObjectInformationW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetUserObjectInformationW`(`hobj` : `super`.`super`.`Foundation`.`HANDLE`, `nindex` : Int, `pvinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `nlength` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SwitchDesktop; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SwitchDesktop`(`hdesktop` : `HDESK`) : `windows_sys`.`core`.`BOOL`
public typealias `BROADCAST_SYSTEM_MESSAGE_FLAGS` = UInt;
public typealias `BROADCAST_SYSTEM_MESSAGE_INFO` = UInt;
public const val `BSF_ALLOWSFW`: `BROADCAST_SYSTEM_MESSAGE_FLAGS` = 128u;
public const val `BSF_FLUSHDISK`: `BROADCAST_SYSTEM_MESSAGE_FLAGS` = 4u;
public const val `BSF_FORCEIFHUNG`: `BROADCAST_SYSTEM_MESSAGE_FLAGS` = 32u;
public const val `BSF_IGNORECURRENTTASK`: `BROADCAST_SYSTEM_MESSAGE_FLAGS` = 2u;
public const val `BSF_LUID`: `BROADCAST_SYSTEM_MESSAGE_FLAGS` = 1024u;
public const val `BSF_NOHANG`: `BROADCAST_SYSTEM_MESSAGE_FLAGS` = 8u;
public const val `BSF_NOTIMEOUTIFNOTHUNG`: `BROADCAST_SYSTEM_MESSAGE_FLAGS` = 64u;
public const val `BSF_POSTMESSAGE`: `BROADCAST_SYSTEM_MESSAGE_FLAGS` = 16u;
public const val `BSF_QUERY`: `BROADCAST_SYSTEM_MESSAGE_FLAGS` = 1u;
public const val `BSF_RETURNHDESK`: `BROADCAST_SYSTEM_MESSAGE_FLAGS` = 512u;
public const val `BSF_SENDNOTIFYMESSAGE`: `BROADCAST_SYSTEM_MESSAGE_FLAGS` = 256u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BSMINFO` (
    public var `cbSize`: UInt,
    public var `hdesk`: `HDESK`,
    public var `hwnd`: `super`.`super`.`Foundation`.`HWND`,
    public var `luid`: `super`.`super`.`Foundation`.`LUID`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `BSMINFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `BSMINFO`.Companion.`default`() : `BSMINFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `BSM_ALLCOMPONENTS`: `BROADCAST_SYSTEM_MESSAGE_INFO` = 0u;
public const val `BSM_ALLDESKTOPS`: `BROADCAST_SYSTEM_MESSAGE_INFO` = 16u;
public const val `BSM_APPLICATIONS`: `BROADCAST_SYSTEM_MESSAGE_INFO` = 8u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DESKTOPENUMPROCA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, `super`.`super`.`Foundation`.`LPARAM`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DESKTOPENUMPROCW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `super`.`super`.`Foundation`.`LPARAM`) -> `windows_sys`.`core`.`BOOL`>>>;
public typealias `DESKTOP_ACCESS_FLAGS` = UInt;
public typealias `DESKTOP_CONTROL_FLAGS` = UInt;
public const val `DESKTOP_CREATEMENU`: `DESKTOP_ACCESS_FLAGS` = 4u;
public const val `DESKTOP_CREATEWINDOW`: `DESKTOP_ACCESS_FLAGS` = 2u;
public const val `DESKTOP_DELETE`: `DESKTOP_ACCESS_FLAGS` = 65536u;
public const val `DESKTOP_ENUMERATE`: `DESKTOP_ACCESS_FLAGS` = 64u;
public const val `DESKTOP_HOOKCONTROL`: `DESKTOP_ACCESS_FLAGS` = 8u;
public const val `DESKTOP_JOURNALPLAYBACK`: `DESKTOP_ACCESS_FLAGS` = 32u;
public const val `DESKTOP_JOURNALRECORD`: `DESKTOP_ACCESS_FLAGS` = 16u;
public const val `DESKTOP_READOBJECTS`: `DESKTOP_ACCESS_FLAGS` = 1u;
public const val `DESKTOP_READ_CONTROL`: `DESKTOP_ACCESS_FLAGS` = 131072u;
public const val `DESKTOP_SWITCHDESKTOP`: `DESKTOP_ACCESS_FLAGS` = 256u;
public const val `DESKTOP_SYNCHRONIZE`: `DESKTOP_ACCESS_FLAGS` = 1048576u;
public const val `DESKTOP_WRITEOBJECTS`: `DESKTOP_ACCESS_FLAGS` = 128u;
public const val `DESKTOP_WRITE_DAC`: `DESKTOP_ACCESS_FLAGS` = 262144u;
public const val `DESKTOP_WRITE_OWNER`: `DESKTOP_ACCESS_FLAGS` = 524288u;
public const val `DF_ALLOWOTHERACCOUNTHOOK`: `DESKTOP_CONTROL_FLAGS` = 1u;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDESK` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HWINSTA` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public const val `UOI_FLAGS`: `USER_OBJECT_INFORMATION_INDEX` = 1;
public const val `UOI_HEAPSIZE`: `USER_OBJECT_INFORMATION_INDEX` = 5;
public const val `UOI_IO`: `USER_OBJECT_INFORMATION_INDEX` = 6;
public const val `UOI_NAME`: `USER_OBJECT_INFORMATION_INDEX` = 2;
public const val `UOI_TYPE`: `USER_OBJECT_INFORMATION_INDEX` = 3;
public const val `UOI_USER_SID`: `USER_OBJECT_INFORMATION_INDEX` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USEROBJECTFLAGS` (
    public var `fInherit`: `windows_sys`.`core`.`BOOL`,
    public var `fReserved`: `windows_sys`.`core`.`BOOL`,
    public var `dwFlags`: UInt,
)
public typealias `USER_OBJECT_INFORMATION_INDEX` = Int;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WINSTAENUMPROCA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, `super`.`super`.`Foundation`.`LPARAM`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WINSTAENUMPROCW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `super`.`super`.`Foundation`.`LPARAM`) -> `windows_sys`.`core`.`BOOL`>>>;
