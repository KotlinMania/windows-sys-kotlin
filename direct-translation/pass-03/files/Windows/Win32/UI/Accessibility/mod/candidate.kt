// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleacc.dll, ABI=system, export=AccNotifyTouchInteraction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AccNotifyTouchInteraction`(`hwndapp` : `super`.`super`.`Foundation`.`HWND`, `hwndtarget` : `super`.`super`.`Foundation`.`HWND`, `pttarget` : `super`.`super`.`Foundation`.`POINT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleacc.dll, ABI=system, export=AccSetRunningUtilityState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AccSetRunningUtilityState`(`hwndapp` : `super`.`super`.`Foundation`.`HWND`, `dwutilitystatemask` : UInt, `dwutilitystate` : `ACC_UTILITY_STATE_FLAGS`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleacc.dll, ABI=system, export=AccessibleChildren; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
public external fun `AccessibleChildren`(`pacccontainer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ichildstart` : Int, `cchildren` : Int, `rgvarchildren` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Variant`.`VARIANT`>?, `pcobtained` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleacc.dll, ABI=system, export=AccessibleObjectFromEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
public external fun `AccessibleObjectFromEvent`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `dwid` : UInt, `dwchildid` : UInt, `ppacc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `pvarchild` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleacc.dll, ABI=system, export=AccessibleObjectFromPoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
public external fun `AccessibleObjectFromPoint`(`ptscreen` : `super`.`super`.`Foundation`.`POINT`, `ppacc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `pvarchild` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleacc.dll, ABI=system, export=AccessibleObjectFromWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AccessibleObjectFromWindow`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `dwid` : UInt, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppvobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleacc.dll, ABI=system, export=CreateStdAccessibleObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateStdAccessibleObject`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `idobject` : Int, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppvobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleacc.dll, ABI=system, export=CreateStdAccessibleProxyA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateStdAccessibleProxyA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pclassname` : `windows_sys`.`core`.`PCSTR`, `idobject` : Int, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppvobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleacc.dll, ABI=system, export=CreateStdAccessibleProxyW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateStdAccessibleProxyW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pclassname` : `windows_sys`.`core`.`PCWSTR`, `idobject` : Int, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppvobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=DockPattern_SetDockPosition; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DockPattern_SetDockPosition`(`hobj` : `HUIAPATTERNOBJECT`, `dockposition` : `DockPosition`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=ExpandCollapsePattern_Collapse; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ExpandCollapsePattern_Collapse`(`hobj` : `HUIAPATTERNOBJECT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=ExpandCollapsePattern_Expand; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ExpandCollapsePattern_Expand`(`hobj` : `HUIAPATTERNOBJECT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleacc.dll, ABI=system, export=GetOleaccVersionInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetOleaccVersionInfo`(`pver` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pbuild` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleacc.dll, ABI=system, export=GetRoleTextA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetRoleTextA`(`lrole` : UInt, `lpszrole` : `windows_sys`.`core`.`PSTR`, `cchrolemax` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleacc.dll, ABI=system, export=GetRoleTextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetRoleTextW`(`lrole` : UInt, `lpszrole` : `windows_sys`.`core`.`PWSTR`, `cchrolemax` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleacc.dll, ABI=system, export=GetStateTextA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetStateTextA`(`lstatebit` : UInt, `lpszstate` : `windows_sys`.`core`.`PSTR`, `cchstate` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleacc.dll, ABI=system, export=GetStateTextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetStateTextW`(`lstatebit` : UInt, `lpszstate` : `windows_sys`.`core`.`PWSTR`, `cchstate` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=GridPattern_GetItem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GridPattern_GetItem`(`hobj` : `HUIAPATTERNOBJECT`, `row` : Int, `column` : Int, `presult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HUIANODE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=InvokePattern_Invoke; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InvokePattern_Invoke`(`hobj` : `HUIAPATTERNOBJECT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsWinEventHookInstalled; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsWinEventHookInstalled`(`event` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=ItemContainerPattern_FindItemByProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
public external fun `ItemContainerPattern_FindItemByProperty`(`hobj` : `HUIAPATTERNOBJECT`, `hnodestartafter` : `HUIANODE`, `propertyid` : Int, `value` : `super`.`super`.`System`.`Variant`.`VARIANT`, `pfound` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HUIANODE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=LegacyIAccessiblePattern_DoDefaultAction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LegacyIAccessiblePattern_DoDefaultAction`(`hobj` : `HUIAPATTERNOBJECT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=LegacyIAccessiblePattern_GetIAccessible; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `LegacyIAccessiblePattern_GetIAccessible`(`hobj` : `HUIAPATTERNOBJECT`, `paccessible` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=LegacyIAccessiblePattern_Select; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LegacyIAccessiblePattern_Select`(`hobj` : `HUIAPATTERNOBJECT`, `flagsselect` : Int) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=LegacyIAccessiblePattern_SetValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LegacyIAccessiblePattern_SetValue`(`hobj` : `HUIAPATTERNOBJECT`, `szvalue` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleacc.dll, ABI=system, export=LresultFromObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LresultFromObject`(`riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `punk` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=MultipleViewPattern_GetViewName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MultipleViewPattern_GetViewName`(`hobj` : `HUIAPATTERNOBJECT`, `viewid` : Int, `ppstr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=MultipleViewPattern_SetCurrentView; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MultipleViewPattern_SetCurrentView`(`hobj` : `HUIAPATTERNOBJECT`, `viewid` : Int) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=NotifyWinEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NotifyWinEvent`(`event` : UInt, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `idobject` : Int, `idchild` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleacc.dll, ABI=system, export=ObjectFromLresult; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ObjectFromLresult`(`lresult` : `super`.`super`.`Foundation`.`LRESULT`, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `ppvobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=RangeValuePattern_SetValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RangeValuePattern_SetValue`(`hobj` : `HUIAPATTERNOBJECT`, `val` : Double) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RegisterPointerInputTarget; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `RegisterPointerInputTarget`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pointertype` : `super`.`WindowsAndMessaging`.`POINTER_INPUT_TYPE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RegisterPointerInputTargetEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `RegisterPointerInputTargetEx`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pointertype` : `super`.`WindowsAndMessaging`.`POINTER_INPUT_TYPE`, `fobserve` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=ScrollItemPattern_ScrollIntoView; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ScrollItemPattern_ScrollIntoView`(`hobj` : `HUIAPATTERNOBJECT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=ScrollPattern_Scroll; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ScrollPattern_Scroll`(`hobj` : `HUIAPATTERNOBJECT`, `horizontalamount` : `ScrollAmount`, `verticalamount` : `ScrollAmount`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=ScrollPattern_SetScrollPercent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ScrollPattern_SetScrollPercent`(`hobj` : `HUIAPATTERNOBJECT`, `horizontalpercent` : Double, `verticalpercent` : Double) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=SelectionItemPattern_AddToSelection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SelectionItemPattern_AddToSelection`(`hobj` : `HUIAPATTERNOBJECT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=SelectionItemPattern_RemoveFromSelection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SelectionItemPattern_RemoveFromSelection`(`hobj` : `HUIAPATTERNOBJECT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=SelectionItemPattern_Select; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SelectionItemPattern_Select`(`hobj` : `HUIAPATTERNOBJECT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetWinEventHook; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetWinEventHook`(`eventmin` : UInt, `eventmax` : UInt, `hmodwineventproc` : `super`.`super`.`Foundation`.`HMODULE`, `pfnwineventproc` : `WINEVENTPROC`, `idprocess` : UInt, `idthread` : UInt, `dwflags` : UInt) : `HWINEVENTHOOK`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=SynchronizedInputPattern_Cancel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SynchronizedInputPattern_Cancel`(`hobj` : `HUIAPATTERNOBJECT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=SynchronizedInputPattern_StartListening; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SynchronizedInputPattern_StartListening`(`hobj` : `HUIAPATTERNOBJECT`, `inputtype` : `SynchronizedInputType`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=TextPattern_GetSelection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `TextPattern_GetSelection`(`hobj` : `HUIAPATTERNOBJECT`, `pretval` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`System`.`Com`.`SAFEARRAY`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=TextPattern_GetVisibleRanges; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `TextPattern_GetVisibleRanges`(`hobj` : `HUIAPATTERNOBJECT`, `pretval` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`System`.`Com`.`SAFEARRAY`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=TextPattern_RangeFromChild; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TextPattern_RangeFromChild`(`hobj` : `HUIAPATTERNOBJECT`, `hnodechild` : `HUIANODE`, `pretval` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HUIATEXTRANGE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=TextPattern_RangeFromPoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TextPattern_RangeFromPoint`(`hobj` : `HUIAPATTERNOBJECT`, `point` : `UiaPoint`, `pretval` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HUIATEXTRANGE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=TextPattern_get_DocumentRange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TextPattern_get_DocumentRange`(`hobj` : `HUIAPATTERNOBJECT`, `pretval` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HUIATEXTRANGE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=TextPattern_get_SupportedTextSelection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TextPattern_get_SupportedTextSelection`(`hobj` : `HUIAPATTERNOBJECT`, `pretval` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SupportedTextSelection`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=TextRange_AddToSelection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TextRange_AddToSelection`(`hobj` : `HUIATEXTRANGE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=TextRange_Clone; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TextRange_Clone`(`hobj` : `HUIATEXTRANGE`, `pretval` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HUIATEXTRANGE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=TextRange_Compare; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TextRange_Compare`(`hobj` : `HUIATEXTRANGE`, `range` : `HUIATEXTRANGE`, `pretval` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=TextRange_CompareEndpoints; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TextRange_CompareEndpoints`(`hobj` : `HUIATEXTRANGE`, `endpoint` : `TextPatternRangeEndpoint`, `targetrange` : `HUIATEXTRANGE`, `targetendpoint` : `TextPatternRangeEndpoint`, `pretval` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=TextRange_ExpandToEnclosingUnit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TextRange_ExpandToEnclosingUnit`(`hobj` : `HUIATEXTRANGE`, `unit` : `TextUnit`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=TextRange_FindAttribute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
public external fun `TextRange_FindAttribute`(`hobj` : `HUIATEXTRANGE`, `attributeid` : Int, `val` : `super`.`super`.`System`.`Variant`.`VARIANT`, `backward` : `windows_sys`.`core`.`BOOL`, `pretval` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HUIATEXTRANGE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=TextRange_FindText; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TextRange_FindText`(`hobj` : `HUIATEXTRANGE`, `text` : `windows_sys`.`core`.`BSTR`, `backward` : `windows_sys`.`core`.`BOOL`, `ignorecase` : `windows_sys`.`core`.`BOOL`, `pretval` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HUIATEXTRANGE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=TextRange_GetAttributeValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
public external fun `TextRange_GetAttributeValue`(`hobj` : `HUIATEXTRANGE`, `attributeid` : Int, `pretval` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=TextRange_GetBoundingRectangles; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `TextRange_GetBoundingRectangles`(`hobj` : `HUIATEXTRANGE`, `pretval` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`System`.`Com`.`SAFEARRAY`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=TextRange_GetChildren; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `TextRange_GetChildren`(`hobj` : `HUIATEXTRANGE`, `pretval` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`System`.`Com`.`SAFEARRAY`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=TextRange_GetEnclosingElement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TextRange_GetEnclosingElement`(`hobj` : `HUIATEXTRANGE`, `pretval` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HUIANODE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=TextRange_GetText; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TextRange_GetText`(`hobj` : `HUIATEXTRANGE`, `maxlength` : Int, `pretval` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=TextRange_Move; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TextRange_Move`(`hobj` : `HUIATEXTRANGE`, `unit` : `TextUnit`, `count` : Int, `pretval` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=TextRange_MoveEndpointByRange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TextRange_MoveEndpointByRange`(`hobj` : `HUIATEXTRANGE`, `endpoint` : `TextPatternRangeEndpoint`, `targetrange` : `HUIATEXTRANGE`, `targetendpoint` : `TextPatternRangeEndpoint`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=TextRange_MoveEndpointByUnit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TextRange_MoveEndpointByUnit`(`hobj` : `HUIATEXTRANGE`, `endpoint` : `TextPatternRangeEndpoint`, `unit` : `TextUnit`, `count` : Int, `pretval` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=TextRange_RemoveFromSelection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TextRange_RemoveFromSelection`(`hobj` : `HUIATEXTRANGE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=TextRange_ScrollIntoView; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TextRange_ScrollIntoView`(`hobj` : `HUIATEXTRANGE`, `aligntotop` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=TextRange_Select; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TextRange_Select`(`hobj` : `HUIATEXTRANGE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=TogglePattern_Toggle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TogglePattern_Toggle`(`hobj` : `HUIAPATTERNOBJECT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=TransformPattern_Move; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TransformPattern_Move`(`hobj` : `HUIAPATTERNOBJECT`, `x` : Double, `y` : Double) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=TransformPattern_Resize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TransformPattern_Resize`(`hobj` : `HUIAPATTERNOBJECT`, `width` : Double, `height` : Double) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=TransformPattern_Rotate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TransformPattern_Rotate`(`hobj` : `HUIAPATTERNOBJECT`, `degrees` : Double) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaAddEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `UiaAddEvent`(`hnode` : `HUIANODE`, `eventid` : Int, `pcallback` : /* Rust *mut */ kotlinx.cinterop.CPointer<`UiaEventCallback`>?, `scope` : `TreeScope`, `pproperties` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `cproperties` : Int, `prequest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`UiaCacheRequest`>?, `phevent` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HUIAEVENT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaClientsAreListening; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UiaClientsAreListening`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaDisconnectAllProviders; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UiaDisconnectAllProviders`() : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaDisconnectProvider; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UiaDisconnectProvider`(`pprovider` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaEventAddWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UiaEventAddWindow`(`hevent` : `HUIAEVENT`, `hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaEventRemoveWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UiaEventRemoveWindow`(`hevent` : `HUIAEVENT`, `hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaFind; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `UiaFind`(`hnode` : `HUIANODE`, `pparams` : /* Rust *mut */ kotlinx.cinterop.CPointer<`UiaFindParams`>?, `prequest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`UiaCacheRequest`>?, `pprequesteddata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`System`.`Com`.`SAFEARRAY`>>?, `ppoffsets` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`System`.`Com`.`SAFEARRAY`>>?, `pptreestructures` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`System`.`Com`.`SAFEARRAY`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaGetErrorDescription; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UiaGetErrorDescription`(`pdescription` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaGetPatternProvider; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UiaGetPatternProvider`(`hnode` : `HUIANODE`, `patternid` : Int, `phobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HUIAPATTERNOBJECT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaGetPropertyValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
public external fun `UiaGetPropertyValue`(`hnode` : `HUIANODE`, `propertyid` : Int, `pvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaGetReservedMixedAttributeValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UiaGetReservedMixedAttributeValue`(`punkmixedattributevalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaGetReservedNotSupportedValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UiaGetReservedNotSupportedValue`(`punknotsupportedvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaGetRootNode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UiaGetRootNode`(`phnode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HUIANODE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaGetRuntimeId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `UiaGetRuntimeId`(`hnode` : `HUIANODE`, `pruntimeid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`System`.`Com`.`SAFEARRAY`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaGetUpdatedCache; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `UiaGetUpdatedCache`(`hnode` : `HUIANODE`, `prequest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`UiaCacheRequest`>?, `normalizestate` : `NormalizeState`, `pnormalizecondition` : /* Rust *mut */ kotlinx.cinterop.CPointer<`UiaCondition`>?, `pprequesteddata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`System`.`Com`.`SAFEARRAY`>>?, `pptreestructure` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaHPatternObjectFromVariant; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
public external fun `UiaHPatternObjectFromVariant`(`pvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Variant`.`VARIANT`>?, `phobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HUIAPATTERNOBJECT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaHTextRangeFromVariant; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
public external fun `UiaHTextRangeFromVariant`(`pvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Variant`.`VARIANT`>?, `phtextrange` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HUIATEXTRANGE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaHUiaNodeFromVariant; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
public external fun `UiaHUiaNodeFromVariant`(`pvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Variant`.`VARIANT`>?, `phnode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HUIANODE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaHasServerSideProvider; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UiaHasServerSideProvider`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaHostProviderFromHwnd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UiaHostProviderFromHwnd`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `ppprovider` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaIAccessibleFromProvider; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
public external fun `UiaIAccessibleFromProvider`(`pprovider` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwflags` : UInt, `ppaccessible` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `pvarchild` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaLookupId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UiaLookupId`(`type` : `AutomationIdentifierType`, `pguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaNavigate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `UiaNavigate`(`hnode` : `HUIANODE`, `direction` : `NavigateDirection`, `pcondition` : /* Rust *mut */ kotlinx.cinterop.CPointer<`UiaCondition`>?, `prequest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`UiaCacheRequest`>?, `pprequesteddata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`System`.`Com`.`SAFEARRAY`>>?, `pptreestructure` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaNodeFromFocus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `UiaNodeFromFocus`(`prequest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`UiaCacheRequest`>?, `pprequesteddata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`System`.`Com`.`SAFEARRAY`>>?, `pptreestructure` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaNodeFromHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UiaNodeFromHandle`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `phnode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HUIANODE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaNodeFromPoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `UiaNodeFromPoint`(`x` : Double, `y` : Double, `prequest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`UiaCacheRequest`>?, `pprequesteddata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`System`.`Com`.`SAFEARRAY`>>?, `pptreestructure` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaNodeFromProvider; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UiaNodeFromProvider`(`pprovider` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phnode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HUIANODE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaNodeRelease; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UiaNodeRelease`(`hnode` : `HUIANODE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaPatternRelease; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UiaPatternRelease`(`hobj` : `HUIAPATTERNOBJECT`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaProviderForNonClient; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UiaProviderForNonClient`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `idobject` : Int, `idchild` : Int, `ppprovider` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaProviderFromIAccessible; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `UiaProviderFromIAccessible`(`paccessible` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `idchild` : Int, `dwflags` : UInt, `ppprovider` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaRaiseActiveTextPositionChangedEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UiaRaiseActiveTextPositionChangedEvent`(`provider` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `textrange` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaRaiseAsyncContentLoadedEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UiaRaiseAsyncContentLoadedEvent`(`pprovider` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `asynccontentloadedstate` : `AsyncContentLoadedState`, `percentcomplete` : Double) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaRaiseAutomationEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UiaRaiseAutomationEvent`(`pprovider` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `id` : `UIA_EVENT_ID`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaRaiseAutomationPropertyChangedEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
public external fun `UiaRaiseAutomationPropertyChangedEvent`(`pprovider` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `id` : `UIA_PROPERTY_ID`, `oldvalue` : `super`.`super`.`System`.`Variant`.`VARIANT`, `newvalue` : `super`.`super`.`System`.`Variant`.`VARIANT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaRaiseChangesEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
public external fun `UiaRaiseChangesEvent`(`pprovider` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `eventidcount` : Int, `puiachanges` : /* Rust *mut */ kotlinx.cinterop.CPointer<`UiaChangeInfo`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaRaiseNotificationEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UiaRaiseNotificationEvent`(`provider` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `notificationkind` : `NotificationKind`, `notificationprocessing` : `NotificationProcessing`, `displaystring` : `windows_sys`.`core`.`BSTR`, `activityid` : `windows_sys`.`core`.`BSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaRaiseStructureChangedEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UiaRaiseStructureChangedEvent`(`pprovider` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `structurechangetype` : `StructureChangeType`, `pruntimeid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `cruntimeidlen` : Int) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaRaiseTextEditTextChangedEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `UiaRaiseTextEditTextChangedEvent`(`pprovider` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `texteditchangetype` : `TextEditChangeType`, `pchangeddata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Com`.`SAFEARRAY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaRegisterProviderCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `UiaRegisterProviderCallback`(`pcallback` : /* Rust *mut */ kotlinx.cinterop.CPointer<`UiaProviderCallback`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaRemoveEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UiaRemoveEvent`(`hevent` : `HUIAEVENT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaReturnRawElementProvider; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UiaReturnRawElementProvider`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`, `el` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaSetFocus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UiaSetFocus`(`hnode` : `HUIANODE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=UiaTextRangeRelease; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UiaTextRangeRelease`(`hobj` : `HUIATEXTRANGE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=UnhookWinEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnhookWinEvent`(`hwineventhook` : `HWINEVENTHOOK`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=UnregisterPointerInputTarget; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `UnregisterPointerInputTarget`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pointertype` : `super`.`WindowsAndMessaging`.`POINTER_INPUT_TYPE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=UnregisterPointerInputTargetEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `UnregisterPointerInputTargetEx`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pointertype` : `super`.`WindowsAndMessaging`.`POINTER_INPUT_TYPE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=ValuePattern_SetValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ValuePattern_SetValue`(`hobj` : `HUIAPATTERNOBJECT`, `pval` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=VirtualizedItemPattern_Realize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VirtualizedItemPattern_Realize`(`hobj` : `HUIAPATTERNOBJECT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleacc.dll, ABI=system, export=WindowFromAccessibleObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `WindowFromAccessibleObject`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phwnd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HWND`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=WindowPattern_Close; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WindowPattern_Close`(`hobj` : `HUIAPATTERNOBJECT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=WindowPattern_SetWindowVisualState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WindowPattern_SetWindowVisualState`(`hobj` : `HUIAPATTERNOBJECT`, `state` : `WindowVisualState`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uiautomationcore.dll, ABI=system, export=WindowPattern_WaitForInputIdle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WindowPattern_WaitForInputIdle`(`hobj` : `HUIAPATTERNOBJECT`, `milliseconds` : Int, `presult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ACCESSTIMEOUT` (
    public var `cbSize`: UInt,
    public var `dwFlags`: UInt,
    public var `iTimeOutMSec`: UInt,
)
public typealias `ACC_UTILITY_STATE_FLAGS` = UInt;
public const val `ANNO_CONTAINER`: `AnnoScope` = 1;
public const val `ANNO_THIS`: `AnnoScope` = 0;
public const val `ANRUS_ON_SCREEN_KEYBOARD_ACTIVE`: `ACC_UTILITY_STATE_FLAGS` = 1u;
public const val `ANRUS_PRIORITY_AUDIO_ACTIVE`: `ACC_UTILITY_STATE_FLAGS` = 4u;
public const val `ANRUS_PRIORITY_AUDIO_ACTIVE_NODUCK`: `ACC_UTILITY_STATE_FLAGS` = 8u;
public const val `ANRUS_PRIORITY_AUDIO_DYNAMIC_DUCK`: UInt = 16u;
public const val `ANRUS_TOUCH_MODIFICATION_ACTIVE`: `ACC_UTILITY_STATE_FLAGS` = 2u;
// UNSUPPORTED Rust 172:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AcceleratorKey_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x514865df_2557_4cb9_aeed_6ced084ce52c);

// UNSUPPORTED Rust 173:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AccessKey_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x06827b12_a7f9_4a15_917c_ffa5ad3eb0a7);

public typealias `ActiveEnd` = Int;
public const val `ActiveEnd_End`: `ActiveEnd` = 2;
public const val `ActiveEnd_None`: `ActiveEnd` = 0;
public const val `ActiveEnd_Start`: `ActiveEnd` = 1;
// UNSUPPORTED Rust 178:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ActiveTextPositionChanged_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa5c09e9c_c77d_4f25_b491_e5bb7017cbd4);

public typealias `AnimationStyle` = Int;
public const val `AnimationStyle_BlinkingBackground`: `AnimationStyle` = 2;
public const val `AnimationStyle_LasVegasLights`: `AnimationStyle` = 1;
public const val `AnimationStyle_MarchingBlackAnts`: `AnimationStyle` = 4;
public const val `AnimationStyle_MarchingRedAnts`: `AnimationStyle` = 5;
public const val `AnimationStyle_None`: `AnimationStyle` = 0;
public const val `AnimationStyle_Other`: `AnimationStyle` = -1;
public const val `AnimationStyle_Shimmer`: `AnimationStyle` = 6;
public const val `AnimationStyle_SparkleText`: `AnimationStyle` = 3;
public typealias `AnnoScope` = Int;
// UNSUPPORTED Rust 189:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AnnotationObjects_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x310910c8_7c6e_4f20_becd_4aaf6d191156);

public const val `AnnotationType_AdvancedProofingIssue`: `UIA_ANNOTATIONTYPE` = 60020;
public const val `AnnotationType_Author`: `UIA_ANNOTATIONTYPE` = 60019;
public const val `AnnotationType_CircularReferenceError`: `UIA_ANNOTATIONTYPE` = 60022;
public const val `AnnotationType_Comment`: `UIA_ANNOTATIONTYPE` = 60003;
public const val `AnnotationType_ConflictingChange`: `UIA_ANNOTATIONTYPE` = 60018;
public const val `AnnotationType_DataValidationError`: `UIA_ANNOTATIONTYPE` = 60021;
public const val `AnnotationType_DeletionChange`: `UIA_ANNOTATIONTYPE` = 60012;
public const val `AnnotationType_EditingLockedChange`: `UIA_ANNOTATIONTYPE` = 60016;
public const val `AnnotationType_Endnote`: `UIA_ANNOTATIONTYPE` = 60009;
public const val `AnnotationType_ExternalChange`: `UIA_ANNOTATIONTYPE` = 60017;
public const val `AnnotationType_Footer`: `UIA_ANNOTATIONTYPE` = 60007;
public const val `AnnotationType_Footnote`: `UIA_ANNOTATIONTYPE` = 60010;
public const val `AnnotationType_FormatChange`: `UIA_ANNOTATIONTYPE` = 60014;
public const val `AnnotationType_FormulaError`: `UIA_ANNOTATIONTYPE` = 60004;
public const val `AnnotationType_GrammarError`: `UIA_ANNOTATIONTYPE` = 60002;
public const val `AnnotationType_Header`: `UIA_ANNOTATIONTYPE` = 60006;
public const val `AnnotationType_Highlighted`: `UIA_ANNOTATIONTYPE` = 60008;
public const val `AnnotationType_InsertionChange`: `UIA_ANNOTATIONTYPE` = 60011;
public const val `AnnotationType_Mathematics`: `UIA_ANNOTATIONTYPE` = 60023;
public const val `AnnotationType_MoveChange`: `UIA_ANNOTATIONTYPE` = 60013;
public const val `AnnotationType_Sensitive`: `UIA_ANNOTATIONTYPE` = 60024;
public const val `AnnotationType_SpellingError`: `UIA_ANNOTATIONTYPE` = 60001;
public const val `AnnotationType_TrackChanges`: `UIA_ANNOTATIONTYPE` = 60005;
public const val `AnnotationType_Unknown`: `UIA_ANNOTATIONTYPE` = 60000;
public const val `AnnotationType_UnsyncedChange`: `UIA_ANNOTATIONTYPE` = 60015;
// UNSUPPORTED Rust 215:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AnnotationTypes_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x64b71f76_53c4_4696_a219_20e940c9a176);

// UNSUPPORTED Rust 216:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_AdvancedProofingIssue_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdac7b72c_c0f2_4b84_b90d_5fafc0f0ef1c);

// UNSUPPORTED Rust 217:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_AnnotationTypeId_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x20ae484f_69ef_4c48_8f5b_c4938b206ac7);

// UNSUPPORTED Rust 218:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_AnnotationTypeName_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9b818892_5ac9_4af9_aa96_f58a77b058e3);

// UNSUPPORTED Rust 219:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_Author_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf161d3a7_f81b_4128_b17f_71f690914520);

// UNSUPPORTED Rust 220:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_Author_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7a528462_9c5c_4a03_a974_8b307a9937f2);

// UNSUPPORTED Rust 221:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_CircularReferenceError_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x25bd9cf4_1745_4659_ba67_727f0318c616);

// UNSUPPORTED Rust 222:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_Comment_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfd2fda30_26b3_4c06_8bc7_98f1532e46fd);

// UNSUPPORTED Rust 223:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_ConflictingChange_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x98af8802_517c_459f_af13_016d3fab877e);

// UNSUPPORTED Rust 224:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_Custom_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9ec82750_3931_4952_85bc_1dbff78a43e3);

// UNSUPPORTED Rust 225:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_DataValidationError_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc8649fa8_9775_437e_ad46_e709d93c2343);

// UNSUPPORTED Rust 226:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_DateTime_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x99b5ca5d_1acf_414b_a4d0_6b350b047578);

// UNSUPPORTED Rust 227:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_DeletionChange_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbe3d5b05_951d_42e7_901d_adc8c2cf34d0);

// UNSUPPORTED Rust 228:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_EditingLockedChange_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc31f3e1c_7423_4dac_8348_41f099ff6f64);

// UNSUPPORTED Rust 229:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_Endnote_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7565725c_2d99_4839_960d_33d3b866aba5);

// UNSUPPORTED Rust 230:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_ExternalChange_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x75a05b31_5f11_42fd_887d_dfa010db2392);

// UNSUPPORTED Rust 231:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_Footer_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcceab046_1833_47aa_8080_701ed0b0c832);

// UNSUPPORTED Rust 232:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_Footnote_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3de10e21_4125_42db_8620_be8083080624);

// UNSUPPORTED Rust 233:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_FormatChange_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeb247345_d4f1_41ce_8e52_f79b69635e48);

// UNSUPPORTED Rust 234:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_FormulaError_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x95611982_0cab_46d5_a2f0_e30d1905f8bf);

// UNSUPPORTED Rust 235:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_GrammarError_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x757a048d_4518_41c6_854c_dc009b7cfb53);

// UNSUPPORTED Rust 236:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_Header_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x867b409b_b216_4472_a219_525e310681f8);

// UNSUPPORTED Rust 237:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_Highlighted_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x757c884e_8083_4081_8b9c_e87f5072f0e4);

// UNSUPPORTED Rust 238:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_InsertionChange_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0dbeb3a6_df15_4164_a3c0_e21a8ce931c4);

// UNSUPPORTED Rust 239:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_Mathematics_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeaab634b_26d0_40c1_8073_57ca1c633c9b);

// UNSUPPORTED Rust 240:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_MoveChange_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9da587eb_23e5_4490_b385_1a22ddc8b187);

// UNSUPPORTED Rust 241:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf6c72ad7_356c_4850_9291_316f608a8c84);

// UNSUPPORTED Rust 242:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_Sensitive_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x37f4c04f_0f12_4464_929c_828fd15292e3);

// UNSUPPORTED Rust 243:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_SpellingError_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xae85567e_9ece_423f_81b7_96c43d53e50e);

// UNSUPPORTED Rust 244:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_Target_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb71b302d_2104_44ad_9c5c_092b4907d70f);

// UNSUPPORTED Rust 245:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_TrackChanges_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x21e6e888_dc14_4016_ac27_190553c8c470);

// UNSUPPORTED Rust 246:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Annotation_UnsyncedChange_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1851116a_0e47_4b30_8cb5_d7dae4fbcd1b);

// UNSUPPORTED Rust 247:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AppBar_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6114908d_cc02_4d37_875b_b530c7139554);

// UNSUPPORTED Rust 248:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AriaProperties_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4213678c_e025_4922_beb5_e43ba08e6221);

// UNSUPPORTED Rust 249:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AriaRole_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdd207b95_be4a_4e0d_b727_63ace94b6916);

public const val `Assertive`: `LiveSetting` = 2;
public typealias `AsyncContentLoadedState` = Int;
public const val `AsyncContentLoadedState_Beginning`: `AsyncContentLoadedState` = 0;
public const val `AsyncContentLoadedState_Completed`: `AsyncContentLoadedState` = 2;
public const val `AsyncContentLoadedState_Progress`: `AsyncContentLoadedState` = 1;
// UNSUPPORTED Rust 255:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AsyncContentLoaded_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5fdee11c_d2fa_4fb9_904e_5cbee894d5ef);

public typealias `AutomationElementMode` = Int;
public const val `AutomationElementMode_Full`: `AutomationElementMode` = 1;
public const val `AutomationElementMode_None`: `AutomationElementMode` = 0;
// UNSUPPORTED Rust 259:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AutomationFocusChanged_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb68a1f17_f60d_41a7_a3cc_b05292155fe0);

// UNSUPPORTED Rust 260:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AutomationId_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc82c0500_b60e_4310_a267_303c531f8ee5);

public typealias `AutomationIdentifierType` = Int;
public const val `AutomationIdentifierType_Annotation`: `AutomationIdentifierType` = 6;
public const val `AutomationIdentifierType_Changes`: `AutomationIdentifierType` = 7;
public const val `AutomationIdentifierType_ControlType`: `AutomationIdentifierType` = 3;
public const val `AutomationIdentifierType_Event`: `AutomationIdentifierType` = 2;
public const val `AutomationIdentifierType_LandmarkType`: `AutomationIdentifierType` = 5;
public const val `AutomationIdentifierType_Pattern`: `AutomationIdentifierType` = 1;
public const val `AutomationIdentifierType_Property`: `AutomationIdentifierType` = 0;
public const val `AutomationIdentifierType_Style`: `AutomationIdentifierType` = 8;
public const val `AutomationIdentifierType_TextAttribute`: `AutomationIdentifierType` = 4;
// UNSUPPORTED Rust 271:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AutomationPropertyChanged_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2527fba1_8d7a_4630_a4cc_e66315942f52);

// UNSUPPORTED Rust 272:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const BoundingRectangle_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7bbfe8b2_3bfc_48dd_b729_c794b846e9a1);

public typealias `BulletStyle` = Int;
public const val `BulletStyle_DashBullet`: `BulletStyle` = 5;
public const val `BulletStyle_FilledRoundBullet`: `BulletStyle` = 2;
public const val `BulletStyle_FilledSquareBullet`: `BulletStyle` = 4;
public const val `BulletStyle_HollowRoundBullet`: `BulletStyle` = 1;
public const val `BulletStyle_HollowSquareBullet`: `BulletStyle` = 3;
public const val `BulletStyle_None`: `BulletStyle` = 0;
public const val `BulletStyle_Other`: `BulletStyle` = -1;
// UNSUPPORTED Rust 281:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Button_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5a78e369_c6a1_4f33_a9d7_79f20d0c788e);

// UNSUPPORTED Rust 282:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CAccPropServices: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb5f8350b_0548_48b1_a6ee_88bd00b4a5e7);

// UNSUPPORTED Rust 283:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_AccPropServices: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb5f8350b_0548_48b1_a6ee_88bd00b4a5e7);

// UNSUPPORTED Rust 284:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CUIAutomation: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xff48dba4_60ef_4201_aa87_54103eef594e);

// UNSUPPORTED Rust 285:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CUIAutomation8: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe22ad333_b25f_460c_83d0_0581107395c9);

// UNSUPPORTED Rust 286:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CUIAutomationRegistrar: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6e29fabf_9977_42d1_8d0e_ca7e61ad87e6);

// UNSUPPORTED Rust 287:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Calendar_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8913eb88_00e5_46bc_8e4e_14a786e165a1);

public typealias `CapStyle` = Int;
public const val `CapStyle_AllCap`: `CapStyle` = 2;
public const val `CapStyle_AllPetiteCaps`: `CapStyle` = 3;
public const val `CapStyle_None`: `CapStyle` = 0;
public const val `CapStyle_Other`: `CapStyle` = -1;
public const val `CapStyle_PetiteCaps`: `CapStyle` = 4;
public const val `CapStyle_SmallCap`: `CapStyle` = 1;
public const val `CapStyle_Titling`: `CapStyle` = 6;
public const val `CapStyle_Unicase`: `CapStyle` = 5;
public typealias `CaretBidiMode` = Int;
public const val `CaretBidiMode_LTR`: `CaretBidiMode` = 0;
public const val `CaretBidiMode_RTL`: `CaretBidiMode` = 1;
public typealias `CaretPosition` = Int;
public const val `CaretPosition_BeginningOfLine`: `CaretPosition` = 2;
public const val `CaretPosition_EndOfLine`: `CaretPosition` = 1;
public const val `CaretPosition_Unknown`: `CaretPosition` = 0;
// UNSUPPORTED Rust 304:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CenterPoint_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cb00c08_540c_4edb_9445_26359ea69785);

// UNSUPPORTED Rust 305:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Changes_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7df26714_614f_4e05_9488_716c5ba19436);

// UNSUPPORTED Rust 306:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Changes_Summary_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x313d65a6_e60f_4d62_9861_55afd728d207);

// UNSUPPORTED Rust 307:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CheckBox_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfb50f922_a3db_49c0_8bc3_06dad55778e2);

// UNSUPPORTED Rust 308:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ClassName_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x157b7215_894f_4b65_84e2_aac0da08b16b);

// UNSUPPORTED Rust 309:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ClickablePoint_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0196903b_b203_4818_a9f3_f08e675f2341);

public typealias `CoalesceEventsOptions` = Int;
public const val `CoalesceEventsOptions_Disabled`: `CoalesceEventsOptions` = 0;
public const val `CoalesceEventsOptions_Enabled`: `CoalesceEventsOptions` = 1;
// UNSUPPORTED Rust 313:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ComboBox_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x54cb426c_2f33_4fff_aaa1_aef60dac5deb);

public typealias `ConditionType` = Int;
public const val `ConditionType_And`: `ConditionType` = 3;
public const val `ConditionType_False`: `ConditionType` = 1;
public const val `ConditionType_Not`: `ConditionType` = 5;
public const val `ConditionType_Or`: `ConditionType` = 4;
public const val `ConditionType_Property`: `ConditionType` = 2;
public const val `ConditionType_True`: `ConditionType` = 0;
public typealias `ConnectionRecoveryBehaviorOptions` = Int;
public const val `ConnectionRecoveryBehaviorOptions_Disabled`: `ConnectionRecoveryBehaviorOptions` = 0;
public const val `ConnectionRecoveryBehaviorOptions_Enabled`: `ConnectionRecoveryBehaviorOptions` = 1;
// UNSUPPORTED Rust 324:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ControlType_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xca774fea_28ac_4bc2_94ca_acec6d6c10a3);

// UNSUPPORTED Rust 325:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ControllerFor_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x51124c8a_a5d2_4f13_9be6_7fa8ba9d3a90);

// UNSUPPORTED Rust 326:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Culture_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe2d74f27_3d79_4dc2_b88b_3044963a8afb);

// UNSUPPORTED Rust 327:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CustomNavigation_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xafea938a_621e_4054_bb2c_2f46114dac3f);

// UNSUPPORTED Rust 328:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Custom_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf29ea0c3_adb7_430a_ba90_e52c7313e6ed);

public const val `DISPID_ACC_CHILD`: Int = -5002;
public const val `DISPID_ACC_CHILDCOUNT`: Int = -5001;
public const val `DISPID_ACC_DEFAULTACTION`: Int = -5013;
public const val `DISPID_ACC_DESCRIPTION`: Int = -5005;
public const val `DISPID_ACC_DODEFAULTACTION`: Int = -5018;
public const val `DISPID_ACC_FOCUS`: Int = -5011;
public const val `DISPID_ACC_HELP`: Int = -5008;
public const val `DISPID_ACC_HELPTOPIC`: Int = -5009;
public const val `DISPID_ACC_HITTEST`: Int = -5017;
public const val `DISPID_ACC_KEYBOARDSHORTCUT`: Int = -5010;
public const val `DISPID_ACC_LOCATION`: Int = -5015;
public const val `DISPID_ACC_NAME`: Int = -5003;
public const val `DISPID_ACC_NAVIGATE`: Int = -5016;
public const val `DISPID_ACC_PARENT`: Int = -5000;
public const val `DISPID_ACC_ROLE`: Int = -5006;
public const val `DISPID_ACC_SELECT`: Int = -5014;
public const val `DISPID_ACC_SELECTION`: Int = -5012;
public const val `DISPID_ACC_STATE`: Int = -5007;
public const val `DISPID_ACC_VALUE`: Int = -5004;
// UNSUPPORTED Rust 348:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DataGrid_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x84b783af_d103_4b0a_8415_e73942410f4b);

// UNSUPPORTED Rust 349:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DataItem_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa0177842_d94f_42a5_814b_6068addc8da5);

// UNSUPPORTED Rust 350:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DescribedBy_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7c5865b8_9992_40fd_8db0_6bf1d317f998);

public typealias `DockPosition` = Int;
public const val `DockPosition_Bottom`: `DockPosition` = 2;
public const val `DockPosition_Fill`: `DockPosition` = 4;
public const val `DockPosition_Left`: `DockPosition` = 1;
public const val `DockPosition_None`: `DockPosition` = 5;
public const val `DockPosition_Right`: `DockPosition` = 3;
public const val `DockPosition_Top`: `DockPosition` = 0;
// UNSUPPORTED Rust 358:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Dock_DockPosition_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6d67f02e_c0b0_4b10_b5b9_18d6ecf98760);

// UNSUPPORTED Rust 359:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Dock_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9cbaa846_83c8_428d_827f_7e6063fe0620);

// UNSUPPORTED Rust 360:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Document_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3cd6bb6f_6f08_4562_b229_e4e2fc7a9eb4);

// UNSUPPORTED Rust 361:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Drag_DragCancel_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc3ede6fa_3451_4e0f_9e71_df9c280a4657);

// UNSUPPORTED Rust 362:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Drag_DragComplete_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x38e96188_ef1f_463e_91ca_3a7792c29caf);

// UNSUPPORTED Rust 363:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Drag_DragStart_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x883a480b_3aa9_429d_95e4_d9c8d011f0dd);

// UNSUPPORTED Rust 364:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Drag_DropEffect_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x646f2779_48d3_4b23_8902_4bf100005df3);

// UNSUPPORTED Rust 365:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Drag_DropEffects_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf5d61156_7ce6_49be_a836_9269dcec920f);

// UNSUPPORTED Rust 366:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Drag_GrabbedItems_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x77c1562c_7b86_4b21_9ed7_3cefda6f4c43);

// UNSUPPORTED Rust 367:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Drag_IsGrabbed_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x45f206f3_75cc_4cca_a9b9_fcdfb982d8a2);

// UNSUPPORTED Rust 368:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Drag_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc0bee21f_ccb3_4fed_995b_114f6e3d2728);

// UNSUPPORTED Rust 369:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DropTarget_DragEnter_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaad9319b_032c_4a88_961d_1cf579581e34);

// UNSUPPORTED Rust 370:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DropTarget_DragLeave_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0f82eb15_24a2_4988_9217_de162aee272b);

// UNSUPPORTED Rust 371:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DropTarget_DropTargetEffect_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8bb75975_a0ca_4981_b818_87fc66e9509d);

// UNSUPPORTED Rust 372:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DropTarget_DropTargetEffects_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbc1dd4ed_cb89_45f1_a592_e03b08ae790f);

// UNSUPPORTED Rust 373:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DropTarget_Dropped_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x622cead8_1edb_4a3d_abbc_be2211ff68b5);

// UNSUPPORTED Rust 374:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DropTarget_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0bcbec56_bd34_4b7b_9fd5_2659905ea3dc);

// UNSUPPORTED Rust 375:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Edit_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6504a5c8_2c86_4f87_ae7b_1abddc810cf9);

public typealias `EventArgsType` = Int;
public const val `EventArgsType_ActiveTextPositionChanged`: `EventArgsType` = 8;
public const val `EventArgsType_AsyncContentLoaded`: `EventArgsType` = 3;
public const val `EventArgsType_Changes`: `EventArgsType` = 6;
public const val `EventArgsType_Notification`: `EventArgsType` = 7;
public const val `EventArgsType_PropertyChanged`: `EventArgsType` = 1;
public const val `EventArgsType_Simple`: `EventArgsType` = 0;
public const val `EventArgsType_StructureChanged`: `EventArgsType` = 2;
public const val `EventArgsType_StructuredMarkup`: `EventArgsType` = 9;
public const val `EventArgsType_TextEditTextChanged`: `EventArgsType` = 5;
public const val `EventArgsType_WindowClosed`: `EventArgsType` = 4;
public typealias `ExpandCollapseState` = Int;
public const val `ExpandCollapseState_Collapsed`: `ExpandCollapseState` = 0;
public const val `ExpandCollapseState_Expanded`: `ExpandCollapseState` = 1;
public const val `ExpandCollapseState_LeafNode`: `ExpandCollapseState` = 3;
public const val `ExpandCollapseState_PartiallyExpanded`: `ExpandCollapseState` = 2;
// UNSUPPORTED Rust 392:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ExpandCollapse_ExpandCollapseState_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x275a4c48_85a7_4f69_aba0_af157610002b);

// UNSUPPORTED Rust 393:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ExpandCollapse_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xae05efa2_f9d1_428a_834c_53a5c52f9b8b);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ExtendedProperty` (
    public var `PropertyName`: `windows_sys`.`core`.`BSTR`,
    public var `PropertyValue`: `windows_sys`.`core`.`BSTR`,
)
// UNSUPPORTED Rust 400:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ExtendedProperty {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILTERKEYS` (
    public var `cbSize`: UInt,
    public var `dwFlags`: UInt,
    public var `iWaitMSec`: UInt,
    public var `iDelayMSec`: UInt,
    public var `iRepeatMSec`: UInt,
    public var `iBounceMSec`: UInt,
)
// UNSUPPORTED Rust 415:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FillColor_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6e0ec4d0_e2a8_4a56_9de7_953389933b39);

public typealias `FillType` = Int;
public const val `FillType_Color`: `FillType` = 1;
public const val `FillType_Gradient`: `FillType` = 2;
public const val `FillType_None`: `FillType` = 0;
public const val `FillType_Pattern`: `FillType` = 4;
public const val `FillType_Picture`: `FillType` = 3;
// UNSUPPORTED Rust 422:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FillType_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc6fc74e4_8cb9_429c_a9e1_9bc4ac372b62);

public typealias `FlowDirections` = Int;
public const val `FlowDirections_BottomToTop`: `FlowDirections` = 2;
public const val `FlowDirections_Default`: `FlowDirections` = 0;
public const val `FlowDirections_RightToLeft`: `FlowDirections` = 1;
public const val `FlowDirections_Vertical`: `FlowDirections` = 4;
// UNSUPPORTED Rust 428:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FlowsFrom_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x05c6844f_19de_48f8_95fa_880d5b0fd615);

// UNSUPPORTED Rust 429:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FlowsTo_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe4f33d20_559a_47fb_a830_f9cb4ff1a70a);

// UNSUPPORTED Rust 430:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FrameworkId_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdbfd9900_7e1a_4f58_b61b_7063120f773b);

// UNSUPPORTED Rust 431:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FullDescription_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0d4450ff_6aef_4f33_95dd_7befa72a4391);

// UNSUPPORTED Rust 432:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GridItem_ColumnSpan_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x583ea3f5_86d0_4b08_a6ec_2c5463ffc109);

// UNSUPPORTED Rust 433:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GridItem_Column_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc774c15c_62c0_4519_8bdc_47be573c8ad5);

// UNSUPPORTED Rust 434:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GridItem_Parent_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9d912252_b97f_4ecc_8510_ea0e33427c72);

// UNSUPPORTED Rust 435:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GridItem_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2d5c877_a462_4957_a2a5_2c96b303bc63);

// UNSUPPORTED Rust 436:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GridItem_RowSpan_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4582291c_466b_4e93_8e83_3d1715ec0c5e);

// UNSUPPORTED Rust 437:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GridItem_Row_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6223972a_c945_4563_9329_fdc974af2553);

// UNSUPPORTED Rust 438:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Grid_ColumnCount_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfe96f375_44aa_4536_ac7a_2a75d71a3efc);

// UNSUPPORTED Rust 439:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Grid_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x260a2ccb_93a8_4e44_a4c1_3df397f2b02b);

// UNSUPPORTED Rust 440:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Grid_RowCount_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2a9505bf_c2eb_4fb6_b356_8245ae53703e);

// UNSUPPORTED Rust 441:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Group_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xad50aa1c_e8c8_4774_ae1b_dd86df0b3bdc);

public const val `HCF_AVAILABLE`: `HIGHCONTRASTW_FLAGS` = 2u;
public const val `HCF_CONFIRMHOTKEY`: `HIGHCONTRASTW_FLAGS` = 8u;
public const val `HCF_HIGHCONTRASTON`: `HIGHCONTRASTW_FLAGS` = 1u;
public const val `HCF_HOTKEYACTIVE`: `HIGHCONTRASTW_FLAGS` = 4u;
public const val `HCF_HOTKEYAVAILABLE`: `HIGHCONTRASTW_FLAGS` = 64u;
public const val `HCF_HOTKEYSOUND`: `HIGHCONTRASTW_FLAGS` = 16u;
public const val `HCF_INDICATOR`: `HIGHCONTRASTW_FLAGS` = 32u;
public const val `HCF_OPTION_NOTHEMECHANGE`: `HIGHCONTRASTW_FLAGS` = 4096u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HIGHCONTRASTA` (
    public var `cbSize`: UInt,
    public var `dwFlags`: `HIGHCONTRASTW_FLAGS`,
    public var `lpszDefaultScheme`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 457:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HIGHCONTRASTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HIGHCONTRASTW` (
    public var `cbSize`: UInt,
    public var `dwFlags`: `HIGHCONTRASTW_FLAGS`,
    public var `lpszDefaultScheme`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 469:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HIGHCONTRASTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HIGHCONTRASTW_FLAGS` = UInt;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HUIAEVENT` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HUIANODE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HUIAPATTERNOBJECT` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HUIATEXTRANGE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HWINEVENTHOOK` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// UNSUPPORTED Rust 480:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const HasKeyboardFocus_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcf8afd39_3f46_4800_9656_b2bf12529905);

// UNSUPPORTED Rust 481:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const HeaderItem_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe6bc12cb_7c8e_49cf_b168_4a93a32bebb0);

// UNSUPPORTED Rust 482:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Header_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5b90cbce_78fb_4614_82b6_554d74718e67);

public const val `HeadingLevel1`: `UIA_HEADINGLEVEL_ID` = 80051;
public const val `HeadingLevel2`: `UIA_HEADINGLEVEL_ID` = 80052;
public const val `HeadingLevel3`: `UIA_HEADINGLEVEL_ID` = 80053;
public const val `HeadingLevel4`: `UIA_HEADINGLEVEL_ID` = 80054;
public const val `HeadingLevel5`: `UIA_HEADINGLEVEL_ID` = 80055;
public const val `HeadingLevel6`: `UIA_HEADINGLEVEL_ID` = 80056;
public const val `HeadingLevel7`: `UIA_HEADINGLEVEL_ID` = 80057;
public const val `HeadingLevel8`: `UIA_HEADINGLEVEL_ID` = 80058;
public const val `HeadingLevel9`: `UIA_HEADINGLEVEL_ID` = 80059;
public const val `HeadingLevel_None`: `UIA_HEADINGLEVEL_ID` = 80050;
// UNSUPPORTED Rust 493:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const HeadingLevel_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x29084272_aaaf_4a30_8796_3c12f62b6bbb);

// UNSUPPORTED Rust 494:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const HelpText_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x08555685_0977_45c7_a7a6_abaf5684121a);

public typealias `HorizontalTextAlignment` = Int;
public const val `HorizontalTextAlignment_Centered`: `HorizontalTextAlignment` = 1;
public const val `HorizontalTextAlignment_Justified`: `HorizontalTextAlignment` = 3;
public const val `HorizontalTextAlignment_Left`: `HorizontalTextAlignment` = 0;
public const val `HorizontalTextAlignment_Right`: `HorizontalTextAlignment` = 2;
// UNSUPPORTED Rust 500:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const HostedFragmentRootsInvalidated_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe6bdb03e_0921_4ec5_8dcf_eae877b0426b);

// UNSUPPORTED Rust 501:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Hyperlink_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8a56022c_b00d_4d15_8ff0_5b6b266e5e02);

// UNSUPPORTED Rust 502:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IIS_ControlAccessible: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x38c682a6_9731_43f2_9fae_e901e641b101);

// UNSUPPORTED Rust 503:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IIS_IsOleaccProxy: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x902697fa_80e4_4560_802a_a13f22a64709);

// UNSUPPORTED Rust 504:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Image_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2d3736e4_6b16_4c57_a962_f93260a75243);

// UNSUPPORTED Rust 505:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const InputDiscarded_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7f36c367_7b18_417c_97e3_9d58ddc944ab);

// UNSUPPORTED Rust 506:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const InputReachedOtherElement_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xed201d8a_4e6c_415e_a874_2460c9b66ba8);

// UNSUPPORTED Rust 507:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const InputReachedTarget_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x93ed549a_0549_40f0_bedb_28e44f7de2a3);

// UNSUPPORTED Rust 508:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Invoke_Invoked_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdfd699f0_c915_49dd_b422_dde785c3d24b);

// UNSUPPORTED Rust 509:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Invoke_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd976c2fc_66ea_4a6e_b28f_c24c7546ad37);

// UNSUPPORTED Rust 510:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsAnnotationPatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0b5b3238_6d5c_41b6_bcc4_5e807f6551c4);

// UNSUPPORTED Rust 511:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsContentElement_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4bda64a8_f5d8_480b_8155_ef2e89adb672);

// UNSUPPORTED Rust 512:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsControlElement_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x95f35085_abcc_4afd_a5f4_dbb46c230fdb);

// UNSUPPORTED Rust 513:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsCustomNavigationPatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8f8e80d4_2351_48e0_874a_54aa7313889a);

// UNSUPPORTED Rust 514:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsDataValidForForm_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x445ac684_c3fc_4dd9_acf8_845a579296ba);

// UNSUPPORTED Rust 515:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsDialog_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9d0dfb9b_8436_4501_bbbb_e534a4fb3b3f);

// UNSUPPORTED Rust 516:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsDockPatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2600a4c4_2ff8_4c96_ae31_8fe619a13c6c);

// UNSUPPORTED Rust 517:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsDragPatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe997a7b7_1d39_4ca7_be0f_277fcf5605cc);

// UNSUPPORTED Rust 518:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsDropTargetPatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0686b62e_8e19_4aaf_873d_384f6d3b92be);

// UNSUPPORTED Rust 519:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsEnabled_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2109427f_da60_4fed_bf1b_264bdce6eb3a);

// UNSUPPORTED Rust 520:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsExpandCollapsePatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x929d3806_5287_4725_aa16_222afc63d595);

// UNSUPPORTED Rust 521:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsGridItemPatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5a43e524_f9a2_4b12_84c8_b48a3efedd34);

// UNSUPPORTED Rust 522:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsGridPatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5622c26c_f0ef_4f3b_97cb_714c0868588b);

// UNSUPPORTED Rust 523:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsInvokePatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4e725738_8364_4679_aa6c_f3f41931f750);

// UNSUPPORTED Rust 524:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsItemContainerPatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x624b5ca7_fe40_4957_a019_20c4cf11920f);

// UNSUPPORTED Rust 525:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsKeyboardFocusable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf7b8552a_0859_4b37_b9cb_51e72092f29f);

// UNSUPPORTED Rust 526:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsLegacyIAccessiblePatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd8ebd0c7_929a_4ee7_8d3a_d3d94413027b);

// UNSUPPORTED Rust 527:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsMultipleViewPatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xff0a31eb_8e25_469d_8d6e_e771a27c1b90);

// UNSUPPORTED Rust 528:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsObjectModelPatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6b21d89b_2841_412f_8ef2_15ca952318ba);

// UNSUPPORTED Rust 529:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsOffscreen_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03c3d160_db79_42db_a2ef_1c231eede507);

// UNSUPPORTED Rust 530:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsPassword_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe8482eb1_687c_497b_bebc_03be53ec1454);

// UNSUPPORTED Rust 531:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsPeripheral_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xda758276_7ed5_49d4_8e68_ecc9a2d300dd);

// UNSUPPORTED Rust 532:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsRangeValuePatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfda4244a_eb4d_43ff_b5ad_ed36d373ec4c);

// UNSUPPORTED Rust 533:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsRequiredForForm_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4f5f43cf_59fb_4bde_a270_602e5e1141e9);

// UNSUPPORTED Rust 534:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsScrollItemPatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1cad1a05_0927_4b76_97e1_0fcdb209b98a);

// UNSUPPORTED Rust 535:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsScrollPatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3ebb7b4a_828a_4b57_9d22_2fea1632ed0d);

// UNSUPPORTED Rust 536:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsSelectionItemPatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8becd62d_0bc3_4109_bee2_8e6715290e68);

// UNSUPPORTED Rust 537:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsSelectionPattern2Available_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x490806fb_6e89_4a47_8319_d266e511f021);

// UNSUPPORTED Rust 538:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsSelectionPatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf588acbe_c769_4838_9a60_2686dc1188c4);

// UNSUPPORTED Rust 539:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsSpreadsheetItemPatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9fe79b2a_2f94_43fd_996b_549e316f4acd);

// UNSUPPORTED Rust 540:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsSpreadsheetPatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6ff43732_e4b4_4555_97bc_ecdbbc4d1888);

// UNSUPPORTED Rust 541:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsStructuredMarkupPatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb0d4c196_2c0b_489c_b165_a405928c6f3d);

// UNSUPPORTED Rust 542:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsStylesPatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x27f353d3_459c_4b59_a490_50611dacafb5);

// UNSUPPORTED Rust 543:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsSynchronizedInputPatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x75d69cc5_d2bf_4943_876e_b45b62a6cc66);

// UNSUPPORTED Rust 544:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsTableItemPatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeb36b40d_8ea4_489b_a013_e60d5951fe34);

// UNSUPPORTED Rust 545:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsTablePatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcb83575f_45c2_4048_9c76_159715a139df);

// UNSUPPORTED Rust 546:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsTextChildPatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x559e65df_30ff_43b5_b5ed_5b283b80c7e9);

// UNSUPPORTED Rust 547:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsTextEditPatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7843425c_8b32_484c_9ab5_e3200571ffda);

// UNSUPPORTED Rust 548:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsTextPattern2Available_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x41cf921d_e3f1_4b22_9c81_e1c3ed331c22);

// UNSUPPORTED Rust 549:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsTextPatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfbe2d69d_aff6_4a45_82e2_fc92a82f5917);

// UNSUPPORTED Rust 550:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsTogglePatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x78686d53_fcd0_4b83_9b78_5832ce63bb5b);

// UNSUPPORTED Rust 551:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsTransformPattern2Available_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x25980b4b_be04_4710_ab4a_fda31dbd2895);

// UNSUPPORTED Rust 552:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsTransformPatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa7f78804_d68b_4077_a5c6_7a5ea1ac31c5);

// UNSUPPORTED Rust 553:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsValuePatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0b5020a7_2119_473b_be37_5ceb98bbfb22);

// UNSUPPORTED Rust 554:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsVirtualizedItemPatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x302cb151_2ac8_45d6_977b_d2b3a5a53f20);

// UNSUPPORTED Rust 555:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const IsWindowPatternAvailable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe7a57bb1_5888_4155_98dc_b422fd57f2bc);

// UNSUPPORTED Rust 556:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ItemContainer_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3d13da0f_8b9a_4a99_85fa_c5c9a69f1ed4);

// UNSUPPORTED Rust 557:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ItemStatus_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x51de0321_3973_43e7_8913_0b08e813c37f);

// UNSUPPORTED Rust 558:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ItemType_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcdda434d_6222_413b_a68a_325dd1d40f39);

// UNSUPPORTED Rust 559:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LIBID_Accessibility: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1ea4dbf0_3c3b_11cf_810c_00aa00389b71);

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
public typealias `LPFNACCESSIBLECHILDREN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, Int, Int, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Variant`.`VARIANT`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
public typealias `LPFNACCESSIBLEOBJECTFROMPOINT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`POINT`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Variant`.`VARIANT`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPFNACCESSIBLEOBJECTFROMWINDOW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPFNCREATESTDACCESSIBLEOBJECT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, Int, /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPFNLRESULTFROMOBJECT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `super`.`super`.`Foundation`.`WPARAM`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `super`.`super`.`Foundation`.`LRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPFNOBJECTFROMLRESULT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`LRESULT`, /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `super`.`super`.`Foundation`.`WPARAM`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// UNSUPPORTED Rust 568:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LabeledBy_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe5b8924b_fc8a_4a35_8031_cf78ac43e55e);

// UNSUPPORTED Rust 569:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LandmarkType_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x454045f2_6f61_49f7_a4f8_b5f0cf82da1e);

// UNSUPPORTED Rust 570:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LayoutInvalidated_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xed7d6544_a6bd_4595_9bae_3d28946cc715);

// UNSUPPORTED Rust 571:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LegacyIAccessible_ChildId_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9a191b5d_9ef2_4787_a459_dcde885dd4e8);

// UNSUPPORTED Rust 572:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LegacyIAccessible_DefaultAction_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3b331729_eaad_4502_b85f_92615622913c);

// UNSUPPORTED Rust 573:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LegacyIAccessible_Description_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x46448418_7d70_4ea9_9d27_b7e775cf2ad7);

// UNSUPPORTED Rust 574:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LegacyIAccessible_Help_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x94402352_161c_4b77_a98d_a872cc33947a);

// UNSUPPORTED Rust 575:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LegacyIAccessible_KeyboardShortcut_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8f6909ac_00b8_4259_a41c_966266d43a8a);

// UNSUPPORTED Rust 576:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LegacyIAccessible_Name_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcaeb063d_40ae_4869_aa5a_1b8e5d666739);

// UNSUPPORTED Rust 577:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LegacyIAccessible_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x54cc0a9f_3395_48af_ba8d_73f85690f3e0);

// UNSUPPORTED Rust 578:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LegacyIAccessible_Role_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6856e59f_cbaf_4e31_93e8_bcbf6f7e491c);

// UNSUPPORTED Rust 579:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LegacyIAccessible_Selection_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8aa8b1e0_0891_40cc_8b06_90d7d4166219);

// UNSUPPORTED Rust 580:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LegacyIAccessible_State_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdf985854_2281_4340_ab9c_c60e2c5803f6);

// UNSUPPORTED Rust 581:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LegacyIAccessible_Value_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb5c5b0b6_8217_4a77_97a5_190a85ed0156);

// UNSUPPORTED Rust 582:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Level_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x242ac529_cd36_400f_aad9_7876ef3af627);

// UNSUPPORTED Rust 583:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ListItem_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7b3717f2_44d1_4a58_98a8_f12a9b8f78e2);

// UNSUPPORTED Rust 584:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const List_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9b149ee1_7cca_4cfc_9af1_cac7bddd3031);

// UNSUPPORTED Rust 585:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LiveRegionChanged_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x102d5e90_e6a9_41b6_b1c5_a9b1929d9510);

public typealias `LiveSetting` = Int;
// UNSUPPORTED Rust 587:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LiveSetting_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc12bcd8e_2a8e_4950_8ae7_3625111d58eb);

// UNSUPPORTED Rust 588:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LocalizedControlType_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8763404f_a1bd_452a_89c4_3f01d3833806);

// UNSUPPORTED Rust 589:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LocalizedLandmarkType_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7ac81980_eafb_4fb2_bf91_f485bef5e8e1);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MOUSEKEYS` (
    public var `cbSize`: UInt,
    public var `dwFlags`: UInt,
    public var `iMaxSpeed`: UInt,
    public var `iTimeToMaxSpeed`: UInt,
    public var `iCtrlSpeed`: UInt,
    public var `dwReserved1`: UInt,
    public var `dwReserved2`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MSAAMENUINFO` (
    public var `dwMSAASignature`: UInt,
    public var `cchWText`: UInt,
    public var `pszWText`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 608:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MSAAMENUINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MSAA_MENU_SIG`: Int = -1441927155;
// UNSUPPORTED Rust 614:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MenuBar_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcc384250_0e7b_4ae8_95ae_a08f261b52ee);

// UNSUPPORTED Rust 615:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MenuClosed_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3cf1266e_1582_4041_acd7_88a35a965297);

// UNSUPPORTED Rust 616:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MenuItem_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf45225d3_d0a0_49d8_9834_9a000d2aeddc);

// UNSUPPORTED Rust 617:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MenuModeEnd_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9ecd4c9f_80dd_47b8_8267_5aec06bb2cff);

// UNSUPPORTED Rust 618:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MenuModeStart_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x18d7c631_166a_4ac9_ae3b_ef4b5420e681);

// UNSUPPORTED Rust 619:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MenuOpened_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xebe2e945_66ca_4ed1_9ff8_2ad7df0a1b08);

// UNSUPPORTED Rust 620:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Menu_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2e9b1440_0ea8_41fd_b374_c1ea6f503cd1);

// UNSUPPORTED Rust 621:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MultipleView_CurrentView_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7a81a67a_b94f_4875_918b_65c8d2f998e5);

// UNSUPPORTED Rust 622:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MultipleView_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x547a6ae4_113f_47c4_850f_db4dfa466b1d);

// UNSUPPORTED Rust 623:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MultipleView_SupportedViews_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8d5db9fd_ce3c_4ae7_b788_400a3c645547);

public const val `NAVDIR_DOWN`: UInt = 2u;
public const val `NAVDIR_FIRSTCHILD`: UInt = 7u;
public const val `NAVDIR_LASTCHILD`: UInt = 8u;
public const val `NAVDIR_LEFT`: UInt = 3u;
public const val `NAVDIR_MAX`: UInt = 9u;
public const val `NAVDIR_MIN`: UInt = 0u;
public const val `NAVDIR_NEXT`: UInt = 5u;
public const val `NAVDIR_PREVIOUS`: UInt = 6u;
public const val `NAVDIR_RIGHT`: UInt = 4u;
public const val `NAVDIR_UP`: UInt = 1u;
// UNSUPPORTED Rust 634:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Name_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc3a6921b_4a99_44f1_bca6_61187052c431);

public typealias `NavigateDirection` = Int;
public const val `NavigateDirection_FirstChild`: `NavigateDirection` = 3;
public const val `NavigateDirection_LastChild`: `NavigateDirection` = 4;
public const val `NavigateDirection_NextSibling`: `NavigateDirection` = 1;
public const val `NavigateDirection_Parent`: `NavigateDirection` = 0;
public const val `NavigateDirection_PreviousSibling`: `NavigateDirection` = 2;
// UNSUPPORTED Rust 641:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const NewNativeWindowHandle_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5196b33b_380a_4982_95e1_91f3ef60e024);

public typealias `NormalizeState` = Int;
public const val `NormalizeState_Custom`: `NormalizeState` = 2;
public const val `NormalizeState_None`: `NormalizeState` = 0;
public const val `NormalizeState_View`: `NormalizeState` = 1;
public typealias `NotificationKind` = Int;
public const val `NotificationKind_ActionAborted`: `NotificationKind` = 3;
public const val `NotificationKind_ActionCompleted`: `NotificationKind` = 2;
public const val `NotificationKind_ItemAdded`: `NotificationKind` = 0;
public const val `NotificationKind_ItemRemoved`: `NotificationKind` = 1;
public const val `NotificationKind_Other`: `NotificationKind` = 4;
public typealias `NotificationProcessing` = Int;
public const val `NotificationProcessing_All`: `NotificationProcessing` = 2;
public const val `NotificationProcessing_CurrentThenMostRecent`: `NotificationProcessing` = 4;
public const val `NotificationProcessing_ImportantAll`: `NotificationProcessing` = 0;
public const val `NotificationProcessing_ImportantMostRecent`: `NotificationProcessing` = 1;
public const val `NotificationProcessing_MostRecent`: `NotificationProcessing` = 3;
// UNSUPPORTED Rust 658:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Notification_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x72c5a2f7_9788_480f_b8eb_4dee00f6186f);

// UNSUPPORTED Rust 659:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ObjectModel_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3e04acfe_08fc_47ec_96bc_353fa3b34aa7);

public const val `Off`: `LiveSetting` = 0;
// UNSUPPORTED Rust 661:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const OptimizeForVisualContent_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6a852250_c75a_4e5d_b858_e381b0f78861);

public typealias `OrientationType` = Int;
public const val `OrientationType_Horizontal`: `OrientationType` = 1;
public const val `OrientationType_None`: `OrientationType` = 0;
public const val `OrientationType_Vertical`: `OrientationType` = 2;
// UNSUPPORTED Rust 666:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Orientation_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa01eee62_3884_4415_887e_678ec21e39ba);

// UNSUPPORTED Rust 667:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const OutlineColor_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc395d6c0_4b55_4762_a073_fd303a634f52);

public typealias `OutlineStyles` = Int;
public const val `OutlineStyles_Embossed`: `OutlineStyles` = 8;
public const val `OutlineStyles_Engraved`: `OutlineStyles` = 4;
public const val `OutlineStyles_None`: `OutlineStyles` = 0;
public const val `OutlineStyles_Outline`: `OutlineStyles` = 1;
public const val `OutlineStyles_Shadow`: `OutlineStyles` = 2;
// UNSUPPORTED Rust 674:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const OutlineThickness_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x13e67cc7_dac2_4888_bdd3_375c62fa9618);

// UNSUPPORTED Rust 675:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPID_ACC_DEFAULTACTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x180c072b_c27f_43c7_9922_f63562a4632b);

// UNSUPPORTED Rust 676:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPID_ACC_DESCRIPTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d48dfe4_bd3f_491f_a648_492d6f20c588);

// UNSUPPORTED Rust 677:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPID_ACC_DESCRIPTIONMAP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1ff1435f_8a14_477b_b226_a0abe279975d);

// UNSUPPORTED Rust 678:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPID_ACC_DODEFAULTACTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1ba09523_2e3b_49a6_a059_59682a3c48fd);

// UNSUPPORTED Rust 679:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPID_ACC_FOCUS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6eb335df_1c29_4127_b12c_dee9fd157f2b);

// UNSUPPORTED Rust 680:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPID_ACC_HELP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc831e11f_44db_4a99_9768_cb8f978b7231);

// UNSUPPORTED Rust 681:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPID_ACC_HELPTOPIC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x787d1379_8ede_440b_8aec_11f7bf9030b3);

// UNSUPPORTED Rust 682:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPID_ACC_KEYBOARDSHORTCUT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7d9bceee_7d1e_4979_9382_5180f4172c34);

// UNSUPPORTED Rust 683:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPID_ACC_NAME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x608d3df8_8128_4aa7_a428_f55e49267291);

// UNSUPPORTED Rust 684:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPID_ACC_NAV_DOWN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x031670ed_3cdf_48d2_9613_138f2dd8a668);

// UNSUPPORTED Rust 685:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPID_ACC_NAV_FIRSTCHILD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcfd02558_557b_4c67_84f9_2a09fce40749);

// UNSUPPORTED Rust 686:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPID_ACC_NAV_LASTCHILD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x302ecaa5_48d5_4f8d_b671_1a8d20a77832);

// UNSUPPORTED Rust 687:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPID_ACC_NAV_LEFT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x228086cb_82f1_4a39_8705_dcdc0fff92f5);

// UNSUPPORTED Rust 688:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPID_ACC_NAV_NEXT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1cdc5455_8cd9_4c92_a371_3939a2fe3eee);

// UNSUPPORTED Rust 689:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPID_ACC_NAV_PREV: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x776d3891_c73b_4480_b3f6_076a16a15af6);

// UNSUPPORTED Rust 690:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPID_ACC_NAV_RIGHT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcd211d9f_e1cb_4fe5_a77c_920b884d095b);

// UNSUPPORTED Rust 691:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPID_ACC_NAV_UP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x016e1a2b_1a4e_4767_8612_3386f66935ec);

// UNSUPPORTED Rust 692:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPID_ACC_PARENT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x474c22b6_ffc2_467a_b1b5_e958b4657330);

// UNSUPPORTED Rust 693:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPID_ACC_ROLE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcb905ff2_7bd1_4c05_b3c8_e6c241364d70);

// UNSUPPORTED Rust 694:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPID_ACC_ROLEMAP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf79acda2_140d_4fe6_8914_208476328269);

// UNSUPPORTED Rust 695:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPID_ACC_SELECTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb99d073c_d731_405b_9061_d95e8f842984);

// UNSUPPORTED Rust 696:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPID_ACC_STATE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa8d4d5b0_0a21_42d0_a5c0_514e984f457b);

// UNSUPPORTED Rust 697:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPID_ACC_STATEMAP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x43946c5e_0ac0_4042_b525_07bbdbe17fa7);

// UNSUPPORTED Rust 698:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPID_ACC_VALUE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x123fe443_211a_4615_9527_c45a7e93717a);

// UNSUPPORTED Rust 699:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PROPID_ACC_VALUEMAP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xda1c3d79_fc5c_420e_b399_9d1533549e75);

// UNSUPPORTED Rust 700:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Pane_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5c2b3f5b_9182_42a3_8dec_8c04c1ee634d);

public const val `Polite`: `LiveSetting` = 1;
// UNSUPPORTED Rust 702:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PositionInSet_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x33d1dc54_641e_4d76_a6b1_13f341c1f896);

// UNSUPPORTED Rust 703:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ProcessId_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x40499998_9c31_4245_a403_87320e59eaf6);

// UNSUPPORTED Rust 704:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ProgressBar_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x228c9f86_c36c_47bb_9fb6_a5834bfc53a4);

public typealias `PropertyConditionFlags` = Int;
public const val `PropertyConditionFlags_IgnoreCase`: `PropertyConditionFlags` = 1;
public const val `PropertyConditionFlags_MatchSubstring`: `PropertyConditionFlags` = 2;
public const val `PropertyConditionFlags_None`: `PropertyConditionFlags` = 0;
// UNSUPPORTED Rust 709:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ProviderDescription_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdca5708a_c16b_4cd9_b889_beb16a804904);

public typealias `ProviderOptions` = Int;
public const val `ProviderOptions_ClientSideProvider`: `ProviderOptions` = 1;
public const val `ProviderOptions_HasNativeIAccessible`: `ProviderOptions` = 128;
public const val `ProviderOptions_NonClientAreaProvider`: `ProviderOptions` = 4;
public const val `ProviderOptions_OverrideProvider`: `ProviderOptions` = 8;
public const val `ProviderOptions_ProviderOwnsSetFocus`: `ProviderOptions` = 16;
public const val `ProviderOptions_RefuseNonClientSupport`: `ProviderOptions` = 64;
public const val `ProviderOptions_ServerSideProvider`: `ProviderOptions` = 2;
public const val `ProviderOptions_UseClientCoordinates`: `ProviderOptions` = 256;
public const val `ProviderOptions_UseComThreading`: `ProviderOptions` = 32;
public typealias `ProviderType` = Int;
public const val `ProviderType_BaseHwnd`: `ProviderType` = 0;
public const val `ProviderType_NonClientArea`: `ProviderType` = 2;
public const val `ProviderType_Proxy`: `ProviderType` = 1;
public const val `ROLE_SYSTEM_ALERT`: UInt = 8u;
public const val `ROLE_SYSTEM_ANIMATION`: UInt = 54u;
public const val `ROLE_SYSTEM_APPLICATION`: UInt = 14u;
public const val `ROLE_SYSTEM_BORDER`: UInt = 19u;
public const val `ROLE_SYSTEM_BUTTONDROPDOWN`: UInt = 56u;
public const val `ROLE_SYSTEM_BUTTONDROPDOWNGRID`: UInt = 58u;
public const val `ROLE_SYSTEM_BUTTONMENU`: UInt = 57u;
public const val `ROLE_SYSTEM_CARET`: UInt = 7u;
public const val `ROLE_SYSTEM_CELL`: UInt = 29u;
public const val `ROLE_SYSTEM_CHARACTER`: UInt = 32u;
public const val `ROLE_SYSTEM_CHART`: UInt = 17u;
public const val `ROLE_SYSTEM_CHECKBUTTON`: UInt = 44u;
public const val `ROLE_SYSTEM_CLIENT`: UInt = 10u;
public const val `ROLE_SYSTEM_CLOCK`: UInt = 61u;
public const val `ROLE_SYSTEM_COLUMN`: UInt = 27u;
public const val `ROLE_SYSTEM_COLUMNHEADER`: UInt = 25u;
public const val `ROLE_SYSTEM_COMBOBOX`: UInt = 46u;
public const val `ROLE_SYSTEM_CURSOR`: UInt = 6u;
public const val `ROLE_SYSTEM_DIAGRAM`: UInt = 53u;
public const val `ROLE_SYSTEM_DIAL`: UInt = 49u;
public const val `ROLE_SYSTEM_DIALOG`: UInt = 18u;
public const val `ROLE_SYSTEM_DOCUMENT`: UInt = 15u;
public const val `ROLE_SYSTEM_DROPLIST`: UInt = 47u;
public const val `ROLE_SYSTEM_EQUATION`: UInt = 55u;
public const val `ROLE_SYSTEM_GRAPHIC`: UInt = 40u;
public const val `ROLE_SYSTEM_GRIP`: UInt = 4u;
public const val `ROLE_SYSTEM_GROUPING`: UInt = 20u;
public const val `ROLE_SYSTEM_HELPBALLOON`: UInt = 31u;
public const val `ROLE_SYSTEM_HOTKEYFIELD`: UInt = 50u;
public const val `ROLE_SYSTEM_INDICATOR`: UInt = 39u;
public const val `ROLE_SYSTEM_IPADDRESS`: UInt = 63u;
public const val `ROLE_SYSTEM_LINK`: UInt = 30u;
public const val `ROLE_SYSTEM_LIST`: UInt = 33u;
public const val `ROLE_SYSTEM_LISTITEM`: UInt = 34u;
public const val `ROLE_SYSTEM_MENUBAR`: UInt = 2u;
public const val `ROLE_SYSTEM_MENUITEM`: UInt = 12u;
public const val `ROLE_SYSTEM_MENUPOPUP`: UInt = 11u;
public const val `ROLE_SYSTEM_OUTLINE`: UInt = 35u;
public const val `ROLE_SYSTEM_OUTLINEBUTTON`: UInt = 64u;
public const val `ROLE_SYSTEM_OUTLINEITEM`: UInt = 36u;
public const val `ROLE_SYSTEM_PAGETAB`: UInt = 37u;
public const val `ROLE_SYSTEM_PAGETABLIST`: UInt = 60u;
public const val `ROLE_SYSTEM_PANE`: UInt = 16u;
public const val `ROLE_SYSTEM_PROGRESSBAR`: UInt = 48u;
public const val `ROLE_SYSTEM_PROPERTYPAGE`: UInt = 38u;
public const val `ROLE_SYSTEM_PUSHBUTTON`: UInt = 43u;
public const val `ROLE_SYSTEM_RADIOBUTTON`: UInt = 45u;
public const val `ROLE_SYSTEM_ROW`: UInt = 28u;
public const val `ROLE_SYSTEM_ROWHEADER`: UInt = 26u;
public const val `ROLE_SYSTEM_SCROLLBAR`: UInt = 3u;
public const val `ROLE_SYSTEM_SEPARATOR`: UInt = 21u;
public const val `ROLE_SYSTEM_SLIDER`: UInt = 51u;
public const val `ROLE_SYSTEM_SOUND`: UInt = 5u;
public const val `ROLE_SYSTEM_SPINBUTTON`: UInt = 52u;
public const val `ROLE_SYSTEM_SPLITBUTTON`: UInt = 62u;
public const val `ROLE_SYSTEM_STATICTEXT`: UInt = 41u;
public const val `ROLE_SYSTEM_STATUSBAR`: UInt = 23u;
public const val `ROLE_SYSTEM_TABLE`: UInt = 24u;
public const val `ROLE_SYSTEM_TEXT`: UInt = 42u;
public const val `ROLE_SYSTEM_TITLEBAR`: UInt = 1u;
public const val `ROLE_SYSTEM_TOOLBAR`: UInt = 22u;
public const val `ROLE_SYSTEM_TOOLTIP`: UInt = 13u;
public const val `ROLE_SYSTEM_WHITESPACE`: UInt = 59u;
public const val `ROLE_SYSTEM_WINDOW`: UInt = 9u;
// UNSUPPORTED Rust 788:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const RadioButton_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3bdb49db_fe2c_4483_b3e1_e57f219440c6);

// UNSUPPORTED Rust 789:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const RangeValue_IsReadOnly_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x25fa1055_debf_4373_a79e_1f1a1908d3c4);

// UNSUPPORTED Rust 790:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const RangeValue_LargeChange_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa1f96325_3a3d_4b44_8e1f_4a46d9844019);

// UNSUPPORTED Rust 791:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const RangeValue_Maximum_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x19319914_f979_4b35_a1a6_d37e05433473);

// UNSUPPORTED Rust 792:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const RangeValue_Minimum_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x78cbd3b2_684d_4860_af93_d1f95cb022fd);

// UNSUPPORTED Rust 793:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const RangeValue_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x18b00d87_b1c9_476a_bfbd_5f0bdb926f63);

// UNSUPPORTED Rust 794:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const RangeValue_SmallChange_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x81c2c457_3941_4107_9975_139760f7c072);

// UNSUPPORTED Rust 795:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const RangeValue_Value_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x131f5d98_c50c_489d_abe5_ae220898c5f7);

// UNSUPPORTED Rust 796:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Rotation_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x767cdc7d_aec0_4110_ad32_30edd403492e);

public typealias `RowOrColumnMajor` = Int;
public const val `RowOrColumnMajor_ColumnMajor`: `RowOrColumnMajor` = 1;
public const val `RowOrColumnMajor_Indeterminate`: `RowOrColumnMajor` = 2;
public const val `RowOrColumnMajor_RowMajor`: `RowOrColumnMajor` = 0;
// UNSUPPORTED Rust 801:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const RuntimeId_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa39eebfa_7fba_4c89_b4d4_b99e2de7d160);

public const val `SELFLAG_ADDSELECTION`: UInt = 8u;
public const val `SELFLAG_EXTENDSELECTION`: UInt = 4u;
public const val `SELFLAG_NONE`: UInt = 0u;
public const val `SELFLAG_REMOVESELECTION`: UInt = 16u;
public const val `SELFLAG_TAKEFOCUS`: UInt = 1u;
public const val `SELFLAG_TAKESELECTION`: UInt = 2u;
public const val `SELFLAG_VALID`: UInt = 31u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SERIALKEYSA` (
    public var `cbSize`: UInt,
    public var `dwFlags`: `SERIALKEYS_FLAGS`,
    public var `lpszActivePort`: `windows_sys`.`core`.`PSTR`,
    public var `lpszPort`: `windows_sys`.`core`.`PSTR`,
    public var `iBaudRate`: UInt,
    public var `iPortState`: UInt,
    public var `iActive`: UInt,
)
// UNSUPPORTED Rust 820:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SERIALKEYSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SERIALKEYSW` (
    public var `cbSize`: UInt,
    public var `dwFlags`: `SERIALKEYS_FLAGS`,
    public var `lpszActivePort`: `windows_sys`.`core`.`PWSTR`,
    public var `lpszPort`: `windows_sys`.`core`.`PWSTR`,
    public var `iBaudRate`: UInt,
    public var `iPortState`: UInt,
    public var `iActive`: UInt,
)
// UNSUPPORTED Rust 836:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SERIALKEYSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SERIALKEYS_FLAGS` = UInt;
public const val `SERKF_AVAILABLE`: `SERIALKEYS_FLAGS` = 2u;
public const val `SERKF_INDICATOR`: `SERIALKEYS_FLAGS` = 4u;
public const val `SERKF_SERIALKEYSON`: `SERIALKEYS_FLAGS` = 1u;
// UNSUPPORTED Rust 845:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SID_ControlElementProvider: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf4791d68_e254_4ba3_9a53_26a5c5497946);

// UNSUPPORTED Rust 846:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SID_IsUIAutomationObject: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb96fdb85_7204_4724_842b_c7059dedb9d0);

public const val `SKF_AUDIBLEFEEDBACK`: `STICKYKEYS_FLAGS` = 64u;
public const val `SKF_AVAILABLE`: `STICKYKEYS_FLAGS` = 2u;
public const val `SKF_CONFIRMHOTKEY`: `STICKYKEYS_FLAGS` = 8u;
public const val `SKF_HOTKEYACTIVE`: `STICKYKEYS_FLAGS` = 4u;
public const val `SKF_HOTKEYSOUND`: `STICKYKEYS_FLAGS` = 16u;
public const val `SKF_INDICATOR`: `STICKYKEYS_FLAGS` = 32u;
public const val `SKF_LALTLATCHED`: `STICKYKEYS_FLAGS` = 268435456u;
public const val `SKF_LALTLOCKED`: `STICKYKEYS_FLAGS` = 1048576u;
public const val `SKF_LCTLLATCHED`: `STICKYKEYS_FLAGS` = 67108864u;
public const val `SKF_LCTLLOCKED`: `STICKYKEYS_FLAGS` = 262144u;
public const val `SKF_LSHIFTLATCHED`: `STICKYKEYS_FLAGS` = 16777216u;
public const val `SKF_LSHIFTLOCKED`: `STICKYKEYS_FLAGS` = 65536u;
public const val `SKF_LWINLATCHED`: `STICKYKEYS_FLAGS` = 1073741824u;
public const val `SKF_LWINLOCKED`: `STICKYKEYS_FLAGS` = 4194304u;
public const val `SKF_RALTLATCHED`: `STICKYKEYS_FLAGS` = 536870912u;
public const val `SKF_RALTLOCKED`: `STICKYKEYS_FLAGS` = 2097152u;
public const val `SKF_RCTLLATCHED`: `STICKYKEYS_FLAGS` = 134217728u;
public const val `SKF_RCTLLOCKED`: `STICKYKEYS_FLAGS` = 524288u;
public const val `SKF_RSHIFTLATCHED`: `STICKYKEYS_FLAGS` = 33554432u;
public const val `SKF_RSHIFTLOCKED`: `STICKYKEYS_FLAGS` = 131072u;
public const val `SKF_RWINLATCHED`: `STICKYKEYS_FLAGS` = 2147483648u;
public const val `SKF_RWINLOCKED`: `STICKYKEYS_FLAGS` = 8388608u;
public const val `SKF_STICKYKEYSON`: `STICKYKEYS_FLAGS` = 1u;
public const val `SKF_TRISTATE`: `STICKYKEYS_FLAGS` = 128u;
public const val `SKF_TWOKEYSOFF`: `STICKYKEYS_FLAGS` = 256u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SOUNDSENTRYA` (
    public var `cbSize`: UInt,
    public var `dwFlags`: `SOUNDSENTRY_FLAGS`,
    public var `iFSTextEffect`: `SOUNDSENTRY_TEXT_EFFECT`,
    public var `iFSTextEffectMSec`: UInt,
    public var `iFSTextEffectColorBits`: UInt,
    public var `iFSGrafEffect`: `SOUND_SENTRY_GRAPHICS_EFFECT`,
    public var `iFSGrafEffectMSec`: UInt,
    public var `iFSGrafEffectColor`: UInt,
    public var `iWindowsEffect`: `SOUNDSENTRY_WINDOWS_EFFECT`,
    public var `iWindowsEffectMSec`: UInt,
    public var `lpszWindowsEffectDLL`: `windows_sys`.`core`.`PSTR`,
    public var `iWindowsEffectOrdinal`: UInt,
)
// UNSUPPORTED Rust 888:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SOUNDSENTRYA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SOUNDSENTRYW` (
    public var `cbSize`: UInt,
    public var `dwFlags`: `SOUNDSENTRY_FLAGS`,
    public var `iFSTextEffect`: `SOUNDSENTRY_TEXT_EFFECT`,
    public var `iFSTextEffectMSec`: UInt,
    public var `iFSTextEffectColorBits`: UInt,
    public var `iFSGrafEffect`: `SOUND_SENTRY_GRAPHICS_EFFECT`,
    public var `iFSGrafEffectMSec`: UInt,
    public var `iFSGrafEffectColor`: UInt,
    public var `iWindowsEffect`: `SOUNDSENTRY_WINDOWS_EFFECT`,
    public var `iWindowsEffectMSec`: UInt,
    public var `lpszWindowsEffectDLL`: `windows_sys`.`core`.`PWSTR`,
    public var `iWindowsEffectOrdinal`: UInt,
)
// UNSUPPORTED Rust 909:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SOUNDSENTRYW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SOUNDSENTRY_FLAGS` = UInt;
public typealias `SOUNDSENTRY_TEXT_EFFECT` = UInt;
public typealias `SOUNDSENTRY_WINDOWS_EFFECT` = UInt;
public typealias `SOUND_SENTRY_GRAPHICS_EFFECT` = UInt;
public const val `SSF_AVAILABLE`: `SOUNDSENTRY_FLAGS` = 2u;
public const val `SSF_INDICATOR`: `SOUNDSENTRY_FLAGS` = 4u;
public const val `SSF_SOUNDSENTRYON`: `SOUNDSENTRY_FLAGS` = 1u;
public const val `SSGF_DISPLAY`: `SOUND_SENTRY_GRAPHICS_EFFECT` = 3u;
public const val `SSGF_NONE`: `SOUND_SENTRY_GRAPHICS_EFFECT` = 0u;
public const val `SSTF_BORDER`: `SOUNDSENTRY_TEXT_EFFECT` = 2u;
public const val `SSTF_CHARS`: `SOUNDSENTRY_TEXT_EFFECT` = 1u;
public const val `SSTF_DISPLAY`: `SOUNDSENTRY_TEXT_EFFECT` = 3u;
public const val `SSTF_NONE`: `SOUNDSENTRY_TEXT_EFFECT` = 0u;
public const val `SSWF_CUSTOM`: `SOUNDSENTRY_WINDOWS_EFFECT` = 4u;
public const val `SSWF_DISPLAY`: `SOUNDSENTRY_WINDOWS_EFFECT` = 3u;
public const val `SSWF_NONE`: `SOUNDSENTRY_WINDOWS_EFFECT` = 0u;
public const val `SSWF_TITLE`: `SOUNDSENTRY_WINDOWS_EFFECT` = 1u;
public const val `SSWF_WINDOW`: `SOUNDSENTRY_WINDOWS_EFFECT` = 2u;
public const val `STATE_SYSTEM_HASPOPUP`: UInt = 1073741824u;
public const val `STATE_SYSTEM_NORMAL`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STICKYKEYS` (
    public var `cbSize`: UInt,
    public var `dwFlags`: `STICKYKEYS_FLAGS`,
)
public typealias `STICKYKEYS_FLAGS` = UInt;
public typealias `SayAsInterpretAs` = Int;
public const val `SayAsInterpretAs_Address`: `SayAsInterpretAs` = 11;
public const val `SayAsInterpretAs_Alphanumeric`: `SayAsInterpretAs` = 12;
public const val `SayAsInterpretAs_Cardinal`: `SayAsInterpretAs` = 2;
public const val `SayAsInterpretAs_Currency`: `SayAsInterpretAs` = 8;
public const val `SayAsInterpretAs_Date`: `SayAsInterpretAs` = 5;
public const val `SayAsInterpretAs_Date_DayMonth`: `SayAsInterpretAs` = 20;
public const val `SayAsInterpretAs_Date_DayMonthYear`: `SayAsInterpretAs` = 16;
public const val `SayAsInterpretAs_Date_MonthDay`: `SayAsInterpretAs` = 21;
public const val `SayAsInterpretAs_Date_MonthDayYear`: `SayAsInterpretAs` = 15;
public const val `SayAsInterpretAs_Date_MonthYear`: `SayAsInterpretAs` = 19;
public const val `SayAsInterpretAs_Date_Year`: `SayAsInterpretAs` = 22;
public const val `SayAsInterpretAs_Date_YearMonth`: `SayAsInterpretAs` = 18;
public const val `SayAsInterpretAs_Date_YearMonthDay`: `SayAsInterpretAs` = 17;
public const val `SayAsInterpretAs_Media`: `SayAsInterpretAs` = 14;
public const val `SayAsInterpretAs_Name`: `SayAsInterpretAs` = 13;
public const val `SayAsInterpretAs_Net`: `SayAsInterpretAs` = 9;
public const val `SayAsInterpretAs_None`: `SayAsInterpretAs` = 0;
public const val `SayAsInterpretAs_Number`: `SayAsInterpretAs` = 4;
public const val `SayAsInterpretAs_Ordinal`: `SayAsInterpretAs` = 3;
public const val `SayAsInterpretAs_Spell`: `SayAsInterpretAs` = 1;
public const val `SayAsInterpretAs_Telephone`: `SayAsInterpretAs` = 7;
public const val `SayAsInterpretAs_Time`: `SayAsInterpretAs` = 6;
public const val `SayAsInterpretAs_Time_HoursMinutes12`: `SayAsInterpretAs` = 24;
public const val `SayAsInterpretAs_Time_HoursMinutes24`: `SayAsInterpretAs` = 26;
public const val `SayAsInterpretAs_Time_HoursMinutesSeconds12`: `SayAsInterpretAs` = 23;
public const val `SayAsInterpretAs_Time_HoursMinutesSeconds24`: `SayAsInterpretAs` = 25;
public const val `SayAsInterpretAs_Url`: `SayAsInterpretAs` = 10;
public typealias `ScrollAmount` = Int;
public const val `ScrollAmount_LargeDecrement`: `ScrollAmount` = 0;
public const val `ScrollAmount_LargeIncrement`: `ScrollAmount` = 3;
public const val `ScrollAmount_NoAmount`: `ScrollAmount` = 2;
public const val `ScrollAmount_SmallDecrement`: `ScrollAmount` = 1;
public const val `ScrollAmount_SmallIncrement`: `ScrollAmount` = 4;
// UNSUPPORTED Rust 975:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ScrollBar_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdaf34b36_5065_4946_b22f_92595fc0751a);

// UNSUPPORTED Rust 976:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ScrollItem_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4591d005_a803_4d5c_b4d5_8d2800f906a7);

// UNSUPPORTED Rust 977:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Scroll_HorizontalScrollPercent_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc7c13c0e_eb21_47ff_acc4_b5a3350f5191);

// UNSUPPORTED Rust 978:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Scroll_HorizontalViewSize_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x70c2e5d4_fcb0_4713_a9aa_af92ff79e4cd);

// UNSUPPORTED Rust 979:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Scroll_HorizontallyScrollable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8b925147_28cd_49ae_bd63_f44118d2e719);

// UNSUPPORTED Rust 980:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Scroll_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x895fa4b4_759d_4c50_8e15_03460672003c);

// UNSUPPORTED Rust 981:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Scroll_VerticalScrollPercent_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6c8d7099_b2a8_4948_bff7_3cf9058bfefb);

// UNSUPPORTED Rust 982:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Scroll_VerticalViewSize_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xde6a2e22_d8c7_40c5_83ba_e5f681d53108);

// UNSUPPORTED Rust 983:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Scroll_VerticallyScrollable_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x89164798_0068_4315_b89a_1e7cfbbc3dfc);

// UNSUPPORTED Rust 984:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Selection2_CurrentSelectedItem_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x34257c26_83b5_41a6_939c_ae841c136236);

// UNSUPPORTED Rust 985:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Selection2_FirstSelectedItem_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcc24ea67_369c_4e55_9ff7_38da69540c29);

// UNSUPPORTED Rust 986:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Selection2_ItemCount_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbb49eb9f_456d_4048_b591_9c2026b84636);

// UNSUPPORTED Rust 987:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Selection2_LastSelectedItem_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcf7bda90_2d83_49f8_860c_9ce394cf89b4);

// UNSUPPORTED Rust 988:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SelectionItem_ElementAddedToSelectionEvent_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3c822dd1_c407_4dba_91dd_79d4aed0aec6);

// UNSUPPORTED Rust 989:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SelectionItem_ElementRemovedFromSelectionEvent_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x097fa8a9_7079_41af_8b9c_0934d8305e5c);

// UNSUPPORTED Rust 990:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SelectionItem_ElementSelectedEvent_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb9c7dbfb_4ebe_4532_aaf4_008cf647233c);

// UNSUPPORTED Rust 991:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SelectionItem_IsSelected_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf122835f_cd5f_43df_b79d_4b849e9e6020);

// UNSUPPORTED Rust 992:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SelectionItem_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9bc64eeb_87c7_4b28_94bb_4d9fa437b6ef);

// UNSUPPORTED Rust 993:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SelectionItem_SelectionContainer_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa4365b6e_9c1e_4b63_8b53_c2421dd1e8fb);

// UNSUPPORTED Rust 994:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Selection_CanSelectMultiple_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x49d73da5_c883_4500_883d_8fcf8daf6cbe);

// UNSUPPORTED Rust 995:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Selection_InvalidatedEvent_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcac14904_16b4_4b53_8e47_4cb1df267bb7);

// UNSUPPORTED Rust 996:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Selection_IsSelectionRequired_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb1ae4422_63fe_44e7_a5a5_a738c829b19a);

// UNSUPPORTED Rust 997:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Selection_Pattern2_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfba25cab_ab98_49f7_a7dc_fe539dc15be7);

// UNSUPPORTED Rust 998:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Selection_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66e3b7e8_d821_4d25_8761_435d2c8b253f);

// UNSUPPORTED Rust 999:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Selection_Selection_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaa6dc2a2_0e2b_4d38_96d5_34e470b81853);

// UNSUPPORTED Rust 1000:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SemanticZoom_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5fd34a43_061e_42c8_b589_9dccf74bc43a);

// UNSUPPORTED Rust 1001:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Separator_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8767eba3_2a63_4ab0_ac8d_aa50e23de978);

// UNSUPPORTED Rust 1002:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SizeOfSet_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1600d33c_3b9f_4369_9431_aa293f344cf1);

// UNSUPPORTED Rust 1003:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Size_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2b5f761d_f885_4404_973f_9b1d98e36d8f);

// UNSUPPORTED Rust 1004:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Slider_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb033c24b_3b35_4cea_b609_763682fa660b);

// UNSUPPORTED Rust 1005:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Spinner_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x60cc4b38_3cb1_4161_b442_c6b726c17825);

// UNSUPPORTED Rust 1006:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SplitButton_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7011f01f_4ace_4901_b461_920a6f1ca650);

// UNSUPPORTED Rust 1007:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SpreadsheetItem_AnnotationObjects_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa3194c38_c9bc_4604_9396_ae3f9f457f7b);

// UNSUPPORTED Rust 1008:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SpreadsheetItem_AnnotationTypes_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc70c51d0_d602_4b45_afbc_b4712b96d72b);

// UNSUPPORTED Rust 1009:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SpreadsheetItem_Formula_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe602e47d_1b47_4bea_87cf_3b0b0b5c15b6);

// UNSUPPORTED Rust 1010:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SpreadsheetItem_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x32cf83ff_f1a8_4a8c_8658_d47ba74e20ba);

// UNSUPPORTED Rust 1011:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Spreadsheet_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6a5b24c9_9d1e_4b85_9e44_c02e3169b10b);

// UNSUPPORTED Rust 1012:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const StatusBar_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd45e7d1b_5873_475f_95a4_0433e1f1b00a);

public typealias `StructureChangeType` = Int;
public const val `StructureChangeType_ChildAdded`: `StructureChangeType` = 0;
public const val `StructureChangeType_ChildRemoved`: `StructureChangeType` = 1;
public const val `StructureChangeType_ChildrenBulkAdded`: `StructureChangeType` = 3;
public const val `StructureChangeType_ChildrenBulkRemoved`: `StructureChangeType` = 4;
public const val `StructureChangeType_ChildrenInvalidated`: `StructureChangeType` = 2;
public const val `StructureChangeType_ChildrenReordered`: `StructureChangeType` = 5;
// UNSUPPORTED Rust 1020:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const StructureChanged_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x59977961_3edd_4b11_b13b_676b2a2a6ca9);

// UNSUPPORTED Rust 1021:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const StructuredMarkup_CompositionComplete_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc48a3c17_677a_4047_a68d_fc1257528aef);

// UNSUPPORTED Rust 1022:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const StructuredMarkup_Deleted_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf9d0a020_e1c1_4ecf_b9aa_52efde7e41e1);

// UNSUPPORTED Rust 1023:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const StructuredMarkup_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xabbd0878_8665_4f5c_94fc_36e7d8bb706b);

// UNSUPPORTED Rust 1024:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const StructuredMarkup_SelectionChanged_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa7c815f7_ff9f_41c7_a3a7_ab6cbfdb4903);

public const val `StyleId_BulletedList`: `UIA_STYLE_ID` = 70015;
// UNSUPPORTED Rust 1026:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const StyleId_BulletedList_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5963ed64_6426_4632_8caf_a32ad402d91a);

public const val `StyleId_Custom`: `UIA_STYLE_ID` = 70000;
// UNSUPPORTED Rust 1028:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const StyleId_Custom_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xef2edd3e_a999_4b7c_a378_09bbd52a3516);

public const val `StyleId_Emphasis`: `UIA_STYLE_ID` = 70013;
// UNSUPPORTED Rust 1030:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const StyleId_Emphasis_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xca6e7dbe_355e_4820_95a0_925f041d3470);

public const val `StyleId_Heading1`: `UIA_STYLE_ID` = 70001;
// UNSUPPORTED Rust 1032:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const StyleId_Heading1_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7f7e8f69_6866_4621_930c_9a5d0ca5961c);

public const val `StyleId_Heading2`: `UIA_STYLE_ID` = 70002;
// UNSUPPORTED Rust 1034:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const StyleId_Heading2_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbaa9b241_5c69_469d_85ad_474737b52b14);

public const val `StyleId_Heading3`: `UIA_STYLE_ID` = 70003;
// UNSUPPORTED Rust 1036:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const StyleId_Heading3_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbf8be9d2_d8b8_4ec5_8c52_9cfb0d035970);

public const val `StyleId_Heading4`: `UIA_STYLE_ID` = 70004;
// UNSUPPORTED Rust 1038:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const StyleId_Heading4_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8436ffc0_9578_45fc_83a4_ff40053315dd);

public const val `StyleId_Heading5`: `UIA_STYLE_ID` = 70005;
// UNSUPPORTED Rust 1040:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const StyleId_Heading5_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x909f424d_0dbf_406e_97bb_4e773d9798f7);

public const val `StyleId_Heading6`: `UIA_STYLE_ID` = 70006;
// UNSUPPORTED Rust 1042:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const StyleId_Heading6_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x89d23459_5d5b_4824_a420_11d3ed82e40f);

public const val `StyleId_Heading7`: `UIA_STYLE_ID` = 70007;
// UNSUPPORTED Rust 1044:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const StyleId_Heading7_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa3790473_e9ae_422d_b8e3_3b675c6181a4);

public const val `StyleId_Heading8`: `UIA_STYLE_ID` = 70008;
// UNSUPPORTED Rust 1046:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const StyleId_Heading8_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2bc14145_a40c_4881_84ae_f2235685380c);

public const val `StyleId_Heading9`: `UIA_STYLE_ID` = 70009;
// UNSUPPORTED Rust 1048:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const StyleId_Heading9_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc70d9133_bb2a_43d3_8ac6_33657884b0f0);

public const val `StyleId_Normal`: `UIA_STYLE_ID` = 70012;
// UNSUPPORTED Rust 1050:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const StyleId_Normal_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcd14d429_e45e_4475_a1c5_7f9e6be96eba);

public const val `StyleId_NumberedList`: `UIA_STYLE_ID` = 70016;
// UNSUPPORTED Rust 1052:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const StyleId_NumberedList_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1e96dbd5_64c3_43d0_b1ee_b53b06e3eddf);

public const val `StyleId_Quote`: `UIA_STYLE_ID` = 70014;
// UNSUPPORTED Rust 1054:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const StyleId_Quote_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5d1c21ea_8195_4f6c_87ea_5dabece64c1d);

public const val `StyleId_Subtitle`: `UIA_STYLE_ID` = 70011;
// UNSUPPORTED Rust 1056:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const StyleId_Subtitle_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb5d9fc17_5d6f_4420_b439_7cb19ad434e2);

public const val `StyleId_Title`: `UIA_STYLE_ID` = 70010;
// UNSUPPORTED Rust 1058:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const StyleId_Title_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x15d8201a_ffcf_481f_b0a1_30b63be98f07);

// UNSUPPORTED Rust 1059:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Styles_ExtendedProperties_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf451cda0_ba0a_4681_b0b0_0dbdb53e58f3);

// UNSUPPORTED Rust 1060:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Styles_FillColor_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x63eff97a_a1c5_4b1d_84eb_b765f2edd632);

// UNSUPPORTED Rust 1061:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Styles_FillPatternColor_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x939a59fe_8fbd_4e75_a271_ac4595195163);

// UNSUPPORTED Rust 1062:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Styles_FillPatternStyle_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x81cf651f_482b_4451_a30a_e1545e554fb8);

// UNSUPPORTED Rust 1063:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Styles_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1ae62655_da72_4d60_a153_e5aa6988e3bf);

// UNSUPPORTED Rust 1064:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Styles_Shape_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc71a23f8_778c_400d_8458_3b543e526984);

// UNSUPPORTED Rust 1065:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Styles_StyleId_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xda82852f_3817_4233_82af_02279e72cc77);

// UNSUPPORTED Rust 1066:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Styles_StyleName_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1c12b035_05d1_4f55_9e8e_1489f3ff550d);

public typealias `SupportedTextSelection` = Int;
public const val `SupportedTextSelection_Multiple`: `SupportedTextSelection` = 2;
public const val `SupportedTextSelection_None`: `SupportedTextSelection` = 0;
public const val `SupportedTextSelection_Single`: `SupportedTextSelection` = 1;
public typealias `SynchronizedInputType` = Int;
public const val `SynchronizedInputType_KeyDown`: `SynchronizedInputType` = 2;
public const val `SynchronizedInputType_KeyUp`: `SynchronizedInputType` = 1;
public const val `SynchronizedInputType_LeftMouseDown`: `SynchronizedInputType` = 8;
public const val `SynchronizedInputType_LeftMouseUp`: `SynchronizedInputType` = 4;
public const val `SynchronizedInputType_RightMouseDown`: `SynchronizedInputType` = 32;
public const val `SynchronizedInputType_RightMouseUp`: `SynchronizedInputType` = 16;
// UNSUPPORTED Rust 1078:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SynchronizedInput_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x05c288a6_c47b_488b_b653_33977a551b8b);

// UNSUPPORTED Rust 1079:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SystemAlert_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd271545d_7a3a_47a7_8474_81d29a2451c9);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TOGGLEKEYS` (
    public var `cbSize`: UInt,
    public var `dwFlags`: UInt,
)
// UNSUPPORTED Rust 1086:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const TabItem_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2c6a634f_921b_4e6e_b26e_08fcb0798f4c);

// UNSUPPORTED Rust 1087:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Tab_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x38cd1f2d_337a_4bd2_a5e3_adb469e30bd3);

// UNSUPPORTED Rust 1088:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const TableItem_ColumnHeaderItems_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x967a56a3_74b6_431e_8de6_99c411031c58);

// UNSUPPORTED Rust 1089:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const TableItem_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdf1343bd_1888_4a29_a50c_b92e6de37f6f);

// UNSUPPORTED Rust 1090:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const TableItem_RowHeaderItems_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb3f853a0_0574_4cd8_bcd7_ed5923572d97);

// UNSUPPORTED Rust 1091:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Table_ColumnHeaders_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaff1d72b_968d_42b1_b459_150b299da664);

// UNSUPPORTED Rust 1092:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Table_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x773bfa0e_5bc4_4deb_921b_de7b3206229e);

// UNSUPPORTED Rust 1093:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Table_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc415218e_a028_461e_aa92_8f925cf79351);

// UNSUPPORTED Rust 1094:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Table_RowHeaders_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd9e35b87_6eb8_4562_aac6_a8a9075236a8);

// UNSUPPORTED Rust 1095:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Table_RowOrColumnMajor_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x83be75c3_29fe_4a30_85e1_2a6277fd106e);

// UNSUPPORTED Rust 1096:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const TextChild_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7533cab7_3bfe_41ef_9e85_e2638cbe169e);

public typealias `TextDecorationLineStyle` = Int;
public const val `TextDecorationLineStyle_Dash`: `TextDecorationLineStyle` = 5;
public const val `TextDecorationLineStyle_DashDot`: `TextDecorationLineStyle` = 6;
public const val `TextDecorationLineStyle_DashDotDot`: `TextDecorationLineStyle` = 7;
public const val `TextDecorationLineStyle_Dot`: `TextDecorationLineStyle` = 4;
public const val `TextDecorationLineStyle_Double`: `TextDecorationLineStyle` = 3;
public const val `TextDecorationLineStyle_DoubleWavy`: `TextDecorationLineStyle` = 11;
public const val `TextDecorationLineStyle_LongDash`: `TextDecorationLineStyle` = 13;
public const val `TextDecorationLineStyle_None`: `TextDecorationLineStyle` = 0;
public const val `TextDecorationLineStyle_Other`: `TextDecorationLineStyle` = -1;
public const val `TextDecorationLineStyle_Single`: `TextDecorationLineStyle` = 1;
public const val `TextDecorationLineStyle_ThickDash`: `TextDecorationLineStyle` = 14;
public const val `TextDecorationLineStyle_ThickDashDot`: `TextDecorationLineStyle` = 15;
public const val `TextDecorationLineStyle_ThickDashDotDot`: `TextDecorationLineStyle` = 16;
public const val `TextDecorationLineStyle_ThickDot`: `TextDecorationLineStyle` = 17;
public const val `TextDecorationLineStyle_ThickLongDash`: `TextDecorationLineStyle` = 18;
public const val `TextDecorationLineStyle_ThickSingle`: `TextDecorationLineStyle` = 9;
public const val `TextDecorationLineStyle_ThickWavy`: `TextDecorationLineStyle` = 12;
public const val `TextDecorationLineStyle_Wavy`: `TextDecorationLineStyle` = 8;
public const val `TextDecorationLineStyle_WordsOnly`: `TextDecorationLineStyle` = 2;
public typealias `TextEditChangeType` = Int;
public const val `TextEditChangeType_AutoComplete`: `TextEditChangeType` = 4;
public const val `TextEditChangeType_AutoCorrect`: `TextEditChangeType` = 1;
public const val `TextEditChangeType_Composition`: `TextEditChangeType` = 2;
public const val `TextEditChangeType_CompositionFinalized`: `TextEditChangeType` = 3;
public const val `TextEditChangeType_None`: `TextEditChangeType` = 0;
// UNSUPPORTED Rust 1123:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const TextEdit_ConversionTargetChanged_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3388c183_ed4f_4c8b_9baa_364d51d8847f);

// UNSUPPORTED Rust 1124:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const TextEdit_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x69f3ff89_5af9_4c75_9340_f2de292e4591);

// UNSUPPORTED Rust 1125:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const TextEdit_TextChanged_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x120b0308_ec22_4eb8_9c98_9867cda1b165);

public typealias `TextPatternRangeEndpoint` = Int;
public const val `TextPatternRangeEndpoint_End`: `TextPatternRangeEndpoint` = 1;
public const val `TextPatternRangeEndpoint_Start`: `TextPatternRangeEndpoint` = 0;
public typealias `TextUnit` = Int;
public const val `TextUnit_Character`: `TextUnit` = 0;
public const val `TextUnit_Document`: `TextUnit` = 6;
public const val `TextUnit_Format`: `TextUnit` = 1;
public const val `TextUnit_Line`: `TextUnit` = 3;
public const val `TextUnit_Page`: `TextUnit` = 5;
public const val `TextUnit_Paragraph`: `TextUnit` = 4;
public const val `TextUnit_Word`: `TextUnit` = 2;
// UNSUPPORTED Rust 1137:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_AfterParagraphSpacing_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x588cbb38_e62f_497c_b5d1_ccdf0ee823d8);

// UNSUPPORTED Rust 1138:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_AfterSpacing_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x588cbb38_e62f_497c_b5d1_ccdf0ee823d8);

// UNSUPPORTED Rust 1139:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_AnimationStyle_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x628209f0_7c9a_4d57_be64_1f1836571ff5);

// UNSUPPORTED Rust 1140:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_AnnotationObjects_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xff41cf68_e7ab_40b9_8c72_72a8ed94017d);

// UNSUPPORTED Rust 1141:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_AnnotationTypes_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xad2eb431_ee4e_4be1_a7ba_5559155a73ef);

// UNSUPPORTED Rust 1142:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_BackgroundColor_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfdc49a07_583d_4f17_ad27_77fc832a3c0b);

// UNSUPPORTED Rust 1143:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_BeforeParagraphSpacing_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbe7b0ab1_c822_4a24_85e9_c8f2650fc79c);

// UNSUPPORTED Rust 1144:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_BeforeSpacing_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbe7b0ab1_c822_4a24_85e9_c8f2650fc79c);

// UNSUPPORTED Rust 1145:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_BulletStyle_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc1097c90_d5c4_4237_9781_3bec8ba54e48);

// UNSUPPORTED Rust 1146:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_CapStyle_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfb059c50_92cc_49a5_ba8f_0aa872bba2f3);

// UNSUPPORTED Rust 1147:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_CaretBidiMode_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x929ee7a6_51d3_4715_96dc_b694fa24a168);

// UNSUPPORTED Rust 1148:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_CaretPosition_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb227b131_9889_4752_a91b_733efdc5c5a0);

// UNSUPPORTED Rust 1149:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xae9772dc_d331_4f09_be20_7e6dfaf07b0a);

// UNSUPPORTED Rust 1150:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_Culture_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc2025af9_a42d_4ced_a1fb_c6746315222e);

// UNSUPPORTED Rust 1151:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_FontName_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x64e63ba8_f2e5_476e_a477_1734feaaf726);

// UNSUPPORTED Rust 1152:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_FontSize_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdc5eeeff_0506_4673_93f2_377e4a8e01f1);

// UNSUPPORTED Rust 1153:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_FontWeight_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6fc02359_b316_4f5f_b401_f1ce55741853);

// UNSUPPORTED Rust 1154:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_ForegroundColor_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x72d1c95d_5e60_471a_96b1_6c1b3b77a436);

// UNSUPPORTED Rust 1155:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_HorizontalTextAlignment_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x04ea6161_fba3_477a_952a_bb326d026a5b);

// UNSUPPORTED Rust 1156:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_IndentationFirstLine_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x206f9ad5_c1d3_424a_8182_6da9a7f3d632);

// UNSUPPORTED Rust 1157:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_IndentationLeading_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5cf66bac_2d45_4a4b_b6c9_f7221d2815b0);

// UNSUPPORTED Rust 1158:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_IndentationTrailing_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x97ff6c0f_1ce4_408a_b67b_94d83eb69bf2);

// UNSUPPORTED Rust 1159:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_IsActive_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf5a4e533_e1b8_436b_935d_b57aa3f558c4);

// UNSUPPORTED Rust 1160:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_IsHidden_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x360182fb_bdd7_47f6_ab69_19e33f8a3344);

// UNSUPPORTED Rust 1161:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_IsItalic_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfce12a56_1336_4a34_9663_1bab47239320);

// UNSUPPORTED Rust 1162:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_IsReadOnly_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa738156b_ca3e_495e_9514_833c440feb11);

// UNSUPPORTED Rust 1163:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_IsSubscript_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf0ead858_8f53_413c_873f_1a7d7f5e0de4);

// UNSUPPORTED Rust 1164:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_IsSuperscript_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xda706ee4_b3aa_4645_a41f_cd25157dea76);

// UNSUPPORTED Rust 1165:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_LineSpacing_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x63ff70ae_d943_4b47_8ab7_a7a033d3214b);

// UNSUPPORTED Rust 1166:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_Link_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb38ef51d_9e8d_4e46_9144_56ebe177329b);

// UNSUPPORTED Rust 1167:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_MarginBottom_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7ee593c4_72b4_4cac_9271_3ed24b0e4d42);

// UNSUPPORTED Rust 1168:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_MarginLeading_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9e9242d0_5ed0_4900_8e8a_eecc03835afc);

// UNSUPPORTED Rust 1169:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_MarginTop_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x683d936f_c9b9_4a9a_b3d9_d20d33311e2a);

// UNSUPPORTED Rust 1170:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_MarginTrailing_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaf522f98_999d_40af_a5b2_0169d0342002);

// UNSUPPORTED Rust 1171:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_OutlineStyles_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5b675b27_db89_46fe_970c_614d523bb97d);

// UNSUPPORTED Rust 1172:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_OverlineColor_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x83ab383a_fd43_40da_ab3e_ecf8165cbb6d);

// UNSUPPORTED Rust 1173:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_OverlineStyle_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0a234d66_617e_427f_871d_e1ff1e0c213f);

// UNSUPPORTED Rust 1174:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_Pattern2_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x498479a2_5b22_448d_b6e4_647490860698);

// UNSUPPORTED Rust 1175:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8615f05d_7de5_44fd_a679_2ca4b46033a8);

// UNSUPPORTED Rust 1176:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_SayAsInterpretAs_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb38ad6ac_eee1_4b6e_88cc_014cefa93fcb);

// UNSUPPORTED Rust 1177:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_SelectionActiveEnd_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1f668cc3_9bbf_416b_b0a2_f89f86f6612c);

// UNSUPPORTED Rust 1178:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_StrikethroughColor_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbfe15a18_8c41_4c5a_9a0b_04af0e07f487);

// UNSUPPORTED Rust 1179:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_StrikethroughStyle_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x72913ef1_da00_4f01_899c_ac5a8577a307);

// UNSUPPORTED Rust 1180:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_StyleId_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x14c300de_c32b_449b_ab7c_b0e0789aea5d);

// UNSUPPORTED Rust 1181:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_StyleName_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x22c9e091_4d66_45d8_a828_737bab4c98a7);

// UNSUPPORTED Rust 1182:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_Tabs_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2e68d00b_92fe_42d8_899a_a784aa4454a1);

// UNSUPPORTED Rust 1183:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_TextChangedEvent_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4a342082_f483_48c4_ac11_a84b435e2a84);

// UNSUPPORTED Rust 1184:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_TextFlowDirections_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8bdf8739_f420_423e_af77_20a5d973a907);

// UNSUPPORTED Rust 1185:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_TextSelectionChangedEvent_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x918edaa1_71b3_49ae_9741_79beb8d358f3);

// UNSUPPORTED Rust 1186:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_UnderlineColor_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbfa12c73_fde2_4473_bf64_1036d6aa0f45);

// UNSUPPORTED Rust 1187:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Text_UnderlineStyle_Attribute_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5f3b21c0_ede4_44bd_9c36_3853038cbfeb);

// UNSUPPORTED Rust 1188:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Thumb_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x701ca877_e310_4dd6_b644_797e4faea213);

// UNSUPPORTED Rust 1189:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const TitleBar_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x98aa55bf_3bb0_4b65_836e_2ea30dbc171f);

public typealias `ToggleState` = Int;
public const val `ToggleState_Indeterminate`: `ToggleState` = 2;
public const val `ToggleState_Off`: `ToggleState` = 0;
public const val `ToggleState_On`: `ToggleState` = 1;
// UNSUPPORTED Rust 1194:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Toggle_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0b419760_e2f4_43ff_8c5f_9457c82b56e9);

// UNSUPPORTED Rust 1195:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Toggle_ToggleState_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb23cdc52_22c2_4c6c_9ded_f5c422479ede);

// UNSUPPORTED Rust 1196:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ToolBar_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8f06b751_e182_4e98_8893_2284543a7dce);

// UNSUPPORTED Rust 1197:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ToolTipClosed_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x276d71ef_24a9_49b6_8e97_da98b401bbcd);

// UNSUPPORTED Rust 1198:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ToolTipOpened_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3f4b97ff_2edc_451d_bca4_95a3188d5b03);

// UNSUPPORTED Rust 1199:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ToolTip_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x05ddc6d1_2137_4768_98ea_73f52f7134f3);

// UNSUPPORTED Rust 1200:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Tranform_Pattern2_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8afcfd07_a369_44de_988b_2f7ff49fb8a8);

// UNSUPPORTED Rust 1201:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Transform2_CanZoom_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf357e890_a756_4359_9ca6_86702bf8f381);

// UNSUPPORTED Rust 1202:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Transform2_ZoomLevel_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeee29f1a_f4a2_4b5b_ac65_95cf93283387);

// UNSUPPORTED Rust 1203:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Transform2_ZoomMaximum_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x42ab6b77_ceb0_4eca_b82a_6cfa5fa1fc08);

// UNSUPPORTED Rust 1204:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Transform2_ZoomMinimum_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x742ccc16_4ad1_4e07_96fe_b122c6e6b22b);

// UNSUPPORTED Rust 1205:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Transform_CanMove_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1b75824d_208b_4fdf_bccd_f1f4e5741f4f);

// UNSUPPORTED Rust 1206:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Transform_CanResize_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbb98dca5_4c1a_41d4_a4f6_ebc128644180);

// UNSUPPORTED Rust 1207:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Transform_CanRotate_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x10079b48_3849_476f_ac96_44a95c8440d9);

// UNSUPPORTED Rust 1208:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Transform_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x24b46fdb_587e_49f1_9c4a_d8e98b664b7b);

// UNSUPPORTED Rust 1209:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const TreeItem_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x62c9feb9_8ffc_4878_a3a4_96b030315c18);

public typealias `TreeScope` = Int;
public const val `TreeScope_Ancestors`: `TreeScope` = 16;
public const val `TreeScope_Children`: `TreeScope` = 2;
public const val `TreeScope_Descendants`: `TreeScope` = 4;
public const val `TreeScope_Element`: `TreeScope` = 1;
public const val `TreeScope_None`: `TreeScope` = 0;
public const val `TreeScope_Parent`: `TreeScope` = 8;
public const val `TreeScope_Subtree`: `TreeScope` = 7;
public typealias `TreeTraversalOptions` = Int;
public const val `TreeTraversalOptions_Default`: `TreeTraversalOptions` = 0;
public const val `TreeTraversalOptions_LastToFirstOrder`: `TreeTraversalOptions` = 2;
public const val `TreeTraversalOptions_PostOrder`: `TreeTraversalOptions` = 1;
// UNSUPPORTED Rust 1222:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Tree_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7561349c_d241_43f4_9908_b5f091bee611);

public typealias `UIA_ANNOTATIONTYPE` = Int;
public const val `UIA_AcceleratorKeyPropertyId`: `UIA_PROPERTY_ID` = 30006;
public const val `UIA_AccessKeyPropertyId`: `UIA_PROPERTY_ID` = 30007;
public const val `UIA_ActiveTextPositionChangedEventId`: `UIA_EVENT_ID` = 20036;
public const val `UIA_AfterParagraphSpacingAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40042;
public const val `UIA_AnimationStyleAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40000;
public const val `UIA_AnnotationAnnotationTypeIdPropertyId`: `UIA_PROPERTY_ID` = 30113;
public const val `UIA_AnnotationAnnotationTypeNamePropertyId`: `UIA_PROPERTY_ID` = 30114;
public const val `UIA_AnnotationAuthorPropertyId`: `UIA_PROPERTY_ID` = 30115;
public const val `UIA_AnnotationDateTimePropertyId`: `UIA_PROPERTY_ID` = 30116;
public const val `UIA_AnnotationObjectsAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40032;
public const val `UIA_AnnotationObjectsPropertyId`: `UIA_PROPERTY_ID` = 30156;
public const val `UIA_AnnotationPatternId`: `UIA_PATTERN_ID` = 10023;
public const val `UIA_AnnotationTargetPropertyId`: `UIA_PROPERTY_ID` = 30117;
public const val `UIA_AnnotationTypesAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40031;
public const val `UIA_AnnotationTypesPropertyId`: `UIA_PROPERTY_ID` = 30155;
public const val `UIA_AppBarControlTypeId`: `UIA_CONTROLTYPE_ID` = 50040;
public const val `UIA_AriaPropertiesPropertyId`: `UIA_PROPERTY_ID` = 30102;
public const val `UIA_AriaRolePropertyId`: `UIA_PROPERTY_ID` = 30101;
public const val `UIA_AsyncContentLoadedEventId`: `UIA_EVENT_ID` = 20006;
public const val `UIA_AutomationFocusChangedEventId`: `UIA_EVENT_ID` = 20005;
public const val `UIA_AutomationIdPropertyId`: `UIA_PROPERTY_ID` = 30011;
public const val `UIA_AutomationPropertyChangedEventId`: `UIA_EVENT_ID` = 20004;
public const val `UIA_BackgroundColorAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40001;
public const val `UIA_BeforeParagraphSpacingAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40041;
public const val `UIA_BoundingRectanglePropertyId`: `UIA_PROPERTY_ID` = 30001;
public const val `UIA_BulletStyleAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40002;
public const val `UIA_ButtonControlTypeId`: `UIA_CONTROLTYPE_ID` = 50000;
public typealias `UIA_CHANGE_ID` = Int;
public typealias `UIA_CONTROLTYPE_ID` = Int;
public const val `UIA_CalendarControlTypeId`: `UIA_CONTROLTYPE_ID` = 50001;
public const val `UIA_CapStyleAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40003;
public const val `UIA_CaretBidiModeAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40039;
public const val `UIA_CaretPositionAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40038;
public const val `UIA_CenterPointPropertyId`: `UIA_PROPERTY_ID` = 30165;
public const val `UIA_ChangesEventId`: `UIA_EVENT_ID` = 20034;
public const val `UIA_CheckBoxControlTypeId`: `UIA_CONTROLTYPE_ID` = 50002;
public const val `UIA_ClassNamePropertyId`: `UIA_PROPERTY_ID` = 30012;
public const val `UIA_ClickablePointPropertyId`: `UIA_PROPERTY_ID` = 30014;
public const val `UIA_ComboBoxControlTypeId`: `UIA_CONTROLTYPE_ID` = 50003;
public const val `UIA_ControlTypePropertyId`: `UIA_PROPERTY_ID` = 30003;
public const val `UIA_ControllerForPropertyId`: `UIA_PROPERTY_ID` = 30104;
public const val `UIA_CultureAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40004;
public const val `UIA_CulturePropertyId`: `UIA_PROPERTY_ID` = 30015;
public const val `UIA_CustomControlTypeId`: `UIA_CONTROLTYPE_ID` = 50025;
public const val `UIA_CustomLandmarkTypeId`: `UIA_LANDMARKTYPE_ID` = 80000;
public const val `UIA_CustomNavigationPatternId`: `UIA_PATTERN_ID` = 10033;
public const val `UIA_DataGridControlTypeId`: `UIA_CONTROLTYPE_ID` = 50028;
public const val `UIA_DataItemControlTypeId`: `UIA_CONTROLTYPE_ID` = 50029;
public const val `UIA_DescribedByPropertyId`: `UIA_PROPERTY_ID` = 30105;
public const val `UIA_DockDockPositionPropertyId`: `UIA_PROPERTY_ID` = 30069;
public const val `UIA_DockPatternId`: `UIA_PATTERN_ID` = 10011;
public const val `UIA_DocumentControlTypeId`: `UIA_CONTROLTYPE_ID` = 50030;
public const val `UIA_DragDropEffectPropertyId`: `UIA_PROPERTY_ID` = 30139;
public const val `UIA_DragDropEffectsPropertyId`: `UIA_PROPERTY_ID` = 30140;
public const val `UIA_DragGrabbedItemsPropertyId`: `UIA_PROPERTY_ID` = 30144;
public const val `UIA_DragIsGrabbedPropertyId`: `UIA_PROPERTY_ID` = 30138;
public const val `UIA_DragPatternId`: `UIA_PATTERN_ID` = 10030;
public const val `UIA_Drag_DragCancelEventId`: `UIA_EVENT_ID` = 20027;
public const val `UIA_Drag_DragCompleteEventId`: `UIA_EVENT_ID` = 20028;
public const val `UIA_Drag_DragStartEventId`: `UIA_EVENT_ID` = 20026;
public const val `UIA_DropTargetDropTargetEffectPropertyId`: `UIA_PROPERTY_ID` = 30142;
public const val `UIA_DropTargetDropTargetEffectsPropertyId`: `UIA_PROPERTY_ID` = 30143;
public const val `UIA_DropTargetPatternId`: `UIA_PATTERN_ID` = 10031;
public const val `UIA_DropTarget_DragEnterEventId`: `UIA_EVENT_ID` = 20029;
public const val `UIA_DropTarget_DragLeaveEventId`: `UIA_EVENT_ID` = 20030;
public const val `UIA_DropTarget_DroppedEventId`: `UIA_EVENT_ID` = 20031;
public typealias `UIA_EVENT_ID` = Int;
public const val `UIA_E_ELEMENTNOTAVAILABLE`: UInt = 2147746305u;
public const val `UIA_E_ELEMENTNOTENABLED`: UInt = 2147746304u;
public const val `UIA_E_INVALIDOPERATION`: UInt = 2148734217u;
public const val `UIA_E_NOCLICKABLEPOINT`: UInt = 2147746306u;
public const val `UIA_E_NOTSUPPORTED`: UInt = 2147746308u;
public const val `UIA_E_PROXYASSEMBLYNOTLOADED`: UInt = 2147746307u;
public const val `UIA_E_TIMEOUT`: UInt = 2148734213u;
public const val `UIA_EditControlTypeId`: `UIA_CONTROLTYPE_ID` = 50004;
public const val `UIA_ExpandCollapseExpandCollapseStatePropertyId`: `UIA_PROPERTY_ID` = 30070;
public const val `UIA_ExpandCollapsePatternId`: `UIA_PATTERN_ID` = 10005;
public const val `UIA_FillColorPropertyId`: `UIA_PROPERTY_ID` = 30160;
public const val `UIA_FillTypePropertyId`: `UIA_PROPERTY_ID` = 30162;
public const val `UIA_FlowsFromPropertyId`: `UIA_PROPERTY_ID` = 30148;
public const val `UIA_FlowsToPropertyId`: `UIA_PROPERTY_ID` = 30106;
public const val `UIA_FontNameAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40005;
public const val `UIA_FontSizeAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40006;
public const val `UIA_FontWeightAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40007;
public const val `UIA_ForegroundColorAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40008;
public const val `UIA_FormLandmarkTypeId`: `UIA_LANDMARKTYPE_ID` = 80001;
public const val `UIA_FrameworkIdPropertyId`: `UIA_PROPERTY_ID` = 30024;
public const val `UIA_FullDescriptionPropertyId`: `UIA_PROPERTY_ID` = 30159;
public const val `UIA_GridColumnCountPropertyId`: `UIA_PROPERTY_ID` = 30063;
public const val `UIA_GridItemColumnPropertyId`: `UIA_PROPERTY_ID` = 30065;
public const val `UIA_GridItemColumnSpanPropertyId`: `UIA_PROPERTY_ID` = 30067;
public const val `UIA_GridItemContainingGridPropertyId`: `UIA_PROPERTY_ID` = 30068;
public const val `UIA_GridItemPatternId`: `UIA_PATTERN_ID` = 10007;
public const val `UIA_GridItemRowPropertyId`: `UIA_PROPERTY_ID` = 30064;
public const val `UIA_GridItemRowSpanPropertyId`: `UIA_PROPERTY_ID` = 30066;
public const val `UIA_GridPatternId`: `UIA_PATTERN_ID` = 10006;
public const val `UIA_GridRowCountPropertyId`: `UIA_PROPERTY_ID` = 30062;
public const val `UIA_GroupControlTypeId`: `UIA_CONTROLTYPE_ID` = 50026;
public typealias `UIA_HEADINGLEVEL_ID` = Int;
public const val `UIA_HasKeyboardFocusPropertyId`: `UIA_PROPERTY_ID` = 30008;
public const val `UIA_HeaderControlTypeId`: `UIA_CONTROLTYPE_ID` = 50034;
public const val `UIA_HeaderItemControlTypeId`: `UIA_CONTROLTYPE_ID` = 50035;
public const val `UIA_HeadingLevelPropertyId`: `UIA_PROPERTY_ID` = 30173;
public const val `UIA_HelpTextPropertyId`: `UIA_PROPERTY_ID` = 30013;
public const val `UIA_HorizontalTextAlignmentAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40009;
public const val `UIA_HostedFragmentRootsInvalidatedEventId`: `UIA_EVENT_ID` = 20025;
public const val `UIA_HyperlinkControlTypeId`: `UIA_CONTROLTYPE_ID` = 50005;
public const val `UIA_IAFP_DEFAULT`: UInt = 0u;
public const val `UIA_IAFP_UNWRAP_BRIDGE`: UInt = 1u;
public const val `UIA_ImageControlTypeId`: `UIA_CONTROLTYPE_ID` = 50006;
public const val `UIA_IndentationFirstLineAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40010;
public const val `UIA_IndentationLeadingAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40011;
public const val `UIA_IndentationTrailingAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40012;
public const val `UIA_InputDiscardedEventId`: `UIA_EVENT_ID` = 20022;
public const val `UIA_InputReachedOtherElementEventId`: `UIA_EVENT_ID` = 20021;
public const val `UIA_InputReachedTargetEventId`: `UIA_EVENT_ID` = 20020;
public const val `UIA_InvokePatternId`: `UIA_PATTERN_ID` = 10000;
public const val `UIA_Invoke_InvokedEventId`: `UIA_EVENT_ID` = 20009;
public const val `UIA_IsActiveAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40036;
public const val `UIA_IsAnnotationPatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30118;
public const val `UIA_IsContentElementPropertyId`: `UIA_PROPERTY_ID` = 30017;
public const val `UIA_IsControlElementPropertyId`: `UIA_PROPERTY_ID` = 30016;
public const val `UIA_IsCustomNavigationPatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30151;
public const val `UIA_IsDataValidForFormPropertyId`: `UIA_PROPERTY_ID` = 30103;
public const val `UIA_IsDialogPropertyId`: `UIA_PROPERTY_ID` = 30174;
public const val `UIA_IsDockPatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30027;
public const val `UIA_IsDragPatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30137;
public const val `UIA_IsDropTargetPatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30141;
public const val `UIA_IsEnabledPropertyId`: `UIA_PROPERTY_ID` = 30010;
public const val `UIA_IsExpandCollapsePatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30028;
public const val `UIA_IsGridItemPatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30029;
public const val `UIA_IsGridPatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30030;
public const val `UIA_IsHiddenAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40013;
public const val `UIA_IsInvokePatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30031;
public const val `UIA_IsItalicAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40014;
public const val `UIA_IsItemContainerPatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30108;
public const val `UIA_IsKeyboardFocusablePropertyId`: `UIA_PROPERTY_ID` = 30009;
public const val `UIA_IsLegacyIAccessiblePatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30090;
public const val `UIA_IsMultipleViewPatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30032;
public const val `UIA_IsObjectModelPatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30112;
public const val `UIA_IsOffscreenPropertyId`: `UIA_PROPERTY_ID` = 30022;
public const val `UIA_IsPasswordPropertyId`: `UIA_PROPERTY_ID` = 30019;
public const val `UIA_IsPeripheralPropertyId`: `UIA_PROPERTY_ID` = 30150;
public const val `UIA_IsRangeValuePatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30033;
public const val `UIA_IsReadOnlyAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40015;
public const val `UIA_IsRequiredForFormPropertyId`: `UIA_PROPERTY_ID` = 30025;
public const val `UIA_IsScrollItemPatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30035;
public const val `UIA_IsScrollPatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30034;
public const val `UIA_IsSelectionItemPatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30036;
public const val `UIA_IsSelectionPattern2AvailablePropertyId`: `UIA_PROPERTY_ID` = 30168;
public const val `UIA_IsSelectionPatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30037;
public const val `UIA_IsSpreadsheetItemPatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30132;
public const val `UIA_IsSpreadsheetPatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30128;
public const val `UIA_IsStylesPatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30127;
public const val `UIA_IsSubscriptAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40016;
public const val `UIA_IsSuperscriptAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40017;
public const val `UIA_IsSynchronizedInputPatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30110;
public const val `UIA_IsTableItemPatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30039;
public const val `UIA_IsTablePatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30038;
public const val `UIA_IsTextChildPatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30136;
public const val `UIA_IsTextEditPatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30149;
public const val `UIA_IsTextPattern2AvailablePropertyId`: `UIA_PROPERTY_ID` = 30119;
public const val `UIA_IsTextPatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30040;
public const val `UIA_IsTogglePatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30041;
public const val `UIA_IsTransformPattern2AvailablePropertyId`: `UIA_PROPERTY_ID` = 30134;
public const val `UIA_IsTransformPatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30042;
public const val `UIA_IsValuePatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30043;
public const val `UIA_IsVirtualizedItemPatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30109;
public const val `UIA_IsWindowPatternAvailablePropertyId`: `UIA_PROPERTY_ID` = 30044;
public const val `UIA_ItemContainerPatternId`: `UIA_PATTERN_ID` = 10019;
public const val `UIA_ItemStatusPropertyId`: `UIA_PROPERTY_ID` = 30026;
public const val `UIA_ItemTypePropertyId`: `UIA_PROPERTY_ID` = 30021;
public typealias `UIA_LANDMARKTYPE_ID` = Int;
public const val `UIA_LabeledByPropertyId`: `UIA_PROPERTY_ID` = 30018;
public const val `UIA_LandmarkTypePropertyId`: `UIA_PROPERTY_ID` = 30157;
public const val `UIA_LayoutInvalidatedEventId`: `UIA_EVENT_ID` = 20008;
public const val `UIA_LegacyIAccessibleChildIdPropertyId`: `UIA_PROPERTY_ID` = 30091;
public const val `UIA_LegacyIAccessibleDefaultActionPropertyId`: `UIA_PROPERTY_ID` = 30100;
public const val `UIA_LegacyIAccessibleDescriptionPropertyId`: `UIA_PROPERTY_ID` = 30094;
public const val `UIA_LegacyIAccessibleHelpPropertyId`: `UIA_PROPERTY_ID` = 30097;
public const val `UIA_LegacyIAccessibleKeyboardShortcutPropertyId`: `UIA_PROPERTY_ID` = 30098;
public const val `UIA_LegacyIAccessibleNamePropertyId`: `UIA_PROPERTY_ID` = 30092;
public const val `UIA_LegacyIAccessiblePatternId`: `UIA_PATTERN_ID` = 10018;
public const val `UIA_LegacyIAccessibleRolePropertyId`: `UIA_PROPERTY_ID` = 30095;
public const val `UIA_LegacyIAccessibleSelectionPropertyId`: `UIA_PROPERTY_ID` = 30099;
public const val `UIA_LegacyIAccessibleStatePropertyId`: `UIA_PROPERTY_ID` = 30096;
public const val `UIA_LegacyIAccessibleValuePropertyId`: `UIA_PROPERTY_ID` = 30093;
public const val `UIA_LevelPropertyId`: `UIA_PROPERTY_ID` = 30154;
public const val `UIA_LineSpacingAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40040;
public const val `UIA_LinkAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40035;
public const val `UIA_ListControlTypeId`: `UIA_CONTROLTYPE_ID` = 50008;
public const val `UIA_ListItemControlTypeId`: `UIA_CONTROLTYPE_ID` = 50007;
public const val `UIA_LiveRegionChangedEventId`: `UIA_EVENT_ID` = 20024;
public const val `UIA_LiveSettingPropertyId`: `UIA_PROPERTY_ID` = 30135;
public const val `UIA_LocalizedControlTypePropertyId`: `UIA_PROPERTY_ID` = 30004;
public const val `UIA_LocalizedLandmarkTypePropertyId`: `UIA_PROPERTY_ID` = 30158;
public typealias `UIA_METADATA_ID` = Int;
public const val `UIA_MainLandmarkTypeId`: `UIA_LANDMARKTYPE_ID` = 80002;
public const val `UIA_MarginBottomAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40018;
public const val `UIA_MarginLeadingAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40019;
public const val `UIA_MarginTopAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40020;
public const val `UIA_MarginTrailingAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40021;
public const val `UIA_MenuBarControlTypeId`: `UIA_CONTROLTYPE_ID` = 50010;
public const val `UIA_MenuClosedEventId`: `UIA_EVENT_ID` = 20007;
public const val `UIA_MenuControlTypeId`: `UIA_CONTROLTYPE_ID` = 50009;
public const val `UIA_MenuItemControlTypeId`: `UIA_CONTROLTYPE_ID` = 50011;
public const val `UIA_MenuModeEndEventId`: `UIA_EVENT_ID` = 20019;
public const val `UIA_MenuModeStartEventId`: `UIA_EVENT_ID` = 20018;
public const val `UIA_MenuOpenedEventId`: `UIA_EVENT_ID` = 20003;
public const val `UIA_MultipleViewCurrentViewPropertyId`: `UIA_PROPERTY_ID` = 30071;
public const val `UIA_MultipleViewPatternId`: `UIA_PATTERN_ID` = 10008;
public const val `UIA_MultipleViewSupportedViewsPropertyId`: `UIA_PROPERTY_ID` = 30072;
public const val `UIA_NamePropertyId`: `UIA_PROPERTY_ID` = 30005;
public const val `UIA_NativeWindowHandlePropertyId`: `UIA_PROPERTY_ID` = 30020;
public const val `UIA_NavigationLandmarkTypeId`: `UIA_LANDMARKTYPE_ID` = 80003;
public const val `UIA_NotificationEventId`: `UIA_EVENT_ID` = 20035;
public const val `UIA_ObjectModelPatternId`: `UIA_PATTERN_ID` = 10022;
public const val `UIA_OptimizeForVisualContentPropertyId`: `UIA_PROPERTY_ID` = 30111;
public const val `UIA_OrientationPropertyId`: `UIA_PROPERTY_ID` = 30023;
public const val `UIA_OutlineColorPropertyId`: `UIA_PROPERTY_ID` = 30161;
public const val `UIA_OutlineStylesAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40022;
public const val `UIA_OutlineThicknessPropertyId`: `UIA_PROPERTY_ID` = 30164;
public const val `UIA_OverlineColorAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40023;
public const val `UIA_OverlineStyleAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40024;
public typealias `UIA_PATTERN_ID` = Int;
public const val `UIA_PFIA_DEFAULT`: UInt = 0u;
public const val `UIA_PFIA_UNWRAP_BRIDGE`: UInt = 1u;
public typealias `UIA_PROPERTY_ID` = Int;
public const val `UIA_PaneControlTypeId`: `UIA_CONTROLTYPE_ID` = 50033;
public const val `UIA_PositionInSetPropertyId`: `UIA_PROPERTY_ID` = 30152;
public const val `UIA_ProcessIdPropertyId`: `UIA_PROPERTY_ID` = 30002;
public const val `UIA_ProgressBarControlTypeId`: `UIA_CONTROLTYPE_ID` = 50012;
public const val `UIA_ProviderDescriptionPropertyId`: `UIA_PROPERTY_ID` = 30107;
public const val `UIA_RadioButtonControlTypeId`: `UIA_CONTROLTYPE_ID` = 50013;
public const val `UIA_RangeValueIsReadOnlyPropertyId`: `UIA_PROPERTY_ID` = 30048;
public const val `UIA_RangeValueLargeChangePropertyId`: `UIA_PROPERTY_ID` = 30051;
public const val `UIA_RangeValueMaximumPropertyId`: `UIA_PROPERTY_ID` = 30050;
public const val `UIA_RangeValueMinimumPropertyId`: `UIA_PROPERTY_ID` = 30049;
public const val `UIA_RangeValuePatternId`: `UIA_PATTERN_ID` = 10003;
public const val `UIA_RangeValueSmallChangePropertyId`: `UIA_PROPERTY_ID` = 30052;
public const val `UIA_RangeValueValuePropertyId`: `UIA_PROPERTY_ID` = 30047;
public const val `UIA_RotationPropertyId`: `UIA_PROPERTY_ID` = 30166;
public const val `UIA_RuntimeIdPropertyId`: `UIA_PROPERTY_ID` = 30000;
public typealias `UIA_STYLE_ID` = Int;
public const val `UIA_SayAsInterpretAsAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40043;
public const val `UIA_SayAsInterpretAsMetadataId`: `UIA_METADATA_ID` = 100000;
public const val `UIA_ScrollBarControlTypeId`: `UIA_CONTROLTYPE_ID` = 50014;
public const val `UIA_ScrollHorizontalScrollPercentPropertyId`: `UIA_PROPERTY_ID` = 30053;
public const val `UIA_ScrollHorizontalViewSizePropertyId`: `UIA_PROPERTY_ID` = 30054;
public const val `UIA_ScrollHorizontallyScrollablePropertyId`: `UIA_PROPERTY_ID` = 30057;
public const val `UIA_ScrollItemPatternId`: `UIA_PATTERN_ID` = 10017;
public const val `UIA_ScrollPatternId`: `UIA_PATTERN_ID` = 10004;
// UNSUPPORTED Rust 1476:1: unresolved scalar type f64; syntax: no per-file syntax rule for Const
// pub const UIA_ScrollPatternNoScroll: f64 = -1f64;

public const val `UIA_ScrollVerticalScrollPercentPropertyId`: `UIA_PROPERTY_ID` = 30055;
public const val `UIA_ScrollVerticalViewSizePropertyId`: `UIA_PROPERTY_ID` = 30056;
public const val `UIA_ScrollVerticallyScrollablePropertyId`: `UIA_PROPERTY_ID` = 30058;
public const val `UIA_SearchLandmarkTypeId`: `UIA_LANDMARKTYPE_ID` = 80004;
public const val `UIA_Selection2CurrentSelectedItemPropertyId`: `UIA_PROPERTY_ID` = 30171;
public const val `UIA_Selection2FirstSelectedItemPropertyId`: `UIA_PROPERTY_ID` = 30169;
public const val `UIA_Selection2ItemCountPropertyId`: `UIA_PROPERTY_ID` = 30172;
public const val `UIA_Selection2LastSelectedItemPropertyId`: `UIA_PROPERTY_ID` = 30170;
public const val `UIA_SelectionActiveEndAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40037;
public const val `UIA_SelectionCanSelectMultiplePropertyId`: `UIA_PROPERTY_ID` = 30060;
public const val `UIA_SelectionIsSelectionRequiredPropertyId`: `UIA_PROPERTY_ID` = 30061;
public const val `UIA_SelectionItemIsSelectedPropertyId`: `UIA_PROPERTY_ID` = 30079;
public const val `UIA_SelectionItemPatternId`: `UIA_PATTERN_ID` = 10010;
public const val `UIA_SelectionItemSelectionContainerPropertyId`: `UIA_PROPERTY_ID` = 30080;
public const val `UIA_SelectionItem_ElementAddedToSelectionEventId`: `UIA_EVENT_ID` = 20010;
public const val `UIA_SelectionItem_ElementRemovedFromSelectionEventId`: `UIA_EVENT_ID` = 20011;
public const val `UIA_SelectionItem_ElementSelectedEventId`: `UIA_EVENT_ID` = 20012;
public const val `UIA_SelectionPattern2Id`: `UIA_PATTERN_ID` = 10034;
public const val `UIA_SelectionPatternId`: `UIA_PATTERN_ID` = 10001;
public const val `UIA_SelectionSelectionPropertyId`: `UIA_PROPERTY_ID` = 30059;
public const val `UIA_Selection_InvalidatedEventId`: `UIA_EVENT_ID` = 20013;
public const val `UIA_SemanticZoomControlTypeId`: `UIA_CONTROLTYPE_ID` = 50039;
public const val `UIA_SeparatorControlTypeId`: `UIA_CONTROLTYPE_ID` = 50038;
public const val `UIA_SizeOfSetPropertyId`: `UIA_PROPERTY_ID` = 30153;
public const val `UIA_SizePropertyId`: `UIA_PROPERTY_ID` = 30167;
public const val `UIA_SliderControlTypeId`: `UIA_CONTROLTYPE_ID` = 50015;
public const val `UIA_SpinnerControlTypeId`: `UIA_CONTROLTYPE_ID` = 50016;
public const val `UIA_SplitButtonControlTypeId`: `UIA_CONTROLTYPE_ID` = 50031;
public const val `UIA_SpreadsheetItemAnnotationObjectsPropertyId`: `UIA_PROPERTY_ID` = 30130;
public const val `UIA_SpreadsheetItemAnnotationTypesPropertyId`: `UIA_PROPERTY_ID` = 30131;
public const val `UIA_SpreadsheetItemFormulaPropertyId`: `UIA_PROPERTY_ID` = 30129;
public const val `UIA_SpreadsheetItemPatternId`: `UIA_PATTERN_ID` = 10027;
public const val `UIA_SpreadsheetPatternId`: `UIA_PATTERN_ID` = 10026;
public const val `UIA_StatusBarControlTypeId`: `UIA_CONTROLTYPE_ID` = 50017;
public const val `UIA_StrikethroughColorAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40025;
public const val `UIA_StrikethroughStyleAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40026;
public const val `UIA_StructureChangedEventId`: `UIA_EVENT_ID` = 20002;
public const val `UIA_StyleIdAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40034;
public const val `UIA_StyleNameAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40033;
public const val `UIA_StylesExtendedPropertiesPropertyId`: `UIA_PROPERTY_ID` = 30126;
public const val `UIA_StylesFillColorPropertyId`: `UIA_PROPERTY_ID` = 30122;
public const val `UIA_StylesFillPatternColorPropertyId`: `UIA_PROPERTY_ID` = 30125;
public const val `UIA_StylesFillPatternStylePropertyId`: `UIA_PROPERTY_ID` = 30123;
public const val `UIA_StylesPatternId`: `UIA_PATTERN_ID` = 10025;
public const val `UIA_StylesShapePropertyId`: `UIA_PROPERTY_ID` = 30124;
public const val `UIA_StylesStyleIdPropertyId`: `UIA_PROPERTY_ID` = 30120;
public const val `UIA_StylesStyleNamePropertyId`: `UIA_PROPERTY_ID` = 30121;
public const val `UIA_SummaryChangeId`: `UIA_CHANGE_ID` = 90000;
public const val `UIA_SynchronizedInputPatternId`: `UIA_PATTERN_ID` = 10021;
public const val `UIA_SystemAlertEventId`: `UIA_EVENT_ID` = 20023;
public typealias `UIA_TEXTATTRIBUTE_ID` = Int;
public const val `UIA_TabControlTypeId`: `UIA_CONTROLTYPE_ID` = 50018;
public const val `UIA_TabItemControlTypeId`: `UIA_CONTROLTYPE_ID` = 50019;
public const val `UIA_TableColumnHeadersPropertyId`: `UIA_PROPERTY_ID` = 30082;
public const val `UIA_TableControlTypeId`: `UIA_CONTROLTYPE_ID` = 50036;
public const val `UIA_TableItemColumnHeaderItemsPropertyId`: `UIA_PROPERTY_ID` = 30085;
public const val `UIA_TableItemPatternId`: `UIA_PATTERN_ID` = 10013;
public const val `UIA_TableItemRowHeaderItemsPropertyId`: `UIA_PROPERTY_ID` = 30084;
public const val `UIA_TablePatternId`: `UIA_PATTERN_ID` = 10012;
public const val `UIA_TableRowHeadersPropertyId`: `UIA_PROPERTY_ID` = 30081;
public const val `UIA_TableRowOrColumnMajorPropertyId`: `UIA_PROPERTY_ID` = 30083;
public const val `UIA_TabsAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40027;
public const val `UIA_TextChildPatternId`: `UIA_PATTERN_ID` = 10029;
public const val `UIA_TextControlTypeId`: `UIA_CONTROLTYPE_ID` = 50020;
public const val `UIA_TextEditPatternId`: `UIA_PATTERN_ID` = 10032;
public const val `UIA_TextEdit_ConversionTargetChangedEventId`: `UIA_EVENT_ID` = 20033;
public const val `UIA_TextEdit_TextChangedEventId`: `UIA_EVENT_ID` = 20032;
public const val `UIA_TextFlowDirectionsAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40028;
public const val `UIA_TextPattern2Id`: `UIA_PATTERN_ID` = 10024;
public const val `UIA_TextPatternId`: `UIA_PATTERN_ID` = 10014;
public const val `UIA_Text_TextChangedEventId`: `UIA_EVENT_ID` = 20015;
public const val `UIA_Text_TextSelectionChangedEventId`: `UIA_EVENT_ID` = 20014;
public const val `UIA_ThumbControlTypeId`: `UIA_CONTROLTYPE_ID` = 50027;
public const val `UIA_TitleBarControlTypeId`: `UIA_CONTROLTYPE_ID` = 50037;
public const val `UIA_TogglePatternId`: `UIA_PATTERN_ID` = 10015;
public const val `UIA_ToggleToggleStatePropertyId`: `UIA_PROPERTY_ID` = 30086;
public const val `UIA_ToolBarControlTypeId`: `UIA_CONTROLTYPE_ID` = 50021;
public const val `UIA_ToolTipClosedEventId`: `UIA_EVENT_ID` = 20001;
public const val `UIA_ToolTipControlTypeId`: `UIA_CONTROLTYPE_ID` = 50022;
public const val `UIA_ToolTipOpenedEventId`: `UIA_EVENT_ID` = 20000;
public const val `UIA_Transform2CanZoomPropertyId`: `UIA_PROPERTY_ID` = 30133;
public const val `UIA_Transform2ZoomLevelPropertyId`: `UIA_PROPERTY_ID` = 30145;
public const val `UIA_Transform2ZoomMaximumPropertyId`: `UIA_PROPERTY_ID` = 30147;
public const val `UIA_Transform2ZoomMinimumPropertyId`: `UIA_PROPERTY_ID` = 30146;
public const val `UIA_TransformCanMovePropertyId`: `UIA_PROPERTY_ID` = 30087;
public const val `UIA_TransformCanResizePropertyId`: `UIA_PROPERTY_ID` = 30088;
public const val `UIA_TransformCanRotatePropertyId`: `UIA_PROPERTY_ID` = 30089;
public const val `UIA_TransformPattern2Id`: `UIA_PATTERN_ID` = 10028;
public const val `UIA_TransformPatternId`: `UIA_PATTERN_ID` = 10016;
public const val `UIA_TreeControlTypeId`: `UIA_CONTROLTYPE_ID` = 50023;
public const val `UIA_TreeItemControlTypeId`: `UIA_CONTROLTYPE_ID` = 50024;
public const val `UIA_UnderlineColorAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40029;
public const val `UIA_UnderlineStyleAttributeId`: `UIA_TEXTATTRIBUTE_ID` = 40030;
public const val `UIA_ValueIsReadOnlyPropertyId`: `UIA_PROPERTY_ID` = 30046;
public const val `UIA_ValuePatternId`: `UIA_PATTERN_ID` = 10002;
public const val `UIA_ValueValuePropertyId`: `UIA_PROPERTY_ID` = 30045;
public const val `UIA_VirtualizedItemPatternId`: `UIA_PATTERN_ID` = 10020;
public const val `UIA_VisualEffectsPropertyId`: `UIA_PROPERTY_ID` = 30163;
public const val `UIA_WindowCanMaximizePropertyId`: `UIA_PROPERTY_ID` = 30073;
public const val `UIA_WindowCanMinimizePropertyId`: `UIA_PROPERTY_ID` = 30074;
public const val `UIA_WindowControlTypeId`: `UIA_CONTROLTYPE_ID` = 50032;
public const val `UIA_WindowIsModalPropertyId`: `UIA_PROPERTY_ID` = 30077;
public const val `UIA_WindowIsTopmostPropertyId`: `UIA_PROPERTY_ID` = 30078;
public const val `UIA_WindowPatternId`: `UIA_PATTERN_ID` = 10009;
public const val `UIA_WindowWindowInteractionStatePropertyId`: `UIA_PROPERTY_ID` = 30076;
public const val `UIA_WindowWindowVisualStatePropertyId`: `UIA_PROPERTY_ID` = 30075;
public const val `UIA_Window_WindowClosedEventId`: `UIA_EVENT_ID` = 20017;
public const val `UIA_Window_WindowOpenedEventId`: `UIA_EVENT_ID` = 20016;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `UIAutomationEventInfo` (
    public var `guid`: `windows_sys`.`core`.`GUID`,
    public var `pProgrammaticName`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 1591:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for UIAutomationEventInfo {
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
public class `UIAutomationMethodInfo` (
    public var `pProgrammaticName`: `windows_sys`.`core`.`PCWSTR`,
    public var `doSetFocus`: `windows_sys`.`core`.`BOOL`,
    public var `cInParameters`: UInt,
    public var `cOutParameters`: UInt,
    public var `pParameterTypes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`UIAutomationType`>?,
    public var `pParameterNames`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?,
)
// UNSUPPORTED Rust 1606:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for UIAutomationMethodInfo {
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
public class `UIAutomationParameter` (
    public var `type`: `UIAutomationType`,
    public var `pData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1617:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for UIAutomationParameter {
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
public class `UIAutomationPatternInfo` (
    public var `guid`: `windows_sys`.`core`.`GUID`,
    public var `pProgrammaticName`: `windows_sys`.`core`.`PCWSTR`,
    public var `providerInterfaceId`: `windows_sys`.`core`.`GUID`,
    public var `clientInterfaceId`: `windows_sys`.`core`.`GUID`,
    public var `cProperties`: UInt,
    public var `pProperties`: /* Rust *mut */ kotlinx.cinterop.CPointer<`UIAutomationPropertyInfo`>?,
    public var `cMethods`: UInt,
    public var `pMethods`: /* Rust *mut */ kotlinx.cinterop.CPointer<`UIAutomationMethodInfo`>?,
    public var `cEvents`: UInt,
    public var `pEvents`: /* Rust *mut */ kotlinx.cinterop.CPointer<`UIAutomationEventInfo`>?,
    public var `pPatternHandler`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1637:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for UIAutomationPatternInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `UIAutomationPropertyInfo` (
    public var `guid`: `windows_sys`.`core`.`GUID`,
    public var `pProgrammaticName`: `windows_sys`.`core`.`PCWSTR`,
    public var `type`: `UIAutomationType`,
)
// UNSUPPORTED Rust 1649:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for UIAutomationPropertyInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `UIAutomationType` = Int;
public const val `UIAutomationType_Array`: `UIAutomationType` = 65536;
public const val `UIAutomationType_Bool`: `UIAutomationType` = 2;
public const val `UIAutomationType_BoolArray`: `UIAutomationType` = 65538;
public const val `UIAutomationType_Double`: `UIAutomationType` = 4;
public const val `UIAutomationType_DoubleArray`: `UIAutomationType` = 65540;
public const val `UIAutomationType_Element`: `UIAutomationType` = 7;
public const val `UIAutomationType_ElementArray`: `UIAutomationType` = 65543;
public const val `UIAutomationType_Int`: `UIAutomationType` = 1;
public const val `UIAutomationType_IntArray`: `UIAutomationType` = 65537;
public const val `UIAutomationType_Out`: `UIAutomationType` = 131072;
public const val `UIAutomationType_OutBool`: `UIAutomationType` = 131074;
public const val `UIAutomationType_OutBoolArray`: `UIAutomationType` = 196610;
public const val `UIAutomationType_OutDouble`: `UIAutomationType` = 131076;
public const val `UIAutomationType_OutDoubleArray`: `UIAutomationType` = 196612;
public const val `UIAutomationType_OutElement`: `UIAutomationType` = 131079;
public const val `UIAutomationType_OutElementArray`: `UIAutomationType` = 196615;
public const val `UIAutomationType_OutInt`: `UIAutomationType` = 131073;
public const val `UIAutomationType_OutIntArray`: `UIAutomationType` = 196609;
public const val `UIAutomationType_OutPoint`: `UIAutomationType` = 131077;
public const val `UIAutomationType_OutPointArray`: `UIAutomationType` = 196613;
public const val `UIAutomationType_OutRect`: `UIAutomationType` = 131078;
public const val `UIAutomationType_OutRectArray`: `UIAutomationType` = 196614;
public const val `UIAutomationType_OutString`: `UIAutomationType` = 131075;
public const val `UIAutomationType_OutStringArray`: `UIAutomationType` = 196611;
public const val `UIAutomationType_Point`: `UIAutomationType` = 5;
public const val `UIAutomationType_PointArray`: `UIAutomationType` = 65541;
public const val `UIAutomationType_Rect`: `UIAutomationType` = 6;
public const val `UIAutomationType_RectArray`: `UIAutomationType` = 65542;
public const val `UIAutomationType_String`: `UIAutomationType` = 3;
public const val `UIAutomationType_StringArray`: `UIAutomationType` = 65539;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `UiaAndOrCondition` (
    public var `ConditionType`: `ConditionType`,
    public var `ppConditions`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`UiaCondition`>>?,
    public var `cConditions`: Int,
)
// UNSUPPORTED Rust 1692:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for UiaAndOrCondition {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `UiaAppendRuntimeId`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `UiaAsyncContentLoadedEventArgs` (
    public var `Type`: `EventArgsType`,
    public var `EventId`: Int,
    public var `AsyncContentLoadedState`: `AsyncContentLoadedState`,
    public var `PercentComplete`: Double,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `UiaCacheRequest` (
    public var `pViewCondition`: /* Rust *mut */ kotlinx.cinterop.CPointer<`UiaCondition`>?,
    public var `Scope`: `TreeScope`,
    public var `pProperties`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?,
    public var `cProperties`: Int,
    public var `pPatterns`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?,
    public var `cPatterns`: Int,
    public var `automationElementMode`: `AutomationElementMode`,
)
// UNSUPPORTED Rust 1717:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for UiaCacheRequest {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `UiaChangeInfo` (
    public var `uiaId`: Int,
    public var `payload`: `super`.`super`.`System`.`Variant`.`VARIANT`,
    public var `extraInfo`: `super`.`super`.`System`.`Variant`.`VARIANT`,
)
// UNSUPPORTED Rust 1730:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// impl Default for UiaChangeInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `UiaChangesEventArgs` (
    public var `Type`: `EventArgsType`,
    public var `EventId`: Int,
    public var `EventIdCount`: Int,
    public var `pUiaChanges`: /* Rust *mut */ kotlinx.cinterop.CPointer<`UiaChangeInfo`>?,
)
// UNSUPPORTED Rust 1745:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// impl Default for UiaChangesEventArgs {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `UiaCondition` (
    public var `ConditionType`: `ConditionType`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `UiaEventArgs` (
    public var `Type`: `EventArgsType`,
    public var `EventId`: Int,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public typealias `UiaEventCallback` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`UiaEventArgs`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Com`.`SAFEARRAY`>?, `windows_sys`.`core`.`BSTR`) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `UiaFindParams` (
    public var `MaxDepth`: Int,
    public var `FindFirst`: `windows_sys`.`core`.`BOOL`,
    public var `ExcludeRoot`: `windows_sys`.`core`.`BOOL`,
    public var `pFindCondition`: /* Rust *mut */ kotlinx.cinterop.CPointer<`UiaCondition`>?,
)
// UNSUPPORTED Rust 1772:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for UiaFindParams {
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
public class `UiaNotCondition` (
    public var `ConditionType`: `ConditionType`,
    public var `pCondition`: /* Rust *mut */ kotlinx.cinterop.CPointer<`UiaCondition`>?,
)
// UNSUPPORTED Rust 1783:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for UiaNotCondition {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `UiaPoint` (
    public var `x`: Double,
    public var `y`: Double,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `UiaPropertyChangedEventArgs` (
    public var `Type`: `EventArgsType`,
    public var `EventId`: `UIA_EVENT_ID`,
    public var `PropertyId`: Int,
    public var `OldValue`: `super`.`super`.`System`.`Variant`.`VARIANT`,
    public var `NewValue`: `super`.`super`.`System`.`Variant`.`VARIANT`,
)
// UNSUPPORTED Rust 1804:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// impl Default for UiaPropertyChangedEventArgs {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `UiaPropertyCondition` (
    public var `ConditionType`: `ConditionType`,
    public var `PropertyId`: `UIA_PROPERTY_ID`,
    public var `Value`: `super`.`super`.`System`.`Variant`.`VARIANT`,
    public var `Flags`: `PropertyConditionFlags`,
)
// UNSUPPORTED Rust 1819:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// impl Default for UiaPropertyCondition {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public typealias `UiaProviderCallback` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, `ProviderType`) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Com`.`SAFEARRAY`>?>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `UiaRect` (
    public var `left`: Double,
    public var `top`: Double,
    public var `width`: Double,
    public var `height`: Double,
)
public const val `UiaRootObjectId`: Int = -25;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `UiaStructureChangedEventArgs` (
    public var `Type`: `EventArgsType`,
    public var `EventId`: Int,
    public var `StructureChangeType`: `StructureChangeType`,
    public var `pRuntimeId`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?,
    public var `cRuntimeIdLen`: Int,
)
// UNSUPPORTED Rust 1845:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for UiaStructureChangedEventArgs {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `UiaTextEditTextChangedEventArgs` (
    public var `Type`: `EventArgsType`,
    public var `EventId`: Int,
    public var `TextEditChangeType`: `TextEditChangeType`,
    public var `pTextChange`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`Com`.`SAFEARRAY`>?,
)
// UNSUPPORTED Rust 1859:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for UiaTextEditTextChangedEventArgs {
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
public class `UiaWindowClosedEventArgs` (
    public var `Type`: `EventArgsType`,
    public var `EventId`: Int,
    public var `pRuntimeId`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?,
    public var `cRuntimeIdLen`: Int,
)
// UNSUPPORTED Rust 1873:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for UiaWindowClosedEventArgs {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1878:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Value_IsReadOnly_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeb090f30_e24c_4799_a705_0d247bc037f8);

// UNSUPPORTED Rust 1879:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Value_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x17faad9e_c877_475b_b933_77332779b637);

// UNSUPPORTED Rust 1880:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Value_Value_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe95f5e64_269f_4a85_ba99_4092c3ea2986);

// UNSUPPORTED Rust 1881:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const VirtualizedItem_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf510173e_2e71_45e9_a6e5_62f6ed8289d5);

public typealias `VisualEffects` = Int;
public const val `VisualEffects_Bevel`: `VisualEffects` = 16;
public const val `VisualEffects_Glow`: `VisualEffects` = 4;
public const val `VisualEffects_None`: `VisualEffects` = 0;
// UNSUPPORTED Rust 1886:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const VisualEffects_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe61a8565_aad9_46d7_9e70_4e8a8420d420);

public const val `VisualEffects_Reflection`: `VisualEffects` = 2;
public const val `VisualEffects_Shadow`: `VisualEffects` = 1;
public const val `VisualEffects_SoftEdges`: `VisualEffects` = 8;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WINEVENTPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HWINEVENTHOOK`, UInt, `super`.`super`.`Foundation`.`HWND`, Int, Int, UInt, UInt) -> Unit>>>;
public typealias `WindowInteractionState` = Int;
public const val `WindowInteractionState_BlockedByModalWindow`: `WindowInteractionState` = 3;
public const val `WindowInteractionState_Closing`: `WindowInteractionState` = 1;
public const val `WindowInteractionState_NotResponding`: `WindowInteractionState` = 4;
public const val `WindowInteractionState_ReadyForUserInteraction`: `WindowInteractionState` = 2;
public const val `WindowInteractionState_Running`: `WindowInteractionState` = 0;
public typealias `WindowVisualState` = Int;
public const val `WindowVisualState_Maximized`: `WindowVisualState` = 1;
public const val `WindowVisualState_Minimized`: `WindowVisualState` = 2;
public const val `WindowVisualState_Normal`: `WindowVisualState` = 0;
// UNSUPPORTED Rust 1901:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Window_CanMaximize_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x64fff53f_635d_41c1_950c_cb5adfbe28e3);

// UNSUPPORTED Rust 1902:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Window_CanMinimize_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb73b4625_5988_4b97_b4c2_a6fe6e78c8c6);

// UNSUPPORTED Rust 1903:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Window_Control_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe13a7242_f462_4f4d_aec1_53b28d6c3290);

// UNSUPPORTED Rust 1904:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Window_IsModal_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xff4e6892_37b9_4fca_8532_ffe674ecfeed);

// UNSUPPORTED Rust 1905:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Window_IsTopmost_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xef7d85d3_0937_4962_9241_b62345f24041);

// UNSUPPORTED Rust 1906:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Window_Pattern_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x27901735_c760_4994_ad11_5919e606b110);

// UNSUPPORTED Rust 1907:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Window_WindowClosed_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xedf141f8_fa67_4e22_bbf7_944e05735ee2);

// UNSUPPORTED Rust 1908:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Window_WindowInteractionState_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4fed26a4_0455_4fa2_b21c_c4da2db1ff9c);

// UNSUPPORTED Rust 1909:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Window_WindowOpened_Event_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd3e81d06_de45_4f2f_9633_de9e02fb65af);

// UNSUPPORTED Rust 1910:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Window_WindowVisualState_Property_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4ab7905f_e860_453e_a30a_f6431e5daad5);

public typealias `ZoomUnit` = Int;
public const val `ZoomUnit_LargeDecrement`: `ZoomUnit` = 1;
public const val `ZoomUnit_LargeIncrement`: `ZoomUnit` = 3;
public const val `ZoomUnit_NoAmount`: `ZoomUnit` = 0;
public const val `ZoomUnit_SmallDecrement`: `ZoomUnit` = 2;
public const val `ZoomUnit_SmallIncrement`: `ZoomUnit` = 4;
