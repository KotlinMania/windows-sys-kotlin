// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=AdjustWindowRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AdjustWindowRect`(`lprect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `dwstyle` : `WINDOW_STYLE`, `bmenu` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=AdjustWindowRectEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AdjustWindowRectEx`(`lprect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `dwstyle` : `WINDOW_STYLE`, `bmenu` : `windows_sys`.`core`.`BOOL`, `dwexstyle` : `WINDOW_EX_STYLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=AllowSetForegroundWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AllowSetForegroundWindow`(`dwprocessid` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=AnimateWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AnimateWindow`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `dwtime` : UInt, `dwflags` : `ANIMATE_WINDOW_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=AnyPopup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AnyPopup`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=AppendMenuA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppendMenuA`(`hmenu` : `HMENU`, `uflags` : `MENU_ITEM_FLAGS`, `uidnewitem` : ULong, `lpnewitem` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=AppendMenuW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppendMenuW`(`hmenu` : `HMENU`, `uflags` : `MENU_ITEM_FLAGS`, `uidnewitem` : ULong, `lpnewitem` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ArrangeIconicWindows; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ArrangeIconicWindows`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=BeginDeferWindowPos; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BeginDeferWindowPos`(`nnumwindows` : Int) : `HDWP`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=BringWindowToTop; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BringWindowToTop`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CalculatePopupWindowPosition; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CalculatePopupWindowPosition`(`anchorpoint` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?, `windowsize` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SIZE`>?, `flags` : UInt, `excluderect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `popupwindowposition` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CallMsgFilterA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CallMsgFilterA`(`lpmsg` : /* Rust *const */ kotlinx.cinterop.CPointer<`MSG`>?, `ncode` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CallMsgFilterW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CallMsgFilterW`(`lpmsg` : /* Rust *const */ kotlinx.cinterop.CPointer<`MSG`>?, `ncode` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CallNextHookEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CallNextHookEx`(`hhk` : `HHOOK`, `ncode` : Int, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CallWindowProcA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CallWindowProcA`(`lpprevwndfunc` : `WNDPROC`, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `msg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CallWindowProcW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CallWindowProcW`(`lpprevwndfunc` : `WNDPROC`, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `msg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CancelShutdown; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CancelShutdown`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CascadeWindows; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CascadeWindows`(`hwndparent` : `super`.`super`.`Foundation`.`HWND`, `whow` : `CASCADE_WINDOWS_HOW`, `lprect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `ckids` : UInt, `lpkids` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HWND`>?) : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ChangeMenuA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ChangeMenuA`(`hmenu` : `HMENU`, `cmd` : UInt, `lpsznewitem` : `windows_sys`.`core`.`PCSTR`, `cmdinsert` : UInt, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ChangeMenuW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ChangeMenuW`(`hmenu` : `HMENU`, `cmd` : UInt, `lpsznewitem` : `windows_sys`.`core`.`PCWSTR`, `cmdinsert` : UInt, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ChangeWindowMessageFilter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ChangeWindowMessageFilter`(`message` : UInt, `dwflag` : `CHANGE_WINDOW_MESSAGE_FILTER_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ChangeWindowMessageFilterEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ChangeWindowMessageFilterEx`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `message` : UInt, `action` : `WINDOW_MESSAGE_FILTER_ACTION`, `pchangefilterstruct` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CHANGEFILTERSTRUCT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CharLowerA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CharLowerA`(`lpsz` : `windows_sys`.`core`.`PSTR`) : `windows_sys`.`core`.`PSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CharLowerBuffA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CharLowerBuffA`(`lpsz` : `windows_sys`.`core`.`PSTR`, `cchlength` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CharLowerBuffW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CharLowerBuffW`(`lpsz` : `windows_sys`.`core`.`PWSTR`, `cchlength` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CharLowerW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CharLowerW`(`lpsz` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`PWSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CharNextA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CharNextA`(`lpsz` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`PSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CharNextExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CharNextExA`(`codepage` : UShort, `lpcurrentchar` : `windows_sys`.`core`.`PCSTR`, `dwflags` : UInt) : `windows_sys`.`core`.`PSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CharNextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CharNextW`(`lpsz` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`PWSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CharPrevA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CharPrevA`(`lpszstart` : `windows_sys`.`core`.`PCSTR`, `lpszcurrent` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`PSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CharPrevExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CharPrevExA`(`codepage` : UShort, `lpstart` : `windows_sys`.`core`.`PCSTR`, `lpcurrentchar` : `windows_sys`.`core`.`PCSTR`, `dwflags` : UInt) : `windows_sys`.`core`.`PSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CharPrevW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CharPrevW`(`lpszstart` : `windows_sys`.`core`.`PCWSTR`, `lpszcurrent` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`PWSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CharToOemA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CharToOemA`(`psrc` : `windows_sys`.`core`.`PCSTR`, `pdst` : `windows_sys`.`core`.`PSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CharToOemBuffA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CharToOemBuffA`(`lpszsrc` : `windows_sys`.`core`.`PCSTR`, `lpszdst` : `windows_sys`.`core`.`PSTR`, `cchdstlength` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CharToOemBuffW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CharToOemBuffW`(`lpszsrc` : `windows_sys`.`core`.`PCWSTR`, `lpszdst` : `windows_sys`.`core`.`PSTR`, `cchdstlength` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CharToOemW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CharToOemW`(`psrc` : `windows_sys`.`core`.`PCWSTR`, `pdst` : `windows_sys`.`core`.`PSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CharUpperA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CharUpperA`(`lpsz` : `windows_sys`.`core`.`PSTR`) : `windows_sys`.`core`.`PSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CharUpperBuffA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CharUpperBuffA`(`lpsz` : `windows_sys`.`core`.`PSTR`, `cchlength` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CharUpperBuffW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CharUpperBuffW`(`lpsz` : `windows_sys`.`core`.`PWSTR`, `cchlength` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CharUpperW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CharUpperW`(`lpsz` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`PWSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CheckMenuItem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CheckMenuItem`(`hmenu` : `HMENU`, `uidcheckitem` : UInt, `ucheck` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CheckMenuRadioItem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CheckMenuRadioItem`(`hmenu` : `HMENU`, `first` : UInt, `last` : UInt, `check` : UInt, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ChildWindowFromPoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ChildWindowFromPoint`(`hwndparent` : `super`.`super`.`Foundation`.`HWND`, `point` : `super`.`super`.`Foundation`.`POINT`) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ChildWindowFromPointEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ChildWindowFromPointEx`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pt` : `super`.`super`.`Foundation`.`POINT`, `flags` : `CWP_FLAGS`) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ClipCursor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ClipCursor`(`lprect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CloseWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CloseWindow`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CopyAcceleratorTableA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CopyAcceleratorTableA`(`haccelsrc` : `HACCEL`, `lpacceldst` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ACCEL`>?, `caccelentries` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CopyAcceleratorTableW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CopyAcceleratorTableW`(`haccelsrc` : `HACCEL`, `lpacceldst` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ACCEL`>?, `caccelentries` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CopyIcon; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CopyIcon`(`hicon` : `HICON`) : `HICON`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CopyImage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CopyImage`(`h` : `super`.`super`.`Foundation`.`HANDLE`, `type` : `GDI_IMAGE_TYPE`, `cx` : Int, `cy` : Int, `flags` : `IMAGE_FLAGS`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CreateAcceleratorTableA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateAcceleratorTableA`(`paccel` : /* Rust *const */ kotlinx.cinterop.CPointer<`ACCEL`>?, `caccel` : Int) : `HACCEL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CreateAcceleratorTableW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateAcceleratorTableW`(`paccel` : /* Rust *const */ kotlinx.cinterop.CPointer<`ACCEL`>?, `caccel` : Int) : `HACCEL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CreateCaret; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `CreateCaret`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hbitmap` : `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`, `nwidth` : Int, `nheight` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CreateCursor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateCursor`(`hinst` : `super`.`super`.`Foundation`.`HINSTANCE`, `xhotspot` : Int, `yhotspot` : Int, `nwidth` : Int, `nheight` : Int, `pvandplane` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pvxorplane` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `HCURSOR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CreateDialogIndirectParamA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateDialogIndirectParamA`(`hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lptemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`DLGTEMPLATE`>?, `hwndparent` : `super`.`super`.`Foundation`.`HWND`, `lpdialogfunc` : `DLGPROC`, `dwinitparam` : `super`.`super`.`Foundation`.`LPARAM`) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CreateDialogIndirectParamW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateDialogIndirectParamW`(`hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lptemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`DLGTEMPLATE`>?, `hwndparent` : `super`.`super`.`Foundation`.`HWND`, `lpdialogfunc` : `DLGPROC`, `dwinitparam` : `super`.`super`.`Foundation`.`LPARAM`) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CreateDialogParamA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateDialogParamA`(`hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lptemplatename` : `windows_sys`.`core`.`PCSTR`, `hwndparent` : `super`.`super`.`Foundation`.`HWND`, `lpdialogfunc` : `DLGPROC`, `dwinitparam` : `super`.`super`.`Foundation`.`LPARAM`) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CreateDialogParamW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateDialogParamW`(`hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lptemplatename` : `windows_sys`.`core`.`PCWSTR`, `hwndparent` : `super`.`super`.`Foundation`.`HWND`, `lpdialogfunc` : `DLGPROC`, `dwinitparam` : `super`.`super`.`Foundation`.`LPARAM`) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CreateIcon; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateIcon`(`hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `nwidth` : Int, `nheight` : Int, `cplanes` : UByte, `cbitspixel` : UByte, `lpbandbits` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `lpbxorbits` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `HICON`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CreateIconFromResource; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateIconFromResource`(`presbits` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwressize` : UInt, `ficon` : `windows_sys`.`core`.`BOOL`, `dwver` : UInt) : `HICON`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CreateIconFromResourceEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateIconFromResourceEx`(`presbits` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwressize` : UInt, `ficon` : `windows_sys`.`core`.`BOOL`, `dwver` : UInt, `cxdesired` : Int, `cydesired` : Int, `flags` : `IMAGE_FLAGS`) : `HICON`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CreateIconIndirect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `CreateIconIndirect`(`piconinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`ICONINFO`>?) : `HICON`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CreateMDIWindowA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateMDIWindowA`(`lpclassname` : `windows_sys`.`core`.`PCSTR`, `lpwindowname` : `windows_sys`.`core`.`PCSTR`, `dwstyle` : `WINDOW_STYLE`, `x` : Int, `y` : Int, `nwidth` : Int, `nheight` : Int, `hwndparent` : `super`.`super`.`Foundation`.`HWND`, `hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CreateMDIWindowW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateMDIWindowW`(`lpclassname` : `windows_sys`.`core`.`PCWSTR`, `lpwindowname` : `windows_sys`.`core`.`PCWSTR`, `dwstyle` : `WINDOW_STYLE`, `x` : Int, `y` : Int, `nwidth` : Int, `nheight` : Int, `hwndparent` : `super`.`super`.`Foundation`.`HWND`, `hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CreateMenu; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateMenu`() : `HMENU`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CreatePopupMenu; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreatePopupMenu`() : `HMENU`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mrmsupport.dll, ABI=system, export=CreateResourceIndexer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateResourceIndexer`(`projectroot` : `windows_sys`.`core`.`PCWSTR`, `extensiondllpath` : `windows_sys`.`core`.`PCWSTR`, `ppresourceindexer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CreateWindowExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateWindowExA`(`dwexstyle` : `WINDOW_EX_STYLE`, `lpclassname` : `windows_sys`.`core`.`PCSTR`, `lpwindowname` : `windows_sys`.`core`.`PCSTR`, `dwstyle` : `WINDOW_STYLE`, `x` : Int, `y` : Int, `nwidth` : Int, `nheight` : Int, `hwndparent` : `super`.`super`.`Foundation`.`HWND`, `hmenu` : `HMENU`, `hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lpparam` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CreateWindowExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateWindowExW`(`dwexstyle` : `WINDOW_EX_STYLE`, `lpclassname` : `windows_sys`.`core`.`PCWSTR`, `lpwindowname` : `windows_sys`.`core`.`PCWSTR`, `dwstyle` : `WINDOW_STYLE`, `x` : Int, `y` : Int, `nwidth` : Int, `nheight` : Int, `hwndparent` : `super`.`super`.`Foundation`.`HWND`, `hmenu` : `HMENU`, `hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lpparam` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DefDlgProcA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DefDlgProcA`(`hdlg` : `super`.`super`.`Foundation`.`HWND`, `msg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DefDlgProcW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DefDlgProcW`(`hdlg` : `super`.`super`.`Foundation`.`HWND`, `msg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DefFrameProcA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DefFrameProcA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hwndmdiclient` : `super`.`super`.`Foundation`.`HWND`, `umsg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DefFrameProcW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DefFrameProcW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hwndmdiclient` : `super`.`super`.`Foundation`.`HWND`, `umsg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DefMDIChildProcA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DefMDIChildProcA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `umsg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DefMDIChildProcW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DefMDIChildProcW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `umsg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DefWindowProcA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DefWindowProcA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `msg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DefWindowProcW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DefWindowProcW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `msg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DeferWindowPos; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeferWindowPos`(`hwinposinfo` : `HDWP`, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `hwndinsertafter` : `super`.`super`.`Foundation`.`HWND`, `x` : Int, `y` : Int, `cx` : Int, `cy` : Int, `uflags` : `SET_WINDOW_POS_FLAGS`) : `HDWP`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DeleteMenu; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteMenu`(`hmenu` : `HMENU`, `uposition` : UInt, `uflags` : `MENU_ITEM_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DeregisterShellHookWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeregisterShellHookWindow`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DestroyAcceleratorTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DestroyAcceleratorTable`(`haccel` : `HACCEL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DestroyCaret; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DestroyCaret`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DestroyCursor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DestroyCursor`(`hcursor` : `HCURSOR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DestroyIcon; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DestroyIcon`(`hicon` : `HICON`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mrmsupport.dll, ABI=system, export=DestroyIndexedResults; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DestroyIndexedResults`(`resourceuri` : `windows_sys`.`core`.`PCWSTR`, `qualifiercount` : UInt, `qualifiers` : /* Rust *const */ kotlinx.cinterop.CPointer<`IndexedResourceQualifier`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DestroyMenu; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DestroyMenu`(`hmenu` : `HMENU`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mrmsupport.dll, ABI=system, export=DestroyResourceIndexer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DestroyResourceIndexer`(`resourceindexer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DestroyWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DestroyWindow`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DialogBoxIndirectParamA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DialogBoxIndirectParamA`(`hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `hdialogtemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`DLGTEMPLATE`>?, `hwndparent` : `super`.`super`.`Foundation`.`HWND`, `lpdialogfunc` : `DLGPROC`, `dwinitparam` : `super`.`super`.`Foundation`.`LPARAM`) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DialogBoxIndirectParamW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DialogBoxIndirectParamW`(`hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `hdialogtemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`DLGTEMPLATE`>?, `hwndparent` : `super`.`super`.`Foundation`.`HWND`, `lpdialogfunc` : `DLGPROC`, `dwinitparam` : `super`.`super`.`Foundation`.`LPARAM`) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DialogBoxParamA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DialogBoxParamA`(`hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lptemplatename` : `windows_sys`.`core`.`PCSTR`, `hwndparent` : `super`.`super`.`Foundation`.`HWND`, `lpdialogfunc` : `DLGPROC`, `dwinitparam` : `super`.`super`.`Foundation`.`LPARAM`) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DialogBoxParamW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DialogBoxParamW`(`hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lptemplatename` : `windows_sys`.`core`.`PCWSTR`, `hwndparent` : `super`.`super`.`Foundation`.`HWND`, `lpdialogfunc` : `DLGPROC`, `dwinitparam` : `super`.`super`.`Foundation`.`LPARAM`) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DisableProcessWindowsGhosting; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DisableProcessWindowsGhosting`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DispatchMessageA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DispatchMessageA`(`lpmsg` : /* Rust *const */ kotlinx.cinterop.CPointer<`MSG`>?) : `super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DispatchMessageW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DispatchMessageW`(`lpmsg` : /* Rust *const */ kotlinx.cinterop.CPointer<`MSG`>?) : `super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DragObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DragObject`(`hwndparent` : `super`.`super`.`Foundation`.`HWND`, `hwndfrom` : `super`.`super`.`Foundation`.`HWND`, `fmt` : UInt, `data` : ULong, `hcur` : `HCURSOR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DrawIcon; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DrawIcon`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `x` : Int, `y` : Int, `hicon` : `HICON`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DrawIconEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DrawIconEx`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `xleft` : Int, `ytop` : Int, `hicon` : `HICON`, `cxwidth` : Int, `cywidth` : Int, `istepifanicur` : UInt, `hbrflickerfreedraw` : `super`.`super`.`Graphics`.`Gdi`.`HBRUSH`, `diflags` : `DI_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DrawMenuBar; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrawMenuBar`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EnableMenuItem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnableMenuItem`(`hmenu` : `HMENU`, `uidenableitem` : UInt, `uenable` : `MENU_ITEM_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EndDeferWindowPos; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EndDeferWindowPos`(`hwinposinfo` : `HDWP`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EndDialog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EndDialog`(`hdlg` : `super`.`super`.`Foundation`.`HWND`, `nresult` : Long) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EndMenu; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EndMenu`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EnumChildWindows; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumChildWindows`(`hwndparent` : `super`.`super`.`Foundation`.`HWND`, `lpenumfunc` : `WNDENUMPROC`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EnumPropsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumPropsA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lpenumfunc` : `PROPENUMPROCA`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EnumPropsExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumPropsExA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lpenumfunc` : `PROPENUMPROCEXA`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EnumPropsExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumPropsExW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lpenumfunc` : `PROPENUMPROCEXW`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EnumPropsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumPropsW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lpenumfunc` : `PROPENUMPROCW`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EnumThreadWindows; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumThreadWindows`(`dwthreadid` : UInt, `lpfn` : `WNDENUMPROC`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EnumWindows; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumWindows`(`lpenumfunc` : `WNDENUMPROC`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=FindWindowA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindWindowA`(`lpclassname` : `windows_sys`.`core`.`PCSTR`, `lpwindowname` : `windows_sys`.`core`.`PCSTR`) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=FindWindowExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindWindowExA`(`hwndparent` : `super`.`super`.`Foundation`.`HWND`, `hwndchildafter` : `super`.`super`.`Foundation`.`HWND`, `lpszclass` : `windows_sys`.`core`.`PCSTR`, `lpszwindow` : `windows_sys`.`core`.`PCSTR`) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=FindWindowExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindWindowExW`(`hwndparent` : `super`.`super`.`Foundation`.`HWND`, `hwndchildafter` : `super`.`super`.`Foundation`.`HWND`, `lpszclass` : `windows_sys`.`core`.`PCWSTR`, `lpszwindow` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=FindWindowW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindWindowW`(`lpclassname` : `windows_sys`.`core`.`PCWSTR`, `lpwindowname` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=FlashWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FlashWindow`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `binvert` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=FlashWindowEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FlashWindowEx`(`pfwi` : /* Rust *const */ kotlinx.cinterop.CPointer<`FLASHWINFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetAltTabInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetAltTabInfoA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `iitem` : Int, `pati` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ALTTABINFO`>?, `pszitemtext` : `windows_sys`.`core`.`PSTR`, `cchitemtext` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetAltTabInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetAltTabInfoW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `iitem` : Int, `pati` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ALTTABINFO`>?, `pszitemtext` : `windows_sys`.`core`.`PWSTR`, `cchitemtext` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetAncestor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetAncestor`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `gaflags` : `GET_ANCESTOR_FLAGS`) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetCaretBlinkTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCaretBlinkTime`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetCaretPos; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCaretPos`(`lppoint` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetClassInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetClassInfoA`(`hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lpclassname` : `windows_sys`.`core`.`PCSTR`, `lpwndclass` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WNDCLASSA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetClassInfoExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetClassInfoExA`(`hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lpszclass` : `windows_sys`.`core`.`PCSTR`, `lpwcx` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WNDCLASSEXA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetClassInfoExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetClassInfoExW`(`hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lpszclass` : `windows_sys`.`core`.`PCWSTR`, `lpwcx` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WNDCLASSEXW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetClassInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetClassInfoW`(`hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lpclassname` : `windows_sys`.`core`.`PCWSTR`, `lpwndclass` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WNDCLASSW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetClassLongA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetClassLongA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `nindex` : `GET_CLASS_LONG_INDEX`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetClassLongPtrA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `GetClassLongPtrA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `nindex` : `GET_CLASS_LONG_INDEX`) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetClassLongPtrW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `GetClassLongPtrW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `nindex` : `GET_CLASS_LONG_INDEX`) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetClassLongW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetClassLongW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `nindex` : `GET_CLASS_LONG_INDEX`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetClassNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetClassNameA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lpclassname` : `windows_sys`.`core`.`PSTR`, `nmaxcount` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetClassNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetClassNameW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lpclassname` : `windows_sys`.`core`.`PWSTR`, `nmaxcount` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetClassWord; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetClassWord`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `nindex` : Int) : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetClientRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetClientRect`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lprect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetClipCursor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetClipCursor`(`lprect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetCursor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCursor`() : `HCURSOR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetCursorInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCursorInfo`(`pci` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CURSORINFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetCursorPos; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCursorPos`(`lppoint` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetDesktopWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDesktopWindow`() : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetDialogBaseUnits; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDialogBaseUnits`() : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetDlgCtrlID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDlgCtrlID`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetDlgItem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDlgItem`(`hdlg` : `super`.`super`.`Foundation`.`HWND`, `niddlgitem` : Int) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetDlgItemInt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDlgItemInt`(`hdlg` : `super`.`super`.`Foundation`.`HWND`, `niddlgitem` : Int, `lptranslated` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `bsigned` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetDlgItemTextA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDlgItemTextA`(`hdlg` : `super`.`super`.`Foundation`.`HWND`, `niddlgitem` : Int, `lpstring` : `windows_sys`.`core`.`PSTR`, `cchmax` : Int) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetDlgItemTextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDlgItemTextW`(`hdlg` : `super`.`super`.`Foundation`.`HWND`, `niddlgitem` : Int, `lpstring` : `windows_sys`.`core`.`PWSTR`, `cchmax` : Int) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetForegroundWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetForegroundWindow`() : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetGUIThreadInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetGUIThreadInfo`(`idthread` : UInt, `pgui` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GUITHREADINFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetIconInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetIconInfo`(`hicon` : `HICON`, `piconinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ICONINFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetIconInfoExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetIconInfoExA`(`hicon` : `HICON`, `piconinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ICONINFOEXA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetIconInfoExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetIconInfoExW`(`hicon` : `HICON`, `piconinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ICONINFOEXW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetInputState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetInputState`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetLastActivePopup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetLastActivePopup`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetLayeredWindowAttributes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetLayeredWindowAttributes`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pcrkey` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`COLORREF`>?, `pbalpha` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pdwflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LAYERED_WINDOW_ATTRIBUTES_FLAGS`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetMenu; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMenu`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `HMENU`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetMenuBarInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMenuBarInfo`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `idobject` : `OBJECT_IDENTIFIER`, `iditem` : Int, `pmbi` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MENUBARINFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetMenuCheckMarkDimensions; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMenuCheckMarkDimensions`() : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetMenuDefaultItem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMenuDefaultItem`(`hmenu` : `HMENU`, `fbypos` : UInt, `gmdiflags` : `GET_MENU_DEFAULT_ITEM_FLAGS`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetMenuInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetMenuInfo`(`param0` : `HMENU`, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MENUINFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetMenuItemCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMenuItemCount`(`hmenu` : `HMENU`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetMenuItemID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMenuItemID`(`hmenu` : `HMENU`, `npos` : Int) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetMenuItemInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetMenuItemInfoA`(`hmenu` : `HMENU`, `item` : UInt, `fbyposition` : `windows_sys`.`core`.`BOOL`, `lpmii` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MENUITEMINFOA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetMenuItemInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetMenuItemInfoW`(`hmenu` : `HMENU`, `item` : UInt, `fbyposition` : `windows_sys`.`core`.`BOOL`, `lpmii` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MENUITEMINFOW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetMenuItemRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMenuItemRect`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hmenu` : `HMENU`, `uitem` : UInt, `lprcitem` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetMenuState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMenuState`(`hmenu` : `HMENU`, `uid` : UInt, `uflags` : `MENU_ITEM_FLAGS`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetMenuStringA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMenuStringA`(`hmenu` : `HMENU`, `uiditem` : UInt, `lpstring` : `windows_sys`.`core`.`PSTR`, `cchmax` : Int, `flags` : `MENU_ITEM_FLAGS`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetMenuStringW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMenuStringW`(`hmenu` : `HMENU`, `uiditem` : UInt, `lpstring` : `windows_sys`.`core`.`PWSTR`, `cchmax` : Int, `flags` : `MENU_ITEM_FLAGS`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetMessageA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMessageA`(`lpmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MSG`>?, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `wmsgfiltermin` : UInt, `wmsgfiltermax` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetMessageExtraInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMessageExtraInfo`() : `super`.`super`.`Foundation`.`LPARAM`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetMessagePos; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMessagePos`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetMessageTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMessageTime`() : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetMessageW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMessageW`(`lpmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MSG`>?, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `wmsgfiltermin` : UInt, `wmsgfiltermax` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetNextDlgGroupItem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetNextDlgGroupItem`(`hdlg` : `super`.`super`.`Foundation`.`HWND`, `hctl` : `super`.`super`.`Foundation`.`HWND`, `bprevious` : `windows_sys`.`core`.`BOOL`) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetNextDlgTabItem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetNextDlgTabItem`(`hdlg` : `super`.`super`.`Foundation`.`HWND`, `hctl` : `super`.`super`.`Foundation`.`HWND`, `bprevious` : `windows_sys`.`core`.`BOOL`) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetParent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetParent`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetPhysicalCursorPos; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPhysicalCursorPos`(`lppoint` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetProcessDefaultLayout; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetProcessDefaultLayout`(`pdwdefaultlayout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetPropA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPropA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lpstring` : `windows_sys`.`core`.`PCSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetPropW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPropW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lpstring` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetQueueStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetQueueStatus`(`flags` : `QUEUE_STATUS_FLAGS`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetScrollBarInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetScrollBarInfo`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `idobject` : `OBJECT_IDENTIFIER`, `psbi` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SCROLLBARINFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetScrollInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetScrollInfo`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `nbar` : `SCROLLBAR_CONSTANTS`, `lpsi` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SCROLLINFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetScrollPos; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetScrollPos`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `nbar` : `SCROLLBAR_CONSTANTS`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetScrollRange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetScrollRange`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `nbar` : `SCROLLBAR_CONSTANTS`, `lpminpos` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `lpmaxpos` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetShellWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetShellWindow`() : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetSubMenu; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSubMenu`(`hmenu` : `HMENU`, `npos` : Int) : `HMENU`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetSystemMenu; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSystemMenu`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `brevert` : `windows_sys`.`core`.`BOOL`) : `HMENU`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetSystemMetrics; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSystemMetrics`(`nindex` : `SYSTEM_METRICS_INDEX`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetTitleBarInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTitleBarInfo`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pti` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TITLEBARINFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetTopWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTopWindow`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWindow`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `ucmd` : `GET_WINDOW_CMD`) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetWindowDisplayAffinity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWindowDisplayAffinity`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pdwaffinity` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetWindowInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWindowInfo`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pwi` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WINDOWINFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetWindowLongA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWindowLongA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `nindex` : `WINDOW_LONG_PTR_INDEX`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetWindowLongPtrA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `GetWindowLongPtrA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `nindex` : `WINDOW_LONG_PTR_INDEX`) : Long
// UNSUPPORTED Rust 211:1: declaration Use has no candidate rule; syntax: no per-file syntax rule for Use
// #[cfg(target_pointer_width = "32")]
// pub use GetWindowLongA as GetWindowLongPtrA;

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetWindowLongPtrW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `GetWindowLongPtrW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `nindex` : `WINDOW_LONG_PTR_INDEX`) : Long
// UNSUPPORTED Rust 215:1: declaration Use has no candidate rule; syntax: no per-file syntax rule for Use
// #[cfg(target_pointer_width = "32")]
// pub use GetWindowLongW as GetWindowLongPtrW;

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetWindowLongW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWindowLongW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `nindex` : `WINDOW_LONG_PTR_INDEX`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetWindowModuleFileNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWindowModuleFileNameA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pszfilename` : `windows_sys`.`core`.`PSTR`, `cchfilenamemax` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetWindowModuleFileNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWindowModuleFileNameW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pszfilename` : `windows_sys`.`core`.`PWSTR`, `cchfilenamemax` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetWindowPlacement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWindowPlacement`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lpwndpl` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WINDOWPLACEMENT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetWindowRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWindowRect`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lprect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetWindowTextA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWindowTextA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lpstring` : `windows_sys`.`core`.`PSTR`, `nmaxcount` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetWindowTextLengthA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWindowTextLengthA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetWindowTextLengthW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWindowTextLengthW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetWindowTextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWindowTextW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lpstring` : `windows_sys`.`core`.`PWSTR`, `nmaxcount` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetWindowThreadProcessId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWindowThreadProcessId`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lpdwprocessid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetWindowWord; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWindowWord`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `nindex` : Int) : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=HideCaret; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HideCaret`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=HiliteMenuItem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HiliteMenuItem`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hmenu` : `HMENU`, `uidhiliteitem` : UInt, `uhilite` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=InSendMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InSendMessage`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=InSendMessageEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InSendMessageEx`(`lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mrmsupport.dll, ABI=system, export=IndexFilePath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IndexFilePath`(`resourceindexer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `filepath` : `windows_sys`.`core`.`PCWSTR`, `ppresourceuri` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `pqualifiercount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppqualifiers` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`IndexedResourceQualifier`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=InheritWindowMonitor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InheritWindowMonitor`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hwndinherit` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=InsertMenuA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InsertMenuA`(`hmenu` : `HMENU`, `uposition` : UInt, `uflags` : `MENU_ITEM_FLAGS`, `uidnewitem` : ULong, `lpnewitem` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=InsertMenuItemA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `InsertMenuItemA`(`hmenu` : `HMENU`, `item` : UInt, `fbyposition` : `windows_sys`.`core`.`BOOL`, `lpmi` : /* Rust *const */ kotlinx.cinterop.CPointer<`MENUITEMINFOA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=InsertMenuItemW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `InsertMenuItemW`(`hmenu` : `HMENU`, `item` : UInt, `fbyposition` : `windows_sys`.`core`.`BOOL`, `lpmi` : /* Rust *const */ kotlinx.cinterop.CPointer<`MENUITEMINFOW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=InsertMenuW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InsertMenuW`(`hmenu` : `HMENU`, `uposition` : UInt, `uflags` : `MENU_ITEM_FLAGS`, `uidnewitem` : ULong, `lpnewitem` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=InternalGetWindowText; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InternalGetWindowText`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pstring` : `windows_sys`.`core`.`PWSTR`, `cchmaxcount` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsCharAlphaA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsCharAlphaA`(`ch` : Byte) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsCharAlphaNumericA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsCharAlphaNumericA`(`ch` : Byte) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsCharAlphaNumericW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsCharAlphaNumericW`(`ch` : UShort) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsCharAlphaW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsCharAlphaW`(`ch` : UShort) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsCharLowerA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsCharLowerA`(`ch` : Byte) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsCharUpperA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsCharUpperA`(`ch` : Byte) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsCharUpperW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsCharUpperW`(`ch` : UShort) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsChild; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsChild`(`hwndparent` : `super`.`super`.`Foundation`.`HWND`, `hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsDialogMessageA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsDialogMessageA`(`hdlg` : `super`.`super`.`Foundation`.`HWND`, `lpmsg` : /* Rust *const */ kotlinx.cinterop.CPointer<`MSG`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsDialogMessageW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsDialogMessageW`(`hdlg` : `super`.`super`.`Foundation`.`HWND`, `lpmsg` : /* Rust *const */ kotlinx.cinterop.CPointer<`MSG`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsGUIThread; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsGUIThread`(`bconvert` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsHungAppWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsHungAppWindow`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsIconic; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsIconic`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsMenu; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsMenu`(`hmenu` : `HMENU`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsProcessDPIAware; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsProcessDPIAware`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsWindow`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsWindowArranged; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsWindowArranged`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsWindowUnicode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsWindowUnicode`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsWindowVisible; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsWindowVisible`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsWow64Message; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsWow64Message`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsZoomed; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsZoomed`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=KillTimer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `KillTimer`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `uidevent` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=LoadAcceleratorsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadAcceleratorsA`(`hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lptablename` : `windows_sys`.`core`.`PCSTR`) : `HACCEL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=LoadAcceleratorsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadAcceleratorsW`(`hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lptablename` : `windows_sys`.`core`.`PCWSTR`) : `HACCEL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=LoadCursorA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadCursorA`(`hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lpcursorname` : `windows_sys`.`core`.`PCSTR`) : `HCURSOR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=LoadCursorFromFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadCursorFromFileA`(`lpfilename` : `windows_sys`.`core`.`PCSTR`) : `HCURSOR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=LoadCursorFromFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadCursorFromFileW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`) : `HCURSOR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=LoadCursorW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadCursorW`(`hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lpcursorname` : `windows_sys`.`core`.`PCWSTR`) : `HCURSOR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=LoadIconA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadIconA`(`hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lpiconname` : `windows_sys`.`core`.`PCSTR`) : `HICON`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=LoadIconW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadIconW`(`hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lpiconname` : `windows_sys`.`core`.`PCWSTR`) : `HICON`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=LoadImageA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadImageA`(`hinst` : `super`.`super`.`Foundation`.`HINSTANCE`, `name` : `windows_sys`.`core`.`PCSTR`, `type` : `GDI_IMAGE_TYPE`, `cx` : Int, `cy` : Int, `fuload` : `IMAGE_FLAGS`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=LoadImageW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadImageW`(`hinst` : `super`.`super`.`Foundation`.`HINSTANCE`, `name` : `windows_sys`.`core`.`PCWSTR`, `type` : `GDI_IMAGE_TYPE`, `cx` : Int, `cy` : Int, `fuload` : `IMAGE_FLAGS`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=LoadMenuA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadMenuA`(`hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lpmenuname` : `windows_sys`.`core`.`PCSTR`) : `HMENU`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=LoadMenuIndirectA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadMenuIndirectA`(`lpmenutemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `HMENU`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=LoadMenuIndirectW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadMenuIndirectW`(`lpmenutemplate` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `HMENU`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=LoadMenuW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadMenuW`(`hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lpmenuname` : `windows_sys`.`core`.`PCWSTR`) : `HMENU`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=LoadStringA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadStringA`(`hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `uid` : UInt, `lpbuffer` : `windows_sys`.`core`.`PSTR`, `cchbuffermax` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=LoadStringW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadStringW`(`hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `uid` : UInt, `lpbuffer` : `windows_sys`.`core`.`PWSTR`, `cchbuffermax` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=LockSetForegroundWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LockSetForegroundWindow`(`ulockcode` : `FOREGROUND_WINDOW_LOCK_CODE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=LogicalToPhysicalPoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LogicalToPhysicalPoint`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lppoint` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=LookupIconIdFromDirectory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LookupIconIdFromDirectory`(`presbits` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `ficon` : `windows_sys`.`core`.`BOOL`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=LookupIconIdFromDirectoryEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LookupIconIdFromDirectoryEx`(`presbits` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `ficon` : `windows_sys`.`core`.`BOOL`, `cxdesired` : Int, `cydesired` : Int, `flags` : `IMAGE_FLAGS`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=MapDialogRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MapDialogRect`(`hdlg` : `super`.`super`.`Foundation`.`HWND`, `lprect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=MenuItemFromPoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MenuItemFromPoint`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hmenu` : `HMENU`, `ptscreen` : `super`.`super`.`Foundation`.`POINT`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=MessageBoxA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MessageBoxA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lptext` : `windows_sys`.`core`.`PCSTR`, `lpcaption` : `windows_sys`.`core`.`PCSTR`, `utype` : `MESSAGEBOX_STYLE`) : `MESSAGEBOX_RESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=MessageBoxExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MessageBoxExA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lptext` : `windows_sys`.`core`.`PCSTR`, `lpcaption` : `windows_sys`.`core`.`PCSTR`, `utype` : `MESSAGEBOX_STYLE`, `wlanguageid` : UShort) : `MESSAGEBOX_RESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=MessageBoxExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MessageBoxExW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lptext` : `windows_sys`.`core`.`PCWSTR`, `lpcaption` : `windows_sys`.`core`.`PCWSTR`, `utype` : `MESSAGEBOX_STYLE`, `wlanguageid` : UShort) : `MESSAGEBOX_RESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=MessageBoxIndirectA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Shell")]
public external fun `MessageBoxIndirectA`(`lpmbp` : /* Rust *const */ kotlinx.cinterop.CPointer<`MSGBOXPARAMSA`>?) : `MESSAGEBOX_RESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=MessageBoxIndirectW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Shell")]
public external fun `MessageBoxIndirectW`(`lpmbp` : /* Rust *const */ kotlinx.cinterop.CPointer<`MSGBOXPARAMSW`>?) : `MESSAGEBOX_RESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=MessageBoxW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MessageBoxW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lptext` : `windows_sys`.`core`.`PCWSTR`, `lpcaption` : `windows_sys`.`core`.`PCWSTR`, `utype` : `MESSAGEBOX_STYLE`) : `MESSAGEBOX_RESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ModifyMenuA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ModifyMenuA`(`hmnu` : `HMENU`, `uposition` : UInt, `uflags` : `MENU_ITEM_FLAGS`, `uidnewitem` : ULong, `lpnewitem` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ModifyMenuW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ModifyMenuW`(`hmnu` : `HMENU`, `uposition` : UInt, `uflags` : `MENU_ITEM_FLAGS`, `uidnewitem` : ULong, `lpnewitem` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=MoveWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MoveWindow`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `x` : Int, `y` : Int, `nwidth` : Int, `nheight` : Int, `brepaint` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mrmsupport.dll, ABI=system, export=MrmCreateConfig; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MrmCreateConfig`(`platformversion` : `MrmPlatformVersion`, `defaultqualifiers` : `windows_sys`.`core`.`PCWSTR`, `outputxmlfile` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mrmsupport.dll, ABI=system, export=MrmCreateConfigInMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MrmCreateConfigInMemory`(`platformversion` : `MrmPlatformVersion`, `defaultqualifiers` : `windows_sys`.`core`.`PCWSTR`, `outputxmldata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `outputxmlsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mrmsupport.dll, ABI=system, export=MrmCreateResourceFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MrmCreateResourceFile`(`indexer` : `MrmResourceIndexerHandle`, `packagingmode` : `MrmPackagingMode`, `packagingoptions` : `MrmPackagingOptions`, `outputdirectory` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mrmsupport.dll, ABI=system, export=MrmCreateResourceFileInMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MrmCreateResourceFileInMemory`(`indexer` : `MrmResourceIndexerHandle`, `packagingmode` : `MrmPackagingMode`, `packagingoptions` : `MrmPackagingOptions`, `outputpridata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `outputprisize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mrmsupport.dll, ABI=system, export=MrmCreateResourceFileWithChecksum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MrmCreateResourceFileWithChecksum`(`indexer` : `MrmResourceIndexerHandle`, `packagingmode` : `MrmPackagingMode`, `packagingoptions` : `MrmPackagingOptions`, `checksum` : UInt, `outputdirectory` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mrmsupport.dll, ABI=system, export=MrmCreateResourceIndexer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MrmCreateResourceIndexer`(`packagefamilyname` : `windows_sys`.`core`.`PCWSTR`, `projectroot` : `windows_sys`.`core`.`PCWSTR`, `platformversion` : `MrmPlatformVersion`, `defaultqualifiers` : `windows_sys`.`core`.`PCWSTR`, `indexer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MrmResourceIndexerHandle`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mrmsupport.dll, ABI=system, export=MrmCreateResourceIndexerFromPreviousPriData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MrmCreateResourceIndexerFromPreviousPriData`(`projectroot` : `windows_sys`.`core`.`PCWSTR`, `platformversion` : `MrmPlatformVersion`, `defaultqualifiers` : `windows_sys`.`core`.`PCWSTR`, `pridata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `prisize` : UInt, `indexer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MrmResourceIndexerHandle`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mrmsupport.dll, ABI=system, export=MrmCreateResourceIndexerFromPreviousPriFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MrmCreateResourceIndexerFromPreviousPriFile`(`projectroot` : `windows_sys`.`core`.`PCWSTR`, `platformversion` : `MrmPlatformVersion`, `defaultqualifiers` : `windows_sys`.`core`.`PCWSTR`, `prifile` : `windows_sys`.`core`.`PCWSTR`, `indexer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MrmResourceIndexerHandle`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mrmsupport.dll, ABI=system, export=MrmCreateResourceIndexerFromPreviousSchemaData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MrmCreateResourceIndexerFromPreviousSchemaData`(`projectroot` : `windows_sys`.`core`.`PCWSTR`, `platformversion` : `MrmPlatformVersion`, `defaultqualifiers` : `windows_sys`.`core`.`PCWSTR`, `schemaxmldata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `schemaxmlsize` : UInt, `indexer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MrmResourceIndexerHandle`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mrmsupport.dll, ABI=system, export=MrmCreateResourceIndexerFromPreviousSchemaFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MrmCreateResourceIndexerFromPreviousSchemaFile`(`projectroot` : `windows_sys`.`core`.`PCWSTR`, `platformversion` : `MrmPlatformVersion`, `defaultqualifiers` : `windows_sys`.`core`.`PCWSTR`, `schemafile` : `windows_sys`.`core`.`PCWSTR`, `indexer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MrmResourceIndexerHandle`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mrmsupport.dll, ABI=system, export=MrmCreateResourceIndexerWithFlags; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MrmCreateResourceIndexerWithFlags`(`packagefamilyname` : `windows_sys`.`core`.`PCWSTR`, `projectroot` : `windows_sys`.`core`.`PCWSTR`, `platformversion` : `MrmPlatformVersion`, `defaultqualifiers` : `windows_sys`.`core`.`PCWSTR`, `flags` : `MrmIndexerFlags`, `indexer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MrmResourceIndexerHandle`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mrmsupport.dll, ABI=system, export=MrmDestroyIndexerAndMessages; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MrmDestroyIndexerAndMessages`(`indexer` : `MrmResourceIndexerHandle`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mrmsupport.dll, ABI=system, export=MrmDumpPriDataInMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MrmDumpPriDataInMemory`(`inputpridata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `inputprisize` : UInt, `schemapridata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `schemaprisize` : UInt, `dumptype` : `MrmDumpType`, `outputxmldata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `outputxmlsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mrmsupport.dll, ABI=system, export=MrmDumpPriFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MrmDumpPriFile`(`indexfilename` : `windows_sys`.`core`.`PCWSTR`, `schemaprifile` : `windows_sys`.`core`.`PCWSTR`, `dumptype` : `MrmDumpType`, `outputxmlfile` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mrmsupport.dll, ABI=system, export=MrmDumpPriFileInMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MrmDumpPriFileInMemory`(`indexfilename` : `windows_sys`.`core`.`PCWSTR`, `schemaprifile` : `windows_sys`.`core`.`PCWSTR`, `dumptype` : `MrmDumpType`, `outputxmldata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `outputxmlsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mrmsupport.dll, ABI=system, export=MrmFreeMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MrmFreeMemory`(`data` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mrmsupport.dll, ABI=system, export=MrmGetPriFileContentChecksum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MrmGetPriFileContentChecksum`(`prifile` : `windows_sys`.`core`.`PCWSTR`, `checksum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mrmsupport.dll, ABI=system, export=MrmIndexEmbeddedData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MrmIndexEmbeddedData`(`indexer` : `MrmResourceIndexerHandle`, `resourceuri` : `windows_sys`.`core`.`PCWSTR`, `embeddeddata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `embeddeddatasize` : UInt, `qualifiers` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mrmsupport.dll, ABI=system, export=MrmIndexFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MrmIndexFile`(`indexer` : `MrmResourceIndexerHandle`, `resourceuri` : `windows_sys`.`core`.`PCWSTR`, `filepath` : `windows_sys`.`core`.`PCWSTR`, `qualifiers` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mrmsupport.dll, ABI=system, export=MrmIndexFileAutoQualifiers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MrmIndexFileAutoQualifiers`(`indexer` : `MrmResourceIndexerHandle`, `filepath` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mrmsupport.dll, ABI=system, export=MrmIndexResourceContainerAutoQualifiers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MrmIndexResourceContainerAutoQualifiers`(`indexer` : `MrmResourceIndexerHandle`, `containerpath` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mrmsupport.dll, ABI=system, export=MrmIndexString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MrmIndexString`(`indexer` : `MrmResourceIndexerHandle`, `resourceuri` : `windows_sys`.`core`.`PCWSTR`, `resourcestring` : `windows_sys`.`core`.`PCWSTR`, `qualifiers` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mrmsupport.dll, ABI=system, export=MrmPeekResourceIndexerMessages; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MrmPeekResourceIndexerMessages`(`handle` : `MrmResourceIndexerHandle`, `messages` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MrmResourceIndexerMessage`>>?, `nummsgs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=MsgWaitForMultipleObjects; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MsgWaitForMultipleObjects`(`ncount` : UInt, `phandles` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?, `fwaitall` : `windows_sys`.`core`.`BOOL`, `dwmilliseconds` : UInt, `dwwakemask` : `QUEUE_STATUS_FLAGS`) : `super`.`super`.`Foundation`.`WAIT_EVENT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=MsgWaitForMultipleObjectsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MsgWaitForMultipleObjectsEx`(`ncount` : UInt, `phandles` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?, `dwmilliseconds` : UInt, `dwwakemask` : `QUEUE_STATUS_FLAGS`, `dwflags` : `MSG_WAIT_FOR_MULTIPLE_OBJECTS_EX_FLAGS`) : `super`.`super`.`Foundation`.`WAIT_EVENT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=OemToCharA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OemToCharA`(`psrc` : `windows_sys`.`core`.`PCSTR`, `pdst` : `windows_sys`.`core`.`PSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=OemToCharBuffA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OemToCharBuffA`(`lpszsrc` : `windows_sys`.`core`.`PCSTR`, `lpszdst` : `windows_sys`.`core`.`PSTR`, `cchdstlength` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=OemToCharBuffW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OemToCharBuffW`(`lpszsrc` : `windows_sys`.`core`.`PCSTR`, `lpszdst` : `windows_sys`.`core`.`PWSTR`, `cchdstlength` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=OemToCharW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OemToCharW`(`psrc` : `windows_sys`.`core`.`PCSTR`, `pdst` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=OpenIcon; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenIcon`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=PeekMessageA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeekMessageA`(`lpmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MSG`>?, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `wmsgfiltermin` : UInt, `wmsgfiltermax` : UInt, `wremovemsg` : `PEEK_MESSAGE_REMOVE_TYPE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=PeekMessageW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PeekMessageW`(`lpmsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MSG`>?, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `wmsgfiltermin` : UInt, `wmsgfiltermax` : UInt, `wremovemsg` : `PEEK_MESSAGE_REMOVE_TYPE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=PhysicalToLogicalPoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PhysicalToLogicalPoint`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lppoint` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=PostMessageA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PostMessageA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `msg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=PostMessageW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PostMessageW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `msg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=PostQuitMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PostQuitMessage`(`nexitcode` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=PostThreadMessageA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PostThreadMessageA`(`idthread` : UInt, `msg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=PostThreadMessageW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PostThreadMessageW`(`idthread` : UInt, `msg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=PrivateExtractIconsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrivateExtractIconsA`(`szfilename` : `windows_sys`.`core`.`PCSTR`, `niconindex` : Int, `cxicon` : Int, `cyicon` : Int, `phicon` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HICON`>?, `piconid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `nicons` : UInt, `flags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=PrivateExtractIconsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrivateExtractIconsW`(`szfilename` : `windows_sys`.`core`.`PCWSTR`, `niconindex` : Int, `cxicon` : Int, `cyicon` : Int, `phicon` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HICON`>?, `piconid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `nicons` : UInt, `flags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RealChildWindowFromPoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RealChildWindowFromPoint`(`hwndparent` : `super`.`super`.`Foundation`.`HWND`, `ptparentclientcoords` : `super`.`super`.`Foundation`.`POINT`) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RealGetWindowClassA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RealGetWindowClassA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `ptszclassname` : `windows_sys`.`core`.`PSTR`, `cchclassnamemax` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RealGetWindowClassW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RealGetWindowClassW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `ptszclassname` : `windows_sys`.`core`.`PWSTR`, `cchclassnamemax` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RegisterClassA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `RegisterClassA`(`lpwndclass` : /* Rust *const */ kotlinx.cinterop.CPointer<`WNDCLASSA`>?) : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RegisterClassExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `RegisterClassExA`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<`WNDCLASSEXA`>?) : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RegisterClassExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `RegisterClassExW`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<`WNDCLASSEXW`>?) : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RegisterClassW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `RegisterClassW`(`lpwndclass` : /* Rust *const */ kotlinx.cinterop.CPointer<`WNDCLASSW`>?) : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RegisterDeviceNotificationA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterDeviceNotificationA`(`hrecipient` : `super`.`super`.`Foundation`.`HANDLE`, `notificationfilter` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `flags` : `REGISTER_NOTIFICATION_FLAGS`) : `HDEVNOTIFY`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RegisterDeviceNotificationW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterDeviceNotificationW`(`hrecipient` : `super`.`super`.`Foundation`.`HANDLE`, `notificationfilter` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `flags` : `REGISTER_NOTIFICATION_FLAGS`) : `HDEVNOTIFY`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RegisterForTooltipDismissNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterForTooltipDismissNotification`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `tdflags` : `TOOLTIP_DISMISS_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RegisterShellHookWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterShellHookWindow`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RegisterWindowMessageA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterWindowMessageA`(`lpstring` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RegisterWindowMessageW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterWindowMessageW`(`lpstring` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RemoveMenu; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveMenu`(`hmenu` : `HMENU`, `uposition` : UInt, `uflags` : `MENU_ITEM_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RemovePropA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemovePropA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lpstring` : `windows_sys`.`core`.`PCSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RemovePropW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemovePropW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lpstring` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ReplyMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReplyMessage`(`lresult` : `super`.`super`.`Foundation`.`LRESULT`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ScrollDC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `ScrollDC`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `dx` : Int, `dy` : Int, `lprcscroll` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `lprcclip` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `hrgnupdate` : `super`.`super`.`Graphics`.`Gdi`.`HRGN`, `lprcupdate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ScrollWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ScrollWindow`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `xamount` : Int, `yamount` : Int, `lprect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `lpcliprect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ScrollWindowEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `ScrollWindowEx`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `dx` : Int, `dy` : Int, `prcscroll` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `prcclip` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `hrgnupdate` : `super`.`super`.`Graphics`.`Gdi`.`HRGN`, `prcupdate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `flags` : `SCROLL_WINDOW_FLAGS`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SendDlgItemMessageA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SendDlgItemMessageA`(`hdlg` : `super`.`super`.`Foundation`.`HWND`, `niddlgitem` : Int, `msg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SendDlgItemMessageW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SendDlgItemMessageW`(`hdlg` : `super`.`super`.`Foundation`.`HWND`, `niddlgitem` : Int, `msg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SendMessageA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SendMessageA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `msg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SendMessageCallbackA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SendMessageCallbackA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `msg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`, `lpresultcallback` : `SENDASYNCPROC`, `dwdata` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SendMessageCallbackW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SendMessageCallbackW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `msg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`, `lpresultcallback` : `SENDASYNCPROC`, `dwdata` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SendMessageTimeoutA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SendMessageTimeoutA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `msg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`, `fuflags` : `SEND_MESSAGE_TIMEOUT_FLAGS`, `utimeout` : UInt, `lpdwresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SendMessageTimeoutW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SendMessageTimeoutW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `msg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`, `fuflags` : `SEND_MESSAGE_TIMEOUT_FLAGS`, `utimeout` : UInt, `lpdwresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SendMessageW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SendMessageW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `msg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SendNotifyMessageA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SendNotifyMessageA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `msg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SendNotifyMessageW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SendNotifyMessageW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `msg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetAdditionalForegroundBoostProcesses; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetAdditionalForegroundBoostProcesses`(`toplevelwindow` : `super`.`super`.`Foundation`.`HWND`, `processhandlecount` : UInt, `processhandlearray` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetCaretBlinkTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetCaretBlinkTime`(`umseconds` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetCaretPos; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetCaretPos`(`x` : Int, `y` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetClassLongA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetClassLongA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `nindex` : `GET_CLASS_LONG_INDEX`, `dwnewlong` : Int) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetClassLongPtrA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SetClassLongPtrA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `nindex` : `GET_CLASS_LONG_INDEX`, `dwnewlong` : Long) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetClassLongPtrW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SetClassLongPtrW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `nindex` : `GET_CLASS_LONG_INDEX`, `dwnewlong` : Long) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetClassLongW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetClassLongW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `nindex` : `GET_CLASS_LONG_INDEX`, `dwnewlong` : Int) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetClassWord; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetClassWord`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `nindex` : Int, `wnewword` : UShort) : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetCoalescableTimer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetCoalescableTimer`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `nidevent` : ULong, `uelapse` : UInt, `lptimerfunc` : `TIMERPROC`, `utolerancedelay` : UInt) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetCursor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetCursor`(`hcursor` : `HCURSOR`) : `HCURSOR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetCursorPos; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetCursorPos`(`x` : Int, `y` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetDebugErrorLevel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetDebugErrorLevel`(`dwlevel` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetDlgItemInt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetDlgItemInt`(`hdlg` : `super`.`super`.`Foundation`.`HWND`, `niddlgitem` : Int, `uvalue` : UInt, `bsigned` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetDlgItemTextA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetDlgItemTextA`(`hdlg` : `super`.`super`.`Foundation`.`HWND`, `niddlgitem` : Int, `lpstring` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetDlgItemTextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetDlgItemTextW`(`hdlg` : `super`.`super`.`Foundation`.`HWND`, `niddlgitem` : Int, `lpstring` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetForegroundWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetForegroundWindow`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetLayeredWindowAttributes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetLayeredWindowAttributes`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `crkey` : `super`.`super`.`Foundation`.`COLORREF`, `balpha` : UByte, `dwflags` : `LAYERED_WINDOW_ATTRIBUTES_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetMenu; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetMenu`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hmenu` : `HMENU`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetMenuDefaultItem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetMenuDefaultItem`(`hmenu` : `HMENU`, `uitem` : UInt, `fbypos` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetMenuInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `SetMenuInfo`(`param0` : `HMENU`, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`MENUINFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetMenuItemBitmaps; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `SetMenuItemBitmaps`(`hmenu` : `HMENU`, `uposition` : UInt, `uflags` : `MENU_ITEM_FLAGS`, `hbitmapunchecked` : `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`, `hbitmapchecked` : `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetMenuItemInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `SetMenuItemInfoA`(`hmenu` : `HMENU`, `item` : UInt, `fbypositon` : `windows_sys`.`core`.`BOOL`, `lpmii` : /* Rust *const */ kotlinx.cinterop.CPointer<`MENUITEMINFOA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetMenuItemInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `SetMenuItemInfoW`(`hmenu` : `HMENU`, `item` : UInt, `fbypositon` : `windows_sys`.`core`.`BOOL`, `lpmii` : /* Rust *const */ kotlinx.cinterop.CPointer<`MENUITEMINFOW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetMessageExtraInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetMessageExtraInfo`(`lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `super`.`super`.`Foundation`.`LPARAM`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetMessageQueue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetMessageQueue`(`cmessagesmax` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetParent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetParent`(`hwndchild` : `super`.`super`.`Foundation`.`HWND`, `hwndnewparent` : `super`.`super`.`Foundation`.`HWND`) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetPhysicalCursorPos; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetPhysicalCursorPos`(`x` : Int, `y` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetProcessDPIAware; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetProcessDPIAware`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetProcessDefaultLayout; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetProcessDefaultLayout`(`dwdefaultlayout` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetPropA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetPropA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lpstring` : `windows_sys`.`core`.`PCSTR`, `hdata` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetPropW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetPropW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lpstring` : `windows_sys`.`core`.`PCWSTR`, `hdata` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetSystemCursor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetSystemCursor`(`hcur` : `HCURSOR`, `id` : `SYSTEM_CURSOR_ID`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetTimer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetTimer`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `nidevent` : ULong, `uelapse` : UInt, `lptimerfunc` : `TIMERPROC`) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetWindowDisplayAffinity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetWindowDisplayAffinity`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `dwaffinity` : `WINDOW_DISPLAY_AFFINITY`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetWindowLongA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetWindowLongA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `nindex` : `WINDOW_LONG_PTR_INDEX`, `dwnewlong` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetWindowLongPtrA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SetWindowLongPtrA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `nindex` : `WINDOW_LONG_PTR_INDEX`, `dwnewlong` : Long) : Long
// UNSUPPORTED Rust 415:1: declaration Use has no candidate rule; syntax: no per-file syntax rule for Use
// #[cfg(target_pointer_width = "32")]
// pub use SetWindowLongA as SetWindowLongPtrA;

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetWindowLongPtrW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SetWindowLongPtrW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `nindex` : `WINDOW_LONG_PTR_INDEX`, `dwnewlong` : Long) : Long
// UNSUPPORTED Rust 419:1: declaration Use has no candidate rule; syntax: no per-file syntax rule for Use
// #[cfg(target_pointer_width = "32")]
// pub use SetWindowLongW as SetWindowLongPtrW;

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetWindowLongW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetWindowLongW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `nindex` : `WINDOW_LONG_PTR_INDEX`, `dwnewlong` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetWindowPlacement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetWindowPlacement`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lpwndpl` : /* Rust *const */ kotlinx.cinterop.CPointer<`WINDOWPLACEMENT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetWindowPos; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetWindowPos`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hwndinsertafter` : `super`.`super`.`Foundation`.`HWND`, `x` : Int, `y` : Int, `cx` : Int, `cy` : Int, `uflags` : `SET_WINDOW_POS_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetWindowTextA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetWindowTextA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lpstring` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetWindowTextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetWindowTextW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lpstring` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetWindowWord; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetWindowWord`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `nindex` : Int, `wnewword` : UShort) : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetWindowsHookA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetWindowsHookA`(`nfiltertype` : Int, `pfnfilterproc` : `HOOKPROC`) : `HHOOK`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetWindowsHookExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetWindowsHookExA`(`idhook` : `WINDOWS_HOOK_ID`, `lpfn` : `HOOKPROC`, `hmod` : `super`.`super`.`Foundation`.`HINSTANCE`, `dwthreadid` : UInt) : `HHOOK`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetWindowsHookExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetWindowsHookExW`(`idhook` : `WINDOWS_HOOK_ID`, `lpfn` : `HOOKPROC`, `hmod` : `super`.`super`.`Foundation`.`HINSTANCE`, `dwthreadid` : UInt) : `HHOOK`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetWindowsHookW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetWindowsHookW`(`nfiltertype` : Int, `pfnfilterproc` : `HOOKPROC`) : `HHOOK`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ShowCaret; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ShowCaret`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ShowCursor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ShowCursor`(`bshow` : `windows_sys`.`core`.`BOOL`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ShowOwnedPopups; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ShowOwnedPopups`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `fshow` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ShowWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ShowWindow`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `ncmdshow` : `SHOW_WINDOW_CMD`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ShowWindowAsync; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ShowWindowAsync`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `ncmdshow` : `SHOW_WINDOW_CMD`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SoundSentry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SoundSentry`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SwitchToThisWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SwitchToThisWindow`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `funknown` : `windows_sys`.`core`.`BOOL`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SystemParametersInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SystemParametersInfoA`(`uiaction` : `SYSTEM_PARAMETERS_INFO_ACTION`, `uiparam` : UInt, `pvparam` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fwinini` : `SYSTEM_PARAMETERS_INFO_UPDATE_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SystemParametersInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SystemParametersInfoW`(`uiaction` : `SYSTEM_PARAMETERS_INFO_ACTION`, `uiparam` : UInt, `pvparam` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fwinini` : `SYSTEM_PARAMETERS_INFO_UPDATE_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=TileWindows; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TileWindows`(`hwndparent` : `super`.`super`.`Foundation`.`HWND`, `whow` : `TILE_WINDOWS_HOW`, `lprect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `ckids` : UInt, `lpkids` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HWND`>?) : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=TrackPopupMenu; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TrackPopupMenu`(`hmenu` : `HMENU`, `uflags` : `TRACK_POPUP_MENU_FLAGS`, `x` : Int, `y` : Int, `nreserved` : Int, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `prcrect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=TrackPopupMenuEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TrackPopupMenuEx`(`hmenu` : `HMENU`, `uflags` : UInt, `x` : Int, `y` : Int, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `lptpm` : /* Rust *const */ kotlinx.cinterop.CPointer<`TPMPARAMS`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=TranslateAcceleratorA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TranslateAcceleratorA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hacctable` : `HACCEL`, `lpmsg` : /* Rust *const */ kotlinx.cinterop.CPointer<`MSG`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=TranslateAcceleratorW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TranslateAcceleratorW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hacctable` : `HACCEL`, `lpmsg` : /* Rust *const */ kotlinx.cinterop.CPointer<`MSG`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=TranslateMDISysAccel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TranslateMDISysAccel`(`hwndclient` : `super`.`super`.`Foundation`.`HWND`, `lpmsg` : /* Rust *const */ kotlinx.cinterop.CPointer<`MSG`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=TranslateMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TranslateMessage`(`lpmsg` : /* Rust *const */ kotlinx.cinterop.CPointer<`MSG`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=UnhookWindowsHook; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnhookWindowsHook`(`ncode` : Int, `pfnfilterproc` : `HOOKPROC`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=UnhookWindowsHookEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnhookWindowsHookEx`(`hhk` : `HHOOK`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=UnregisterClassA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnregisterClassA`(`lpclassname` : `windows_sys`.`core`.`PCSTR`, `hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=UnregisterClassW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnregisterClassW`(`lpclassname` : `windows_sys`.`core`.`PCWSTR`, `hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=UnregisterDeviceNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnregisterDeviceNotification`(`handle` : `HDEVNOTIFY`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=UpdateLayeredWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `UpdateLayeredWindow`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hdcdst` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `pptdst` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?, `psize` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SIZE`>?, `hdcsrc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `pptsrc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?, `crkey` : `super`.`super`.`Foundation`.`COLORREF`, `pblend` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`BLENDFUNCTION`>?, `dwflags` : `UPDATE_LAYERED_WINDOW_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=UpdateLayeredWindowIndirect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `UpdateLayeredWindowIndirect`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pulwinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`UPDATELAYEREDWINDOWINFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=WaitMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WaitMessage`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=WindowFromPhysicalPoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WindowFromPhysicalPoint`(`point` : `super`.`super`.`Foundation`.`POINT`) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=WindowFromPoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WindowFromPoint`(`point` : `super`.`super`.`Foundation`.`POINT`) : `super`.`super`.`Foundation`.`HWND`
// UNSUPPORTED Rust 459:1: foreign declaration requires explicit native target and interop package; syntax: foreign signature shape unsupported
// windows_link::link!("user32.dll" "C" fn wsprintfA(param0 : windows_sys::core::PSTR, param1 : windows_sys::core::PCSTR, ...) -> i32);

// UNSUPPORTED Rust 460:1: foreign declaration requires explicit native target and interop package; syntax: foreign signature shape unsupported
// windows_link::link!("user32.dll" "C" fn wsprintfW(param0 : windows_sys::core::PWSTR, param1 : windows_sys::core::PCWSTR, ...) -> i32);

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=wvsprintfA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `wvsprintfA`(`param0` : `windows_sys`.`core`.`PSTR`, `param1` : `windows_sys`.`core`.`PCSTR`, `arglist` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=wvsprintfW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `wvsprintfW`(`param0` : `windows_sys`.`core`.`PWSTR`, `param1` : `windows_sys`.`core`.`PCWSTR`, `arglist` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?) : Int
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ACCEL` (
    public var `fVirt`: `ACCEL_VIRT_FLAGS`,
    public var `key`: UShort,
    public var `cmd`: UShort,
)
public typealias `ACCEL_VIRT_FLAGS` = UByte;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ALTTABINFO` (
    public var `cbSize`: UInt,
    public var `cItems`: Int,
    public var `cColumns`: Int,
    public var `cRows`: Int,
    public var `iColFocus`: Int,
    public var `iRowFocus`: Int,
    public var `cxItem`: Int,
    public var `cyItem`: Int,
    public var `ptStart`: `super`.`super`.`Foundation`.`POINT`,
)
public typealias `ANIMATE_WINDOW_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ANIMATIONINFO` (
    public var `cbSize`: UInt,
    public var `iMinAnimate`: Int,
)
public const val `ARW_BOTTOMLEFT`: `MINIMIZEDMETRICS_ARRANGE` = 0;
public const val `ARW_BOTTOMRIGHT`: `MINIMIZEDMETRICS_ARRANGE` = 1;
public const val `ARW_DOWN`: Int = 4;
public const val `ARW_HIDE`: Int = 8;
public const val `ARW_LEFT`: Int = 0;
public const val `ARW_RIGHT`: Int = 0;
public const val `ARW_STARTMASK`: Int = 3;
public const val `ARW_STARTRIGHT`: Int = 1;
public const val `ARW_STARTTOP`: Int = 2;
public const val `ARW_TOPLEFT`: `MINIMIZEDMETRICS_ARRANGE` = 2;
public const val `ARW_TOPRIGHT`: `MINIMIZEDMETRICS_ARRANGE` = 3;
public const val `ARW_UP`: Int = 4;
public const val `ASFW_ANY`: UInt = 4294967295u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `AUDIODESCRIPTION` (
    public var `cbSize`: UInt,
    public var `Enabled`: `windows_sys`.`core`.`BOOL`,
    public var `Locale`: UInt,
)
public const val `AW_ACTIVATE`: `ANIMATE_WINDOW_FLAGS` = 131072u;
public const val `AW_BLEND`: `ANIMATE_WINDOW_FLAGS` = 524288u;
public const val `AW_CENTER`: `ANIMATE_WINDOW_FLAGS` = 16u;
public const val `AW_HIDE`: `ANIMATE_WINDOW_FLAGS` = 65536u;
public const val `AW_HOR_NEGATIVE`: `ANIMATE_WINDOW_FLAGS` = 2u;
public const val `AW_HOR_POSITIVE`: `ANIMATE_WINDOW_FLAGS` = 1u;
public const val `AW_SLIDE`: `ANIMATE_WINDOW_FLAGS` = 262144u;
public const val `AW_VER_NEGATIVE`: `ANIMATE_WINDOW_FLAGS` = 8u;
public const val `AW_VER_POSITIVE`: `ANIMATE_WINDOW_FLAGS` = 4u;
public const val `BM_CLICK`: UInt = 245u;
public const val `BM_GETCHECK`: UInt = 240u;
public const val `BM_GETIMAGE`: UInt = 246u;
public const val `BM_GETSTATE`: UInt = 242u;
public const val `BM_SETCHECK`: UInt = 241u;
public const val `BM_SETDONTCLICK`: UInt = 248u;
public const val `BM_SETIMAGE`: UInt = 247u;
public const val `BM_SETSTATE`: UInt = 243u;
public const val `BM_SETSTYLE`: UInt = 244u;
public const val `BN_CLICKED`: UInt = 0u;
public const val `BN_DBLCLK`: UInt = 5u;
public const val `BN_DISABLE`: UInt = 4u;
public const val `BN_DOUBLECLICKED`: UInt = 5u;
public const val `BN_HILITE`: UInt = 2u;
public const val `BN_KILLFOCUS`: UInt = 7u;
public const val `BN_PAINT`: UInt = 1u;
public const val `BN_PUSHED`: UInt = 2u;
public const val `BN_SETFOCUS`: UInt = 6u;
public const val `BN_UNHILITE`: UInt = 3u;
public const val `BN_UNPUSHED`: UInt = 3u;
public const val `BROADCAST_QUERY_DENY`: UInt = 1112363332u;
public const val `BSF_MSGSRV32ISOK`: UInt = 2147483648u;
public const val `BSF_MSGSRV32ISOK_BIT`: UInt = 31u;
public const val `BSM_INSTALLABLEDRIVERS`: UInt = 4u;
public const val `BSM_NETDRIVER`: UInt = 2u;
public const val `BSM_VXDS`: UInt = 1u;
public const val `BST_FOCUS`: UInt = 8u;
public const val `BST_PUSHED`: UInt = 4u;
public const val `BS_3STATE`: Int = 5;
public const val `BS_AUTO3STATE`: Int = 6;
public const val `BS_AUTOCHECKBOX`: Int = 3;
public const val `BS_AUTORADIOBUTTON`: Int = 9;
public const val `BS_BITMAP`: Int = 128;
public const val `BS_BOTTOM`: Int = 2048;
public const val `BS_CENTER`: Int = 768;
public const val `BS_CHECKBOX`: Int = 2;
public const val `BS_DEFPUSHBUTTON`: Int = 1;
public const val `BS_FLAT`: Int = 32768;
public const val `BS_GROUPBOX`: Int = 7;
public const val `BS_ICON`: Int = 64;
public const val `BS_LEFT`: Int = 256;
public const val `BS_LEFTTEXT`: Int = 32;
public const val `BS_MULTILINE`: Int = 8192;
public const val `BS_NOTIFY`: Int = 16384;
public const val `BS_OWNERDRAW`: Int = 11;
public const val `BS_PUSHBOX`: Int = 10;
public const val `BS_PUSHBUTTON`: Int = 0;
public const val `BS_PUSHLIKE`: Int = 4096;
public const val `BS_RADIOBUTTON`: Int = 4;
public const val `BS_RIGHT`: Int = 512;
public const val `BS_RIGHTBUTTON`: Int = 32;
public const val `BS_TEXT`: Int = 0;
public const val `BS_TOP`: Int = 1024;
public const val `BS_TYPEMASK`: Int = 15;
public const val `BS_USERBUTTON`: Int = 8;
public const val `BS_VCENTER`: Int = 3072;
public const val `CALERT_SYSTEM`: UInt = 6u;
public typealias `CASCADE_WINDOWS_HOW` = UInt;
public const val `CBN_CLOSEUP`: UInt = 8u;
public const val `CBN_DBLCLK`: UInt = 2u;
public const val `CBN_DROPDOWN`: UInt = 7u;
public const val `CBN_EDITCHANGE`: UInt = 5u;
public const val `CBN_EDITUPDATE`: UInt = 6u;
public const val `CBN_ERRSPACE`: Int = -1;
public const val `CBN_KILLFOCUS`: UInt = 4u;
public const val `CBN_SELCHANGE`: UInt = 1u;
public const val `CBN_SELENDCANCEL`: UInt = 10u;
public const val `CBN_SELENDOK`: UInt = 9u;
public const val `CBN_SETFOCUS`: UInt = 3u;
public const val `CBS_AUTOHSCROLL`: Int = 64;
public const val `CBS_DISABLENOSCROLL`: Int = 2048;
public const val `CBS_DROPDOWN`: Int = 2;
public const val `CBS_DROPDOWNLIST`: Int = 3;
public const val `CBS_HASSTRINGS`: Int = 512;
public const val `CBS_LOWERCASE`: Int = 16384;
public const val `CBS_NOINTEGRALHEIGHT`: Int = 1024;
public const val `CBS_OEMCONVERT`: Int = 128;
public const val `CBS_OWNERDRAWFIXED`: Int = 16;
public const val `CBS_OWNERDRAWVARIABLE`: Int = 32;
public const val `CBS_SIMPLE`: Int = 1;
public const val `CBS_SORT`: Int = 256;
public const val `CBS_UPPERCASE`: Int = 8192;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CBTACTIVATESTRUCT` (
    public var `fMouse`: `windows_sys`.`core`.`BOOL`,
    public var `hWndActive`: `super`.`super`.`Foundation`.`HWND`,
)
// UNSUPPORTED Rust 608:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CBTACTIVATESTRUCT {
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
public class `CBT_CREATEWNDA` (
    public var `lpcs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CREATESTRUCTA`>?,
    public var `hwndInsertAfter`: `super`.`super`.`Foundation`.`HWND`,
)
// UNSUPPORTED Rust 619:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CBT_CREATEWNDA {
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
public class `CBT_CREATEWNDW` (
    public var `lpcs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CREATESTRUCTW`>?,
    public var `hwndInsertAfter`: `super`.`super`.`Foundation`.`HWND`,
)
// UNSUPPORTED Rust 630:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CBT_CREATEWNDW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CB_ADDSTRING`: UInt = 323u;
public const val `CB_DELETESTRING`: UInt = 324u;
public const val `CB_DIR`: UInt = 325u;
public const val `CB_ERR`: Int = -1;
public const val `CB_ERRSPACE`: Int = -2;
public const val `CB_FINDSTRING`: UInt = 332u;
public const val `CB_FINDSTRINGEXACT`: UInt = 344u;
public const val `CB_GETCOMBOBOXINFO`: UInt = 356u;
public const val `CB_GETCOUNT`: UInt = 326u;
public const val `CB_GETCURSEL`: UInt = 327u;
public const val `CB_GETDROPPEDCONTROLRECT`: UInt = 338u;
public const val `CB_GETDROPPEDSTATE`: UInt = 343u;
public const val `CB_GETDROPPEDWIDTH`: UInt = 351u;
public const val `CB_GETEDITSEL`: UInt = 320u;
public const val `CB_GETEXTENDEDUI`: UInt = 342u;
public const val `CB_GETHORIZONTALEXTENT`: UInt = 349u;
public const val `CB_GETITEMDATA`: UInt = 336u;
public const val `CB_GETITEMHEIGHT`: UInt = 340u;
public const val `CB_GETLBTEXT`: UInt = 328u;
public const val `CB_GETLBTEXTLEN`: UInt = 329u;
public const val `CB_GETLOCALE`: UInt = 346u;
public const val `CB_GETTOPINDEX`: UInt = 347u;
public const val `CB_INITSTORAGE`: UInt = 353u;
public const val `CB_INSERTSTRING`: UInt = 330u;
public const val `CB_LIMITTEXT`: UInt = 321u;
public const val `CB_MSGMAX`: UInt = 357u;
public const val `CB_MULTIPLEADDSTRING`: UInt = 355u;
public const val `CB_OKAY`: UInt = 0u;
public const val `CB_RESETCONTENT`: UInt = 331u;
public const val `CB_SELECTSTRING`: UInt = 333u;
public const val `CB_SETCURSEL`: UInt = 334u;
public const val `CB_SETDROPPEDWIDTH`: UInt = 352u;
public const val `CB_SETEDITSEL`: UInt = 322u;
public const val `CB_SETEXTENDEDUI`: UInt = 341u;
public const val `CB_SETHORIZONTALEXTENT`: UInt = 350u;
public const val `CB_SETITEMDATA`: UInt = 337u;
public const val `CB_SETITEMHEIGHT`: UInt = 339u;
public const val `CB_SETLOCALE`: UInt = 345u;
public const val `CB_SETTOPINDEX`: UInt = 348u;
public const val `CB_SHOWDROPDOWN`: UInt = 335u;
public const val `CCHILDREN_SCROLLBAR`: UInt = 5u;
public const val `CCHILDREN_TITLEBAR`: UInt = 5u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CHANGEFILTERSTRUCT` (
    public var `cbSize`: UInt,
    public var `ExtStatus`: `MSGFLTINFO_STATUS`,
)
public typealias `CHANGE_WINDOW_MESSAGE_FILTER_FLAGS` = UInt;
public const val `CHILDID_SELF`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CLIENTCREATESTRUCT` (
    public var `hWindowMenu`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `idFirstChild`: UInt,
)
// UNSUPPORTED Rust 691:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CLIENTCREATESTRUCT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CONSOLE_APPLICATION_16BIT`: UInt = 0u;
public const val `CONSOLE_CARET_SELECTION`: UInt = 1u;
public const val `CONSOLE_CARET_VISIBLE`: UInt = 2u;
public const val `CONTACTVISUALIZATION_OFF`: UInt = 0u;
public const val `CONTACTVISUALIZATION_ON`: UInt = 1u;
public const val `CONTACTVISUALIZATION_PRESENTATIONMODE`: UInt = 2u;
public const val `CREATEPROCESS_MANIFEST_RESOURCE_ID`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CREATESTRUCTA` (
    public var `lpCreateParams`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `hMenu`: `HMENU`,
    public var `hwndParent`: `super`.`super`.`Foundation`.`HWND`,
    public var `cy`: Int,
    public var `cx`: Int,
    public var `y`: Int,
    public var `x`: Int,
    public var `style`: Int,
    public var `lpszName`: `windows_sys`.`core`.`PCSTR`,
    public var `lpszClass`: `windows_sys`.`core`.`PCSTR`,
    public var `dwExStyle`: `WINDOW_EX_STYLE`,
)
// UNSUPPORTED Rust 719:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CREATESTRUCTA {
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
public class `CREATESTRUCTW` (
    public var `lpCreateParams`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `hMenu`: `HMENU`,
    public var `hwndParent`: `super`.`super`.`Foundation`.`HWND`,
    public var `cy`: Int,
    public var `cx`: Int,
    public var `y`: Int,
    public var `x`: Int,
    public var `style`: Int,
    public var `lpszName`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpszClass`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwExStyle`: `WINDOW_EX_STYLE`,
)
// UNSUPPORTED Rust 740:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CREATESTRUCTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CSOUND_SYSTEM`: UInt = 16u;
public const val `CS_BYTEALIGNCLIENT`: `WNDCLASS_STYLES` = 4096u;
public const val `CS_BYTEALIGNWINDOW`: `WNDCLASS_STYLES` = 8192u;
public const val `CS_CLASSDC`: `WNDCLASS_STYLES` = 64u;
public const val `CS_DBLCLKS`: `WNDCLASS_STYLES` = 8u;
public const val `CS_DROPSHADOW`: `WNDCLASS_STYLES` = 131072u;
public const val `CS_GLOBALCLASS`: `WNDCLASS_STYLES` = 16384u;
public const val `CS_HREDRAW`: `WNDCLASS_STYLES` = 2u;
public const val `CS_IME`: `WNDCLASS_STYLES` = 65536u;
public const val `CS_NOCLOSE`: `WNDCLASS_STYLES` = 512u;
public const val `CS_OWNDC`: `WNDCLASS_STYLES` = 32u;
public const val `CS_PARENTDC`: `WNDCLASS_STYLES` = 128u;
public const val `CS_SAVEBITS`: `WNDCLASS_STYLES` = 2048u;
public const val `CS_VREDRAW`: `WNDCLASS_STYLES` = 1u;
public const val `CTLCOLOR_BTN`: UInt = 3u;
public const val `CTLCOLOR_DLG`: UInt = 4u;
public const val `CTLCOLOR_EDIT`: UInt = 1u;
public const val `CTLCOLOR_LISTBOX`: UInt = 2u;
public const val `CTLCOLOR_MAX`: UInt = 7u;
public const val `CTLCOLOR_MSGBOX`: UInt = 0u;
public const val `CTLCOLOR_SCROLLBAR`: UInt = 5u;
public const val `CTLCOLOR_STATIC`: UInt = 6u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CURSORINFO` (
    public var `cbSize`: UInt,
    public var `flags`: `CURSORINFO_FLAGS`,
    public var `hCursor`: `HCURSOR`,
    public var `ptScreenPos`: `super`.`super`.`Foundation`.`POINT`,
)
// UNSUPPORTED Rust 775:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CURSORINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CURSORINFO_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CURSORSHAPE` (
    public var `xHotSpot`: Int,
    public var `yHotSpot`: Int,
    public var `cx`: Int,
    public var `cy`: Int,
    public var `cbWidth`: Int,
    public var `Planes`: UByte,
    public var `BitsPixel`: UByte,
)
public const val `CURSOR_CREATION_SCALING_DEFAULT`: UInt = 2u;
public const val `CURSOR_CREATION_SCALING_NONE`: UInt = 1u;
public const val `CURSOR_SHOWING`: `CURSORINFO_FLAGS` = 1u;
public const val `CURSOR_SUPPRESSED`: `CURSORINFO_FLAGS` = 2u;
public const val `CWF_CREATE_ONLY`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CWPRETSTRUCT` (
    public var `lResult`: `super`.`super`.`Foundation`.`LRESULT`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `wParam`: `super`.`super`.`Foundation`.`WPARAM`,
    public var `message`: UInt,
    public var `hwnd`: `super`.`super`.`Foundation`.`HWND`,
)
// UNSUPPORTED Rust 806:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CWPRETSTRUCT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CWPSTRUCT` (
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `wParam`: `super`.`super`.`Foundation`.`WPARAM`,
    public var `message`: UInt,
    public var `hwnd`: `super`.`super`.`Foundation`.`HWND`,
)
// UNSUPPORTED Rust 819:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CWPSTRUCT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CWP_ALL`: `CWP_FLAGS` = 0u;
public typealias `CWP_FLAGS` = UInt;
public const val `CWP_SKIPDISABLED`: `CWP_FLAGS` = 2u;
public const val `CWP_SKIPINVISIBLE`: `CWP_FLAGS` = 1u;
public const val `CWP_SKIPTRANSPARENT`: `CWP_FLAGS` = 4u;
public const val `CW_USEDEFAULT`: Int = -2147483648;
public const val `DBTF_MEDIA`: `DEV_BROADCAST_VOLUME_FLAGS` = 1u;
public const val `DBTF_NET`: `DEV_BROADCAST_VOLUME_FLAGS` = 2u;
public const val `DBTF_RESOURCE`: UInt = 1u;
public const val `DBTF_SLOWNET`: UInt = 4u;
public const val `DBTF_XPORT`: UInt = 2u;
public const val `DBT_APPYBEGIN`: UInt = 0u;
public const val `DBT_APPYEND`: UInt = 1u;
public const val `DBT_CONFIGCHANGECANCELED`: UInt = 25u;
public const val `DBT_CONFIGCHANGED`: UInt = 24u;
public const val `DBT_CONFIGMGAPI32`: UInt = 34u;
public const val `DBT_CONFIGMGPRIVATE`: UInt = 32767u;
public const val `DBT_CUSTOMEVENT`: UInt = 32774u;
public const val `DBT_DEVICEARRIVAL`: UInt = 32768u;
public const val `DBT_DEVICEQUERYREMOVE`: UInt = 32769u;
public const val `DBT_DEVICEQUERYREMOVEFAILED`: UInt = 32770u;
public const val `DBT_DEVICEREMOVECOMPLETE`: UInt = 32772u;
public const val `DBT_DEVICEREMOVEPENDING`: UInt = 32771u;
public const val `DBT_DEVICETYPESPECIFIC`: UInt = 32773u;
public const val `DBT_DEVNODES_CHANGED`: UInt = 7u;
public const val `DBT_DEVTYP_DEVICEINTERFACE`: `DEV_BROADCAST_HDR_DEVICE_TYPE` = 5u;
public const val `DBT_DEVTYP_DEVNODE`: UInt = 1u;
public const val `DBT_DEVTYP_HANDLE`: `DEV_BROADCAST_HDR_DEVICE_TYPE` = 6u;
public const val `DBT_DEVTYP_NET`: UInt = 4u;
public const val `DBT_DEVTYP_OEM`: `DEV_BROADCAST_HDR_DEVICE_TYPE` = 0u;
public const val `DBT_DEVTYP_PORT`: `DEV_BROADCAST_HDR_DEVICE_TYPE` = 3u;
public const val `DBT_DEVTYP_VOLUME`: `DEV_BROADCAST_HDR_DEVICE_TYPE` = 2u;
public const val `DBT_LOW_DISK_SPACE`: UInt = 72u;
public const val `DBT_MONITORCHANGE`: UInt = 27u;
public const val `DBT_NO_DISK_SPACE`: UInt = 71u;
public const val `DBT_QUERYCHANGECONFIG`: UInt = 23u;
public const val `DBT_SHELLLOGGEDON`: UInt = 32u;
public const val `DBT_USERDEFINED`: UInt = 65535u;
public const val `DBT_VOLLOCKLOCKFAILED`: UInt = 32835u;
public const val `DBT_VOLLOCKLOCKRELEASED`: UInt = 32837u;
public const val `DBT_VOLLOCKLOCKTAKEN`: UInt = 32834u;
public const val `DBT_VOLLOCKQUERYLOCK`: UInt = 32833u;
public const val `DBT_VOLLOCKQUERYUNLOCK`: UInt = 32836u;
public const val `DBT_VOLLOCKUNLOCKFAILED`: UInt = 32838u;
public const val `DBT_VPOWERDAPI`: UInt = 33024u;
public const val `DBT_VXDINITCOMPLETE`: UInt = 35u;
public const val `DCX_EXCLUDEUPDATE`: Int = 256;
public const val `DC_HASDEFID`: UInt = 21323u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEBUGHOOKINFO` (
    public var `idThread`: UInt,
    public var `idThreadInstaller`: UInt,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `wParam`: `super`.`super`.`Foundation`.`WPARAM`,
    public var `code`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICE_EVENT_BECOMING_READY` (
    public var `Version`: UInt,
    public var `Reason`: UInt,
    public var `Estimated100msToReady`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICE_EVENT_EXTERNAL_REQUEST` (
    public var `Version`: UInt,
    public var `DeviceClass`: UInt,
    public var `ButtonStatus`: UShort,
    public var `Request`: UShort,
    public var `SystemTime`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICE_EVENT_GENERIC_DATA` (
    public var `EventNumber`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICE_EVENT_MOUNT` (
    public var `Version`: UInt,
    public var `Flags`: UInt,
    public var `FileSystemNameLength`: UInt,
    public var `FileSystemNameOffset`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICE_EVENT_RBC_DATA` (
    public var `EventNumber`: UInt,
    public var `SenseQualifier`: UByte,
    public var `SenseCode`: UByte,
    public var `SenseKey`: UByte,
    public var `Reserved`: UByte,
    public var `Information`: UInt,
)
public const val `DEVICE_NOTIFY_ALL_INTERFACE_CLASSES`: `REGISTER_NOTIFICATION_FLAGS` = 4u;
public const val `DEVICE_NOTIFY_CALLBACK`: `REGISTER_NOTIFICATION_FLAGS` = 2u;
public const val `DEVICE_NOTIFY_SERVICE_HANDLE`: `REGISTER_NOTIFICATION_FLAGS` = 1u;
public const val `DEVICE_NOTIFY_WINDOW_HANDLE`: `REGISTER_NOTIFICATION_FLAGS` = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEV_BROADCAST_DEVICEINTERFACE_A` (
    public var `dbcc_size`: UInt,
    public var `dbcc_devicetype`: UInt,
    public var `dbcc_reserved`: UInt,
    public var `dbcc_classguid`: `windows_sys`.`core`.`GUID`,
    public var `dbcc_name`: ByteArray,
)
// UNSUPPORTED Rust 933:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEV_BROADCAST_DEVICEINTERFACE_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEV_BROADCAST_DEVICEINTERFACE_W` (
    public var `dbcc_size`: UInt,
    public var `dbcc_devicetype`: UInt,
    public var `dbcc_reserved`: UInt,
    public var `dbcc_classguid`: `windows_sys`.`core`.`GUID`,
    public var `dbcc_name`: UShortArray,
)
// UNSUPPORTED Rust 947:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEV_BROADCAST_DEVICEINTERFACE_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEV_BROADCAST_DEVNODE` (
    public var `dbcd_size`: UInt,
    public var `dbcd_devicetype`: UInt,
    public var `dbcd_reserved`: UInt,
    public var `dbcd_devnode`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEV_BROADCAST_HANDLE` (
    public var `dbch_size`: UInt,
    public var `dbch_devicetype`: UInt,
    public var `dbch_reserved`: UInt,
    public var `dbch_handle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `dbch_hdevnotify`: `HDEVNOTIFY`,
    public var `dbch_eventguid`: `windows_sys`.`core`.`GUID`,
    public var `dbch_nameoffset`: Int,
    public var `dbch_data`: UByteArray,
)
// UNSUPPORTED Rust 972:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEV_BROADCAST_HANDLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEV_BROADCAST_HANDLE32` (
    public var `dbch_size`: UInt,
    public var `dbch_devicetype`: UInt,
    public var `dbch_reserved`: UInt,
    public var `dbch_handle`: UInt,
    public var `dbch_hdevnotify`: UInt,
    public var `dbch_eventguid`: `windows_sys`.`core`.`GUID`,
    public var `dbch_nameoffset`: Int,
    public var `dbch_data`: UByteArray,
)
// UNSUPPORTED Rust 989:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEV_BROADCAST_HANDLE32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEV_BROADCAST_HANDLE64` (
    public var `dbch_size`: UInt,
    public var `dbch_devicetype`: UInt,
    public var `dbch_reserved`: UInt,
    public var `dbch_handle`: ULong,
    public var `dbch_hdevnotify`: ULong,
    public var `dbch_eventguid`: `windows_sys`.`core`.`GUID`,
    public var `dbch_nameoffset`: Int,
    public var `dbch_data`: UByteArray,
)
// UNSUPPORTED Rust 1006:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEV_BROADCAST_HANDLE64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEV_BROADCAST_HDR` (
    public var `dbch_size`: UInt,
    public var `dbch_devicetype`: `DEV_BROADCAST_HDR_DEVICE_TYPE`,
    public var `dbch_reserved`: UInt,
)
public typealias `DEV_BROADCAST_HDR_DEVICE_TYPE` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEV_BROADCAST_NET` (
    public var `dbcn_size`: UInt,
    public var `dbcn_devicetype`: UInt,
    public var `dbcn_reserved`: UInt,
    public var `dbcn_resource`: UInt,
    public var `dbcn_flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEV_BROADCAST_OEM` (
    public var `dbco_size`: UInt,
    public var `dbco_devicetype`: UInt,
    public var `dbco_reserved`: UInt,
    public var `dbco_identifier`: UInt,
    public var `dbco_suppfunc`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEV_BROADCAST_PORT_A` (
    public var `dbcp_size`: UInt,
    public var `dbcp_devicetype`: UInt,
    public var `dbcp_reserved`: UInt,
    public var `dbcp_name`: ByteArray,
)
// UNSUPPORTED Rust 1045:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEV_BROADCAST_PORT_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEV_BROADCAST_PORT_W` (
    public var `dbcp_size`: UInt,
    public var `dbcp_devicetype`: UInt,
    public var `dbcp_reserved`: UInt,
    public var `dbcp_name`: UShortArray,
)
// UNSUPPORTED Rust 1058:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEV_BROADCAST_PORT_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEV_BROADCAST_VOLUME` (
    public var `dbcv_size`: UInt,
    public var `dbcv_devicetype`: UInt,
    public var `dbcv_reserved`: UInt,
    public var `dbcv_unitmask`: UInt,
    public var `dbcv_flags`: `DEV_BROADCAST_VOLUME_FLAGS`,
)
public typealias `DEV_BROADCAST_VOLUME_FLAGS` = UShort;
public const val `DIFFERENCE`: UInt = 11u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISK_HEALTH_NOTIFICATION_DATA` (
    public var `DeviceGuid`: `windows_sys`.`core`.`GUID`,
)
public const val `DI_COMPAT`: `DI_FLAGS` = 4u;
public const val `DI_DEFAULTSIZE`: `DI_FLAGS` = 8u;
public typealias `DI_FLAGS` = UInt;
public const val `DI_IMAGE`: `DI_FLAGS` = 2u;
public const val `DI_MASK`: `DI_FLAGS` = 1u;
public const val `DI_NOMIRROR`: `DI_FLAGS` = 16u;
public const val `DI_NORMAL`: `DI_FLAGS` = 3u;
public const val `DLGC_BUTTON`: UInt = 8192u;
public const val `DLGC_DEFPUSHBUTTON`: UInt = 16u;
public const val `DLGC_HASSETSEL`: UInt = 8u;
public const val `DLGC_RADIOBUTTON`: UInt = 64u;
public const val `DLGC_STATIC`: UInt = 256u;
public const val `DLGC_UNDEFPUSHBUTTON`: UInt = 32u;
public const val `DLGC_WANTALLKEYS`: UInt = 4u;
public const val `DLGC_WANTARROWS`: UInt = 1u;
public const val `DLGC_WANTCHARS`: UInt = 128u;
public const val `DLGC_WANTMESSAGE`: UInt = 4u;
public const val `DLGC_WANTTAB`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DLGITEMTEMPLATE` (
    public var `style`: UInt,
    public var `dwExtendedStyle`: UInt,
    public var `x`: Short,
    public var `y`: Short,
    public var `cx`: Short,
    public var `cy`: Short,
    public var `id`: UShort,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DLGPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, UInt, `super`.`super`.`Foundation`.`WPARAM`, `super`.`super`.`Foundation`.`LPARAM`) -> Long>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DLGTEMPLATE` (
    public var `style`: UInt,
    public var `dwExtendedStyle`: UInt,
    public var `cdit`: UShort,
    public var `x`: Short,
    public var `y`: Short,
    public var `cx`: Short,
    public var `cy`: Short,
)
public const val `DLGWINDOWEXTRA`: UInt = 30u;
public const val `DM_GETDEFID`: UInt = 1024u;
public const val `DM_POINTERHITTEST`: UInt = 592u;
public const val `DM_REPOSITION`: UInt = 1026u;
public const val `DM_SETDEFID`: UInt = 1025u;
public const val `DOF_DIRECTORY`: UInt = 32771u;
public const val `DOF_DOCUMENT`: UInt = 32770u;
public const val `DOF_EXECUTABLE`: UInt = 32769u;
public const val `DOF_MULTIPLE`: UInt = 32772u;
public const val `DOF_PROGMAN`: UInt = 1u;
public const val `DOF_SHELLDATA`: UInt = 2u;
public const val `DO_DROPFILE`: Int = 1162627398;
public const val `DO_PRINTFILE`: Int = 1414419024;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DROPSTRUCT` (
    public var `hwndSource`: `super`.`super`.`Foundation`.`HWND`,
    public var `hwndSink`: `super`.`super`.`Foundation`.`HWND`,
    public var `wFmt`: UInt,
    public var `dwData`: ULong,
    public var `ptDrop`: `super`.`super`.`Foundation`.`POINT`,
    public var `dwControlData`: UInt,
)
// UNSUPPORTED Rust 1143:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DROPSTRUCT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DS_3DLOOK`: Int = 4;
public const val `DS_ABSALIGN`: Int = 1;
public const val `DS_CENTER`: Int = 2048;
public const val `DS_CENTERMOUSE`: Int = 4096;
public const val `DS_CONTEXTHELP`: Int = 8192;
public const val `DS_CONTROL`: Int = 1024;
public const val `DS_FIXEDSYS`: Int = 8;
public const val `DS_LOCALEDIT`: Int = 32;
public const val `DS_MODALFRAME`: Int = 128;
public const val `DS_NOFAILCREATE`: Int = 16;
public const val `DS_NOIDLEMSG`: Int = 256;
public const val `DS_SETFONT`: Int = 64;
public const val `DS_SETFOREGROUND`: Int = 512;
public const val `DS_SYSMODAL`: Int = 2;
public const val `DS_USEPIXELS`: Int = 32768;
public const val `DWLP_MSGRESULT`: UInt = 0u;
public const val `DWL_DLGPROC`: UInt = 4u;
public const val `DWL_MSGRESULT`: UInt = 0u;
public const val `DWL_USER`: UInt = 8u;
public const val `EC_LEFTMARGIN`: UInt = 1u;
public const val `EC_RIGHTMARGIN`: UInt = 2u;
public const val `EC_USEFONTINFO`: UInt = 65535u;
public const val `EDD_GET_DEVICE_INTERFACE_NAME`: UInt = 1u;
public typealias `EDIT_CONTROL_FEATURE` = Int;
public const val `EDIT_CONTROL_FEATURE_ENTERPRISE_DATA_PROTECTION_PASTE_SUPPORT`: `EDIT_CONTROL_FEATURE` = 0;
public const val `EDIT_CONTROL_FEATURE_PASTE_NOTIFICATIONS`: `EDIT_CONTROL_FEATURE` = 1;
public const val `EIMES_CANCELCOMPSTRINFOCUS`: UInt = 2u;
public const val `EIMES_COMPLETECOMPSTRKILLFOCUS`: UInt = 4u;
public const val `EIMES_GETCOMPSTRATONCE`: UInt = 1u;
public const val `EMSIS_COMPOSITIONSTRING`: UInt = 1u;
public const val `ENDSESSION_CLOSEAPP`: UInt = 1u;
public const val `ENDSESSION_CRITICAL`: UInt = 1073741824u;
public const val `ENDSESSION_LOGOFF`: UInt = 2147483648u;
public const val `EN_AFTER_PASTE`: UInt = 2049u;
public const val `EN_ALIGN_LTR_EC`: UInt = 1792u;
public const val `EN_ALIGN_RTL_EC`: UInt = 1793u;
public const val `EN_BEFORE_PASTE`: UInt = 2048u;
public const val `EN_CHANGE`: UInt = 768u;
public const val `EN_ERRSPACE`: UInt = 1280u;
public const val `EN_HSCROLL`: UInt = 1537u;
public const val `EN_KILLFOCUS`: UInt = 512u;
public const val `EN_MAXTEXT`: UInt = 1281u;
public const val `EN_SETFOCUS`: UInt = 256u;
public const val `EN_UPDATE`: UInt = 1024u;
public const val `EN_VSCROLL`: UInt = 1538u;
public const val `ES_AUTOHSCROLL`: Int = 128;
public const val `ES_AUTOVSCROLL`: Int = 64;
public const val `ES_CENTER`: Int = 1;
public const val `ES_LEFT`: Int = 0;
public const val `ES_LOWERCASE`: Int = 16;
public const val `ES_MULTILINE`: Int = 4;
public const val `ES_NOHIDESEL`: Int = 256;
public const val `ES_NUMBER`: Int = 8192;
public const val `ES_OEMCONVERT`: Int = 1024;
public const val `ES_PASSWORD`: Int = 32;
public const val `ES_READONLY`: Int = 2048;
public const val `ES_RIGHT`: Int = 2;
public const val `ES_UPPERCASE`: Int = 8;
public const val `ES_WANTRETURN`: Int = 4096;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EVENTMSG` (
    public var `message`: UInt,
    public var `paramL`: UInt,
    public var `paramH`: UInt,
    public var `time`: UInt,
    public var `hwnd`: `super`.`super`.`Foundation`.`HWND`,
)
// UNSUPPORTED Rust 1216:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENTMSG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `EVENT_AIA_END`: UInt = 45055u;
public const val `EVENT_AIA_START`: UInt = 40960u;
public const val `EVENT_CONSOLE_CARET`: UInt = 16385u;
public const val `EVENT_CONSOLE_END`: UInt = 16639u;
public const val `EVENT_CONSOLE_END_APPLICATION`: UInt = 16391u;
public const val `EVENT_CONSOLE_LAYOUT`: UInt = 16389u;
public const val `EVENT_CONSOLE_START_APPLICATION`: UInt = 16390u;
public const val `EVENT_CONSOLE_UPDATE_REGION`: UInt = 16386u;
public const val `EVENT_CONSOLE_UPDATE_SCROLL`: UInt = 16388u;
public const val `EVENT_CONSOLE_UPDATE_SIMPLE`: UInt = 16387u;
public const val `EVENT_MAX`: UInt = 2147483647u;
public const val `EVENT_MIN`: UInt = 1u;
public const val `EVENT_OBJECT_ACCELERATORCHANGE`: UInt = 32786u;
public const val `EVENT_OBJECT_CLOAKED`: UInt = 32791u;
public const val `EVENT_OBJECT_CONTENTSCROLLED`: UInt = 32789u;
public const val `EVENT_OBJECT_CREATE`: UInt = 32768u;
public const val `EVENT_OBJECT_DEFACTIONCHANGE`: UInt = 32785u;
public const val `EVENT_OBJECT_DESCRIPTIONCHANGE`: UInt = 32781u;
public const val `EVENT_OBJECT_DESTROY`: UInt = 32769u;
public const val `EVENT_OBJECT_DRAGCANCEL`: UInt = 32802u;
public const val `EVENT_OBJECT_DRAGCOMPLETE`: UInt = 32803u;
public const val `EVENT_OBJECT_DRAGDROPPED`: UInt = 32806u;
public const val `EVENT_OBJECT_DRAGENTER`: UInt = 32804u;
public const val `EVENT_OBJECT_DRAGLEAVE`: UInt = 32805u;
public const val `EVENT_OBJECT_DRAGSTART`: UInt = 32801u;
public const val `EVENT_OBJECT_END`: UInt = 33023u;
public const val `EVENT_OBJECT_FOCUS`: UInt = 32773u;
public const val `EVENT_OBJECT_HELPCHANGE`: UInt = 32784u;
public const val `EVENT_OBJECT_HIDE`: UInt = 32771u;
public const val `EVENT_OBJECT_HOSTEDOBJECTSINVALIDATED`: UInt = 32800u;
public const val `EVENT_OBJECT_IME_CHANGE`: UInt = 32809u;
public const val `EVENT_OBJECT_IME_HIDE`: UInt = 32808u;
public const val `EVENT_OBJECT_IME_SHOW`: UInt = 32807u;
public const val `EVENT_OBJECT_INVOKED`: UInt = 32787u;
public const val `EVENT_OBJECT_LIVEREGIONCHANGED`: UInt = 32793u;
public const val `EVENT_OBJECT_LOCATIONCHANGE`: UInt = 32779u;
public const val `EVENT_OBJECT_NAMECHANGE`: UInt = 32780u;
public const val `EVENT_OBJECT_PARENTCHANGE`: UInt = 32783u;
public const val `EVENT_OBJECT_REORDER`: UInt = 32772u;
public const val `EVENT_OBJECT_SELECTION`: UInt = 32774u;
public const val `EVENT_OBJECT_SELECTIONADD`: UInt = 32775u;
public const val `EVENT_OBJECT_SELECTIONREMOVE`: UInt = 32776u;
public const val `EVENT_OBJECT_SELECTIONWITHIN`: UInt = 32777u;
public const val `EVENT_OBJECT_SHOW`: UInt = 32770u;
public const val `EVENT_OBJECT_STATECHANGE`: UInt = 32778u;
public const val `EVENT_OBJECT_TEXTEDIT_CONVERSIONTARGETCHANGED`: UInt = 32816u;
public const val `EVENT_OBJECT_TEXTSELECTIONCHANGED`: UInt = 32788u;
public const val `EVENT_OBJECT_UNCLOAKED`: UInt = 32792u;
public const val `EVENT_OBJECT_VALUECHANGE`: UInt = 32782u;
public const val `EVENT_OEM_DEFINED_END`: UInt = 511u;
public const val `EVENT_OEM_DEFINED_START`: UInt = 257u;
public const val `EVENT_SYSTEM_ALERT`: UInt = 2u;
public const val `EVENT_SYSTEM_ARRANGMENTPREVIEW`: UInt = 32790u;
public const val `EVENT_SYSTEM_CAPTUREEND`: UInt = 9u;
public const val `EVENT_SYSTEM_CAPTURESTART`: UInt = 8u;
public const val `EVENT_SYSTEM_CONTEXTHELPEND`: UInt = 13u;
public const val `EVENT_SYSTEM_CONTEXTHELPSTART`: UInt = 12u;
public const val `EVENT_SYSTEM_DESKTOPSWITCH`: UInt = 32u;
public const val `EVENT_SYSTEM_DIALOGEND`: UInt = 17u;
public const val `EVENT_SYSTEM_DIALOGSTART`: UInt = 16u;
public const val `EVENT_SYSTEM_DRAGDROPEND`: UInt = 15u;
public const val `EVENT_SYSTEM_DRAGDROPSTART`: UInt = 14u;
public const val `EVENT_SYSTEM_END`: UInt = 255u;
public const val `EVENT_SYSTEM_FOREGROUND`: UInt = 3u;
public const val `EVENT_SYSTEM_IME_KEY_NOTIFICATION`: UInt = 41u;
public const val `EVENT_SYSTEM_MENUEND`: UInt = 5u;
public const val `EVENT_SYSTEM_MENUPOPUPEND`: UInt = 7u;
public const val `EVENT_SYSTEM_MENUPOPUPSTART`: UInt = 6u;
public const val `EVENT_SYSTEM_MENUSTART`: UInt = 4u;
public const val `EVENT_SYSTEM_MINIMIZEEND`: UInt = 23u;
public const val `EVENT_SYSTEM_MINIMIZESTART`: UInt = 22u;
public const val `EVENT_SYSTEM_MOVESIZEEND`: UInt = 11u;
public const val `EVENT_SYSTEM_MOVESIZESTART`: UInt = 10u;
public const val `EVENT_SYSTEM_SCROLLINGEND`: UInt = 19u;
public const val `EVENT_SYSTEM_SCROLLINGSTART`: UInt = 18u;
public const val `EVENT_SYSTEM_SOUND`: UInt = 1u;
public const val `EVENT_SYSTEM_SWITCHEND`: UInt = 21u;
public const val `EVENT_SYSTEM_SWITCHER_APPDROPPED`: UInt = 38u;
public const val `EVENT_SYSTEM_SWITCHER_APPGRABBED`: UInt = 36u;
public const val `EVENT_SYSTEM_SWITCHER_APPOVERTARGET`: UInt = 37u;
public const val `EVENT_SYSTEM_SWITCHER_CANCELLED`: UInt = 39u;
public const val `EVENT_SYSTEM_SWITCHSTART`: UInt = 20u;
public const val `EVENT_UIA_EVENTID_END`: UInt = 20223u;
public const val `EVENT_UIA_EVENTID_START`: UInt = 19968u;
public const val `EVENT_UIA_PROPID_END`: UInt = 30207u;
public const val `EVENT_UIA_PROPID_START`: UInt = 29952u;
public const val `FALT`: `ACCEL_VIRT_FLAGS` = 16u;
public const val `FAPPCOMMAND_KEY`: UInt = 0u;
public const val `FAPPCOMMAND_MASK`: UInt = 61440u;
public const val `FAPPCOMMAND_MOUSE`: UInt = 32768u;
public const val `FAPPCOMMAND_OEM`: UInt = 4096u;
public const val `FCONTROL`: `ACCEL_VIRT_FLAGS` = 8u;
public const val `FE_FONTSMOOTHINGCLEARTYPE`: UInt = 2u;
public const val `FE_FONTSMOOTHINGORIENTATIONBGR`: UInt = 0u;
public const val `FE_FONTSMOOTHINGORIENTATIONRGB`: UInt = 1u;
public const val `FE_FONTSMOOTHINGSTANDARD`: UInt = 1u;
public const val `FKF_AVAILABLE`: UInt = 2u;
public const val `FKF_CLICKON`: UInt = 64u;
public const val `FKF_CONFIRMHOTKEY`: UInt = 8u;
public const val `FKF_FILTERKEYSON`: UInt = 1u;
public const val `FKF_HOTKEYACTIVE`: UInt = 4u;
public const val `FKF_HOTKEYSOUND`: UInt = 16u;
public const val `FKF_INDICATOR`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FLASHWINFO` (
    public var `cbSize`: UInt,
    public var `hwnd`: `super`.`super`.`Foundation`.`HWND`,
    public var `dwFlags`: `FLASHWINFO_FLAGS`,
    public var `uCount`: UInt,
    public var `dwTimeout`: UInt,
)
// UNSUPPORTED Rust 1333:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FLASHWINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FLASHWINFO_FLAGS` = UInt;
public const val `FLASHW_ALL`: `FLASHWINFO_FLAGS` = 3u;
public const val `FLASHW_CAPTION`: `FLASHWINFO_FLAGS` = 1u;
public const val `FLASHW_STOP`: `FLASHWINFO_FLAGS` = 0u;
public const val `FLASHW_TIMER`: `FLASHWINFO_FLAGS` = 4u;
public const val `FLASHW_TIMERNOFG`: `FLASHWINFO_FLAGS` = 12u;
public const val `FLASHW_TRAY`: `FLASHWINFO_FLAGS` = 2u;
public const val `FNOINVERT`: `ACCEL_VIRT_FLAGS` = 2u;
public typealias `FOREGROUND_WINDOW_LOCK_CODE` = UInt;
public const val `FSHIFT`: `ACCEL_VIRT_FLAGS` = 4u;
public const val `FVIRTKEY`: `ACCEL_VIRT_FLAGS` = 1u;
public const val `GA_PARENT`: `GET_ANCESTOR_FLAGS` = 1u;
public const val `GA_ROOT`: `GET_ANCESTOR_FLAGS` = 2u;
public const val `GA_ROOTOWNER`: `GET_ANCESTOR_FLAGS` = 3u;
public const val `GCF_INCLUDE_ANCESTORS`: UInt = 1u;
public const val `GCLP_HBRBACKGROUND`: `GET_CLASS_LONG_INDEX` = -10;
public const val `GCLP_HCURSOR`: `GET_CLASS_LONG_INDEX` = -12;
public const val `GCLP_HICON`: `GET_CLASS_LONG_INDEX` = -14;
public const val `GCLP_HICONSM`: `GET_CLASS_LONG_INDEX` = -34;
public const val `GCLP_HMODULE`: `GET_CLASS_LONG_INDEX` = -16;
public const val `GCLP_MENUNAME`: `GET_CLASS_LONG_INDEX` = -8;
public const val `GCLP_WNDPROC`: `GET_CLASS_LONG_INDEX` = -24;
public const val `GCL_CBCLSEXTRA`: `GET_CLASS_LONG_INDEX` = -20;
public const val `GCL_CBWNDEXTRA`: `GET_CLASS_LONG_INDEX` = -18;
public const val `GCL_HBRBACKGROUND`: `GET_CLASS_LONG_INDEX` = -10;
public const val `GCL_HCURSOR`: `GET_CLASS_LONG_INDEX` = -12;
public const val `GCL_HICON`: `GET_CLASS_LONG_INDEX` = -14;
public const val `GCL_HICONSM`: `GET_CLASS_LONG_INDEX` = -34;
public const val `GCL_HMODULE`: `GET_CLASS_LONG_INDEX` = -16;
public const val `GCL_MENUNAME`: `GET_CLASS_LONG_INDEX` = -8;
public const val `GCL_STYLE`: `GET_CLASS_LONG_INDEX` = -26;
public const val `GCL_WNDPROC`: `GET_CLASS_LONG_INDEX` = -24;
public const val `GCW_ATOM`: `GET_CLASS_LONG_INDEX` = -32;
public typealias `GDI_IMAGE_TYPE` = UInt;
public const val `GESTURECONFIGMAXCOUNT`: UInt = 256u;
public const val `GESTUREVISUALIZATION_DOUBLETAP`: UInt = 2u;
public const val `GESTUREVISUALIZATION_OFF`: UInt = 0u;
public const val `GESTUREVISUALIZATION_ON`: UInt = 31u;
public const val `GESTUREVISUALIZATION_PRESSANDHOLD`: UInt = 8u;
public const val `GESTUREVISUALIZATION_PRESSANDTAP`: UInt = 4u;
public const val `GESTUREVISUALIZATION_RIGHTTAP`: UInt = 16u;
public const val `GESTUREVISUALIZATION_TAP`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GETCLIPBMETADATA` (
    public var `Version`: UInt,
    public var `IsDelayRendered`: `windows_sys`.`core`.`BOOL`,
    public var `IsSynthetic`: `windows_sys`.`core`.`BOOL`,
)
public typealias `GET_ANCESTOR_FLAGS` = UInt;
public typealias `GET_CLASS_LONG_INDEX` = Int;
public typealias `GET_MENU_DEFAULT_ITEM_FLAGS` = UInt;
public typealias `GET_WINDOW_CMD` = UInt;
public const val `GF_BEGIN`: UInt = 1u;
public const val `GF_END`: UInt = 4u;
public const val `GF_INERTIA`: UInt = 2u;
public const val `GIDC_ARRIVAL`: UInt = 1u;
public const val `GIDC_REMOVAL`: UInt = 2u;
public const val `GMDI_GOINTOPOPUPS`: `GET_MENU_DEFAULT_ITEM_FLAGS` = 2u;
public const val `GMDI_USEDISABLED`: `GET_MENU_DEFAULT_ITEM_FLAGS` = 1u;
// UNSUPPORTED Rust 1398:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DEVICE_EVENT_RBC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd0744792_a98e_11d2_917a_00a0c9068ff3);

// UNSUPPORTED Rust 1399:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_CDROM_EXCLUSIVE_LOCK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbc56c139_7a10_47ee_a294_4c6a38f0149a);

// UNSUPPORTED Rust 1400:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_CDROM_EXCLUSIVE_UNLOCK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa3b6d27d_5e35_4885_81e5_ee18c00ed779);

// UNSUPPORTED Rust 1401:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_DEVICE_BECOMING_READY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd07433f0_a98e_11d2_917a_00a0c9068ff3);

// UNSUPPORTED Rust 1402:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_DEVICE_EXTERNAL_REQUEST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd07433d0_a98e_11d2_917a_00a0c9068ff3);

// UNSUPPORTED Rust 1403:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_DISK_CLONE_ARRIVAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6a61885b_7c39_43dd_9b56_b8ac22a549aa);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GUID_IO_DISK_CLONE_ARRIVAL_INFORMATION` (
    public var `DiskNumber`: UInt,
)
// UNSUPPORTED Rust 1409:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_DISK_HEALTH_NOTIFICATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0f1bd644_3916_49c5_b063_991940118fb2);

// UNSUPPORTED Rust 1410:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_DISK_LAYOUT_CHANGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x11dff54c_8469_41f9_b3de_ef836487c54a);

// UNSUPPORTED Rust 1411:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_DRIVE_REQUIRES_CLEANING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7207877c_90ed_44e5_a000_81428d4c79bb);

// UNSUPPORTED Rust 1412:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_MEDIA_ARRIVAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd07433c0_a98e_11d2_917a_00a0c9068ff3);

// UNSUPPORTED Rust 1413:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_MEDIA_EJECT_REQUEST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd07433d1_a98e_11d2_917a_00a0c9068ff3);

// UNSUPPORTED Rust 1414:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_MEDIA_REMOVAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd07433c1_a98e_11d2_917a_00a0c9068ff3);

// UNSUPPORTED Rust 1415:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_TAPE_ERASE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x852d11eb_4bb8_4507_9d9b_417cc2b1b438);

// UNSUPPORTED Rust 1416:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_VOLUME_BACKGROUND_FORMAT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa2e5fc86_d5cd_4038_b2e3_4445065c2377);

// UNSUPPORTED Rust 1417:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_VOLUME_CHANGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7373654a_812a_11d0_bec7_08002be2092f);

// UNSUPPORTED Rust 1418:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_VOLUME_CHANGE_SIZE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3a1625be_ad03_49f1_8ef8_6bbac182d1fd);

// UNSUPPORTED Rust 1419:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_VOLUME_DEVICE_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x53f5630d_b6bf_11d0_94f2_00a0c91efb8b);

// UNSUPPORTED Rust 1420:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_VOLUME_DISMOUNT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd16a55e8_1059_11d2_8ffd_00a0c9a06d32);

// UNSUPPORTED Rust 1421:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_VOLUME_DISMOUNT_FAILED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe3c5b178_105d_11d2_8ffd_00a0c9a06d32);

// UNSUPPORTED Rust 1422:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_VOLUME_FORCE_CLOSED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x411ad84f_433e_4dc2_a5ae_4a2d1a2de654);

// UNSUPPORTED Rust 1423:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_VOLUME_FVE_STATUS_CHANGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x062998b2_ee1f_4b6a_b857_e76cbbe9a6da);

// UNSUPPORTED Rust 1424:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_VOLUME_INFO_MAKE_COMPAT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3ab9a0d2_ef80_45cf_8cdc_cbe02a212906);

// UNSUPPORTED Rust 1425:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_VOLUME_LOCK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x50708874_c9af_11d1_8fef_00a0c9a06d32);

// UNSUPPORTED Rust 1426:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_VOLUME_LOCK_FAILED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xae2eed10_0ba8_11d2_8ffb_00a0c9a06d32);

// UNSUPPORTED Rust 1427:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_VOLUME_MOUNT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb5804878_1a96_11d2_8ffd_00a0c9a06d32);

// UNSUPPORTED Rust 1428:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_VOLUME_NAME_CHANGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2de97f83_4c06_11d2_a532_00609713055a);

// UNSUPPORTED Rust 1429:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_VOLUME_NEED_CHKDSK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x799a0960_0a0b_4e03_ad88_2fa7c6ce748a);

// UNSUPPORTED Rust 1430:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_VOLUME_PHYSICAL_CONFIGURATION_CHANGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2de97f84_4c06_11d2_a532_00609713055a);

// UNSUPPORTED Rust 1431:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_VOLUME_PREPARING_EJECT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc79eb16e_0dac_4e7a_a86c_b25ceeaa88f6);

// UNSUPPORTED Rust 1432:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_VOLUME_UNIQUE_ID_CHANGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaf39da42_6622_41f5_970b_139d092fa3d9);

// UNSUPPORTED Rust 1433:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_VOLUME_UNLOCK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9a8c3d68_d0cb_11d1_8fef_00a0c9a06d32);

// UNSUPPORTED Rust 1434:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_VOLUME_WEARING_OUT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x873113ca_1486_4508_82ac_c3b2e5297aaa);

// UNSUPPORTED Rust 1435:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_IO_VOLUME_WORM_NEAR_FULL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf3bfff82_f3de_48d2_af95_457f80b763f2);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GUITHREADINFO` (
    public var `cbSize`: UInt,
    public var `flags`: `GUITHREADINFO_FLAGS`,
    public var `hwndActive`: `super`.`super`.`Foundation`.`HWND`,
    public var `hwndFocus`: `super`.`super`.`Foundation`.`HWND`,
    public var `hwndCapture`: `super`.`super`.`Foundation`.`HWND`,
    public var `hwndMenuOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `hwndMoveSize`: `super`.`super`.`Foundation`.`HWND`,
    public var `hwndCaret`: `super`.`super`.`Foundation`.`HWND`,
    public var `rcCaret`: `super`.`super`.`Foundation`.`RECT`,
)
// UNSUPPORTED Rust 1449:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GUITHREADINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `GUITHREADINFO_FLAGS` = UInt;
public const val `GUI_16BITTASK`: UInt = 0u;
public const val `GUI_CARETBLINKING`: `GUITHREADINFO_FLAGS` = 1u;
public const val `GUI_INMENUMODE`: `GUITHREADINFO_FLAGS` = 4u;
public const val `GUI_INMOVESIZE`: `GUITHREADINFO_FLAGS` = 2u;
public const val `GUI_POPUPMENUMODE`: `GUITHREADINFO_FLAGS` = 16u;
public const val `GUI_SYSTEMMENUMODE`: `GUITHREADINFO_FLAGS` = 8u;
public const val `GWFS_INCLUDE_ANCESTORS`: UInt = 1u;
public const val `GWLP_HINSTANCE`: `WINDOW_LONG_PTR_INDEX` = -6;
public const val `GWLP_HWNDPARENT`: `WINDOW_LONG_PTR_INDEX` = -8;
public const val `GWLP_ID`: `WINDOW_LONG_PTR_INDEX` = -12;
public const val `GWLP_USERDATA`: `WINDOW_LONG_PTR_INDEX` = -21;
public const val `GWLP_WNDPROC`: `WINDOW_LONG_PTR_INDEX` = -4;
public const val `GWL_EXSTYLE`: `WINDOW_LONG_PTR_INDEX` = -20;
public const val `GWL_HINSTANCE`: `WINDOW_LONG_PTR_INDEX` = -6;
public const val `GWL_HWNDPARENT`: `WINDOW_LONG_PTR_INDEX` = -8;
public const val `GWL_ID`: `WINDOW_LONG_PTR_INDEX` = -12;
public const val `GWL_STYLE`: `WINDOW_LONG_PTR_INDEX` = -16;
public const val `GWL_USERDATA`: `WINDOW_LONG_PTR_INDEX` = -21;
public const val `GWL_WNDPROC`: `WINDOW_LONG_PTR_INDEX` = -4;
public const val `GW_CHILD`: `GET_WINDOW_CMD` = 5u;
public const val `GW_ENABLEDPOPUP`: `GET_WINDOW_CMD` = 6u;
public const val `GW_HWNDFIRST`: `GET_WINDOW_CMD` = 0u;
public const val `GW_HWNDLAST`: `GET_WINDOW_CMD` = 1u;
public const val `GW_HWNDNEXT`: `GET_WINDOW_CMD` = 2u;
public const val `GW_HWNDPREV`: `GET_WINDOW_CMD` = 3u;
public const val `GW_MAX`: UInt = 5u;
public const val `GW_OWNER`: `GET_WINDOW_CMD` = 4u;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HACCEL` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public typealias `HANDEDNESS` = Int;
public const val `HANDEDNESS_LEFT`: `HANDEDNESS` = 0;
public const val `HANDEDNESS_RIGHT`: `HANDEDNESS` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HARDWAREHOOKSTRUCT` (
    public var `hwnd`: `super`.`super`.`Foundation`.`HWND`,
    public var `message`: UInt,
    public var `wParam`: `super`.`super`.`Foundation`.`WPARAM`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
)
// UNSUPPORTED Rust 1494:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HARDWAREHOOKSTRUCT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1499:1: attribute cfg requires explicit semantics/configuration; syntax: constant expression has no syntax candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub const HBMMENU_CALLBACK: super::super::Graphics::Gdi::HBITMAP = -1i32 as _;

// UNSUPPORTED Rust 1501:1: attribute cfg requires explicit semantics/configuration; syntax: constant expression has no syntax candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub const HBMMENU_MBAR_CLOSE: super::super::Graphics::Gdi::HBITMAP = 5i32 as _;

// UNSUPPORTED Rust 1503:1: attribute cfg requires explicit semantics/configuration; syntax: constant expression has no syntax candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub const HBMMENU_MBAR_CLOSE_D: super::super::Graphics::Gdi::HBITMAP = 6i32 as _;

// UNSUPPORTED Rust 1505:1: attribute cfg requires explicit semantics/configuration; syntax: constant expression has no syntax candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub const HBMMENU_MBAR_MINIMIZE: super::super::Graphics::Gdi::HBITMAP = 3i32 as _;

// UNSUPPORTED Rust 1507:1: attribute cfg requires explicit semantics/configuration; syntax: constant expression has no syntax candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub const HBMMENU_MBAR_MINIMIZE_D: super::super::Graphics::Gdi::HBITMAP = 7i32 as _;

// UNSUPPORTED Rust 1509:1: attribute cfg requires explicit semantics/configuration; syntax: constant expression has no syntax candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub const HBMMENU_MBAR_RESTORE: super::super::Graphics::Gdi::HBITMAP = 2i32 as _;

// UNSUPPORTED Rust 1511:1: attribute cfg requires explicit semantics/configuration; syntax: constant expression has no syntax candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub const HBMMENU_POPUP_CLOSE: super::super::Graphics::Gdi::HBITMAP = 8i32 as _;

// UNSUPPORTED Rust 1513:1: attribute cfg requires explicit semantics/configuration; syntax: constant expression has no syntax candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub const HBMMENU_POPUP_MAXIMIZE: super::super::Graphics::Gdi::HBITMAP = 10i32 as _;

// UNSUPPORTED Rust 1515:1: attribute cfg requires explicit semantics/configuration; syntax: constant expression has no syntax candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub const HBMMENU_POPUP_MINIMIZE: super::super::Graphics::Gdi::HBITMAP = 11i32 as _;

// UNSUPPORTED Rust 1517:1: attribute cfg requires explicit semantics/configuration; syntax: constant expression has no syntax candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub const HBMMENU_POPUP_RESTORE: super::super::Graphics::Gdi::HBITMAP = 9i32 as _;

// UNSUPPORTED Rust 1519:1: attribute cfg requires explicit semantics/configuration; syntax: constant expression has no syntax candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub const HBMMENU_SYSTEM: super::super::Graphics::Gdi::HBITMAP = 1i32 as _;

public const val `HCBT_ACTIVATE`: UInt = 5u;
public const val `HCBT_CLICKSKIPPED`: UInt = 6u;
public const val `HCBT_CREATEWND`: UInt = 3u;
public const val `HCBT_DESTROYWND`: UInt = 4u;
public const val `HCBT_KEYSKIPPED`: UInt = 7u;
public const val `HCBT_MINMAX`: UInt = 1u;
public const val `HCBT_MOVESIZE`: UInt = 0u;
public const val `HCBT_QS`: UInt = 2u;
public const val `HCBT_SETFOCUS`: UInt = 9u;
public const val `HCBT_SYSCOMMAND`: UInt = 8u;
public const val `HCF_DEFAULTDESKTOP`: UInt = 512u;
public const val `HCF_LOGONDESKTOP`: UInt = 256u;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HCURSOR` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public const val `HC_ACTION`: UInt = 0u;
public const val `HC_GETNEXT`: UInt = 1u;
public const val `HC_NOREM`: UInt = 3u;
public const val `HC_NOREMOVE`: UInt = 3u;
public const val `HC_SKIP`: UInt = 2u;
public const val `HC_SYSMODALOFF`: UInt = 5u;
public const val `HC_SYSMODALON`: UInt = 4u;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDEVNOTIFY` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDWP` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public const val `HELP_COMMAND`: Int = 258;
public const val `HELP_CONTENTS`: Int = 3;
public const val `HELP_CONTEXT`: Int = 1;
public const val `HELP_CONTEXTMENU`: UInt = 10u;
public const val `HELP_CONTEXTPOPUP`: Int = 8;
public const val `HELP_FINDER`: UInt = 11u;
public const val `HELP_FORCEFILE`: Int = 9;
public const val `HELP_HELPONHELP`: Int = 4;
public const val `HELP_INDEX`: Int = 3;
public const val `HELP_KEY`: Int = 257;
public const val `HELP_MULTIKEY`: Int = 513;
public const val `HELP_PARTIALKEY`: Int = 261;
public const val `HELP_QUIT`: Int = 2;
public const val `HELP_SETCONTENTS`: Int = 5;
public const val `HELP_SETINDEX`: Int = 5;
public const val `HELP_SETPOPUP_POS`: UInt = 13u;
public const val `HELP_SETWINPOS`: Int = 515;
public const val `HELP_TCARD`: UInt = 32768u;
public const val `HELP_TCARD_DATA`: UInt = 16u;
public const val `HELP_TCARD_OTHER_CALLER`: UInt = 17u;
public const val `HELP_WM_HELP`: UInt = 12u;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HHOOK` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HICON` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public const val `HIDE_WINDOW`: UInt = 0u;
public const val `HKL_NEXT`: UInt = 1u;
public const val `HKL_PREV`: UInt = 0u;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HMENU` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HOOKPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Int, `super`.`super`.`Foundation`.`WPARAM`, `super`.`super`.`Foundation`.`LPARAM`) -> `super`.`super`.`Foundation`.`LRESULT`>>>;
public const val `HSHELL_ACCESSIBILITYSTATE`: UInt = 11u;
public const val `HSHELL_ACTIVATESHELLWINDOW`: UInt = 3u;
public const val `HSHELL_APPCOMMAND`: UInt = 12u;
public const val `HSHELL_ENDTASK`: UInt = 10u;
public const val `HSHELL_GETMINRECT`: UInt = 5u;
public const val `HSHELL_HIGHBIT`: UInt = 32768u;
public const val `HSHELL_LANGUAGE`: UInt = 8u;
public const val `HSHELL_MONITORCHANGED`: UInt = 16u;
public const val `HSHELL_REDRAW`: UInt = 6u;
public const val `HSHELL_SYSMENU`: UInt = 9u;
public const val `HSHELL_TASKMAN`: UInt = 7u;
public const val `HSHELL_WINDOWACTIVATED`: UInt = 4u;
public const val `HSHELL_WINDOWCREATED`: UInt = 1u;
public const val `HSHELL_WINDOWDESTROYED`: UInt = 2u;
public const val `HSHELL_WINDOWREPLACED`: UInt = 13u;
public const val `HSHELL_WINDOWREPLACING`: UInt = 14u;
public const val `HTBORDER`: UInt = 18u;
public const val `HTBOTTOM`: UInt = 15u;
public const val `HTBOTTOMLEFT`: UInt = 16u;
public const val `HTBOTTOMRIGHT`: UInt = 17u;
public const val `HTCAPTION`: UInt = 2u;
public const val `HTCLIENT`: UInt = 1u;
public const val `HTCLOSE`: UInt = 20u;
public const val `HTERROR`: Int = -2;
public const val `HTGROWBOX`: UInt = 4u;
public const val `HTHELP`: UInt = 21u;
public const val `HTHSCROLL`: UInt = 6u;
public const val `HTLEFT`: UInt = 10u;
public const val `HTMAXBUTTON`: UInt = 9u;
public const val `HTMENU`: UInt = 5u;
public const val `HTMINBUTTON`: UInt = 8u;
public const val `HTNOWHERE`: UInt = 0u;
public const val `HTOBJECT`: UInt = 19u;
public const val `HTREDUCE`: UInt = 8u;
public const val `HTRIGHT`: UInt = 11u;
public const val `HTSIZE`: UInt = 4u;
public const val `HTSIZEFIRST`: UInt = 10u;
public const val `HTSIZELAST`: UInt = 17u;
public const val `HTSYSMENU`: UInt = 3u;
public const val `HTTOP`: UInt = 12u;
public const val `HTTOPLEFT`: UInt = 13u;
public const val `HTTOPRIGHT`: UInt = 14u;
public const val `HTTRANSPARENT`: Int = -1;
public const val `HTVSCROLL`: UInt = 7u;
public const val `HTZOOM`: UInt = 9u;
// UNSUPPORTED Rust 1616:1: qualified type requires source-backed binding: super::super::Foundation::HWND; syntax: constant expression has no syntax candidate rule
// pub const HWND_BOTTOM: super::super::Foundation::HWND = 1i32 as _;

// UNSUPPORTED Rust 1617:1: qualified type requires source-backed binding: super::super::Foundation::HWND; syntax: constant expression has no syntax candidate rule
// pub const HWND_BROADCAST: super::super::Foundation::HWND = 65535i32 as _;

// UNSUPPORTED Rust 1618:1: qualified type requires source-backed binding: super::super::Foundation::HWND; syntax: constant expression has no syntax candidate rule
// pub const HWND_DESKTOP: super::super::Foundation::HWND = 0i32 as _;

// UNSUPPORTED Rust 1619:1: qualified type requires source-backed binding: super::super::Foundation::HWND; syntax: constant expression has no syntax candidate rule
// pub const HWND_MESSAGE: super::super::Foundation::HWND = -3i32 as _;

// UNSUPPORTED Rust 1620:1: qualified type requires source-backed binding: super::super::Foundation::HWND; syntax: constant expression has no syntax candidate rule
// pub const HWND_NOTOPMOST: super::super::Foundation::HWND = -2i32 as _;

// UNSUPPORTED Rust 1621:1: qualified type requires source-backed binding: super::super::Foundation::HWND; syntax: constant expression has no syntax candidate rule
// pub const HWND_TOP: super::super::Foundation::HWND = 0i32 as _;

// UNSUPPORTED Rust 1622:1: qualified type requires source-backed binding: super::super::Foundation::HWND; syntax: constant expression has no syntax candidate rule
// pub const HWND_TOPMOST: super::super::Foundation::HWND = -1i32 as _;

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ICONINFO` (
    public var `fIcon`: `windows_sys`.`core`.`BOOL`,
    public var `xHotspot`: UInt,
    public var `yHotspot`: UInt,
    public var `hbmMask`: `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
    public var `hbmColor`: `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
)
// UNSUPPORTED Rust 1633:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for ICONINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ICONINFOEXA` (
    public var `cbSize`: UInt,
    public var `fIcon`: `windows_sys`.`core`.`BOOL`,
    public var `xHotspot`: UInt,
    public var `yHotspot`: UInt,
    public var `hbmMask`: `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
    public var `hbmColor`: `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
    public var `wResID`: UShort,
    public var `szModName`: ByteArray,
    public var `szResName`: ByteArray,
)
// UNSUPPORTED Rust 1653:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for ICONINFOEXA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ICONINFOEXW` (
    public var `cbSize`: UInt,
    public var `fIcon`: `windows_sys`.`core`.`BOOL`,
    public var `xHotspot`: UInt,
    public var `yHotspot`: UInt,
    public var `hbmMask`: `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
    public var `hbmColor`: `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
    public var `wResID`: UShort,
    public var `szModName`: UShortArray,
    public var `szResName`: UShortArray,
)
// UNSUPPORTED Rust 1673:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for ICONINFOEXW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ICONMETRICSA` (
    public var `cbSize`: UInt,
    public var `iHorzSpacing`: Int,
    public var `iVertSpacing`: Int,
    public var `iTitleWrap`: Int,
    public var `lfFont`: `super`.`super`.`Graphics`.`Gdi`.`LOGFONTA`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ICONMETRICSW` (
    public var `cbSize`: UInt,
    public var `iHorzSpacing`: Int,
    public var `iVertSpacing`: Int,
    public var `iTitleWrap`: Int,
    public var `lfFont`: `super`.`super`.`Graphics`.`Gdi`.`LOGFONTW`,
)
public const val `ICON_BIG`: UInt = 1u;
public const val `ICON_SMALL`: UInt = 0u;
public const val `ICON_SMALL2`: UInt = 2u;
public const val `IDABORT`: `MESSAGEBOX_RESULT` = 3;
public const val `IDANI_CAPTION`: UInt = 3u;
public const val `IDANI_OPEN`: UInt = 1u;
public const val `IDASYNC`: `MESSAGEBOX_RESULT` = 32001;
public const val `IDCANCEL`: `MESSAGEBOX_RESULT` = 2;
public const val `IDCLOSE`: `MESSAGEBOX_RESULT` = 8;
public const val `IDCONTINUE`: `MESSAGEBOX_RESULT` = 11;
// UNSUPPORTED Rust 1709:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const IDC_APPSTARTING: windows_sys::core::PCWSTR = 32650u16 as _;

// UNSUPPORTED Rust 1710:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const IDC_ARROW: windows_sys::core::PCWSTR = 32512u16 as _;

// UNSUPPORTED Rust 1711:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const IDC_CROSS: windows_sys::core::PCWSTR = 32515u16 as _;

// UNSUPPORTED Rust 1712:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const IDC_HAND: windows_sys::core::PCWSTR = 32649u16 as _;

// UNSUPPORTED Rust 1713:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const IDC_HELP: windows_sys::core::PCWSTR = 32651u16 as _;

// UNSUPPORTED Rust 1714:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const IDC_IBEAM: windows_sys::core::PCWSTR = 32513u16 as _;

// UNSUPPORTED Rust 1715:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const IDC_ICON: windows_sys::core::PCWSTR = 32641u16 as _;

// UNSUPPORTED Rust 1716:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const IDC_NO: windows_sys::core::PCWSTR = 32648u16 as _;

// UNSUPPORTED Rust 1717:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const IDC_PERSON: windows_sys::core::PCWSTR = 32672u16 as _;

// UNSUPPORTED Rust 1718:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const IDC_PIN: windows_sys::core::PCWSTR = 32671u16 as _;

// UNSUPPORTED Rust 1719:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const IDC_SIZE: windows_sys::core::PCWSTR = 32640u16 as _;

// UNSUPPORTED Rust 1720:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const IDC_SIZEALL: windows_sys::core::PCWSTR = 32646u16 as _;

// UNSUPPORTED Rust 1721:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const IDC_SIZENESW: windows_sys::core::PCWSTR = 32643u16 as _;

// UNSUPPORTED Rust 1722:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const IDC_SIZENS: windows_sys::core::PCWSTR = 32645u16 as _;

// UNSUPPORTED Rust 1723:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const IDC_SIZENWSE: windows_sys::core::PCWSTR = 32642u16 as _;

// UNSUPPORTED Rust 1724:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const IDC_SIZEWE: windows_sys::core::PCWSTR = 32644u16 as _;

public const val `IDC_STATIC`: Int = -1;
// UNSUPPORTED Rust 1726:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const IDC_UPARROW: windows_sys::core::PCWSTR = 32516u16 as _;

// UNSUPPORTED Rust 1727:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const IDC_WAIT: windows_sys::core::PCWSTR = 32514u16 as _;

public const val `IDHELP`: `MESSAGEBOX_RESULT` = 9;
public const val `IDHOT_SNAPDESKTOP`: Int = -2;
public const val `IDHOT_SNAPWINDOW`: Int = -1;
public const val `IDH_CANCEL`: UInt = 28444u;
public const val `IDH_GENERIC_HELP_BUTTON`: UInt = 28442u;
public const val `IDH_HELP`: UInt = 28445u;
public const val `IDH_MISSING_CONTEXT`: UInt = 28441u;
public const val `IDH_NO_HELP`: UInt = 28440u;
public const val `IDH_OK`: UInt = 28443u;
public const val `IDIGNORE`: `MESSAGEBOX_RESULT` = 5;
// UNSUPPORTED Rust 1738:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const IDI_APPLICATION: windows_sys::core::PCWSTR = 32512u32 as _;

// UNSUPPORTED Rust 1739:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const IDI_ASTERISK: windows_sys::core::PCWSTR = 32516u32 as _;

// UNSUPPORTED Rust 1740:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const IDI_ERROR: windows_sys::core::PCWSTR = 32513u32 as _;

// UNSUPPORTED Rust 1741:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const IDI_EXCLAMATION: windows_sys::core::PCWSTR = 32515u32 as _;

// UNSUPPORTED Rust 1742:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const IDI_HAND: windows_sys::core::PCWSTR = 32513u32 as _;

// UNSUPPORTED Rust 1743:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const IDI_INFORMATION: windows_sys::core::PCWSTR = 32516u32 as _;

// UNSUPPORTED Rust 1744:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const IDI_QUESTION: windows_sys::core::PCWSTR = 32514u32 as _;

// UNSUPPORTED Rust 1745:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const IDI_SHIELD: windows_sys::core::PCWSTR = 32518u32 as _;

// UNSUPPORTED Rust 1746:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const IDI_WARNING: windows_sys::core::PCWSTR = 32515u32 as _;

// UNSUPPORTED Rust 1747:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const IDI_WINLOGO: windows_sys::core::PCWSTR = 32517u32 as _;

public const val `IDNO`: `MESSAGEBOX_RESULT` = 7;
public const val `IDOK`: `MESSAGEBOX_RESULT` = 1;
public const val `IDRETRY`: `MESSAGEBOX_RESULT` = 4;
public const val `IDTIMEOUT`: `MESSAGEBOX_RESULT` = 32000;
public const val `IDTRYAGAIN`: `MESSAGEBOX_RESULT` = 10;
public const val `IDYES`: `MESSAGEBOX_RESULT` = 6;
public const val `IMAGE_BITMAP`: `GDI_IMAGE_TYPE` = 0u;
public const val `IMAGE_CURSOR`: `GDI_IMAGE_TYPE` = 2u;
public const val `IMAGE_ENHMETAFILE`: UInt = 3u;
public typealias `IMAGE_FLAGS` = UInt;
public const val `IMAGE_ICON`: `GDI_IMAGE_TYPE` = 1u;
public const val `INDEXID_CONTAINER`: UInt = 0u;
public const val `INDEXID_OBJECT`: UInt = 0u;
public const val `INPUTLANGCHANGE_BACKWARD`: UInt = 4u;
public const val `INPUTLANGCHANGE_FORWARD`: UInt = 2u;
public const val `INPUTLANGCHANGE_SYSCHARSET`: UInt = 1u;
public const val `ISMEX_CALLBACK`: UInt = 4u;
public const val `ISMEX_NOSEND`: UInt = 0u;
public const val `ISMEX_NOTIFY`: UInt = 2u;
public const val `ISMEX_REPLIED`: UInt = 8u;
public const val `ISMEX_SEND`: UInt = 1u;
public const val `ISOLATIONAWARE_MANIFEST_RESOURCE_ID`: UInt = 2u;
public const val `ISOLATIONAWARE_NOSTATICIMPORT_MANIFEST_RESOURCE_ID`: UInt = 3u;
public const val `ISOLATIONPOLICY_BROWSER_MANIFEST_RESOURCE_ID`: UInt = 5u;
public const val `ISOLATIONPOLICY_MANIFEST_RESOURCE_ID`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IndexedResourceQualifier` (
    public var `name`: `windows_sys`.`core`.`PWSTR`,
    public var `value`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1779:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IndexedResourceQualifier {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KBDLLHOOKSTRUCT` (
    public var `vkCode`: UInt,
    public var `scanCode`: UInt,
    public var `flags`: `KBDLLHOOKSTRUCT_FLAGS`,
    public var `time`: UInt,
    public var `dwExtraInfo`: ULong,
)
public typealias `KBDLLHOOKSTRUCT_FLAGS` = UInt;
public const val `KF_ALTDOWN`: UInt = 8192u;
public const val `KF_DLGMODE`: UInt = 2048u;
public const val `KF_EXTENDED`: UInt = 256u;
public const val `KF_MENUMODE`: UInt = 4096u;
public const val `KF_REPEAT`: UInt = 16384u;
public const val `KF_UP`: UInt = 32768u;
public const val `KL_NAMELENGTH`: UInt = 9u;
public typealias `LAYERED_WINDOW_ATTRIBUTES_FLAGS` = UInt;
public const val `LBN_DBLCLK`: UInt = 2u;
public const val `LBN_ERRSPACE`: Int = -2;
public const val `LBN_KILLFOCUS`: UInt = 5u;
public const val `LBN_SELCANCEL`: UInt = 3u;
public const val `LBN_SELCHANGE`: UInt = 1u;
public const val `LBN_SETFOCUS`: UInt = 4u;
public const val `LBS_COMBOBOX`: Int = 32768;
public const val `LBS_DISABLENOSCROLL`: Int = 4096;
public const val `LBS_EXTENDEDSEL`: Int = 2048;
public const val `LBS_HASSTRINGS`: Int = 64;
public const val `LBS_MULTICOLUMN`: Int = 512;
public const val `LBS_MULTIPLESEL`: Int = 8;
public const val `LBS_NODATA`: Int = 8192;
public const val `LBS_NOINTEGRALHEIGHT`: Int = 256;
public const val `LBS_NOREDRAW`: Int = 4;
public const val `LBS_NOSEL`: Int = 16384;
public const val `LBS_NOTIFY`: Int = 1;
public const val `LBS_OWNERDRAWFIXED`: Int = 16;
public const val `LBS_OWNERDRAWVARIABLE`: Int = 32;
public const val `LBS_SORT`: Int = 2;
public const val `LBS_STANDARD`: Int = 10485763;
public const val `LBS_USETABSTOPS`: Int = 128;
public const val `LBS_WANTKEYBOARDINPUT`: Int = 1024;
public const val `LB_ADDFILE`: UInt = 406u;
public const val `LB_ADDSTRING`: UInt = 384u;
public const val `LB_CTLCODE`: Int = 0;
public const val `LB_DELETESTRING`: UInt = 386u;
public const val `LB_DIR`: UInt = 397u;
public const val `LB_ERR`: Int = -1;
public const val `LB_ERRSPACE`: Int = -2;
public const val `LB_FINDSTRING`: UInt = 399u;
public const val `LB_FINDSTRINGEXACT`: UInt = 418u;
public const val `LB_GETANCHORINDEX`: UInt = 413u;
public const val `LB_GETCARETINDEX`: UInt = 415u;
public const val `LB_GETCOUNT`: UInt = 395u;
public const val `LB_GETCURSEL`: UInt = 392u;
public const val `LB_GETHORIZONTALEXTENT`: UInt = 403u;
public const val `LB_GETITEMDATA`: UInt = 409u;
public const val `LB_GETITEMHEIGHT`: UInt = 417u;
public const val `LB_GETITEMRECT`: UInt = 408u;
public const val `LB_GETLISTBOXINFO`: UInt = 434u;
public const val `LB_GETLOCALE`: UInt = 422u;
public const val `LB_GETSEL`: UInt = 391u;
public const val `LB_GETSELCOUNT`: UInt = 400u;
public const val `LB_GETSELITEMS`: UInt = 401u;
public const val `LB_GETTEXT`: UInt = 393u;
public const val `LB_GETTEXTLEN`: UInt = 394u;
public const val `LB_GETTOPINDEX`: UInt = 398u;
public const val `LB_INITSTORAGE`: UInt = 424u;
public const val `LB_INSERTSTRING`: UInt = 385u;
public const val `LB_ITEMFROMPOINT`: UInt = 425u;
public const val `LB_MSGMAX`: UInt = 435u;
public const val `LB_MULTIPLEADDSTRING`: UInt = 433u;
public const val `LB_OKAY`: UInt = 0u;
public const val `LB_RESETCONTENT`: UInt = 388u;
public const val `LB_SELECTSTRING`: UInt = 396u;
public const val `LB_SELITEMRANGE`: UInt = 411u;
public const val `LB_SELITEMRANGEEX`: UInt = 387u;
public const val `LB_SETANCHORINDEX`: UInt = 412u;
public const val `LB_SETCARETINDEX`: UInt = 414u;
public const val `LB_SETCOLUMNWIDTH`: UInt = 405u;
public const val `LB_SETCOUNT`: UInt = 423u;
public const val `LB_SETCURSEL`: UInt = 390u;
public const val `LB_SETHORIZONTALEXTENT`: UInt = 404u;
public const val `LB_SETITEMDATA`: UInt = 410u;
public const val `LB_SETITEMHEIGHT`: UInt = 416u;
public const val `LB_SETLOCALE`: UInt = 421u;
public const val `LB_SETSEL`: UInt = 389u;
public const val `LB_SETTABSTOPS`: UInt = 402u;
public const val `LB_SETTOPINDEX`: UInt = 407u;
public const val `LLKHF_ALTDOWN`: `KBDLLHOOKSTRUCT_FLAGS` = 32u;
public const val `LLKHF_EXTENDED`: `KBDLLHOOKSTRUCT_FLAGS` = 1u;
public const val `LLKHF_INJECTED`: `KBDLLHOOKSTRUCT_FLAGS` = 16u;
public const val `LLKHF_LOWER_IL_INJECTED`: `KBDLLHOOKSTRUCT_FLAGS` = 2u;
public const val `LLKHF_UP`: `KBDLLHOOKSTRUCT_FLAGS` = 128u;
public const val `LLMHF_INJECTED`: UInt = 1u;
public const val `LLMHF_LOWER_IL_INJECTED`: UInt = 2u;
public const val `LOCKF_LOGICAL_LOCK`: UInt = 0u;
public const val `LOCKF_PHYSICAL_LOCK`: UInt = 1u;
public const val `LOCKP_ALLOW_MEM_MAPPING`: UInt = 0u;
public const val `LOCKP_ALLOW_WRITES`: UInt = 1u;
public const val `LOCKP_FAIL_MEM_MAPPING`: UInt = 2u;
public const val `LOCKP_FAIL_WRITES`: UInt = 0u;
public const val `LOCKP_LOCK_FOR_FORMAT`: UInt = 4u;
public const val `LOCKP_USER_MASK`: UInt = 3u;
public const val `LR_COLOR`: UInt = 2u;
public const val `LR_COPYDELETEORG`: `IMAGE_FLAGS` = 8u;
public const val `LR_COPYFROMRESOURCE`: `IMAGE_FLAGS` = 16384u;
public const val `LR_COPYRETURNORG`: `IMAGE_FLAGS` = 4u;
public const val `LR_CREATEDIBSECTION`: `IMAGE_FLAGS` = 8192u;
public const val `LR_DEFAULTCOLOR`: `IMAGE_FLAGS` = 0u;
public const val `LR_DEFAULTSIZE`: `IMAGE_FLAGS` = 64u;
public const val `LR_LOADFROMFILE`: `IMAGE_FLAGS` = 16u;
public const val `LR_LOADMAP3DCOLORS`: `IMAGE_FLAGS` = 4096u;
public const val `LR_LOADTRANSPARENT`: `IMAGE_FLAGS` = 32u;
public const val `LR_MONOCHROME`: `IMAGE_FLAGS` = 1u;
public const val `LR_SHARED`: `IMAGE_FLAGS` = 32768u;
public const val `LR_VGACOLOR`: `IMAGE_FLAGS` = 128u;
public const val `LSFW_LOCK`: `FOREGROUND_WINDOW_LOCK_CODE` = 1u;
public const val `LSFW_UNLOCK`: `FOREGROUND_WINDOW_LOCK_CODE` = 2u;
public const val `LWA_ALPHA`: `LAYERED_WINDOW_ATTRIBUTES_FLAGS` = 2u;
public const val `LWA_COLORKEY`: `LAYERED_WINDOW_ATTRIBUTES_FLAGS` = 1u;
public const val `MAXIMUM_RESERVED_MANIFEST_RESOURCE_ID`: UInt = 16u;
public const val `MAX_LOGICALDPIOVERRIDE`: UInt = 2u;
public const val `MAX_STR_BLOCKREASON`: UInt = 256u;
public const val `MAX_TOUCH_COUNT`: UInt = 256u;
public const val `MAX_TOUCH_PREDICTION_FILTER_TAPS`: UInt = 3u;
public const val `MA_ACTIVATE`: UInt = 1u;
public const val `MA_ACTIVATEANDEAT`: UInt = 2u;
public const val `MA_NOACTIVATE`: UInt = 3u;
public const val `MA_NOACTIVATEANDEAT`: UInt = 4u;
public const val `MB_ABORTRETRYIGNORE`: `MESSAGEBOX_STYLE` = 2u;
public const val `MB_APPLMODAL`: `MESSAGEBOX_STYLE` = 0u;
public const val `MB_CANCELTRYCONTINUE`: `MESSAGEBOX_STYLE` = 6u;
public const val `MB_DEFAULT_DESKTOP_ONLY`: `MESSAGEBOX_STYLE` = 131072u;
public const val `MB_DEFBUTTON1`: `MESSAGEBOX_STYLE` = 0u;
public const val `MB_DEFBUTTON2`: `MESSAGEBOX_STYLE` = 256u;
public const val `MB_DEFBUTTON3`: `MESSAGEBOX_STYLE` = 512u;
public const val `MB_DEFBUTTON4`: `MESSAGEBOX_STYLE` = 768u;
public const val `MB_DEFMASK`: `MESSAGEBOX_STYLE` = 3840u;
public const val `MB_HELP`: `MESSAGEBOX_STYLE` = 16384u;
public const val `MB_ICONASTERISK`: `MESSAGEBOX_STYLE` = 64u;
public const val `MB_ICONERROR`: `MESSAGEBOX_STYLE` = 16u;
public const val `MB_ICONEXCLAMATION`: `MESSAGEBOX_STYLE` = 48u;
public const val `MB_ICONHAND`: `MESSAGEBOX_STYLE` = 16u;
public const val `MB_ICONINFORMATION`: `MESSAGEBOX_STYLE` = 64u;
public const val `MB_ICONMASK`: `MESSAGEBOX_STYLE` = 240u;
public const val `MB_ICONQUESTION`: `MESSAGEBOX_STYLE` = 32u;
public const val `MB_ICONSTOP`: `MESSAGEBOX_STYLE` = 16u;
public const val `MB_ICONWARNING`: `MESSAGEBOX_STYLE` = 48u;
public const val `MB_MISCMASK`: `MESSAGEBOX_STYLE` = 49152u;
public const val `MB_MODEMASK`: `MESSAGEBOX_STYLE` = 12288u;
public const val `MB_NOFOCUS`: `MESSAGEBOX_STYLE` = 32768u;
public const val `MB_OK`: `MESSAGEBOX_STYLE` = 0u;
public const val `MB_OKCANCEL`: `MESSAGEBOX_STYLE` = 1u;
public const val `MB_RETRYCANCEL`: `MESSAGEBOX_STYLE` = 5u;
public const val `MB_RIGHT`: `MESSAGEBOX_STYLE` = 524288u;
public const val `MB_RTLREADING`: `MESSAGEBOX_STYLE` = 1048576u;
public const val `MB_SERVICE_NOTIFICATION`: `MESSAGEBOX_STYLE` = 2097152u;
public const val `MB_SERVICE_NOTIFICATION_NT3X`: `MESSAGEBOX_STYLE` = 262144u;
public const val `MB_SETFOREGROUND`: `MESSAGEBOX_STYLE` = 65536u;
public const val `MB_SYSTEMMODAL`: `MESSAGEBOX_STYLE` = 4096u;
public const val `MB_TASKMODAL`: `MESSAGEBOX_STYLE` = 8192u;
public const val `MB_TOPMOST`: `MESSAGEBOX_STYLE` = 262144u;
public const val `MB_TYPEMASK`: `MESSAGEBOX_STYLE` = 15u;
public const val `MB_USERICON`: `MESSAGEBOX_STYLE` = 128u;
public const val `MB_YESNO`: `MESSAGEBOX_STYLE` = 4u;
public const val `MB_YESNOCANCEL`: `MESSAGEBOX_STYLE` = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MDICREATESTRUCTA` (
    public var `szClass`: `windows_sys`.`core`.`PCSTR`,
    public var `szTitle`: `windows_sys`.`core`.`PCSTR`,
    public var `hOwner`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `x`: Int,
    public var `y`: Int,
    public var `cx`: Int,
    public var `cy`: Int,
    public var `style`: `WINDOW_STYLE`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
)
// UNSUPPORTED Rust 1963:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MDICREATESTRUCTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MDICREATESTRUCTW` (
    public var `szClass`: `windows_sys`.`core`.`PCWSTR`,
    public var `szTitle`: `windows_sys`.`core`.`PCWSTR`,
    public var `hOwner`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `x`: Int,
    public var `y`: Int,
    public var `cx`: Int,
    public var `cy`: Int,
    public var `style`: `WINDOW_STYLE`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
)
// UNSUPPORTED Rust 1981:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MDICREATESTRUCTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MDINEXTMENU` (
    public var `hmenuIn`: `HMENU`,
    public var `hmenuNext`: `HMENU`,
    public var `hwndNext`: `super`.`super`.`Foundation`.`HWND`,
)
// UNSUPPORTED Rust 1993:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MDINEXTMENU {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MDIS_ALLCHILDSTYLES`: UInt = 1u;
public const val `MDITILE_HORIZONTAL`: `TILE_WINDOWS_HOW` = 1u;
public const val `MDITILE_SKIPDISABLED`: `CASCADE_WINDOWS_HOW` = 2u;
public const val `MDITILE_VERTICAL`: `TILE_WINDOWS_HOW` = 0u;
public const val `MDITILE_ZORDER`: `CASCADE_WINDOWS_HOW` = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MENUBARINFO` (
    public var `cbSize`: UInt,
    public var `rcBar`: `super`.`super`.`Foundation`.`RECT`,
    public var `hMenu`: `HMENU`,
    public var `hwndMenu`: `super`.`super`.`Foundation`.`HWND`,
    public var `_bitfield`: Int,
)
// UNSUPPORTED Rust 2012:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MENUBARINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MENUEX_TEMPLATE_HEADER` (
    public var `wVersion`: UShort,
    public var `wOffset`: UShort,
    public var `dwHelpId`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MENUEX_TEMPLATE_ITEM` (
    public var `dwType`: UInt,
    public var `dwState`: UInt,
    public var `uId`: UInt,
    public var `wFlags`: UShort,
    public var `szText`: UShortArray,
)
// UNSUPPORTED Rust 2033:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MENUEX_TEMPLATE_ITEM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MENUGETOBJECTINFO` (
    public var `dwFlags`: `MENUGETOBJECTINFO_FLAGS`,
    public var `uPos`: UInt,
    public var `hmenu`: `HMENU`,
    public var `riid`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pvObj`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 2047:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MENUGETOBJECTINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MENUGETOBJECTINFO_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MENUINFO` (
    public var `cbSize`: UInt,
    public var `fMask`: `MENUINFO_MASK`,
    public var `dwStyle`: `MENUINFO_STYLE`,
    public var `cyMax`: UInt,
    public var `hbrBack`: `super`.`super`.`Graphics`.`Gdi`.`HBRUSH`,
    public var `dwContextHelpID`: UInt,
    public var `dwMenuData`: ULong,
)
// UNSUPPORTED Rust 2065:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for MENUINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MENUINFO_MASK` = UInt;
public typealias `MENUINFO_STYLE` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MENUITEMINFOA` (
    public var `cbSize`: UInt,
    public var `fMask`: `MENU_ITEM_MASK`,
    public var `fType`: `MENU_ITEM_TYPE`,
    public var `fState`: `MENU_ITEM_STATE`,
    public var `wID`: UInt,
    public var `hSubMenu`: `HMENU`,
    public var `hbmpChecked`: `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
    public var `hbmpUnchecked`: `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
    public var `dwItemData`: ULong,
    public var `dwTypeData`: `windows_sys`.`core`.`PSTR`,
    public var `cch`: UInt,
    public var `hbmpItem`: `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
)
// UNSUPPORTED Rust 2090:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for MENUITEMINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MENUITEMINFOW` (
    public var `cbSize`: UInt,
    public var `fMask`: `MENU_ITEM_MASK`,
    public var `fType`: `MENU_ITEM_TYPE`,
    public var `fState`: `MENU_ITEM_STATE`,
    public var `wID`: UInt,
    public var `hSubMenu`: `HMENU`,
    public var `hbmpChecked`: `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
    public var `hbmpUnchecked`: `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
    public var `dwItemData`: ULong,
    public var `dwTypeData`: `windows_sys`.`core`.`PWSTR`,
    public var `cch`: UInt,
    public var `hbmpItem`: `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
)
// UNSUPPORTED Rust 2113:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for MENUITEMINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MENUITEMTEMPLATE` (
    public var `mtOption`: UShort,
    public var `mtID`: UShort,
    public var `mtString`: UShortArray,
)
// UNSUPPORTED Rust 2126:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MENUITEMTEMPLATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MENUITEMTEMPLATEHEADER` (
    public var `versionNumber`: UShort,
    public var `offset`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MENUTEMPLATEEX` (
    public var `Anonymous`: `MENUTEMPLATEEX_0`,
)
// UNSUPPORTED Rust 2142:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MENUTEMPLATEEX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2147:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MENUTEMPLATEEX_0 {
//     pub Menu: MENUTEMPLATEEX_0_0,
//     pub MenuEx: MENUTEMPLATEEX_0_1,
// }

// UNSUPPORTED Rust 2153:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MENUTEMPLATEEX_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MENUTEMPLATEEX_0_1` (
    public var `mexHeader`: `MENUEX_TEMPLATE_HEADER`,
    public var `mexItem`: Array<`MENUEX_TEMPLATE_ITEM`>,
)
// UNSUPPORTED Rust 2164:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MENUTEMPLATEEX_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MENUTEMPLATEEX_0_0` (
    public var `mitHeader`: `MENUITEMTEMPLATEHEADER`,
    public var `miTemplate`: Array<`MENUITEMTEMPLATE`>,
)
// UNSUPPORTED Rust 2175:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MENUTEMPLATEEX_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MENU_ITEM_FLAGS` = UInt;
public typealias `MENU_ITEM_MASK` = UInt;
public typealias `MENU_ITEM_STATE` = UInt;
public typealias `MENU_ITEM_TYPE` = UInt;
public typealias `MESSAGEBOX_RESULT` = Int;
public typealias `MESSAGEBOX_STYLE` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MESSAGE_RESOURCE_BLOCK` (
    public var `LowId`: UInt,
    public var `HighId`: UInt,
    public var `OffsetToEntries`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MESSAGE_RESOURCE_DATA` (
    public var `NumberOfBlocks`: UInt,
    public var `Blocks`: Array<`MESSAGE_RESOURCE_BLOCK`>,
)
// UNSUPPORTED Rust 2199:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MESSAGE_RESOURCE_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MESSAGE_RESOURCE_ENTRY` (
    public var `Length`: UShort,
    public var `Flags`: UShort,
    public var `Text`: UByteArray,
)
// UNSUPPORTED Rust 2211:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MESSAGE_RESOURCE_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `METRICS_USEDEFAULT`: Int = -1;
public const val `MFS_CHECKED`: `MENU_ITEM_STATE` = 8u;
public const val `MFS_DEFAULT`: `MENU_ITEM_STATE` = 4096u;
public const val `MFS_DISABLED`: `MENU_ITEM_STATE` = 3u;
public const val `MFS_ENABLED`: `MENU_ITEM_STATE` = 0u;
public const val `MFS_GRAYED`: `MENU_ITEM_STATE` = 3u;
public const val `MFS_HILITE`: `MENU_ITEM_STATE` = 128u;
public const val `MFS_UNCHECKED`: `MENU_ITEM_STATE` = 0u;
public const val `MFS_UNHILITE`: `MENU_ITEM_STATE` = 0u;
public const val `MFT_BITMAP`: `MENU_ITEM_TYPE` = 4u;
public const val `MFT_MENUBARBREAK`: `MENU_ITEM_TYPE` = 32u;
public const val `MFT_MENUBREAK`: `MENU_ITEM_TYPE` = 64u;
public const val `MFT_OWNERDRAW`: `MENU_ITEM_TYPE` = 256u;
public const val `MFT_RADIOCHECK`: `MENU_ITEM_TYPE` = 512u;
public const val `MFT_RIGHTJUSTIFY`: `MENU_ITEM_TYPE` = 16384u;
public const val `MFT_RIGHTORDER`: `MENU_ITEM_TYPE` = 8192u;
public const val `MFT_SEPARATOR`: `MENU_ITEM_TYPE` = 2048u;
public const val `MFT_STRING`: `MENU_ITEM_TYPE` = 0u;
public const val `MF_APPEND`: `MENU_ITEM_FLAGS` = 256u;
public const val `MF_BITMAP`: `MENU_ITEM_FLAGS` = 4u;
public const val `MF_BYCOMMAND`: `MENU_ITEM_FLAGS` = 0u;
public const val `MF_BYPOSITION`: `MENU_ITEM_FLAGS` = 1024u;
public const val `MF_CHANGE`: `MENU_ITEM_FLAGS` = 128u;
public const val `MF_CHECKED`: `MENU_ITEM_FLAGS` = 8u;
public const val `MF_DEFAULT`: `MENU_ITEM_FLAGS` = 4096u;
public const val `MF_DELETE`: `MENU_ITEM_FLAGS` = 512u;
public const val `MF_DISABLED`: `MENU_ITEM_FLAGS` = 2u;
public const val `MF_ENABLED`: `MENU_ITEM_FLAGS` = 0u;
public const val `MF_END`: `MENU_ITEM_FLAGS` = 128u;
public const val `MF_GRAYED`: `MENU_ITEM_FLAGS` = 1u;
public const val `MF_HELP`: `MENU_ITEM_FLAGS` = 16384u;
public const val `MF_HILITE`: `MENU_ITEM_FLAGS` = 128u;
public const val `MF_INSERT`: `MENU_ITEM_FLAGS` = 0u;
public const val `MF_MENUBARBREAK`: `MENU_ITEM_FLAGS` = 32u;
public const val `MF_MENUBREAK`: `MENU_ITEM_FLAGS` = 64u;
public const val `MF_MOUSESELECT`: `MENU_ITEM_FLAGS` = 32768u;
public const val `MF_OWNERDRAW`: `MENU_ITEM_FLAGS` = 256u;
public const val `MF_POPUP`: `MENU_ITEM_FLAGS` = 16u;
public const val `MF_REMOVE`: `MENU_ITEM_FLAGS` = 4096u;
public const val `MF_RIGHTJUSTIFY`: `MENU_ITEM_FLAGS` = 16384u;
public const val `MF_SEPARATOR`: `MENU_ITEM_FLAGS` = 2048u;
public const val `MF_STRING`: `MENU_ITEM_FLAGS` = 0u;
public const val `MF_SYSMENU`: `MENU_ITEM_FLAGS` = 8192u;
public const val `MF_UNCHECKED`: `MENU_ITEM_FLAGS` = 0u;
public const val `MF_UNHILITE`: `MENU_ITEM_FLAGS` = 0u;
public const val `MF_USECHECKBITMAPS`: `MENU_ITEM_FLAGS` = 512u;
public const val `MIIM_BITMAP`: `MENU_ITEM_MASK` = 128u;
public const val `MIIM_CHECKMARKS`: `MENU_ITEM_MASK` = 8u;
public const val `MIIM_DATA`: `MENU_ITEM_MASK` = 32u;
public const val `MIIM_FTYPE`: `MENU_ITEM_MASK` = 256u;
public const val `MIIM_ID`: `MENU_ITEM_MASK` = 2u;
public const val `MIIM_STATE`: `MENU_ITEM_MASK` = 1u;
public const val `MIIM_STRING`: `MENU_ITEM_MASK` = 64u;
public const val `MIIM_SUBMENU`: `MENU_ITEM_MASK` = 4u;
public const val `MIIM_TYPE`: `MENU_ITEM_MASK` = 16u;
public const val `MIM_APPLYTOSUBMENUS`: `MENUINFO_MASK` = 2147483648u;
public const val `MIM_BACKGROUND`: `MENUINFO_MASK` = 2u;
public const val `MIM_HELPID`: `MENUINFO_MASK` = 4u;
public const val `MIM_MAXHEIGHT`: `MENUINFO_MASK` = 1u;
public const val `MIM_MENUDATA`: `MENUINFO_MASK` = 8u;
public const val `MIM_STYLE`: `MENUINFO_MASK` = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIMIZEDMETRICS` (
    public var `cbSize`: UInt,
    public var `iWidth`: Int,
    public var `iHorzGap`: Int,
    public var `iVertGap`: Int,
    public var `iArrange`: `MINIMIZEDMETRICS_ARRANGE`,
)
public typealias `MINIMIZEDMETRICS_ARRANGE` = Int;
public const val `MINIMUM_RESERVED_MANIFEST_RESOURCE_ID`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINMAXINFO` (
    public var `ptReserved`: `super`.`super`.`Foundation`.`POINT`,
    public var `ptMaxSize`: `super`.`super`.`Foundation`.`POINT`,
    public var `ptMaxPosition`: `super`.`super`.`Foundation`.`POINT`,
    public var `ptMinTrackSize`: `super`.`super`.`Foundation`.`POINT`,
    public var `ptMaxTrackSize`: `super`.`super`.`Foundation`.`POINT`,
)
public const val `MIN_LOGICALDPIOVERRIDE`: Int = -2;
public const val `MKF_AVAILABLE`: UInt = 2u;
public const val `MKF_CONFIRMHOTKEY`: UInt = 8u;
public const val `MKF_HOTKEYACTIVE`: UInt = 4u;
public const val `MKF_HOTKEYSOUND`: UInt = 16u;
public const val `MKF_INDICATOR`: UInt = 32u;
public const val `MKF_LEFTBUTTONDOWN`: UInt = 16777216u;
public const val `MKF_LEFTBUTTONSEL`: UInt = 268435456u;
public const val `MKF_MODIFIERS`: UInt = 64u;
public const val `MKF_MOUSEKEYSON`: UInt = 1u;
public const val `MKF_MOUSEMODE`: UInt = 2147483648u;
public const val `MKF_REPLACENUMBERS`: UInt = 128u;
public const val `MKF_RIGHTBUTTONDOWN`: UInt = 33554432u;
public const val `MKF_RIGHTBUTTONSEL`: UInt = 536870912u;
public const val `MNC_CLOSE`: UInt = 1u;
public const val `MNC_EXECUTE`: UInt = 2u;
public const val `MNC_IGNORE`: UInt = 0u;
public const val `MNC_SELECT`: UInt = 3u;
public const val `MND_CONTINUE`: UInt = 0u;
public const val `MND_ENDMENU`: UInt = 1u;
public const val `MNGOF_BOTTOMGAP`: `MENUGETOBJECTINFO_FLAGS` = 2u;
public const val `MNGOF_TOPGAP`: `MENUGETOBJECTINFO_FLAGS` = 1u;
public const val `MNGO_NOERROR`: UInt = 1u;
public const val `MNGO_NOINTERFACE`: UInt = 0u;
public const val `MNS_AUTODISMISS`: `MENUINFO_STYLE` = 268435456u;
public const val `MNS_CHECKORBMP`: `MENUINFO_STYLE` = 67108864u;
public const val `MNS_DRAGDROP`: `MENUINFO_STYLE` = 536870912u;
public const val `MNS_MODELESS`: `MENUINFO_STYLE` = 1073741824u;
public const val `MNS_NOCHECK`: `MENUINFO_STYLE` = 2147483648u;
public const val `MNS_NOTIFYBYPOS`: `MENUINFO_STYLE` = 134217728u;
public const val `MN_GETHMENU`: UInt = 481u;
public const val `MONITORINFOF_PRIMARY`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MOUSEHOOKSTRUCT` (
    public var `pt`: `super`.`super`.`Foundation`.`POINT`,
    public var `hwnd`: `super`.`super`.`Foundation`.`HWND`,
    public var `wHitTestCode`: UInt,
    public var `dwExtraInfo`: ULong,
)
// UNSUPPORTED Rust 2337:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MOUSEHOOKSTRUCT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MOUSEHOOKSTRUCTEX` (
    public var `Base`: `MOUSEHOOKSTRUCT`,
    public var `mouseData`: UInt,
)
public const val `MOUSEWHEEL_ROUTING_FOCUS`: UInt = 0u;
public const val `MOUSEWHEEL_ROUTING_HYBRID`: UInt = 1u;
public const val `MOUSEWHEEL_ROUTING_MOUSE_POS`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MSG` (
    public var `hwnd`: `super`.`super`.`Foundation`.`HWND`,
    public var `message`: UInt,
    public var `wParam`: `super`.`super`.`Foundation`.`WPARAM`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `time`: UInt,
    public var `pt`: `super`.`super`.`Foundation`.`POINT`,
)
// UNSUPPORTED Rust 2361:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MSG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Shell")]
public typealias `MSGBOXCALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Shell`.`HELPINFO`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Shell")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MSGBOXPARAMSA` (
    public var `cbSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpszText`: `windows_sys`.`core`.`PCSTR`,
    public var `lpszCaption`: `windows_sys`.`core`.`PCSTR`,
    public var `dwStyle`: `MESSAGEBOX_STYLE`,
    public var `lpszIcon`: `windows_sys`.`core`.`PCSTR`,
    public var `dwContextHelpId`: ULong,
    public var `lpfnMsgBoxCallback`: `MSGBOXCALLBACK`,
    public var `dwLanguageId`: UInt,
)
// UNSUPPORTED Rust 2383:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_Shell")]
// impl Default for MSGBOXPARAMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Shell")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MSGBOXPARAMSW` (
    public var `cbSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpszText`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpszCaption`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwStyle`: `MESSAGEBOX_STYLE`,
    public var `lpszIcon`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwContextHelpId`: ULong,
    public var `lpfnMsgBoxCallback`: `MSGBOXCALLBACK`,
    public var `dwLanguageId`: UInt,
)
// UNSUPPORTED Rust 2404:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_Shell")]
// impl Default for MSGBOXPARAMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MSGFLTINFO_ALLOWED_HIGHER`: `MSGFLTINFO_STATUS` = 3u;
public const val `MSGFLTINFO_ALREADYALLOWED_FORWND`: `MSGFLTINFO_STATUS` = 1u;
public const val `MSGFLTINFO_ALREADYDISALLOWED_FORWND`: `MSGFLTINFO_STATUS` = 2u;
public const val `MSGFLTINFO_NONE`: `MSGFLTINFO_STATUS` = 0u;
public typealias `MSGFLTINFO_STATUS` = UInt;
public const val `MSGFLT_ADD`: `CHANGE_WINDOW_MESSAGE_FILTER_FLAGS` = 1u;
public const val `MSGFLT_ALLOW`: `WINDOW_MESSAGE_FILTER_ACTION` = 1u;
public const val `MSGFLT_DISALLOW`: `WINDOW_MESSAGE_FILTER_ACTION` = 2u;
public const val `MSGFLT_REMOVE`: `CHANGE_WINDOW_MESSAGE_FILTER_FLAGS` = 2u;
public const val `MSGFLT_RESET`: `WINDOW_MESSAGE_FILTER_ACTION` = 0u;
public const val `MSGF_DIALOGBOX`: UInt = 0u;
public const val `MSGF_MAX`: UInt = 8u;
public const val `MSGF_MENU`: UInt = 2u;
public const val `MSGF_MESSAGEBOX`: UInt = 1u;
public const val `MSGF_NEXTWINDOW`: UInt = 6u;
public const val `MSGF_SCROLLBAR`: UInt = 5u;
public const val `MSGF_USER`: UInt = 4096u;
public typealias `MSG_WAIT_FOR_MULTIPLE_OBJECTS_EX_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MSLLHOOKSTRUCT` (
    public var `pt`: `super`.`super`.`Foundation`.`POINT`,
    public var `mouseData`: UInt,
    public var `flags`: UInt,
    public var `time`: UInt,
    public var `dwExtraInfo`: ULong,
)
public const val `MWMO_ALERTABLE`: `MSG_WAIT_FOR_MULTIPLE_OBJECTS_EX_FLAGS` = 2u;
public const val `MWMO_INPUTAVAILABLE`: `MSG_WAIT_FOR_MULTIPLE_OBJECTS_EX_FLAGS` = 4u;
public const val `MWMO_NONE`: `MSG_WAIT_FOR_MULTIPLE_OBJECTS_EX_FLAGS` = 0u;
public const val `MWMO_WAITALL`: `MSG_WAIT_FOR_MULTIPLE_OBJECTS_EX_FLAGS` = 1u;
public typealias `MrmDumpType` = Int;
public const val `MrmDumpType_Basic`: `MrmDumpType` = 0;
public const val `MrmDumpType_Detailed`: `MrmDumpType` = 1;
public const val `MrmDumpType_Schema`: `MrmDumpType` = 2;
public typealias `MrmIndexerFlags` = Int;
public const val `MrmIndexerFlagsAutoMerge`: `MrmIndexerFlags` = 1;
public const val `MrmIndexerFlagsCreateContentChecksum`: `MrmIndexerFlags` = 2;
public const val `MrmIndexerFlagsNone`: `MrmIndexerFlags` = 0;
public typealias `MrmPackagingMode` = Int;
public const val `MrmPackagingModeAutoSplit`: `MrmPackagingMode` = 1;
public const val `MrmPackagingModeResourcePack`: `MrmPackagingMode` = 2;
public const val `MrmPackagingModeStandaloneFile`: `MrmPackagingMode` = 0;
public typealias `MrmPackagingOptions` = Int;
public const val `MrmPackagingOptionsNone`: `MrmPackagingOptions` = 0;
public const val `MrmPackagingOptionsOmitSchemaFromResourcePacks`: `MrmPackagingOptions` = 1;
public const val `MrmPackagingOptionsSplitLanguageVariants`: `MrmPackagingOptions` = 2;
public typealias `MrmPlatformVersion` = Int;
public const val `MrmPlatformVersion_Default`: `MrmPlatformVersion` = 0;
public const val `MrmPlatformVersion_Windows10_0_0_0`: `MrmPlatformVersion` = 17432576;
public const val `MrmPlatformVersion_Windows10_0_0_5`: `MrmPlatformVersion` = 17432581;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MrmResourceIndexerHandle` (
    public var `handle`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 2466:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MrmResourceIndexerHandle {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MrmResourceIndexerMessage` (
    public var `severity`: `MrmResourceIndexerMessageSeverity`,
    public var `id`: UInt,
    public var `text`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 2478:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MrmResourceIndexerMessage {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MrmResourceIndexerMessageSeverity` = Int;
public const val `MrmResourceIndexerMessageSeverityError`: `MrmResourceIndexerMessageSeverity` = 3;
public const val `MrmResourceIndexerMessageSeverityInfo`: `MrmResourceIndexerMessageSeverity` = 1;
public const val `MrmResourceIndexerMessageSeverityVerbose`: `MrmResourceIndexerMessageSeverity` = 0;
public const val `MrmResourceIndexerMessageSeverityWarning`: `MrmResourceIndexerMessageSeverity` = 2;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `NAMEENUMPROCA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, `super`.`super`.`Foundation`.`LPARAM`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `NAMEENUMPROCW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `super`.`super`.`Foundation`.`LPARAM`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NCCALCSIZE_PARAMS` (
    public var `rgrc`: Array<`super`.`super`.`Foundation`.`RECT`>,
    public var `lppos`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WINDOWPOS`>?,
)
// UNSUPPORTED Rust 2496:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NCCALCSIZE_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NFR_ANSI`: UInt = 1u;
public const val `NFR_UNICODE`: UInt = 2u;
public const val `NF_QUERY`: UInt = 3u;
public const val `NF_REQUERY`: UInt = 4u;
public const val `NID_EXTERNAL_PEN`: UInt = 8u;
public const val `NID_EXTERNAL_TOUCH`: UInt = 2u;
public const val `NID_INTEGRATED_PEN`: UInt = 4u;
public const val `NID_INTEGRATED_TOUCH`: UInt = 1u;
public const val `NID_MULTI_INPUT`: UInt = 64u;
public const val `NID_READY`: UInt = 128u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NONCLIENTMETRICSA` (
    public var `cbSize`: UInt,
    public var `iBorderWidth`: Int,
    public var `iScrollWidth`: Int,
    public var `iScrollHeight`: Int,
    public var `iCaptionWidth`: Int,
    public var `iCaptionHeight`: Int,
    public var `lfCaptionFont`: `super`.`super`.`Graphics`.`Gdi`.`LOGFONTA`,
    public var `iSmCaptionWidth`: Int,
    public var `iSmCaptionHeight`: Int,
    public var `lfSmCaptionFont`: `super`.`super`.`Graphics`.`Gdi`.`LOGFONTA`,
    public var `iMenuWidth`: Int,
    public var `iMenuHeight`: Int,
    public var `lfMenuFont`: `super`.`super`.`Graphics`.`Gdi`.`LOGFONTA`,
    public var `lfStatusFont`: `super`.`super`.`Graphics`.`Gdi`.`LOGFONTA`,
    public var `lfMessageFont`: `super`.`super`.`Graphics`.`Gdi`.`LOGFONTA`,
    public var `iPaddedBorderWidth`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NONCLIENTMETRICSW` (
    public var `cbSize`: UInt,
    public var `iBorderWidth`: Int,
    public var `iScrollWidth`: Int,
    public var `iScrollHeight`: Int,
    public var `iCaptionWidth`: Int,
    public var `iCaptionHeight`: Int,
    public var `lfCaptionFont`: `super`.`super`.`Graphics`.`Gdi`.`LOGFONTW`,
    public var `iSmCaptionWidth`: Int,
    public var `iSmCaptionHeight`: Int,
    public var `lfSmCaptionFont`: `super`.`super`.`Graphics`.`Gdi`.`LOGFONTW`,
    public var `iMenuWidth`: Int,
    public var `iMenuHeight`: Int,
    public var `lfMenuFont`: `super`.`super`.`Graphics`.`Gdi`.`LOGFONTW`,
    public var `lfStatusFont`: `super`.`super`.`Graphics`.`Gdi`.`LOGFONTW`,
    public var `lfMessageFont`: `super`.`super`.`Graphics`.`Gdi`.`LOGFONTW`,
    public var `iPaddedBorderWidth`: Int,
)
public typealias `OBJECT_IDENTIFIER` = Int;
public const val `OBJID_ALERT`: `OBJECT_IDENTIFIER` = -10;
public const val `OBJID_CARET`: `OBJECT_IDENTIFIER` = -8;
public const val `OBJID_CLIENT`: `OBJECT_IDENTIFIER` = -4;
public const val `OBJID_CURSOR`: `OBJECT_IDENTIFIER` = -9;
public const val `OBJID_HSCROLL`: `OBJECT_IDENTIFIER` = -6;
public const val `OBJID_MENU`: `OBJECT_IDENTIFIER` = -3;
public const val `OBJID_NATIVEOM`: `OBJECT_IDENTIFIER` = -16;
public const val `OBJID_QUERYCLASSNAMEIDX`: `OBJECT_IDENTIFIER` = -12;
public const val `OBJID_SIZEGRIP`: `OBJECT_IDENTIFIER` = -7;
public const val `OBJID_SOUND`: `OBJECT_IDENTIFIER` = -11;
public const val `OBJID_SYSMENU`: `OBJECT_IDENTIFIER` = -1;
public const val `OBJID_TITLEBAR`: `OBJECT_IDENTIFIER` = -2;
public const val `OBJID_VSCROLL`: `OBJECT_IDENTIFIER` = -5;
public const val `OBJID_WINDOW`: `OBJECT_IDENTIFIER` = 0;
public const val `OBM_BTNCORNERS`: UInt = 32758u;
public const val `OBM_BTSIZE`: UInt = 32761u;
public const val `OBM_CHECK`: UInt = 32760u;
public const val `OBM_CHECKBOXES`: UInt = 32759u;
public const val `OBM_CLOSE`: UInt = 32754u;
public const val `OBM_COMBO`: UInt = 32738u;
public const val `OBM_DNARROW`: UInt = 32752u;
public const val `OBM_DNARROWD`: UInt = 32742u;
public const val `OBM_DNARROWI`: UInt = 32736u;
public const val `OBM_LFARROW`: UInt = 32750u;
public const val `OBM_LFARROWD`: UInt = 32740u;
public const val `OBM_LFARROWI`: UInt = 32734u;
public const val `OBM_MNARROW`: UInt = 32739u;
public const val `OBM_OLD_CLOSE`: UInt = 32767u;
public const val `OBM_OLD_DNARROW`: UInt = 32764u;
public const val `OBM_OLD_LFARROW`: UInt = 32762u;
public const val `OBM_OLD_REDUCE`: UInt = 32757u;
public const val `OBM_OLD_RESTORE`: UInt = 32755u;
public const val `OBM_OLD_RGARROW`: UInt = 32763u;
public const val `OBM_OLD_UPARROW`: UInt = 32765u;
public const val `OBM_OLD_ZOOM`: UInt = 32756u;
public const val `OBM_REDUCE`: UInt = 32749u;
public const val `OBM_REDUCED`: UInt = 32746u;
public const val `OBM_RESTORE`: UInt = 32747u;
public const val `OBM_RESTORED`: UInt = 32744u;
public const val `OBM_RGARROW`: UInt = 32751u;
public const val `OBM_RGARROWD`: UInt = 32741u;
public const val `OBM_RGARROWI`: UInt = 32735u;
public const val `OBM_SIZE`: UInt = 32766u;
public const val `OBM_UPARROW`: UInt = 32753u;
public const val `OBM_UPARROWD`: UInt = 32743u;
public const val `OBM_UPARROWI`: UInt = 32737u;
public const val `OBM_ZOOM`: UInt = 32748u;
public const val `OBM_ZOOMD`: UInt = 32745u;
public const val `OCR_APPSTARTING`: `SYSTEM_CURSOR_ID` = 32650u;
public const val `OCR_CROSS`: `SYSTEM_CURSOR_ID` = 32515u;
public const val `OCR_HAND`: `SYSTEM_CURSOR_ID` = 32649u;
public const val `OCR_HELP`: `SYSTEM_CURSOR_ID` = 32651u;
public const val `OCR_IBEAM`: `SYSTEM_CURSOR_ID` = 32513u;
public const val `OCR_ICOCUR`: UInt = 32647u;
public const val `OCR_ICON`: UInt = 32641u;
public const val `OCR_NO`: `SYSTEM_CURSOR_ID` = 32648u;
public const val `OCR_NORMAL`: `SYSTEM_CURSOR_ID` = 32512u;
public const val `OCR_SIZE`: UInt = 32640u;
public const val `OCR_SIZEALL`: `SYSTEM_CURSOR_ID` = 32646u;
public const val `OCR_SIZENESW`: `SYSTEM_CURSOR_ID` = 32643u;
public const val `OCR_SIZENS`: `SYSTEM_CURSOR_ID` = 32645u;
public const val `OCR_SIZENWSE`: `SYSTEM_CURSOR_ID` = 32642u;
public const val `OCR_SIZEWE`: `SYSTEM_CURSOR_ID` = 32644u;
public const val `OCR_UP`: `SYSTEM_CURSOR_ID` = 32516u;
public const val `OCR_WAIT`: `SYSTEM_CURSOR_ID` = 32514u;
public const val `OIC_BANG`: UInt = 32515u;
public const val `OIC_ERROR`: UInt = 32513u;
public const val `OIC_HAND`: UInt = 32513u;
public const val `OIC_INFORMATION`: UInt = 32516u;
public const val `OIC_NOTE`: UInt = 32516u;
public const val `OIC_QUES`: UInt = 32514u;
public const val `OIC_SAMPLE`: UInt = 32512u;
public const val `OIC_SHIELD`: UInt = 32518u;
public const val `OIC_WARNING`: UInt = 32515u;
public const val `OIC_WINLOGO`: UInt = 32517u;
public const val `ORD_LANGDRIVER`: UInt = 1u;
public const val `PA_ACTIVATE`: UInt = 1u;
public const val `PA_NOACTIVATE`: UInt = 3u;
public const val `PBTF_APMRESUMEFROMFAILURE`: UInt = 1u;
public const val `PBT_APMBATTERYLOW`: UInt = 9u;
public const val `PBT_APMOEMEVENT`: UInt = 11u;
public const val `PBT_APMPOWERSTATUSCHANGE`: UInt = 10u;
public const val `PBT_APMQUERYSTANDBY`: UInt = 1u;
public const val `PBT_APMQUERYSTANDBYFAILED`: UInt = 3u;
public const val `PBT_APMQUERYSUSPEND`: UInt = 0u;
public const val `PBT_APMQUERYSUSPENDFAILED`: UInt = 2u;
public const val `PBT_APMRESUMEAUTOMATIC`: UInt = 18u;
public const val `PBT_APMRESUMECRITICAL`: UInt = 6u;
public const val `PBT_APMRESUMESTANDBY`: UInt = 8u;
public const val `PBT_APMRESUMESUSPEND`: UInt = 7u;
public const val `PBT_APMSTANDBY`: UInt = 5u;
public const val `PBT_APMSUSPEND`: UInt = 4u;
public const val `PBT_POWERSETTINGCHANGE`: UInt = 32787u;
public const val `PDC_ARRIVAL`: UInt = 1u;
public const val `PDC_MAPPING_CHANGE`: UInt = 256u;
public const val `PDC_MODE_ASPECTRATIOPRESERVED`: UInt = 2048u;
public const val `PDC_MODE_CENTERED`: UInt = 128u;
public const val `PDC_MODE_DEFAULT`: UInt = 64u;
public const val `PDC_ORIENTATION_0`: UInt = 4u;
public const val `PDC_ORIENTATION_180`: UInt = 16u;
public const val `PDC_ORIENTATION_270`: UInt = 32u;
public const val `PDC_ORIENTATION_90`: UInt = 8u;
public const val `PDC_ORIGIN`: UInt = 1024u;
public const val `PDC_REMOVAL`: UInt = 2u;
public const val `PDC_RESOLUTION`: UInt = 512u;
public typealias `PEEK_MESSAGE_REMOVE_TYPE` = UInt;
public const val `PENARBITRATIONTYPE_FIS`: UInt = 2u;
public const val `PENARBITRATIONTYPE_MAX`: UInt = 4u;
public const val `PENARBITRATIONTYPE_NONE`: UInt = 0u;
public const val `PENARBITRATIONTYPE_SPT`: UInt = 3u;
public const val `PENARBITRATIONTYPE_WIN8`: UInt = 1u;
public const val `PENVISUALIZATION_CURSOR`: UInt = 32u;
public const val `PENVISUALIZATION_DOUBLETAP`: UInt = 2u;
public const val `PENVISUALIZATION_OFF`: UInt = 0u;
public const val `PENVISUALIZATION_ON`: UInt = 35u;
public const val `PENVISUALIZATION_TAP`: UInt = 1u;
public const val `PEN_FLAG_BARREL`: UInt = 1u;
public const val `PEN_FLAG_ERASER`: UInt = 4u;
public const val `PEN_FLAG_INVERTED`: UInt = 2u;
public const val `PEN_FLAG_NONE`: UInt = 0u;
public const val `PEN_MASK_NONE`: UInt = 0u;
public const val `PEN_MASK_PRESSURE`: UInt = 1u;
public const val `PEN_MASK_ROTATION`: UInt = 2u;
public const val `PEN_MASK_TILT_X`: UInt = 4u;
public const val `PEN_MASK_TILT_Y`: UInt = 8u;
public const val `PMB_ACTIVE`: UInt = 1u;
public const val `PM_NOREMOVE`: `PEEK_MESSAGE_REMOVE_TYPE` = 0u;
public const val `PM_NOYIELD`: `PEEK_MESSAGE_REMOVE_TYPE` = 2u;
public const val `PM_QS_INPUT`: `PEEK_MESSAGE_REMOVE_TYPE` = 67567616u;
public const val `PM_QS_PAINT`: `PEEK_MESSAGE_REMOVE_TYPE` = 2097152u;
public const val `PM_QS_POSTMESSAGE`: `PEEK_MESSAGE_REMOVE_TYPE` = 9961472u;
public const val `PM_QS_SENDMESSAGE`: `PEEK_MESSAGE_REMOVE_TYPE` = 4194304u;
public const val `PM_REMOVE`: `PEEK_MESSAGE_REMOVE_TYPE` = 1u;
public const val `POINTER_DEVICE_PRODUCT_STRING_MAX`: UInt = 520u;
public typealias `POINTER_INPUT_TYPE` = Int;
public const val `POINTER_MESSAGE_FLAG_CANCELED`: UInt = 32768u;
public const val `POINTER_MESSAGE_FLAG_CONFIDENCE`: UInt = 16384u;
public const val `POINTER_MESSAGE_FLAG_FIFTHBUTTON`: UInt = 256u;
public const val `POINTER_MESSAGE_FLAG_FIRSTBUTTON`: UInt = 16u;
public const val `POINTER_MESSAGE_FLAG_FOURTHBUTTON`: UInt = 128u;
public const val `POINTER_MESSAGE_FLAG_INCONTACT`: UInt = 4u;
public const val `POINTER_MESSAGE_FLAG_INRANGE`: UInt = 2u;
public const val `POINTER_MESSAGE_FLAG_NEW`: UInt = 1u;
public const val `POINTER_MESSAGE_FLAG_PRIMARY`: UInt = 8192u;
public const val `POINTER_MESSAGE_FLAG_SECONDBUTTON`: UInt = 32u;
public const val `POINTER_MESSAGE_FLAG_THIRDBUTTON`: UInt = 64u;
public const val `POINTER_MOD_CTRL`: UInt = 8u;
public const val `POINTER_MOD_SHIFT`: UInt = 4u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PREGISTERCLASSNAMEW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`) -> Boolean>>>;
public const val `PRF_CHECKVISIBLE`: Int = 1;
public const val `PRF_CHILDREN`: Int = 16;
public const val `PRF_CLIENT`: Int = 4;
public const val `PRF_ERASEBKGND`: Int = 8;
public const val `PRF_NONCLIENT`: Int = 2;
public const val `PRF_OWNED`: Int = 32;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROPENUMPROCA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, `windows_sys`.`core`.`PCSTR`, `super`.`super`.`Foundation`.`HANDLE`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROPENUMPROCEXA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, `windows_sys`.`core`.`PCSTR`, `super`.`super`.`Foundation`.`HANDLE`, ULong) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROPENUMPROCEXW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, `windows_sys`.`core`.`PCWSTR`, `super`.`super`.`Foundation`.`HANDLE`, ULong) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROPENUMPROCW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, `windows_sys`.`core`.`PCWSTR`, `super`.`super`.`Foundation`.`HANDLE`) -> `windows_sys`.`core`.`BOOL`>>>;
public const val `PT_MOUSE`: `POINTER_INPUT_TYPE` = 4;
public const val `PT_PEN`: `POINTER_INPUT_TYPE` = 3;
public const val `PT_POINTER`: `POINTER_INPUT_TYPE` = 1;
public const val `PT_TOUCH`: `POINTER_INPUT_TYPE` = 2;
public const val `PT_TOUCHPAD`: `POINTER_INPUT_TYPE` = 5;
public const val `PWR_CRITICALRESUME`: UInt = 3u;
public const val `PWR_FAIL`: Int = -1;
public const val `PWR_OK`: UInt = 1u;
public const val `PWR_SUSPENDREQUEST`: UInt = 1u;
public const val `PWR_SUSPENDRESUME`: UInt = 2u;
public const val `PW_RENDERFULLCONTENT`: UInt = 2u;
public const val `QS_ALLEVENTS`: `QUEUE_STATUS_FLAGS` = 1215u;
public const val `QS_ALLINPUT`: `QUEUE_STATUS_FLAGS` = 1279u;
public const val `QS_ALLPOSTMESSAGE`: `QUEUE_STATUS_FLAGS` = 256u;
public const val `QS_HOTKEY`: `QUEUE_STATUS_FLAGS` = 128u;
public const val `QS_INPUT`: `QUEUE_STATUS_FLAGS` = 1031u;
public const val `QS_KEY`: `QUEUE_STATUS_FLAGS` = 1u;
public const val `QS_MOUSE`: `QUEUE_STATUS_FLAGS` = 6u;
public const val `QS_MOUSEBUTTON`: `QUEUE_STATUS_FLAGS` = 4u;
public const val `QS_MOUSEMOVE`: `QUEUE_STATUS_FLAGS` = 2u;
public const val `QS_PAINT`: `QUEUE_STATUS_FLAGS` = 32u;
public const val `QS_POINTER`: UInt = 4096u;
public const val `QS_POSTMESSAGE`: `QUEUE_STATUS_FLAGS` = 8u;
public const val `QS_RAWINPUT`: `QUEUE_STATUS_FLAGS` = 1024u;
public const val `QS_SENDMESSAGE`: `QUEUE_STATUS_FLAGS` = 64u;
public const val `QS_TIMER`: `QUEUE_STATUS_FLAGS` = 16u;
public const val `QS_TOUCH`: UInt = 2048u;
public typealias `QUEUE_STATUS_FLAGS` = UInt;
public typealias `REGISTER_NOTIFICATION_FLAGS` = UInt;
public const val `RES_CURSOR`: UInt = 2u;
public const val `RES_ICON`: UInt = 1u;
public const val `RIDEV_EXMODEMASK`: UInt = 240u;
public const val `RIM_INPUT`: UInt = 0u;
public const val `RIM_INPUTSINK`: UInt = 1u;
public const val `RIM_TYPEMAX`: UInt = 2u;
public const val `RI_KEY_BREAK`: UInt = 1u;
public const val `RI_KEY_E0`: UInt = 2u;
public const val `RI_KEY_E1`: UInt = 4u;
public const val `RI_KEY_MAKE`: UInt = 0u;
public const val `RI_KEY_TERMSRV_SET_LED`: UInt = 8u;
public const val `RI_KEY_TERMSRV_SHADOW`: UInt = 16u;
public const val `RI_MOUSE_BUTTON_1_DOWN`: UInt = 1u;
public const val `RI_MOUSE_BUTTON_1_UP`: UInt = 2u;
public const val `RI_MOUSE_BUTTON_2_DOWN`: UInt = 4u;
public const val `RI_MOUSE_BUTTON_2_UP`: UInt = 8u;
public const val `RI_MOUSE_BUTTON_3_DOWN`: UInt = 16u;
public const val `RI_MOUSE_BUTTON_3_UP`: UInt = 32u;
public const val `RI_MOUSE_BUTTON_4_DOWN`: UInt = 64u;
public const val `RI_MOUSE_BUTTON_4_UP`: UInt = 128u;
public const val `RI_MOUSE_BUTTON_5_DOWN`: UInt = 256u;
public const val `RI_MOUSE_BUTTON_5_UP`: UInt = 512u;
public const val `RI_MOUSE_HWHEEL`: UInt = 2048u;
public const val `RI_MOUSE_LEFT_BUTTON_DOWN`: UInt = 1u;
public const val `RI_MOUSE_LEFT_BUTTON_UP`: UInt = 2u;
public const val `RI_MOUSE_MIDDLE_BUTTON_DOWN`: UInt = 16u;
public const val `RI_MOUSE_MIDDLE_BUTTON_UP`: UInt = 32u;
public const val `RI_MOUSE_RIGHT_BUTTON_DOWN`: UInt = 4u;
public const val `RI_MOUSE_RIGHT_BUTTON_UP`: UInt = 8u;
public const val `RI_MOUSE_WHEEL`: UInt = 1024u;
// UNSUPPORTED Rust 2772:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const RT_ACCELERATOR: windows_sys::core::PCWSTR = 9u16 as _;

// UNSUPPORTED Rust 2773:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const RT_ANICURSOR: windows_sys::core::PCWSTR = 21u16 as _;

// UNSUPPORTED Rust 2774:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const RT_ANIICON: windows_sys::core::PCWSTR = 22u16 as _;

// UNSUPPORTED Rust 2775:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const RT_BITMAP: windows_sys::core::PCWSTR = 2u16 as _;

// UNSUPPORTED Rust 2776:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const RT_CURSOR: windows_sys::core::PCWSTR = 1u16 as _;

// UNSUPPORTED Rust 2777:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const RT_DIALOG: windows_sys::core::PCWSTR = 5u16 as _;

// UNSUPPORTED Rust 2778:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const RT_DLGINCLUDE: windows_sys::core::PCWSTR = 17u16 as _;

// UNSUPPORTED Rust 2779:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const RT_FONT: windows_sys::core::PCWSTR = 8u16 as _;

// UNSUPPORTED Rust 2780:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const RT_FONTDIR: windows_sys::core::PCWSTR = 7u16 as _;

// UNSUPPORTED Rust 2781:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const RT_GROUP_CURSOR: windows_sys::core::PCWSTR = 12u16 as _;

// UNSUPPORTED Rust 2782:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const RT_GROUP_ICON: windows_sys::core::PCWSTR = 14u16 as _;

// UNSUPPORTED Rust 2783:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const RT_HTML: windows_sys::core::PCWSTR = 23u16 as _;

// UNSUPPORTED Rust 2784:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const RT_ICON: windows_sys::core::PCWSTR = 3u16 as _;

// UNSUPPORTED Rust 2785:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const RT_MANIFEST: windows_sys::core::PCWSTR = 24u16 as _;

// UNSUPPORTED Rust 2786:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const RT_MENU: windows_sys::core::PCWSTR = 4u16 as _;

// UNSUPPORTED Rust 2787:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const RT_MESSAGETABLE: windows_sys::core::PCWSTR = 11u16 as _;

// UNSUPPORTED Rust 2788:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const RT_PLUGPLAY: windows_sys::core::PCWSTR = 19u16 as _;

// UNSUPPORTED Rust 2789:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const RT_VERSION: windows_sys::core::PCWSTR = 16u16 as _;

// UNSUPPORTED Rust 2790:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const RT_VXD: windows_sys::core::PCWSTR = 20u16 as _;

public const val `SBM_ENABLE_ARROWS`: UInt = 228u;
public const val `SBM_GETPOS`: UInt = 225u;
public const val `SBM_GETRANGE`: UInt = 227u;
public const val `SBM_GETSCROLLBARINFO`: UInt = 235u;
public const val `SBM_GETSCROLLINFO`: UInt = 234u;
public const val `SBM_SETPOS`: UInt = 224u;
public const val `SBM_SETRANGE`: UInt = 226u;
public const val `SBM_SETRANGEREDRAW`: UInt = 230u;
public const val `SBM_SETSCROLLINFO`: UInt = 233u;
public const val `SBS_BOTTOMALIGN`: Int = 4;
public const val `SBS_HORZ`: Int = 0;
public const val `SBS_LEFTALIGN`: Int = 2;
public const val `SBS_RIGHTALIGN`: Int = 4;
public const val `SBS_SIZEBOX`: Int = 8;
public const val `SBS_SIZEBOXBOTTOMRIGHTALIGN`: Int = 4;
public const val `SBS_SIZEBOXTOPLEFTALIGN`: Int = 2;
public const val `SBS_SIZEGRIP`: Int = 16;
public const val `SBS_TOPALIGN`: Int = 2;
public const val `SBS_VERT`: Int = 1;
public const val `SB_BOTH`: `SCROLLBAR_CONSTANTS` = 3;
public const val `SB_BOTTOM`: `SCROLLBAR_COMMAND` = 7;
public const val `SB_CTL`: `SCROLLBAR_CONSTANTS` = 2;
public const val `SB_ENDSCROLL`: `SCROLLBAR_COMMAND` = 8;
public const val `SB_HORZ`: `SCROLLBAR_CONSTANTS` = 0;
public const val `SB_LEFT`: `SCROLLBAR_COMMAND` = 6;
public const val `SB_LINEDOWN`: `SCROLLBAR_COMMAND` = 1;
public const val `SB_LINELEFT`: `SCROLLBAR_COMMAND` = 0;
public const val `SB_LINERIGHT`: `SCROLLBAR_COMMAND` = 1;
public const val `SB_LINEUP`: `SCROLLBAR_COMMAND` = 0;
public const val `SB_PAGEDOWN`: `SCROLLBAR_COMMAND` = 3;
public const val `SB_PAGELEFT`: `SCROLLBAR_COMMAND` = 2;
public const val `SB_PAGERIGHT`: `SCROLLBAR_COMMAND` = 3;
public const val `SB_PAGEUP`: `SCROLLBAR_COMMAND` = 2;
public const val `SB_RIGHT`: `SCROLLBAR_COMMAND` = 7;
public const val `SB_THUMBPOSITION`: `SCROLLBAR_COMMAND` = 4;
public const val `SB_THUMBTRACK`: `SCROLLBAR_COMMAND` = 5;
public const val `SB_TOP`: `SCROLLBAR_COMMAND` = 6;
public const val `SB_VERT`: `SCROLLBAR_CONSTANTS` = 1;
public const val `SCF_ISSECURE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCROLLBARINFO` (
    public var `cbSize`: UInt,
    public var `rcScrollBar`: `super`.`super`.`Foundation`.`RECT`,
    public var `dxyLineButton`: Int,
    public var `xyThumbTop`: Int,
    public var `xyThumbBottom`: Int,
    public var `reserved`: Int,
    public var `rgstate`: UIntArray,
)
// UNSUPPORTED Rust 2841:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCROLLBARINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SCROLLBAR_COMMAND` = Int;
public typealias `SCROLLBAR_CONSTANTS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCROLLINFO` (
    public var `cbSize`: UInt,
    public var `fMask`: `SCROLLINFO_MASK`,
    public var `nMin`: Int,
    public var `nMax`: Int,
    public var `nPage`: UInt,
    public var `nPos`: Int,
    public var `nTrackPos`: Int,
)
public typealias `SCROLLINFO_MASK` = UInt;
public typealias `SCROLL_WINDOW_FLAGS` = UInt;
public const val `SC_ARRANGE`: UInt = 61712u;
public const val `SC_CLOSE`: UInt = 61536u;
public const val `SC_CONTEXTHELP`: UInt = 61824u;
public const val `SC_DEFAULT`: UInt = 61792u;
public const val `SC_HOTKEY`: UInt = 61776u;
public const val `SC_HSCROLL`: UInt = 61568u;
public const val `SC_ICON`: UInt = 61472u;
public const val `SC_KEYMENU`: UInt = 61696u;
public const val `SC_MAXIMIZE`: UInt = 61488u;
public const val `SC_MINIMIZE`: UInt = 61472u;
public const val `SC_MONITORPOWER`: UInt = 61808u;
public const val `SC_MOUSEMENU`: UInt = 61584u;
public const val `SC_MOVE`: UInt = 61456u;
public const val `SC_NEXTWINDOW`: UInt = 61504u;
public const val `SC_PREVWINDOW`: UInt = 61520u;
public const val `SC_RESTORE`: UInt = 61728u;
public const val `SC_SEPARATOR`: UInt = 61455u;
public const val `SC_SIZE`: UInt = 61440u;
public const val `SC_TASKLIST`: UInt = 61744u;
public const val `SC_VSCROLL`: UInt = 61552u;
public const val `SC_ZOOM`: UInt = 61488u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SENDASYNCPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, UInt, ULong, `super`.`super`.`Foundation`.`LRESULT`) -> Unit>>>;
public typealias `SEND_MESSAGE_TIMEOUT_FLAGS` = UInt;
public typealias `SET_WINDOW_POS_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SHELLHOOKINFO` (
    public var `hwnd`: `super`.`super`.`Foundation`.`HWND`,
    public var `rc`: `super`.`super`.`Foundation`.`RECT`,
)
// UNSUPPORTED Rust 2891:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SHELLHOOKINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SHOW_FULLSCREEN`: UInt = 3u;
public const val `SHOW_ICONWINDOW`: UInt = 2u;
public const val `SHOW_OPENNOACTIVATE`: UInt = 4u;
public const val `SHOW_OPENWINDOW`: UInt = 1u;
public typealias `SHOW_WINDOW_CMD` = Int;
public typealias `SHOW_WINDOW_STATUS` = UInt;
public const val `SIF_ALL`: `SCROLLINFO_MASK` = 23u;
public const val `SIF_DISABLENOSCROLL`: `SCROLLINFO_MASK` = 8u;
public const val `SIF_PAGE`: `SCROLLINFO_MASK` = 2u;
public const val `SIF_POS`: `SCROLLINFO_MASK` = 4u;
public const val `SIF_RANGE`: `SCROLLINFO_MASK` = 1u;
public const val `SIF_TRACKPOS`: `SCROLLINFO_MASK` = 16u;
public const val `SIZEFULLSCREEN`: UInt = 2u;
public const val `SIZEICONIC`: UInt = 1u;
public const val `SIZENORMAL`: UInt = 0u;
public const val `SIZEZOOMHIDE`: UInt = 4u;
public const val `SIZEZOOMSHOW`: UInt = 3u;
public const val `SIZE_MAXHIDE`: UInt = 4u;
public const val `SIZE_MAXIMIZED`: UInt = 2u;
public const val `SIZE_MAXSHOW`: UInt = 3u;
public const val `SIZE_MINIMIZED`: UInt = 1u;
public const val `SIZE_RESTORED`: UInt = 0u;
public const val `SMTO_ABORTIFHUNG`: `SEND_MESSAGE_TIMEOUT_FLAGS` = 2u;
public const val `SMTO_BLOCK`: `SEND_MESSAGE_TIMEOUT_FLAGS` = 1u;
public const val `SMTO_ERRORONEXIT`: `SEND_MESSAGE_TIMEOUT_FLAGS` = 32u;
public const val `SMTO_NORMAL`: `SEND_MESSAGE_TIMEOUT_FLAGS` = 0u;
public const val `SMTO_NOTIMEOUTIFNOTHUNG`: `SEND_MESSAGE_TIMEOUT_FLAGS` = 8u;
public const val `SM_ARRANGE`: `SYSTEM_METRICS_INDEX` = 56;
public const val `SM_CARETBLINKINGENABLED`: UInt = 8194u;
public const val `SM_CLEANBOOT`: `SYSTEM_METRICS_INDEX` = 67;
public const val `SM_CMETRICS`: UInt = 76u;
public const val `SM_CMONITORS`: `SYSTEM_METRICS_INDEX` = 80;
public const val `SM_CMOUSEBUTTONS`: `SYSTEM_METRICS_INDEX` = 43;
public const val `SM_CONVERTIBLESLATEMODE`: `SYSTEM_METRICS_INDEX` = 8195;
public const val `SM_CXBORDER`: `SYSTEM_METRICS_INDEX` = 5;
public const val `SM_CXCURSOR`: `SYSTEM_METRICS_INDEX` = 13;
public const val `SM_CXDLGFRAME`: `SYSTEM_METRICS_INDEX` = 7;
public const val `SM_CXDOUBLECLK`: `SYSTEM_METRICS_INDEX` = 36;
public const val `SM_CXDRAG`: `SYSTEM_METRICS_INDEX` = 68;
public const val `SM_CXEDGE`: `SYSTEM_METRICS_INDEX` = 45;
public const val `SM_CXFIXEDFRAME`: `SYSTEM_METRICS_INDEX` = 7;
public const val `SM_CXFOCUSBORDER`: `SYSTEM_METRICS_INDEX` = 83;
public const val `SM_CXFRAME`: `SYSTEM_METRICS_INDEX` = 32;
public const val `SM_CXFULLSCREEN`: `SYSTEM_METRICS_INDEX` = 16;
public const val `SM_CXHSCROLL`: `SYSTEM_METRICS_INDEX` = 21;
public const val `SM_CXHTHUMB`: `SYSTEM_METRICS_INDEX` = 10;
public const val `SM_CXICON`: `SYSTEM_METRICS_INDEX` = 11;
public const val `SM_CXICONSPACING`: `SYSTEM_METRICS_INDEX` = 38;
public const val `SM_CXMAXIMIZED`: `SYSTEM_METRICS_INDEX` = 61;
public const val `SM_CXMAXTRACK`: `SYSTEM_METRICS_INDEX` = 59;
public const val `SM_CXMENUCHECK`: `SYSTEM_METRICS_INDEX` = 71;
public const val `SM_CXMENUSIZE`: `SYSTEM_METRICS_INDEX` = 54;
public const val `SM_CXMIN`: `SYSTEM_METRICS_INDEX` = 28;
public const val `SM_CXMINIMIZED`: `SYSTEM_METRICS_INDEX` = 57;
public const val `SM_CXMINSPACING`: `SYSTEM_METRICS_INDEX` = 47;
public const val `SM_CXMINTRACK`: `SYSTEM_METRICS_INDEX` = 34;
public const val `SM_CXPADDEDBORDER`: `SYSTEM_METRICS_INDEX` = 92;
public const val `SM_CXSCREEN`: `SYSTEM_METRICS_INDEX` = 0;
public const val `SM_CXSIZE`: `SYSTEM_METRICS_INDEX` = 30;
public const val `SM_CXSIZEFRAME`: `SYSTEM_METRICS_INDEX` = 32;
public const val `SM_CXSMICON`: `SYSTEM_METRICS_INDEX` = 49;
public const val `SM_CXSMSIZE`: `SYSTEM_METRICS_INDEX` = 52;
public const val `SM_CXVIRTUALSCREEN`: `SYSTEM_METRICS_INDEX` = 78;
public const val `SM_CXVSCROLL`: `SYSTEM_METRICS_INDEX` = 2;
public const val `SM_CYBORDER`: `SYSTEM_METRICS_INDEX` = 6;
public const val `SM_CYCAPTION`: `SYSTEM_METRICS_INDEX` = 4;
public const val `SM_CYCURSOR`: `SYSTEM_METRICS_INDEX` = 14;
public const val `SM_CYDLGFRAME`: `SYSTEM_METRICS_INDEX` = 8;
public const val `SM_CYDOUBLECLK`: `SYSTEM_METRICS_INDEX` = 37;
public const val `SM_CYDRAG`: `SYSTEM_METRICS_INDEX` = 69;
public const val `SM_CYEDGE`: `SYSTEM_METRICS_INDEX` = 46;
public const val `SM_CYFIXEDFRAME`: `SYSTEM_METRICS_INDEX` = 8;
public const val `SM_CYFOCUSBORDER`: `SYSTEM_METRICS_INDEX` = 84;
public const val `SM_CYFRAME`: `SYSTEM_METRICS_INDEX` = 33;
public const val `SM_CYFULLSCREEN`: `SYSTEM_METRICS_INDEX` = 17;
public const val `SM_CYHSCROLL`: `SYSTEM_METRICS_INDEX` = 3;
public const val `SM_CYICON`: `SYSTEM_METRICS_INDEX` = 12;
public const val `SM_CYICONSPACING`: `SYSTEM_METRICS_INDEX` = 39;
public const val `SM_CYKANJIWINDOW`: `SYSTEM_METRICS_INDEX` = 18;
public const val `SM_CYMAXIMIZED`: `SYSTEM_METRICS_INDEX` = 62;
public const val `SM_CYMAXTRACK`: `SYSTEM_METRICS_INDEX` = 60;
public const val `SM_CYMENU`: `SYSTEM_METRICS_INDEX` = 15;
public const val `SM_CYMENUCHECK`: `SYSTEM_METRICS_INDEX` = 72;
public const val `SM_CYMENUSIZE`: `SYSTEM_METRICS_INDEX` = 55;
public const val `SM_CYMIN`: `SYSTEM_METRICS_INDEX` = 29;
public const val `SM_CYMINIMIZED`: `SYSTEM_METRICS_INDEX` = 58;
public const val `SM_CYMINSPACING`: `SYSTEM_METRICS_INDEX` = 48;
public const val `SM_CYMINTRACK`: `SYSTEM_METRICS_INDEX` = 35;
public const val `SM_CYSCREEN`: `SYSTEM_METRICS_INDEX` = 1;
public const val `SM_CYSIZE`: `SYSTEM_METRICS_INDEX` = 31;
public const val `SM_CYSIZEFRAME`: `SYSTEM_METRICS_INDEX` = 33;
public const val `SM_CYSMCAPTION`: `SYSTEM_METRICS_INDEX` = 51;
public const val `SM_CYSMICON`: `SYSTEM_METRICS_INDEX` = 50;
public const val `SM_CYSMSIZE`: `SYSTEM_METRICS_INDEX` = 53;
public const val `SM_CYVIRTUALSCREEN`: `SYSTEM_METRICS_INDEX` = 79;
public const val `SM_CYVSCROLL`: `SYSTEM_METRICS_INDEX` = 20;
public const val `SM_CYVTHUMB`: `SYSTEM_METRICS_INDEX` = 9;
public const val `SM_DBCSENABLED`: `SYSTEM_METRICS_INDEX` = 42;
public const val `SM_DEBUG`: `SYSTEM_METRICS_INDEX` = 22;
public const val `SM_DIGITIZER`: `SYSTEM_METRICS_INDEX` = 94;
public const val `SM_IMMENABLED`: `SYSTEM_METRICS_INDEX` = 82;
public const val `SM_MAXIMUMTOUCHES`: `SYSTEM_METRICS_INDEX` = 95;
public const val `SM_MEDIACENTER`: `SYSTEM_METRICS_INDEX` = 87;
public const val `SM_MENUDROPALIGNMENT`: `SYSTEM_METRICS_INDEX` = 40;
public const val `SM_MIDEASTENABLED`: `SYSTEM_METRICS_INDEX` = 74;
public const val `SM_MOUSEHORIZONTALWHEELPRESENT`: `SYSTEM_METRICS_INDEX` = 91;
public const val `SM_MOUSEPRESENT`: `SYSTEM_METRICS_INDEX` = 19;
public const val `SM_MOUSEWHEELPRESENT`: `SYSTEM_METRICS_INDEX` = 75;
public const val `SM_NETWORK`: `SYSTEM_METRICS_INDEX` = 63;
public const val `SM_PENWINDOWS`: `SYSTEM_METRICS_INDEX` = 41;
public const val `SM_REMOTECONTROL`: `SYSTEM_METRICS_INDEX` = 8193;
public const val `SM_REMOTESESSION`: `SYSTEM_METRICS_INDEX` = 4096;
public const val `SM_RESERVED1`: UInt = 24u;
public const val `SM_RESERVED2`: UInt = 25u;
public const val `SM_RESERVED3`: UInt = 26u;
public const val `SM_RESERVED4`: UInt = 27u;
public const val `SM_SAMEDISPLAYFORMAT`: `SYSTEM_METRICS_INDEX` = 81;
public const val `SM_SECURE`: `SYSTEM_METRICS_INDEX` = 44;
public const val `SM_SERVERR2`: `SYSTEM_METRICS_INDEX` = 89;
public const val `SM_SHOWSOUNDS`: `SYSTEM_METRICS_INDEX` = 70;
public const val `SM_SHUTTINGDOWN`: `SYSTEM_METRICS_INDEX` = 8192;
public const val `SM_SLOWMACHINE`: `SYSTEM_METRICS_INDEX` = 73;
public const val `SM_STARTER`: `SYSTEM_METRICS_INDEX` = 88;
public const val `SM_SWAPBUTTON`: `SYSTEM_METRICS_INDEX` = 23;
public const val `SM_SYSTEMDOCKED`: `SYSTEM_METRICS_INDEX` = 8196;
public const val `SM_TABLETPC`: `SYSTEM_METRICS_INDEX` = 86;
public const val `SM_XVIRTUALSCREEN`: `SYSTEM_METRICS_INDEX` = 76;
public const val `SM_YVIRTUALSCREEN`: `SYSTEM_METRICS_INDEX` = 77;
public const val `SOUND_SYSTEM_APPEND`: UInt = 14u;
public const val `SOUND_SYSTEM_APPSTART`: UInt = 12u;
public const val `SOUND_SYSTEM_BEEP`: UInt = 3u;
public const val `SOUND_SYSTEM_ERROR`: UInt = 4u;
public const val `SOUND_SYSTEM_FAULT`: UInt = 13u;
public const val `SOUND_SYSTEM_INFORMATION`: UInt = 7u;
public const val `SOUND_SYSTEM_MAXIMIZE`: UInt = 8u;
public const val `SOUND_SYSTEM_MENUCOMMAND`: UInt = 15u;
public const val `SOUND_SYSTEM_MENUPOPUP`: UInt = 16u;
public const val `SOUND_SYSTEM_MINIMIZE`: UInt = 9u;
public const val `SOUND_SYSTEM_QUESTION`: UInt = 5u;
public const val `SOUND_SYSTEM_RESTOREDOWN`: UInt = 11u;
public const val `SOUND_SYSTEM_RESTOREUP`: UInt = 10u;
public const val `SOUND_SYSTEM_SHUTDOWN`: UInt = 2u;
public const val `SOUND_SYSTEM_STARTUP`: UInt = 1u;
public const val `SOUND_SYSTEM_WARNING`: UInt = 6u;
public const val `SPIF_SENDCHANGE`: `SYSTEM_PARAMETERS_INFO_UPDATE_FLAGS` = 2u;
public const val `SPIF_SENDWININICHANGE`: `SYSTEM_PARAMETERS_INFO_UPDATE_FLAGS` = 2u;
public const val `SPIF_UPDATEINIFILE`: `SYSTEM_PARAMETERS_INFO_UPDATE_FLAGS` = 1u;
public const val `SPI_GETACCESSTIMEOUT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 60u;
public const val `SPI_GETACTIVEWINDOWTRACKING`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4096u;
public const val `SPI_GETACTIVEWNDTRKTIMEOUT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8194u;
public const val `SPI_GETACTIVEWNDTRKZORDER`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4108u;
public const val `SPI_GETANIMATION`: `SYSTEM_PARAMETERS_INFO_ACTION` = 72u;
public const val `SPI_GETAUDIODESCRIPTION`: `SYSTEM_PARAMETERS_INFO_ACTION` = 116u;
public const val `SPI_GETBEEP`: `SYSTEM_PARAMETERS_INFO_ACTION` = 1u;
public const val `SPI_GETBLOCKSENDINPUTRESETS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4134u;
public const val `SPI_GETBORDER`: `SYSTEM_PARAMETERS_INFO_ACTION` = 5u;
public const val `SPI_GETCARETBROWSING`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4172u;
public const val `SPI_GETCARETTIMEOUT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8226u;
public const val `SPI_GETCARETWIDTH`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8198u;
public const val `SPI_GETCLEARTYPE`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4168u;
public const val `SPI_GETCLIENTAREAANIMATION`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4162u;
public const val `SPI_GETCOMBOBOXANIMATION`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4100u;
public const val `SPI_GETCONTACTVISUALIZATION`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8216u;
public const val `SPI_GETCURSORSHADOW`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4122u;
public const val `SPI_GETDEFAULTINPUTLANG`: `SYSTEM_PARAMETERS_INFO_ACTION` = 89u;
public const val `SPI_GETDESKWALLPAPER`: `SYSTEM_PARAMETERS_INFO_ACTION` = 115u;
public const val `SPI_GETDISABLEOVERLAPPEDCONTENT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4160u;
public const val `SPI_GETDOCKMOVING`: `SYSTEM_PARAMETERS_INFO_ACTION` = 144u;
public const val `SPI_GETDRAGFROMMAXIMIZE`: `SYSTEM_PARAMETERS_INFO_ACTION` = 140u;
public const val `SPI_GETDRAGFULLWINDOWS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 38u;
public const val `SPI_GETDROPSHADOW`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4132u;
public const val `SPI_GETFASTTASKSWITCH`: `SYSTEM_PARAMETERS_INFO_ACTION` = 35u;
public const val `SPI_GETFILTERKEYS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 50u;
public const val `SPI_GETFLATMENU`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4130u;
public const val `SPI_GETFOCUSBORDERHEIGHT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8208u;
public const val `SPI_GETFOCUSBORDERWIDTH`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8206u;
public const val `SPI_GETFONTSMOOTHING`: `SYSTEM_PARAMETERS_INFO_ACTION` = 74u;
public const val `SPI_GETFONTSMOOTHINGCONTRAST`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8204u;
public const val `SPI_GETFONTSMOOTHINGORIENTATION`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8210u;
public const val `SPI_GETFONTSMOOTHINGTYPE`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8202u;
public const val `SPI_GETFOREGROUNDFLASHCOUNT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8196u;
public const val `SPI_GETFOREGROUNDLOCKTIMEOUT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8192u;
public const val `SPI_GETGESTUREVISUALIZATION`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8218u;
public const val `SPI_GETGRADIENTCAPTIONS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4104u;
public const val `SPI_GETGRIDGRANULARITY`: `SYSTEM_PARAMETERS_INFO_ACTION` = 18u;
public const val `SPI_GETHANDEDNESS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8228u;
public const val `SPI_GETHIGHCONTRAST`: `SYSTEM_PARAMETERS_INFO_ACTION` = 66u;
public const val `SPI_GETHOTTRACKING`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4110u;
public const val `SPI_GETHUNGAPPTIMEOUT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 120u;
public const val `SPI_GETICONMETRICS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 45u;
public const val `SPI_GETICONTITLELOGFONT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 31u;
public const val `SPI_GETICONTITLEWRAP`: `SYSTEM_PARAMETERS_INFO_ACTION` = 25u;
public const val `SPI_GETKEYBOARDCUES`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4106u;
public const val `SPI_GETKEYBOARDDELAY`: `SYSTEM_PARAMETERS_INFO_ACTION` = 22u;
public const val `SPI_GETKEYBOARDPREF`: `SYSTEM_PARAMETERS_INFO_ACTION` = 68u;
public const val `SPI_GETKEYBOARDSPEED`: `SYSTEM_PARAMETERS_INFO_ACTION` = 10u;
public const val `SPI_GETLISTBOXSMOOTHSCROLLING`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4102u;
public const val `SPI_GETLOGICALDPIOVERRIDE`: `SYSTEM_PARAMETERS_INFO_ACTION` = 158u;
public const val `SPI_GETLOWPOWERACTIVE`: `SYSTEM_PARAMETERS_INFO_ACTION` = 83u;
public const val `SPI_GETLOWPOWERTIMEOUT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 79u;
public const val `SPI_GETMENUANIMATION`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4098u;
public const val `SPI_GETMENUDROPALIGNMENT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 27u;
public const val `SPI_GETMENUFADE`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4114u;
public const val `SPI_GETMENURECT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 162u;
public const val `SPI_GETMENUSHOWDELAY`: `SYSTEM_PARAMETERS_INFO_ACTION` = 106u;
public const val `SPI_GETMENUUNDERLINES`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4106u;
public const val `SPI_GETMESSAGEDURATION`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8214u;
public const val `SPI_GETMINIMIZEDMETRICS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 43u;
public const val `SPI_GETMINIMUMHITRADIUS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8212u;
public const val `SPI_GETMOUSE`: `SYSTEM_PARAMETERS_INFO_ACTION` = 3u;
public const val `SPI_GETMOUSECLICKLOCK`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4126u;
public const val `SPI_GETMOUSECLICKLOCKTIME`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8200u;
public const val `SPI_GETMOUSEDOCKTHRESHOLD`: `SYSTEM_PARAMETERS_INFO_ACTION` = 126u;
public const val `SPI_GETMOUSEDRAGOUTTHRESHOLD`: `SYSTEM_PARAMETERS_INFO_ACTION` = 132u;
public const val `SPI_GETMOUSEHOVERHEIGHT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 100u;
public const val `SPI_GETMOUSEHOVERTIME`: `SYSTEM_PARAMETERS_INFO_ACTION` = 102u;
public const val `SPI_GETMOUSEHOVERWIDTH`: `SYSTEM_PARAMETERS_INFO_ACTION` = 98u;
public const val `SPI_GETMOUSEKEYS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 54u;
public const val `SPI_GETMOUSESIDEMOVETHRESHOLD`: `SYSTEM_PARAMETERS_INFO_ACTION` = 136u;
public const val `SPI_GETMOUSESONAR`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4124u;
public const val `SPI_GETMOUSESPEED`: `SYSTEM_PARAMETERS_INFO_ACTION` = 112u;
public const val `SPI_GETMOUSETRAILS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 94u;
public const val `SPI_GETMOUSEVANISH`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4128u;
public const val `SPI_GETMOUSEWHEELROUTING`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8220u;
public const val `SPI_GETNONCLIENTMETRICS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 41u;
public const val `SPI_GETPENARBITRATIONTYPE`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8224u;
public const val `SPI_GETPENDOCKTHRESHOLD`: `SYSTEM_PARAMETERS_INFO_ACTION` = 128u;
public const val `SPI_GETPENDRAGOUTTHRESHOLD`: `SYSTEM_PARAMETERS_INFO_ACTION` = 134u;
public const val `SPI_GETPENSIDEMOVETHRESHOLD`: `SYSTEM_PARAMETERS_INFO_ACTION` = 138u;
public const val `SPI_GETPENVISUALIZATION`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8222u;
public const val `SPI_GETPOWEROFFACTIVE`: `SYSTEM_PARAMETERS_INFO_ACTION` = 84u;
public const val `SPI_GETPOWEROFFTIMEOUT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 80u;
public const val `SPI_GETSCREENREADER`: `SYSTEM_PARAMETERS_INFO_ACTION` = 70u;
public const val `SPI_GETSCREENSAVEACTIVE`: `SYSTEM_PARAMETERS_INFO_ACTION` = 16u;
public const val `SPI_GETSCREENSAVERRUNNING`: `SYSTEM_PARAMETERS_INFO_ACTION` = 114u;
public const val `SPI_GETSCREENSAVESECURE`: `SYSTEM_PARAMETERS_INFO_ACTION` = 118u;
public const val `SPI_GETSCREENSAVETIMEOUT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 14u;
public const val `SPI_GETSELECTIONFADE`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4116u;
public const val `SPI_GETSERIALKEYS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 62u;
public const val `SPI_GETSHOWIMEUI`: `SYSTEM_PARAMETERS_INFO_ACTION` = 110u;
public const val `SPI_GETSHOWSOUNDS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 56u;
public const val `SPI_GETSNAPSIZING`: `SYSTEM_PARAMETERS_INFO_ACTION` = 142u;
public const val `SPI_GETSNAPTODEFBUTTON`: `SYSTEM_PARAMETERS_INFO_ACTION` = 95u;
public const val `SPI_GETSOUNDSENTRY`: `SYSTEM_PARAMETERS_INFO_ACTION` = 64u;
public const val `SPI_GETSPEECHRECOGNITION`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4170u;
public const val `SPI_GETSTICKYKEYS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 58u;
public const val `SPI_GETSYSTEMLANGUAGEBAR`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4176u;
public const val `SPI_GETTHREADLOCALINPUTSETTINGS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4174u;
public const val `SPI_GETTOGGLEKEYS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 52u;
public const val `SPI_GETTOOLTIPANIMATION`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4118u;
public const val `SPI_GETTOOLTIPFADE`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4120u;
public const val `SPI_GETTOUCHPREDICTIONPARAMETERS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 156u;
public const val `SPI_GETUIEFFECTS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4158u;
public const val `SPI_GETWAITTOKILLSERVICETIMEOUT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 124u;
public const val `SPI_GETWAITTOKILLTIMEOUT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 122u;
public const val `SPI_GETWHEELSCROLLCHARS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 108u;
public const val `SPI_GETWHEELSCROLLLINES`: `SYSTEM_PARAMETERS_INFO_ACTION` = 104u;
public const val `SPI_GETWINARRANGING`: `SYSTEM_PARAMETERS_INFO_ACTION` = 130u;
public const val `SPI_GETWINDOWSEXTENSION`: `SYSTEM_PARAMETERS_INFO_ACTION` = 92u;
public const val `SPI_GETWORKAREA`: `SYSTEM_PARAMETERS_INFO_ACTION` = 48u;
public const val `SPI_ICONHORIZONTALSPACING`: `SYSTEM_PARAMETERS_INFO_ACTION` = 13u;
public const val `SPI_ICONVERTICALSPACING`: `SYSTEM_PARAMETERS_INFO_ACTION` = 24u;
public const val `SPI_LANGDRIVER`: `SYSTEM_PARAMETERS_INFO_ACTION` = 12u;
public const val `SPI_SCREENSAVERRUNNING`: `SYSTEM_PARAMETERS_INFO_ACTION` = 97u;
public const val `SPI_SETACCESSTIMEOUT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 61u;
public const val `SPI_SETACTIVEWINDOWTRACKING`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4097u;
public const val `SPI_SETACTIVEWNDTRKTIMEOUT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8195u;
public const val `SPI_SETACTIVEWNDTRKZORDER`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4109u;
public const val `SPI_SETANIMATION`: `SYSTEM_PARAMETERS_INFO_ACTION` = 73u;
public const val `SPI_SETAUDIODESCRIPTION`: `SYSTEM_PARAMETERS_INFO_ACTION` = 117u;
public const val `SPI_SETBEEP`: `SYSTEM_PARAMETERS_INFO_ACTION` = 2u;
public const val `SPI_SETBLOCKSENDINPUTRESETS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4135u;
public const val `SPI_SETBORDER`: `SYSTEM_PARAMETERS_INFO_ACTION` = 6u;
public const val `SPI_SETCARETBROWSING`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4173u;
public const val `SPI_SETCARETTIMEOUT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8227u;
public const val `SPI_SETCARETWIDTH`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8199u;
public const val `SPI_SETCLEARTYPE`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4169u;
public const val `SPI_SETCLIENTAREAANIMATION`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4163u;
public const val `SPI_SETCOMBOBOXANIMATION`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4101u;
public const val `SPI_SETCONTACTVISUALIZATION`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8217u;
public const val `SPI_SETCURSORS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 87u;
public const val `SPI_SETCURSORSHADOW`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4123u;
public const val `SPI_SETDEFAULTINPUTLANG`: `SYSTEM_PARAMETERS_INFO_ACTION` = 90u;
public const val `SPI_SETDESKPATTERN`: `SYSTEM_PARAMETERS_INFO_ACTION` = 21u;
public const val `SPI_SETDESKWALLPAPER`: `SYSTEM_PARAMETERS_INFO_ACTION` = 20u;
public const val `SPI_SETDISABLEOVERLAPPEDCONTENT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4161u;
public const val `SPI_SETDOCKMOVING`: `SYSTEM_PARAMETERS_INFO_ACTION` = 145u;
public const val `SPI_SETDOUBLECLICKTIME`: `SYSTEM_PARAMETERS_INFO_ACTION` = 32u;
public const val `SPI_SETDOUBLECLKHEIGHT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 30u;
public const val `SPI_SETDOUBLECLKWIDTH`: `SYSTEM_PARAMETERS_INFO_ACTION` = 29u;
public const val `SPI_SETDRAGFROMMAXIMIZE`: `SYSTEM_PARAMETERS_INFO_ACTION` = 141u;
public const val `SPI_SETDRAGFULLWINDOWS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 37u;
public const val `SPI_SETDRAGHEIGHT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 77u;
public const val `SPI_SETDRAGWIDTH`: `SYSTEM_PARAMETERS_INFO_ACTION` = 76u;
public const val `SPI_SETDROPSHADOW`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4133u;
public const val `SPI_SETFASTTASKSWITCH`: `SYSTEM_PARAMETERS_INFO_ACTION` = 36u;
public const val `SPI_SETFILTERKEYS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 51u;
public const val `SPI_SETFLATMENU`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4131u;
public const val `SPI_SETFOCUSBORDERHEIGHT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8209u;
public const val `SPI_SETFOCUSBORDERWIDTH`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8207u;
public const val `SPI_SETFONTSMOOTHING`: `SYSTEM_PARAMETERS_INFO_ACTION` = 75u;
public const val `SPI_SETFONTSMOOTHINGCONTRAST`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8205u;
public const val `SPI_SETFONTSMOOTHINGORIENTATION`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8211u;
public const val `SPI_SETFONTSMOOTHINGTYPE`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8203u;
public const val `SPI_SETFOREGROUNDFLASHCOUNT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8197u;
public const val `SPI_SETFOREGROUNDLOCKTIMEOUT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8193u;
public const val `SPI_SETGESTUREVISUALIZATION`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8219u;
public const val `SPI_SETGRADIENTCAPTIONS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4105u;
public const val `SPI_SETGRIDGRANULARITY`: `SYSTEM_PARAMETERS_INFO_ACTION` = 19u;
public const val `SPI_SETHANDEDNESS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8229u;
public const val `SPI_SETHANDHELD`: `SYSTEM_PARAMETERS_INFO_ACTION` = 78u;
public const val `SPI_SETHIGHCONTRAST`: `SYSTEM_PARAMETERS_INFO_ACTION` = 67u;
public const val `SPI_SETHOTTRACKING`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4111u;
public const val `SPI_SETHUNGAPPTIMEOUT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 121u;
public const val `SPI_SETICONMETRICS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 46u;
public const val `SPI_SETICONS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 88u;
public const val `SPI_SETICONTITLELOGFONT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 34u;
public const val `SPI_SETICONTITLEWRAP`: `SYSTEM_PARAMETERS_INFO_ACTION` = 26u;
public const val `SPI_SETKEYBOARDCUES`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4107u;
public const val `SPI_SETKEYBOARDDELAY`: `SYSTEM_PARAMETERS_INFO_ACTION` = 23u;
public const val `SPI_SETKEYBOARDPREF`: `SYSTEM_PARAMETERS_INFO_ACTION` = 69u;
public const val `SPI_SETKEYBOARDSPEED`: `SYSTEM_PARAMETERS_INFO_ACTION` = 11u;
public const val `SPI_SETLANGTOGGLE`: `SYSTEM_PARAMETERS_INFO_ACTION` = 91u;
public const val `SPI_SETLISTBOXSMOOTHSCROLLING`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4103u;
public const val `SPI_SETLOGICALDPIOVERRIDE`: `SYSTEM_PARAMETERS_INFO_ACTION` = 159u;
public const val `SPI_SETLOWPOWERACTIVE`: `SYSTEM_PARAMETERS_INFO_ACTION` = 85u;
public const val `SPI_SETLOWPOWERTIMEOUT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 81u;
public const val `SPI_SETMENUANIMATION`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4099u;
public const val `SPI_SETMENUDROPALIGNMENT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 28u;
public const val `SPI_SETMENUFADE`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4115u;
public const val `SPI_SETMENURECT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 163u;
public const val `SPI_SETMENUSHOWDELAY`: `SYSTEM_PARAMETERS_INFO_ACTION` = 107u;
public const val `SPI_SETMENUUNDERLINES`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4107u;
public const val `SPI_SETMESSAGEDURATION`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8215u;
public const val `SPI_SETMINIMIZEDMETRICS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 44u;
public const val `SPI_SETMINIMUMHITRADIUS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8213u;
public const val `SPI_SETMOUSE`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4u;
public const val `SPI_SETMOUSEBUTTONSWAP`: `SYSTEM_PARAMETERS_INFO_ACTION` = 33u;
public const val `SPI_SETMOUSECLICKLOCK`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4127u;
public const val `SPI_SETMOUSECLICKLOCKTIME`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8201u;
public const val `SPI_SETMOUSEDOCKTHRESHOLD`: `SYSTEM_PARAMETERS_INFO_ACTION` = 127u;
public const val `SPI_SETMOUSEDRAGOUTTHRESHOLD`: `SYSTEM_PARAMETERS_INFO_ACTION` = 133u;
public const val `SPI_SETMOUSEHOVERHEIGHT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 101u;
public const val `SPI_SETMOUSEHOVERTIME`: `SYSTEM_PARAMETERS_INFO_ACTION` = 103u;
public const val `SPI_SETMOUSEHOVERWIDTH`: `SYSTEM_PARAMETERS_INFO_ACTION` = 99u;
public const val `SPI_SETMOUSEKEYS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 55u;
public const val `SPI_SETMOUSESIDEMOVETHRESHOLD`: `SYSTEM_PARAMETERS_INFO_ACTION` = 137u;
public const val `SPI_SETMOUSESONAR`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4125u;
public const val `SPI_SETMOUSESPEED`: `SYSTEM_PARAMETERS_INFO_ACTION` = 113u;
public const val `SPI_SETMOUSETRAILS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 93u;
public const val `SPI_SETMOUSEVANISH`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4129u;
public const val `SPI_SETMOUSEWHEELROUTING`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8221u;
public const val `SPI_SETNONCLIENTMETRICS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 42u;
public const val `SPI_SETPENARBITRATIONTYPE`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8225u;
public const val `SPI_SETPENDOCKTHRESHOLD`: `SYSTEM_PARAMETERS_INFO_ACTION` = 129u;
public const val `SPI_SETPENDRAGOUTTHRESHOLD`: `SYSTEM_PARAMETERS_INFO_ACTION` = 135u;
public const val `SPI_SETPENSIDEMOVETHRESHOLD`: `SYSTEM_PARAMETERS_INFO_ACTION` = 139u;
public const val `SPI_SETPENVISUALIZATION`: `SYSTEM_PARAMETERS_INFO_ACTION` = 8223u;
public const val `SPI_SETPENWINDOWS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 49u;
public const val `SPI_SETPOWEROFFACTIVE`: `SYSTEM_PARAMETERS_INFO_ACTION` = 86u;
public const val `SPI_SETPOWEROFFTIMEOUT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 82u;
public const val `SPI_SETSCREENREADER`: `SYSTEM_PARAMETERS_INFO_ACTION` = 71u;
public const val `SPI_SETSCREENSAVEACTIVE`: `SYSTEM_PARAMETERS_INFO_ACTION` = 17u;
public const val `SPI_SETSCREENSAVERRUNNING`: `SYSTEM_PARAMETERS_INFO_ACTION` = 97u;
public const val `SPI_SETSCREENSAVESECURE`: `SYSTEM_PARAMETERS_INFO_ACTION` = 119u;
public const val `SPI_SETSCREENSAVETIMEOUT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 15u;
public const val `SPI_SETSELECTIONFADE`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4117u;
public const val `SPI_SETSERIALKEYS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 63u;
public const val `SPI_SETSHOWIMEUI`: `SYSTEM_PARAMETERS_INFO_ACTION` = 111u;
public const val `SPI_SETSHOWSOUNDS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 57u;
public const val `SPI_SETSNAPSIZING`: `SYSTEM_PARAMETERS_INFO_ACTION` = 143u;
public const val `SPI_SETSNAPTODEFBUTTON`: `SYSTEM_PARAMETERS_INFO_ACTION` = 96u;
public const val `SPI_SETSOUNDSENTRY`: `SYSTEM_PARAMETERS_INFO_ACTION` = 65u;
public const val `SPI_SETSPEECHRECOGNITION`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4171u;
public const val `SPI_SETSTICKYKEYS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 59u;
public const val `SPI_SETSYSTEMLANGUAGEBAR`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4177u;
public const val `SPI_SETTHREADLOCALINPUTSETTINGS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4175u;
public const val `SPI_SETTOGGLEKEYS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 53u;
public const val `SPI_SETTOOLTIPANIMATION`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4119u;
public const val `SPI_SETTOOLTIPFADE`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4121u;
public const val `SPI_SETTOUCHPREDICTIONPARAMETERS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 157u;
public const val `SPI_SETUIEFFECTS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 4159u;
public const val `SPI_SETWAITTOKILLSERVICETIMEOUT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 125u;
public const val `SPI_SETWAITTOKILLTIMEOUT`: `SYSTEM_PARAMETERS_INFO_ACTION` = 123u;
public const val `SPI_SETWHEELSCROLLCHARS`: `SYSTEM_PARAMETERS_INFO_ACTION` = 109u;
public const val `SPI_SETWHEELSCROLLLINES`: `SYSTEM_PARAMETERS_INFO_ACTION` = 105u;
public const val `SPI_SETWINARRANGING`: `SYSTEM_PARAMETERS_INFO_ACTION` = 131u;
public const val `SPI_SETWORKAREA`: `SYSTEM_PARAMETERS_INFO_ACTION` = 47u;
public const val `STATE_SYSTEM_ALERT_HIGH`: UInt = 268435456u;
public const val `STATE_SYSTEM_ALERT_LOW`: UInt = 67108864u;
public const val `STATE_SYSTEM_ALERT_MEDIUM`: UInt = 134217728u;
public const val `STATE_SYSTEM_ANIMATED`: UInt = 16384u;
public const val `STATE_SYSTEM_BUSY`: UInt = 2048u;
public const val `STATE_SYSTEM_CHECKED`: UInt = 16u;
public const val `STATE_SYSTEM_COLLAPSED`: UInt = 1024u;
public const val `STATE_SYSTEM_DEFAULT`: UInt = 256u;
public const val `STATE_SYSTEM_EXPANDED`: UInt = 512u;
public const val `STATE_SYSTEM_EXTSELECTABLE`: UInt = 33554432u;
public const val `STATE_SYSTEM_FLOATING`: UInt = 4096u;
public const val `STATE_SYSTEM_FOCUSED`: UInt = 4u;
public const val `STATE_SYSTEM_HOTTRACKED`: UInt = 128u;
public const val `STATE_SYSTEM_INDETERMINATE`: UInt = 32u;
public const val `STATE_SYSTEM_LINKED`: UInt = 4194304u;
public const val `STATE_SYSTEM_MARQUEED`: UInt = 8192u;
public const val `STATE_SYSTEM_MIXED`: UInt = 32u;
public const val `STATE_SYSTEM_MOVEABLE`: UInt = 262144u;
public const val `STATE_SYSTEM_MULTISELECTABLE`: UInt = 16777216u;
public const val `STATE_SYSTEM_PROTECTED`: UInt = 536870912u;
public const val `STATE_SYSTEM_READONLY`: UInt = 64u;
public const val `STATE_SYSTEM_SELECTABLE`: UInt = 2097152u;
public const val `STATE_SYSTEM_SELECTED`: UInt = 2u;
public const val `STATE_SYSTEM_SELFVOICING`: UInt = 524288u;
public const val `STATE_SYSTEM_SIZEABLE`: UInt = 131072u;
public const val `STATE_SYSTEM_TRAVERSED`: UInt = 8388608u;
public const val `STATE_SYSTEM_VALID`: UInt = 1073741823u;
public const val `STM_GETICON`: UInt = 369u;
public const val `STM_GETIMAGE`: UInt = 371u;
public const val `STM_MSGMAX`: UInt = 372u;
public const val `STM_SETICON`: UInt = 368u;
public const val `STM_SETIMAGE`: UInt = 370u;
public const val `STN_CLICKED`: UInt = 0u;
public const val `STN_DBLCLK`: UInt = 1u;
public const val `STN_DISABLE`: UInt = 3u;
public const val `STN_ENABLE`: UInt = 2u;
public const val `STRSAFE_E_END_OF_FILE`: Int = -2147024858;
public const val `STRSAFE_E_INSUFFICIENT_BUFFER`: Int = -2147024774;
public const val `STRSAFE_E_INVALID_PARAMETER`: Int = -2147024809;
public const val `STRSAFE_FILL_BEHIND_NULL`: UInt = 512u;
public const val `STRSAFE_FILL_ON_FAILURE`: UInt = 1024u;
public const val `STRSAFE_IGNORE_NULLS`: UInt = 256u;
public const val `STRSAFE_MAX_CCH`: UInt = 2147483647u;
public const val `STRSAFE_MAX_LENGTH`: UInt = 2147483646u;
public const val `STRSAFE_NO_TRUNCATION`: UInt = 4096u;
public const val `STRSAFE_NULL_ON_FAILURE`: UInt = 2048u;
public const val `STRSAFE_USE_SECURE_CRT`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STYLESTRUCT` (
    public var `styleOld`: UInt,
    public var `styleNew`: UInt,
)
public const val `SWP_ASYNCWINDOWPOS`: `SET_WINDOW_POS_FLAGS` = 16384u;
public const val `SWP_DEFERERASE`: `SET_WINDOW_POS_FLAGS` = 8192u;
public const val `SWP_DRAWFRAME`: `SET_WINDOW_POS_FLAGS` = 32u;
public const val `SWP_FRAMECHANGED`: `SET_WINDOW_POS_FLAGS` = 32u;
public const val `SWP_HIDEWINDOW`: `SET_WINDOW_POS_FLAGS` = 128u;
public const val `SWP_NOACTIVATE`: `SET_WINDOW_POS_FLAGS` = 16u;
public const val `SWP_NOCOPYBITS`: `SET_WINDOW_POS_FLAGS` = 256u;
public const val `SWP_NOMOVE`: `SET_WINDOW_POS_FLAGS` = 2u;
public const val `SWP_NOOWNERZORDER`: `SET_WINDOW_POS_FLAGS` = 512u;
public const val `SWP_NOREDRAW`: `SET_WINDOW_POS_FLAGS` = 8u;
public const val `SWP_NOREPOSITION`: `SET_WINDOW_POS_FLAGS` = 512u;
public const val `SWP_NOSENDCHANGING`: `SET_WINDOW_POS_FLAGS` = 1024u;
public const val `SWP_NOSIZE`: `SET_WINDOW_POS_FLAGS` = 1u;
public const val `SWP_NOZORDER`: `SET_WINDOW_POS_FLAGS` = 4u;
public const val `SWP_SHOWWINDOW`: `SET_WINDOW_POS_FLAGS` = 64u;
public const val `SW_ERASE`: `SCROLL_WINDOW_FLAGS` = 4u;
public const val `SW_FORCEMINIMIZE`: `SHOW_WINDOW_CMD` = 11;
public const val `SW_HIDE`: `SHOW_WINDOW_CMD` = 0;
public const val `SW_INVALIDATE`: `SCROLL_WINDOW_FLAGS` = 2u;
public const val `SW_MAX`: `SHOW_WINDOW_CMD` = 11;
public const val `SW_MAXIMIZE`: `SHOW_WINDOW_CMD` = 3;
public const val `SW_MINIMIZE`: `SHOW_WINDOW_CMD` = 6;
public const val `SW_NORMAL`: `SHOW_WINDOW_CMD` = 1;
public const val `SW_OTHERUNZOOM`: `SHOW_WINDOW_STATUS` = 4u;
public const val `SW_OTHERZOOM`: `SHOW_WINDOW_STATUS` = 2u;
public const val `SW_PARENTCLOSING`: `SHOW_WINDOW_STATUS` = 1u;
public const val `SW_PARENTOPENING`: `SHOW_WINDOW_STATUS` = 3u;
public const val `SW_RESTORE`: `SHOW_WINDOW_CMD` = 9;
public const val `SW_SCROLLCHILDREN`: `SCROLL_WINDOW_FLAGS` = 1u;
public const val `SW_SHOW`: `SHOW_WINDOW_CMD` = 5;
public const val `SW_SHOWDEFAULT`: `SHOW_WINDOW_CMD` = 10;
public const val `SW_SHOWMAXIMIZED`: `SHOW_WINDOW_CMD` = 3;
public const val `SW_SHOWMINIMIZED`: `SHOW_WINDOW_CMD` = 2;
public const val `SW_SHOWMINNOACTIVE`: `SHOW_WINDOW_CMD` = 7;
public const val `SW_SHOWNA`: `SHOW_WINDOW_CMD` = 8;
public const val `SW_SHOWNOACTIVATE`: `SHOW_WINDOW_CMD` = 4;
public const val `SW_SHOWNORMAL`: `SHOW_WINDOW_CMD` = 1;
public const val `SW_SMOOTHSCROLL`: `SCROLL_WINDOW_FLAGS` = 16u;
public typealias `SYSTEM_CURSOR_ID` = UInt;
public typealias `SYSTEM_METRICS_INDEX` = Int;
public typealias `SYSTEM_PARAMETERS_INFO_ACTION` = UInt;
public typealias `SYSTEM_PARAMETERS_INFO_UPDATE_FLAGS` = UInt;
public const val `TDF_REGISTER`: `TOOLTIP_DISMISS_FLAGS` = 1;
public const val `TDF_UNREGISTER`: `TOOLTIP_DISMISS_FLAGS` = 2;
public typealias `TILE_WINDOWS_HOW` = UInt;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `TIMERPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, UInt, ULong, UInt) -> Unit>>>;
public const val `TIMERV_COALESCING_MAX`: UInt = 2147483637u;
public const val `TIMERV_COALESCING_MIN`: UInt = 1u;
public const val `TIMERV_DEFAULT_COALESCING`: UInt = 0u;
public const val `TIMERV_NO_COALESCING`: UInt = 4294967295u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TITLEBARINFO` (
    public var `cbSize`: UInt,
    public var `rcTitleBar`: `super`.`super`.`Foundation`.`RECT`,
    public var `rgstate`: UIntArray,
)
// UNSUPPORTED Rust 3394:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TITLEBARINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TITLEBARINFOEX` (
    public var `cbSize`: UInt,
    public var `rcTitleBar`: `super`.`super`.`Foundation`.`RECT`,
    public var `rgstate`: UIntArray,
    public var `rgrect`: Array<`super`.`super`.`Foundation`.`RECT`>,
)
// UNSUPPORTED Rust 3407:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TITLEBARINFOEX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TKF_AVAILABLE`: UInt = 2u;
public const val `TKF_CONFIRMHOTKEY`: UInt = 8u;
public const val `TKF_HOTKEYACTIVE`: UInt = 4u;
public const val `TKF_HOTKEYSOUND`: UInt = 16u;
public const val `TKF_INDICATOR`: UInt = 32u;
public const val `TKF_TOGGLEKEYSON`: UInt = 1u;
public typealias `TOOLTIP_DISMISS_FLAGS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TOUCHPREDICTIONPARAMETERS` (
    public var `cbSize`: UInt,
    public var `dwLatency`: UInt,
    public var `dwSampleTime`: UInt,
    public var `bUseHWTimeStamp`: UInt,
)
public const val `TOUCHPREDICTIONPARAMETERS_DEFAULT_LATENCY`: UInt = 8u;
// UNSUPPORTED Rust 3428:1: unresolved scalar type f32; syntax: constant expression has no syntax candidate rule
// pub const TOUCHPREDICTIONPARAMETERS_DEFAULT_RLS_DELTA: f32 = 0.001f32;

// UNSUPPORTED Rust 3429:1: unresolved scalar type f32; syntax: constant expression has no syntax candidate rule
// pub const TOUCHPREDICTIONPARAMETERS_DEFAULT_RLS_EXPO_SMOOTH_ALPHA: f32 = 0.99f32;

// UNSUPPORTED Rust 3430:1: unresolved scalar type f32; syntax: constant expression has no syntax candidate rule
// pub const TOUCHPREDICTIONPARAMETERS_DEFAULT_RLS_LAMBDA_LEARNING_RATE: f32 = 0.001f32;

// UNSUPPORTED Rust 3431:1: unresolved scalar type f32; syntax: constant expression has no syntax candidate rule
// pub const TOUCHPREDICTIONPARAMETERS_DEFAULT_RLS_LAMBDA_MAX: f32 = 0.999f32;

// UNSUPPORTED Rust 3432:1: unresolved scalar type f32; syntax: constant expression has no syntax candidate rule
// pub const TOUCHPREDICTIONPARAMETERS_DEFAULT_RLS_LAMBDA_MIN: f32 = 0.9f32;

public const val `TOUCHPREDICTIONPARAMETERS_DEFAULT_SAMPLETIME`: UInt = 8u;
public const val `TOUCHPREDICTIONPARAMETERS_DEFAULT_USE_HW_TIMESTAMP`: UInt = 1u;
public const val `TOUCH_FLAG_NONE`: UInt = 0u;
public const val `TOUCH_HIT_TESTING_CLIENT`: UInt = 1u;
public const val `TOUCH_HIT_TESTING_DEFAULT`: UInt = 0u;
public const val `TOUCH_HIT_TESTING_NONE`: UInt = 2u;
public const val `TOUCH_HIT_TESTING_PROXIMITY_CLOSEST`: UInt = 0u;
public const val `TOUCH_HIT_TESTING_PROXIMITY_FARTHEST`: UInt = 4095u;
public const val `TOUCH_MASK_CONTACTAREA`: UInt = 1u;
public const val `TOUCH_MASK_NONE`: UInt = 0u;
public const val `TOUCH_MASK_ORIENTATION`: UInt = 2u;
public const val `TOUCH_MASK_PRESSURE`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TPMPARAMS` (
    public var `cbSize`: UInt,
    public var `rcExclude`: `super`.`super`.`Foundation`.`RECT`,
)
public const val `TPM_BOTTOMALIGN`: `TRACK_POPUP_MENU_FLAGS` = 32u;
public const val `TPM_CENTERALIGN`: `TRACK_POPUP_MENU_FLAGS` = 4u;
public const val `TPM_HORIZONTAL`: `TRACK_POPUP_MENU_FLAGS` = 0u;
public const val `TPM_HORNEGANIMATION`: `TRACK_POPUP_MENU_FLAGS` = 2048u;
public const val `TPM_HORPOSANIMATION`: `TRACK_POPUP_MENU_FLAGS` = 1024u;
public const val `TPM_LAYOUTRTL`: `TRACK_POPUP_MENU_FLAGS` = 32768u;
public const val `TPM_LEFTALIGN`: `TRACK_POPUP_MENU_FLAGS` = 0u;
public const val `TPM_LEFTBUTTON`: `TRACK_POPUP_MENU_FLAGS` = 0u;
public const val `TPM_NOANIMATION`: `TRACK_POPUP_MENU_FLAGS` = 16384u;
public const val `TPM_NONOTIFY`: `TRACK_POPUP_MENU_FLAGS` = 128u;
public const val `TPM_RECURSE`: `TRACK_POPUP_MENU_FLAGS` = 1u;
public const val `TPM_RETURNCMD`: `TRACK_POPUP_MENU_FLAGS` = 256u;
public const val `TPM_RIGHTALIGN`: `TRACK_POPUP_MENU_FLAGS` = 8u;
public const val `TPM_RIGHTBUTTON`: `TRACK_POPUP_MENU_FLAGS` = 2u;
public const val `TPM_TOPALIGN`: `TRACK_POPUP_MENU_FLAGS` = 0u;
public const val `TPM_VCENTERALIGN`: `TRACK_POPUP_MENU_FLAGS` = 16u;
public const val `TPM_VERNEGANIMATION`: `TRACK_POPUP_MENU_FLAGS` = 8192u;
public const val `TPM_VERPOSANIMATION`: `TRACK_POPUP_MENU_FLAGS` = 4096u;
public const val `TPM_VERTICAL`: `TRACK_POPUP_MENU_FLAGS` = 64u;
public const val `TPM_WORKAREA`: `TRACK_POPUP_MENU_FLAGS` = 65536u;
public typealias `TRACK_POPUP_MENU_FLAGS` = UInt;
public const val `UISF_ACTIVE`: UInt = 4u;
public const val `UISF_HIDEACCEL`: UInt = 2u;
public const val `UISF_HIDEFOCUS`: UInt = 1u;
public const val `UIS_CLEAR`: UInt = 2u;
public const val `UIS_INITIALIZE`: UInt = 3u;
public const val `UIS_SET`: UInt = 1u;
public const val `ULW_ALPHA`: `UPDATE_LAYERED_WINDOW_FLAGS` = 2u;
public const val `ULW_COLORKEY`: `UPDATE_LAYERED_WINDOW_FLAGS` = 1u;
public const val `ULW_EX_NORESIZE`: `UPDATE_LAYERED_WINDOW_FLAGS` = 8u;
public const val `ULW_OPAQUE`: `UPDATE_LAYERED_WINDOW_FLAGS` = 4u;
public const val `UNICODE_NOCHAR`: UInt = 65535u;
public const val `UOI_TIMERPROC_EXCEPTION_SUPPRESSION`: UInt = 7u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `UPDATELAYEREDWINDOWINFO` (
    public var `cbSize`: UInt,
    public var `hdcDst`: `super`.`super`.`Graphics`.`Gdi`.`HDC`,
    public var `pptDst`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?,
    public var `psize`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SIZE`>?,
    public var `hdcSrc`: `super`.`super`.`Graphics`.`Gdi`.`HDC`,
    public var `pptSrc`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?,
    public var `crKey`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `pblend`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`BLENDFUNCTION`>?,
    public var `dwFlags`: `UPDATE_LAYERED_WINDOW_FLAGS`,
    public var `prcDirty`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?,
)
// UNSUPPORTED Rust 3499:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for UPDATELAYEREDWINDOWINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `UPDATE_LAYERED_WINDOW_FLAGS` = UInt;
public const val `USER_DEFAULT_SCREEN_DPI`: UInt = 96u;
public const val `USER_TIMER_MAXIMUM`: UInt = 2147483647u;
public const val `USER_TIMER_MINIMUM`: UInt = 10u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VolLockBroadcast` (
    public var `vlb_dbh`: `DEV_BROADCAST_HDR`,
    public var `vlb_owner`: UInt,
    public var `vlb_perms`: UByte,
    public var `vlb_lockType`: UByte,
    public var `vlb_drive`: UByte,
    public var `vlb_flags`: UByte,
)
public const val `WA_ACTIVE`: UInt = 1u;
public const val `WA_CLICKACTIVE`: UInt = 2u;
public const val `WA_INACTIVE`: UInt = 0u;
public const val `WDA_EXCLUDEFROMCAPTURE`: `WINDOW_DISPLAY_AFFINITY` = 17u;
public const val `WDA_MONITOR`: `WINDOW_DISPLAY_AFFINITY` = 1u;
public const val `WDA_NONE`: `WINDOW_DISPLAY_AFFINITY` = 0u;
public const val `WHEEL_DELTA`: UInt = 120u;
public const val `WH_CALLWNDPROC`: `WINDOWS_HOOK_ID` = 4;
public const val `WH_CALLWNDPROCRET`: `WINDOWS_HOOK_ID` = 12;
public const val `WH_CBT`: `WINDOWS_HOOK_ID` = 5;
public const val `WH_DEBUG`: `WINDOWS_HOOK_ID` = 9;
public const val `WH_FOREGROUNDIDLE`: `WINDOWS_HOOK_ID` = 11;
public const val `WH_GETMESSAGE`: `WINDOWS_HOOK_ID` = 3;
public const val `WH_HARDWARE`: UInt = 8u;
public const val `WH_JOURNALPLAYBACK`: `WINDOWS_HOOK_ID` = 1;
public const val `WH_JOURNALRECORD`: `WINDOWS_HOOK_ID` = 0;
public const val `WH_KEYBOARD`: `WINDOWS_HOOK_ID` = 2;
public const val `WH_KEYBOARD_LL`: `WINDOWS_HOOK_ID` = 13;
public const val `WH_MAX`: UInt = 14u;
public const val `WH_MAXHOOK`: UInt = 14u;
public const val `WH_MIN`: Int = -1;
public const val `WH_MINHOOK`: Int = -1;
public const val `WH_MOUSE`: `WINDOWS_HOOK_ID` = 7;
public const val `WH_MOUSE_LL`: `WINDOWS_HOOK_ID` = 14;
public const val `WH_MSGFILTER`: `WINDOWS_HOOK_ID` = -1;
public const val `WH_SHELL`: `WINDOWS_HOOK_ID` = 10;
public const val `WH_SYSMSGFILTER`: `WINDOWS_HOOK_ID` = 6;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINDOWINFO` (
    public var `cbSize`: UInt,
    public var `rcWindow`: `super`.`super`.`Foundation`.`RECT`,
    public var `rcClient`: `super`.`super`.`Foundation`.`RECT`,
    public var `dwStyle`: `WINDOW_STYLE`,
    public var `dwExStyle`: `WINDOW_EX_STYLE`,
    public var `dwWindowStatus`: UInt,
    public var `cxWindowBorders`: UInt,
    public var `cyWindowBorders`: UInt,
    public var `atomWindowType`: UShort,
    public var `wCreatorVersion`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINDOWPLACEMENT` (
    public var `length`: UInt,
    public var `flags`: `WINDOWPLACEMENT_FLAGS`,
    public var `showCmd`: UInt,
    public var `ptMinPosition`: `super`.`super`.`Foundation`.`POINT`,
    public var `ptMaxPosition`: `super`.`super`.`Foundation`.`POINT`,
    public var `rcNormalPosition`: `super`.`super`.`Foundation`.`RECT`,
)
public typealias `WINDOWPLACEMENT_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINDOWPOS` (
    public var `hwnd`: `super`.`super`.`Foundation`.`HWND`,
    public var `hwndInsertAfter`: `super`.`super`.`Foundation`.`HWND`,
    public var `x`: Int,
    public var `y`: Int,
    public var `cx`: Int,
    public var `cy`: Int,
    public var `flags`: `SET_WINDOW_POS_FLAGS`,
)
// UNSUPPORTED Rust 3582:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINDOWPOS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WINDOWS_HOOK_ID` = Int;
public typealias `WINDOW_DISPLAY_AFFINITY` = UInt;
public typealias `WINDOW_EX_STYLE` = UInt;
public typealias `WINDOW_LONG_PTR_INDEX` = Int;
public typealias `WINDOW_MESSAGE_FILTER_ACTION` = UInt;
public typealias `WINDOW_STYLE` = UInt;
public const val `WINEVENT_INCONTEXT`: UInt = 4u;
public const val `WINEVENT_OUTOFCONTEXT`: UInt = 0u;
public const val `WINEVENT_SKIPOWNPROCESS`: UInt = 2u;
public const val `WINEVENT_SKIPOWNTHREAD`: UInt = 1u;
public const val `WINSTA_ACCESSCLIPBOARD`: Int = 4;
public const val `WINSTA_ACCESSGLOBALATOMS`: Int = 32;
public const val `WINSTA_ALL_ACCESS`: Int = 895;
public const val `WINSTA_CREATEDESKTOP`: Int = 8;
public const val `WINSTA_ENUMDESKTOPS`: Int = 1;
public const val `WINSTA_ENUMERATE`: Int = 256;
public const val `WINSTA_EXITWINDOWS`: Int = 64;
public const val `WINSTA_READATTRIBUTES`: Int = 2;
public const val `WINSTA_READSCREEN`: Int = 512;
public const val `WINSTA_WRITEATTRIBUTES`: Int = 16;
public const val `WMSZ_BOTTOM`: UInt = 6u;
public const val `WMSZ_BOTTOMLEFT`: UInt = 7u;
public const val `WMSZ_BOTTOMRIGHT`: UInt = 8u;
public const val `WMSZ_LEFT`: UInt = 1u;
public const val `WMSZ_RIGHT`: UInt = 2u;
public const val `WMSZ_TOP`: UInt = 3u;
public const val `WMSZ_TOPLEFT`: UInt = 4u;
public const val `WMSZ_TOPRIGHT`: UInt = 5u;
public const val `WM_ACTIVATE`: UInt = 6u;
public const val `WM_ACTIVATEAPP`: UInt = 28u;
public const val `WM_AFXFIRST`: UInt = 864u;
public const val `WM_AFXLAST`: UInt = 895u;
public const val `WM_APP`: UInt = 32768u;
public const val `WM_APPCOMMAND`: UInt = 793u;
public const val `WM_ASKCBFORMATNAME`: UInt = 780u;
public const val `WM_CANCELJOURNAL`: UInt = 75u;
public const val `WM_CANCELMODE`: UInt = 31u;
public const val `WM_CAPTURECHANGED`: UInt = 533u;
public const val `WM_CHANGECBCHAIN`: UInt = 781u;
public const val `WM_CHANGEUISTATE`: UInt = 295u;
public const val `WM_CHAR`: UInt = 258u;
public const val `WM_CHARTOITEM`: UInt = 47u;
public const val `WM_CHILDACTIVATE`: UInt = 34u;
public const val `WM_CLEAR`: UInt = 771u;
public const val `WM_CLIPBOARDUPDATE`: UInt = 797u;
public const val `WM_CLOSE`: UInt = 16u;
public const val `WM_COMMAND`: UInt = 273u;
public const val `WM_COMMNOTIFY`: UInt = 68u;
public const val `WM_COMPACTING`: UInt = 65u;
public const val `WM_COMPAREITEM`: UInt = 57u;
public const val `WM_CONTEXTMENU`: UInt = 123u;
public const val `WM_COPY`: UInt = 769u;
public const val `WM_COPYDATA`: UInt = 74u;
public const val `WM_CREATE`: UInt = 1u;
public const val `WM_CTLCOLORBTN`: UInt = 309u;
public const val `WM_CTLCOLORDLG`: UInt = 310u;
public const val `WM_CTLCOLOREDIT`: UInt = 307u;
public const val `WM_CTLCOLORLISTBOX`: UInt = 308u;
public const val `WM_CTLCOLORMSGBOX`: UInt = 306u;
public const val `WM_CTLCOLORSCROLLBAR`: UInt = 311u;
public const val `WM_CTLCOLORSTATIC`: UInt = 312u;
public const val `WM_CUT`: UInt = 768u;
public const val `WM_DEADCHAR`: UInt = 259u;
public const val `WM_DELETEITEM`: UInt = 45u;
public const val `WM_DESTROY`: UInt = 2u;
public const val `WM_DESTROYCLIPBOARD`: UInt = 775u;
public const val `WM_DEVICECHANGE`: UInt = 537u;
public const val `WM_DEVMODECHANGE`: UInt = 27u;
public const val `WM_DISPLAYCHANGE`: UInt = 126u;
public const val `WM_DPICHANGED`: UInt = 736u;
public const val `WM_DPICHANGED_AFTERPARENT`: UInt = 739u;
public const val `WM_DPICHANGED_BEFOREPARENT`: UInt = 738u;
public const val `WM_DRAWCLIPBOARD`: UInt = 776u;
public const val `WM_DRAWITEM`: UInt = 43u;
public const val `WM_DROPFILES`: UInt = 563u;
public const val `WM_DWMCOLORIZATIONCOLORCHANGED`: UInt = 800u;
public const val `WM_DWMCOMPOSITIONCHANGED`: UInt = 798u;
public const val `WM_DWMNCRENDERINGCHANGED`: UInt = 799u;
public const val `WM_DWMSENDICONICLIVEPREVIEWBITMAP`: UInt = 806u;
public const val `WM_DWMSENDICONICTHUMBNAIL`: UInt = 803u;
public const val `WM_DWMWINDOWMAXIMIZEDCHANGE`: UInt = 801u;
public const val `WM_ENABLE`: UInt = 10u;
public const val `WM_ENDSESSION`: UInt = 22u;
public const val `WM_ENTERIDLE`: UInt = 289u;
public const val `WM_ENTERMENULOOP`: UInt = 529u;
public const val `WM_ENTERSIZEMOVE`: UInt = 561u;
public const val `WM_ERASEBKGND`: UInt = 20u;
public const val `WM_EXITMENULOOP`: UInt = 530u;
public const val `WM_EXITSIZEMOVE`: UInt = 562u;
public const val `WM_FONTCHANGE`: UInt = 29u;
public const val `WM_GESTURE`: UInt = 281u;
public const val `WM_GESTURENOTIFY`: UInt = 282u;
public const val `WM_GETDLGCODE`: UInt = 135u;
public const val `WM_GETDPISCALEDSIZE`: UInt = 740u;
public const val `WM_GETFONT`: UInt = 49u;
public const val `WM_GETHOTKEY`: UInt = 51u;
public const val `WM_GETICON`: UInt = 127u;
public const val `WM_GETMINMAXINFO`: UInt = 36u;
public const val `WM_GETOBJECT`: UInt = 61u;
public const val `WM_GETTEXT`: UInt = 13u;
public const val `WM_GETTEXTLENGTH`: UInt = 14u;
public const val `WM_GETTITLEBARINFOEX`: UInt = 831u;
public const val `WM_HANDHELDFIRST`: UInt = 856u;
public const val `WM_HANDHELDLAST`: UInt = 863u;
public const val `WM_HELP`: UInt = 83u;
public const val `WM_HOTKEY`: UInt = 786u;
public const val `WM_HSCROLL`: UInt = 276u;
public const val `WM_HSCROLLCLIPBOARD`: UInt = 782u;
public const val `WM_ICONERASEBKGND`: UInt = 39u;
public const val `WM_IME_CHAR`: UInt = 646u;
public const val `WM_IME_COMPOSITION`: UInt = 271u;
public const val `WM_IME_COMPOSITIONFULL`: UInt = 644u;
public const val `WM_IME_CONTROL`: UInt = 643u;
public const val `WM_IME_ENDCOMPOSITION`: UInt = 270u;
public const val `WM_IME_KEYDOWN`: UInt = 656u;
public const val `WM_IME_KEYLAST`: UInt = 271u;
public const val `WM_IME_KEYUP`: UInt = 657u;
public const val `WM_IME_NOTIFY`: UInt = 642u;
public const val `WM_IME_REQUEST`: UInt = 648u;
public const val `WM_IME_SELECT`: UInt = 645u;
public const val `WM_IME_SETCONTEXT`: UInt = 641u;
public const val `WM_IME_STARTCOMPOSITION`: UInt = 269u;
public const val `WM_INITDIALOG`: UInt = 272u;
public const val `WM_INITMENU`: UInt = 278u;
public const val `WM_INITMENUPOPUP`: UInt = 279u;
public const val `WM_INPUT`: UInt = 255u;
public const val `WM_INPUTLANGCHANGE`: UInt = 81u;
public const val `WM_INPUTLANGCHANGEREQUEST`: UInt = 80u;
public const val `WM_INPUT_DEVICE_CHANGE`: UInt = 254u;
public const val `WM_KEYDOWN`: UInt = 256u;
public const val `WM_KEYFIRST`: UInt = 256u;
public const val `WM_KEYLAST`: UInt = 265u;
public const val `WM_KEYUP`: UInt = 257u;
public const val `WM_KILLFOCUS`: UInt = 8u;
public const val `WM_LBUTTONDBLCLK`: UInt = 515u;
public const val `WM_LBUTTONDOWN`: UInt = 513u;
public const val `WM_LBUTTONUP`: UInt = 514u;
public const val `WM_MBUTTONDBLCLK`: UInt = 521u;
public const val `WM_MBUTTONDOWN`: UInt = 519u;
public const val `WM_MBUTTONUP`: UInt = 520u;
public const val `WM_MDIACTIVATE`: UInt = 546u;
public const val `WM_MDICASCADE`: UInt = 551u;
public const val `WM_MDICREATE`: UInt = 544u;
public const val `WM_MDIDESTROY`: UInt = 545u;
public const val `WM_MDIGETACTIVE`: UInt = 553u;
public const val `WM_MDIICONARRANGE`: UInt = 552u;
public const val `WM_MDIMAXIMIZE`: UInt = 549u;
public const val `WM_MDINEXT`: UInt = 548u;
public const val `WM_MDIREFRESHMENU`: UInt = 564u;
public const val `WM_MDIRESTORE`: UInt = 547u;
public const val `WM_MDISETMENU`: UInt = 560u;
public const val `WM_MDITILE`: UInt = 550u;
public const val `WM_MEASUREITEM`: UInt = 44u;
public const val `WM_MENUCHAR`: UInt = 288u;
public const val `WM_MENUCOMMAND`: UInt = 294u;
public const val `WM_MENUDRAG`: UInt = 291u;
public const val `WM_MENUGETOBJECT`: UInt = 292u;
public const val `WM_MENURBUTTONUP`: UInt = 290u;
public const val `WM_MENUSELECT`: UInt = 287u;
public const val `WM_MOUSEACTIVATE`: UInt = 33u;
public const val `WM_MOUSEFIRST`: UInt = 512u;
public const val `WM_MOUSEHWHEEL`: UInt = 526u;
public const val `WM_MOUSELAST`: UInt = 526u;
public const val `WM_MOUSEMOVE`: UInt = 512u;
public const val `WM_MOUSEWHEEL`: UInt = 522u;
public const val `WM_MOVE`: UInt = 3u;
public const val `WM_MOVING`: UInt = 534u;
public const val `WM_NCACTIVATE`: UInt = 134u;
public const val `WM_NCCALCSIZE`: UInt = 131u;
public const val `WM_NCCREATE`: UInt = 129u;
public const val `WM_NCDESTROY`: UInt = 130u;
public const val `WM_NCHITTEST`: UInt = 132u;
public const val `WM_NCLBUTTONDBLCLK`: UInt = 163u;
public const val `WM_NCLBUTTONDOWN`: UInt = 161u;
public const val `WM_NCLBUTTONUP`: UInt = 162u;
public const val `WM_NCMBUTTONDBLCLK`: UInt = 169u;
public const val `WM_NCMBUTTONDOWN`: UInt = 167u;
public const val `WM_NCMBUTTONUP`: UInt = 168u;
public const val `WM_NCMOUSEHOVER`: UInt = 672u;
public const val `WM_NCMOUSELEAVE`: UInt = 674u;
public const val `WM_NCMOUSEMOVE`: UInt = 160u;
public const val `WM_NCPAINT`: UInt = 133u;
public const val `WM_NCPOINTERDOWN`: UInt = 578u;
public const val `WM_NCPOINTERUP`: UInt = 579u;
public const val `WM_NCPOINTERUPDATE`: UInt = 577u;
public const val `WM_NCRBUTTONDBLCLK`: UInt = 166u;
public const val `WM_NCRBUTTONDOWN`: UInt = 164u;
public const val `WM_NCRBUTTONUP`: UInt = 165u;
public const val `WM_NCXBUTTONDBLCLK`: UInt = 173u;
public const val `WM_NCXBUTTONDOWN`: UInt = 171u;
public const val `WM_NCXBUTTONUP`: UInt = 172u;
public const val `WM_NEXTDLGCTL`: UInt = 40u;
public const val `WM_NEXTMENU`: UInt = 531u;
public const val `WM_NOTIFY`: UInt = 78u;
public const val `WM_NOTIFYFORMAT`: UInt = 85u;
public const val `WM_NULL`: UInt = 0u;
public const val `WM_PAINT`: UInt = 15u;
public const val `WM_PAINTCLIPBOARD`: UInt = 777u;
public const val `WM_PAINTICON`: UInt = 38u;
public const val `WM_PALETTECHANGED`: UInt = 785u;
public const val `WM_PALETTEISCHANGING`: UInt = 784u;
public const val `WM_PARENTNOTIFY`: UInt = 528u;
public const val `WM_PASTE`: UInt = 770u;
public const val `WM_PENWINFIRST`: UInt = 896u;
public const val `WM_PENWINLAST`: UInt = 911u;
public const val `WM_POINTERACTIVATE`: UInt = 587u;
public const val `WM_POINTERCAPTURECHANGED`: UInt = 588u;
public const val `WM_POINTERDEVICECHANGE`: UInt = 568u;
public const val `WM_POINTERDEVICEINRANGE`: UInt = 569u;
public const val `WM_POINTERDEVICEOUTOFRANGE`: UInt = 570u;
public const val `WM_POINTERDOWN`: UInt = 582u;
public const val `WM_POINTERENTER`: UInt = 585u;
public const val `WM_POINTERHWHEEL`: UInt = 591u;
public const val `WM_POINTERLEAVE`: UInt = 586u;
public const val `WM_POINTERROUTEDAWAY`: UInt = 594u;
public const val `WM_POINTERROUTEDRELEASED`: UInt = 595u;
public const val `WM_POINTERROUTEDTO`: UInt = 593u;
public const val `WM_POINTERUP`: UInt = 583u;
public const val `WM_POINTERUPDATE`: UInt = 581u;
public const val `WM_POINTERWHEEL`: UInt = 590u;
public const val `WM_POWER`: UInt = 72u;
public const val `WM_POWERBROADCAST`: UInt = 536u;
public const val `WM_PRINT`: UInt = 791u;
public const val `WM_PRINTCLIENT`: UInt = 792u;
public const val `WM_QUERYDRAGICON`: UInt = 55u;
public const val `WM_QUERYENDSESSION`: UInt = 17u;
public const val `WM_QUERYNEWPALETTE`: UInt = 783u;
public const val `WM_QUERYOPEN`: UInt = 19u;
public const val `WM_QUERYUISTATE`: UInt = 297u;
public const val `WM_QUEUESYNC`: UInt = 35u;
public const val `WM_QUIT`: UInt = 18u;
public const val `WM_RBUTTONDBLCLK`: UInt = 518u;
public const val `WM_RBUTTONDOWN`: UInt = 516u;
public const val `WM_RBUTTONUP`: UInt = 517u;
public const val `WM_RENDERALLFORMATS`: UInt = 774u;
public const val `WM_RENDERFORMAT`: UInt = 773u;
public const val `WM_SETCURSOR`: UInt = 32u;
public const val `WM_SETFOCUS`: UInt = 7u;
public const val `WM_SETFONT`: UInt = 48u;
public const val `WM_SETHOTKEY`: UInt = 50u;
public const val `WM_SETICON`: UInt = 128u;
public const val `WM_SETREDRAW`: UInt = 11u;
public const val `WM_SETTEXT`: UInt = 12u;
public const val `WM_SETTINGCHANGE`: UInt = 26u;
public const val `WM_SHOWWINDOW`: UInt = 24u;
public const val `WM_SIZE`: UInt = 5u;
public const val `WM_SIZECLIPBOARD`: UInt = 779u;
public const val `WM_SIZING`: UInt = 532u;
public const val `WM_SPOOLERSTATUS`: UInt = 42u;
public const val `WM_STYLECHANGED`: UInt = 125u;
public const val `WM_STYLECHANGING`: UInt = 124u;
public const val `WM_SYNCPAINT`: UInt = 136u;
public const val `WM_SYSCHAR`: UInt = 262u;
public const val `WM_SYSCOLORCHANGE`: UInt = 21u;
public const val `WM_SYSCOMMAND`: UInt = 274u;
public const val `WM_SYSDEADCHAR`: UInt = 263u;
public const val `WM_SYSKEYDOWN`: UInt = 260u;
public const val `WM_SYSKEYUP`: UInt = 261u;
public const val `WM_TABLET_FIRST`: UInt = 704u;
public const val `WM_TABLET_LAST`: UInt = 735u;
public const val `WM_TCARD`: UInt = 82u;
public const val `WM_THEMECHANGED`: UInt = 794u;
public const val `WM_TIMECHANGE`: UInt = 30u;
public const val `WM_TIMER`: UInt = 275u;
public const val `WM_TOOLTIPDISMISS`: UInt = 837u;
public const val `WM_TOUCH`: UInt = 576u;
public const val `WM_TOUCHHITTESTING`: UInt = 589u;
public const val `WM_UNDO`: UInt = 772u;
public const val `WM_UNICHAR`: UInt = 265u;
public const val `WM_UNINITMENUPOPUP`: UInt = 293u;
public const val `WM_UPDATEUISTATE`: UInt = 296u;
public const val `WM_USER`: UInt = 1024u;
public const val `WM_USERCHANGED`: UInt = 84u;
public const val `WM_VKEYTOITEM`: UInt = 46u;
public const val `WM_VSCROLL`: UInt = 277u;
public const val `WM_VSCROLLCLIPBOARD`: UInt = 778u;
public const val `WM_WINDOWPOSCHANGED`: UInt = 71u;
public const val `WM_WINDOWPOSCHANGING`: UInt = 70u;
public const val `WM_WININICHANGE`: UInt = 26u;
public const val `WM_WTSSESSION_CHANGE`: UInt = 689u;
public const val `WM_XBUTTONDBLCLK`: UInt = 525u;
public const val `WM_XBUTTONDOWN`: UInt = 523u;
public const val `WM_XBUTTONUP`: UInt = 524u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WNDCLASSA` (
    public var `style`: `WNDCLASS_STYLES`,
    public var `lpfnWndProc`: `WNDPROC`,
    public var `cbClsExtra`: Int,
    public var `cbWndExtra`: Int,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `hIcon`: `HICON`,
    public var `hCursor`: `HCURSOR`,
    public var `hbrBackground`: `super`.`super`.`Graphics`.`Gdi`.`HBRUSH`,
    public var `lpszMenuName`: `windows_sys`.`core`.`PCSTR`,
    public var `lpszClassName`: `windows_sys`.`core`.`PCSTR`,
)
// UNSUPPORTED Rust 3885:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for WNDCLASSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WNDCLASSEXA` (
    public var `cbSize`: UInt,
    public var `style`: `WNDCLASS_STYLES`,
    public var `lpfnWndProc`: `WNDPROC`,
    public var `cbClsExtra`: Int,
    public var `cbWndExtra`: Int,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `hIcon`: `HICON`,
    public var `hCursor`: `HCURSOR`,
    public var `hbrBackground`: `super`.`super`.`Graphics`.`Gdi`.`HBRUSH`,
    public var `lpszMenuName`: `windows_sys`.`core`.`PCSTR`,
    public var `lpszClassName`: `windows_sys`.`core`.`PCSTR`,
    public var `hIconSm`: `HICON`,
)
// UNSUPPORTED Rust 3908:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for WNDCLASSEXA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WNDCLASSEXW` (
    public var `cbSize`: UInt,
    public var `style`: `WNDCLASS_STYLES`,
    public var `lpfnWndProc`: `WNDPROC`,
    public var `cbClsExtra`: Int,
    public var `cbWndExtra`: Int,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `hIcon`: `HICON`,
    public var `hCursor`: `HCURSOR`,
    public var `hbrBackground`: `super`.`super`.`Graphics`.`Gdi`.`HBRUSH`,
    public var `lpszMenuName`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpszClassName`: `windows_sys`.`core`.`PCWSTR`,
    public var `hIconSm`: `HICON`,
)
// UNSUPPORTED Rust 3931:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for WNDCLASSEXW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WNDCLASSW` (
    public var `style`: `WNDCLASS_STYLES`,
    public var `lpfnWndProc`: `WNDPROC`,
    public var `cbClsExtra`: Int,
    public var `cbWndExtra`: Int,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `hIcon`: `HICON`,
    public var `hCursor`: `HCURSOR`,
    public var `hbrBackground`: `super`.`super`.`Graphics`.`Gdi`.`HBRUSH`,
    public var `lpszMenuName`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpszClassName`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 3952:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for WNDCLASSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WNDCLASS_STYLES` = UInt;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WNDENUMPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, `super`.`super`.`Foundation`.`LPARAM`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WNDPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, UInt, `super`.`super`.`Foundation`.`WPARAM`, `super`.`super`.`Foundation`.`LPARAM`) -> `super`.`super`.`Foundation`.`LRESULT`>>>;
public const val `WPF_ASYNCWINDOWPLACEMENT`: `WINDOWPLACEMENT_FLAGS` = 4u;
public const val `WPF_RESTORETOMAXIMIZED`: `WINDOWPLACEMENT_FLAGS` = 2u;
public const val `WPF_SETMINPOSITION`: `WINDOWPLACEMENT_FLAGS` = 1u;
public const val `WSF_VISIBLE`: Int = 1;
public const val `WS_ACTIVECAPTION`: `WINDOW_STYLE` = 1u;
public const val `WS_BORDER`: `WINDOW_STYLE` = 8388608u;
public const val `WS_CAPTION`: `WINDOW_STYLE` = 12582912u;
public const val `WS_CHILD`: `WINDOW_STYLE` = 1073741824u;
public const val `WS_CHILDWINDOW`: `WINDOW_STYLE` = 1073741824u;
public const val `WS_CLIPCHILDREN`: `WINDOW_STYLE` = 33554432u;
public const val `WS_CLIPSIBLINGS`: `WINDOW_STYLE` = 67108864u;
public const val `WS_DISABLED`: `WINDOW_STYLE` = 134217728u;
public const val `WS_DLGFRAME`: `WINDOW_STYLE` = 4194304u;
public const val `WS_EX_ACCEPTFILES`: `WINDOW_EX_STYLE` = 16u;
public const val `WS_EX_APPWINDOW`: `WINDOW_EX_STYLE` = 262144u;
public const val `WS_EX_CLIENTEDGE`: `WINDOW_EX_STYLE` = 512u;
public const val `WS_EX_COMPOSITED`: `WINDOW_EX_STYLE` = 33554432u;
public const val `WS_EX_CONTEXTHELP`: `WINDOW_EX_STYLE` = 1024u;
public const val `WS_EX_CONTROLPARENT`: `WINDOW_EX_STYLE` = 65536u;
public const val `WS_EX_DLGMODALFRAME`: `WINDOW_EX_STYLE` = 1u;
public const val `WS_EX_LAYERED`: `WINDOW_EX_STYLE` = 524288u;
public const val `WS_EX_LAYOUTRTL`: `WINDOW_EX_STYLE` = 4194304u;
public const val `WS_EX_LEFT`: `WINDOW_EX_STYLE` = 0u;
public const val `WS_EX_LEFTSCROLLBAR`: `WINDOW_EX_STYLE` = 16384u;
public const val `WS_EX_LTRREADING`: `WINDOW_EX_STYLE` = 0u;
public const val `WS_EX_MDICHILD`: `WINDOW_EX_STYLE` = 64u;
public const val `WS_EX_NOACTIVATE`: `WINDOW_EX_STYLE` = 134217728u;
public const val `WS_EX_NOINHERITLAYOUT`: `WINDOW_EX_STYLE` = 1048576u;
public const val `WS_EX_NOPARENTNOTIFY`: `WINDOW_EX_STYLE` = 4u;
public const val `WS_EX_NOREDIRECTIONBITMAP`: `WINDOW_EX_STYLE` = 2097152u;
public const val `WS_EX_OVERLAPPEDWINDOW`: `WINDOW_EX_STYLE` = 768u;
public const val `WS_EX_PALETTEWINDOW`: `WINDOW_EX_STYLE` = 392u;
public const val `WS_EX_RIGHT`: `WINDOW_EX_STYLE` = 4096u;
public const val `WS_EX_RIGHTSCROLLBAR`: `WINDOW_EX_STYLE` = 0u;
public const val `WS_EX_RTLREADING`: `WINDOW_EX_STYLE` = 8192u;
public const val `WS_EX_STATICEDGE`: `WINDOW_EX_STYLE` = 131072u;
public const val `WS_EX_TOOLWINDOW`: `WINDOW_EX_STYLE` = 128u;
public const val `WS_EX_TOPMOST`: `WINDOW_EX_STYLE` = 8u;
public const val `WS_EX_TRANSPARENT`: `WINDOW_EX_STYLE` = 32u;
public const val `WS_EX_WINDOWEDGE`: `WINDOW_EX_STYLE` = 256u;
public const val `WS_GROUP`: `WINDOW_STYLE` = 131072u;
public const val `WS_HSCROLL`: `WINDOW_STYLE` = 1048576u;
public const val `WS_ICONIC`: `WINDOW_STYLE` = 536870912u;
public const val `WS_MAXIMIZE`: `WINDOW_STYLE` = 16777216u;
public const val `WS_MAXIMIZEBOX`: `WINDOW_STYLE` = 65536u;
public const val `WS_MINIMIZE`: `WINDOW_STYLE` = 536870912u;
public const val `WS_MINIMIZEBOX`: `WINDOW_STYLE` = 131072u;
public const val `WS_OVERLAPPED`: `WINDOW_STYLE` = 0u;
public const val `WS_OVERLAPPEDWINDOW`: `WINDOW_STYLE` = 13565952u;
public const val `WS_POPUP`: `WINDOW_STYLE` = 2147483648u;
public const val `WS_POPUPWINDOW`: `WINDOW_STYLE` = 2156396544u;
public const val `WS_SIZEBOX`: `WINDOW_STYLE` = 262144u;
public const val `WS_SYSMENU`: `WINDOW_STYLE` = 524288u;
public const val `WS_TABSTOP`: `WINDOW_STYLE` = 65536u;
public const val `WS_THICKFRAME`: `WINDOW_STYLE` = 262144u;
public const val `WS_TILED`: `WINDOW_STYLE` = 0u;
public const val `WS_TILEDWINDOW`: `WINDOW_STYLE` = 13565952u;
public const val `WS_VISIBLE`: `WINDOW_STYLE` = 268435456u;
public const val `WS_VSCROLL`: `WINDOW_STYLE` = 2097152u;
public const val `WTS_CONSOLE_CONNECT`: UInt = 1u;
public const val `WTS_CONSOLE_DISCONNECT`: UInt = 2u;
public const val `WTS_REMOTE_CONNECT`: UInt = 3u;
public const val `WTS_REMOTE_DISCONNECT`: UInt = 4u;
public const val `WTS_SESSION_CREATE`: UInt = 10u;
public const val `WTS_SESSION_LOCK`: UInt = 7u;
public const val `WTS_SESSION_LOGOFF`: UInt = 6u;
public const val `WTS_SESSION_LOGON`: UInt = 5u;
public const val `WTS_SESSION_REMOTE_CONTROL`: UInt = 9u;
public const val `WTS_SESSION_TERMINATE`: UInt = 11u;
public const val `WTS_SESSION_UNLOCK`: UInt = 8u;
public const val `WVR_ALIGNBOTTOM`: UInt = 64u;
public const val `WVR_ALIGNLEFT`: UInt = 32u;
public const val `WVR_ALIGNRIGHT`: UInt = 128u;
public const val `WVR_ALIGNTOP`: UInt = 16u;
public const val `WVR_HREDRAW`: UInt = 256u;
public const val `WVR_REDRAW`: UInt = 768u;
public const val `WVR_VALIDRECTS`: UInt = 1024u;
public const val `WVR_VREDRAW`: UInt = 512u;
public const val `XBUTTON1`: UShort = 1u;
public const val `XBUTTON2`: UShort = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `_DEV_BROADCAST_HEADER` (
    public var `dbcd_size`: UInt,
    public var `dbcd_devicetype`: UInt,
    public var `dbcd_reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `_DEV_BROADCAST_USERDEFINED` (
    public var `dbud_dbh`: `DEV_BROADCAST_HDR`,
    public var `dbud_szName`: ByteArray,
)
// UNSUPPORTED Rust 4054:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for _DEV_BROADCAST_USERDEFINED {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `__WARNING_BANNED_API_USAGE`: UInt = 28719u;
public const val `__WARNING_CYCLOMATIC_COMPLEXITY`: UInt = 28734u;
public const val `__WARNING_DEREF_NULL_PTR`: UInt = 6011u;
public const val `__WARNING_HIGH_PRIORITY_OVERFLOW_POSTCONDITION`: UInt = 26045u;
public const val `__WARNING_INCORRECT_ANNOTATION`: UInt = 26007u;
public const val `__WARNING_INVALID_PARAM_VALUE_1`: UInt = 6387u;
public const val `__WARNING_INVALID_PARAM_VALUE_3`: UInt = 28183u;
public const val `__WARNING_MISSING_ZERO_TERMINATION2`: UInt = 6054u;
public const val `__WARNING_POSTCONDITION_NULLTERMINATION_VIOLATION`: UInt = 26036u;
public const val `__WARNING_POST_EXPECTED`: UInt = 28210u;
public const val `__WARNING_POTENTIAL_BUFFER_OVERFLOW_HIGH_PRIORITY`: UInt = 26015u;
public const val `__WARNING_POTENTIAL_RANGE_POSTCONDITION_VIOLATION`: UInt = 26071u;
public const val `__WARNING_PRECONDITION_NULLTERMINATION_VIOLATION`: UInt = 26035u;
public const val `__WARNING_RANGE_POSTCONDITION_VIOLATION`: UInt = 26061u;
public const val `__WARNING_RETURNING_BAD_RESULT`: UInt = 28196u;
public const val `__WARNING_RETURN_UNINIT_VAR`: UInt = 6101u;
public const val `__WARNING_USING_UNINIT_VAR`: UInt = 6001u;
