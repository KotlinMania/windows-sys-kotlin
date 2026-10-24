// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ActivateKeyboardLayout; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ActivateKeyboardLayout`(`hkl` : `HKL`, `flags` : `ACTIVATE_KEYBOARD_LAYOUT_FLAGS`) : `HKL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=BlockInput; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BlockInput`(`fblockit` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DragDetect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DragDetect`(`hwnd` : `super`.`super`.`super`.`Foundation`.`HWND`, `pt` : `super`.`super`.`super`.`Foundation`.`POINT`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EnableWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnableWindow`(`hwnd` : `super`.`super`.`super`.`Foundation`.`HWND`, `benable` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetActiveWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetActiveWindow`() : `super`.`super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetAsyncKeyState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetAsyncKeyState`(`vkey` : Int) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetCapture; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCapture`() : `super`.`super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetDoubleClickTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDoubleClickTime`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetFocus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFocus`() : `super`.`super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetKBCodePage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetKBCodePage`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetKeyNameTextA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetKeyNameTextA`(`lparam` : Int, `lpstring` : `windows_sys`.`core`.`PSTR`, `cchsize` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetKeyNameTextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetKeyNameTextW`(`lparam` : Int, `lpstring` : `windows_sys`.`core`.`PWSTR`, `cchsize` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetKeyState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetKeyState`(`nvirtkey` : Int) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetKeyboardLayout; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetKeyboardLayout`(`idthread` : UInt) : `HKL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetKeyboardLayoutList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetKeyboardLayoutList`(`nbuff` : Int, `lplist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HKL`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetKeyboardLayoutNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetKeyboardLayoutNameA`(`pwszklid` : `windows_sys`.`core`.`PSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetKeyboardLayoutNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetKeyboardLayoutNameW`(`pwszklid` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetKeyboardState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetKeyboardState`(`lpkeystate` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetKeyboardType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetKeyboardType`(`ntypeflag` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetLastInputInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetLastInputInfo`(`plii` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LASTINPUTINFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetMouseMovePointsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMouseMovePointsEx`(`cbsize` : UInt, `lppt` : /* Rust *const */ kotlinx.cinterop.CPointer<`MOUSEMOVEPOINT`>?, `lpptbuf` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MOUSEMOVEPOINT`>?, `nbufpoints` : Int, `resolution` : `GET_MOUSE_MOVE_POINTS_EX_RESOLUTION`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsWindowEnabled; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsWindowEnabled`(`hwnd` : `super`.`super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=LoadKeyboardLayoutA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadKeyboardLayoutA`(`pwszklid` : `windows_sys`.`core`.`PCSTR`, `flags` : `ACTIVATE_KEYBOARD_LAYOUT_FLAGS`) : `HKL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=LoadKeyboardLayoutW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadKeyboardLayoutW`(`pwszklid` : `windows_sys`.`core`.`PCWSTR`, `flags` : `ACTIVATE_KEYBOARD_LAYOUT_FLAGS`) : `HKL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=MapVirtualKeyA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MapVirtualKeyA`(`ucode` : UInt, `umaptype` : `MAP_VIRTUAL_KEY_TYPE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=MapVirtualKeyExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MapVirtualKeyExA`(`ucode` : UInt, `umaptype` : `MAP_VIRTUAL_KEY_TYPE`, `dwhkl` : `HKL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=MapVirtualKeyExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MapVirtualKeyExW`(`ucode` : UInt, `umaptype` : `MAP_VIRTUAL_KEY_TYPE`, `dwhkl` : `HKL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=MapVirtualKeyW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MapVirtualKeyW`(`ucode` : UInt, `umaptype` : `MAP_VIRTUAL_KEY_TYPE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=OemKeyScan; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OemKeyScan`(`woemchar` : UShort) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RegisterHotKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterHotKey`(`hwnd` : `super`.`super`.`super`.`Foundation`.`HWND`, `id` : Int, `fsmodifiers` : `HOT_KEY_MODIFIERS`, `vk` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ReleaseCapture; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReleaseCapture`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SendInput; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SendInput`(`cinputs` : UInt, `pinputs` : /* Rust *const */ kotlinx.cinterop.CPointer<`INPUT`>?, `cbsize` : Int) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetActiveWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetActiveWindow`(`hwnd` : `super`.`super`.`super`.`Foundation`.`HWND`) : `super`.`super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetCapture; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetCapture`(`hwnd` : `super`.`super`.`super`.`Foundation`.`HWND`) : `super`.`super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetDoubleClickTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetDoubleClickTime`(`param0` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetFocus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetFocus`(`hwnd` : `super`.`super`.`super`.`Foundation`.`HWND`) : `super`.`super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetKeyboardState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetKeyboardState`(`lpkeystate` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SwapMouseButton; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SwapMouseButton`(`fswap` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ToAscii; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ToAscii`(`uvirtkey` : UInt, `uscancode` : UInt, `lpkeystate` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `lpchar` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `uflags` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ToAsciiEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ToAsciiEx`(`uvirtkey` : UInt, `uscancode` : UInt, `lpkeystate` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `lpchar` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `uflags` : UInt, `dwhkl` : `HKL`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ToUnicode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ToUnicode`(`wvirtkey` : UInt, `wscancode` : UInt, `lpkeystate` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pwszbuff` : `windows_sys`.`core`.`PWSTR`, `cchbuff` : Int, `wflags` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ToUnicodeEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ToUnicodeEx`(`wvirtkey` : UInt, `wscancode` : UInt, `lpkeystate` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pwszbuff` : `windows_sys`.`core`.`PWSTR`, `cchbuff` : Int, `wflags` : UInt, `dwhkl` : `HKL`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=TrackMouseEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TrackMouseEvent`(`lpeventtrack` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TRACKMOUSEEVENT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=UnloadKeyboardLayout; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnloadKeyboardLayout`(`hkl` : `HKL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=UnregisterHotKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnregisterHotKey`(`hwnd` : `super`.`super`.`super`.`Foundation`.`HWND`, `id` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=VkKeyScanA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VkKeyScanA`(`ch` : Byte) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=VkKeyScanExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VkKeyScanExA`(`ch` : Byte, `dwhkl` : `HKL`) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=VkKeyScanExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VkKeyScanExW`(`ch` : UShort, `dwhkl` : `HKL`) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=VkKeyScanW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VkKeyScanW`(`ch` : UShort) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=_TrackMouseEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `_TrackMouseEvent`(`lpeventtrack` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TRACKMOUSEEVENT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=keybd_event; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `keybd_event`(`bvk` : UByte, `bscan` : UByte, `dwflags` : `KEYBD_EVENT_FLAGS`, `dwextrainfo` : ULong)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=mouse_event; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `mouse_event`(`dwflags` : `MOUSE_EVENT_FLAGS`, `dx` : Int, `dy` : Int, `dwdata` : Int, `dwextrainfo` : ULong)
public typealias `ACTIVATE_KEYBOARD_LAYOUT_FLAGS` = UInt;
public const val `ACUTE`: UInt = 769u;
public const val `AX_KBD_DESKTOP_TYPE`: UInt = 1u;
public const val `BREVE`: UInt = 774u;
public const val `CAPLOK`: UInt = 1u;
public const val `CAPLOKALTGR`: UInt = 4u;
public const val `CEDILLA`: UInt = 807u;
public const val `CIRCUMFLEX`: UInt = 770u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEADKEY` (
    public var `dwBoth`: UInt,
    public var `wchComposed`: UShort,
    public var `uFlags`: UShort,
)
public const val `DEC_KBD_ANSI_LAYOUT_TYPE`: UInt = 1u;
public const val `DEC_KBD_JIS_LAYOUT_TYPE`: UInt = 2u;
public const val `DIARESIS`: UInt = 776u;
public const val `DIARESIS_TONOS`: UInt = 901u;
public const val `DKF_DEAD`: UInt = 1u;
public const val `DONTCARE_BIT`: UInt = 33554432u;
public const val `DOT_ABOVE`: UInt = 775u;
public const val `DOUBLE_ACUTE`: UInt = 779u;
public const val `EXTENDED_BIT`: UInt = 16777216u;
public const val `FAKE_KEYSTROKE`: UInt = 33554432u;
public const val `FMR_KBD_JIS_TYPE`: UInt = 0u;
public const val `FMR_KBD_OASYS_TYPE`: UInt = 1u;
public const val `FMV_KBD_OASYS_TYPE`: UInt = 2u;
public typealias `GET_MOUSE_MOVE_POINTS_EX_RESOLUTION` = UInt;
public const val `GMMP_USE_DISPLAY_POINTS`: `GET_MOUSE_MOVE_POINTS_EX_RESOLUTION` = 1u;
public const val `GMMP_USE_HIGH_RESOLUTION_POINTS`: `GET_MOUSE_MOVE_POINTS_EX_RESOLUTION` = 2u;
public const val `GRAVE`: UInt = 768u;
public const val `GRPSELTAP`: UInt = 128u;
public const val `HACEK`: UInt = 780u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HARDWAREINPUT` (
    public var `uMsg`: UInt,
    public var `wParamL`: UShort,
    public var `wParamH`: UShort,
)
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HKL` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public const val `HOOK_ABOVE`: UInt = 777u;
public typealias `HOT_KEY_MODIFIERS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INPUT` (
    public var `type`: `INPUT_TYPE`,
    public var `Anonymous`: `INPUT_0`,
)
// UNSUPPORTED Rust 103:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 108:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union INPUT_0 {
//     pub mi: MOUSEINPUT,
//     pub ki: KEYBDINPUT,
//     pub hi: HARDWAREINPUT,
// }

// UNSUPPORTED Rust 115:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INPUT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `INPUT_HARDWARE`: `INPUT_TYPE` = 2u;
public const val `INPUT_KEYBOARD`: `INPUT_TYPE` = 1u;
public const val `INPUT_MOUSE`: `INPUT_TYPE` = 0u;
public typealias `INPUT_TYPE` = UInt;
public const val `KANALOK`: UInt = 8u;
public const val `KBDALT`: UInt = 4u;
public const val `KBDBASE`: UInt = 0u;
public const val `KBDCTRL`: UInt = 2u;
public const val `KBDGRPSELTAP`: UInt = 128u;
public const val `KBDKANA`: UInt = 8u;
public const val `KBDLOYA`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KBDNLSTABLES` (
    public var `OEMIdentifier`: UShort,
    public var `LayoutInformation`: UShort,
    public var `NumOfVkToF`: UInt,
    public var `pVkToF`: /* Rust *mut */ kotlinx.cinterop.CPointer<`VK_F`>?,
    public var `NumOfMouseVKey`: Int,
    public var `pusMouseVKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
)
// UNSUPPORTED Rust 141:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KBDNLSTABLES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KBDNLS_ALPHANUM`: UInt = 5u;
public const val `KBDNLS_CODEINPUT`: UInt = 10u;
public const val `KBDNLS_CONV_OR_NONCONV`: UInt = 15u;
public const val `KBDNLS_HELP_OR_END`: UInt = 11u;
public const val `KBDNLS_HIRAGANA`: UInt = 6u;
public const val `KBDNLS_HOME_OR_CLEAR`: UInt = 12u;
public const val `KBDNLS_INDEX_ALT`: UInt = 2u;
public const val `KBDNLS_INDEX_NORMAL`: UInt = 1u;
public const val `KBDNLS_KANAEVENT`: UInt = 14u;
public const val `KBDNLS_KANALOCK`: UInt = 4u;
public const val `KBDNLS_KATAKANA`: UInt = 7u;
public const val `KBDNLS_NOEVENT`: UInt = 1u;
public const val `KBDNLS_NULL`: UInt = 0u;
public const val `KBDNLS_NUMPAD`: UInt = 13u;
public const val `KBDNLS_ROMAN`: UInt = 9u;
public const val `KBDNLS_SBCSDBCS`: UInt = 8u;
public const val `KBDNLS_SEND_BASE_VK`: UInt = 2u;
public const val `KBDNLS_SEND_PARAM_VK`: UInt = 3u;
public const val `KBDNLS_TYPE_NORMAL`: UInt = 1u;
public const val `KBDNLS_TYPE_NULL`: UInt = 0u;
public const val `KBDNLS_TYPE_TOGGLE`: UInt = 2u;
public const val `KBDROYA`: UInt = 16u;
public const val `KBDSHIFT`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KBDTABLES` (
    public var `pCharModifiers`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MODIFIERS`>?,
    public var `pVkToWcharTable`: /* Rust *mut */ kotlinx.cinterop.CPointer<`VK_TO_WCHAR_TABLE`>?,
    public var `pDeadKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DEADKEY`>?,
    public var `pKeyNames`: /* Rust *mut */ kotlinx.cinterop.CPointer<`VSC_LPWSTR`>?,
    public var `pKeyNamesExt`: /* Rust *mut */ kotlinx.cinterop.CPointer<`VSC_LPWSTR`>?,
    public var `pKeyNamesDead`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>?,
    public var `pusVSCtoVK`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `bMaxVSCtoVK`: UByte,
    public var `pVSCtoVK_E0`: /* Rust *mut */ kotlinx.cinterop.CPointer<`VSC_VK`>?,
    public var `pVSCtoVK_E1`: /* Rust *mut */ kotlinx.cinterop.CPointer<`VSC_VK`>?,
    public var `fLocaleFlags`: UInt,
    public var `nLgMax`: UByte,
    public var `cbLgEntry`: UByte,
    public var `pLigature`: /* Rust *mut */ kotlinx.cinterop.CPointer<`LIGATURE1`>?,
    public var `dwType`: UInt,
    public var `dwSubType`: UInt,
)
// UNSUPPORTED Rust 189:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KBDTABLES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 194:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KBDTABLE_DESC {
//     pub wszDllName: [u16; 32],
//     pub dwType: u32,
//     pub dwSubType: u32,
// }

// UNSUPPORTED Rust 201:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KBDTABLE_DESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 206:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KBDTABLE_MULTI {
//     pub nTables: u32,
//     pub aKbdTables: [KBDTABLE_DESC; 8],
// }

// UNSUPPORTED Rust 212:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KBDTABLE_MULTI {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KBDTABLE_MULTI_MAX`: UInt = 8u;
public const val `KBD_TYPE`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KBD_TYPE_INFO` (
    public var `dwVersion`: UInt,
    public var `dwType`: UInt,
    public var `dwSubType`: UInt,
)
public const val `KBD_VERSION`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KEYBDINPUT` (
    public var `wVk`: `VIRTUAL_KEY`,
    public var `wScan`: UShort,
    public var `dwFlags`: `KEYBD_EVENT_FLAGS`,
    public var `time`: UInt,
    public var `dwExtraInfo`: ULong,
)
public typealias `KEYBD_EVENT_FLAGS` = UInt;
public const val `KEYBOARD_TYPE_GENERIC_101`: UInt = 4u;
public const val `KEYBOARD_TYPE_JAPAN`: UInt = 7u;
public const val `KEYBOARD_TYPE_KOREA`: UInt = 8u;
public const val `KEYBOARD_TYPE_UNKNOWN`: UInt = 81u;
public const val `KEYEVENTF_EXTENDEDKEY`: `KEYBD_EVENT_FLAGS` = 1u;
public const val `KEYEVENTF_KEYUP`: `KEYBD_EVENT_FLAGS` = 2u;
public const val `KEYEVENTF_SCANCODE`: `KEYBD_EVENT_FLAGS` = 8u;
public const val `KEYEVENTF_UNICODE`: `KEYBD_EVENT_FLAGS` = 4u;
public const val `KLF_ACTIVATE`: `ACTIVATE_KEYBOARD_LAYOUT_FLAGS` = 1u;
public const val `KLF_NOTELLSHELL`: `ACTIVATE_KEYBOARD_LAYOUT_FLAGS` = 128u;
public const val `KLF_REORDER`: `ACTIVATE_KEYBOARD_LAYOUT_FLAGS` = 8u;
public const val `KLF_REPLACELANG`: `ACTIVATE_KEYBOARD_LAYOUT_FLAGS` = 16u;
public const val `KLF_RESET`: `ACTIVATE_KEYBOARD_LAYOUT_FLAGS` = 1073741824u;
public const val `KLF_SETFORPROCESS`: `ACTIVATE_KEYBOARD_LAYOUT_FLAGS` = 256u;
public const val `KLF_SHIFTLOCK`: `ACTIVATE_KEYBOARD_LAYOUT_FLAGS` = 65536u;
public const val `KLF_SUBSTITUTE_OK`: `ACTIVATE_KEYBOARD_LAYOUT_FLAGS` = 2u;
public const val `KLLF_ALTGR`: UInt = 1u;
public const val `KLLF_GLOBAL_ATTRS`: UInt = 2u;
public const val `KLLF_LRM_RLM`: UInt = 4u;
public const val `KLLF_SHIFTLOCK`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LASTINPUTINFO` (
    public var `cbSize`: UInt,
    public var `dwTime`: UInt,
)
// UNSUPPORTED Rust 263:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LIGATURE1 {
//     pub VirtualKey: u8,
//     pub ModificationNumber: u16,
//     pub wch: [u16; 1],
// }

// UNSUPPORTED Rust 270:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LIGATURE1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 275:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LIGATURE2 {
//     pub VirtualKey: u8,
//     pub ModificationNumber: u16,
//     pub wch: [u16; 2],
// }

// UNSUPPORTED Rust 282:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LIGATURE2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 287:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LIGATURE3 {
//     pub VirtualKey: u8,
//     pub ModificationNumber: u16,
//     pub wch: [u16; 3],
// }

// UNSUPPORTED Rust 294:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LIGATURE3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 299:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LIGATURE4 {
//     pub VirtualKey: u8,
//     pub ModificationNumber: u16,
//     pub wch: [u16; 4],
// }

// UNSUPPORTED Rust 306:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LIGATURE4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 311:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LIGATURE5 {
//     pub VirtualKey: u8,
//     pub ModificationNumber: u16,
//     pub wch: [u16; 5],
// }

// UNSUPPORTED Rust 318:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LIGATURE5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MACRON`: UInt = 772u;
public const val `MAPVK_VK_TO_CHAR`: `MAP_VIRTUAL_KEY_TYPE` = 2u;
public const val `MAPVK_VK_TO_VSC`: `MAP_VIRTUAL_KEY_TYPE` = 0u;
public const val `MAPVK_VK_TO_VSC_EX`: `MAP_VIRTUAL_KEY_TYPE` = 4u;
public const val `MAPVK_VSC_TO_VK`: `MAP_VIRTUAL_KEY_TYPE` = 1u;
public const val `MAPVK_VSC_TO_VK_EX`: `MAP_VIRTUAL_KEY_TYPE` = 3u;
public typealias `MAP_VIRTUAL_KEY_TYPE` = UInt;
public const val `MICROSOFT_KBD_001_TYPE`: UInt = 4u;
public const val `MICROSOFT_KBD_002_TYPE`: UInt = 3u;
public const val `MICROSOFT_KBD_101A_TYPE`: UInt = 0u;
public const val `MICROSOFT_KBD_101B_TYPE`: UInt = 4u;
public const val `MICROSOFT_KBD_101C_TYPE`: UInt = 5u;
public const val `MICROSOFT_KBD_101_TYPE`: UInt = 0u;
public const val `MICROSOFT_KBD_103_TYPE`: UInt = 6u;
public const val `MICROSOFT_KBD_106_TYPE`: UInt = 2u;
public const val `MICROSOFT_KBD_AX_TYPE`: UInt = 1u;
public const val `MICROSOFT_KBD_FUNC`: UInt = 12u;
// UNSUPPORTED Rust 340:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MODIFIERS {
//     pub pVkToBit: *mut VK_TO_BIT,
//     pub wMaxModBits: u16,
//     pub ModNumber: [u8; 1],
// }

// UNSUPPORTED Rust 347:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MODIFIERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MOD_ALT`: `HOT_KEY_MODIFIERS` = 1u;
public const val `MOD_CONTROL`: `HOT_KEY_MODIFIERS` = 2u;
public const val `MOD_NOREPEAT`: `HOT_KEY_MODIFIERS` = 16384u;
public const val `MOD_SHIFT`: `HOT_KEY_MODIFIERS` = 4u;
public const val `MOD_WIN`: `HOT_KEY_MODIFIERS` = 8u;
public const val `MOUSEEVENTF_ABSOLUTE`: `MOUSE_EVENT_FLAGS` = 32768u;
public const val `MOUSEEVENTF_HWHEEL`: `MOUSE_EVENT_FLAGS` = 4096u;
public const val `MOUSEEVENTF_LEFTDOWN`: `MOUSE_EVENT_FLAGS` = 2u;
public const val `MOUSEEVENTF_LEFTUP`: `MOUSE_EVENT_FLAGS` = 4u;
public const val `MOUSEEVENTF_MIDDLEDOWN`: `MOUSE_EVENT_FLAGS` = 32u;
public const val `MOUSEEVENTF_MIDDLEUP`: `MOUSE_EVENT_FLAGS` = 64u;
public const val `MOUSEEVENTF_MOVE`: `MOUSE_EVENT_FLAGS` = 1u;
public const val `MOUSEEVENTF_MOVE_NOCOALESCE`: `MOUSE_EVENT_FLAGS` = 8192u;
public const val `MOUSEEVENTF_RIGHTDOWN`: `MOUSE_EVENT_FLAGS` = 8u;
public const val `MOUSEEVENTF_RIGHTUP`: `MOUSE_EVENT_FLAGS` = 16u;
public const val `MOUSEEVENTF_VIRTUALDESK`: `MOUSE_EVENT_FLAGS` = 16384u;
public const val `MOUSEEVENTF_WHEEL`: `MOUSE_EVENT_FLAGS` = 2048u;
public const val `MOUSEEVENTF_XDOWN`: `MOUSE_EVENT_FLAGS` = 128u;
public const val `MOUSEEVENTF_XUP`: `MOUSE_EVENT_FLAGS` = 256u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MOUSEINPUT` (
    public var `dx`: Int,
    public var `dy`: Int,
    public var `mouseData`: UInt,
    public var `dwFlags`: `MOUSE_EVENT_FLAGS`,
    public var `time`: UInt,
    public var `dwExtraInfo`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MOUSEMOVEPOINT` (
    public var `x`: Int,
    public var `y`: Int,
    public var `time`: UInt,
    public var `dwExtraInfo`: ULong,
)
public typealias `MOUSE_EVENT_FLAGS` = UInt;
public const val `NEC_KBD_106_TYPE`: UInt = 5u;
public const val `NEC_KBD_H_MODE_TYPE`: UInt = 3u;
public const val `NEC_KBD_LAPTOP_TYPE`: UInt = 4u;
public const val `NEC_KBD_NORMAL_TYPE`: UInt = 1u;
public const val `NEC_KBD_N_MODE_TYPE`: UInt = 2u;
public const val `NLSKBD_INFO_ACCESSIBILITY_KEYMAP`: UInt = 2u;
public const val `NLSKBD_INFO_EMURATE_101_KEYBOARD`: UInt = 16u;
public const val `NLSKBD_INFO_EMURATE_106_KEYBOARD`: UInt = 32u;
public const val `NLSKBD_INFO_SEND_IME_NOTIFICATION`: UInt = 1u;
public const val `NLSKBD_OEM_AX`: UInt = 1u;
public const val `NLSKBD_OEM_DEC`: UInt = 24u;
public const val `NLSKBD_OEM_EPSON`: UInt = 4u;
public const val `NLSKBD_OEM_FUJITSU`: UInt = 5u;
public const val `NLSKBD_OEM_IBM`: UInt = 7u;
public const val `NLSKBD_OEM_MATSUSHITA`: UInt = 10u;
public const val `NLSKBD_OEM_MICROSOFT`: UInt = 0u;
public const val `NLSKBD_OEM_NEC`: UInt = 13u;
public const val `NLSKBD_OEM_TOSHIBA`: UInt = 18u;
public const val `OGONEK`: UInt = 808u;
public const val `OVERSCORE`: UInt = 773u;
public const val `RING`: UInt = 778u;
public const val `SCANCODE_ALT`: UInt = 56u;
public const val `SCANCODE_CTRL`: UInt = 29u;
public const val `SCANCODE_LSHIFT`: UInt = 42u;
public const val `SCANCODE_LWIN`: UInt = 91u;
public const val `SCANCODE_NUMPAD_FIRST`: UInt = 71u;
public const val `SCANCODE_NUMPAD_LAST`: UInt = 82u;
public const val `SCANCODE_RSHIFT`: UInt = 54u;
public const val `SCANCODE_RWIN`: UInt = 92u;
public const val `SCANCODE_THAI_LAYOUT_TOGGLE`: UInt = 41u;
public const val `SGCAPS`: UInt = 2u;
public const val `SHFT_INVALID`: UInt = 15u;
public const val `TILDE`: UInt = 771u;
public const val `TME_CANCEL`: `TRACKMOUSEEVENT_FLAGS` = 2147483648u;
public const val `TME_HOVER`: `TRACKMOUSEEVENT_FLAGS` = 1u;
public const val `TME_LEAVE`: `TRACKMOUSEEVENT_FLAGS` = 2u;
public const val `TME_NONCLIENT`: `TRACKMOUSEEVENT_FLAGS` = 16u;
public const val `TME_QUERY`: `TRACKMOUSEEVENT_FLAGS` = 1073741824u;
public const val `TONOS`: UInt = 900u;
public const val `TOSHIBA_KBD_DESKTOP_TYPE`: UInt = 13u;
public const val `TOSHIBA_KBD_LAPTOP_TYPE`: UInt = 15u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TRACKMOUSEEVENT` (
    public var `cbSize`: UInt,
    public var `dwFlags`: `TRACKMOUSEEVENT_FLAGS`,
    public var `hwndTrack`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `dwHoverTime`: UInt,
)
// UNSUPPORTED Rust 439:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TRACKMOUSEEVENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `TRACKMOUSEEVENT_FLAGS` = UInt;
public const val `UMLAUT`: UInt = 776u;
public typealias `VIRTUAL_KEY` = UShort;
public const val `VK_0`: `VIRTUAL_KEY` = 48u;
public const val `VK_1`: `VIRTUAL_KEY` = 49u;
public const val `VK_2`: `VIRTUAL_KEY` = 50u;
public const val `VK_3`: `VIRTUAL_KEY` = 51u;
public const val `VK_4`: `VIRTUAL_KEY` = 52u;
public const val `VK_5`: `VIRTUAL_KEY` = 53u;
public const val `VK_6`: `VIRTUAL_KEY` = 54u;
public const val `VK_7`: `VIRTUAL_KEY` = 55u;
public const val `VK_8`: `VIRTUAL_KEY` = 56u;
public const val `VK_9`: `VIRTUAL_KEY` = 57u;
public const val `VK_A`: `VIRTUAL_KEY` = 65u;
public const val `VK_ABNT_C1`: `VIRTUAL_KEY` = 193u;
public const val `VK_ABNT_C2`: `VIRTUAL_KEY` = 194u;
public const val `VK_ACCEPT`: `VIRTUAL_KEY` = 30u;
public const val `VK_ADD`: `VIRTUAL_KEY` = 107u;
public const val `VK_APPS`: `VIRTUAL_KEY` = 93u;
public const val `VK_ATTN`: `VIRTUAL_KEY` = 246u;
public const val `VK_B`: `VIRTUAL_KEY` = 66u;
public const val `VK_BACK`: `VIRTUAL_KEY` = 8u;
public const val `VK_BROWSER_BACK`: `VIRTUAL_KEY` = 166u;
public const val `VK_BROWSER_FAVORITES`: `VIRTUAL_KEY` = 171u;
public const val `VK_BROWSER_FORWARD`: `VIRTUAL_KEY` = 167u;
public const val `VK_BROWSER_HOME`: `VIRTUAL_KEY` = 172u;
public const val `VK_BROWSER_REFRESH`: `VIRTUAL_KEY` = 168u;
public const val `VK_BROWSER_SEARCH`: `VIRTUAL_KEY` = 170u;
public const val `VK_BROWSER_STOP`: `VIRTUAL_KEY` = 169u;
public const val `VK_C`: `VIRTUAL_KEY` = 67u;
public const val `VK_CANCEL`: `VIRTUAL_KEY` = 3u;
public const val `VK_CAPITAL`: `VIRTUAL_KEY` = 20u;
public const val `VK_CLEAR`: `VIRTUAL_KEY` = 12u;
public const val `VK_CONTROL`: `VIRTUAL_KEY` = 17u;
public const val `VK_CONVERT`: `VIRTUAL_KEY` = 28u;
public const val `VK_CRSEL`: `VIRTUAL_KEY` = 247u;
public const val `VK_D`: `VIRTUAL_KEY` = 68u;
public const val `VK_DBE_ALPHANUMERIC`: `VIRTUAL_KEY` = 240u;
public const val `VK_DBE_CODEINPUT`: `VIRTUAL_KEY` = 250u;
public const val `VK_DBE_DBCSCHAR`: `VIRTUAL_KEY` = 244u;
public const val `VK_DBE_DETERMINESTRING`: `VIRTUAL_KEY` = 252u;
public const val `VK_DBE_ENTERDLGCONVERSIONMODE`: `VIRTUAL_KEY` = 253u;
public const val `VK_DBE_ENTERIMECONFIGMODE`: `VIRTUAL_KEY` = 248u;
public const val `VK_DBE_ENTERWORDREGISTERMODE`: `VIRTUAL_KEY` = 247u;
public const val `VK_DBE_FLUSHSTRING`: `VIRTUAL_KEY` = 249u;
public const val `VK_DBE_HIRAGANA`: `VIRTUAL_KEY` = 242u;
public const val `VK_DBE_KATAKANA`: `VIRTUAL_KEY` = 241u;
public const val `VK_DBE_NOCODEINPUT`: `VIRTUAL_KEY` = 251u;
public const val `VK_DBE_NOROMAN`: `VIRTUAL_KEY` = 246u;
public const val `VK_DBE_ROMAN`: `VIRTUAL_KEY` = 245u;
public const val `VK_DBE_SBCSCHAR`: `VIRTUAL_KEY` = 243u;
public const val `VK_DECIMAL`: `VIRTUAL_KEY` = 110u;
public const val `VK_DELETE`: `VIRTUAL_KEY` = 46u;
public const val `VK_DIVIDE`: `VIRTUAL_KEY` = 111u;
public const val `VK_DOWN`: `VIRTUAL_KEY` = 40u;
public const val `VK_E`: `VIRTUAL_KEY` = 69u;
public const val `VK_END`: `VIRTUAL_KEY` = 35u;
public const val `VK_EREOF`: `VIRTUAL_KEY` = 249u;
public const val `VK_ESCAPE`: `VIRTUAL_KEY` = 27u;
public const val `VK_EXECUTE`: `VIRTUAL_KEY` = 43u;
public const val `VK_EXSEL`: `VIRTUAL_KEY` = 248u;
// UNSUPPORTED Rust 505:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VK_F {
//     pub Vk: u8,
//     pub NLSFEProcType: u8,
//     pub NLSFEProcCurrent: u8,
//     pub NLSFEProcSwitch: u8,
//     pub NLSFEProc: [VK_FPARAM; 8],
//     pub NLSFEProcAlt: [VK_FPARAM; 8],
// }

// UNSUPPORTED Rust 515:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VK_F {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `VK_F`: `VIRTUAL_KEY` = 70u;
public const val `VK_F1`: `VIRTUAL_KEY` = 112u;
public const val `VK_F10`: `VIRTUAL_KEY` = 121u;
public const val `VK_F11`: `VIRTUAL_KEY` = 122u;
public const val `VK_F12`: `VIRTUAL_KEY` = 123u;
public const val `VK_F13`: `VIRTUAL_KEY` = 124u;
public const val `VK_F14`: `VIRTUAL_KEY` = 125u;
public const val `VK_F15`: `VIRTUAL_KEY` = 126u;
public const val `VK_F16`: `VIRTUAL_KEY` = 127u;
public const val `VK_F17`: `VIRTUAL_KEY` = 128u;
public const val `VK_F18`: `VIRTUAL_KEY` = 129u;
public const val `VK_F19`: `VIRTUAL_KEY` = 130u;
public const val `VK_F2`: `VIRTUAL_KEY` = 113u;
public const val `VK_F20`: `VIRTUAL_KEY` = 131u;
public const val `VK_F21`: `VIRTUAL_KEY` = 132u;
public const val `VK_F22`: `VIRTUAL_KEY` = 133u;
public const val `VK_F23`: `VIRTUAL_KEY` = 134u;
public const val `VK_F24`: `VIRTUAL_KEY` = 135u;
public const val `VK_F3`: `VIRTUAL_KEY` = 114u;
public const val `VK_F4`: `VIRTUAL_KEY` = 115u;
public const val `VK_F5`: `VIRTUAL_KEY` = 116u;
public const val `VK_F6`: `VIRTUAL_KEY` = 117u;
public const val `VK_F7`: `VIRTUAL_KEY` = 118u;
public const val `VK_F8`: `VIRTUAL_KEY` = 119u;
public const val `VK_F9`: `VIRTUAL_KEY` = 120u;
public const val `VK_FINAL`: `VIRTUAL_KEY` = 24u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VK_FPARAM` (
    public var `NLSFEProcIndex`: UByte,
    public var `NLSFEProcParam`: UInt,
)
public const val `VK_G`: `VIRTUAL_KEY` = 71u;
public const val `VK_GAMEPAD_A`: `VIRTUAL_KEY` = 195u;
public const val `VK_GAMEPAD_B`: `VIRTUAL_KEY` = 196u;
public const val `VK_GAMEPAD_DPAD_DOWN`: `VIRTUAL_KEY` = 204u;
public const val `VK_GAMEPAD_DPAD_LEFT`: `VIRTUAL_KEY` = 205u;
public const val `VK_GAMEPAD_DPAD_RIGHT`: `VIRTUAL_KEY` = 206u;
public const val `VK_GAMEPAD_DPAD_UP`: `VIRTUAL_KEY` = 203u;
public const val `VK_GAMEPAD_LEFT_SHOULDER`: `VIRTUAL_KEY` = 200u;
public const val `VK_GAMEPAD_LEFT_THUMBSTICK_BUTTON`: `VIRTUAL_KEY` = 209u;
public const val `VK_GAMEPAD_LEFT_THUMBSTICK_DOWN`: `VIRTUAL_KEY` = 212u;
public const val `VK_GAMEPAD_LEFT_THUMBSTICK_LEFT`: `VIRTUAL_KEY` = 214u;
public const val `VK_GAMEPAD_LEFT_THUMBSTICK_RIGHT`: `VIRTUAL_KEY` = 213u;
public const val `VK_GAMEPAD_LEFT_THUMBSTICK_UP`: `VIRTUAL_KEY` = 211u;
public const val `VK_GAMEPAD_LEFT_TRIGGER`: `VIRTUAL_KEY` = 201u;
public const val `VK_GAMEPAD_MENU`: `VIRTUAL_KEY` = 207u;
public const val `VK_GAMEPAD_RIGHT_SHOULDER`: `VIRTUAL_KEY` = 199u;
public const val `VK_GAMEPAD_RIGHT_THUMBSTICK_BUTTON`: `VIRTUAL_KEY` = 210u;
public const val `VK_GAMEPAD_RIGHT_THUMBSTICK_DOWN`: `VIRTUAL_KEY` = 216u;
public const val `VK_GAMEPAD_RIGHT_THUMBSTICK_LEFT`: `VIRTUAL_KEY` = 218u;
public const val `VK_GAMEPAD_RIGHT_THUMBSTICK_RIGHT`: `VIRTUAL_KEY` = 217u;
public const val `VK_GAMEPAD_RIGHT_THUMBSTICK_UP`: `VIRTUAL_KEY` = 215u;
public const val `VK_GAMEPAD_RIGHT_TRIGGER`: `VIRTUAL_KEY` = 202u;
public const val `VK_GAMEPAD_VIEW`: `VIRTUAL_KEY` = 208u;
public const val `VK_GAMEPAD_X`: `VIRTUAL_KEY` = 197u;
public const val `VK_GAMEPAD_Y`: `VIRTUAL_KEY` = 198u;
public const val `VK_H`: `VIRTUAL_KEY` = 72u;
public const val `VK_HANGEUL`: `VIRTUAL_KEY` = 21u;
public const val `VK_HANGUL`: `VIRTUAL_KEY` = 21u;
public const val `VK_HANJA`: `VIRTUAL_KEY` = 25u;
public const val `VK_HELP`: `VIRTUAL_KEY` = 47u;
public const val `VK_HOME`: `VIRTUAL_KEY` = 36u;
public const val `VK_I`: `VIRTUAL_KEY` = 73u;
public const val `VK_ICO_00`: `VIRTUAL_KEY` = 228u;
public const val `VK_ICO_CLEAR`: `VIRTUAL_KEY` = 230u;
public const val `VK_ICO_HELP`: `VIRTUAL_KEY` = 227u;
public const val `VK_IME_OFF`: `VIRTUAL_KEY` = 26u;
public const val `VK_IME_ON`: `VIRTUAL_KEY` = 22u;
public const val `VK_INSERT`: `VIRTUAL_KEY` = 45u;
public const val `VK_J`: `VIRTUAL_KEY` = 74u;
public const val `VK_JUNJA`: `VIRTUAL_KEY` = 23u;
public const val `VK_K`: `VIRTUAL_KEY` = 75u;
public const val `VK_KANA`: `VIRTUAL_KEY` = 21u;
public const val `VK_KANJI`: `VIRTUAL_KEY` = 25u;
public const val `VK_L`: `VIRTUAL_KEY` = 76u;
public const val `VK_LAUNCH_APP1`: `VIRTUAL_KEY` = 182u;
public const val `VK_LAUNCH_APP2`: `VIRTUAL_KEY` = 183u;
public const val `VK_LAUNCH_MAIL`: `VIRTUAL_KEY` = 180u;
public const val `VK_LAUNCH_MEDIA_SELECT`: `VIRTUAL_KEY` = 181u;
public const val `VK_LBUTTON`: `VIRTUAL_KEY` = 1u;
public const val `VK_LCONTROL`: `VIRTUAL_KEY` = 162u;
public const val `VK_LEFT`: `VIRTUAL_KEY` = 37u;
public const val `VK_LMENU`: `VIRTUAL_KEY` = 164u;
public const val `VK_LSHIFT`: `VIRTUAL_KEY` = 160u;
public const val `VK_LWIN`: `VIRTUAL_KEY` = 91u;
public const val `VK_M`: `VIRTUAL_KEY` = 77u;
public const val `VK_MBUTTON`: `VIRTUAL_KEY` = 4u;
public const val `VK_MEDIA_NEXT_TRACK`: `VIRTUAL_KEY` = 176u;
public const val `VK_MEDIA_PLAY_PAUSE`: `VIRTUAL_KEY` = 179u;
public const val `VK_MEDIA_PREV_TRACK`: `VIRTUAL_KEY` = 177u;
public const val `VK_MEDIA_STOP`: `VIRTUAL_KEY` = 178u;
public const val `VK_MENU`: `VIRTUAL_KEY` = 18u;
public const val `VK_MODECHANGE`: `VIRTUAL_KEY` = 31u;
public const val `VK_MULTIPLY`: `VIRTUAL_KEY` = 106u;
public const val `VK_N`: `VIRTUAL_KEY` = 78u;
public const val `VK_NAVIGATION_ACCEPT`: `VIRTUAL_KEY` = 142u;
public const val `VK_NAVIGATION_CANCEL`: `VIRTUAL_KEY` = 143u;
public const val `VK_NAVIGATION_DOWN`: `VIRTUAL_KEY` = 139u;
public const val `VK_NAVIGATION_LEFT`: `VIRTUAL_KEY` = 140u;
public const val `VK_NAVIGATION_MENU`: `VIRTUAL_KEY` = 137u;
public const val `VK_NAVIGATION_RIGHT`: `VIRTUAL_KEY` = 141u;
public const val `VK_NAVIGATION_UP`: `VIRTUAL_KEY` = 138u;
public const val `VK_NAVIGATION_VIEW`: `VIRTUAL_KEY` = 136u;
public const val `VK_NEXT`: `VIRTUAL_KEY` = 34u;
public const val `VK_NONAME`: `VIRTUAL_KEY` = 252u;
public const val `VK_NONCONVERT`: `VIRTUAL_KEY` = 29u;
public const val `VK_NUMLOCK`: `VIRTUAL_KEY` = 144u;
public const val `VK_NUMPAD0`: `VIRTUAL_KEY` = 96u;
public const val `VK_NUMPAD1`: `VIRTUAL_KEY` = 97u;
public const val `VK_NUMPAD2`: `VIRTUAL_KEY` = 98u;
public const val `VK_NUMPAD3`: `VIRTUAL_KEY` = 99u;
public const val `VK_NUMPAD4`: `VIRTUAL_KEY` = 100u;
public const val `VK_NUMPAD5`: `VIRTUAL_KEY` = 101u;
public const val `VK_NUMPAD6`: `VIRTUAL_KEY` = 102u;
public const val `VK_NUMPAD7`: `VIRTUAL_KEY` = 103u;
public const val `VK_NUMPAD8`: `VIRTUAL_KEY` = 104u;
public const val `VK_NUMPAD9`: `VIRTUAL_KEY` = 105u;
public const val `VK_O`: `VIRTUAL_KEY` = 79u;
public const val `VK_OEM_1`: `VIRTUAL_KEY` = 186u;
public const val `VK_OEM_102`: `VIRTUAL_KEY` = 226u;
public const val `VK_OEM_2`: `VIRTUAL_KEY` = 191u;
public const val `VK_OEM_3`: `VIRTUAL_KEY` = 192u;
public const val `VK_OEM_4`: `VIRTUAL_KEY` = 219u;
public const val `VK_OEM_5`: `VIRTUAL_KEY` = 220u;
public const val `VK_OEM_6`: `VIRTUAL_KEY` = 221u;
public const val `VK_OEM_7`: `VIRTUAL_KEY` = 222u;
public const val `VK_OEM_8`: `VIRTUAL_KEY` = 223u;
public const val `VK_OEM_ATTN`: `VIRTUAL_KEY` = 240u;
public const val `VK_OEM_AUTO`: `VIRTUAL_KEY` = 243u;
public const val `VK_OEM_AX`: `VIRTUAL_KEY` = 225u;
public const val `VK_OEM_BACKTAB`: `VIRTUAL_KEY` = 245u;
public const val `VK_OEM_CLEAR`: `VIRTUAL_KEY` = 254u;
public const val `VK_OEM_COMMA`: `VIRTUAL_KEY` = 188u;
public const val `VK_OEM_COPY`: `VIRTUAL_KEY` = 242u;
public const val `VK_OEM_CUSEL`: `VIRTUAL_KEY` = 239u;
public const val `VK_OEM_ENLW`: `VIRTUAL_KEY` = 244u;
public const val `VK_OEM_FINISH`: `VIRTUAL_KEY` = 241u;
public const val `VK_OEM_FJ_JISHO`: `VIRTUAL_KEY` = 146u;
public const val `VK_OEM_FJ_LOYA`: `VIRTUAL_KEY` = 149u;
public const val `VK_OEM_FJ_MASSHOU`: `VIRTUAL_KEY` = 147u;
public const val `VK_OEM_FJ_ROYA`: `VIRTUAL_KEY` = 150u;
public const val `VK_OEM_FJ_TOUROKU`: `VIRTUAL_KEY` = 148u;
public const val `VK_OEM_JUMP`: `VIRTUAL_KEY` = 234u;
public const val `VK_OEM_MINUS`: `VIRTUAL_KEY` = 189u;
public const val `VK_OEM_NEC_EQUAL`: `VIRTUAL_KEY` = 146u;
public const val `VK_OEM_PA1`: `VIRTUAL_KEY` = 235u;
public const val `VK_OEM_PA2`: `VIRTUAL_KEY` = 236u;
public const val `VK_OEM_PA3`: `VIRTUAL_KEY` = 237u;
public const val `VK_OEM_PERIOD`: `VIRTUAL_KEY` = 190u;
public const val `VK_OEM_PLUS`: `VIRTUAL_KEY` = 187u;
public const val `VK_OEM_RESET`: `VIRTUAL_KEY` = 233u;
public const val `VK_OEM_WSCTRL`: `VIRTUAL_KEY` = 238u;
public const val `VK_P`: `VIRTUAL_KEY` = 80u;
public const val `VK_PA1`: `VIRTUAL_KEY` = 253u;
public const val `VK_PACKET`: `VIRTUAL_KEY` = 231u;
public const val `VK_PAUSE`: `VIRTUAL_KEY` = 19u;
public const val `VK_PLAY`: `VIRTUAL_KEY` = 250u;
public const val `VK_PRINT`: `VIRTUAL_KEY` = 42u;
public const val `VK_PRIOR`: `VIRTUAL_KEY` = 33u;
public const val `VK_PROCESSKEY`: `VIRTUAL_KEY` = 229u;
public const val `VK_Q`: `VIRTUAL_KEY` = 81u;
public const val `VK_R`: `VIRTUAL_KEY` = 82u;
public const val `VK_RBUTTON`: `VIRTUAL_KEY` = 2u;
public const val `VK_RCONTROL`: `VIRTUAL_KEY` = 163u;
public const val `VK_RETURN`: `VIRTUAL_KEY` = 13u;
public const val `VK_RIGHT`: `VIRTUAL_KEY` = 39u;
public const val `VK_RMENU`: `VIRTUAL_KEY` = 165u;
public const val `VK_RSHIFT`: `VIRTUAL_KEY` = 161u;
public const val `VK_RWIN`: `VIRTUAL_KEY` = 92u;
public const val `VK_S`: `VIRTUAL_KEY` = 83u;
public const val `VK_SCROLL`: `VIRTUAL_KEY` = 145u;
public const val `VK_SELECT`: `VIRTUAL_KEY` = 41u;
public const val `VK_SEPARATOR`: `VIRTUAL_KEY` = 108u;
public const val `VK_SHIFT`: `VIRTUAL_KEY` = 16u;
public const val `VK_SLEEP`: `VIRTUAL_KEY` = 95u;
public const val `VK_SNAPSHOT`: `VIRTUAL_KEY` = 44u;
public const val `VK_SPACE`: `VIRTUAL_KEY` = 32u;
public const val `VK_SUBTRACT`: `VIRTUAL_KEY` = 109u;
public const val `VK_T`: `VIRTUAL_KEY` = 84u;
public const val `VK_TAB`: `VIRTUAL_KEY` = 9u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VK_TO_BIT` (
    public var `Vk`: UByte,
    public var `ModBits`: UByte,
)
// UNSUPPORTED Rust 707:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VK_TO_WCHARS1 {
//     pub VirtualKey: u8,
//     pub Attributes: u8,
//     pub wch: [u16; 1],
// }

// UNSUPPORTED Rust 714:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VK_TO_WCHARS1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 719:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VK_TO_WCHARS10 {
//     pub VirtualKey: u8,
//     pub Attributes: u8,
//     pub wch: [u16; 10],
// }

// UNSUPPORTED Rust 726:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VK_TO_WCHARS10 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 731:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VK_TO_WCHARS2 {
//     pub VirtualKey: u8,
//     pub Attributes: u8,
//     pub wch: [u16; 2],
// }

// UNSUPPORTED Rust 738:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VK_TO_WCHARS2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 743:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VK_TO_WCHARS3 {
//     pub VirtualKey: u8,
//     pub Attributes: u8,
//     pub wch: [u16; 3],
// }

// UNSUPPORTED Rust 750:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VK_TO_WCHARS3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 755:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VK_TO_WCHARS4 {
//     pub VirtualKey: u8,
//     pub Attributes: u8,
//     pub wch: [u16; 4],
// }

// UNSUPPORTED Rust 762:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VK_TO_WCHARS4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 767:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VK_TO_WCHARS5 {
//     pub VirtualKey: u8,
//     pub Attributes: u8,
//     pub wch: [u16; 5],
// }

// UNSUPPORTED Rust 774:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VK_TO_WCHARS5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 779:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VK_TO_WCHARS6 {
//     pub VirtualKey: u8,
//     pub Attributes: u8,
//     pub wch: [u16; 6],
// }

// UNSUPPORTED Rust 786:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VK_TO_WCHARS6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 791:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VK_TO_WCHARS7 {
//     pub VirtualKey: u8,
//     pub Attributes: u8,
//     pub wch: [u16; 7],
// }

// UNSUPPORTED Rust 798:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VK_TO_WCHARS7 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 803:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VK_TO_WCHARS8 {
//     pub VirtualKey: u8,
//     pub Attributes: u8,
//     pub wch: [u16; 8],
// }

// UNSUPPORTED Rust 810:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VK_TO_WCHARS8 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 815:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VK_TO_WCHARS9 {
//     pub VirtualKey: u8,
//     pub Attributes: u8,
//     pub wch: [u16; 9],
// }

// UNSUPPORTED Rust 822:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VK_TO_WCHARS9 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VK_TO_WCHAR_TABLE` (
    public var `pVkToWchars`: /* Rust *mut */ kotlinx.cinterop.CPointer<`VK_TO_WCHARS1`>?,
    public var `nModifications`: UByte,
    public var `cbSize`: UByte,
)
// UNSUPPORTED Rust 834:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VK_TO_WCHAR_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `VK_U`: `VIRTUAL_KEY` = 85u;
public const val `VK_UP`: `VIRTUAL_KEY` = 38u;
public const val `VK_V`: `VIRTUAL_KEY` = 86u;
public const val `VK_VOLUME_DOWN`: `VIRTUAL_KEY` = 174u;
public const val `VK_VOLUME_MUTE`: `VIRTUAL_KEY` = 173u;
public const val `VK_VOLUME_UP`: `VIRTUAL_KEY` = 175u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VK_VSC` (
    public var `Vk`: UByte,
    public var `Vsc`: UByte,
)
public const val `VK_W`: `VIRTUAL_KEY` = 87u;
public const val `VK_X`: `VIRTUAL_KEY` = 88u;
public const val `VK_XBUTTON1`: `VIRTUAL_KEY` = 5u;
public const val `VK_XBUTTON2`: `VIRTUAL_KEY` = 6u;
public const val `VK_Y`: `VIRTUAL_KEY` = 89u;
public const val `VK_Z`: `VIRTUAL_KEY` = 90u;
public const val `VK_ZOOM`: `VIRTUAL_KEY` = 251u;
public const val `VK__none_`: `VIRTUAL_KEY` = 255u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VSC_LPWSTR` (
    public var `vsc`: UByte,
    public var `pwsz`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 865:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VSC_LPWSTR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VSC_VK` (
    public var `Vsc`: UByte,
    public var `Vk`: UShort,
)
public const val `WCH_DEAD`: UInt = 61441u;
public const val `WCH_LGTR`: UInt = 61442u;
public const val `WCH_NONE`: UInt = 61440u;
// UNSUPPORTED Rust 879:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const wszACUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("\u{301}");

// UNSUPPORTED Rust 880:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const wszBREVE: windows_sys::core::PCWSTR = windows_sys::core::w!("\u{306}");

// UNSUPPORTED Rust 881:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const wszCEDILLA: windows_sys::core::PCWSTR = windows_sys::core::w!("\u{327}");

// UNSUPPORTED Rust 882:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const wszCIRCUMFLEX: windows_sys::core::PCWSTR = windows_sys::core::w!("\u{302}");

// UNSUPPORTED Rust 883:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const wszDIARESIS_TONOS: windows_sys::core::PCWSTR = windows_sys::core::w!("\u{385}");

// UNSUPPORTED Rust 884:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const wszDOT_ABOVE: windows_sys::core::PCWSTR = windows_sys::core::w!("\u{307}");

// UNSUPPORTED Rust 885:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const wszDOUBLE_ACUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("\u{30b}");

// UNSUPPORTED Rust 886:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const wszGRAVE: windows_sys::core::PCWSTR = windows_sys::core::w!("\u{300}");

// UNSUPPORTED Rust 887:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const wszHACEK: windows_sys::core::PCWSTR = windows_sys::core::w!("\u{30c}");

// UNSUPPORTED Rust 888:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const wszHOOK_ABOVE: windows_sys::core::PCWSTR = windows_sys::core::w!("\u{309}");

// UNSUPPORTED Rust 889:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const wszMACRON: windows_sys::core::PCWSTR = windows_sys::core::w!("\u{304}");

// UNSUPPORTED Rust 890:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const wszOGONEK: windows_sys::core::PCWSTR = windows_sys::core::w!("\u{328}");

// UNSUPPORTED Rust 891:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const wszOVERSCORE: windows_sys::core::PCWSTR = windows_sys::core::w!("\u{305}");

// UNSUPPORTED Rust 892:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const wszRING: windows_sys::core::PCWSTR = windows_sys::core::w!("\u{30a}");

// UNSUPPORTED Rust 893:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const wszTILDE: windows_sys::core::PCWSTR = windows_sys::core::w!("\u{303}");

// UNSUPPORTED Rust 894:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const wszTONOS: windows_sys::core::PCWSTR = windows_sys::core::w!("\u{384}");

// UNSUPPORTED Rust 895:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const wszUMLAUT: windows_sys::core::PCWSTR = windows_sys::core::w!("\u{308}");

