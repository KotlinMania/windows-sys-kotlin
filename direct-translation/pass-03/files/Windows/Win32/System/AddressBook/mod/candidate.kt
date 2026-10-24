// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=BuildDisplayTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `BuildDisplayTable`(`lpallocatebuffer` : `LPALLOCATEBUFFER`, `lpallocatemore` : `LPALLOCATEMORE`, `lpfreebuffer` : `LPFREEBUFFER`, `lpmalloc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `cpages` : UInt, `lppage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DTPAGE`>?, `ulflags` : UInt, `lpptable` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `lpptbldata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=ChangeIdleRoutine; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ChangeIdleRoutine`(`ftg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpfnidle` : `PFNIDLE`, `lpvidleparam` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `priidle` : Short, `csecidle` : UInt, `iroidle` : UShort, `ircidle` : UShort)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=CreateIProp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateIProp`(`lpinterface` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `lpallocatebuffer` : `LPALLOCATEBUFFER`, `lpallocatemore` : `LPALLOCATEMORE`, `lpfreebuffer` : `LPFREEBUFFER`, `lpvreserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpppropdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rtm.dll, ABI=system, export=CreateTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateTable`(`lpinterface` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `lpallocatebuffer` : `LPALLOCATEBUFFER`, `lpallocatemore` : `LPALLOCATEMORE`, `lpfreebuffer` : `LPFREEBUFFER`, `lpvreserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ultabletype` : UInt, `ulproptagindexcolumn` : UInt, `lpsproptagarraycolumns` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropTagArray`>?, `lpptabledata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=DeinitMapiUtil; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeinitMapiUtil`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=DeregisterIdleRoutine; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeregisterIdleRoutine`(`ftg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=EnableIdleRoutine; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnableIdleRoutine`(`ftg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fenable` : `windows_sys`.`core`.`BOOL`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=FEqualNames; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FEqualNames`(`lpname1` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MAPINAMEID`>?, `lpname2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MAPINAMEID`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=FPropCompareProp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `FPropCompareProp`(`lpspropvalue1` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropValue`>?, `ulrelop` : UInt, `lpspropvalue2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropValue`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=FPropContainsProp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `FPropContainsProp`(`lpspropvaluedst` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropValue`>?, `lpspropvaluesrc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropValue`>?, `ulfuzzylevel` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=FPropExists; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FPropExists`(`lpmapiprop` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ulproptag` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=FreePadrlist; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `FreePadrlist`(`lpadrlist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ADRLIST`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=FreeProws; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `FreeProws`(`lprows` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SRowSet`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=FtAddFt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtAddFt`(`ftaddend1` : `super`.`super`.`Foundation`.`FILETIME`, `ftaddend2` : `super`.`super`.`Foundation`.`FILETIME`) : `super`.`super`.`Foundation`.`FILETIME`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=FtMulDw; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtMulDw`(`ftmultiplier` : UInt, `ftmultiplicand` : `super`.`super`.`Foundation`.`FILETIME`) : `super`.`super`.`Foundation`.`FILETIME`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=FtMulDwDw; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtMulDwDw`(`ftmultiplicand` : UInt, `ftmultiplier` : UInt) : `super`.`super`.`Foundation`.`FILETIME`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=FtNegFt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtNegFt`(`ft` : `super`.`super`.`Foundation`.`FILETIME`) : `super`.`super`.`Foundation`.`FILETIME`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=FtSubFt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtSubFt`(`ftminuend` : `super`.`super`.`Foundation`.`FILETIME`, `ftsubtrahend` : `super`.`super`.`Foundation`.`FILETIME`) : `super`.`super`.`Foundation`.`FILETIME`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=FtgRegisterIdleRoutine; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FtgRegisterIdleRoutine`(`lpfnidle` : `PFNIDLE`, `lpvidleparam` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `priidle` : Short, `csecidle` : UInt, `iroidle` : UShort) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=HrAddColumns; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HrAddColumns`(`lptbl` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpproptagcolumnsnew` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropTagArray`>?, `lpallocatebuffer` : `LPALLOCATEBUFFER`, `lpfreebuffer` : `LPFREEBUFFER`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=HrAddColumnsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HrAddColumnsEx`(`lptbl` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpproptagcolumnsnew` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropTagArray`>?, `lpallocatebuffer` : `LPALLOCATEBUFFER`, `lpfreebuffer` : `LPFREEBUFFER`, `lpfnfiltercolumns` : Long) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=HrAllocAdviseSink; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `HrAllocAdviseSink`(`lpfncallback` : `LPNOTIFCALLBACK`, `lpvcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lppadvisesink` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=HrDispatchNotifications; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HrDispatchNotifications`(`ulflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=HrGetOneProp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `HrGetOneProp`(`lpmapiprop` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ulproptag` : UInt, `lppprop` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`SPropValue`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=HrIStorageFromStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `HrIStorageFromStream`(`lpunkin` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpinterface` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ulflags` : UInt, `lppstorageout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=HrQueryAllRows; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `HrQueryAllRows`(`lptable` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpproptags` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropTagArray`>?, `lprestriction` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SRestriction`>?, `lpsortorderset` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SSortOrderSet`>?, `crowsmax` : Int, `lpprows` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`SRowSet`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=HrSetOneProp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `HrSetOneProp`(`lpmapiprop` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpprop` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropValue`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=HrThisThreadAdviseSink; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HrThisThreadAdviseSink`(`lpadvisesink` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lppadvisesink` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=LPropCompareProp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `LPropCompareProp`(`lpspropvaluea` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropValue`>?, `lpspropvalueb` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropValue`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=LpValFindProp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `LpValFindProp`(`ulproptag` : UInt, `cvalues` : UInt, `lpproparray` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropValue`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropValue`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=MAPIDeinitIdle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MAPIDeinitIdle`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=MAPIGetDefaultMalloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `MAPIGetDefaultMalloc`() : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=MAPIInitIdle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MAPIInitIdle`(`lpvreserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=OpenStreamOnFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `OpenStreamOnFile`(`lpallocatebuffer` : `LPALLOCATEBUFFER`, `lpfreebuffer` : `LPFREEBUFFER`, `ulflags` : UInt, `lpszfilename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `lpszprefix` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `lppstream` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=PpropFindProp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `PpropFindProp`(`lpproparray` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropValue`>?, `cvalues` : UInt, `ulproptag` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropValue`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=PropCopyMore; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `PropCopyMore`(`lpspropvaluedest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropValue`>?, `lpspropvaluesrc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropValue`>?, `lpfallocmore` : `LPALLOCATEMORE`, `lpvobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=RTFSync; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RTFSync`(`lpmessage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ulflags` : UInt, `lpfmessageupdated` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=ScCopyNotifications; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `ScCopyNotifications`(`cnotification` : Int, `lpnotifications` : /* Rust *mut */ kotlinx.cinterop.CPointer<`NOTIFICATION`>?, `lpvdst` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpcb` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=ScCopyProps; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `ScCopyProps`(`cvalues` : Int, `lpproparray` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropValue`>?, `lpvdst` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpcb` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=ScCountNotifications; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `ScCountNotifications`(`cnotifications` : Int, `lpnotifications` : /* Rust *mut */ kotlinx.cinterop.CPointer<`NOTIFICATION`>?, `lpcb` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=ScCountProps; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `ScCountProps`(`cvalues` : Int, `lpproparray` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropValue`>?, `lpcb` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=ScCreateConversationIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ScCreateConversationIndex`(`cbparent` : UInt, `lpbparent` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `lpcbconvindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lppbconvindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=ScDupPropset; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `ScDupPropset`(`cvalues` : Int, `lpproparray` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropValue`>?, `lpallocatebuffer` : `LPALLOCATEBUFFER`, `lppproparray` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`SPropValue`>>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=ScInitMapiUtil; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ScInitMapiUtil`(`ulflags` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=ScLocalPathFromUNC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ScLocalPathFromUNC`(`lpszunc` : `windows_sys`.`core`.`PCSTR`, `lpszlocal` : `windows_sys`.`core`.`PCSTR`, `cchlocal` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=ScRelocNotifications; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `ScRelocNotifications`(`cnotification` : Int, `lpnotifications` : /* Rust *mut */ kotlinx.cinterop.CPointer<`NOTIFICATION`>?, `lpvbaseold` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpvbasenew` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpcb` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=ScRelocProps; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `ScRelocProps`(`cvalues` : Int, `lpproparray` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropValue`>?, `lpvbaseold` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpvbasenew` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpcb` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=ScUNCFromLocalPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ScUNCFromLocalPath`(`lpszlocal` : `windows_sys`.`core`.`PCSTR`, `lpszunc` : `windows_sys`.`core`.`PCSTR`, `cchunc` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=SzFindCh; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SzFindCh`(`lpsz` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `ch` : UShort) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=SzFindLastCh; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SzFindLastCh`(`lpsz` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `ch` : UShort) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=SzFindSz; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SzFindSz`(`lpsz` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `lpszkey` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=UFromSz; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UFromSz`(`lpsz` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=UlAddRef; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UlAddRef`(`lpunk` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=UlPropSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `UlPropSize`(`lpspropvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropValue`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=UlRelease; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UlRelease`(`lpunk` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=WrapCompressedRTFStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `WrapCompressedRTFStream`(`lpcompressedrtfstream` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ulflags` : UInt, `lpuncompressedrtfstream` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=WrapStoreEntryID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WrapStoreEntryID`(`ulflags` : UInt, `lpszdllname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `cborigentry` : UInt, `lporigentry` : /* Rust *const */ kotlinx.cinterop.CPointer<`ENTRYID`>?, `lpcbwrappedentry` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lppwrappedentry` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`ENTRYID`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADRENTRY` (
    public var `ulReserved1`: UInt,
    public var `cValues`: UInt,
    public var `rgPropVals`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropValue`>?,
)
// UNSUPPORTED Rust 91:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for ADRENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 97:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct ADRLIST {
//     pub cEntries: u32,
//     pub aEntries: [ADRENTRY; 1],
// }

// UNSUPPORTED Rust 104:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for ADRLIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADRPARM` (
    public var `cbABContEntryID`: UInt,
    public var `lpABContEntryID`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ENTRYID`>?,
    public var `ulFlags`: UInt,
    public var `lpReserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ulHelpContext`: UInt,
    public var `lpszHelpFileName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `lpfnABSDI`: `LPFNABSDI`,
    public var `lpfnDismiss`: `LPFNDISMISS`,
    public var `lpvDismissContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `lpszCaption`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `lpszNewEntryTitle`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `lpszDestWellsTitle`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `cDestFields`: UInt,
    public var `nDestFieldFocus`: UInt,
    public var `lppszDestTitles`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?,
    public var `lpulDestComps`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `lpContRestriction`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SRestriction`>?,
    public var `lpHierRestriction`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SRestriction`>?,
)
// UNSUPPORTED Rust 133:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for ADRPARM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CALLERRELEASE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DTBLBUTTON` (
    public var `ulbLpszLabel`: UInt,
    public var `ulFlags`: UInt,
    public var `ulPRControl`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DTBLCHECKBOX` (
    public var `ulbLpszLabel`: UInt,
    public var `ulFlags`: UInt,
    public var `ulPRPropertyName`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DTBLCOMBOBOX` (
    public var `ulbLpszCharsAllowed`: UInt,
    public var `ulFlags`: UInt,
    public var `ulNumCharsAllowed`: UInt,
    public var `ulPRPropertyName`: UInt,
    public var `ulPRTableName`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DTBLDDLBX` (
    public var `ulFlags`: UInt,
    public var `ulPRDisplayProperty`: UInt,
    public var `ulPRSetProperty`: UInt,
    public var `ulPRTableName`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DTBLEDIT` (
    public var `ulbLpszCharsAllowed`: UInt,
    public var `ulFlags`: UInt,
    public var `ulNumCharsAllowed`: UInt,
    public var `ulPropTag`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DTBLGROUPBOX` (
    public var `ulbLpszLabel`: UInt,
    public var `ulFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DTBLLABEL` (
    public var `ulbLpszLabelName`: UInt,
    public var `ulFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DTBLLBX` (
    public var `ulFlags`: UInt,
    public var `ulPRSetProperty`: UInt,
    public var `ulPRTableName`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DTBLMVDDLBX` (
    public var `ulFlags`: UInt,
    public var `ulMVPropTag`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DTBLMVLISTBOX` (
    public var `ulFlags`: UInt,
    public var `ulMVPropTag`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DTBLPAGE` (
    public var `ulbLpszLabel`: UInt,
    public var `ulFlags`: UInt,
    public var `ulbLpszComponent`: UInt,
    public var `ulContext`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DTBLRADIOBUTTON` (
    public var `ulbLpszLabel`: UInt,
    public var `ulFlags`: UInt,
    public var `ulcButtons`: UInt,
    public var `ulPropTag`: UInt,
    public var `lReturnValue`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DTCTL` (
    public var `ulCtlType`: UInt,
    public var `ulCtlFlags`: UInt,
    public var `lpbNotif`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbNotif`: UInt,
    public var `lpszFilter`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `ulItemID`: UInt,
    public var `ctl`: `DTCTL_0`,
)
// UNSUPPORTED Rust 238:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DTCTL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 243:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DTCTL_0 {
//     pub lpv: *mut core::ffi::c_void,
//     pub lplabel: *mut DTBLLABEL,
//     pub lpedit: *mut DTBLEDIT,
//     pub lplbx: *mut DTBLLBX,
//     pub lpcombobox: *mut DTBLCOMBOBOX,
//     pub lpddlbx: *mut DTBLDDLBX,
//     pub lpcheckbox: *mut DTBLCHECKBOX,
//     pub lpgroupbox: *mut DTBLGROUPBOX,
//     pub lpbutton: *mut DTBLBUTTON,
//     pub lpradiobutton: *mut DTBLRADIOBUTTON,
//     pub lpmvlbx: *mut DTBLMVLISTBOX,
//     pub lpmvddlbx: *mut DTBLMVDDLBX,
//     pub lppage: *mut DTBLPAGE,
// }

// UNSUPPORTED Rust 260:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DTCTL_0 {
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
public class `DTPAGE` (
    public var `cctl`: UInt,
    public var `lpszResourceName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `Anonymous`: `DTPAGE_0`,
    public var `lpctl`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DTCTL`>?,
)
// UNSUPPORTED Rust 273:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DTPAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 278:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DTPAGE_0 {
//     pub lpszComponent: *mut i8,
//     pub ulItemID: u32,
// }

// UNSUPPORTED Rust 284:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DTPAGE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 289:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ENTRYID {
//     pub abFlags: [u8; 4],
//     pub ab: [u8; 1],
// }

// UNSUPPORTED Rust 295:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ENTRYID {
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
public class `ERROR_NOTIFICATION` (
    public var `cbEntryID`: UInt,
    public var `lpEntryID`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ENTRYID`>?,
    public var `scode`: Int,
    public var `ulFlags`: UInt,
    public var `lpMAPIError`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MAPIERROR`>?,
)
// UNSUPPORTED Rust 309:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ERROR_NOTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EXTENDED_NOTIFICATION` (
    public var `ulEvent`: UInt,
    public var `cb`: UInt,
    public var `pbEventParameters`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 321:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EXTENDED_NOTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `E_IMAPI_BURN_VERIFICATION_FAILED`: Int = -1062600697;
public const val `E_IMAPI_DF2DATA_CLIENT_NAME_IS_NOT_VALID`: Int = -1062599672;
public const val `E_IMAPI_DF2DATA_INVALID_MEDIA_STATE`: Int = -1062599678;
public const val `E_IMAPI_DF2DATA_MEDIA_IS_NOT_SUPPORTED`: Int = -1062599674;
public const val `E_IMAPI_DF2DATA_MEDIA_NOT_BLANK`: Int = -1062599675;
public const val `E_IMAPI_DF2DATA_RECORDER_NOT_SUPPORTED`: Int = -1062599673;
public const val `E_IMAPI_DF2DATA_STREAM_NOT_SUPPORTED`: Int = -1062599677;
public const val `E_IMAPI_DF2DATA_STREAM_TOO_LARGE_FOR_CURRENT_MEDIA`: Int = -1062599676;
public const val `E_IMAPI_DF2DATA_WRITE_IN_PROGRESS`: Int = -1062599680;
public const val `E_IMAPI_DF2DATA_WRITE_NOT_IN_PROGRESS`: Int = -1062599679;
public const val `E_IMAPI_DF2RAW_CLIENT_NAME_IS_NOT_VALID`: Int = -1062599164;
public const val `E_IMAPI_DF2RAW_DATA_BLOCK_TYPE_NOT_SUPPORTED`: Int = -1062599154;
public const val `E_IMAPI_DF2RAW_MEDIA_IS_NOT_BLANK`: Int = -1062599162;
public const val `E_IMAPI_DF2RAW_MEDIA_IS_NOT_PREPARED`: Int = -1062599166;
public const val `E_IMAPI_DF2RAW_MEDIA_IS_NOT_SUPPORTED`: Int = -1062599161;
public const val `E_IMAPI_DF2RAW_MEDIA_IS_PREPARED`: Int = -1062599165;
public const val `E_IMAPI_DF2RAW_NOT_ENOUGH_SPACE`: Int = -1062599159;
public const val `E_IMAPI_DF2RAW_NO_RECORDER_SPECIFIED`: Int = -1062599158;
public const val `E_IMAPI_DF2RAW_RECORDER_NOT_SUPPORTED`: Int = -1062599152;
public const val `E_IMAPI_DF2RAW_STREAM_LEADIN_TOO_SHORT`: Int = -1062599153;
public const val `E_IMAPI_DF2RAW_STREAM_NOT_SUPPORTED`: Int = -1062599155;
public const val `E_IMAPI_DF2RAW_WRITE_IN_PROGRESS`: Int = -1062599168;
public const val `E_IMAPI_DF2RAW_WRITE_NOT_IN_PROGRESS`: Int = -1062599167;
public const val `E_IMAPI_DF2TAO_CLIENT_NAME_IS_NOT_VALID`: Int = -1062599409;
public const val `E_IMAPI_DF2TAO_INVALID_ISRC`: Int = -1062599413;
public const val `E_IMAPI_DF2TAO_INVALID_MCN`: Int = -1062599412;
public const val `E_IMAPI_DF2TAO_MEDIA_IS_NOT_BLANK`: Int = -1062599418;
public const val `E_IMAPI_DF2TAO_MEDIA_IS_NOT_PREPARED`: Int = -1062599422;
public const val `E_IMAPI_DF2TAO_MEDIA_IS_NOT_SUPPORTED`: Int = -1062599417;
public const val `E_IMAPI_DF2TAO_MEDIA_IS_PREPARED`: Int = -1062599421;
public const val `E_IMAPI_DF2TAO_NOT_ENOUGH_SPACE`: Int = -1062599415;
public const val `E_IMAPI_DF2TAO_NO_RECORDER_SPECIFIED`: Int = -1062599414;
public const val `E_IMAPI_DF2TAO_PROPERTY_FOR_BLANK_MEDIA_ONLY`: Int = -1062599420;
public const val `E_IMAPI_DF2TAO_RECORDER_NOT_SUPPORTED`: Int = -1062599410;
public const val `E_IMAPI_DF2TAO_STREAM_NOT_SUPPORTED`: Int = -1062599411;
public const val `E_IMAPI_DF2TAO_TABLE_OF_CONTENTS_EMPTY_DISC`: Int = -1062599419;
public const val `E_IMAPI_DF2TAO_TRACK_LIMIT_REACHED`: Int = -1062599416;
public const val `E_IMAPI_DF2TAO_WRITE_IN_PROGRESS`: Int = -1062599424;
public const val `E_IMAPI_DF2TAO_WRITE_NOT_IN_PROGRESS`: Int = -1062599423;
public const val `E_IMAPI_ERASE_CLIENT_NAME_IS_NOT_VALID`: Int = -1062598389;
public const val `E_IMAPI_ERASE_DISC_INFORMATION_TOO_SMALL`: Int = -2136340222;
public const val `E_IMAPI_ERASE_DRIVE_FAILED_ERASE_COMMAND`: Int = -2136340219;
public const val `E_IMAPI_ERASE_DRIVE_FAILED_SPINUP_COMMAND`: Int = -2136340216;
public const val `E_IMAPI_ERASE_MEDIA_IS_NOT_ERASABLE`: Int = -2136340220;
public const val `E_IMAPI_ERASE_MEDIA_IS_NOT_SUPPORTED`: Int = -1062598391;
public const val `E_IMAPI_ERASE_MODE_PAGE_2A_TOO_SMALL`: Int = -2136340221;
public const val `E_IMAPI_ERASE_ONLY_ONE_RECORDER_SUPPORTED`: Int = -2136340223;
public const val `E_IMAPI_ERASE_RECORDER_IN_USE`: Int = -2136340224;
public const val `E_IMAPI_ERASE_RECORDER_NOT_SUPPORTED`: Int = -1062598390;
public const val `E_IMAPI_ERASE_TOOK_LONGER_THAN_ONE_HOUR`: Int = -2136340218;
public const val `E_IMAPI_ERASE_UNEXPECTED_DRIVE_RESPONSE_DURING_ERASE`: Int = -2136340217;
public const val `E_IMAPI_LOSS_OF_STREAMING`: Int = -1062599936;
public const val `E_IMAPI_RAW_IMAGE_INSUFFICIENT_SPACE`: Int = -2136339963;
public const val `E_IMAPI_RAW_IMAGE_IS_READ_ONLY`: Int = -2136339968;
public const val `E_IMAPI_RAW_IMAGE_NO_TRACKS`: Int = -2136339965;
public const val `E_IMAPI_RAW_IMAGE_SECTOR_TYPE_NOT_SUPPORTED`: Int = -2136339966;
public const val `E_IMAPI_RAW_IMAGE_TOO_MANY_TRACKS`: Int = -2136339967;
public const val `E_IMAPI_RAW_IMAGE_TOO_MANY_TRACK_INDEXES`: Int = -2136339962;
public const val `E_IMAPI_RAW_IMAGE_TRACKS_ALREADY_ADDED`: Int = -2136339964;
public const val `E_IMAPI_RAW_IMAGE_TRACK_INDEX_NOT_FOUND`: Int = -2136339961;
public const val `E_IMAPI_RAW_IMAGE_TRACK_INDEX_OFFSET_ZERO_CANNOT_BE_CLEARED`: Int = -2136339959;
public const val `E_IMAPI_RAW_IMAGE_TRACK_INDEX_TOO_CLOSE_TO_OTHER_INDEX`: Int = -2136339958;
public const val `E_IMAPI_RECORDER_CLIENT_NAME_IS_NOT_VALID`: Int = -1062600175;
public const val `E_IMAPI_RECORDER_COMMAND_TIMEOUT`: Int = -1062600179;
public const val `E_IMAPI_RECORDER_DVD_STRUCTURE_NOT_PRESENT`: Int = -1062600178;
public const val `E_IMAPI_RECORDER_FEATURE_IS_NOT_CURRENT`: Int = -1062600181;
public const val `E_IMAPI_RECORDER_GET_CONFIGURATION_NOT_SUPPORTED`: Int = -1062600180;
public const val `E_IMAPI_RECORDER_INVALID_MODE_PARAMETERS`: Int = -1062600184;
public const val `E_IMAPI_RECORDER_INVALID_RESPONSE_FROM_DEVICE`: Int = -1062599937;
public const val `E_IMAPI_RECORDER_LOCKED`: Int = -1062600176;
public const val `E_IMAPI_RECORDER_MEDIA_BECOMING_READY`: Int = -1062600187;
public const val `E_IMAPI_RECORDER_MEDIA_BUSY`: Int = -1062600185;
public const val `E_IMAPI_RECORDER_MEDIA_FORMAT_IN_PROGRESS`: Int = -1062600186;
public const val `E_IMAPI_RECORDER_MEDIA_INCOMPATIBLE`: Int = -1062600189;
public const val `E_IMAPI_RECORDER_MEDIA_NOT_FORMATTED`: Int = -1062600174;
public const val `E_IMAPI_RECORDER_MEDIA_NO_MEDIA`: Int = -1062600190;
public const val `E_IMAPI_RECORDER_MEDIA_SPEED_MISMATCH`: Int = -1062600177;
public const val `E_IMAPI_RECORDER_MEDIA_UPSIDE_DOWN`: Int = -1062600188;
public const val `E_IMAPI_RECORDER_MEDIA_WRITE_PROTECTED`: Int = -1062600183;
public const val `E_IMAPI_RECORDER_NO_SUCH_FEATURE`: Int = -1062600182;
public const val `E_IMAPI_RECORDER_NO_SUCH_MODE_PAGE`: Int = -1062600191;
public const val `E_IMAPI_RECORDER_REQUIRED`: Int = -1062600701;
public const val `E_IMAPI_REQUEST_CANCELLED`: Int = -1062600702;
public const val `E_IMAPI_UNEXPECTED_RESPONSE_FROM_DEVICE`: Int = -1062599935;
public const val `FACILITY_IMAPI2`: UInt = 170u;
// UNSUPPORTED Rust 411:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FLATENTRY {
//     pub cb: u32,
//     pub abEntry: [u8; 1],
// }

// UNSUPPORTED Rust 417:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FLATENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 422:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FLATENTRYLIST {
//     pub cEntries: u32,
//     pub cbEntries: u32,
//     pub abEntries: [u8; 1],
// }

// UNSUPPORTED Rust 429:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FLATENTRYLIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 434:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FLATMTSIDLIST {
//     pub cMTSIDs: u32,
//     pub cbMTSIDs: u32,
//     pub abMTSIDs: [u8; 1],
// }

// UNSUPPORTED Rust 441:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FLATMTSIDLIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 446:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FlagList {
//     pub cFlags: u32,
//     pub ulFlag: [u32; 1],
// }

// UNSUPPORTED Rust 452:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FlagList {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `Gender` = Int;
public const val `IMAPI_E_BAD_MULTISESSION_PARAMETER`: Int = -1062555294;
public const val `IMAPI_E_BOOT_EMULATION_IMAGE_SIZE_MISMATCH`: Int = -1062555318;
public const val `IMAPI_E_BOOT_IMAGE_DATA`: Int = -1062555320;
public const val `IMAPI_E_BOOT_OBJECT_CONFLICT`: Int = -1062555319;
public const val `IMAPI_E_DATA_STREAM_CREATE_FAILURE`: Int = -1062555350;
public const val `IMAPI_E_DATA_STREAM_INCONSISTENCY`: Int = -1062555352;
public const val `IMAPI_E_DATA_STREAM_READ_FAILURE`: Int = -1062555351;
public const val `IMAPI_E_DATA_TOO_BIG`: Int = -1062555342;
public const val `IMAPI_E_DIRECTORY_READ_FAILURE`: Int = -1062555349;
public const val `IMAPI_E_DIR_NOT_EMPTY`: Int = -1062555382;
public const val `IMAPI_E_DIR_NOT_FOUND`: Int = -1062555366;
public const val `IMAPI_E_DISC_MISMATCH`: Int = -1062555304;
public const val `IMAPI_E_DUP_NAME`: Int = -1062555374;
public const val `IMAPI_E_EMPTY_DISC`: Int = -1062555312;
public const val `IMAPI_E_FILE_NOT_FOUND`: Int = -1062555367;
public const val `IMAPI_E_FILE_SYSTEM_CHANGE_NOT_ALLOWED`: Int = -1062555293;
public const val `IMAPI_E_FILE_SYSTEM_FEATURE_NOT_SUPPORTED`: Int = -1062555308;
public const val `IMAPI_E_FILE_SYSTEM_NOT_EMPTY`: Int = -1062555386;
public const val `IMAPI_E_FILE_SYSTEM_NOT_FOUND`: Int = -1062555310;
public const val `IMAPI_E_FILE_SYSTEM_READ_CONSISTENCY_ERROR`: Int = -1062555309;
public const val `IMAPI_E_FSI_INTERNAL_ERROR`: Int = -1062555392;
public const val `IMAPI_E_IMAGEMANAGER_IMAGE_NOT_ALIGNED`: Int = -1062555136;
public const val `IMAPI_E_IMAGEMANAGER_IMAGE_TOO_BIG`: Int = -1062555133;
public const val `IMAPI_E_IMAGEMANAGER_NO_IMAGE`: Int = -1062555134;
public const val `IMAPI_E_IMAGEMANAGER_NO_VALID_VD_FOUND`: Int = -1062555135;
public const val `IMAPI_E_IMAGE_SIZE_LIMIT`: Int = -1062555360;
public const val `IMAPI_E_IMAGE_TOO_BIG`: Int = -1062555359;
public const val `IMAPI_E_IMPORT_MEDIA_NOT_ALLOWED`: Int = -1062555303;
public const val `IMAPI_E_IMPORT_READ_FAILURE`: Int = -1062555305;
public const val `IMAPI_E_IMPORT_SEEK_FAILURE`: Int = -1062555306;
public const val `IMAPI_E_IMPORT_TYPE_COLLISION_DIRECTORY_EXISTS_AS_FILE`: Int = -1062555298;
public const val `IMAPI_E_IMPORT_TYPE_COLLISION_FILE_EXISTS_AS_DIRECTORY`: Int = -1062555307;
public const val `IMAPI_E_INCOMPATIBLE_MULTISESSION_TYPE`: Int = -1062555301;
public const val `IMAPI_E_INCOMPATIBLE_PREVIOUS_SESSION`: Int = -1062555341;
public const val `IMAPI_E_INVALID_DATE`: Int = -1062555387;
public const val `IMAPI_E_INVALID_PARAM`: Int = -1062555391;
public const val `IMAPI_E_INVALID_PATH`: Int = -1062555376;
public const val `IMAPI_E_INVALID_VOLUME_NAME`: Int = -1062555388;
public const val `IMAPI_E_INVALID_WORKING_DIRECTORY`: Int = -1062555328;
public const val `IMAPI_E_ISO9660_LEVELS`: Int = -1062555343;
public const val `IMAPI_E_ITEM_NOT_FOUND`: Int = -1062555368;
public const val `IMAPI_E_MULTISESSION_NOT_SET`: Int = -1062555299;
public const val `IMAPI_E_NOT_DIR`: Int = -1062555383;
public const val `IMAPI_E_NOT_FILE`: Int = -1062555384;
public const val `IMAPI_E_NOT_IN_FILE_SYSTEM`: Int = -1062555381;
public const val `IMAPI_E_NO_COMPATIBLE_MULTISESSION_TYPE`: Int = -1062555300;
public const val `IMAPI_E_NO_OUTPUT`: Int = -1062555389;
public const val `IMAPI_E_NO_SUPPORTED_FILE_SYSTEM`: Int = -1062555311;
public const val `IMAPI_E_NO_UNIQUE_NAME`: Int = -1062555373;
public const val `IMAPI_E_PROPERTY_NOT_ACCESSIBLE`: Int = -1062555296;
public const val `IMAPI_E_READONLY`: Int = -1062555390;
public const val `IMAPI_E_RESTRICTED_NAME_VIOLATION`: Int = -1062555375;
public const val `IMAPI_E_STASHFILE_MOVE`: Int = -1062555326;
public const val `IMAPI_E_STASHFILE_OPEN_FAILURE`: Int = -1062555336;
public const val `IMAPI_E_STASHFILE_READ_FAILURE`: Int = -1062555333;
public const val `IMAPI_E_STASHFILE_SEEK_FAILURE`: Int = -1062555335;
public const val `IMAPI_E_STASHFILE_WRITE_FAILURE`: Int = -1062555334;
public const val `IMAPI_E_TOO_MANY_DIRS`: Int = -1062555344;
public const val `IMAPI_E_UDF_NOT_WRITE_COMPATIBLE`: Int = -1062555302;
public const val `IMAPI_E_UDF_REVISION_CHANGE_NOT_ALLOWED`: Int = -1062555295;
public const val `IMAPI_E_WORKING_DIRECTORY_SPACE`: Int = -1062555327;
public const val `IMAPI_S_IMAGE_FEATURE_NOT_SUPPORTED`: Int = 11186527;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPALLOCATEBUFFER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPALLOCATEMORE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPCREATECONVERSATIONINDEX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPDISPATCHNOTIFICATIONS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPFNABSDI` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPFNBUTTON` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`ENTRYID`>?, UInt) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPFNDISMISS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPFREEBUFFER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public typealias `LPNOTIFCALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`NOTIFICATION`>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public typealias `LPOPENSTREAMONFILE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`LPALLOCATEBUFFER`, `LPFREEBUFFER`, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public typealias `LPWABACTIONITEM` = Long;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPWABALLOCATEBUFFER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPWABALLOCATEMORE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPWABFREEBUFFER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPWABOPEN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`WAB_PARAM`>?, UInt) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPWABOPENEX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`WAB_PARAM`>?, UInt, `LPALLOCATEBUFFER`, `LPALLOCATEMORE`, `LPFREEBUFFER`) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MAPIERROR` (
    public var `ulVersion`: UInt,
    public var `lpszError`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `lpszComponent`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `ulLowLevelError`: UInt,
    public var `ulContext`: UInt,
)
// UNSUPPORTED Rust 547:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MAPIERROR {
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
public class `MAPINAMEID` (
    public var `lpguid`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `ulKind`: UInt,
    public var `Kind`: `MAPINAMEID_0`,
)
// UNSUPPORTED Rust 559:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MAPINAMEID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 564:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MAPINAMEID_0 {
//     pub lID: i32,
//     pub lpwstrName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 570:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MAPINAMEID_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 575:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MAPIUID {
//     pub ab: [u8; 16],
// }

// UNSUPPORTED Rust 580:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MAPIUID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MAPI_COMPOUND`: UInt = 128u;
public const val `MAPI_DIM`: UInt = 1u;
public const val `MAPI_ERROR_VERSION`: Int = 0;
public const val `MAPI_E_CALL_FAILED`: Int = -2147467259;
public const val `MAPI_E_INTERFACE_NOT_SUPPORTED`: Int = -2147467262;
public const val `MAPI_E_INVALID_PARAMETER`: Int = -2147024809;
public const val `MAPI_E_NOT_ENOUGH_MEMORY`: Int = -2147024882;
public const val `MAPI_E_NO_ACCESS`: Int = -2147024891;
public const val `MAPI_NOTRECIP`: UInt = 64u;
public const val `MAPI_NOTRESERVED`: UInt = 8u;
public const val `MAPI_NOW`: UInt = 16u;
public const val `MAPI_ONE_OFF_NO_RICH_INFO`: UInt = 1u;
public const val `MAPI_P1`: UInt = 268435456u;
public const val `MAPI_SHORTTERM`: UInt = 128u;
public const val `MAPI_SUBMITTED`: UInt = 2147483648u;
public const val `MAPI_THISSESSION`: UInt = 32u;
public const val `MAPI_USE_DEFAULT`: UInt = 64u;
public const val `MNID_ID`: UInt = 0u;
public const val `MNID_STRING`: UInt = 1u;
// UNSUPPORTED Rust 604:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MTSID {
//     pub cb: u32,
//     pub ab: [u8; 1],
// }

// UNSUPPORTED Rust 610:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MTSID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MV_FLAG`: UInt = 4096u;
public const val `MV_INSTANCE`: UInt = 8192u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NEWMAIL_NOTIFICATION` (
    public var `cbEntryID`: UInt,
    public var `lpEntryID`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ENTRYID`>?,
    public var `cbParentID`: UInt,
    public var `lpParentID`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ENTRYID`>?,
    public var `ulFlags`: UInt,
    public var `lpszMessageClass`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `ulMessageFlags`: UInt,
)
// UNSUPPORTED Rust 628:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NEWMAIL_NOTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NOTIFICATION` (
    public var `ulEventType`: UInt,
    public var `ulAlignPad`: UInt,
    public var `info`: `NOTIFICATION_0`,
)
// UNSUPPORTED Rust 641:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for NOTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 647:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union NOTIFICATION_0 {
//     pub err: ERROR_NOTIFICATION,
//     pub newmail: NEWMAIL_NOTIFICATION,
//     pub obj: OBJECT_NOTIFICATION,
//     pub tab: TABLE_NOTIFICATION,
//     pub ext: EXTENDED_NOTIFICATION,
//     pub statobj: STATUS_OBJECT_NOTIFICATION,
// }

// UNSUPPORTED Rust 658:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for NOTIFICATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 664:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NOTIFKEY {
//     pub cb: u32,
//     pub ab: [u8; 1],
// }

// UNSUPPORTED Rust 670:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NOTIFKEY {
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
public class `OBJECT_NOTIFICATION` (
    public var `cbEntryID`: UInt,
    public var `lpEntryID`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ENTRYID`>?,
    public var `ulObjType`: UInt,
    public var `cbParentID`: UInt,
    public var `lpParentID`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ENTRYID`>?,
    public var `cbOldID`: UInt,
    public var `lpOldID`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ENTRYID`>?,
    public var `cbOldParentID`: UInt,
    public var `lpOldParentID`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ENTRYID`>?,
    public var `lpPropTagArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropTagArray`>?,
)
// UNSUPPORTED Rust 689:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OBJECT_NOTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 694:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const OPENSTREAMONFILE: windows_sys::core::PCSTR = windows_sys::core::s!("OpenStreamOnFile");

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNIDLE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
public const val `PRIHIGHEST`: UInt = 32767u;
public const val `PRILOWEST`: Int = -32768;
public const val `PRIUSER`: UInt = 0u;
public const val `PROP_ID_INVALID`: UInt = 65535u;
public const val `PROP_ID_NULL`: UInt = 0u;
public const val `PROP_ID_SECURE_MAX`: UInt = 26623u;
public const val `PROP_ID_SECURE_MIN`: UInt = 26608u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SAndRestriction` (
    public var `cRes`: UInt,
    public var `lpRes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SRestriction`>?,
)
// UNSUPPORTED Rust 710:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SAndRestriction {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SAppTimeArray` (
    public var `cValues`: UInt,
    public var `lpat`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?,
)
// UNSUPPORTED Rust 722:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SAppTimeArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SBinary` (
    public var `cb`: UInt,
    public var `lpb`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 733:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SBinary {
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
public class `SBinaryArray` (
    public var `cValues`: UInt,
    public var `lpbin`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SBinary`>?,
)
// UNSUPPORTED Rust 744:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SBinaryArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SBitMaskRestriction` (
    public var `relBMR`: UInt,
    public var `ulPropTag`: UInt,
    public var `ulMask`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCommentRestriction` (
    public var `cValues`: UInt,
    public var `lpRes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SRestriction`>?,
    public var `lpProp`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropValue`>?,
)
// UNSUPPORTED Rust 764:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SCommentRestriction {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SComparePropsRestriction` (
    public var `relop`: UInt,
    public var `ulPropTag1`: UInt,
    public var `ulPropTag2`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SContentRestriction` (
    public var `ulFuzzyLevel`: UInt,
    public var `ulPropTag`: UInt,
    public var `lpProp`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropValue`>?,
)
// UNSUPPORTED Rust 785:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SContentRestriction {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCurrencyArray` (
    public var `cValues`: UInt,
    public var `lpcur`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`CY`>?,
)
// UNSUPPORTED Rust 798:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SCurrencyArray {
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
public class `SDateTimeArray` (
    public var `cValues`: UInt,
    public var `lpft`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?,
)
// UNSUPPORTED Rust 810:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SDateTimeArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SDoubleArray` (
    public var `cValues`: UInt,
    public var `lpdbl`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?,
)
// UNSUPPORTED Rust 821:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SDoubleArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SERVICE_UI_ALLOWED`: UInt = 16u;
public const val `SERVICE_UI_ALWAYS`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SExistRestriction` (
    public var `ulReserved1`: UInt,
    public var `ulPropTag`: UInt,
    public var `ulReserved2`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SGuidArray` (
    public var `cValues`: UInt,
    public var `lpguid`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
)
// UNSUPPORTED Rust 841:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SGuidArray {
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
public class `SLPSTRArray` (
    public var `cValues`: UInt,
    public var `lppszA`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?,
)
// UNSUPPORTED Rust 852:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SLPSTRArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SLargeIntegerArray` (
    public var `cValues`: UInt,
    public var `lpli`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?,
)
// UNSUPPORTED Rust 863:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SLargeIntegerArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SLongArray` (
    public var `cValues`: UInt,
    public var `lpl`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?,
)
// UNSUPPORTED Rust 874:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SLongArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SNotRestriction` (
    public var `ulReserved`: UInt,
    public var `lpRes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SRestriction`>?,
)
// UNSUPPORTED Rust 886:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SNotRestriction {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SOrRestriction` (
    public var `cRes`: UInt,
    public var `lpRes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SRestriction`>?,
)
// UNSUPPORTED Rust 899:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SOrRestriction {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SPropProblem` (
    public var `ulIndex`: UInt,
    public var `ulPropTag`: UInt,
    public var `scode`: Int,
)
// UNSUPPORTED Rust 912:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SPropProblemArray {
//     pub cProblem: u32,
//     pub aProblem: [SPropProblem; 1],
// }

// UNSUPPORTED Rust 918:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SPropProblemArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 923:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SPropTagArray {
//     pub cValues: u32,
//     pub aulPropTag: [u32; 1],
// }

// UNSUPPORTED Rust 929:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SPropTagArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SPropValue` (
    public var `ulPropTag`: UInt,
    public var `dwAlignPad`: UInt,
    public var `Value`: `__UPV`,
)
// UNSUPPORTED Rust 942:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SPropValue {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SPropertyRestriction` (
    public var `relop`: UInt,
    public var `ulPropTag`: UInt,
    public var `lpProp`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropValue`>?,
)
// UNSUPPORTED Rust 956:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SPropertyRestriction {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SRealArray` (
    public var `cValues`: UInt,
    public var `lpflt`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?,
)
// UNSUPPORTED Rust 968:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SRealArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SRestriction` (
    public var `rt`: UInt,
    public var `res`: `SRestriction_0`,
)
// UNSUPPORTED Rust 980:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SRestriction {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 986:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union SRestriction_0 {
//     pub resCompareProps: SComparePropsRestriction,
//     pub resAnd: SAndRestriction,
//     pub resOr: SOrRestriction,
//     pub resNot: SNotRestriction,
//     pub resContent: SContentRestriction,
//     pub resProperty: SPropertyRestriction,
//     pub resBitMask: SBitMaskRestriction,
//     pub resSize: SSizeRestriction,
//     pub resExist: SExistRestriction,
//     pub resSub: SSubRestriction,
//     pub resComment: SCommentRestriction,
// }

// UNSUPPORTED Rust 1002:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SRestriction_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SRow` (
    public var `ulAdrEntryPad`: UInt,
    public var `cValues`: UInt,
    public var `lpProps`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropValue`>?,
)
// UNSUPPORTED Rust 1016:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SRow {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1022:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct SRowSet {
//     pub cRows: u32,
//     pub aRow: [SRow; 1],
// }

// UNSUPPORTED Rust 1029:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SRowSet {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SShortArray` (
    public var `cValues`: UInt,
    public var `lpi`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?,
)
// UNSUPPORTED Rust 1041:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SShortArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SSizeRestriction` (
    public var `relop`: UInt,
    public var `ulPropTag`: UInt,
    public var `cb`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SSortOrder` (
    public var `ulPropTag`: UInt,
    public var `ulOrder`: UInt,
)
// UNSUPPORTED Rust 1059:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SSortOrderSet {
//     pub cSorts: u32,
//     pub cCategories: u32,
//     pub cExpanded: u32,
//     pub aSort: [SSortOrder; 1],
// }

// UNSUPPORTED Rust 1067:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SSortOrderSet {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SSubRestriction` (
    public var `ulSubObject`: UInt,
    public var `lpRes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SRestriction`>?,
)
// UNSUPPORTED Rust 1079:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SSubRestriction {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STATUS_OBJECT_NOTIFICATION` (
    public var `cbEntryID`: UInt,
    public var `lpEntryID`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ENTRYID`>?,
    public var `cValues`: UInt,
    public var `lpPropVals`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SPropValue`>?,
)
// UNSUPPORTED Rust 1094:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for STATUS_OBJECT_NOTIFICATION {
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
public class `SWStringArray` (
    public var `cValues`: UInt,
    public var `lppszW`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?,
)
// UNSUPPORTED Rust 1106:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SWStringArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `S_IMAPI_BOTHADJUSTED`: Int = 11141126;
public const val `S_IMAPI_COMMAND_HAS_SENSE_DATA`: Int = 11141632;
public const val `S_IMAPI_RAW_IMAGE_TRACK_INDEX_ALREADY_EXISTS`: Int = 11143688;
public const val `S_IMAPI_ROTATIONADJUSTED`: Int = 11141125;
public const val `S_IMAPI_SPEEDADJUSTED`: Int = 11141124;
public const val `S_IMAPI_WRITE_NOT_IN_PROGRESS`: Int = 11141890;
public const val `TABLE_CHANGED`: UInt = 1u;
public const val `TABLE_ERROR`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TABLE_NOTIFICATION` (
    public var `ulTableEvent`: UInt,
    public var `hResult`: `windows_sys`.`core`.`HRESULT`,
    public var `propIndex`: `SPropValue`,
    public var `propPrior`: `SPropValue`,
    public var `row`: `SRow`,
    public var `ulPad`: UInt,
)
// UNSUPPORTED Rust 1130:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for TABLE_NOTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TABLE_RELOAD`: UInt = 9u;
public const val `TABLE_RESTRICT_DONE`: UInt = 7u;
public const val `TABLE_ROW_ADDED`: UInt = 3u;
public const val `TABLE_ROW_DELETED`: UInt = 4u;
public const val `TABLE_ROW_MODIFIED`: UInt = 5u;
public const val `TABLE_SETCOL_DONE`: UInt = 8u;
public const val `TABLE_SORT_DONE`: UInt = 6u;
public const val `TAD_ALL_ROWS`: UInt = 1u;
public const val `UI_CURRENT_PROVIDER_FIRST`: UInt = 4u;
public const val `UI_SERVICE`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WABEXTDISPLAY` (
    public var `cbSize`: UInt,
    public var `lpWABObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `lpAdrBook`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `lpPropObj`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `fReadOnly`: `windows_sys`.`core`.`BOOL`,
    public var `fDataChanged`: `windows_sys`.`core`.`BOOL`,
    public var `ulFlags`: UInt,
    public var `lpv`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `lpsz`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
)
// UNSUPPORTED Rust 1159:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WABEXTDISPLAY {
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
public class `WABIMPORTPARAM` (
    public var `cbSize`: UInt,
    public var `lpAdrBook`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `hWnd`: `super`.`super`.`Foundation`.`HWND`,
    public var `ulFlags`: UInt,
    public var `lpszFileName`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 1173:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WABIMPORTPARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WABOBJECT_LDAPURL_RETURN_MAILUSER`: UInt = 1u;
public const val `WABOBJECT_ME_NEW`: UInt = 1u;
public const val `WABOBJECT_ME_NOCREATE`: UInt = 2u;
public const val `WAB_CONTEXT_ADRLIST`: UInt = 2u;
public const val `WAB_DISPLAY_ISNTDS`: UInt = 4u;
public const val `WAB_DISPLAY_LDAPURL`: UInt = 1u;
// UNSUPPORTED Rust 1184:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WAB_DLL_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("WAB32.DLL");

// UNSUPPORTED Rust 1185:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WAB_DLL_PATH_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\WAB\\DLLPath");

public const val `WAB_ENABLE_PROFILES`: UInt = 4194304u;
public const val `WAB_IGNORE_PROFILES`: UInt = 8388608u;
public const val `WAB_LOCAL_CONTAINERS`: UInt = 1048576u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WAB_PARAM` (
    public var `cbSize`: UInt,
    public var `hwnd`: `super`.`super`.`Foundation`.`HWND`,
    public var `szFileName`: `windows_sys`.`core`.`PSTR`,
    public var `ulFlags`: UInt,
    public var `guidPSExt`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 1198:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WAB_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WAB_PROFILE_CONTENTS`: UInt = 2097152u;
public const val `WAB_USE_OE_SENDMAIL`: UInt = 1u;
public const val `WAB_VCARD_FILE`: UInt = 0u;
public const val `WAB_VCARD_STREAM`: UInt = 1u;
// UNSUPPORTED Rust 1207:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union __UPV {
//     pub i: i16,
//     pub l: i32,
//     pub ul: u32,
//     pub flt: f32,
//     pub dbl: f64,
//     pub b: u16,
//     pub cur: super::Com::CY,
//     pub at: f64,
//     pub ft: super::super::Foundation::FILETIME,
//     pub lpszA: windows_sys::core::PSTR,
//     pub bin: SBinary,
//     pub lpszW: windows_sys::core::PWSTR,
//     pub lpguid: *mut windows_sys::core::GUID,
//     pub li: i64,
//     pub MVi: SShortArray,
//     pub MVl: SLongArray,
//     pub MVflt: SRealArray,
//     pub MVdbl: SDoubleArray,
//     pub MVcur: SCurrencyArray,
//     pub MVat: SAppTimeArray,
//     pub MVft: SDateTimeArray,
//     pub MVbin: SBinaryArray,
//     pub MVszA: SLPSTRArray,
//     pub MVszW: SWStringArray,
//     pub MVguid: SGuidArray,
//     pub MVli: SLargeIntegerArray,
//     pub err: i32,
//     pub x: i32,
// }

// UNSUPPORTED Rust 1240:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for __UPV {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `cchProfileNameMax`: UInt = 64u;
public const val `cchProfilePassMax`: UInt = 64u;
public const val `fMapiUnicode`: UInt = 0u;
public const val `genderFemale`: `Gender` = 1;
public const val `genderMale`: `Gender` = 2;
public const val `genderUnspecified`: `Gender` = 0;
public const val `hrSuccess`: UInt = 0u;
// UNSUPPORTED Rust 1253:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const szHrDispatchNotifications: windows_sys::core::PCSTR = windows_sys::core::s!("HrDispatchNotifications");

// UNSUPPORTED Rust 1254:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const szMAPINotificationMsg: windows_sys::core::PCSTR = windows_sys::core::s!("MAPI Notify window message");

// UNSUPPORTED Rust 1255:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const szScCreateConversationIndex: windows_sys::core::PCSTR = windows_sys::core::s!("ScCreateConversationIndex");

