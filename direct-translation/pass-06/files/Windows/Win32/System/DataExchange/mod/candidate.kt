// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=AddAtomA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddAtomA`(`lpstring` : `windows_sys`.`core`.`PCSTR`) : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=AddAtomW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddAtomW`(`lpstring` : `windows_sys`.`core`.`PCWSTR`) : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=AddClipboardFormatListener; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddClipboardFormatListener`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ChangeClipboardChain; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ChangeClipboardChain`(`hwndremove` : `super`.`super`.`Foundation`.`HWND`, `hwndnewnext` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CloseClipboard; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CloseClipboard`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CountClipboardFormats; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CountClipboardFormats`() : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeAbandonTransaction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdeAbandonTransaction`(`idinst` : UInt, `hconv` : `HCONV`, `idtransaction` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeAccessData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdeAccessData`(`hdata` : `HDDEDATA`, `pcbdatasize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeAddData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdeAddData`(`hdata` : `HDDEDATA`, `psrc` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cb` : UInt, `cboff` : UInt) : `HDDEDATA`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeClientTransaction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdeClientTransaction`(`pdata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbdata` : UInt, `hconv` : `HCONV`, `hszitem` : `HSZ`, `wfmt` : UInt, `wtype` : `DDE_CLIENT_TRANSACTION_TYPE`, `dwtimeout` : UInt, `pdwresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `HDDEDATA`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeCmpStringHandles; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdeCmpStringHandles`(`hsz1` : `HSZ`, `hsz2` : `HSZ`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeConnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `DdeConnect`(`idinst` : UInt, `hszservice` : `HSZ`, `hsztopic` : `HSZ`, `pcc` : /* Rust *const */ kotlinx.cinterop.CPointer<`CONVCONTEXT`>?) : `HCONV`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeConnectList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `DdeConnectList`(`idinst` : UInt, `hszservice` : `HSZ`, `hsztopic` : `HSZ`, `hconvlist` : `HCONVLIST`, `pcc` : /* Rust *const */ kotlinx.cinterop.CPointer<`CONVCONTEXT`>?) : `HCONVLIST`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeCreateDataHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdeCreateDataHandle`(`idinst` : UInt, `psrc` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cb` : UInt, `cboff` : UInt, `hszitem` : `HSZ`, `wfmt` : UInt, `afcmd` : UInt) : `HDDEDATA`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeCreateStringHandleA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdeCreateStringHandleA`(`idinst` : UInt, `psz` : `windows_sys`.`core`.`PCSTR`, `icodepage` : Int) : `HSZ`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeCreateStringHandleW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdeCreateStringHandleW`(`idinst` : UInt, `psz` : `windows_sys`.`core`.`PCWSTR`, `icodepage` : Int) : `HSZ`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeDisconnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdeDisconnect`(`hconv` : `HCONV`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeDisconnectList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdeDisconnectList`(`hconvlist` : `HCONVLIST`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeEnableCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdeEnableCallback`(`idinst` : UInt, `hconv` : `HCONV`, `wcmd` : `DDE_ENABLE_CALLBACK_CMD`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeFreeDataHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdeFreeDataHandle`(`hdata` : `HDDEDATA`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeFreeStringHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdeFreeStringHandle`(`idinst` : UInt, `hsz` : `HSZ`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeGetData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdeGetData`(`hdata` : `HDDEDATA`, `pdst` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbmax` : UInt, `cboff` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeGetLastError; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdeGetLastError`(`idinst` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeImpersonateClient; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdeImpersonateClient`(`hconv` : `HCONV`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeInitializeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdeInitializeA`(`pidinst` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pfncallback` : `PFNCALLBACK`, `afcmd` : `DDE_INITIALIZE_COMMAND`, `ulres` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeInitializeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdeInitializeW`(`pidinst` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pfncallback` : `PFNCALLBACK`, `afcmd` : `DDE_INITIALIZE_COMMAND`, `ulres` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeKeepStringHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdeKeepStringHandle`(`idinst` : UInt, `hsz` : `HSZ`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeNameService; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdeNameService`(`idinst` : UInt, `hsz1` : `HSZ`, `hsz2` : `HSZ`, `afcmd` : `DDE_NAME_SERVICE_CMD`) : `HDDEDATA`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdePostAdvise; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdePostAdvise`(`idinst` : UInt, `hsztopic` : `HSZ`, `hszitem` : `HSZ`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeQueryConvInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `DdeQueryConvInfo`(`hconv` : `HCONV`, `idtransaction` : UInt, `pconvinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CONVINFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeQueryNextServer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdeQueryNextServer`(`hconvlist` : `HCONVLIST`, `hconvprev` : `HCONV`) : `HCONV`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeQueryStringA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdeQueryStringA`(`idinst` : UInt, `hsz` : `HSZ`, `psz` : `windows_sys`.`core`.`PSTR`, `cchmax` : UInt, `icodepage` : Int) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeQueryStringW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdeQueryStringW`(`idinst` : UInt, `hsz` : `HSZ`, `psz` : `windows_sys`.`core`.`PWSTR`, `cchmax` : UInt, `icodepage` : Int) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeReconnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdeReconnect`(`hconv` : `HCONV`) : `HCONV`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeSetQualityOfService; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `DdeSetQualityOfService`(`hwndclient` : `super`.`super`.`Foundation`.`HWND`, `pqosnew` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_QUALITY_OF_SERVICE`>?, `pqosprev` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_QUALITY_OF_SERVICE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeSetUserHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdeSetUserHandle`(`hconv` : `HCONV`, `id` : UInt, `huser` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeUnaccessData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdeUnaccessData`(`hdata` : `HDDEDATA`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DdeUninitialize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdeUninitialize`(`idinst` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=DeleteAtom; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteAtom`(`natom` : UShort) : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EmptyClipboard; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EmptyClipboard`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EnumClipboardFormats; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumClipboardFormats`(`format` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindAtomA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindAtomA`(`lpstring` : `windows_sys`.`core`.`PCSTR`) : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindAtomW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindAtomW`(`lpstring` : `windows_sys`.`core`.`PCWSTR`) : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=FreeDDElParam; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FreeDDElParam`(`msg` : UInt, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetAtomNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetAtomNameA`(`natom` : UShort, `lpbuffer` : `windows_sys`.`core`.`PSTR`, `nsize` : Int) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetAtomNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetAtomNameW`(`natom` : UShort, `lpbuffer` : `windows_sys`.`core`.`PWSTR`, `nsize` : Int) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetClipboardData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetClipboardData`(`uformat` : UInt) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetClipboardFormatNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetClipboardFormatNameA`(`format` : UInt, `lpszformatname` : `windows_sys`.`core`.`PSTR`, `cchmaxcount` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetClipboardFormatNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetClipboardFormatNameW`(`format` : UInt, `lpszformatname` : `windows_sys`.`core`.`PWSTR`, `cchmaxcount` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetClipboardOwner; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetClipboardOwner`() : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetClipboardSequenceNumber; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetClipboardSequenceNumber`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetClipboardViewer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetClipboardViewer`() : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetOpenClipboardWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetOpenClipboardWindow`() : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetPriorityClipboardFormat; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPriorityClipboardFormat`(`paformatprioritylist` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `cformats` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetUpdatedClipboardFormats; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetUpdatedClipboardFormats`(`lpuiformats` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `cformats` : UInt, `pcformatsout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GlobalAddAtomA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GlobalAddAtomA`(`lpstring` : `windows_sys`.`core`.`PCSTR`) : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GlobalAddAtomExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GlobalAddAtomExA`(`lpstring` : `windows_sys`.`core`.`PCSTR`, `flags` : UInt) : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GlobalAddAtomExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GlobalAddAtomExW`(`lpstring` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt) : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GlobalAddAtomW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GlobalAddAtomW`(`lpstring` : `windows_sys`.`core`.`PCWSTR`) : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GlobalDeleteAtom; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GlobalDeleteAtom`(`natom` : UShort) : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GlobalFindAtomA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GlobalFindAtomA`(`lpstring` : `windows_sys`.`core`.`PCSTR`) : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GlobalFindAtomW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GlobalFindAtomW`(`lpstring` : `windows_sys`.`core`.`PCWSTR`) : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GlobalGetAtomNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GlobalGetAtomNameA`(`natom` : UShort, `lpbuffer` : `windows_sys`.`core`.`PSTR`, `nsize` : Int) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GlobalGetAtomNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GlobalGetAtomNameW`(`natom` : UShort, `lpbuffer` : `windows_sys`.`core`.`PWSTR`, `nsize` : Int) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ImpersonateDdeClientWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImpersonateDdeClientWindow`(`hwndclient` : `super`.`super`.`Foundation`.`HWND`, `hwndserver` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=InitAtomTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InitAtomTable`(`nsize` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsClipboardFormatAvailable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsClipboardFormatAvailable`(`format` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=OpenClipboard; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenClipboard`(`hwndnewowner` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=PackDDElParam; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PackDDElParam`(`msg` : UInt, `uilo` : ULong, `uihi` : ULong) : `super`.`super`.`Foundation`.`LPARAM`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RegisterClipboardFormatA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterClipboardFormatA`(`lpszformat` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RegisterClipboardFormatW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterClipboardFormatW`(`lpszformat` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RemoveClipboardFormatListener; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveClipboardFormatListener`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ReuseDDElParam; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReuseDDElParam`(`lparam` : `super`.`super`.`Foundation`.`LPARAM`, `msgin` : UInt, `msgout` : UInt, `uilo` : ULong, `uihi` : ULong) : `super`.`super`.`Foundation`.`LPARAM`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetClipboardData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetClipboardData`(`uformat` : UInt, `hmem` : `super`.`super`.`Foundation`.`HANDLE`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetClipboardViewer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetClipboardViewer`(`hwndnewviewer` : `super`.`super`.`Foundation`.`HWND`) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetWinMetaFileBits; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `SetWinMetaFileBits`(`nsize` : UInt, `lpmeta16data` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `hdcref` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `lpmfp` : /* Rust *const */ kotlinx.cinterop.CPointer<`METAFILEPICT`>?) : `super`.`super`.`Graphics`.`Gdi`.`HENHMETAFILE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=UnpackDDElParam; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnpackDDElParam`(`msg` : UInt, `lparam` : `super`.`super`.`Foundation`.`LPARAM`, `puilo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `puihi` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`BOOL`
public const val `APPCLASS_MASK`: Int = 15;
public const val `APPCLASS_MONITOR`: `DDE_INITIALIZE_COMMAND` = 1u;
public const val `APPCLASS_STANDARD`: `DDE_INITIALIZE_COMMAND` = 0u;
public const val `APPCMD_CLIENTONLY`: `DDE_INITIALIZE_COMMAND` = 16u;
public const val `APPCMD_FILTERINITS`: `DDE_INITIALIZE_COMMAND` = 32u;
public const val `APPCMD_MASK`: Int = 4080;
public const val `CADV_LATEACK`: UInt = 65535u;
public const val `CBF_FAIL_ADVISES`: `DDE_INITIALIZE_COMMAND` = 16384u;
public const val `CBF_FAIL_ALLSVRXACTIONS`: `DDE_INITIALIZE_COMMAND` = 258048u;
public const val `CBF_FAIL_CONNECTIONS`: `DDE_INITIALIZE_COMMAND` = 8192u;
public const val `CBF_FAIL_EXECUTES`: `DDE_INITIALIZE_COMMAND` = 32768u;
public const val `CBF_FAIL_POKES`: `DDE_INITIALIZE_COMMAND` = 65536u;
public const val `CBF_FAIL_REQUESTS`: `DDE_INITIALIZE_COMMAND` = 131072u;
public const val `CBF_FAIL_SELFCONNECTIONS`: `DDE_INITIALIZE_COMMAND` = 4096u;
public const val `CBF_SKIP_ALLNOTIFICATIONS`: `DDE_INITIALIZE_COMMAND` = 3932160u;
public const val `CBF_SKIP_CONNECT_CONFIRMS`: `DDE_INITIALIZE_COMMAND` = 262144u;
public const val `CBF_SKIP_DISCONNECTS`: `DDE_INITIALIZE_COMMAND` = 2097152u;
public const val `CBF_SKIP_REGISTRATIONS`: `DDE_INITIALIZE_COMMAND` = 524288u;
public const val `CBF_SKIP_UNREGISTRATIONS`: `DDE_INITIALIZE_COMMAND` = 1048576u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CONVCONTEXT` (
    public var `cb`: UInt,
    public var `wFlags`: UInt,
    public var `wCountryID`: UInt,
    public var `iCodePage`: Int,
    public var `dwLangID`: UInt,
    public var `dwSecurity`: UInt,
    public var `qos`: `super`.`super`.`Security`.`SECURITY_QUALITY_OF_SERVICE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CONVINFO` (
    public var `cb`: UInt,
    public var `hUser`: ULong,
    public var `hConvPartner`: `HCONV`,
    public var `hszSvcPartner`: `HSZ`,
    public var `hszServiceReq`: `HSZ`,
    public var `hszTopic`: `HSZ`,
    public var `hszItem`: `HSZ`,
    public var `wFmt`: UInt,
    public var `wType`: `DDE_CLIENT_TRANSACTION_TYPE`,
    public var `wStatus`: `CONVINFO_STATUS`,
    public var `wConvst`: `CONVINFO_CONVERSATION_STATE`,
    public var `wLastError`: UInt,
    public var `hConvList`: `HCONVLIST`,
    public var `ConvCtxt`: `CONVCONTEXT`,
    public var `hwnd`: `super`.`super`.`Foundation`.`HWND`,
    public var `hwndPartner`: `super`.`super`.`Foundation`.`HWND`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `CONVINFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]

    public fun `CONVINFO`.Companion.`default`() : `CONVINFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `CONVINFO_CONVERSATION_STATE` = UInt;
public typealias `CONVINFO_STATUS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COPYDATASTRUCT` (
    public var `dwData`: ULong,
    public var `cbData`: UInt,
    public var `lpData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `COPYDATASTRUCT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `COPYDATASTRUCT`.Companion.`default`() : `COPYDATASTRUCT` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `CP_WINANSI`: Int = 1004;
public const val `CP_WINNEUTRAL`: Int = 1200;
public const val `CP_WINUNICODE`: Int = 1200;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DDEACK` (
    public var `_bitfield`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DDEADVISE` (
    public var `_bitfield`: UShort,
    public var `cfFormat`: Short,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DDEDATA` (
    public var `_bitfield`: UShort,
    public var `cfFormat`: Short,
    public var `Value`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DDEDATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DDEDATA`.Companion.`default`() : `DDEDATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DDELN` (
    public var `_bitfield`: UShort,
    public var `cfFormat`: Short,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DDEML_MSG_HOOK_DATA` (
    public var `uiLo`: ULong,
    public var `uiHi`: ULong,
    public var `cbData`: UInt,
    public var `Data`: UIntArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DDEML_MSG_HOOK_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DDEML_MSG_HOOK_DATA`.Companion.`default`() : `DDEML_MSG_HOOK_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DDEPOKE` (
    public var `_bitfield`: UShort,
    public var `cfFormat`: Short,
    public var `Value`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DDEPOKE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DDEPOKE`.Companion.`default`() : `DDEPOKE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DDEUP` (
    public var `_bitfield`: UShort,
    public var `cfFormat`: Short,
    public var `rgb`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DDEUP`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DDEUP`.Companion.`default`() : `DDEUP` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `DDE_CLIENT_TRANSACTION_TYPE` = UInt;
public typealias `DDE_ENABLE_CALLBACK_CMD` = UInt;
public const val `DDE_FACK`: UInt = 32768u;
public const val `DDE_FACKREQ`: UInt = 32768u;
public const val `DDE_FAPPSTATUS`: UInt = 255u;
public const val `DDE_FBUSY`: UInt = 16384u;
public const val `DDE_FDEFERUPD`: UInt = 16384u;
public const val `DDE_FNOTPROCESSED`: UInt = 0u;
public const val `DDE_FRELEASE`: UInt = 8192u;
public const val `DDE_FREQUESTED`: UInt = 4096u;
public typealias `DDE_INITIALIZE_COMMAND` = UInt;
public typealias `DDE_NAME_SERVICE_CMD` = UInt;
public const val `DMLERR_ADVACKTIMEOUT`: UInt = 16384u;
public const val `DMLERR_BUSY`: UInt = 16385u;
public const val `DMLERR_DATAACKTIMEOUT`: UInt = 16386u;
public const val `DMLERR_DLL_NOT_INITIALIZED`: UInt = 16387u;
public const val `DMLERR_DLL_USAGE`: UInt = 16388u;
public const val `DMLERR_EXECACKTIMEOUT`: UInt = 16389u;
public const val `DMLERR_FIRST`: UInt = 16384u;
public const val `DMLERR_INVALIDPARAMETER`: UInt = 16390u;
public const val `DMLERR_LAST`: UInt = 16401u;
public const val `DMLERR_LOW_MEMORY`: UInt = 16391u;
public const val `DMLERR_MEMORY_ERROR`: UInt = 16392u;
public const val `DMLERR_NOTPROCESSED`: UInt = 16393u;
public const val `DMLERR_NO_CONV_ESTABLISHED`: UInt = 16394u;
public const val `DMLERR_NO_ERROR`: UInt = 0u;
public const val `DMLERR_POKEACKTIMEOUT`: UInt = 16395u;
public const val `DMLERR_POSTMSG_FAILED`: UInt = 16396u;
public const val `DMLERR_REENTRANCY`: UInt = 16397u;
public const val `DMLERR_SERVER_DIED`: UInt = 16398u;
public const val `DMLERR_SYS_ERROR`: UInt = 16399u;
public const val `DMLERR_UNADVACKTIMEOUT`: UInt = 16400u;
public const val `DMLERR_UNFOUND_QUEUE_ID`: UInt = 16401u;
public const val `DNS_FILTEROFF`: `DDE_NAME_SERVICE_CMD` = 8u;
public const val `DNS_FILTERON`: `DDE_NAME_SERVICE_CMD` = 4u;
public const val `DNS_REGISTER`: `DDE_NAME_SERVICE_CMD` = 1u;
public const val `DNS_UNREGISTER`: `DDE_NAME_SERVICE_CMD` = 2u;
public const val `EC_DISABLE`: `DDE_ENABLE_CALLBACK_CMD` = 8u;
public const val `EC_ENABLEALL`: `DDE_ENABLE_CALLBACK_CMD` = 0u;
public const val `EC_ENABLEONE`: `DDE_ENABLE_CALLBACK_CMD` = 128u;
public const val `EC_QUERYWAITING`: `DDE_ENABLE_CALLBACK_CMD` = 2u;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HCONV` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HCONVLIST` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public const val `HDATA_APPOWNED`: UInt = 1u;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDDEDATA` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HSZ` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HSZPAIR` (
    public var `hszSvc`: `HSZ`,
    public var `hszTopic`: `HSZ`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `HSZPAIR`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `HSZPAIR`.Companion.`default`() : `HSZPAIR` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `MAX_MONITORS`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `METAFILEPICT` (
    public var `mm`: Int,
    public var `xExt`: Int,
    public var `yExt`: Int,
    public var `hMF`: `super`.`super`.`Graphics`.`Gdi`.`HMETAFILE`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `METAFILEPICT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]

    public fun `METAFILEPICT`.Companion.`default`() : `METAFILEPICT` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `MF_CALLBACKS`: `DDE_INITIALIZE_COMMAND` = 134217728u;
public const val `MF_CONV`: `DDE_INITIALIZE_COMMAND` = 1073741824u;
public const val `MF_ERRORS`: `DDE_INITIALIZE_COMMAND` = 268435456u;
public const val `MF_HSZ_INFO`: `DDE_INITIALIZE_COMMAND` = 16777216u;
public const val `MF_LINKS`: `DDE_INITIALIZE_COMMAND` = 536870912u;
public const val `MF_MASK`: UInt = 4278190080u;
public const val `MF_POSTMSGS`: `DDE_INITIALIZE_COMMAND` = 67108864u;
public const val `MF_SENDMSGS`: `DDE_INITIALIZE_COMMAND` = 33554432u;
public const val `MH_CLEANUP`: UInt = 4u;
public const val `MH_CREATE`: UInt = 1u;
public const val `MH_DELETE`: UInt = 3u;
public const val `MH_KEEP`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MONCBSTRUCT` (
    public var `cb`: UInt,
    public var `dwTime`: UInt,
    public var `hTask`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `dwRet`: UInt,
    public var `wType`: UInt,
    public var `wFmt`: UInt,
    public var `hConv`: `HCONV`,
    public var `hsz1`: `HSZ`,
    public var `hsz2`: `HSZ`,
    public var `hData`: `HDDEDATA`,
    public var `dwData1`: ULong,
    public var `dwData2`: ULong,
    public var `cc`: `CONVCONTEXT`,
    public var `cbData`: UInt,
    public var `Data`: UIntArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MONCBSTRUCT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]

    public fun `MONCBSTRUCT`.Companion.`default`() : `MONCBSTRUCT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MONCONVSTRUCT` (
    public var `cb`: UInt,
    public var `fConnect`: `windows_sys`.`core`.`BOOL`,
    public var `dwTime`: UInt,
    public var `hTask`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `hszSvc`: `HSZ`,
    public var `hszTopic`: `HSZ`,
    public var `hConvClient`: `HCONV`,
    public var `hConvServer`: `HCONV`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MONCONVSTRUCT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MONCONVSTRUCT`.Companion.`default`() : `MONCONVSTRUCT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MONERRSTRUCT` (
    public var `cb`: UInt,
    public var `wLastError`: UInt,
    public var `dwTime`: UInt,
    public var `hTask`: `super`.`super`.`Foundation`.`HANDLE`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MONERRSTRUCT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MONERRSTRUCT`.Companion.`default`() : `MONERRSTRUCT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MONHSZSTRUCTA` (
    public var `cb`: UInt,
    public var `fsAction`: `windows_sys`.`core`.`BOOL`,
    public var `dwTime`: UInt,
    public var `hsz`: `HSZ`,
    public var `hTask`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `str`: ByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MONHSZSTRUCTA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MONHSZSTRUCTA`.Companion.`default`() : `MONHSZSTRUCTA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MONHSZSTRUCTW` (
    public var `cb`: UInt,
    public var `fsAction`: `windows_sys`.`core`.`BOOL`,
    public var `dwTime`: UInt,
    public var `hsz`: `HSZ`,
    public var `hTask`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `str`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MONHSZSTRUCTW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MONHSZSTRUCTW`.Companion.`default`() : `MONHSZSTRUCTW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MONLINKSTRUCT` (
    public var `cb`: UInt,
    public var `dwTime`: UInt,
    public var `hTask`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `fEstablished`: `windows_sys`.`core`.`BOOL`,
    public var `fNoData`: `windows_sys`.`core`.`BOOL`,
    public var `hszSvc`: `HSZ`,
    public var `hszTopic`: `HSZ`,
    public var `hszItem`: `HSZ`,
    public var `wFmt`: UInt,
    public var `fServer`: `windows_sys`.`core`.`BOOL`,
    public var `hConvServer`: `HCONV`,
    public var `hConvClient`: `HCONV`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MONLINKSTRUCT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MONLINKSTRUCT`.Companion.`default`() : `MONLINKSTRUCT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MONMSGSTRUCT` (
    public var `cb`: UInt,
    public var `hwndTo`: `super`.`super`.`Foundation`.`HWND`,
    public var `dwTime`: UInt,
    public var `hTask`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `wMsg`: UInt,
    public var `wParam`: `super`.`super`.`Foundation`.`WPARAM`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `dmhd`: `DDEML_MSG_HOOK_DATA`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MONMSGSTRUCT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MONMSGSTRUCT`.Companion.`default`() : `MONMSGSTRUCT` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `MSGF_DDEMGR`: UInt = 32769u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNCALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, `HCONV`, `HSZ`, `HSZ`, `HDDEDATA`, ULong, ULong) -> `HDDEDATA`>>>;
public const val `QID_SYNC`: UInt = 4294967295u;
public const val `ST_ADVISE`: `CONVINFO_STATUS` = 2u;
public const val `ST_BLOCKED`: `CONVINFO_STATUS` = 8u;
public const val `ST_BLOCKNEXT`: `CONVINFO_STATUS` = 128u;
public const val `ST_CLIENT`: `CONVINFO_STATUS` = 16u;
public const val `ST_CONNECTED`: `CONVINFO_STATUS` = 1u;
public const val `ST_INLIST`: `CONVINFO_STATUS` = 64u;
public const val `ST_ISLOCAL`: `CONVINFO_STATUS` = 4u;
public const val `ST_ISSELF`: `CONVINFO_STATUS` = 256u;
public const val `ST_TERMINATED`: `CONVINFO_STATUS` = 32u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SZDDESYS_ITEM_FORMATS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Formats");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SZDDESYS_ITEM_HELP`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Help");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SZDDESYS_ITEM_RTNMSG`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ReturnMessage");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SZDDESYS_ITEM_STATUS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Status");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SZDDESYS_ITEM_SYSITEMS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SysItems");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SZDDESYS_ITEM_TOPICS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Topics");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SZDDESYS_TOPIC`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("System");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SZDDE_ITEM_ITEMLIST`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TopicItemList");
public const val `TIMEOUT_ASYNC`: UInt = 4294967295u;
public const val `WM_DDE_ACK`: UInt = 996u;
public const val `WM_DDE_ADVISE`: UInt = 994u;
public const val `WM_DDE_DATA`: UInt = 997u;
public const val `WM_DDE_EXECUTE`: UInt = 1000u;
public const val `WM_DDE_FIRST`: UInt = 992u;
public const val `WM_DDE_INITIATE`: UInt = 992u;
public const val `WM_DDE_LAST`: UInt = 1000u;
public const val `WM_DDE_POKE`: UInt = 999u;
public const val `WM_DDE_REQUEST`: UInt = 998u;
public const val `WM_DDE_TERMINATE`: UInt = 993u;
public const val `WM_DDE_UNADVISE`: UInt = 995u;
public const val `XCLASS_BOOL`: UInt = 4096u;
public const val `XCLASS_DATA`: UInt = 8192u;
public const val `XCLASS_FLAGS`: UInt = 16384u;
public const val `XCLASS_MASK`: UInt = 64512u;
public const val `XCLASS_NOTIFICATION`: UInt = 32768u;
public const val `XST_ADVACKRCVD`: `CONVINFO_CONVERSATION_STATE` = 13u;
public const val `XST_ADVDATAACKRCVD`: `CONVINFO_CONVERSATION_STATE` = 16u;
public const val `XST_ADVDATASENT`: `CONVINFO_CONVERSATION_STATE` = 15u;
public const val `XST_ADVSENT`: `CONVINFO_CONVERSATION_STATE` = 11u;
public const val `XST_CONNECTED`: `CONVINFO_CONVERSATION_STATE` = 2u;
public const val `XST_DATARCVD`: `CONVINFO_CONVERSATION_STATE` = 6u;
public const val `XST_EXECACKRCVD`: `CONVINFO_CONVERSATION_STATE` = 10u;
public const val `XST_EXECSENT`: `CONVINFO_CONVERSATION_STATE` = 9u;
public const val `XST_INCOMPLETE`: `CONVINFO_CONVERSATION_STATE` = 1u;
public const val `XST_INIT1`: `CONVINFO_CONVERSATION_STATE` = 3u;
public const val `XST_INIT2`: `CONVINFO_CONVERSATION_STATE` = 4u;
public const val `XST_NULL`: `CONVINFO_CONVERSATION_STATE` = 0u;
public const val `XST_POKEACKRCVD`: `CONVINFO_CONVERSATION_STATE` = 8u;
public const val `XST_POKESENT`: `CONVINFO_CONVERSATION_STATE` = 7u;
public const val `XST_REQSENT`: `CONVINFO_CONVERSATION_STATE` = 5u;
public const val `XST_UNADVACKRCVD`: `CONVINFO_CONVERSATION_STATE` = 14u;
public const val `XST_UNADVSENT`: `CONVINFO_CONVERSATION_STATE` = 12u;
public const val `XTYPF_ACKREQ`: UInt = 8u;
public const val `XTYPF_NOBLOCK`: UInt = 2u;
public const val `XTYPF_NODATA`: UInt = 4u;
public const val `XTYP_ADVDATA`: `DDE_CLIENT_TRANSACTION_TYPE` = 16400u;
public const val `XTYP_ADVREQ`: `DDE_CLIENT_TRANSACTION_TYPE` = 8226u;
public const val `XTYP_ADVSTART`: `DDE_CLIENT_TRANSACTION_TYPE` = 4144u;
public const val `XTYP_ADVSTOP`: `DDE_CLIENT_TRANSACTION_TYPE` = 32832u;
public const val `XTYP_CONNECT`: `DDE_CLIENT_TRANSACTION_TYPE` = 4194u;
public const val `XTYP_CONNECT_CONFIRM`: `DDE_CLIENT_TRANSACTION_TYPE` = 32882u;
public const val `XTYP_DISCONNECT`: `DDE_CLIENT_TRANSACTION_TYPE` = 32962u;
public const val `XTYP_EXECUTE`: `DDE_CLIENT_TRANSACTION_TYPE` = 16464u;
public const val `XTYP_MASK`: UInt = 240u;
public const val `XTYP_MONITOR`: `DDE_CLIENT_TRANSACTION_TYPE` = 33010u;
public const val `XTYP_POKE`: `DDE_CLIENT_TRANSACTION_TYPE` = 16528u;
public const val `XTYP_REGISTER`: `DDE_CLIENT_TRANSACTION_TYPE` = 32930u;
public const val `XTYP_REQUEST`: `DDE_CLIENT_TRANSACTION_TYPE` = 8368u;
public const val `XTYP_SHIFT`: UInt = 4u;
public const val `XTYP_UNREGISTER`: `DDE_CLIENT_TRANSACTION_TYPE` = 32978u;
public const val `XTYP_WILDCONNECT`: `DDE_CLIENT_TRANSACTION_TYPE` = 8418u;
public const val `XTYP_XACT_COMPLETE`: `DDE_CLIENT_TRANSACTION_TYPE` = 32896u;
