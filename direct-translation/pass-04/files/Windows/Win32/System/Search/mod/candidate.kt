// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Mod has no candidate rule; syntax: no per-file syntax rule for Mod
// #[cfg(feature = "Win32_System_Search_Common")]
// pub mod Common;

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=ODBCGetTryWaitValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ODBCGetTryWaitValue`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=ODBCSetTryWaitValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ODBCSetTryWaitValue`(`dwvalue` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLAllocConnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLAllocConnect`(`environmenthandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `connectionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLAllocEnv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLAllocEnv`(`environmenthandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLAllocHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLAllocHandle`(`handletype` : Short, `inputhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `outputhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLAllocHandleStd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLAllocHandleStd`(`fhandletype` : Short, `hinput` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phoutput` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLAllocStmt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLAllocStmt`(`connectionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLBindCol; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLBindCol`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `columnnumber` : UShort, `targettype` : Short, `targetvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferlength` : Int, `strlen_or_ind` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLBindCol; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLBindCol`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `columnnumber` : UShort, `targettype` : Short, `targetvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferlength` : Long, `strlen_or_ind` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLBindParam; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLBindParam`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `parameternumber` : UShort, `valuetype` : Short, `parametertype` : Short, `lengthprecision` : UInt, `parameterscale` : Short, `parametervalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `strlen_or_ind` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLBindParam; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLBindParam`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `parameternumber` : UShort, `valuetype` : Short, `parametertype` : Short, `lengthprecision` : ULong, `parameterscale` : Short, `parametervalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `strlen_or_ind` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLBindParameter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLBindParameter`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ipar` : UShort, `fparamtype` : Short, `fctype` : Short, `fsqltype` : Short, `cbcoldef` : UInt, `ibscale` : Short, `rgbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbvaluemax` : Int, `pcbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLBindParameter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLBindParameter`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ipar` : UShort, `fparamtype` : Short, `fctype` : Short, `fsqltype` : Short, `cbcoldef` : ULong, `ibscale` : Short, `rgbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbvaluemax` : Long, `pcbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLBrowseConnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLBrowseConnect`(`hdbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szconnstrin` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchconnstrin` : Short, `szconnstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchconnstroutmax` : Short, `pcchconnstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLBrowseConnectA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLBrowseConnectA`(`hdbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szconnstrin` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbconnstrin` : Short, `szconnstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbconnstroutmax` : Short, `pcbconnstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLBrowseConnectW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLBrowseConnectW`(`hdbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szconnstrin` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchconnstrin` : Short, `szconnstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchconnstroutmax` : Short, `pcchconnstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLBulkOperations; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLBulkOperations`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `operation` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLCancel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLCancel`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLCancelHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLCancelHandle`(`handletype` : Short, `inputhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLCloseCursor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLCloseCursor`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbcbcp.dll, ABI=system, export=SQLCloseEnumServers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLCloseEnumServers`(`henumhandle` : `super`.`super`.`Foundation`.`HANDLE`) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLColAttribute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLColAttribute`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `columnnumber` : UShort, `fieldidentifier` : UShort, `characterattribute` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferlength` : Short, `stringlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `numericattribute` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLColAttribute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLColAttribute`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `columnnumber` : UShort, `fieldidentifier` : UShort, `characterattribute` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferlength` : Short, `stringlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `numericattribute` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLColAttributeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLColAttributeA`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `icol` : Short, `ifield` : Short, `pcharattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbcharattrmax` : Short, `pcbcharattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pnumattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLColAttributeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLColAttributeA`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `icol` : Short, `ifield` : Short, `pcharattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbcharattrmax` : Short, `pcbcharattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pnumattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLColAttributeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLColAttributeW`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `icol` : UShort, `ifield` : UShort, `pcharattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbdescmax` : Short, `pcbcharattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pnumattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLColAttributeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLColAttributeW`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `icol` : UShort, `ifield` : UShort, `pcharattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbdescmax` : Short, `pcbcharattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pnumattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLColAttributes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLColAttributes`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `icol` : UShort, `fdesctype` : UShort, `rgbdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbdescmax` : Short, `pcbdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pfdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLColAttributes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLColAttributes`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `icol` : UShort, `fdesctype` : UShort, `rgbdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbdescmax` : Short, `pcbdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pfdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLColAttributesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLColAttributesA`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `icol` : UShort, `fdesctype` : UShort, `rgbdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbdescmax` : Short, `pcbdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pfdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLColAttributesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLColAttributesA`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `icol` : UShort, `fdesctype` : UShort, `rgbdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbdescmax` : Short, `pcbdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pfdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLColAttributesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLColAttributesW`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `icol` : UShort, `fdesctype` : UShort, `rgbdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbdescmax` : Short, `pcbdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pfdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLColAttributesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLColAttributesW`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `icol` : UShort, `fdesctype` : UShort, `rgbdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbdescmax` : Short, `pcbdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pfdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLColumnPrivileges; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLColumnPrivileges`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchcatalogname` : Short, `szschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchschemaname` : Short, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchtablename` : Short, `szcolumnname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchcolumnname` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLColumnPrivilegesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLColumnPrivilegesA`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbcatalogname` : Short, `szschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbschemaname` : Short, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbtablename` : Short, `szcolumnname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbcolumnname` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLColumnPrivilegesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLColumnPrivilegesW`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchcatalogname` : Short, `szschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchschemaname` : Short, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchtablename` : Short, `szcolumnname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchcolumnname` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLColumns; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLColumns`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `catalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `namelength1` : Short, `schemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `namelength2` : Short, `tablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `namelength3` : Short, `columnname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `namelength4` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLColumnsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLColumnsA`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbcatalogname` : Short, `szschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbschemaname` : Short, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbtablename` : Short, `szcolumnname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbcolumnname` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLColumnsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLColumnsW`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchcatalogname` : Short, `szschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchschemaname` : Short, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchtablename` : Short, `szcolumnname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchcolumnname` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLCompleteAsync; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLCompleteAsync`(`handletype` : Short, `handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `asyncretcodeptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLConnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLConnect`(`connectionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `servername` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `namelength1` : Short, `username` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `namelength2` : Short, `authentication` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `namelength3` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLConnectA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLConnectA`(`hdbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szdsn` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbdsn` : Short, `szuid` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbuid` : Short, `szauthstr` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbauthstr` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLConnectW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLConnectW`(`hdbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szdsn` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchdsn` : Short, `szuid` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchuid` : Short, `szauthstr` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchauthstr` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLCopyDesc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLCopyDesc`(`sourcedeschandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `targetdeschandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLDataSources; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLDataSources`(`environmenthandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `direction` : UShort, `servername` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `bufferlength1` : Short, `namelength1ptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `description` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `bufferlength2` : Short, `namelength2ptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLDataSourcesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLDataSourcesA`(`henv` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fdirection` : UShort, `szdsn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbdsnmax` : Short, `pcbdsn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `szdescription` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbdescriptionmax` : Short, `pcbdescription` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLDataSourcesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLDataSourcesW`(`henv` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fdirection` : UShort, `szdsn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchdsnmax` : Short, `pcchdsn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `wszdescription` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchdescriptionmax` : Short, `pcchdescription` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLDescribeCol; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLDescribeCol`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `columnnumber` : UShort, `columnname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `bufferlength` : Short, `namelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `datatype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `columnsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `decimaldigits` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `nullable` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLDescribeCol; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLDescribeCol`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `columnnumber` : UShort, `columnname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `bufferlength` : Short, `namelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `datatype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `columnsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `decimaldigits` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `nullable` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLDescribeColA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLDescribeColA`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `icol` : UShort, `szcolname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbcolnamemax` : Short, `pcbcolname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pfsqltype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pcbcoldef` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pibscale` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pfnullable` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLDescribeColA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLDescribeColA`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `icol` : UShort, `szcolname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbcolnamemax` : Short, `pcbcolname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pfsqltype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pcbcoldef` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `pibscale` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pfnullable` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLDescribeColW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLDescribeColW`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `icol` : UShort, `szcolname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchcolnamemax` : Short, `pcchcolname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pfsqltype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pcbcoldef` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pibscale` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pfnullable` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLDescribeColW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLDescribeColW`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `icol` : UShort, `szcolname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchcolnamemax` : Short, `pcchcolname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pfsqltype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pcbcoldef` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `pibscale` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pfnullable` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLDescribeParam; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLDescribeParam`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ipar` : UShort, `pfsqltype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pcbparamdef` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pibscale` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pfnullable` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLDescribeParam; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLDescribeParam`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ipar` : UShort, `pfsqltype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pcbparamdef` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `pibscale` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pfnullable` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLDisconnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLDisconnect`(`connectionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLDriverConnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLDriverConnect`(`hdbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `hwnd` : Long, `szconnstrin` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchconnstrin` : Short, `szconnstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchconnstroutmax` : Short, `pcchconnstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `fdrivercompletion` : UShort) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLDriverConnectA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLDriverConnectA`(`hdbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `hwnd` : Long, `szconnstrin` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbconnstrin` : Short, `szconnstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbconnstroutmax` : Short, `pcbconnstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `fdrivercompletion` : UShort) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLDriverConnectW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLDriverConnectW`(`hdbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `hwnd` : Long, `szconnstrin` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchconnstrin` : Short, `szconnstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchconnstroutmax` : Short, `pcchconnstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `fdrivercompletion` : UShort) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLDrivers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLDrivers`(`henv` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fdirection` : UShort, `szdriverdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchdriverdescmax` : Short, `pcchdriverdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `szdriverattributes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchdrvrattrmax` : Short, `pcchdrvrattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLDriversA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLDriversA`(`henv` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fdirection` : UShort, `szdriverdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbdriverdescmax` : Short, `pcbdriverdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `szdriverattributes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbdrvrattrmax` : Short, `pcbdrvrattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLDriversW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLDriversW`(`henv` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fdirection` : UShort, `szdriverdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchdriverdescmax` : Short, `pcchdriverdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `szdriverattributes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchdrvrattrmax` : Short, `pcchdrvrattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLEndTran; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLEndTran`(`handletype` : Short, `handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `completiontype` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLError; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLError`(`environmenthandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `connectionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `sqlstate` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `nativeerror` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `messagetext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `bufferlength` : Short, `textlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLErrorA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLErrorA`(`henv` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `hdbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szsqlstate` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pfnativeerror` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `szerrormsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cberrormsgmax` : Short, `pcberrormsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLErrorW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLErrorW`(`henv` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `hdbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `wszsqlstate` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pfnativeerror` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `wszerrormsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `ccherrormsgmax` : Short, `pccherrormsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLExecDirect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLExecDirect`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `statementtext` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `textlength` : Int) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLExecDirectA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLExecDirectA`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szsqlstr` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbsqlstr` : Int) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLExecDirectW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLExecDirectW`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szsqlstr` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `textlength` : Int) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLExecute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLExecute`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLExtendedFetch; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLExtendedFetch`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ffetchtype` : UShort, `irow` : Int, `pcrow` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `rgfrowstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLExtendedFetch; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLExtendedFetch`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ffetchtype` : UShort, `irow` : Long, `pcrow` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `rgfrowstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLFetch; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLFetch`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLFetchScroll; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLFetchScroll`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fetchorientation` : Short, `fetchoffset` : Int) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLFetchScroll; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLFetchScroll`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fetchorientation` : Short, `fetchoffset` : Long) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLForeignKeys; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLForeignKeys`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szpkcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchpkcatalogname` : Short, `szpkschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchpkschemaname` : Short, `szpktablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchpktablename` : Short, `szfkcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchfkcatalogname` : Short, `szfkschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchfkschemaname` : Short, `szfktablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchfktablename` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLForeignKeysA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLForeignKeysA`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szpkcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbpkcatalogname` : Short, `szpkschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbpkschemaname` : Short, `szpktablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbpktablename` : Short, `szfkcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbfkcatalogname` : Short, `szfkschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbfkschemaname` : Short, `szfktablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbfktablename` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLForeignKeysW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLForeignKeysW`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szpkcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchpkcatalogname` : Short, `szpkschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchpkschemaname` : Short, `szpktablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchpktablename` : Short, `szfkcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchfkcatalogname` : Short, `szfkschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchfkschemaname` : Short, `szfktablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchfktablename` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLFreeConnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLFreeConnect`(`connectionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLFreeEnv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLFreeEnv`(`environmenthandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLFreeHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLFreeHandle`(`handletype` : Short, `handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLFreeStmt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLFreeStmt`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `option` : UShort) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetConnectAttr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetConnectAttr`(`connectionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `attribute` : Int, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferlength` : Int, `stringlengthptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetConnectAttrA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetConnectAttrA`(`hdbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fattribute` : Int, `rgbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbvaluemax` : Int, `pcbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetConnectAttrW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetConnectAttrW`(`hdbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fattribute` : Int, `rgbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbvaluemax` : Int, `pcbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetConnectOption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetConnectOption`(`connectionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `option` : UShort, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetConnectOptionA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetConnectOptionA`(`hdbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `foption` : UShort, `pvparam` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetConnectOptionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetConnectOptionW`(`hdbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `foption` : UShort, `pvparam` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetCursorName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetCursorName`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cursorname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `bufferlength` : Short, `namelengthptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetCursorNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetCursorNameA`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szcursor` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbcursormax` : Short, `pcbcursor` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetCursorNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetCursorNameW`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szcursor` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchcursormax` : Short, `pcchcursor` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLGetData`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `columnnumber` : UShort, `targettype` : Short, `targetvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferlength` : Int, `strlen_or_indptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLGetData`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `columnnumber` : UShort, `targettype` : Short, `targetvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferlength` : Long, `strlen_or_indptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetDescField; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetDescField`(`descriptorhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `recnumber` : Short, `fieldidentifier` : Short, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferlength` : Int, `stringlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetDescFieldA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetDescFieldA`(`hdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `irecord` : Short, `ifield` : Short, `rgbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbbufferlength` : Int, `stringlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetDescFieldW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetDescFieldW`(`hdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `irecord` : Short, `ifield` : Short, `rgbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbbufferlength` : Int, `stringlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetDescRec; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLGetDescRec`(`descriptorhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `recnumber` : Short, `name` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `bufferlength` : Short, `stringlengthptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `typeptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `subtypeptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `lengthptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `precisionptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `scaleptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `nullableptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetDescRec; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLGetDescRec`(`descriptorhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `recnumber` : Short, `name` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `bufferlength` : Short, `stringlengthptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `typeptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `subtypeptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `lengthptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `precisionptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `scaleptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `nullableptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetDescRecA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLGetDescRecA`(`hdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `irecord` : Short, `szname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbnamemax` : Short, `pcbname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pftype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pfsubtype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `plength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `pprecision` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pscale` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pnullable` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetDescRecA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLGetDescRecA`(`hdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `irecord` : Short, `szname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbnamemax` : Short, `pcbname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pftype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pfsubtype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `plength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `pprecision` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pscale` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pnullable` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetDescRecW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLGetDescRecW`(`hdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `irecord` : Short, `szname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchnamemax` : Short, `pcchname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pftype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pfsubtype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `plength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `pprecision` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pscale` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pnullable` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetDescRecW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLGetDescRecW`(`hdesc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `irecord` : Short, `szname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchnamemax` : Short, `pcchname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pftype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pfsubtype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `plength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `pprecision` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pscale` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `pnullable` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetDiagField; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetDiagField`(`handletype` : Short, `handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `recnumber` : Short, `diagidentifier` : Short, `diaginfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferlength` : Short, `stringlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetDiagFieldA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetDiagFieldA`(`fhandletype` : Short, `handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `irecord` : Short, `fdiagfield` : Short, `rgbdiaginfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbdiaginfomax` : Short, `pcbdiaginfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetDiagFieldW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetDiagFieldW`(`fhandletype` : Short, `handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `irecord` : Short, `fdiagfield` : Short, `rgbdiaginfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbbufferlength` : Short, `pcbstringlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetDiagRec; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetDiagRec`(`handletype` : Short, `handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `recnumber` : Short, `sqlstate` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `nativeerror` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `messagetext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `bufferlength` : Short, `textlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetDiagRecA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetDiagRecA`(`fhandletype` : Short, `handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `irecord` : Short, `szsqlstate` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pfnativeerror` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `szerrormsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cberrormsgmax` : Short, `pcberrormsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetDiagRecW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetDiagRecW`(`fhandletype` : Short, `handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `irecord` : Short, `szsqlstate` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pfnativeerror` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `szerrormsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `ccherrormsgmax` : Short, `pccherrormsg` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetEnvAttr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetEnvAttr`(`environmenthandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `attribute` : Int, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferlength` : Int, `stringlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetFunctions; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetFunctions`(`connectionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `functionid` : UShort, `supported` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetInfo`(`connectionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `infotype` : UShort, `infovalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferlength` : Short, `stringlengthptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetInfoA`(`hdbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `finfotype` : UShort, `rgbinfovalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbinfovaluemax` : Short, `pcbinfovalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetInfoW`(`hdbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `finfotype` : UShort, `rgbinfovalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbinfovaluemax` : Short, `pcbinfovalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbcbcp.dll, ABI=system, export=SQLGetNextEnumeration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetNextEnumeration`(`henumhandle` : `super`.`super`.`Foundation`.`HANDLE`, `prgenumdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pienumlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetStmtAttr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetStmtAttr`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `attribute` : Int, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferlength` : Int, `stringlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetStmtAttrA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetStmtAttrA`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fattribute` : Int, `rgbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbvaluemax` : Int, `pcbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetStmtAttrW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetStmtAttrW`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fattribute` : Int, `rgbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbvaluemax` : Int, `pcbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetStmtOption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetStmtOption`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `option` : UShort, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetTypeInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetTypeInfo`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `datatype` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetTypeInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetTypeInfoA`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `datatype` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLGetTypeInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLGetTypeInfoW`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `datatype` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbcbcp.dll, ABI=system, export=SQLInitEnumServers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLInitEnumServers`(`pwchservername` : `windows_sys`.`core`.`PCWSTR`, `pwchinstancename` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbcbcp.dll, ABI=system, export=SQLLinkedCatalogsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLLinkedCatalogsA`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param1` : `windows_sys`.`core`.`PCSTR`, `param2` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbcbcp.dll, ABI=system, export=SQLLinkedCatalogsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLLinkedCatalogsW`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param1` : `windows_sys`.`core`.`PCWSTR`, `param2` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbcbcp.dll, ABI=system, export=SQLLinkedServers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLLinkedServers`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLMoreResults; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLMoreResults`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLNativeSql; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLNativeSql`(`hdbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szsqlstrin` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchsqlstrin` : Int, `szsqlstr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchsqlstrmax` : Int, `pcbsqlstr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLNativeSqlA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLNativeSqlA`(`hdbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szsqlstrin` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbsqlstrin` : Int, `szsqlstr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbsqlstrmax` : Int, `pcbsqlstr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLNativeSqlW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLNativeSqlW`(`hdbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szsqlstrin` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchsqlstrin` : Int, `szsqlstr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchsqlstrmax` : Int, `pcchsqlstr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLNumParams; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLNumParams`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pcpar` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLNumResultCols; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLNumResultCols`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `columncount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLParamData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLParamData`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLParamOptions; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLParamOptions`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `crow` : UInt, `pirow` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLParamOptions; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLParamOptions`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `crow` : ULong, `pirow` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLPrepare; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLPrepare`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `statementtext` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `textlength` : Int) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLPrepareA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLPrepareA`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szsqlstr` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbsqlstr` : Int) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLPrepareW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLPrepareW`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szsqlstr` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchsqlstr` : Int) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLPrimaryKeys; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLPrimaryKeys`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchcatalogname` : Short, `szschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchschemaname` : Short, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchtablename` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLPrimaryKeysA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLPrimaryKeysA`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbcatalogname` : Short, `szschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbschemaname` : Short, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbtablename` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLPrimaryKeysW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLPrimaryKeysW`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchcatalogname` : Short, `szschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchschemaname` : Short, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchtablename` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLProcedureColumns; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLProcedureColumns`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchcatalogname` : Short, `szschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchschemaname` : Short, `szprocname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchprocname` : Short, `szcolumnname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchcolumnname` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLProcedureColumnsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLProcedureColumnsA`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbcatalogname` : Short, `szschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbschemaname` : Short, `szprocname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbprocname` : Short, `szcolumnname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbcolumnname` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLProcedureColumnsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLProcedureColumnsW`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchcatalogname` : Short, `szschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchschemaname` : Short, `szprocname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchprocname` : Short, `szcolumnname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchcolumnname` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLProcedures; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLProcedures`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchcatalogname` : Short, `szschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchschemaname` : Short, `szprocname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchprocname` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLProceduresA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLProceduresA`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbcatalogname` : Short, `szschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbschemaname` : Short, `szprocname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbprocname` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLProceduresW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLProceduresW`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchcatalogname` : Short, `szschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchschemaname` : Short, `szprocname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchprocname` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLPutData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLPutData`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `strlen_or_ind` : Int) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLPutData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLPutData`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `strlen_or_ind` : Long) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLRowCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLRowCount`(`statementhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `rowcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLRowCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLRowCount`(`statementhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `rowcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSetConnectAttr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLSetConnectAttr`(`connectionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `attribute` : Int, `value` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `stringlength` : Int) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSetConnectAttrA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLSetConnectAttrA`(`hdbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fattribute` : Int, `rgbvalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbvalue` : Int) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSetConnectAttrW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLSetConnectAttrW`(`hdbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fattribute` : Int, `rgbvalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbvalue` : Int) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSetConnectOption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLSetConnectOption`(`connectionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `option` : UShort, `value` : UInt) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSetConnectOption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLSetConnectOption`(`connectionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `option` : UShort, `value` : ULong) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSetConnectOptionA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLSetConnectOptionA`(`hdbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `foption` : UShort, `vparam` : UInt) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSetConnectOptionA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLSetConnectOptionA`(`hdbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `foption` : UShort, `vparam` : ULong) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSetConnectOptionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLSetConnectOptionW`(`hdbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `foption` : UShort, `vparam` : UInt) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSetConnectOptionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLSetConnectOptionW`(`hdbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `foption` : UShort, `vparam` : ULong) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSetCursorName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLSetCursorName`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cursorname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `namelength` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSetCursorNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLSetCursorNameA`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szcursor` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbcursor` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSetCursorNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLSetCursorNameW`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szcursor` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchcursor` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSetDescField; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLSetDescField`(`descriptorhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `recnumber` : Short, `fieldidentifier` : Short, `value` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferlength` : Int) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSetDescFieldW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLSetDescFieldW`(`descriptorhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `recnumber` : Short, `fieldidentifier` : Short, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferlength` : Int) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSetDescRec; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLSetDescRec`(`descriptorhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `recnumber` : Short, `type` : Short, `subtype` : Short, `length` : Int, `precision` : Short, `scale` : Short, `data` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `stringlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `indicator` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSetDescRec; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLSetDescRec`(`descriptorhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `recnumber` : Short, `type` : Short, `subtype` : Short, `length` : Long, `precision` : Short, `scale` : Short, `data` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `stringlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `indicator` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSetEnvAttr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLSetEnvAttr`(`environmenthandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `attribute` : Int, `value` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `stringlength` : Int) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSetParam; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLSetParam`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `parameternumber` : UShort, `valuetype` : Short, `parametertype` : Short, `lengthprecision` : UInt, `parameterscale` : Short, `parametervalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `strlen_or_ind` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSetParam; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLSetParam`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `parameternumber` : UShort, `valuetype` : Short, `parametertype` : Short, `lengthprecision` : ULong, `parameterscale` : Short, `parametervalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `strlen_or_ind` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSetPos; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLSetPos`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `irow` : UShort, `foption` : UShort, `flock` : UShort) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSetPos; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLSetPos`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `irow` : ULong, `foption` : UShort, `flock` : UShort) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSetScrollOptions; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLSetScrollOptions`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fconcurrency` : UShort, `crowkeyset` : Int, `crowrowset` : UShort) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSetScrollOptions; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLSetScrollOptions`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fconcurrency` : UShort, `crowkeyset` : Long, `crowrowset` : UShort) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSetStmtAttr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLSetStmtAttr`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `attribute` : Int, `value` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `stringlength` : Int) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSetStmtAttrW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLSetStmtAttrW`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fattribute` : Int, `rgbvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbvaluemax` : Int) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSetStmtOption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SQLSetStmtOption`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `option` : UShort, `value` : UInt) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSetStmtOption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `SQLSetStmtOption`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `option` : UShort, `value` : ULong) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSpecialColumns; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLSpecialColumns`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `identifiertype` : UShort, `catalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `namelength1` : Short, `schemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `namelength2` : Short, `tablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `namelength3` : Short, `scope` : UShort, `nullable` : UShort) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSpecialColumnsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLSpecialColumnsA`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fcoltype` : UShort, `szcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbcatalogname` : Short, `szschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbschemaname` : Short, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbtablename` : Short, `fscope` : UShort, `fnullable` : UShort) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLSpecialColumnsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLSpecialColumnsW`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fcoltype` : UShort, `szcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchcatalogname` : Short, `szschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchschemaname` : Short, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchtablename` : Short, `fscope` : UShort, `fnullable` : UShort) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLStatistics; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLStatistics`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `catalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `namelength1` : Short, `schemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `namelength2` : Short, `tablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `namelength3` : Short, `unique` : UShort, `reserved` : UShort) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLStatisticsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLStatisticsA`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbcatalogname` : Short, `szschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbschemaname` : Short, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbtablename` : Short, `funique` : UShort, `faccuracy` : UShort) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLStatisticsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLStatisticsW`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchcatalogname` : Short, `szschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchschemaname` : Short, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchtablename` : Short, `funique` : UShort, `faccuracy` : UShort) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLTablePrivileges; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLTablePrivileges`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchcatalogname` : Short, `szschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchschemaname` : Short, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cchtablename` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLTablePrivilegesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLTablePrivilegesA`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbcatalogname` : Short, `szschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbschemaname` : Short, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbtablename` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLTablePrivilegesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLTablePrivilegesW`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchcatalogname` : Short, `szschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchschemaname` : Short, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchtablename` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLTables; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLTables`(`statementhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `catalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `namelength1` : Short, `schemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `namelength2` : Short, `tablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `namelength3` : Short, `tabletype` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `namelength4` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLTablesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLTablesA`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbcatalogname` : Short, `szschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbschemaname` : Short, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbtablename` : Short, `sztabletype` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbtabletype` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLTablesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLTablesW`(`hstmt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szcatalogname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchcatalogname` : Short, `szschemaname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchschemaname` : Short, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchtablename` : Short, `sztabletype` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cchtabletype` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbc32.dll, ABI=system, export=SQLTransact; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SQLTransact`(`environmenthandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `connectionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `completiontype` : UShort) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbcbcp.dll, ABI=system, export=bcp_batch; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `bcp_batch`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbcbcp.dll, ABI=system, export=bcp_bind; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `bcp_bind`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : Int, `param3` : Int, `param4` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param5` : Int, `param6` : Int, `param7` : Int) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbcbcp.dll, ABI=system, export=bcp_colfmt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `bcp_colfmt`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param1` : Int, `param2` : UByte, `param3` : Int, `param4` : Int, `param5` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param6` : Int, `param7` : Int) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbcbcp.dll, ABI=system, export=bcp_collen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `bcp_collen`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param1` : Int, `param2` : Int) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbcbcp.dll, ABI=system, export=bcp_colptr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `bcp_colptr`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : Int) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbcbcp.dll, ABI=system, export=bcp_columns; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `bcp_columns`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param1` : Int) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbcbcp.dll, ABI=system, export=bcp_control; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `bcp_control`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param1` : Int, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbcbcp.dll, ABI=system, export=bcp_done; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `bcp_done`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbcbcp.dll, ABI=system, export=bcp_exec; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `bcp_exec`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbcbcp.dll, ABI=system, export=bcp_getcolfmt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `bcp_getcolfmt`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param1` : Int, `param2` : Int, `param3` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param4` : Int, `param5` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbcbcp.dll, ABI=system, export=bcp_initA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `bcp_initA`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param1` : `windows_sys`.`core`.`PCSTR`, `param2` : `windows_sys`.`core`.`PCSTR`, `param3` : `windows_sys`.`core`.`PCSTR`, `param4` : Int) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbcbcp.dll, ABI=system, export=bcp_initW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `bcp_initW`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param1` : `windows_sys`.`core`.`PCWSTR`, `param2` : `windows_sys`.`core`.`PCWSTR`, `param3` : `windows_sys`.`core`.`PCWSTR`, `param4` : Int) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbcbcp.dll, ABI=system, export=bcp_moretext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `bcp_moretext`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param1` : Int, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbcbcp.dll, ABI=system, export=bcp_readfmtA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `bcp_readfmtA`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param1` : `windows_sys`.`core`.`PCSTR`) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbcbcp.dll, ABI=system, export=bcp_readfmtW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `bcp_readfmtW`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param1` : `windows_sys`.`core`.`PCWSTR`) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbcbcp.dll, ABI=system, export=bcp_sendrow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `bcp_sendrow`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbcbcp.dll, ABI=system, export=bcp_setcolfmt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `bcp_setcolfmt`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param1` : Int, `param2` : Int, `param3` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param4` : Int) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbcbcp.dll, ABI=system, export=bcp_writefmtA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `bcp_writefmtA`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param1` : `windows_sys`.`core`.`PCSTR`) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbcbcp.dll, ABI=system, export=bcp_writefmtW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `bcp_writefmtW`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param1` : `windows_sys`.`core`.`PCWSTR`) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbcbcp.dll, ABI=system, export=dbprtypeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `dbprtypeA`(`param0` : Int) : `windows_sys`.`core`.`PSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=odbcbcp.dll, ABI=system, export=dbprtypeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `dbprtypeW`(`param0` : Int) : `windows_sys`.`core`.`PWSTR`
public typealias `ACCESS_MASKENUM` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AUTHENTICATION_INFO` (
    public var `dwSize`: UInt,
    public var `atAuthenticationType`: `AUTH_TYPE`,
    public var `pcwszUser`: `windows_sys`.`core`.`PCWSTR`,
    public var `pcwszPassword`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 283:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AUTHENTICATION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `AUTH_TYPE` = Int;
public const val `BCP6xFILEFMT`: UInt = 9u;
public const val `BCPABORT`: UInt = 6u;
public const val `BCPBATCH`: UInt = 4u;
public const val `BCPFILECP`: UInt = 12u;
public const val `BCPFILECP_ACP`: UInt = 0u;
public const val `BCPFILECP_OEMCP`: UInt = 1u;
public const val `BCPFILECP_RAW`: Int = -1;
public const val `BCPFILEFMT`: UInt = 15u;
public const val `BCPFIRST`: UInt = 2u;
public const val `BCPHINTS`: UInt = 11u;
public const val `BCPHINTSA`: UInt = 10u;
public const val `BCPHINTSW`: UInt = 11u;
public const val `BCPKEEPIDENTITY`: UInt = 8u;
public const val `BCPKEEPNULLS`: UInt = 5u;
public const val `BCPLAST`: UInt = 3u;
public const val `BCPMAXERRS`: UInt = 1u;
public const val `BCPODBC`: UInt = 7u;
public const val `BCPTEXTFILE`: UInt = 14u;
public const val `BCPUNICODEFILE`: UInt = 13u;
public const val `BCP_FMT_COLLATION`: UInt = 6u;
public const val `BCP_FMT_COLLATION_ID`: UInt = 7u;
public const val `BCP_FMT_DATA_LEN`: UInt = 3u;
public const val `BCP_FMT_INDICATOR_LEN`: UInt = 2u;
public const val `BCP_FMT_SERVER_COL`: UInt = 5u;
public const val `BCP_FMT_TERMINATOR`: UInt = 4u;
public const val `BCP_FMT_TYPE`: UInt = 1u;
public const val `BIO_BINDER`: `EBindInfoOptions` = 1;
public const val `BMK_DURABILITY_INTRANSACTION`: Int = 1;
public const val `BMK_DURABILITY_REORGANIZATION`: Int = 3;
public const val `BMK_DURABILITY_ROWSET`: Int = 0;
public const val `BMK_DURABILITY_XTRANSACTION`: Int = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BUCKETCATEGORIZE` (
    public var `cBuckets`: UInt,
    public var `Distribution`: UInt,
)
public const val `BUCKET_EXPONENTIAL`: UInt = 1u;
public const val `BUCKET_LINEAR`: UInt = 0u;
public typealias `CASE_REQUIREMENT` = Int;
public const val `CASE_REQUIREMENT_ANY`: `CASE_REQUIREMENT` = 0;
public const val `CASE_REQUIREMENT_UPPER_IF_AQS`: `CASE_REQUIREMENT` = 1;
public const val `CATALOG_PAUSED_REASON_DELAYED_RECOVERY`: `CatalogPausedReason` = 7;
public const val `CATALOG_PAUSED_REASON_EXTERNAL`: `CatalogPausedReason` = 9;
public const val `CATALOG_PAUSED_REASON_HIGH_CPU`: `CatalogPausedReason` = 2;
public const val `CATALOG_PAUSED_REASON_HIGH_IO`: `CatalogPausedReason` = 1;
public const val `CATALOG_PAUSED_REASON_HIGH_NTF_RATE`: `CatalogPausedReason` = 3;
public const val `CATALOG_PAUSED_REASON_LOW_BATTERY`: `CatalogPausedReason` = 4;
public const val `CATALOG_PAUSED_REASON_LOW_DISK`: `CatalogPausedReason` = 6;
public const val `CATALOG_PAUSED_REASON_LOW_MEMORY`: `CatalogPausedReason` = 5;
public const val `CATALOG_PAUSED_REASON_NONE`: `CatalogPausedReason` = 0;
public const val `CATALOG_PAUSED_REASON_UPGRADING`: `CatalogPausedReason` = 10;
public const val `CATALOG_PAUSED_REASON_USER_ACTIVE`: `CatalogPausedReason` = 8;
public const val `CATALOG_STATUS_FULL_CRAWL`: `CatalogStatus` = 3;
public const val `CATALOG_STATUS_IDLE`: `CatalogStatus` = 0;
public const val `CATALOG_STATUS_INCREMENTAL_CRAWL`: `CatalogStatus` = 4;
public const val `CATALOG_STATUS_PAUSED`: `CatalogStatus` = 1;
public const val `CATALOG_STATUS_PROCESSING_NOTIFICATIONS`: `CatalogStatus` = 5;
public const val `CATALOG_STATUS_RECOVERING`: `CatalogStatus` = 2;
public const val `CATALOG_STATUS_SHUTTING_DOWN`: `CatalogStatus` = 6;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CATEGORIZATION` (
    public var `ulCatType`: UInt,
    public var `Anonymous`: `CATEGORIZATION_0`,
    public var `csColumns`: `COLUMNSET`,
)
// UNSUPPORTED Rust 357:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// impl Default for CATEGORIZATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 363:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// #[derive(Clone, Copy)]
// pub union CATEGORIZATION_0 {
//     pub cClusters: u32,
//     pub bucket: BUCKETCATEGORIZE,
//     pub range: RANGECATEGORIZE,
// }

// UNSUPPORTED Rust 371:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// impl Default for CATEGORIZATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CATEGORIZATIONSET` (
    public var `cCat`: UInt,
    public var `aCat`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CATEGORIZATION`>?,
)
// UNSUPPORTED Rust 384:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// impl Default for CATEGORIZATIONSET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CATEGORIZE_BUCKETS`: UInt = 2u;
public const val `CATEGORIZE_CLUSTER`: UInt = 1u;
public const val `CATEGORIZE_RANGE`: UInt = 3u;
public const val `CATEGORIZE_UNIQUE`: UInt = 0u;
public const val `CATEGORY_COLLATOR`: Int = 2;
public const val `CATEGORY_GATHERER`: Int = 3;
public const val `CATEGORY_INDEXER`: Int = 4;
public const val `CATEGORY_SEARCH`: Int = 1;
public const val `CDBBMKDISPIDS`: UInt = 8u;
public const val `CDBCOLDISPIDS`: UInt = 28u;
public const val `CDBSELFDISPIDS`: UInt = 8u;
public const val `CERT_E_NOT_FOUND_OR_NO_PERMISSSION`: Int = -2147211263;
public const val `CHANNEL_AGENT_DYNAMIC_SCHEDULE`: `CHANNEL_AGENT_FLAGS` = 1;
public typealias `CHANNEL_AGENT_FLAGS` = Int;
public const val `CHANNEL_AGENT_PRECACHE_ALL`: `CHANNEL_AGENT_FLAGS` = 4;
public const val `CHANNEL_AGENT_PRECACHE_SCRNSAVER`: `CHANNEL_AGENT_FLAGS` = 8;
public const val `CHANNEL_AGENT_PRECACHE_SOME`: `CHANNEL_AGENT_FLAGS` = 2;
public const val `CI_E_CORRUPT_FWIDX`: Int = -1073473491;
public const val `CI_E_DIACRITIC_SETTINGS_DIFFER`: Int = -1073473490;
public const val `CI_E_INCONSISTENT_TRANSACTION`: Int = -1073473486;
public const val `CI_E_INVALID_CATALOG_LIST_VERSION`: Int = -2147215313;
public const val `CI_E_MULTIPLE_PROTECTED_USERS_UNSUPPORTED`: Int = -1073473483;
public const val `CI_E_NO_AUXMETADATA`: Int = -2147215318;
public const val `CI_E_NO_CATALOG_MANAGER`: Int = -1073473487;
public const val `CI_E_NO_PROTECTED_USER`: Int = -1073473484;
public const val `CI_E_PROTECTED_CATALOG_NON_INTERACTIVE_USER`: Int = -1073473481;
public const val `CI_E_PROTECTED_CATALOG_NOT_AVAILABLE`: Int = -1073473485;
public const val `CI_E_PROTECTED_CATALOG_SID_MISMATCH`: Int = -1073473482;
public const val `CI_S_CATALOG_RESET`: Int = 268336;
public const val `CI_S_CLIENT_REQUESTED_ABORT`: Int = 268331;
public const val `CI_S_NEW_AUXMETADATA`: Int = 268329;
public const val `CI_S_RETRY_DOCUMENT`: Int = 268332;
// UNSUPPORTED Rust 422:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_CISimpleCommandCreator: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc7b6c04a_cbb5_11d0_bb4c_00c04fc2f410);

// UNSUPPORTED Rust 423:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_DataShapeProvider: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3449a1c8_c56c_11d0_ad72_00c04fc29863);

// UNSUPPORTED Rust 424:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_MSDASQL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc8b522cb_5cf3_11ce_ade5_00aa0044773d);

// UNSUPPORTED Rust 425:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_MSDASQL_ENUMERATOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc8b522cd_5cf3_11ce_ade5_00aa0044773d);

// UNSUPPORTED Rust 426:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_MSPersist: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7c07e0d0_4418_11d2_9212_00c04fbbbfb3);

// UNSUPPORTED Rust 427:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_SQLOLEDB: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0c7ff16c_38e3_11d0_97ab_00c04fc2ad98);

// UNSUPPORTED Rust 428:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_SQLOLEDB_ENUMERATOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdfa22b8e_e68d_11d0_97e4_00c04fc2ad98);

// UNSUPPORTED Rust 429:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_SQLOLEDB_ERROR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc0932c62_38e5_11d0_97ab_00c04fc2ad98);

public const val `CLUSIONREASON_DEFAULT`: `CLUSION_REASON` = 1;
public const val `CLUSIONREASON_GROUPPOLICY`: `CLUSION_REASON` = 3;
public const val `CLUSIONREASON_UNKNOWNSCOPE`: `CLUSION_REASON` = 0;
public const val `CLUSIONREASON_USER`: `CLUSION_REASON` = 2;
public typealias `CLUSION_REASON` = Int;
public const val `CMDLINE_E_ALREADY_INIT`: Int = -2147216123;
public const val `CMDLINE_E_NOT_INIT`: Int = -2147216124;
public const val `CMDLINE_E_NUM_PARAMS`: Int = -2147216122;
public const val `CMDLINE_E_PARAM_SIZE`: Int = -2147216125;
public const val `CMDLINE_E_PAREN`: Int = -2147216126;
public const val `CMDLINE_E_UNEXPECTED`: Int = -2147216127;
public const val `CM_E_CONNECTIONTIMEOUT`: Int = -2147219963;
public const val `CM_E_DATASOURCENOTAVAILABLE`: Int = -2147219964;
public const val `CM_E_INSUFFICIENTBUFFER`: Int = -2147219957;
public const val `CM_E_INVALIDDATASOURCE`: Int = -2147219959;
public const val `CM_E_NOQUERYCONNECTIONS`: Int = -2147219965;
public const val `CM_E_REGISTRY`: Int = -2147219960;
public const val `CM_E_SERVERNOTFOUND`: Int = -2147219962;
public const val `CM_E_TIMEOUT`: Int = -2147219958;
public const val `CM_E_TOOMANYDATASERVERS`: Int = -2147219967;
public const val `CM_E_TOOMANYDATASOURCES`: Int = -2147219966;
public const val `CM_S_NODATASERVERS`: Int = 263687;
public const val `COLL_E_BADRESULT`: Int = -2147220218;
public const val `COLL_E_BADSEQUENCE`: Int = -2147220223;
public const val `COLL_E_BUFFERTOOSMALL`: Int = -2147220220;
public const val `COLL_E_DUPLICATEDBID`: Int = -2147220216;
public const val `COLL_E_INCOMPATIBLECOLUMNS`: Int = -2147220221;
public const val `COLL_E_MAXCONNEXCEEDED`: Int = -2147220213;
public const val `COLL_E_NODEFAULTCATALOG`: Int = -2147220214;
public const val `COLL_E_NOMOREDATA`: Int = -2147220222;
public const val `COLL_E_NOSORTCOLUMN`: Int = -2147220217;
public const val `COLL_E_TOOMANYMERGECOLUMNS`: Int = -2147220215;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com_StructuredStorage"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COLUMNSET` (
    public var `cCol`: UInt,
    public var `aCol`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Storage`.`IndexServer`.`FULLPROPSPEC`>?,
)
// UNSUPPORTED Rust 469:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com_StructuredStorage"))]
// impl Default for COLUMNSET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CONDITION_CREATION_DEFAULT`: `CONDITION_CREATION_OPTIONS` = 0;
public const val `CONDITION_CREATION_NONE`: `CONDITION_CREATION_OPTIONS` = 0;
public typealias `CONDITION_CREATION_OPTIONS` = Int;
public const val `CONDITION_CREATION_SIMPLIFY`: `CONDITION_CREATION_OPTIONS` = 1;
public const val `CONDITION_CREATION_USE_CONTENT_LOCALE`: `CONDITION_CREATION_OPTIONS` = 16;
public const val `CONDITION_CREATION_VECTOR_AND`: `CONDITION_CREATION_OPTIONS` = 2;
public const val `CONDITION_CREATION_VECTOR_LEAF`: `CONDITION_CREATION_OPTIONS` = 8;
public const val `CONDITION_CREATION_VECTOR_OR`: `CONDITION_CREATION_OPTIONS` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com_StructuredStorage"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CONTENTRESTRICTION` (
    public var `prop`: `super`.`super`.`Storage`.`IndexServer`.`FULLPROPSPEC`,
    public var `pwcsPhrase`: `windows_sys`.`core`.`PWSTR`,
    public var `lcid`: UInt,
    public var `ulGenerateMethod`: UInt,
)
// UNSUPPORTED Rust 492:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com_StructuredStorage"))]
// impl Default for CONTENTRESTRICTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CONTENT_SOURCE_E_CONTENT_CLASS_READ`: Int = -2147208188;
public const val `CONTENT_SOURCE_E_CONTENT_SOURCE_COLUMN_TYPE`: Int = -2147208185;
public const val `CONTENT_SOURCE_E_NULL_CONTENT_CLASS_BSTR`: Int = -2147208186;
public const val `CONTENT_SOURCE_E_NULL_URI`: Int = -2147208183;
public const val `CONTENT_SOURCE_E_OUT_OF_RANGE`: Int = -2147208184;
public const val `CONTENT_SOURCE_E_PROPERTY_MAPPING_BAD_VECTOR_SIZE`: Int = -2147208189;
public const val `CONTENT_SOURCE_E_PROPERTY_MAPPING_READ`: Int = -2147208191;
public const val `CONTENT_SOURCE_E_UNEXPECTED_EXCEPTION`: Int = -2147208187;
public const val `CONTENT_SOURCE_E_UNEXPECTED_NULL_POINTER`: Int = -2147208190;
public const val `CQUERYDISPIDS`: UInt = 11u;
public const val `CQUERYMETADISPIDS`: UInt = 10u;
public const val `CQUERYPROPERTY`: UInt = 64u;
public typealias `CREATESUBSCRIPTIONFLAGS` = Int;
public const val `CREATESUBS_ADDTOFAVORITES`: `CREATESUBSCRIPTIONFLAGS` = 1;
public const val `CREATESUBS_FROMFAVORITES`: `CREATESUBSCRIPTIONFLAGS` = 2;
public const val `CREATESUBS_NOSAVE`: `CREATESUBSCRIPTIONFLAGS` = 8;
public const val `CREATESUBS_NOUI`: `CREATESUBSCRIPTIONFLAGS` = 4;
public const val `CREATESUBS_SOFTWAREUPDATE`: `CREATESUBSCRIPTIONFLAGS` = 16;
public const val `CRESTRICTIONS_DBSCHEMA_ASSERTIONS`: UInt = 3u;
public const val `CRESTRICTIONS_DBSCHEMA_CATALOGS`: UInt = 1u;
public const val `CRESTRICTIONS_DBSCHEMA_CHARACTER_SETS`: UInt = 3u;
public const val `CRESTRICTIONS_DBSCHEMA_CHECK_CONSTRAINTS`: UInt = 3u;
public const val `CRESTRICTIONS_DBSCHEMA_CHECK_CONSTRAINTS_BY_TABLE`: UInt = 6u;
public const val `CRESTRICTIONS_DBSCHEMA_COLLATIONS`: UInt = 3u;
public const val `CRESTRICTIONS_DBSCHEMA_COLUMNS`: UInt = 4u;
public const val `CRESTRICTIONS_DBSCHEMA_COLUMN_DOMAIN_USAGE`: UInt = 4u;
public const val `CRESTRICTIONS_DBSCHEMA_COLUMN_PRIVILEGES`: UInt = 6u;
public const val `CRESTRICTIONS_DBSCHEMA_CONSTRAINT_COLUMN_USAGE`: UInt = 4u;
public const val `CRESTRICTIONS_DBSCHEMA_CONSTRAINT_TABLE_USAGE`: UInt = 3u;
public const val `CRESTRICTIONS_DBSCHEMA_FOREIGN_KEYS`: UInt = 6u;
public const val `CRESTRICTIONS_DBSCHEMA_INDEXES`: UInt = 5u;
public const val `CRESTRICTIONS_DBSCHEMA_KEY_COLUMN_USAGE`: UInt = 7u;
public const val `CRESTRICTIONS_DBSCHEMA_LINKEDSERVERS`: UInt = 1u;
public const val `CRESTRICTIONS_DBSCHEMA_OBJECTS`: UInt = 1u;
public const val `CRESTRICTIONS_DBSCHEMA_OBJECT_ACTIONS`: UInt = 1u;
public const val `CRESTRICTIONS_DBSCHEMA_PRIMARY_KEYS`: UInt = 3u;
public const val `CRESTRICTIONS_DBSCHEMA_PROCEDURES`: UInt = 4u;
public const val `CRESTRICTIONS_DBSCHEMA_PROCEDURE_COLUMNS`: UInt = 4u;
public const val `CRESTRICTIONS_DBSCHEMA_PROCEDURE_PARAMETERS`: UInt = 4u;
public const val `CRESTRICTIONS_DBSCHEMA_PROVIDER_TYPES`: UInt = 2u;
public const val `CRESTRICTIONS_DBSCHEMA_REFERENTIAL_CONSTRAINTS`: UInt = 3u;
public const val `CRESTRICTIONS_DBSCHEMA_SCHEMATA`: UInt = 3u;
public const val `CRESTRICTIONS_DBSCHEMA_SQL_LANGUAGES`: UInt = 0u;
public const val `CRESTRICTIONS_DBSCHEMA_STATISTICS`: UInt = 3u;
public const val `CRESTRICTIONS_DBSCHEMA_TABLES`: UInt = 4u;
public const val `CRESTRICTIONS_DBSCHEMA_TABLES_INFO`: UInt = 4u;
public const val `CRESTRICTIONS_DBSCHEMA_TABLE_CONSTRAINTS`: UInt = 7u;
public const val `CRESTRICTIONS_DBSCHEMA_TABLE_PRIVILEGES`: UInt = 5u;
public const val `CRESTRICTIONS_DBSCHEMA_TABLE_STATISTICS`: UInt = 7u;
public const val `CRESTRICTIONS_DBSCHEMA_TRANSLATIONS`: UInt = 3u;
public const val `CRESTRICTIONS_DBSCHEMA_TRUSTEE`: UInt = 4u;
public const val `CRESTRICTIONS_DBSCHEMA_USAGE_PRIVILEGES`: UInt = 6u;
public const val `CRESTRICTIONS_DBSCHEMA_VIEWS`: UInt = 3u;
public const val `CRESTRICTIONS_DBSCHEMA_VIEW_COLUMN_USAGE`: UInt = 3u;
public const val `CRESTRICTIONS_DBSCHEMA_VIEW_TABLE_USAGE`: UInt = 3u;
public const val `CRESTRICTIONS_MDSCHEMA_ACTIONS`: UInt = 8u;
public const val `CRESTRICTIONS_MDSCHEMA_COMMANDS`: UInt = 5u;
public const val `CRESTRICTIONS_MDSCHEMA_CUBES`: UInt = 3u;
public const val `CRESTRICTIONS_MDSCHEMA_DIMENSIONS`: UInt = 5u;
public const val `CRESTRICTIONS_MDSCHEMA_FUNCTIONS`: UInt = 4u;
public const val `CRESTRICTIONS_MDSCHEMA_HIERARCHIES`: UInt = 6u;
public const val `CRESTRICTIONS_MDSCHEMA_LEVELS`: UInt = 7u;
public const val `CRESTRICTIONS_MDSCHEMA_MEASURES`: UInt = 5u;
public const val `CRESTRICTIONS_MDSCHEMA_MEMBERS`: UInt = 12u;
public const val `CRESTRICTIONS_MDSCHEMA_PROPERTIES`: UInt = 9u;
public const val `CRESTRICTIONS_MDSCHEMA_SETS`: UInt = 5u;
public const val `CSTORAGEPROPERTY`: UInt = 23u;
// UNSUPPORTED Rust 565:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CSearchLanguageSupport: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6a68cc80_4337_4dbc_bd27_fbfb1053820b);

// UNSUPPORTED Rust 566:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CSearchManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7d096c5f_ac08_4f1f_beb7_5c22c517ce39);

// UNSUPPORTED Rust 567:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CSearchRoot: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x30766bd2_ea1c_4f28_bf27_0b44e2f68db7);

// UNSUPPORTED Rust 568:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CSearchScopeRule: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe63de750_3bd7_4be5_9c84_6b4281988c44);

public typealias `CatalogPausedReason` = Int;
public typealias `CatalogStatus` = Int;
// UNSUPPORTED Rust 571:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CompoundCondition: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x116f8d13_101e_4fa5_84d4_ff8279381935);

// UNSUPPORTED Rust 572:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ConditionFactory: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe03e85b0_7be3_4000_ba98_6c13de9fa486);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DATE_STRUCT` (
    public var `year`: Short,
    public var `month`: UShort,
    public var `day`: UShort,
)
public typealias `DBACCESSORFLAGSENUM` = Int;
public const val `DBACCESSOR_INHERITED`: `DBACCESSORFLAGSENUM` = 16;
public const val `DBACCESSOR_INVALID`: `DBACCESSORFLAGSENUM` = 0;
public const val `DBACCESSOR_OPTIMIZED`: `DBACCESSORFLAGSENUM` = 8;
public const val `DBACCESSOR_PARAMETERDATA`: `DBACCESSORFLAGSENUM` = 4;
public const val `DBACCESSOR_PASSBYREF`: `DBACCESSORFLAGSENUM` = 1;
public const val `DBACCESSOR_ROWDATA`: `DBACCESSORFLAGSENUM` = 2;
public typealias `DBASYNCHOPENUM` = Int;
public const val `DBASYNCHOP_OPEN`: `DBASYNCHOPENUM` = 0;
public typealias `DBASYNCHPHASEENUM` = Int;
public const val `DBASYNCHPHASE_CANCELED`: `DBASYNCHPHASEENUM` = 3;
public const val `DBASYNCHPHASE_COMPLETE`: `DBASYNCHPHASEENUM` = 2;
public const val `DBASYNCHPHASE_INITIALIZATION`: `DBASYNCHPHASEENUM` = 0;
public const val `DBASYNCHPHASE_POPULATION`: `DBASYNCHPHASEENUM` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBBINDEXT` (
    public var `pExtension`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `ulExtension`: ULong,
)
// UNSUPPORTED Rust 601:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for DBBINDEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBBINDEXT` (
    public var `pExtension`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `ulExtension`: ULong,
)
// UNSUPPORTED Rust 614:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for DBBINDEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DBBINDFLAGENUM` = Int;
public const val `DBBINDFLAG_HTML`: `DBBINDFLAGENUM` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBBINDING` (
    public var `iOrdinal`: ULong,
    public var `obValue`: ULong,
    public var `obLength`: ULong,
    public var `obStatus`: ULong,
    public var `pTypeInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DBOBJECT`>?,
    public var `pBindExt`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DBBINDEXT`>?,
    public var `dwPart`: UInt,
    public var `dwMemOwner`: UInt,
    public var `eParamIO`: UInt,
    public var `cbMaxLen`: ULong,
    public var `dwFlags`: UInt,
    public var `wType`: UShort,
    public var `bPrecision`: UByte,
    public var `bScale`: UByte,
)
// UNSUPPORTED Rust 643:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_System_Com")]
// impl Default for DBBINDING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBBINDING` (
    public var `iOrdinal`: ULong,
    public var `obValue`: ULong,
    public var `obLength`: ULong,
    public var `obStatus`: ULong,
    public var `pTypeInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DBOBJECT`>?,
    public var `pBindExt`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DBBINDEXT`>?,
    public var `dwPart`: UInt,
    public var `dwMemOwner`: UInt,
    public var `eParamIO`: UInt,
    public var `cbMaxLen`: ULong,
    public var `dwFlags`: UInt,
    public var `wType`: UShort,
    public var `bPrecision`: UByte,
    public var `bScale`: UByte,
)
// UNSUPPORTED Rust 671:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_Com")]
// impl Default for DBBINDING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DBBINDSTATUSENUM` = Int;
public const val `DBBINDSTATUS_BADBINDINFO`: `DBBINDSTATUSENUM` = 3;
public const val `DBBINDSTATUS_BADORDINAL`: `DBBINDSTATUSENUM` = 1;
public const val `DBBINDSTATUS_BADSTORAGEFLAGS`: `DBBINDSTATUSENUM` = 4;
public const val `DBBINDSTATUS_MULTIPLESTORAGE`: `DBBINDSTATUSENUM` = 6;
public const val `DBBINDSTATUS_NOINTERFACE`: `DBBINDSTATUSENUM` = 5;
public const val `DBBINDSTATUS_OK`: `DBBINDSTATUSENUM` = 0;
public const val `DBBINDSTATUS_UNSUPPORTEDCONVERSION`: `DBBINDSTATUSENUM` = 2;
public typealias `DBBINDURLFLAGENUM` = Int;
public const val `DBBINDURLFLAG_ASYNCHRONOUS`: `DBBINDURLFLAGENUM` = 4096;
public const val `DBBINDURLFLAG_COLLECTION`: `DBBINDURLFLAGENUM` = 8192;
public const val `DBBINDURLFLAG_DELAYFETCHCOLUMNS`: `DBBINDURLFLAGENUM` = 32768;
public const val `DBBINDURLFLAG_DELAYFETCHSTREAM`: `DBBINDURLFLAGENUM` = 16384;
public const val `DBBINDURLFLAG_ISSTRUCTUREDDOCUMENT`: `DBBINDURLFLAGENUM` = 134217728;
public const val `DBBINDURLFLAG_OPENIFEXISTS`: `DBBINDURLFLAGENUM` = 33554432;
public const val `DBBINDURLFLAG_OUTPUT`: `DBBINDURLFLAGENUM` = 8388608;
public const val `DBBINDURLFLAG_OVERWRITE`: `DBBINDURLFLAGENUM` = 67108864;
public const val `DBBINDURLFLAG_READ`: `DBBINDURLFLAGENUM` = 1;
public const val `DBBINDURLFLAG_READWRITE`: `DBBINDURLFLAGENUM` = 3;
public const val `DBBINDURLFLAG_RECURSIVE`: `DBBINDURLFLAGENUM` = 4194304;
public const val `DBBINDURLFLAG_SHARE_DENY_NONE`: `DBBINDURLFLAGENUM` = 16;
public const val `DBBINDURLFLAG_SHARE_DENY_READ`: `DBBINDURLFLAGENUM` = 4;
public const val `DBBINDURLFLAG_SHARE_DENY_WRITE`: `DBBINDURLFLAGENUM` = 8;
public const val `DBBINDURLFLAG_SHARE_EXCLUSIVE`: `DBBINDURLFLAGENUM` = 12;
public const val `DBBINDURLFLAG_WAITFORINIT`: `DBBINDURLFLAGENUM` = 16777216;
public const val `DBBINDURLFLAG_WRITE`: `DBBINDURLFLAGENUM` = 2;
public typealias `DBBINDURLSTATUSENUM` = Int;
public const val `DBBINDURLSTATUS_S_DENYNOTSUPPORTED`: `DBBINDURLSTATUSENUM` = 1;
public const val `DBBINDURLSTATUS_S_DENYTYPENOTSUPPORTED`: `DBBINDURLSTATUSENUM` = 4;
public const val `DBBINDURLSTATUS_S_OK`: `DBBINDURLSTATUSENUM` = 0;
public const val `DBBINDURLSTATUS_S_REDIRECTED`: `DBBINDURLSTATUSENUM` = 8;
// UNSUPPORTED Rust 709:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DBBMKGUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc8b52232_5cf3_11ce_ade5_00aa0044773d);

public const val `DBBMK_FIRST`: `DBBOOKMARK` = 1;
public const val `DBBMK_INVALID`: `DBBOOKMARK` = 0;
public const val `DBBMK_LAST`: `DBBOOKMARK` = 2;
public typealias `DBBOOKMARK` = Int;
// UNSUPPORTED Rust 714:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DBCIDGUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0c733a81_2a1c_11ce_ade5_00aa0044773d);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_IndexServer")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBCOLUMNACCESS` (
    public var `pData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `columnid`: `super`.`super`.`Storage`.`IndexServer`.`DBID`,
    public var `cbDataLen`: ULong,
    public var `dwStatus`: UInt,
    public var `cbMaxLen`: ULong,
    public var `dwReserved`: ULong,
    public var `wType`: UShort,
    public var `bPrecision`: UByte,
    public var `bScale`: UByte,
)
// UNSUPPORTED Rust 730:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_Storage_IndexServer")]
// impl Default for DBCOLUMNACCESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_IndexServer")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBCOLUMNACCESS` (
    public var `pData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `columnid`: `super`.`super`.`Storage`.`IndexServer`.`DBID`,
    public var `cbDataLen`: ULong,
    public var `dwStatus`: UInt,
    public var `cbMaxLen`: ULong,
    public var `dwReserved`: ULong,
    public var `wType`: UShort,
    public var `bPrecision`: UByte,
    public var `bScale`: UByte,
)
// UNSUPPORTED Rust 752:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_Storage_IndexServer")]
// impl Default for DBCOLUMNACCESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBCOLUMNDESC` (
    public var `pwszTypeName`: `windows_sys`.`core`.`PWSTR`,
    public var `pTypeInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `rgPropertySets`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DBPROPSET`>?,
    public var `pclsid`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `cPropertySets`: UInt,
    public var `ulColumnSize`: ULong,
    public var `dbcid`: `super`.`super`.`Storage`.`IndexServer`.`DBID`,
    public var `wType`: UShort,
    public var `bPrecision`: UByte,
    public var `bScale`: UByte,
)
// UNSUPPORTED Rust 775:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// impl Default for DBCOLUMNDESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBCOLUMNDESC` (
    public var `pwszTypeName`: `windows_sys`.`core`.`PWSTR`,
    public var `pTypeInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `rgPropertySets`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DBPROPSET`>?,
    public var `pclsid`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `cPropertySets`: UInt,
    public var `ulColumnSize`: ULong,
    public var `dbcid`: `super`.`super`.`Storage`.`IndexServer`.`DBID`,
    public var `wType`: UShort,
    public var `bPrecision`: UByte,
    public var `bScale`: UByte,
)
// UNSUPPORTED Rust 798:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// impl Default for DBCOLUMNDESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DBCOLUMNDESCFLAGSENUM` = Int;
public const val `DBCOLUMNDESCFLAGS_CLSID`: `DBCOLUMNDESCFLAGSENUM` = 8;
public const val `DBCOLUMNDESCFLAGS_COLSIZE`: `DBCOLUMNDESCFLAGSENUM` = 16;
public const val `DBCOLUMNDESCFLAGS_DBCID`: `DBCOLUMNDESCFLAGSENUM` = 32;
public const val `DBCOLUMNDESCFLAGS_ITYPEINFO`: `DBCOLUMNDESCFLAGSENUM` = 2;
public const val `DBCOLUMNDESCFLAGS_PRECISION`: `DBCOLUMNDESCFLAGSENUM` = 128;
public const val `DBCOLUMNDESCFLAGS_PROPERTIES`: `DBCOLUMNDESCFLAGSENUM` = 4;
public const val `DBCOLUMNDESCFLAGS_SCALE`: `DBCOLUMNDESCFLAGSENUM` = 256;
public const val `DBCOLUMNDESCFLAGS_TYPENAME`: `DBCOLUMNDESCFLAGSENUM` = 1;
public const val `DBCOLUMNDESCFLAGS_WTYPE`: `DBCOLUMNDESCFLAGSENUM` = 64;
public typealias `DBCOLUMNFLAGS15ENUM` = Int;
public typealias `DBCOLUMNFLAGSDEPRECATED` = Int;
public typealias `DBCOLUMNFLAGSENUM` = Int;
public typealias `DBCOLUMNFLAGSENUM20` = Int;
public typealias `DBCOLUMNFLAGSENUM21` = Int;
public typealias `DBCOLUMNFLAGSENUM26` = Int;
public const val `DBCOLUMNFLAGS_CACHEDEFERRED`: `DBCOLUMNFLAGSENUM` = 4096;
public const val `DBCOLUMNFLAGS_ISBOOKMARK`: `DBCOLUMNFLAGSENUM` = 1;
public const val `DBCOLUMNFLAGS_ISCHAPTER`: `DBCOLUMNFLAGS15ENUM` = 8192;
public const val `DBCOLUMNFLAGS_ISCOLLECTION`: `DBCOLUMNFLAGSENUM21` = 262144;
public const val `DBCOLUMNFLAGS_ISDEFAULTSTREAM`: `DBCOLUMNFLAGSENUM21` = 131072;
public const val `DBCOLUMNFLAGS_ISFIXEDLENGTH`: `DBCOLUMNFLAGSENUM` = 16;
public const val `DBCOLUMNFLAGS_ISLONG`: `DBCOLUMNFLAGSENUM` = 128;
public const val `DBCOLUMNFLAGS_ISNULLABLE`: `DBCOLUMNFLAGSENUM` = 32;
public const val `DBCOLUMNFLAGS_ISROW`: `DBCOLUMNFLAGSENUM26` = 2097152;
public const val `DBCOLUMNFLAGS_ISROWID`: `DBCOLUMNFLAGSENUM` = 256;
public const val `DBCOLUMNFLAGS_ISROWSET`: `DBCOLUMNFLAGSENUM26` = 1048576;
public const val `DBCOLUMNFLAGS_ISROWURL`: `DBCOLUMNFLAGSENUM21` = 65536;
public const val `DBCOLUMNFLAGS_ISROWVER`: `DBCOLUMNFLAGSENUM` = 512;
public const val `DBCOLUMNFLAGS_ISSTREAM`: `DBCOLUMNFLAGSENUM26` = 524288;
public const val `DBCOLUMNFLAGS_KEYCOLUMN`: `DBCOLUMNFLAGSDEPRECATED` = 32768;
public const val `DBCOLUMNFLAGS_MAYBENULL`: `DBCOLUMNFLAGSENUM` = 64;
public const val `DBCOLUMNFLAGS_MAYDEFER`: `DBCOLUMNFLAGSENUM` = 2;
public const val `DBCOLUMNFLAGS_RESERVED`: `DBCOLUMNFLAGSENUM20` = 32768;
public const val `DBCOLUMNFLAGS_ROWSPECIFICCOLUMN`: `DBCOLUMNFLAGSENUM26` = 4194304;
public const val `DBCOLUMNFLAGS_SCALEISNEGATIVE`: `DBCOLUMNFLAGSENUM20` = 16384;
public const val `DBCOLUMNFLAGS_WRITE`: `DBCOLUMNFLAGSENUM` = 4;
public const val `DBCOLUMNFLAGS_WRITEUNKNOWN`: `DBCOLUMNFLAGSENUM` = 8;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBCOLUMNINFO` (
    public var `pwszName`: `windows_sys`.`core`.`PWSTR`,
    public var `pTypeInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `iOrdinal`: ULong,
    public var `dwFlags`: UInt,
    public var `ulColumnSize`: ULong,
    public var `wType`: UShort,
    public var `bPrecision`: UByte,
    public var `bScale`: UByte,
    public var `columnid`: `super`.`super`.`Storage`.`IndexServer`.`DBID`,
)
// UNSUPPORTED Rust 858:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com"))]
// impl Default for DBCOLUMNINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBCOLUMNINFO` (
    public var `pwszName`: `windows_sys`.`core`.`PWSTR`,
    public var `pTypeInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `iOrdinal`: ULong,
    public var `dwFlags`: UInt,
    public var `ulColumnSize`: ULong,
    public var `wType`: UShort,
    public var `bPrecision`: UByte,
    public var `bScale`: UByte,
    public var `columnid`: `super`.`super`.`Storage`.`IndexServer`.`DBID`,
)
// UNSUPPORTED Rust 880:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com"))]
// impl Default for DBCOLUMNINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DBCOMMANDPERSISTFLAGENUM` = Int;
public typealias `DBCOMMANDPERSISTFLAGENUM21` = Int;
public const val `DBCOMMANDPERSISTFLAG_DEFAULT`: `DBCOMMANDPERSISTFLAGENUM21` = 0;
public const val `DBCOMMANDPERSISTFLAG_NOSAVE`: `DBCOMMANDPERSISTFLAGENUM` = 1;
public const val `DBCOMMANDPERSISTFLAG_PERSISTPROCEDURE`: `DBCOMMANDPERSISTFLAGENUM21` = 4;
public const val `DBCOMMANDPERSISTFLAG_PERSISTVIEW`: `DBCOMMANDPERSISTFLAGENUM21` = 2;
public typealias `DBCOMPAREENUM` = Int;
public typealias `DBCOMPAREOPSENUM` = Int;
public typealias `DBCOMPAREOPSENUM20` = Int;
public const val `DBCOMPAREOPS_BEGINSWITH`: `DBCOMPAREOPSENUM` = 5;
public const val `DBCOMPAREOPS_CASEINSENSITIVE`: `DBCOMPAREOPSENUM` = 8192;
public const val `DBCOMPAREOPS_CASESENSITIVE`: `DBCOMPAREOPSENUM` = 4096;
public const val `DBCOMPAREOPS_CONTAINS`: `DBCOMPAREOPSENUM` = 6;
public const val `DBCOMPAREOPS_EQ`: `DBCOMPAREOPSENUM` = 2;
public const val `DBCOMPAREOPS_GE`: `DBCOMPAREOPSENUM` = 3;
public const val `DBCOMPAREOPS_GT`: `DBCOMPAREOPSENUM` = 4;
public const val `DBCOMPAREOPS_IGNORE`: `DBCOMPAREOPSENUM` = 8;
public const val `DBCOMPAREOPS_LE`: `DBCOMPAREOPSENUM` = 1;
public const val `DBCOMPAREOPS_LT`: `DBCOMPAREOPSENUM` = 0;
public const val `DBCOMPAREOPS_NE`: `DBCOMPAREOPSENUM` = 7;
public const val `DBCOMPAREOPS_NOTBEGINSWITH`: `DBCOMPAREOPSENUM20` = 9;
public const val `DBCOMPAREOPS_NOTCONTAINS`: `DBCOMPAREOPSENUM20` = 10;
public const val `DBCOMPARE_EQ`: `DBCOMPAREENUM` = 1;
public const val `DBCOMPARE_GT`: `DBCOMPAREENUM` = 2;
public const val `DBCOMPARE_LT`: `DBCOMPAREENUM` = 0;
public const val `DBCOMPARE_NE`: `DBCOMPAREENUM` = 3;
public const val `DBCOMPARE_NOTCOMPARABLE`: `DBCOMPAREENUM` = 4;
public const val `DBCOMPUTEMODE_COMPUTED`: UInt = 1u;
public const val `DBCOMPUTEMODE_DYNAMIC`: UInt = 2u;
public const val `DBCOMPUTEMODE_NOTCOMPUTED`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBCONSTRAINTDESC` (
    public var `pConstraintID`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Storage`.`IndexServer`.`DBID`>?,
    public var `ConstraintType`: UInt,
    public var `cColumns`: ULong,
    public var `rgColumnList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Storage`.`IndexServer`.`DBID`>?,
    public var `pReferencedTableID`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Storage`.`IndexServer`.`DBID`>?,
    public var `cForeignKeyColumns`: ULong,
    public var `rgForeignKeyColumnList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Storage`.`IndexServer`.`DBID`>?,
    public var `pwszConstraintText`: `windows_sys`.`core`.`PWSTR`,
    public var `UpdateRule`: UInt,
    public var `DeleteRule`: UInt,
    public var `MatchType`: UInt,
    public var `Deferrability`: UInt,
    public var `cReserved`: ULong,
    public var `rgReserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DBPROPSET`>?,
)
// UNSUPPORTED Rust 937:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// impl Default for DBCONSTRAINTDESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBCONSTRAINTDESC` (
    public var `pConstraintID`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Storage`.`IndexServer`.`DBID`>?,
    public var `ConstraintType`: UInt,
    public var `cColumns`: ULong,
    public var `rgColumnList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Storage`.`IndexServer`.`DBID`>?,
    public var `pReferencedTableID`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Storage`.`IndexServer`.`DBID`>?,
    public var `cForeignKeyColumns`: ULong,
    public var `rgForeignKeyColumnList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Storage`.`IndexServer`.`DBID`>?,
    public var `pwszConstraintText`: `windows_sys`.`core`.`PWSTR`,
    public var `UpdateRule`: UInt,
    public var `DeleteRule`: UInt,
    public var `MatchType`: UInt,
    public var `Deferrability`: UInt,
    public var `cReserved`: ULong,
    public var `rgReserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DBPROPSET`>?,
)
// UNSUPPORTED Rust 964:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// impl Default for DBCONSTRAINTDESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DBCONSTRAINTTYPEENUM` = Int;
public const val `DBCONSTRAINTTYPE_CHECK`: `DBCONSTRAINTTYPEENUM` = 3;
public const val `DBCONSTRAINTTYPE_FOREIGNKEY`: `DBCONSTRAINTTYPEENUM` = 1;
public const val `DBCONSTRAINTTYPE_PRIMARYKEY`: `DBCONSTRAINTTYPEENUM` = 2;
public const val `DBCONSTRAINTTYPE_UNIQUE`: `DBCONSTRAINTTYPEENUM` = 0;
public typealias `DBCONVERTFLAGSENUM` = Int;
public typealias `DBCONVERTFLAGSENUM20` = Int;
public const val `DBCONVERTFLAGS_COLUMN`: `DBCONVERTFLAGSENUM` = 0;
public const val `DBCONVERTFLAGS_FROMVARIANT`: `DBCONVERTFLAGSENUM20` = 8;
public const val `DBCONVERTFLAGS_ISFIXEDLENGTH`: `DBCONVERTFLAGSENUM20` = 4;
public const val `DBCONVERTFLAGS_ISLONG`: `DBCONVERTFLAGSENUM20` = 2;
public const val `DBCONVERTFLAGS_PARAMETER`: `DBCONVERTFLAGSENUM` = 1;
public typealias `DBCOPYFLAGSENUM` = Int;
public const val `DBCOPY_ALLOW_EMULATION`: `DBCOPYFLAGSENUM` = 1024;
public const val `DBCOPY_ASYNC`: `DBCOPYFLAGSENUM` = 256;
public const val `DBCOPY_ATOMIC`: `DBCOPYFLAGSENUM` = 4096;
public const val `DBCOPY_NON_RECURSIVE`: `DBCOPYFLAGSENUM` = 2048;
public const val `DBCOPY_REPLACE_EXISTING`: `DBCOPYFLAGSENUM` = 512;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DBCOST` (
    public var `eKind`: UInt,
    public var `dwUnits`: UInt,
    public var `lValue`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DBCOST` (
    public var `eKind`: UInt,
    public var `dwUnits`: UInt,
    public var `lValue`: Int,
)
public typealias `DBCOSTUNITENUM` = Int;
public typealias `DBDATACONVERTENUM` = Int;
public const val `DBDATACONVERT_DECIMALSCALE`: `DBDATACONVERTENUM` = 8;
public const val `DBDATACONVERT_DEFAULT`: `DBDATACONVERTENUM` = 0;
public const val `DBDATACONVERT_DSTISFIXEDLENGTH`: `DBDATACONVERTENUM` = 4;
public const val `DBDATACONVERT_LENGTHFROMNTS`: `DBDATACONVERTENUM` = 2;
public const val `DBDATACONVERT_SETDATABEHAVIOR`: `DBDATACONVERTENUM` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DBDATE` (
    public var `year`: Short,
    public var `month`: UShort,
    public var `day`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DBDATETIM4` (
    public var `numdays`: UShort,
    public var `nummins`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DBDATETIME` (
    public var `dtdays`: Int,
    public var `dttime`: UInt,
)
public typealias `DBDEFERRABILITYENUM` = Int;
public const val `DBDEFERRABILITY_DEFERRABLE`: `DBDEFERRABILITYENUM` = 2;
public const val `DBDEFERRABILITY_DEFERRED`: `DBDEFERRABILITYENUM` = 1;
public typealias `DBDELETEFLAGSENUM` = Int;
public const val `DBDELETE_ASYNC`: `DBDELETEFLAGSENUM` = 256;
public const val `DBDELETE_ATOMIC`: `DBDELETEFLAGSENUM` = 4096;
public typealias `DBEVENTPHASEENUM` = Int;
public const val `DBEVENTPHASE_ABOUTTODO`: `DBEVENTPHASEENUM` = 1;
public const val `DBEVENTPHASE_DIDEVENT`: `DBEVENTPHASEENUM` = 4;
public const val `DBEVENTPHASE_FAILEDTODO`: `DBEVENTPHASEENUM` = 3;
public const val `DBEVENTPHASE_OKTODO`: `DBEVENTPHASEENUM` = 0;
public const val `DBEVENTPHASE_SYNCHAFTER`: `DBEVENTPHASEENUM` = 2;
public typealias `DBEXECLIMITSENUM` = Int;
public const val `DBEXECLIMITS_ABORT`: `DBEXECLIMITSENUM` = 1;
public const val `DBEXECLIMITS_STOP`: `DBEXECLIMITSENUM` = 2;
public const val `DBEXECLIMITS_SUSPEND`: `DBEXECLIMITSENUM` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DBFAILUREINFO` (
    public var `hRow`: ULong,
    public var `iColumn`: ULong,
    public var `failure`: `windows_sys`.`core`.`HRESULT`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DBFAILUREINFO` (
    public var `hRow`: ULong,
    public var `iColumn`: ULong,
    public var `failure`: `windows_sys`.`core`.`HRESULT`,
)
// UNSUPPORTED Rust 1063:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DBGUID_MSSQLXML: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5d531cb2_e6ed_11d2_b252_00c04f681b71);

// UNSUPPORTED Rust 1064:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DBGUID_ROWDEFAULTSTREAM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0c733ab7_2a1c_11ce_ade5_00aa0044773d);

// UNSUPPORTED Rust 1065:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DBGUID_ROWURL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0c733ab6_2a1c_11ce_ade5_00aa0044773d);

// UNSUPPORTED Rust 1066:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DBGUID_XPATH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xec2a4293_e898_11d2_b1b7_00c04f680c56);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBIMPLICITSESSION` (
    public var `pUnkOuter`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `piid`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `pSession`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1075:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for DBIMPLICITSESSION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBIMPLICITSESSION` (
    public var `pUnkOuter`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `piid`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `pSession`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1089:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for DBIMPLICITSESSION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_IndexServer")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBINDEXCOLUMNDESC` (
    public var `pColumnID`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Storage`.`IndexServer`.`DBID`>?,
    public var `eIndexColOrder`: UInt,
)
// UNSUPPORTED Rust 1103:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_Storage_IndexServer")]
// impl Default for DBINDEXCOLUMNDESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_IndexServer")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBINDEXCOLUMNDESC` (
    public var `pColumnID`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Storage`.`IndexServer`.`DBID`>?,
    public var `eIndexColOrder`: UInt,
)
// UNSUPPORTED Rust 1118:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_Storage_IndexServer")]
// impl Default for DBINDEXCOLUMNDESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DBINDEX_COL_ORDERENUM` = Int;
public const val `DBINDEX_COL_ORDER_ASC`: `DBINDEX_COL_ORDERENUM` = 0;
public const val `DBINDEX_COL_ORDER_DESC`: `DBINDEX_COL_ORDERENUM` = 1;
public typealias `DBLITERALENUM` = Int;
public typealias `DBLITERALENUM20` = Int;
public typealias `DBLITERALENUM21` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBLITERALINFO` (
    public var `pwszLiteralValue`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszInvalidChars`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszInvalidStartingChars`: `windows_sys`.`core`.`PWSTR`,
    public var `lt`: UInt,
    public var `fSupported`: `windows_sys`.`core`.`BOOL`,
    public var `cchMaxLen`: UInt,
)
// UNSUPPORTED Rust 1142:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for DBLITERALINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBLITERALINFO` (
    public var `pwszLiteralValue`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszInvalidChars`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszInvalidStartingChars`: `windows_sys`.`core`.`PWSTR`,
    public var `lt`: UInt,
    public var `fSupported`: `windows_sys`.`core`.`BOOL`,
    public var `cchMaxLen`: UInt,
)
// UNSUPPORTED Rust 1159:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for DBLITERALINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DBLITERAL_BINARY_LITERAL`: `DBLITERALENUM` = 1;
public const val `DBLITERAL_CATALOG_NAME`: `DBLITERALENUM` = 2;
public const val `DBLITERAL_CATALOG_SEPARATOR`: `DBLITERALENUM` = 3;
public const val `DBLITERAL_CHAR_LITERAL`: `DBLITERALENUM` = 4;
public const val `DBLITERAL_COLUMN_ALIAS`: `DBLITERALENUM` = 5;
public const val `DBLITERAL_COLUMN_NAME`: `DBLITERALENUM` = 6;
public const val `DBLITERAL_CORRELATION_NAME`: `DBLITERALENUM` = 7;
public const val `DBLITERAL_CUBE_NAME`: `DBLITERALENUM20` = 21;
public const val `DBLITERAL_CURSOR_NAME`: `DBLITERALENUM` = 8;
public const val `DBLITERAL_DIMENSION_NAME`: `DBLITERALENUM20` = 22;
public const val `DBLITERAL_ESCAPE_PERCENT`: `DBLITERALENUM` = 9;
public const val `DBLITERAL_ESCAPE_PERCENT_SUFFIX`: `DBLITERALENUM21` = 29;
public const val `DBLITERAL_ESCAPE_UNDERSCORE`: `DBLITERALENUM` = 10;
public const val `DBLITERAL_ESCAPE_UNDERSCORE_SUFFIX`: `DBLITERALENUM21` = 30;
public const val `DBLITERAL_HIERARCHY_NAME`: `DBLITERALENUM20` = 23;
public const val `DBLITERAL_INDEX_NAME`: `DBLITERALENUM` = 11;
public const val `DBLITERAL_INVALID`: `DBLITERALENUM` = 0;
public const val `DBLITERAL_LEVEL_NAME`: `DBLITERALENUM20` = 24;
public const val `DBLITERAL_LIKE_PERCENT`: `DBLITERALENUM` = 12;
public const val `DBLITERAL_LIKE_UNDERSCORE`: `DBLITERALENUM` = 13;
public const val `DBLITERAL_MEMBER_NAME`: `DBLITERALENUM20` = 25;
public const val `DBLITERAL_PROCEDURE_NAME`: `DBLITERALENUM` = 14;
public const val `DBLITERAL_PROPERTY_NAME`: `DBLITERALENUM20` = 26;
public const val `DBLITERAL_QUOTE`: `DBLITERALENUM` = 15;
public const val `DBLITERAL_QUOTE_SUFFIX`: `DBLITERALENUM20` = 28;
public const val `DBLITERAL_SCHEMA_NAME`: `DBLITERALENUM` = 16;
public const val `DBLITERAL_SCHEMA_SEPARATOR`: `DBLITERALENUM20` = 27;
public const val `DBLITERAL_TABLE_NAME`: `DBLITERALENUM` = 17;
public const val `DBLITERAL_TEXT_COMMAND`: `DBLITERALENUM` = 18;
public const val `DBLITERAL_USER_NAME`: `DBLITERALENUM` = 19;
public const val `DBLITERAL_VIEW_NAME`: `DBLITERALENUM` = 20;
public typealias `DBMATCHTYPEENUM` = Int;
public const val `DBMATCHTYPE_FULL`: `DBMATCHTYPEENUM` = 0;
public const val `DBMATCHTYPE_NONE`: `DBMATCHTYPEENUM` = 1;
public const val `DBMATCHTYPE_PARTIAL`: `DBMATCHTYPEENUM` = 2;
public const val `DBMAXCHAR`: UInt = 8001u;
public typealias `DBMEMOWNERENUM` = Int;
public const val `DBMEMOWNER_CLIENTOWNED`: `DBMEMOWNERENUM` = 0;
public const val `DBMEMOWNER_PROVIDEROWNED`: `DBMEMOWNERENUM` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DBMONEY` (
    public var `mnyhigh`: Int,
    public var `mnylow`: UInt,
)
public typealias `DBMOVEFLAGSENUM` = Int;
public const val `DBMOVE_ALLOW_EMULATION`: `DBMOVEFLAGSENUM` = 1024;
public const val `DBMOVE_ASYNC`: `DBMOVEFLAGSENUM` = 256;
public const val `DBMOVE_ATOMIC`: `DBMOVEFLAGSENUM` = 4096;
public const val `DBMOVE_DONT_UPDATE_LINKS`: `DBMOVEFLAGSENUM` = 512;
public const val `DBMOVE_REPLACE_EXISTING`: `DBMOVEFLAGSENUM` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DBOBJECT` (
    public var `dwFlags`: UInt,
    public var `iid`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DBOBJECT` (
    public var `dwFlags`: UInt,
    public var `iid`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBPARAMBINDINFO` (
    public var `pwszDataSourceType`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszName`: `windows_sys`.`core`.`PWSTR`,
    public var `ulParamSize`: ULong,
    public var `dwFlags`: UInt,
    public var `bPrecision`: UByte,
    public var `bScale`: UByte,
)
// UNSUPPORTED Rust 1241:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for DBPARAMBINDINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBPARAMBINDINFO` (
    public var `pwszDataSourceType`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszName`: `windows_sys`.`core`.`PWSTR`,
    public var `ulParamSize`: ULong,
    public var `dwFlags`: UInt,
    public var `bPrecision`: UByte,
    public var `bScale`: UByte,
)
// UNSUPPORTED Rust 1258:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for DBPARAMBINDINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DBPARAMFLAGSENUM` = Int;
public typealias `DBPARAMFLAGSENUM20` = Int;
public const val `DBPARAMFLAGS_ISINPUT`: `DBPARAMFLAGSENUM` = 1;
public const val `DBPARAMFLAGS_ISLONG`: `DBPARAMFLAGSENUM` = 128;
public const val `DBPARAMFLAGS_ISNULLABLE`: `DBPARAMFLAGSENUM` = 64;
public const val `DBPARAMFLAGS_ISOUTPUT`: `DBPARAMFLAGSENUM` = 2;
public const val `DBPARAMFLAGS_ISSIGNED`: `DBPARAMFLAGSENUM` = 16;
public const val `DBPARAMFLAGS_SCALEISNEGATIVE`: `DBPARAMFLAGSENUM20` = 256;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBPARAMINFO` (
    public var `dwFlags`: UInt,
    public var `iOrdinal`: ULong,
    public var `pwszName`: `windows_sys`.`core`.`PWSTR`,
    public var `pTypeInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ulParamSize`: ULong,
    public var `wType`: UShort,
    public var `bPrecision`: UByte,
    public var `bScale`: UByte,
)
// UNSUPPORTED Rust 1286:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_System_Com")]
// impl Default for DBPARAMINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBPARAMINFO` (
    public var `dwFlags`: UInt,
    public var `iOrdinal`: ULong,
    public var `pwszName`: `windows_sys`.`core`.`PWSTR`,
    public var `pTypeInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ulParamSize`: ULong,
    public var `wType`: UShort,
    public var `bPrecision`: UByte,
    public var `bScale`: UByte,
)
// UNSUPPORTED Rust 1307:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_Com")]
// impl Default for DBPARAMINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DBPARAMIOENUM` = Int;
public const val `DBPARAMIO_INPUT`: `DBPARAMIOENUM` = 1;
public const val `DBPARAMIO_NOTPARAM`: `DBPARAMIOENUM` = 0;
public const val `DBPARAMIO_OUTPUT`: `DBPARAMIOENUM` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBPARAMS` (
    public var `pData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `cParamSets`: ULong,
    public var `hAccessor`: `HACCESSOR`,
)
// UNSUPPORTED Rust 1326:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for DBPARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBPARAMS` (
    public var `pData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `cParamSets`: ULong,
    public var `hAccessor`: `HACCESSOR`,
)
// UNSUPPORTED Rust 1340:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for DBPARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DBPARAMTYPE_INPUT`: UInt = 1u;
public const val `DBPARAMTYPE_INPUTOUTPUT`: UInt = 2u;
public const val `DBPARAMTYPE_OUTPUT`: UInt = 3u;
public const val `DBPARAMTYPE_RETURNVALUE`: UInt = 4u;
public typealias `DBPARTENUM` = Int;
public const val `DBPART_INVALID`: `DBPARTENUM` = 0;
public const val `DBPART_LENGTH`: `DBPARTENUM` = 2;
public const val `DBPART_STATUS`: `DBPARTENUM` = 4;
public const val `DBPART_VALUE`: `DBPARTENUM` = 1;
public typealias `DBPENDINGSTATUSENUM` = Int;
public const val `DBPENDINGSTATUS_CHANGED`: `DBPENDINGSTATUSENUM` = 2;
public const val `DBPENDINGSTATUS_DELETED`: `DBPENDINGSTATUSENUM` = 4;
public const val `DBPENDINGSTATUS_INVALIDROW`: `DBPENDINGSTATUSENUM` = 16;
public const val `DBPENDINGSTATUS_NEW`: `DBPENDINGSTATUSENUM` = 1;
public const val `DBPENDINGSTATUS_UNCHANGED`: `DBPENDINGSTATUSENUM` = 8;
public typealias `DBPOSITIONFLAGSENUM` = Int;
public const val `DBPOSITION_BOF`: `DBPOSITIONFLAGSENUM` = 2;
public const val `DBPOSITION_EOF`: `DBPOSITIONFLAGSENUM` = 3;
public const val `DBPOSITION_NOROW`: `DBPOSITIONFLAGSENUM` = 1;
public const val `DBPOSITION_OK`: `DBPOSITIONFLAGSENUM` = 0;
public typealias `DBPROMPTOPTIONSENUM` = Int;
public const val `DBPROMPTOPTIONS_BROWSEONLY`: `DBPROMPTOPTIONSENUM` = 8;
public const val `DBPROMPTOPTIONS_DISABLESAVEPASSWORD`: `DBPROMPTOPTIONSENUM` = 32;
public const val `DBPROMPTOPTIONS_DISABLE_PROVIDER_SELECTION`: `DBPROMPTOPTIONSENUM` = 16;
public const val `DBPROMPTOPTIONS_NONE`: `DBPROMPTOPTIONSENUM` = 0;
public const val `DBPROMPTOPTIONS_PROPERTYSHEET`: `DBPROMPTOPTIONSENUM` = 2;
public const val `DBPROMPTOPTIONS_WIZARDSHEET`: `DBPROMPTOPTIONSENUM` = 1;
public const val `DBPROMPT_COMPLETE`: UInt = 2u;
public const val `DBPROMPT_COMPLETEREQUIRED`: UInt = 3u;
public const val `DBPROMPT_NOPROMPT`: UInt = 4u;
public const val `DBPROMPT_PROMPT`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBPROP` (
    public var `dwPropertyID`: UInt,
    public var `dwOptions`: UInt,
    public var `dwStatus`: UInt,
    public var `colid`: `super`.`super`.`Storage`.`IndexServer`.`DBID`,
    public var `vValue`: `super`.`Variant`.`VARIANT`,
)
// UNSUPPORTED Rust 1388:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// impl Default for DBPROP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBPROP` (
    public var `dwPropertyID`: UInt,
    public var `dwOptions`: UInt,
    public var `dwStatus`: UInt,
    public var `colid`: `super`.`super`.`Storage`.`IndexServer`.`DBID`,
    public var `vValue`: `super`.`Variant`.`VARIANT`,
)
// UNSUPPORTED Rust 1406:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// impl Default for DBPROP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DBPROPENUM` = Int;
public typealias `DBPROPENUM15` = Int;
public typealias `DBPROPENUM20` = Int;
public typealias `DBPROPENUM21` = Int;
public typealias `DBPROPENUM25` = Int;
public typealias `DBPROPENUM25_DEPRECATED` = Int;
public typealias `DBPROPENUM26` = Int;
public typealias `DBPROPENUMDEPRECATED` = Int;
public typealias `DBPROPFLAGSENUM` = Int;
public typealias `DBPROPFLAGSENUM21` = Int;
public typealias `DBPROPFLAGSENUM25` = Int;
public typealias `DBPROPFLAGSENUM26` = Int;
public const val `DBPROPFLAGS_COLUMN`: `DBPROPFLAGSENUM` = 1;
public const val `DBPROPFLAGS_COLUMNOK`: `DBPROPFLAGSENUM` = 256;
public const val `DBPROPFLAGS_DATASOURCE`: `DBPROPFLAGSENUM` = 2;
public const val `DBPROPFLAGS_DATASOURCECREATE`: `DBPROPFLAGSENUM` = 4;
public const val `DBPROPFLAGS_DATASOURCEINFO`: `DBPROPFLAGSENUM` = 8;
public const val `DBPROPFLAGS_DBINIT`: `DBPROPFLAGSENUM` = 16;
public const val `DBPROPFLAGS_INDEX`: `DBPROPFLAGSENUM` = 32;
public const val `DBPROPFLAGS_NOTSUPPORTED`: `DBPROPFLAGSENUM` = 0;
public const val `DBPROPFLAGS_PERSIST`: UInt = 8192u;
public const val `DBPROPFLAGS_READ`: `DBPROPFLAGSENUM` = 512;
public const val `DBPROPFLAGS_REQUIRED`: `DBPROPFLAGSENUM` = 2048;
public const val `DBPROPFLAGS_ROWSET`: `DBPROPFLAGSENUM` = 64;
public const val `DBPROPFLAGS_SESSION`: `DBPROPFLAGSENUM` = 4096;
public const val `DBPROPFLAGS_STREAM`: `DBPROPFLAGSENUM26` = 32768;
public const val `DBPROPFLAGS_TABLE`: `DBPROPFLAGSENUM` = 128;
public const val `DBPROPFLAGS_TRUSTEE`: `DBPROPFLAGSENUM21` = 8192;
public const val `DBPROPFLAGS_VIEW`: `DBPROPFLAGSENUM25` = 16384;
public const val `DBPROPFLAGS_WRITE`: `DBPROPFLAGSENUM` = 1024;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBPROPIDSET` (
    public var `rgPropertyIDs`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `cPropertyIDs`: UInt,
    public var `guidPropertySet`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 1451:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for DBPROPIDSET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBPROPIDSET` (
    public var `rgPropertyIDs`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `cPropertyIDs`: UInt,
    public var `guidPropertySet`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 1465:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for DBPROPIDSET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBPROPINFO` (
    public var `pwszDescription`: `windows_sys`.`core`.`PWSTR`,
    public var `dwPropertyID`: UInt,
    public var `dwFlags`: UInt,
    public var `vtType`: `super`.`Variant`.`VARENUM`,
    public var `vValues`: `super`.`Variant`.`VARIANT`,
)
// UNSUPPORTED Rust 1482:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// impl Default for DBPROPINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBPROPINFO` (
    public var `pwszDescription`: `windows_sys`.`core`.`PWSTR`,
    public var `dwPropertyID`: UInt,
    public var `dwFlags`: UInt,
    public var `vtType`: `super`.`Variant`.`VARENUM`,
    public var `vValues`: `super`.`Variant`.`VARIANT`,
)
// UNSUPPORTED Rust 1500:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// impl Default for DBPROPINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBPROPINFOSET` (
    public var `rgPropertyInfos`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DBPROPINFO`>?,
    public var `cPropertyInfos`: UInt,
    public var `guidPropertySet`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 1516:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// impl Default for DBPROPINFOSET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBPROPINFOSET` (
    public var `rgPropertyInfos`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DBPROPINFO`>?,
    public var `cPropertyInfos`: UInt,
    public var `guidPropertySet`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 1532:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// impl Default for DBPROPINFOSET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DBPROPOPTIONSENUM` = Int;
public const val `DBPROPOPTIONS_OPTIONAL`: `DBPROPOPTIONSENUM` = 1;
public const val `DBPROPOPTIONS_REQUIRED`: `DBPROPOPTIONSENUM` = 0;
public const val `DBPROPOPTIONS_SETIFCHEAP`: `DBPROPOPTIONSENUM` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBPROPSET` (
    public var `rgProperties`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DBPROP`>?,
    public var `cProperties`: UInt,
    public var `guidPropertySet`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 1552:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// impl Default for DBPROPSET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBPROPSET` (
    public var `rgProperties`: /* Rust *mut */ kotlinx.cinterop.CPointer<`DBPROP`>?,
    public var `cProperties`: UInt,
    public var `guidPropertySet`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 1568:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// impl Default for DBPROPSET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1575:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DBPROPSET_MSDAORA8_ROWSET: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7f06a375_dd6a_43db_b4e0_1fc121e5e62b);

// UNSUPPORTED Rust 1576:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DBPROPSET_MSDAORA_ROWSET: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe8cc4cbd_fdff_11d0_b865_00a0c9081c1d);

// UNSUPPORTED Rust 1577:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DBPROPSET_MSDSDBINIT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x55cb91a8_5c7a_11d1_adad_00c04fc29863);

// UNSUPPORTED Rust 1578:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DBPROPSET_MSDSSESSION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xedf17536_afbf_11d1_8847_0000f879f98c);

// UNSUPPORTED Rust 1579:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DBPROPSET_PERSIST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d7839a0_5b8e_11d1_a6b3_00a0c9138c66);

// UNSUPPORTED Rust 1580:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DBPROPSET_PROVIDERCONNATTR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x497c60e4_7123_11cf_b171_00aa0057599e);

// UNSUPPORTED Rust 1581:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DBPROPSET_PROVIDERDATASOURCEINFO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x497c60e0_7123_11cf_b171_00aa0057599e);

// UNSUPPORTED Rust 1582:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DBPROPSET_PROVIDERDBINIT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x497c60e2_7123_11cf_b171_00aa0057599e);

// UNSUPPORTED Rust 1583:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DBPROPSET_PROVIDERROWSET: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x497c60e1_7123_11cf_b171_00aa0057599e);

// UNSUPPORTED Rust 1584:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DBPROPSET_PROVIDERSTMTATTR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x497c60e3_7123_11cf_b171_00aa0057599e);

// UNSUPPORTED Rust 1585:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DBPROPSET_SQLSERVERCOLUMN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3b63fb5e_3fbb_11d3_9f29_00c04f8ee9dc);

// UNSUPPORTED Rust 1586:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DBPROPSET_SQLSERVERDATASOURCE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x28efaee4_2d2c_11d1_9807_00c04fc2ad98);

// UNSUPPORTED Rust 1587:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DBPROPSET_SQLSERVERDATASOURCEINFO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdf10cb94_35f6_11d2_9c54_00c04f7971d3);

// UNSUPPORTED Rust 1588:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DBPROPSET_SQLSERVERDBINIT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5cf4ca10_ef21_11d0_97e7_00c04fc2ad98);

// UNSUPPORTED Rust 1589:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DBPROPSET_SQLSERVERROWSET: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5cf4ca11_ef21_11d0_97e7_00c04fc2ad98);

// UNSUPPORTED Rust 1590:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DBPROPSET_SQLSERVERSESSION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x28efaee5_2d2c_11d1_9807_00c04fc2ad98);

// UNSUPPORTED Rust 1591:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DBPROPSET_SQLSERVERSTREAM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9f79c073_8a6d_4bca_a8a8_c9b79a9b962d);

public typealias `DBPROPSTATUSENUM` = Int;
public typealias `DBPROPSTATUSENUM21` = Int;
public const val `DBPROPSTATUS_BADCOLUMN`: `DBPROPSTATUSENUM` = 4;
public const val `DBPROPSTATUS_BADOPTION`: `DBPROPSTATUSENUM` = 3;
public const val `DBPROPSTATUS_BADVALUE`: `DBPROPSTATUSENUM` = 2;
public const val `DBPROPSTATUS_CONFLICTING`: `DBPROPSTATUSENUM` = 8;
public const val `DBPROPSTATUS_NOTALLSETTABLE`: `DBPROPSTATUSENUM` = 5;
public const val `DBPROPSTATUS_NOTAVAILABLE`: `DBPROPSTATUSENUM21` = 9;
public const val `DBPROPSTATUS_NOTSET`: `DBPROPSTATUSENUM` = 7;
public const val `DBPROPSTATUS_NOTSETTABLE`: `DBPROPSTATUSENUM` = 6;
public const val `DBPROPSTATUS_NOTSUPPORTED`: `DBPROPSTATUSENUM` = 1;
public const val `DBPROPSTATUS_OK`: `DBPROPSTATUSENUM` = 0;
public const val `DBPROPVAL_AO_RANDOM`: Int = 2;
public const val `DBPROPVAL_AO_SEQUENTIAL`: Int = 0;
public const val `DBPROPVAL_AO_SEQUENTIALSTORAGEOBJECTS`: Int = 1;
public const val `DBPROPVAL_ASYNCH_BACKGROUNDPOPULATION`: Int = 8;
public const val `DBPROPVAL_ASYNCH_INITIALIZE`: Int = 1;
public const val `DBPROPVAL_ASYNCH_POPULATEONDEMAND`: Int = 32;
public const val `DBPROPVAL_ASYNCH_PREPOPULATE`: Int = 16;
public const val `DBPROPVAL_ASYNCH_RANDOMPOPULATION`: Int = 4;
public const val `DBPROPVAL_ASYNCH_SEQUENTIALPOPULATION`: Int = 2;
public const val `DBPROPVAL_BD_INTRANSACTION`: Int = 1;
public const val `DBPROPVAL_BD_REORGANIZATION`: Int = 3;
public const val `DBPROPVAL_BD_ROWSET`: Int = 0;
public const val `DBPROPVAL_BD_XTRANSACTION`: Int = 2;
public const val `DBPROPVAL_BI_CROSSROWSET`: Int = 1;
public const val `DBPROPVAL_BMK_KEY`: Int = 2;
public const val `DBPROPVAL_BMK_NUMERIC`: Int = 1;
public const val `DBPROPVAL_BO_NOINDEXUPDATE`: Int = 1;
public const val `DBPROPVAL_BO_NOLOG`: Int = 0;
public const val `DBPROPVAL_BO_REFINTEGRITY`: Int = 2;
public const val `DBPROPVAL_CB_DELETE`: Int = 1;
public const val `DBPROPVAL_CB_NON_NULL`: Int = 2;
public const val `DBPROPVAL_CB_NULL`: Int = 1;
public const val `DBPROPVAL_CB_PRESERVE`: Int = 2;
public const val `DBPROPVAL_CD_NOTNULL`: Int = 1;
public const val `DBPROPVAL_CL_END`: Int = 2;
public const val `DBPROPVAL_CL_START`: Int = 1;
public const val `DBPROPVAL_CM_TRANSACTIONS`: Int = 1;
public const val `DBPROPVAL_CO_BEGINSWITH`: Int = 32;
public const val `DBPROPVAL_CO_CASEINSENSITIVE`: Int = 8;
public const val `DBPROPVAL_CO_CASESENSITIVE`: Int = 4;
public const val `DBPROPVAL_CO_CONTAINS`: Int = 16;
public const val `DBPROPVAL_CO_EQUALITY`: Int = 1;
public const val `DBPROPVAL_CO_STRING`: Int = 2;
public const val `DBPROPVAL_CS_COMMUNICATIONFAILURE`: Int = 2;
public const val `DBPROPVAL_CS_INITIALIZED`: Int = 1;
public const val `DBPROPVAL_CS_UNINITIALIZED`: Int = 0;
public const val `DBPROPVAL_CU_DML_STATEMENTS`: Int = 1;
public const val `DBPROPVAL_CU_INDEX_DEFINITION`: Int = 4;
public const val `DBPROPVAL_CU_PRIVILEGE_DEFINITION`: Int = 8;
public const val `DBPROPVAL_CU_TABLE_DEFINITION`: Int = 2;
public const val `DBPROPVAL_DF_INITIALLY_DEFERRED`: UInt = 1u;
public const val `DBPROPVAL_DF_INITIALLY_IMMEDIATE`: UInt = 2u;
public const val `DBPROPVAL_DF_NOT_DEFERRABLE`: UInt = 3u;
public const val `DBPROPVAL_DST_DOCSOURCE`: Int = 4;
public const val `DBPROPVAL_DST_MDP`: Int = 2;
public const val `DBPROPVAL_DST_TDP`: Int = 1;
public const val `DBPROPVAL_DST_TDPANDMDP`: Int = 3;
public const val `DBPROPVAL_FU_CATALOG`: Int = 8;
public const val `DBPROPVAL_FU_COLUMN`: Int = 2;
public const val `DBPROPVAL_FU_NOT_SUPPORTED`: Int = 1;
public const val `DBPROPVAL_FU_TABLE`: Int = 4;
public const val `DBPROPVAL_GB_COLLATE`: Int = 16;
public const val `DBPROPVAL_GB_CONTAINS_SELECT`: Int = 4;
public const val `DBPROPVAL_GB_EQUALS_SELECT`: Int = 2;
public const val `DBPROPVAL_GB_NOT_SUPPORTED`: Int = 1;
public const val `DBPROPVAL_GB_NO_RELATION`: Int = 8;
public const val `DBPROPVAL_GU_NOTSUPPORTED`: Int = 1;
public const val `DBPROPVAL_GU_SUFFIX`: Int = 2;
public const val `DBPROPVAL_HT_DIFFERENT_CATALOGS`: Int = 1;
public const val `DBPROPVAL_HT_DIFFERENT_PROVIDERS`: Int = 2;
public const val `DBPROPVAL_IC_LOWER`: Int = 2;
public const val `DBPROPVAL_IC_MIXED`: Int = 8;
public const val `DBPROPVAL_IC_SENSITIVE`: Int = 4;
public const val `DBPROPVAL_IC_UPPER`: Int = 1;
public const val `DBPROPVAL_IN_ALLOWNULL`: Int = 0;
public const val `DBPROPVAL_IN_DISALLOWNULL`: Int = 1;
public const val `DBPROPVAL_IN_IGNOREANYNULL`: Int = 4;
public const val `DBPROPVAL_IN_IGNORENULL`: Int = 2;
public const val `DBPROPVAL_IT_BTREE`: Int = 1;
public const val `DBPROPVAL_IT_CONTENT`: Int = 3;
public const val `DBPROPVAL_IT_HASH`: Int = 2;
public const val `DBPROPVAL_IT_OTHER`: Int = 4;
public const val `DBPROPVAL_LM_INTENT`: Int = 4;
public const val `DBPROPVAL_LM_NONE`: Int = 1;
public const val `DBPROPVAL_LM_READ`: Int = 2;
public const val `DBPROPVAL_LM_RITE`: Int = 8;
public const val `DBPROPVAL_LM_SINGLEROW`: Int = 2;
public const val `DBPROPVAL_MR_CONCURRENT`: Int = 2;
public const val `DBPROPVAL_MR_NOTSUPPORTED`: Int = 0;
public const val `DBPROPVAL_MR_SUPPORTED`: Int = 1;
public const val `DBPROPVAL_NC_END`: Int = 1;
public const val `DBPROPVAL_NC_HIGH`: Int = 2;
public const val `DBPROPVAL_NC_LOW`: Int = 4;
public const val `DBPROPVAL_NC_START`: Int = 8;
public const val `DBPROPVAL_NP_ABOUTTODO`: Int = 2;
public const val `DBPROPVAL_NP_DIDEVENT`: Int = 16;
public const val `DBPROPVAL_NP_FAILEDTODO`: Int = 8;
public const val `DBPROPVAL_NP_OKTODO`: Int = 1;
public const val `DBPROPVAL_NP_SYNCHAFTER`: Int = 4;
public const val `DBPROPVAL_NT_MULTIPLEROWS`: Int = 2;
public const val `DBPROPVAL_NT_SINGLEROW`: Int = 1;
public const val `DBPROPVAL_OA_ATEXECUTE`: Int = 2;
public const val `DBPROPVAL_OA_ATROWRELEASE`: Int = 4;
public const val `DBPROPVAL_OA_NOTSUPPORTED`: Int = 1;
public const val `DBPROPVAL_OO_BLOB`: Int = 1;
public const val `DBPROPVAL_OO_DIRECTBIND`: Int = 16;
public const val `DBPROPVAL_OO_IPERSIST`: Int = 2;
public const val `DBPROPVAL_OO_ROWOBJECT`: Int = 4;
public const val `DBPROPVAL_OO_SCOPED`: Int = 8;
public const val `DBPROPVAL_OO_SINGLETON`: Int = 32;
public const val `DBPROPVAL_OP_EQUAL`: Int = 1;
public const val `DBPROPVAL_OP_RELATIVE`: Int = 2;
public const val `DBPROPVAL_OP_STRING`: Int = 4;
public const val `DBPROPVAL_ORS_HISTOGRAM`: Int = 8;
public const val `DBPROPVAL_ORS_INDEX`: Int = 1;
public const val `DBPROPVAL_ORS_INTEGRATEDINDEX`: Int = 2;
public const val `DBPROPVAL_ORS_STOREDPROC`: Int = 4;
public const val `DBPROPVAL_ORS_TABLE`: Int = 0;
public const val `DBPROPVAL_OS_AGR_AFTERSESSION`: Int = 8;
public const val `DBPROPVAL_OS_CLIENTCURSOR`: Int = 4;
public const val `DBPROPVAL_OS_DISABLEALL`: Int = 0;
public const val `DBPROPVAL_OS_ENABLEALL`: Int = -1;
public const val `DBPROPVAL_OS_RESOURCEPOOLING`: Int = 1;
public const val `DBPROPVAL_OS_TXNENLISTMENT`: Int = 2;
public const val `DBPROPVAL_PERSIST_ADTG`: UInt = 0u;
public const val `DBPROPVAL_PERSIST_XML`: UInt = 1u;
public const val `DBPROPVAL_PT_GUID`: Int = 8;
public const val `DBPROPVAL_PT_GUID_NAME`: Int = 1;
public const val `DBPROPVAL_PT_GUID_PROPID`: Int = 2;
public const val `DBPROPVAL_PT_NAME`: Int = 4;
public const val `DBPROPVAL_PT_PGUID_NAME`: Int = 32;
public const val `DBPROPVAL_PT_PGUID_PROPID`: Int = 64;
public const val `DBPROPVAL_PT_PROPID`: Int = 16;
public const val `DBPROPVAL_RD_RESETALL`: Int = -1;
public const val `DBPROPVAL_RT_APTMTTHREAD`: Int = 2;
public const val `DBPROPVAL_RT_FREETHREAD`: Int = 1;
public const val `DBPROPVAL_RT_SINGLETHREAD`: Int = 4;
public const val `DBPROPVAL_SQL_ANSI89_IEF`: Int = 8;
public const val `DBPROPVAL_SQL_ANSI92_ENTRY`: Int = 16;
public const val `DBPROPVAL_SQL_ANSI92_FULL`: Int = 128;
public const val `DBPROPVAL_SQL_ANSI92_INTERMEDIATE`: Int = 64;
public const val `DBPROPVAL_SQL_ESCAPECLAUSES`: Int = 256;
public const val `DBPROPVAL_SQL_FIPS_TRANSITIONAL`: Int = 32;
public const val `DBPROPVAL_SQL_NONE`: Int = 0;
public const val `DBPROPVAL_SQL_ODBC_CORE`: Int = 2;
public const val `DBPROPVAL_SQL_ODBC_EXTENDED`: Int = 4;
public const val `DBPROPVAL_SQL_ODBC_MINIMUM`: Int = 1;
public const val `DBPROPVAL_SQL_SUBMINIMUM`: Int = 512;
public const val `DBPROPVAL_SQ_COMPARISON`: Int = 2;
public const val `DBPROPVAL_SQ_CORRELATEDSUBQUERIES`: Int = 1;
public const val `DBPROPVAL_SQ_EXISTS`: Int = 4;
public const val `DBPROPVAL_SQ_IN`: Int = 8;
public const val `DBPROPVAL_SQ_QUANTIFIED`: Int = 16;
public const val `DBPROPVAL_SQ_TABLE`: Int = 32;
public const val `DBPROPVAL_SS_ILOCKBYTES`: Int = 8;
public const val `DBPROPVAL_SS_ISEQUENTIALSTREAM`: Int = 1;
public const val `DBPROPVAL_SS_ISTORAGE`: Int = 4;
public const val `DBPROPVAL_SS_ISTREAM`: Int = 2;
public const val `DBPROPVAL_STGM_CONVERT`: UInt = 262144u;
public const val `DBPROPVAL_STGM_DELETEONRELEASE`: UInt = 2097152u;
public const val `DBPROPVAL_STGM_DIRECT`: UInt = 65536u;
public const val `DBPROPVAL_STGM_FAILIFTHERE`: UInt = 524288u;
public const val `DBPROPVAL_STGM_PRIORITY`: UInt = 1048576u;
public const val `DBPROPVAL_STGM_TRANSACTED`: UInt = 131072u;
public const val `DBPROPVAL_SU_DML_STATEMENTS`: Int = 1;
public const val `DBPROPVAL_SU_INDEX_DEFINITION`: Int = 4;
public const val `DBPROPVAL_SU_PRIVILEGE_DEFINITION`: Int = 8;
public const val `DBPROPVAL_SU_TABLE_DEFINITION`: Int = 2;
public const val `DBPROPVAL_TC_ALL`: Int = 8;
public const val `DBPROPVAL_TC_DDL_COMMIT`: Int = 2;
public const val `DBPROPVAL_TC_DDL_IGNORE`: Int = 4;
public const val `DBPROPVAL_TC_DDL_LOCK`: Int = 16;
public const val `DBPROPVAL_TC_DML`: Int = 1;
public const val `DBPROPVAL_TC_NONE`: Int = 0;
public const val `DBPROPVAL_TI_BROWSE`: Int = 256;
public const val `DBPROPVAL_TI_CHAOS`: Int = 16;
public const val `DBPROPVAL_TI_CURSORSTABILITY`: Int = 4096;
public const val `DBPROPVAL_TI_ISOLATED`: Int = 1048576;
public const val `DBPROPVAL_TI_READCOMMITTED`: Int = 4096;
public const val `DBPROPVAL_TI_READUNCOMMITTED`: Int = 256;
public const val `DBPROPVAL_TI_REPEATABLEREAD`: Int = 65536;
public const val `DBPROPVAL_TI_SERIALIZABLE`: Int = 1048576;
public const val `DBPROPVAL_TR_ABORT`: Int = 16;
public const val `DBPROPVAL_TR_ABORT_DC`: Int = 8;
public const val `DBPROPVAL_TR_ABORT_NO`: Int = 32;
public const val `DBPROPVAL_TR_BOTH`: Int = 128;
public const val `DBPROPVAL_TR_COMMIT`: Int = 2;
public const val `DBPROPVAL_TR_COMMIT_DC`: Int = 1;
public const val `DBPROPVAL_TR_COMMIT_NO`: Int = 4;
public const val `DBPROPVAL_TR_DONTCARE`: Int = 64;
public const val `DBPROPVAL_TR_NONE`: Int = 256;
public const val `DBPROPVAL_TR_OPTIMISTIC`: Int = 512;
public const val `DBPROPVAL_TS_CARDINALITY`: Int = 1;
public const val `DBPROPVAL_TS_HISTOGRAM`: Int = 2;
public const val `DBPROPVAL_UP_CHANGE`: Int = 1;
public const val `DBPROPVAL_UP_DELETE`: Int = 2;
public const val `DBPROPVAL_UP_INSERT`: Int = 4;
public const val `DBPROP_ABORTPRESERVE`: `DBPROPENUM` = 2;
public const val `DBPROP_ACCESSORDER`: `DBPROPENUM20` = 231;
public const val `DBPROP_ACTIVESESSIONS`: `DBPROPENUM` = 3;
public const val `DBPROP_ALTERCOLUMN`: `DBPROPENUM20` = 245;
public const val `DBPROP_APPENDONLY`: `DBPROPENUM` = 187;
public const val `DBPROP_ASYNCTXNABORT`: `DBPROPENUM` = 168;
public const val `DBPROP_ASYNCTXNCOMMIT`: `DBPROPENUM` = 4;
public const val `DBPROP_AUTH_CACHE_AUTHINFO`: `DBPROPENUM` = 5;
public const val `DBPROP_AUTH_ENCRYPT_PASSWORD`: `DBPROPENUM` = 6;
public const val `DBPROP_AUTH_INTEGRATED`: `DBPROPENUM` = 7;
public const val `DBPROP_AUTH_MASK_PASSWORD`: `DBPROPENUM` = 8;
public const val `DBPROP_AUTH_PASSWORD`: `DBPROPENUM` = 9;
public const val `DBPROP_AUTH_PERSIST_ENCRYPTED`: `DBPROPENUM` = 10;
public const val `DBPROP_AUTH_PERSIST_SENSITIVE_AUTHINFO`: `DBPROPENUM` = 11;
public const val `DBPROP_AUTH_USERID`: `DBPROPENUM` = 12;
public const val `DBPROP_BLOCKINGSTORAGEOBJECTS`: `DBPROPENUM` = 13;
public const val `DBPROP_BOOKMARKINFO`: `DBPROPENUM20` = 232;
public const val `DBPROP_BOOKMARKS`: `DBPROPENUM` = 14;
public const val `DBPROP_BOOKMARKSKIPPED`: `DBPROPENUM` = 15;
public const val `DBPROP_BOOKMARKTYPE`: `DBPROPENUM` = 16;
public const val `DBPROP_BYREFACCESSORS`: `DBPROPENUM` = 120;
public const val `DBPROP_CACHEDEFERRED`: `DBPROPENUM` = 17;
public const val `DBPROP_CANFETCHBACKWARDS`: `DBPROPENUM` = 18;
public const val `DBPROP_CANHOLDROWS`: `DBPROPENUM` = 19;
public const val `DBPROP_CANSCROLLBACKWARDS`: `DBPROPENUM` = 21;
public const val `DBPROP_CATALOGLOCATION`: `DBPROPENUM` = 22;
public const val `DBPROP_CATALOGTERM`: `DBPROPENUM` = 23;
public const val `DBPROP_CATALOGUSAGE`: `DBPROPENUM` = 24;
public const val `DBPROP_CHANGEINSERTEDROWS`: `DBPROPENUM` = 188;
public const val `DBPROP_CLIENTCURSOR`: `DBPROPENUM20` = 260;
public const val `DBPROP_COLUMNDEFINITION`: `DBPROPENUM` = 32;
public const val `DBPROP_COLUMNLCID`: `DBPROPENUM20` = 246;
public const val `DBPROP_COLUMNRESTRICT`: `DBPROPENUM` = 33;
public const val `DBPROP_COL_AUTOINCREMENT`: `DBPROPENUM` = 26;
public const val `DBPROP_COL_DEFAULT`: `DBPROPENUM` = 27;
public const val `DBPROP_COL_DESCRIPTION`: `DBPROPENUM` = 28;
public const val `DBPROP_COL_FIXEDLENGTH`: `DBPROPENUM` = 167;
public const val `DBPROP_COL_INCREMENT`: `DBPROPENUM25` = 283;
public const val `DBPROP_COL_ISLONG`: `DBPROPENUM21` = 281;
public const val `DBPROP_COL_NULLABLE`: `DBPROPENUM` = 29;
public const val `DBPROP_COL_PRIMARYKEY`: `DBPROPENUM` = 30;
public const val `DBPROP_COL_SEED`: `DBPROPENUM25` = 282;
public const val `DBPROP_COL_UNIQUE`: `DBPROPENUM` = 31;
public const val `DBPROP_COMMANDTIMEOUT`: `DBPROPENUM` = 34;
public const val `DBPROP_COMMITPRESERVE`: `DBPROPENUM` = 35;
public const val `DBPROP_COMSERVICES`: `DBPROPENUM25` = 285;
public const val `DBPROP_CONCATNULLBEHAVIOR`: `DBPROPENUM` = 36;
public const val `DBPROP_CONNECTIONSTATUS`: `DBPROPENUM20` = 244;
public const val `DBPROP_CURRENTCATALOG`: `DBPROPENUM` = 37;
public const val `DBPROP_DATASOURCENAME`: `DBPROPENUM` = 38;
public const val `DBPROP_DATASOURCEREADONLY`: `DBPROPENUM` = 39;
public const val `DBPROP_DATASOURCE_TYPE`: `DBPROPENUM20` = 251;
public const val `DBPROP_DBMSNAME`: `DBPROPENUM` = 40;
public const val `DBPROP_DBMSVER`: `DBPROPENUM` = 41;
public const val `DBPROP_DEFERRED`: `DBPROPENUM` = 42;
public const val `DBPROP_DELAYSTORAGEOBJECTS`: `DBPROPENUM` = 43;
public const val `DBPROP_DSOTHREADMODEL`: `DBPROPENUM` = 169;
public const val `DBPROP_FILTERCOMPAREOPS`: `DBPROPENUM15` = 209;
public const val `DBPROP_FILTEROPS`: `DBPROPENUMDEPRECATED` = 208;
public const val `DBPROP_FINDCOMPAREOPS`: `DBPROPENUM15` = 210;
public const val `DBPROP_GENERATEURL`: `DBPROPENUM21` = 273;
public const val `DBPROP_GROUPBY`: `DBPROPENUM` = 44;
public const val `DBPROP_HCHAPTER`: UInt = 4u;
public const val `DBPROP_HETEROGENEOUSTABLES`: `DBPROPENUM` = 45;
public const val `DBPROP_HIDDENCOLUMNS`: `DBPROPENUM20` = 258;
public const val `DBPROP_IAccessor`: `DBPROPENUM` = 121;
public const val `DBPROP_IBindResource`: `DBPROPENUM21` = 268;
public const val `DBPROP_IChapteredRowset`: `DBPROPENUM15` = 202;
public const val `DBPROP_IColumnsInfo`: `DBPROPENUM` = 122;
public const val `DBPROP_IColumnsInfo2`: `DBPROPENUM21` = 275;
public const val `DBPROP_IColumnsRowset`: `DBPROPENUM` = 123;
public const val `DBPROP_ICommandCost`: `DBPROPENUM25_DEPRECATED` = 141;
public const val `DBPROP_ICommandTree`: `DBPROPENUM25_DEPRECATED` = 142;
public const val `DBPROP_ICommandValidate`: `DBPROPENUM25_DEPRECATED` = 143;
public const val `DBPROP_IConnectionPointContainer`: `DBPROPENUM` = 124;
public const val `DBPROP_IConvertType`: `DBPROPENUM` = 194;
public const val `DBPROP_ICreateRow`: `DBPROPENUM21` = 269;
public const val `DBPROP_IDBAsynchStatus`: `DBPROPENUM15` = 203;
public const val `DBPROP_IDBBinderProperties`: `DBPROPENUM21` = 274;
public const val `DBPROP_IDBSchemaCommand`: `DBPROPENUM25_DEPRECATED` = 144;
public const val `DBPROP_IDENTIFIERCASE`: `DBPROPENUM` = 46;
public const val `DBPROP_IGetRow`: `DBPROPENUM21` = 266;
public const val `DBPROP_IGetSession`: `DBPROPENUM21` = 277;
public const val `DBPROP_IGetSourceRow`: `DBPROPENUM21` = 278;
public const val `DBPROP_ILockBytes`: `DBPROPENUM` = 136;
public const val `DBPROP_IMMOBILEROWS`: `DBPROPENUM` = 47;
public const val `DBPROP_IMultipleResults`: `DBPROPENUM20` = 217;
public const val `DBPROP_INDEX_AUTOUPDATE`: `DBPROPENUM` = 48;
public const val `DBPROP_INDEX_CLUSTERED`: `DBPROPENUM` = 49;
public const val `DBPROP_INDEX_FILLFACTOR`: `DBPROPENUM` = 50;
public const val `DBPROP_INDEX_INITIALSIZE`: `DBPROPENUM` = 51;
public const val `DBPROP_INDEX_NULLCOLLATION`: `DBPROPENUM` = 52;
public const val `DBPROP_INDEX_NULLS`: `DBPROPENUM` = 53;
public const val `DBPROP_INDEX_PRIMARYKEY`: `DBPROPENUM` = 54;
public const val `DBPROP_INDEX_SORTBOOKMARKS`: `DBPROPENUM` = 55;
public const val `DBPROP_INDEX_TEMPINDEX`: `DBPROPENUM` = 163;
public const val `DBPROP_INDEX_TYPE`: `DBPROPENUM` = 56;
public const val `DBPROP_INDEX_UNIQUE`: `DBPROPENUM` = 57;
public const val `DBPROP_INIT_ASYNCH`: `DBPROPENUM15` = 200;
public const val `DBPROP_INIT_BINDFLAGS`: `DBPROPENUM21` = 270;
public const val `DBPROP_INIT_CATALOG`: `DBPROPENUM20` = 233;
public const val `DBPROP_INIT_DATASOURCE`: `DBPROPENUM` = 59;
public const val `DBPROP_INIT_GENERALTIMEOUT`: `DBPROPENUM25` = 284;
public const val `DBPROP_INIT_HWND`: `DBPROPENUM` = 60;
public const val `DBPROP_INIT_IMPERSONATION_LEVEL`: `DBPROPENUM` = 61;
public const val `DBPROP_INIT_LCID`: `DBPROPENUM` = 186;
public const val `DBPROP_INIT_LOCATION`: `DBPROPENUM` = 62;
public const val `DBPROP_INIT_LOCKOWNER`: `DBPROPENUM21` = 271;
public const val `DBPROP_INIT_MODE`: `DBPROPENUM` = 63;
public const val `DBPROP_INIT_OLEDBSERVICES`: `DBPROPENUM20` = 248;
public const val `DBPROP_INIT_PROMPT`: `DBPROPENUM` = 64;
public const val `DBPROP_INIT_PROTECTION_LEVEL`: `DBPROPENUM` = 65;
public const val `DBPROP_INIT_PROVIDERSTRING`: `DBPROPENUM` = 160;
public const val `DBPROP_INIT_TIMEOUT`: `DBPROPENUM` = 66;
public const val `DBPROP_INTERLEAVEDROWS`: UInt = 8u;
public const val `DBPROP_IParentRowset`: `DBPROPENUM20` = 257;
public const val `DBPROP_IProvideMoniker`: `DBPROPENUM25_DEPRECATED` = 125;
public const val `DBPROP_IQuery`: `DBPROPENUM25_DEPRECATED` = 146;
public const val `DBPROP_IReadData`: `DBPROPENUM25_DEPRECATED` = 147;
public const val `DBPROP_IRegisterProvider`: `DBPROPENUM21` = 276;
public const val `DBPROP_IRow`: `DBPROPENUM21` = 263;
public const val `DBPROP_IRowChange`: `DBPROPENUM21` = 264;
public const val `DBPROP_IRowSchemaChange`: `DBPROPENUM21` = 265;
public const val `DBPROP_IRowset`: `DBPROPENUM` = 126;
public const val `DBPROP_IRowsetAsynch`: `DBPROPENUM25_DEPRECATED` = 148;
public const val `DBPROP_IRowsetBookmark`: `DBPROPENUM26` = 292;
public const val `DBPROP_IRowsetChange`: `DBPROPENUM` = 127;
public const val `DBPROP_IRowsetCopyRows`: `DBPROPENUM25_DEPRECATED` = 149;
public const val `DBPROP_IRowsetCurrentIndex`: `DBPROPENUM21` = 279;
public const val `DBPROP_IRowsetExactScroll`: `DBPROPENUMDEPRECATED` = 154;
public const val `DBPROP_IRowsetFind`: `DBPROPENUM15` = 204;
public const val `DBPROP_IRowsetIdentity`: `DBPROPENUM` = 128;
public const val `DBPROP_IRowsetIndex`: `DBPROPENUM` = 159;
public const val `DBPROP_IRowsetInfo`: `DBPROPENUM` = 129;
public const val `DBPROP_IRowsetKeys`: `DBPROPENUM25_DEPRECATED` = 151;
public const val `DBPROP_IRowsetLocate`: `DBPROPENUM` = 130;
public const val `DBPROP_IRowsetNewRowAfter`: `DBPROPENUM25_DEPRECATED` = 152;
public const val `DBPROP_IRowsetNextRowset`: `DBPROPENUM25_DEPRECATED` = 153;
public const val `DBPROP_IRowsetRefresh`: `DBPROPENUM20` = 249;
public const val `DBPROP_IRowsetResynch`: `DBPROPENUM` = 132;
public const val `DBPROP_IRowsetScroll`: `DBPROPENUM` = 133;
public const val `DBPROP_IRowsetUpdate`: `DBPROPENUM` = 134;
public const val `DBPROP_IRowsetView`: `DBPROPENUM15` = 212;
public const val `DBPROP_IRowsetWatchAll`: `DBPROPENUM25_DEPRECATED` = 155;
public const val `DBPROP_IRowsetWatchNotify`: `DBPROPENUM25_DEPRECATED` = 156;
public const val `DBPROP_IRowsetWatchRegion`: `DBPROPENUM25_DEPRECATED` = 157;
public const val `DBPROP_IRowsetWithParameters`: `DBPROPENUM25_DEPRECATED` = 158;
public const val `DBPROP_IScopedOperations`: `DBPROPENUM21` = 267;
public const val `DBPROP_ISequentialStream`: `DBPROPENUM` = 137;
public const val `DBPROP_IStorage`: `DBPROPENUM` = 138;
public const val `DBPROP_IStream`: `DBPROPENUM` = 139;
public const val `DBPROP_ISupportErrorInfo`: `DBPROPENUM` = 135;
public const val `DBPROP_IViewChapter`: `DBPROPENUM15` = 213;
public const val `DBPROP_IViewFilter`: `DBPROPENUM15` = 214;
public const val `DBPROP_IViewRowset`: `DBPROPENUM15` = 215;
public const val `DBPROP_IViewSort`: `DBPROPENUM15` = 216;
public const val `DBPROP_LITERALBOOKMARKS`: `DBPROPENUM` = 67;
public const val `DBPROP_LITERALIDENTITY`: `DBPROPENUM` = 68;
public const val `DBPROP_LOCKMODE`: `DBPROPENUM20` = 236;
public const val `DBPROP_MAINTAINPROPS`: UInt = 5u;
public const val `DBPROP_MARSHALLABLE`: `DBPROPENUMDEPRECATED` = 197;
public const val `DBPROP_MAXINDEXSIZE`: `DBPROPENUM` = 70;
public const val `DBPROP_MAXOPENCHAPTERS`: `DBPROPENUM15` = 199;
public const val `DBPROP_MAXOPENROWS`: `DBPROPENUM` = 71;
public const val `DBPROP_MAXORSINFILTER`: `DBPROPENUM15` = 205;
public const val `DBPROP_MAXPENDINGROWS`: `DBPROPENUM` = 72;
public const val `DBPROP_MAXROWS`: `DBPROPENUM` = 73;
public const val `DBPROP_MAXROWSIZE`: `DBPROPENUM` = 74;
public const val `DBPROP_MAXROWSIZEINCLUDESBLOB`: `DBPROPENUM` = 75;
public const val `DBPROP_MAXSORTCOLUMNS`: `DBPROPENUM15` = 206;
public const val `DBPROP_MAXTABLESINSELECT`: `DBPROPENUM` = 76;
public const val `DBPROP_MAYWRITECOLUMN`: `DBPROPENUM` = 77;
public const val `DBPROP_MEMORYUSAGE`: `DBPROPENUM` = 78;
public const val `DBPROP_MSDAORA8_DETERMINEKEYCOLUMNS`: UInt = 2u;
public const val `DBPROP_MSDAORA_DETERMINEKEYCOLUMNS`: UInt = 1u;
public const val `DBPROP_MSDS_DBINIT_DATAPROVIDER`: `MSDSDBINITPROPENUM` = 2;
public const val `DBPROP_MSDS_SESS_UNIQUENAMES`: `MSDSSESSIONPROPENUM` = 2;
public const val `DBPROP_MULTIPLECONNECTIONS`: `DBPROPENUM20` = 237;
public const val `DBPROP_MULTIPLEPARAMSETS`: `DBPROPENUM` = 191;
public const val `DBPROP_MULTIPLERESULTS`: `DBPROPENUM` = 196;
public const val `DBPROP_MULTIPLESTORAGEOBJECTS`: `DBPROPENUM` = 80;
public const val `DBPROP_MULTITABLEUPDATE`: `DBPROPENUM` = 81;
public const val `DBPROP_NOTIFICATIONGRANULARITY`: `DBPROPENUM` = 198;
public const val `DBPROP_NOTIFICATIONPHASES`: `DBPROPENUM` = 82;
public const val `DBPROP_NOTIFYCOLUMNSET`: `DBPROPENUM` = 171;
public const val `DBPROP_NOTIFYROWDELETE`: `DBPROPENUM` = 173;
public const val `DBPROP_NOTIFYROWFIRSTCHANGE`: `DBPROPENUM` = 174;
public const val `DBPROP_NOTIFYROWINSERT`: `DBPROPENUM` = 175;
public const val `DBPROP_NOTIFYROWRESYNCH`: `DBPROPENUM` = 177;
public const val `DBPROP_NOTIFYROWSETCHANGED`: `DBPROPENUM` = 211;
public const val `DBPROP_NOTIFYROWSETFETCHPOSITIONCHANGE`: `DBPROPENUM` = 179;
public const val `DBPROP_NOTIFYROWSETRELEASE`: `DBPROPENUM` = 178;
public const val `DBPROP_NOTIFYROWUNDOCHANGE`: `DBPROPENUM` = 180;
public const val `DBPROP_NOTIFYROWUNDODELETE`: `DBPROPENUM` = 181;
public const val `DBPROP_NOTIFYROWUNDOINSERT`: `DBPROPENUM` = 182;
public const val `DBPROP_NOTIFYROWUPDATE`: `DBPROPENUM` = 183;
public const val `DBPROP_NULLCOLLATION`: `DBPROPENUM` = 83;
public const val `DBPROP_OLEOBJECTS`: `DBPROPENUM` = 84;
public const val `DBPROP_OPENROWSETSUPPORT`: `DBPROPENUM21` = 280;
public const val `DBPROP_ORDERBYCOLUMNSINSELECT`: `DBPROPENUM` = 85;
public const val `DBPROP_ORDEREDBOOKMARKS`: `DBPROPENUM` = 86;
public const val `DBPROP_OTHERINSERT`: `DBPROPENUM` = 87;
public const val `DBPROP_OTHERUPDATEDELETE`: `DBPROPENUM` = 88;
public const val `DBPROP_OUTPUTENCODING`: `DBPROPENUM26` = 287;
public const val `DBPROP_OUTPUTPARAMETERAVAILABILITY`: `DBPROPENUM` = 184;
public const val `DBPROP_OUTPUTSTREAM`: `DBPROPENUM26` = 286;
public const val `DBPROP_OWNINSERT`: `DBPROPENUM` = 89;
public const val `DBPROP_OWNUPDATEDELETE`: `DBPROPENUM` = 90;
public const val `DBPROP_PERSISTENTIDTYPE`: `DBPROPENUM` = 185;
public const val `DBPROP_PREPAREABORTBEHAVIOR`: `DBPROPENUM` = 91;
public const val `DBPROP_PREPARECOMMITBEHAVIOR`: `DBPROPENUM` = 92;
public const val `DBPROP_PROCEDURETERM`: `DBPROPENUM` = 93;
public const val `DBPROP_PROVIDERFRIENDLYNAME`: `DBPROPENUM20` = 235;
public const val `DBPROP_PROVIDERMEMORY`: `DBPROPENUM20` = 259;
public const val `DBPROP_PROVIDERNAME`: `DBPROPENUM` = 96;
public const val `DBPROP_PROVIDEROLEDBVER`: `DBPROPENUM` = 97;
public const val `DBPROP_PROVIDERVER`: `DBPROPENUM` = 98;
public const val `DBPROP_PersistFormat`: UInt = 2u;
public const val `DBPROP_PersistSchema`: UInt = 3u;
public const val `DBPROP_QUICKRESTART`: `DBPROPENUM` = 99;
public const val `DBPROP_QUOTEDIDENTIFIERCASE`: `DBPROPENUM` = 100;
public const val `DBPROP_REENTRANTEVENTS`: `DBPROPENUM` = 101;
public const val `DBPROP_REMOVEDELETED`: `DBPROPENUM` = 102;
public const val `DBPROP_REPORTMULTIPLECHANGES`: `DBPROPENUM` = 103;
public const val `DBPROP_RESETDATASOURCE`: `DBPROPENUM20` = 247;
public const val `DBPROP_RETURNPENDINGINSERTS`: `DBPROPENUM` = 189;
public const val `DBPROP_ROWRESTRICT`: `DBPROPENUM` = 104;
public const val `DBPROP_ROWSETCONVERSIONSONCOMMAND`: `DBPROPENUM` = 192;
public const val `DBPROP_ROWSET_ASYNCH`: `DBPROPENUM15` = 201;
public const val `DBPROP_ROWTHREADMODEL`: `DBPROPENUM` = 105;
public const val `DBPROP_ROW_BULKOPS`: `DBPROPENUM20` = 234;
public const val `DBPROP_SCHEMATERM`: `DBPROPENUM` = 106;
public const val `DBPROP_SCHEMAUSAGE`: `DBPROPENUM` = 107;
public const val `DBPROP_SERVERCURSOR`: `DBPROPENUM` = 108;
public const val `DBPROP_SERVERDATAONINSERT`: `DBPROPENUM20` = 239;
public const val `DBPROP_SERVERNAME`: `DBPROPENUM20` = 250;
public const val `DBPROP_SESS_AUTOCOMMITISOLEVELS`: `DBPROPENUM` = 190;
public const val `DBPROP_SKIPROWCOUNTRESULTS`: `DBPROPENUM26` = 291;
public const val `DBPROP_SORTONINDEX`: `DBPROPENUM15` = 207;
public const val `DBPROP_SQLSUPPORT`: `DBPROPENUM` = 109;
public const val `DBPROP_STORAGEFLAGS`: `DBPROPENUM20` = 240;
public const val `DBPROP_STRONGIDENTITY`: `DBPROPENUM` = 119;
public const val `DBPROP_STRUCTUREDSTORAGE`: `DBPROPENUM` = 111;
public const val `DBPROP_SUBQUERIES`: `DBPROPENUM` = 112;
public const val `DBPROP_SUPPORTEDTXNDDL`: `DBPROPENUM` = 161;
public const val `DBPROP_SUPPORTEDTXNISOLEVELS`: `DBPROPENUM` = 113;
public const val `DBPROP_SUPPORTEDTXNISORETAIN`: `DBPROPENUM` = 114;
public const val `DBPROP_TABLESTATISTICS`: `DBPROPENUM26` = 288;
public const val `DBPROP_TABLETERM`: `DBPROPENUM` = 115;
public const val `DBPROP_TBL_TEMPTABLE`: `DBPROPENUM` = 140;
public const val `DBPROP_TRANSACTEDOBJECT`: `DBPROPENUM` = 116;
public const val `DBPROP_TRUSTEE_AUTHENTICATION`: `DBPROPENUM21` = 242;
public const val `DBPROP_TRUSTEE_NEWAUTHENTICATION`: `DBPROPENUM21` = 243;
public const val `DBPROP_TRUSTEE_USERNAME`: `DBPROPENUM21` = 241;
public const val `DBPROP_UNIQUEROWS`: `DBPROPENUM20` = 238;
public const val `DBPROP_UPDATABILITY`: `DBPROPENUM` = 117;
public const val `DBPROP_USERNAME`: `DBPROPENUM` = 118;
public const val `DBPROP_Unicode`: UInt = 6u;
// UNSUPPORTED Rust 2049:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DBQUERYGUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x49691c90_7e17_101a_a91c_08002b2ecda9);

public typealias `DBRANGEENUM` = Int;
public typealias `DBRANGEENUM20` = Int;
public const val `DBRANGE_EXCLUDENULLS`: `DBRANGEENUM` = 4;
public const val `DBRANGE_EXCLUSIVEEND`: `DBRANGEENUM` = 2;
public const val `DBRANGE_EXCLUSIVESTART`: `DBRANGEENUM` = 1;
public const val `DBRANGE_INCLUSIVEEND`: `DBRANGEENUM` = 0;
public const val `DBRANGE_INCLUSIVESTART`: `DBRANGEENUM` = 0;
public const val `DBRANGE_MATCH`: `DBRANGEENUM` = 16;
public const val `DBRANGE_MATCH_N_MASK`: `DBRANGEENUM20` = 255;
public const val `DBRANGE_MATCH_N_SHIFT`: `DBRANGEENUM20` = 24;
public const val `DBRANGE_PREFIX`: `DBRANGEENUM` = 8;
public typealias `DBREASONENUM` = Int;
public typealias `DBREASONENUM15` = Int;
public typealias `DBREASONENUM25` = Int;
public const val `DBREASON_COLUMN_RECALCULATED`: `DBREASONENUM` = 3;
public const val `DBREASON_COLUMN_SET`: `DBREASONENUM` = 2;
public const val `DBREASON_ROWPOSITION_CHANGED`: `DBREASONENUM15` = 15;
public const val `DBREASON_ROWPOSITION_CHAPTERCHANGED`: `DBREASONENUM15` = 16;
public const val `DBREASON_ROWPOSITION_CLEARED`: `DBREASONENUM15` = 17;
public const val `DBREASON_ROWSET_CHANGED`: `DBREASONENUM` = 14;
public const val `DBREASON_ROWSET_FETCHPOSITIONCHANGE`: `DBREASONENUM` = 0;
public const val `DBREASON_ROWSET_POPULATIONCOMPLETE`: `DBREASONENUM25` = 20;
public const val `DBREASON_ROWSET_POPULATIONSTOPPED`: `DBREASONENUM25` = 21;
public const val `DBREASON_ROWSET_RELEASE`: `DBREASONENUM` = 1;
public const val `DBREASON_ROWSET_ROWSADDED`: `DBREASONENUM25` = 19;
public const val `DBREASON_ROW_ACTIVATE`: `DBREASONENUM` = 4;
public const val `DBREASON_ROW_ASYNCHINSERT`: `DBREASONENUM15` = 18;
public const val `DBREASON_ROW_DELETE`: `DBREASONENUM` = 6;
public const val `DBREASON_ROW_FIRSTCHANGE`: `DBREASONENUM` = 7;
public const val `DBREASON_ROW_INSERT`: `DBREASONENUM` = 8;
public const val `DBREASON_ROW_RELEASE`: `DBREASONENUM` = 5;
public const val `DBREASON_ROW_RESYNCH`: `DBREASONENUM` = 9;
public const val `DBREASON_ROW_UNDOCHANGE`: `DBREASONENUM` = 10;
public const val `DBREASON_ROW_UNDODELETE`: `DBREASONENUM` = 12;
public const val `DBREASON_ROW_UNDOINSERT`: `DBREASONENUM` = 11;
public const val `DBREASON_ROW_UPDATE`: `DBREASONENUM` = 13;
public typealias `DBRESOURCEKINDENUM` = Int;
public const val `DBRESOURCE_CPU`: `DBRESOURCEKINDENUM` = 2;
public const val `DBRESOURCE_DISK`: `DBRESOURCEKINDENUM` = 4;
public const val `DBRESOURCE_INVALID`: `DBRESOURCEKINDENUM` = 0;
public const val `DBRESOURCE_MEMORY`: `DBRESOURCEKINDENUM` = 3;
public const val `DBRESOURCE_NETWORK`: `DBRESOURCEKINDENUM` = 5;
public const val `DBRESOURCE_OTHER`: `DBRESOURCEKINDENUM` = 8;
public const val `DBRESOURCE_RESPONSE`: `DBRESOURCEKINDENUM` = 6;
public const val `DBRESOURCE_ROWS`: `DBRESOURCEKINDENUM` = 7;
public const val `DBRESOURCE_TOTAL`: `DBRESOURCEKINDENUM` = 1;
public typealias `DBRESULTFLAGENUM` = Int;
public const val `DBRESULTFLAG_DEFAULT`: `DBRESULTFLAGENUM` = 0;
public const val `DBRESULTFLAG_ROW`: `DBRESULTFLAGENUM` = 2;
public const val `DBRESULTFLAG_ROWSET`: `DBRESULTFLAGENUM` = 1;
public typealias `DBROWCHANGEKINDENUM` = Int;
public const val `DBROWCHANGEKIND_COUNT`: `DBROWCHANGEKINDENUM` = 3;
public const val `DBROWCHANGEKIND_DELETE`: `DBROWCHANGEKINDENUM` = 1;
public const val `DBROWCHANGEKIND_INSERT`: `DBROWCHANGEKINDENUM` = 0;
public const val `DBROWCHANGEKIND_UPDATE`: `DBROWCHANGEKINDENUM` = 2;
public typealias `DBROWSTATUSENUM` = Int;
public typealias `DBROWSTATUSENUM20` = Int;
public const val `DBROWSTATUS_E_CANCELED`: `DBROWSTATUSENUM` = 4;
public const val `DBROWSTATUS_E_CANTRELEASE`: `DBROWSTATUSENUM` = 6;
public const val `DBROWSTATUS_E_CONCURRENCYVIOLATION`: `DBROWSTATUSENUM` = 7;
public const val `DBROWSTATUS_E_DELETED`: `DBROWSTATUSENUM` = 8;
public const val `DBROWSTATUS_E_FAIL`: `DBROWSTATUSENUM` = 19;
public const val `DBROWSTATUS_E_INTEGRITYVIOLATION`: `DBROWSTATUSENUM` = 11;
public const val `DBROWSTATUS_E_INVALID`: `DBROWSTATUSENUM` = 12;
public const val `DBROWSTATUS_E_LIMITREACHED`: `DBROWSTATUSENUM` = 17;
public const val `DBROWSTATUS_E_MAXPENDCHANGESEXCEEDED`: `DBROWSTATUSENUM` = 13;
public const val `DBROWSTATUS_E_NEWLYINSERTED`: `DBROWSTATUSENUM` = 10;
public const val `DBROWSTATUS_E_OBJECTOPEN`: `DBROWSTATUSENUM` = 14;
public const val `DBROWSTATUS_E_OUTOFMEMORY`: `DBROWSTATUSENUM` = 15;
public const val `DBROWSTATUS_E_PENDINGINSERT`: `DBROWSTATUSENUM` = 9;
public const val `DBROWSTATUS_E_PERMISSIONDENIED`: `DBROWSTATUSENUM` = 16;
public const val `DBROWSTATUS_E_SCHEMAVIOLATION`: `DBROWSTATUSENUM` = 18;
public const val `DBROWSTATUS_S_MULTIPLECHANGES`: `DBROWSTATUSENUM` = 2;
public const val `DBROWSTATUS_S_NOCHANGE`: `DBROWSTATUSENUM20` = 20;
public const val `DBROWSTATUS_S_OK`: `DBROWSTATUSENUM` = 0;
public const val `DBROWSTATUS_S_PENDINGCHANGES`: `DBROWSTATUSENUM` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DBROWWATCHCHANGE` (
    public var `hRegion`: ULong,
    public var `eChangeKind`: UInt,
    public var `hRow`: ULong,
    public var `iRow`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DBROWWATCHCHANGE` (
    public var `hRegion`: ULong,
    public var `eChangeKind`: UInt,
    public var `hRow`: ULong,
    public var `iRow`: ULong,
)
// UNSUPPORTED Rust 2144:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DBSCHEMA_LINKEDSERVERS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9093caf4_2eac_11d1_9809_00c04fc2ad98);

public typealias `DBSEEKENUM` = Int;
public const val `DBSEEK_AFTER`: `DBSEEKENUM` = 8;
public const val `DBSEEK_AFTEREQ`: `DBSEEKENUM` = 4;
public const val `DBSEEK_BEFORE`: `DBSEEKENUM` = 32;
public const val `DBSEEK_BEFOREEQ`: `DBSEEKENUM` = 16;
public const val `DBSEEK_FIRSTEQ`: `DBSEEKENUM` = 1;
public const val `DBSEEK_INVALID`: `DBSEEKENUM` = 0;
public const val `DBSEEK_LASTEQ`: `DBSEEKENUM` = 2;
// UNSUPPORTED Rust 2153:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DBSELFGUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc8b52231_5cf3_11ce_ade5_00aa0044773d);

public typealias `DBSORTENUM` = Int;
public const val `DBSORT_ASCENDING`: `DBSORTENUM` = 0;
public const val `DBSORT_DESCENDING`: `DBSORTENUM` = 1;
public typealias `DBSOURCETYPEENUM` = Int;
public typealias `DBSOURCETYPEENUM20` = Int;
public typealias `DBSOURCETYPEENUM25` = Int;
public const val `DBSOURCETYPE_BINDER`: `DBSOURCETYPEENUM25` = 4;
public const val `DBSOURCETYPE_DATASOURCE`: `DBSOURCETYPEENUM` = 1;
public const val `DBSOURCETYPE_DATASOURCE_MDP`: `DBSOURCETYPEENUM20` = 3;
public const val `DBSOURCETYPE_DATASOURCE_TDP`: `DBSOURCETYPEENUM20` = 1;
public const val `DBSOURCETYPE_ENUMERATOR`: `DBSOURCETYPEENUM` = 2;
public typealias `DBSTATUSENUM` = Int;
public typealias `DBSTATUSENUM20` = Int;
public typealias `DBSTATUSENUM21` = Int;
public typealias `DBSTATUSENUM25` = Int;
public typealias `DBSTATUSENUM26` = Int;
public const val `DBSTATUS_E_BADACCESSOR`: `DBSTATUSENUM` = 1;
public const val `DBSTATUS_E_BADSTATUS`: `DBSTATUSENUM` = 12;
public const val `DBSTATUS_E_CANCELED`: `DBSTATUSENUM25` = 27;
public const val `DBSTATUS_E_CANNOTCOMPLETE`: `DBSTATUSENUM21` = 20;
public const val `DBSTATUS_E_CANTCONVERTVALUE`: `DBSTATUSENUM` = 2;
public const val `DBSTATUS_E_CANTCREATE`: `DBSTATUSENUM` = 7;
public const val `DBSTATUS_E_DATAOVERFLOW`: `DBSTATUSENUM` = 6;
public const val `DBSTATUS_E_DOESNOTEXIST`: `DBSTATUSENUM21` = 16;
public const val `DBSTATUS_E_INTEGRITYVIOLATION`: `DBSTATUSENUM` = 10;
public const val `DBSTATUS_E_INVALIDURL`: `DBSTATUSENUM21` = 17;
public const val `DBSTATUS_E_NOTCOLLECTION`: `DBSTATUSENUM25` = 28;
public const val `DBSTATUS_E_OUTOFSPACE`: `DBSTATUSENUM21` = 22;
public const val `DBSTATUS_E_PERMISSIONDENIED`: `DBSTATUSENUM` = 9;
public const val `DBSTATUS_E_READONLY`: `DBSTATUSENUM21` = 24;
public const val `DBSTATUS_E_RESOURCEEXISTS`: `DBSTATUSENUM21` = 19;
public const val `DBSTATUS_E_RESOURCELOCKED`: `DBSTATUSENUM21` = 18;
public const val `DBSTATUS_E_RESOURCEOUTOFSCOPE`: `DBSTATUSENUM21` = 25;
public const val `DBSTATUS_E_SCHEMAVIOLATION`: `DBSTATUSENUM` = 11;
public const val `DBSTATUS_E_SIGNMISMATCH`: `DBSTATUSENUM` = 5;
public const val `DBSTATUS_E_UNAVAILABLE`: `DBSTATUSENUM` = 8;
public const val `DBSTATUS_E_VOLUMENOTFOUND`: `DBSTATUSENUM21` = 21;
public const val `DBSTATUS_S_ALREADYEXISTS`: `DBSTATUSENUM21` = 26;
public const val `DBSTATUS_S_CANNOTDELETESOURCE`: `DBSTATUSENUM21` = 23;
public const val `DBSTATUS_S_DEFAULT`: `DBSTATUSENUM` = 13;
public const val `DBSTATUS_S_IGNORE`: `DBSTATUSENUM20` = 15;
public const val `DBSTATUS_S_ISNULL`: `DBSTATUSENUM` = 3;
public const val `DBSTATUS_S_OK`: `DBSTATUSENUM` = 0;
public const val `DBSTATUS_S_ROWSETCOLUMN`: `DBSTATUSENUM26` = 29;
public const val `DBSTATUS_S_TRUNCATED`: `DBSTATUSENUM` = 4;
public const val `DBSTAT_COLUMN_CARDINALITY`: `DBTABLESTATISTICSTYPE26` = 2;
public const val `DBSTAT_HISTOGRAM`: `DBTABLESTATISTICSTYPE26` = 1;
public const val `DBSTAT_TUPLE_CARDINALITY`: `DBTABLESTATISTICSTYPE26` = 4;
public typealias `DBTABLESTATISTICSTYPE26` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DBTIME` (
    public var `hour`: UShort,
    public var `minute`: UShort,
    public var `second`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DBTIMESTAMP` (
    public var `year`: Short,
    public var `month`: UShort,
    public var `day`: UShort,
    public var `hour`: UShort,
    public var `minute`: UShort,
    public var `second`: UShort,
    public var `fraction`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DBTIMESTAMP` (
    public var `year`: Short,
    public var `month`: UShort,
    public var `day`: UShort,
    public var `hour`: UShort,
    public var `minute`: UShort,
    public var `second`: UShort,
    public var `fraction`: UInt,
)
public typealias `DBTYPEENUM` = Int;
public typealias `DBTYPEENUM15` = Int;
public typealias `DBTYPEENUM20` = Int;
public const val `DBTYPE_ARRAY`: `DBTYPEENUM` = 8192;
public const val `DBTYPE_BOOL`: `DBTYPEENUM` = 11;
public const val `DBTYPE_BSTR`: `DBTYPEENUM` = 8;
public const val `DBTYPE_BYREF`: `DBTYPEENUM` = 16384;
public const val `DBTYPE_BYTES`: `DBTYPEENUM` = 128;
public const val `DBTYPE_CY`: `DBTYPEENUM` = 6;
public const val `DBTYPE_DATE`: `DBTYPEENUM` = 7;
public const val `DBTYPE_DBDATE`: `DBTYPEENUM` = 133;
public const val `DBTYPE_DBTIME`: `DBTYPEENUM` = 134;
public const val `DBTYPE_DBTIMESTAMP`: `DBTYPEENUM` = 135;
public const val `DBTYPE_DECIMAL`: `DBTYPEENUM` = 14;
public const val `DBTYPE_EMPTY`: `DBTYPEENUM` = 0;
public const val `DBTYPE_ERROR`: `DBTYPEENUM` = 10;
public const val `DBTYPE_FILETIME`: `DBTYPEENUM20` = 64;
public const val `DBTYPE_GUID`: `DBTYPEENUM` = 72;
public const val `DBTYPE_HCHAPTER`: `DBTYPEENUM15` = 136;
public const val `DBTYPE_I1`: `DBTYPEENUM` = 16;
public const val `DBTYPE_I2`: `DBTYPEENUM` = 2;
public const val `DBTYPE_I4`: `DBTYPEENUM` = 3;
public const val `DBTYPE_I8`: `DBTYPEENUM` = 20;
public const val `DBTYPE_IDISPATCH`: `DBTYPEENUM` = 9;
public const val `DBTYPE_IUNKNOWN`: `DBTYPEENUM` = 13;
public const val `DBTYPE_NULL`: `DBTYPEENUM` = 1;
public const val `DBTYPE_NUMERIC`: `DBTYPEENUM` = 131;
public const val `DBTYPE_PROPVARIANT`: `DBTYPEENUM20` = 138;
public const val `DBTYPE_R4`: `DBTYPEENUM` = 4;
public const val `DBTYPE_R8`: `DBTYPEENUM` = 5;
public const val `DBTYPE_RESERVED`: `DBTYPEENUM` = 32768;
public const val `DBTYPE_SQLVARIANT`: UInt = 144u;
public const val `DBTYPE_STR`: `DBTYPEENUM` = 129;
public const val `DBTYPE_UDT`: `DBTYPEENUM` = 132;
public const val `DBTYPE_UI1`: `DBTYPEENUM` = 17;
public const val `DBTYPE_UI2`: `DBTYPEENUM` = 18;
public const val `DBTYPE_UI4`: `DBTYPEENUM` = 19;
public const val `DBTYPE_UI8`: `DBTYPEENUM` = 21;
public const val `DBTYPE_VARIANT`: `DBTYPEENUM` = 12;
public const val `DBTYPE_VARNUMERIC`: `DBTYPEENUM20` = 139;
public const val `DBTYPE_VECTOR`: `DBTYPEENUM` = 4096;
public const val `DBTYPE_WSTR`: `DBTYPEENUM` = 130;
public const val `DBUNIT_BYTE`: `DBCOSTUNITENUM` = 512;
public const val `DBUNIT_GIGA_BYTE`: `DBCOSTUNITENUM` = 4096;
public const val `DBUNIT_HOUR`: `DBCOSTUNITENUM` = 256;
public const val `DBUNIT_INVALID`: `DBCOSTUNITENUM` = 0;
public const val `DBUNIT_KILO_BYTE`: `DBCOSTUNITENUM` = 1024;
public const val `DBUNIT_MAXIMUM`: `DBCOSTUNITENUM` = 4;
public const val `DBUNIT_MEGA_BYTE`: `DBCOSTUNITENUM` = 2048;
public const val `DBUNIT_MICRO_SECOND`: `DBCOSTUNITENUM` = 16;
public const val `DBUNIT_MILLI_SECOND`: `DBCOSTUNITENUM` = 32;
public const val `DBUNIT_MINIMUM`: `DBCOSTUNITENUM` = 8;
public const val `DBUNIT_MINUTE`: `DBCOSTUNITENUM` = 128;
public const val `DBUNIT_NUM_LOCKS`: `DBCOSTUNITENUM` = 16384;
public const val `DBUNIT_NUM_MSGS`: `DBCOSTUNITENUM` = 8192;
public const val `DBUNIT_NUM_ROWS`: `DBCOSTUNITENUM` = 32768;
public const val `DBUNIT_OTHER`: `DBCOSTUNITENUM` = 65536;
public const val `DBUNIT_PERCENT`: `DBCOSTUNITENUM` = 2;
public const val `DBUNIT_SECOND`: `DBCOSTUNITENUM` = 64;
public const val `DBUNIT_WEIGHT`: `DBCOSTUNITENUM` = 1;
public typealias `DBUPDELRULEENUM` = Int;
public const val `DBUPDELRULE_CASCADE`: `DBUPDELRULEENUM` = 1;
public const val `DBUPDELRULE_NOACTION`: `DBUPDELRULEENUM` = 0;
public const val `DBUPDELRULE_SETDEFAULT`: `DBUPDELRULEENUM` = 3;
public const val `DBUPDELRULE_SETNULL`: `DBUPDELRULEENUM` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 8001 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBVARYBIN` (
    public var `len`: Short,
    public var `array`: UByteArray,
)
// UNSUPPORTED Rust 2305:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DBVARYBIN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 8001 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBVARYCHAR` (
    public var `len`: Short,
    public var `str`: ByteArray,
)
// UNSUPPORTED Rust 2316:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DBVARYCHAR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBVECTOR` (
    public var `size`: ULong,
    public var `ptr`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 2328:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for DBVECTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBVECTOR` (
    public var `size`: ULong,
    public var `ptr`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 2341:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for DBVECTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DBWATCHMODEENUM` = Int;
public const val `DBWATCHMODE_ALL`: `DBWATCHMODEENUM` = 1;
public const val `DBWATCHMODE_COUNT`: `DBWATCHMODEENUM` = 8;
public const val `DBWATCHMODE_EXTEND`: `DBWATCHMODEENUM` = 2;
public const val `DBWATCHMODE_MOVE`: `DBWATCHMODEENUM` = 4;
public typealias `DBWATCHNOTIFYENUM` = Int;
public const val `DBWATCHNOTIFY_QUERYDONE`: `DBWATCHNOTIFYENUM` = 2;
public const val `DBWATCHNOTIFY_QUERYREEXECUTED`: `DBWATCHNOTIFYENUM` = 3;
public const val `DBWATCHNOTIFY_ROWSCHANGED`: `DBWATCHNOTIFYENUM` = 1;
public const val `DB_ALL_EXCEPT_LIKE`: UInt = 3u;
public const val `DB_BINDFLAGS_COLLECTION`: Int = 16;
public const val `DB_BINDFLAGS_DELAYFETCHCOLUMNS`: Int = 1;
public const val `DB_BINDFLAGS_DELAYFETCHSTREAM`: Int = 2;
public const val `DB_BINDFLAGS_ISSTRUCTUREDDOCUMENT`: Int = 128;
public const val `DB_BINDFLAGS_OPENIFEXISTS`: Int = 32;
public const val `DB_BINDFLAGS_OUTPUT`: Int = 8;
public const val `DB_BINDFLAGS_OVERWRITE`: Int = 64;
public const val `DB_BINDFLAGS_RECURSIVE`: Int = 4;
public const val `DB_COLLATION_ASC`: UInt = 1u;
public const val `DB_COLLATION_DESC`: UInt = 2u;
public const val `DB_COUNTUNAVAILABLE`: Int = -1;
public const val `DB_E_ABORTLIMITREACHED`: Int = -2147217871;
public const val `DB_E_ALREADYINITIALIZED`: Int = -2147217838;
public const val `DB_E_ALTERRESTRICTED`: Int = -2147217763;
public const val `DB_E_ASYNCNOTSUPPORTED`: Int = -2147217771;
public const val `DB_E_BADACCESSORFLAGS`: Int = -2147217850;
public const val `DB_E_BADACCESSORHANDLE`: Int = -2147217920;
public const val `DB_E_BADACCESSORTYPE`: Int = -2147217845;
public const val `DB_E_BADBINDINFO`: Int = -2147217912;
public const val `DB_E_BADBOOKMARK`: Int = -2147217906;
public const val `DB_E_BADCHAPTER`: Int = -2147217914;
public const val `DB_E_BADCOLUMNID`: Int = -2147217903;
public const val `DB_E_BADCOMMANDFLAGS`: Int = -2147217780;
public const val `DB_E_BADCOMMANDID`: Int = -2147217802;
public const val `DB_E_BADCOMPAREOP`: Int = -2147217881;
public const val `DB_E_BADCONSTRAINTFORM`: Int = -2147217800;
public const val `DB_E_BADCONSTRAINTID`: Int = -2147217781;
public const val `DB_E_BADCONSTRAINTTYPE`: Int = -2147217801;
public const val `DB_E_BADCONVERTFLAG`: Int = -2147217828;
public const val `DB_E_BADCOPY`: Int = -2147217863;
public const val `DB_E_BADDEFERRABILITY`: Int = -2147217799;
public const val `DB_E_BADDYNAMICERRORID`: Int = -2147217830;
public const val `DB_E_BADHRESULT`: Int = -2147217832;
public const val `DB_E_BADID`: Int = -2147217860;
public const val `DB_E_BADINDEXID`: Int = -2147217806;
public const val `DB_E_BADINITSTRING`: Int = -2147217805;
public const val `DB_E_BADLOCKMODE`: Int = -2147217905;
public const val `DB_E_BADLOOKUPID`: Int = -2147217831;
public const val `DB_E_BADMATCHTYPE`: Int = -2147217792;
public const val `DB_E_BADORDINAL`: Int = -2147217835;
public const val `DB_E_BADPARAMETERNAME`: Int = -2147217827;
public const val `DB_E_BADPRECISION`: Int = -2147217862;
public const val `DB_E_BADPROPERTYVALUE`: Int = -2147217852;
public const val `DB_E_BADRATIO`: Int = -2147217902;
public const val `DB_E_BADRECORDNUM`: Int = -2147217854;
public const val `DB_E_BADREGIONHANDLE`: Int = -2147217878;
public const val `DB_E_BADROWHANDLE`: Int = -2147217916;
public const val `DB_E_BADSCALE`: Int = -2147217861;
public const val `DB_E_BADSOURCEHANDLE`: Int = -2147217840;
public const val `DB_E_BADSTARTPOSITION`: Int = -2147217890;
public const val `DB_E_BADSTATUSVALUE`: Int = -2147217880;
public const val `DB_E_BADSTORAGEFLAG`: Int = -2147217882;
public const val `DB_E_BADSTORAGEFLAGS`: Int = -2147217849;
public const val `DB_E_BADTABLEID`: Int = -2147217860;
public const val `DB_E_BADTYPE`: Int = -2147217859;
public const val `DB_E_BADTYPENAME`: Int = -2147217872;
public const val `DB_E_BADUPDATEDELETERULE`: Int = -2147217782;
public const val `DB_E_BADVALUES`: Int = -2147217901;
public const val `DB_E_BOGUS`: Int = -2147217665;
public const val `DB_E_BOOKMARKSKIPPED`: Int = -2147217853;
public const val `DB_E_BYREFACCESSORNOTSUPPORTED`: Int = -2147217848;
public const val `DB_E_CANCELED`: Int = -2147217842;
public const val `DB_E_CANNOTCONNECT`: Int = -2147217770;
public const val `DB_E_CANNOTFREE`: Int = -2147217894;
public const val `DB_E_CANNOTRESTART`: Int = -2147217896;
public const val `DB_E_CANTCANCEL`: Int = -2147217899;
public const val `DB_E_CANTCONVERTVALUE`: Int = -2147217913;
public const val `DB_E_CANTFETCHBACKWARDS`: Int = -2147217884;
public const val `DB_E_CANTFILTER`: Int = -2147217825;
public const val `DB_E_CANTORDER`: Int = -2147217824;
public const val `DB_E_CANTSCROLLBACKWARDS`: Int = -2147217879;
public const val `DB_E_CANTTRANSLATE`: Int = -2147217869;
public const val `DB_E_CHAPTERNOTRELEASED`: Int = -2147217841;
public const val `DB_E_COLUMNUNAVAILABLE`: Int = -2147217760;
public const val `DB_E_COMMANDNOTPERSISTED`: Int = -2147217817;
public const val `DB_E_CONCURRENCYVIOLATION`: Int = -2147217864;
public const val `DB_E_COSTLIMIT`: Int = -2147217907;
public const val `DB_E_DATAOVERFLOW`: Int = -2147217833;
public const val `DB_E_DELETEDROW`: Int = -2147217885;
public const val `DB_E_DIALECTNOTSUPPORTED`: Int = -2147217898;
public const val `DB_E_DROPRESTRICTED`: Int = -2147217776;
public const val `DB_E_DUPLICATECOLUMNID`: Int = -2147217858;
public const val `DB_E_DUPLICATECONSTRAINTID`: Int = -2147217767;
public const val `DB_E_DUPLICATEDATASOURCE`: Int = -2147217897;
public const val `DB_E_DUPLICATEID`: Int = -2147217816;
public const val `DB_E_DUPLICATEINDEXID`: Int = -2147217868;
public const val `DB_E_DUPLICATETABLEID`: Int = -2147217857;
public const val `DB_E_ERRORSINCOMMAND`: Int = -2147217900;
public const val `DB_E_ERRORSOCCURRED`: Int = -2147217887;
public const val `DB_E_GOALREJECTED`: Int = -2147217892;
public const val `DB_E_INDEXINUSE`: Int = -2147217866;
public const val `DB_E_INTEGRITYVIOLATION`: Int = -2147217873;
public const val `DB_E_INVALID`: Int = -2147217851;
public const val `DB_E_INVALIDTRANSITION`: Int = -2147217876;
public const val `DB_E_LIMITREJECTED`: Int = -2147217909;
public const val `DB_E_MAXPENDCHANGESEXCEEDED`: Int = -2147217836;
public const val `DB_E_MISMATCHEDPROVIDER`: Int = -2147217803;
public const val `DB_E_MULTIPLESTATEMENTS`: Int = -2147217874;
public const val `DB_E_MULTIPLESTORAGE`: Int = -2147217826;
public const val `DB_E_NEWLYINSERTED`: Int = -2147217893;
public const val `DB_E_NOAGGREGATION`: Int = -2147217886;
public const val `DB_E_NOCOLUMN`: Int = -2147217819;
public const val `DB_E_NOCOMMAND`: Int = -2147217908;
public const val `DB_E_NOCONSTRAINT`: Int = -2147217761;
public const val `DB_E_NOINDEX`: Int = -2147217867;
public const val `DB_E_NOLOCALE`: Int = -2147217855;
public const val `DB_E_NONCONTIGUOUSRANGE`: Int = -2147217877;
public const val `DB_E_NOPROVIDERSREGISTERED`: Int = -2147217804;
public const val `DB_E_NOQUERY`: Int = -2147217889;
public const val `DB_E_NOSOURCEOBJECT`: Int = -2147217775;
public const val `DB_E_NOSTATISTIC`: Int = -2147217764;
public const val `DB_E_NOTABLE`: Int = -2147217865;
public const val `DB_E_NOTAREFERENCECOLUMN`: Int = -2147217910;
public const val `DB_E_NOTASUBREGION`: Int = -2147217875;
public const val `DB_E_NOTCOLLECTION`: Int = -2147217773;
public const val `DB_E_NOTFOUND`: Int = -2147217895;
public const val `DB_E_NOTPREPARED`: Int = -2147217846;
public const val `DB_E_NOTREENTRANT`: Int = -2147217888;
public const val `DB_E_NOTSUPPORTED`: Int = -2147217837;
public const val `DB_E_NULLACCESSORNOTSUPPORTED`: Int = -2147217847;
public const val `DB_E_OBJECTCREATIONLIMITREACHED`: Int = -2147217815;
public const val `DB_E_OBJECTMISMATCH`: Int = -2147217779;
public const val `DB_E_OBJECTOPEN`: Int = -2147217915;
public const val `DB_E_OUTOFSPACE`: Int = -2147217766;
public const val `DB_E_PARAMNOTOPTIONAL`: Int = -2147217904;
public const val `DB_E_PARAMUNAVAILABLE`: Int = -2147217839;
public const val `DB_E_PENDINGCHANGES`: Int = -2147217834;
public const val `DB_E_PENDINGINSERT`: Int = -2147217829;
public const val `DB_E_READONLY`: Int = -2147217772;
public const val `DB_E_READONLYACCESSOR`: Int = -2147217918;
public const val `DB_E_RESOURCEEXISTS`: Int = -2147217768;
public const val `DB_E_RESOURCELOCKED`: Int = -2147217774;
public const val `DB_E_RESOURCENOTSUPPORTED`: Int = -2147217762;
public const val `DB_E_RESOURCEOUTOFSCOPE`: Int = -2147217778;
public const val `DB_E_ROWLIMITEXCEEDED`: Int = -2147217919;
public const val `DB_E_ROWSETINCOMMAND`: Int = -2147217870;
public const val `DB_E_ROWSNOTRELEASED`: Int = -2147217883;
public const val `DB_E_SCHEMAVIOLATION`: Int = -2147217917;
public const val `DB_E_TABLEINUSE`: Int = -2147217856;
public const val `DB_E_TIMEOUT`: Int = -2147217769;
public const val `DB_E_UNSUPPORTEDCONVERSION`: Int = -2147217891;
public const val `DB_E_WRITEONLYACCESSOR`: Int = -2147217844;
public const val `DB_IMP_LEVEL_ANONYMOUS`: UInt = 0u;
public const val `DB_IMP_LEVEL_DELEGATE`: UInt = 3u;
public const val `DB_IMP_LEVEL_IDENTIFY`: UInt = 1u;
public const val `DB_IMP_LEVEL_IMPERSONATE`: UInt = 2u;
public const val `DB_IN`: UInt = 1u;
public const val `DB_INVALID_HACCESSOR`: UInt = 0u;
public const val `DB_INVALID_HCHAPTER`: UInt = 0u;
public const val `DB_LIKE_ONLY`: UInt = 2u;
public const val `DB_LOCAL_EXCLUSIVE`: UInt = 3u;
public const val `DB_LOCAL_SHARED`: UInt = 2u;
public const val `DB_MODE_READ`: UInt = 1u;
public const val `DB_MODE_READWRITE`: UInt = 3u;
public const val `DB_MODE_SHARE_DENY_NONE`: UInt = 16u;
public const val `DB_MODE_SHARE_DENY_READ`: UInt = 4u;
public const val `DB_MODE_SHARE_DENY_WRITE`: UInt = 8u;
public const val `DB_MODE_SHARE_EXCLUSIVE`: UInt = 12u;
public const val `DB_MODE_WRITE`: UInt = 2u;
// UNSUPPORTED Rust 2516:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DB_NULLGUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_000000000000);

public const val `DB_NULL_HACCESSOR`: UInt = 0u;
public const val `DB_NULL_HCHAPTER`: UInt = 0u;
public const val `DB_NULL_HROW`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DB_NUMERIC` (
    public var `precision`: UByte,
    public var `scale`: UByte,
    public var `sign`: UByte,
    public var `val`: UByteArray,
)
// UNSUPPORTED Rust 2528:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DB_NUMERIC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DB_OUT`: UInt = 2u;
public const val `DB_PROT_LEVEL_CALL`: UInt = 2u;
public const val `DB_PROT_LEVEL_CONNECT`: UInt = 1u;
public const val `DB_PROT_LEVEL_NONE`: UInt = 0u;
public const val `DB_PROT_LEVEL_PKT`: UInt = 3u;
public const val `DB_PROT_LEVEL_PKT_INTEGRITY`: UInt = 4u;
public const val `DB_PROT_LEVEL_PKT_PRIVACY`: UInt = 5u;
public const val `DB_PT_FUNCTION`: UInt = 3u;
public const val `DB_PT_PROCEDURE`: UInt = 2u;
public const val `DB_PT_UNKNOWN`: UInt = 1u;
public const val `DB_REMOTE`: UInt = 1u;
public const val `DB_SEARCHABLE`: UInt = 4u;
public const val `DB_SEC_E_AUTH_FAILED`: Int = -2147217843;
public const val `DB_SEC_E_PERMISSIONDENIED`: Int = -2147217911;
public const val `DB_SEC_E_SAFEMODE_DENIED`: Int = -2147217765;
public const val `DB_S_ASYNCHRONOUS`: Int = 265936;
public const val `DB_S_BADROWHANDLE`: Int = 265939;
public const val `DB_S_BOOKMARKSKIPPED`: Int = 265923;
public const val `DB_S_BUFFERFULL`: Int = 265928;
public const val `DB_S_CANTRELEASE`: Int = 265930;
public const val `DB_S_COLUMNSCHANGED`: Int = 265937;
public const val `DB_S_COLUMNTYPEMISMATCH`: Int = 265921;
public const val `DB_S_COMMANDREEXECUTED`: Int = 265927;
public const val `DB_S_DELETEDROW`: Int = 265940;
public const val `DB_S_DIALECTIGNORED`: Int = 265933;
public const val `DB_S_ENDOFROWSET`: Int = 265926;
public const val `DB_S_ERRORSOCCURRED`: Int = 265946;
public const val `DB_S_ERRORSRETURNED`: Int = 265938;
public const val `DB_S_GOALCHANGED`: Int = 265931;
public const val `DB_S_LOCKUPGRADED`: Int = 265944;
public const val `DB_S_MULTIPLECHANGES`: Int = 265948;
public const val `DB_S_NONEXTROWSET`: Int = 265925;
public const val `DB_S_NORESULT`: Int = 265929;
public const val `DB_S_NOROWSPECIFICCOLUMNS`: Int = 265949;
public const val `DB_S_NOTSINGLETON`: Int = 265943;
public const val `DB_S_PARAMUNAVAILABLE`: Int = 265947;
public const val `DB_S_PROPERTIESCHANGED`: Int = 265945;
public const val `DB_S_ROWLIMITEXCEEDED`: Int = 265920;
public const val `DB_S_STOPLIMITREACHED`: Int = 265942;
public const val `DB_S_TOOMANYCHANGES`: Int = 265941;
public const val `DB_S_TYPEINFOOVERRIDDEN`: Int = 265922;
public const val `DB_S_UNWANTEDOPERATION`: Int = 265932;
public const val `DB_S_UNWANTEDPHASE`: Int = 265934;
public const val `DB_S_UNWANTEDREASON`: Int = 265935;
public const val `DB_UNSEARCHABLE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DB_VARNUMERIC` (
    public var `precision`: UByte,
    public var `scale`: Byte,
    public var `sign`: UByte,
    public var `val`: UByteArray,
)
// UNSUPPORTED Rust 2586:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DB_VARNUMERIC {
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
public class `DCINFO` (
    public var `eInfoType`: UInt,
    public var `vData`: `super`.`Variant`.`VARIANT`,
)
// UNSUPPORTED Rust 2598:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// impl Default for DCINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DCINFOTYPEENUM` = Int;
public const val `DCINFOTYPE_VERSION`: `DCINFOTYPEENUM` = 1;
public typealias `DELIVERY_AGENT_FLAGS` = Int;
public const val `DELIVERY_AGENT_FLAG_NO_BROADCAST`: `DELIVERY_AGENT_FLAGS` = 4;
public const val `DELIVERY_AGENT_FLAG_NO_RESTRICTIONS`: `DELIVERY_AGENT_FLAGS` = 8;
public const val `DELIVERY_AGENT_FLAG_SILENT_DIAL`: `DELIVERY_AGENT_FLAGS` = 16;
public const val `DISPID_QUERY_ALL`: UInt = 6u;
public const val `DISPID_QUERY_HITCOUNT`: UInt = 4u;
public const val `DISPID_QUERY_LASTSEENTIME`: UInt = 10u;
public const val `DISPID_QUERY_METADATA_PROPDISPID`: UInt = 6u;
public const val `DISPID_QUERY_METADATA_PROPGUID`: UInt = 5u;
public const val `DISPID_QUERY_METADATA_PROPMODIFIABLE`: UInt = 9u;
public const val `DISPID_QUERY_METADATA_PROPNAME`: UInt = 7u;
public const val `DISPID_QUERY_METADATA_STORELEVEL`: UInt = 8u;
public const val `DISPID_QUERY_METADATA_VROOTAUTOMATIC`: UInt = 3u;
public const val `DISPID_QUERY_METADATA_VROOTMANUAL`: UInt = 4u;
public const val `DISPID_QUERY_METADATA_VROOTUSED`: UInt = 2u;
public const val `DISPID_QUERY_RANK`: UInt = 3u;
public const val `DISPID_QUERY_RANKVECTOR`: UInt = 2u;
public const val `DISPID_QUERY_REVNAME`: UInt = 8u;
public const val `DISPID_QUERY_UNFILTERED`: UInt = 7u;
public const val `DISPID_QUERY_VIRTUALPATH`: UInt = 9u;
public const val `DISPID_QUERY_WORKID`: UInt = 5u;
public const val `DS_E_ALREADYDISABLED`: Int = -2147220447;
public const val `DS_E_ALREADYENABLED`: Int = -2147220454;
public const val `DS_E_BADREQUEST`: Int = -2147220475;
public const val `DS_E_BADRESULT`: Int = -2147220445;
public const val `DS_E_BADSEQUENCE`: Int = -2147220473;
public const val `DS_E_BUFFERTOOSMALL`: Int = -2147220449;
public const val `DS_E_CANNOTREMOVECONCURRENT`: Int = -2147220443;
public const val `DS_E_CANNOTWRITEREGISTRY`: Int = -2147220444;
public const val `DS_E_CONFIGBAD`: Int = -2147220470;
public const val `DS_E_CONFIGNOTRIGHTTYPE`: Int = -2147220456;
public const val `DS_E_DATANOTPRESENT`: Int = -2147220464;
public const val `DS_E_DATASOURCENOTAVAILABLE`: Int = -2147220478;
public const val `DS_E_DATASOURCENOTDISABLED`: Int = -2147220459;
public const val `DS_E_DUPLICATEID`: Int = -2147220462;
public const val `DS_E_INDEXDIRECTORY`: Int = -2147220452;
public const val `DS_E_INVALIDCATALOGNAME`: Int = -2147220457;
public const val `DS_E_INVALIDDATASOURCE`: Int = -2147220479;
public const val `DS_E_INVALIDTAGDB`: Int = -2147220458;
public const val `DS_E_MESSAGETOOLONG`: Int = -2147220472;
public const val `DS_E_MISSINGCATALOG`: Int = -2147220440;
public const val `DS_E_NOMOREDATA`: Int = -2147220480;
public const val `DS_E_PARAMOUTOFRANGE`: Int = -2147220448;
public const val `DS_E_PROPVERSIONMISMATCH`: Int = -2147220441;
public const val `DS_E_PROTOCOLVERSION`: Int = -2147220455;
public const val `DS_E_QUERYCANCELED`: Int = -2147220477;
public const val `DS_E_QUERYHUNG`: Int = -2147220446;
public const val `DS_E_REGISTRY`: Int = -2147220460;
public const val `DS_E_SEARCHCATNAMECOLLISION`: Int = -2147220442;
public const val `DS_E_SERVERCAPACITY`: Int = -2147220474;
public const val `DS_E_SERVERERROR`: Int = -2147220471;
public const val `DS_E_SETSTATUSINPROGRESS`: Int = -2147220463;
public const val `DS_E_TOOMANYDATASOURCES`: Int = -2147220461;
public const val `DS_E_UNKNOWNPARAM`: Int = -2147220450;
public const val `DS_E_UNKNOWNREQUEST`: Int = -2147220476;
public const val `DS_E_VALUETOOLARGE`: Int = -2147220451;
// UNSUPPORTED Rust 2662:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DataLinks: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2206cdb2_19c1_11d1_89e0_00c04fd7a829);

public typealias `EBindInfoOptions` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ERRORINFO` (
    public var `hrError`: `windows_sys`.`core`.`HRESULT`,
    public var `dwMinor`: UInt,
    public var `clsid`: `windows_sys`.`core`.`GUID`,
    public var `iid`: `windows_sys`.`core`.`GUID`,
    public var `dispid`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ERRORINFO` (
    public var `hrError`: `windows_sys`.`core`.`HRESULT`,
    public var `dwMinor`: UInt,
    public var `clsid`: `windows_sys`.`core`.`GUID`,
    public var `iid`: `windows_sys`.`core`.`GUID`,
    public var `dispid`: Int,
)
public const val `ERROR_FTE`: UInt = 13824u;
public const val `ERROR_FTE_CB`: UInt = 51968u;
public const val `ERROR_FTE_FD`: UInt = 64768u;
public const val `ERROR_SOURCE_CMDLINE`: UInt = 5376u;
public const val `ERROR_SOURCE_COLLATOR`: UInt = 1280u;
public const val `ERROR_SOURCE_CONNMGR`: UInt = 1536u;
public const val `ERROR_SOURCE_CONTENT_SOURCE`: UInt = 13312u;
public const val `ERROR_SOURCE_DATASOURCE`: UInt = 1024u;
public const val `ERROR_SOURCE_DAV`: UInt = 8960u;
public const val `ERROR_SOURCE_EXSTOREPH`: UInt = 9984u;
public const val `ERROR_SOURCE_FLTRDMN`: UInt = 9216u;
public const val `ERROR_SOURCE_GATHERER`: UInt = 3328u;
public const val `ERROR_SOURCE_INDEXER`: UInt = 4352u;
public const val `ERROR_SOURCE_MSS`: UInt = 8448u;
public const val `ERROR_SOURCE_NETWORKING`: UInt = 768u;
public const val `ERROR_SOURCE_NLADMIN`: UInt = 6400u;
public const val `ERROR_SOURCE_NOTESPH`: UInt = 9728u;
public const val `ERROR_SOURCE_OLEDB_BINDER`: UInt = 9472u;
public const val `ERROR_SOURCE_PEOPLE_IMPORT`: UInt = 16384u;
public const val `ERROR_SOURCE_PROTHNDLR`: UInt = 4608u;
public const val `ERROR_SOURCE_QUERY`: UInt = 1792u;
public const val `ERROR_SOURCE_REMOTE_EXSTOREPH`: UInt = 13568u;
public const val `ERROR_SOURCE_SCHEMA`: UInt = 3072u;
public const val `ERROR_SOURCE_SCRIPTPI`: UInt = 8192u;
public const val `ERROR_SOURCE_SECURITY`: UInt = 5120u;
public const val `ERROR_SOURCE_SETUP`: UInt = 4864u;
public const val `ERROR_SOURCE_SRCH_SCHEMA_CACHE`: UInt = 13056u;
public const val `ERROR_SOURCE_XML`: UInt = 8704u;
public const val `EVENT_AUDIENCECOMPUTATION_CANNOTSTART`: Int = -1073738223;
public const val `EVENT_AUTOCAT_CANT_CREATE_FILE_SHARE`: Int = -1073738726;
public const val `EVENT_AUTOCAT_PERFMON`: Int = -1073738753;
public const val `EVENT_CONFIG_ERROR`: Int = -1073738821;
public const val `EVENT_CONFIG_SYNTAX`: Int = -2147482604;
public const val `EVENT_CRAWL_SCHEDULED`: Int = 1073744884;
public const val `EVENT_DETAILED_FILTERPOOL_ADD_FAILED`: Int = -1073738719;
public const val `EVENT_DSS_NOT_ENABLED`: Int = -2147476572;
public const val `EVENT_ENUMERATE_SESSIONS_FAILED`: Int = -1073738720;
public const val `EVENT_EXCEPTION`: Int = -1073740815;
public const val `EVENT_FAILED_CREATE_GATHERER_LOG`: Int = -2147480587;
public const val `EVENT_FAILED_INITIALIZE_CRAWL`: Int = -1073738765;
public const val `EVENT_FILTERPOOL_ADD_FAILED`: Int = -1073738722;
public const val `EVENT_FILTERPOOL_DELETE_FAILED`: Int = -1073738721;
public const val `EVENT_FILTER_HOST_FORCE_TERMINATE`: Int = -2147473624;
public const val `EVENT_FILTER_HOST_NOT_INITIALIZED`: Int = -1073738724;
public const val `EVENT_FILTER_HOST_NOT_TERMINATED`: Int = -1073738723;
public const val `EVENT_GATHERER_DATASOURCE`: Int = -1073738727;
public const val `EVENT_GATHERER_PERFMON`: Int = -1073738817;
public const val `EVENT_GATHERSVC_PERFMON`: Int = -1073738818;
public const val `EVENT_GATHER_ADVISE_FAILED`: Int = -1073738798;
public const val `EVENT_GATHER_APP_INIT_FAILED`: Int = -1073738766;
public const val `EVENT_GATHER_AUTODESCENCODE_INVALID`: Int = -2147480592;
public const val `EVENT_GATHER_AUTODESCLEN_ADJUSTED`: Int = -2147480603;
public const val `EVENT_GATHER_BACKUPAPP_COMPLETE`: Int = 3077;
public const val `EVENT_GATHER_BACKUPAPP_ERROR`: Int = -1073738748;
public const val `EVENT_GATHER_CANT_CREATE_DOCID`: Int = -1073738793;
public const val `EVENT_GATHER_CANT_DELETE_DOCID`: Int = -1073738792;
public const val `EVENT_GATHER_CHECKPOINT_CORRUPT`: Int = -1073738732;
public const val `EVENT_GATHER_CHECKPOINT_FAILED`: Int = -1073738736;
public const val `EVENT_GATHER_CHECKPOINT_FILE_MISSING`: Int = -1073738731;
public const val `EVENT_GATHER_CRAWL_IN_PROGRESS`: Int = -2147480609;
public const val `EVENT_GATHER_CRAWL_NOT_STARTED`: Int = -2147480625;
public const val `EVENT_GATHER_CRAWL_SEED_ERROR`: Int = -2147480624;
public const val `EVENT_GATHER_CRAWL_SEED_FAILED`: Int = -2147480612;
public const val `EVENT_GATHER_CRAWL_SEED_FAILED_INIT`: Int = -2147480611;
public const val `EVENT_GATHER_CRITICAL_ERROR`: Int = -1073738799;
public const val `EVENT_GATHER_DAEMON_TERMINATED`: Int = -2147480570;
public const val `EVENT_GATHER_DELETING_HISTORY_ITEMS`: Int = -1073738774;
public const val `EVENT_GATHER_DIRTY_STARTUP`: Int = -2147480576;
public const val `EVENT_GATHER_DISK_FULL`: Int = -2147480594;
public const val `EVENT_GATHER_END_ADAPTIVE`: Int = 1073744891;
public const val `EVENT_GATHER_END_CRAWL`: Int = 1073744842;
public const val `EVENT_GATHER_END_INCREMENTAL`: Int = 1073744871;
public const val `EVENT_GATHER_EXCEPTION`: Int = -1073738810;
public const val `EVENT_GATHER_FLUSH_FAILED`: Int = -1073738737;
public const val `EVENT_GATHER_FROM_NOT_SET`: Int = -1073738776;
public const val `EVENT_GATHER_HISTORY_CORRUPTION_DETECTED`: Int = -2147480575;
public const val `EVENT_GATHER_INPLACE_INDEX_REBUILD`: Int = 1073745427;
public const val `EVENT_GATHER_INTERNAL`: Int = -1073738804;
public const val `EVENT_GATHER_INVALID_NETWORK_ACCESS_ACCOUNT`: Int = -1073738739;
public const val `EVENT_GATHER_LOCK_FAILED`: Int = -1073738784;
public const val `EVENT_GATHER_NO_CRAWL_SEEDS`: Int = -2147480602;
public const val `EVENT_GATHER_NO_SCHEMA`: Int = -2147480593;
public const val `EVENT_GATHER_OBJ_INIT_FAILED`: Int = -1073738796;
public const val `EVENT_GATHER_PLUGINMGR_INIT_FAILED`: Int = -1073738767;
public const val `EVENT_GATHER_PLUGIN_INIT_FAILED`: Int = -1073738795;
public const val `EVENT_GATHER_PROTOCOLHANDLER_INIT_FAILED`: Int = -1073738740;
public const val `EVENT_GATHER_PROTOCOLHANDLER_LOAD_FAILED`: Int = -1073738741;
public const val `EVENT_GATHER_READ_CHECKPOINT_FAILED`: Int = -1073738733;
public const val `EVENT_GATHER_RECOVERY_FAILURE`: Int = -1073738222;
public const val `EVENT_GATHER_REG_MISSING`: Int = -2147480610;
public const val `EVENT_GATHER_RESET_START`: Int = 1073744865;
public const val `EVENT_GATHER_RESTOREAPP_COMPLETE`: Int = 3075;
public const val `EVENT_GATHER_RESTOREAPP_ERROR`: Int = -1073738750;
public const val `EVENT_GATHER_RESTORE_CHECKPOINT_FAILED`: Int = -1073738734;
public const val `EVENT_GATHER_RESTORE_COMPLETE`: Int = 3069;
public const val `EVENT_GATHER_RESTORE_ERROR`: Int = -1073738754;
public const val `EVENT_GATHER_RESUME`: Int = 1073744868;
public const val `EVENT_GATHER_SAVE_FAILED`: Int = -1073738735;
public const val `EVENT_GATHER_SERVICE_INIT`: Int = -1073738794;
public const val `EVENT_GATHER_START_CRAWL`: Int = 1073744843;
public const val `EVENT_GATHER_START_CRAWL_IF_RESET`: Int = -2147480595;
public const val `EVENT_GATHER_START_PAUSE`: Int = -2147480606;
public const val `EVENT_GATHER_STOP_START`: Int = 1073744876;
public const val `EVENT_GATHER_SYSTEM_LCID_CHANGED`: Int = -2147480562;
public const val `EVENT_GATHER_THROTTLE`: Int = 1073744867;
public const val `EVENT_GATHER_TRANSACTION_FAIL`: Int = -1073738797;
public const val `EVENT_HASHMAP_INSERT`: Int = -1073738816;
public const val `EVENT_HASHMAP_UPDATE`: Int = -1073738811;
public const val `EVENT_INDEXER_ADD_DSS_DISCONNECT`: Int = -2147476585;
public const val `EVENT_INDEXER_ADD_DSS_FAILED`: Int = -2147476627;
public const val `EVENT_INDEXER_ADD_DSS_SUCCEEDED`: Int = 7019;
public const val `EVENT_INDEXER_BUILD_ENDED`: Int = 1073748873;
public const val `EVENT_INDEXER_BUILD_FAILED`: Int = -1073734797;
public const val `EVENT_INDEXER_BUILD_START`: Int = 1073748872;
public const val `EVENT_INDEXER_CI_LOAD_ERROR`: Int = -1073734785;
public const val `EVENT_INDEXER_DSS_ALREADY_ADDED`: Int = 1073748870;
public const val `EVENT_INDEXER_DSS_CONTACT_FAILED`: Int = -1073734800;
public const val `EVENT_INDEXER_DSS_UNABLE_TO_REMOVE`: Int = -1073734755;
public const val `EVENT_INDEXER_FAIL_TO_CREATE_PER_USER_CATALOG`: Int = -1073731797;
public const val `EVENT_INDEXER_FAIL_TO_SET_MAX_JETINSTANCE`: Int = -1073731798;
public const val `EVENT_INDEXER_FAIL_TO_UNLOAD_PER_USER_CATALOG`: Int = -1073731796;
public const val `EVENT_INDEXER_INIT_ERROR`: Int = -1073734814;
public const val `EVENT_INDEXER_INVALID_DIRECTORY`: Int = -1073734813;
public const val `EVENT_INDEXER_LOAD_FAIL`: Int = -1073734781;
public const val `EVENT_INDEXER_MISSING_APP_DIRECTORY`: Int = -1073734758;
public const val `EVENT_INDEXER_NEW_PROJECT`: Int = -1073734754;
public const val `EVENT_INDEXER_NO_SEARCH_SERVERS`: Int = -2147476630;
public const val `EVENT_INDEXER_OUT_OF_DATABASE_INSTANCE`: Int = -1073731799;
public const val `EVENT_INDEXER_PAUSED_FOR_DISKFULL`: Int = -1073734811;
public const val `EVENT_INDEXER_PERFMON`: Int = -1073734760;
public const val `EVENT_INDEXER_PROPSTORE_INIT_FAILED`: Int = -1073734787;
public const val `EVENT_INDEXER_PROP_ABORTED`: Int = 1073748899;
public const val `EVENT_INDEXER_PROP_COMMITTED`: Int = 1073748898;
public const val `EVENT_INDEXER_PROP_COMMIT_FAILED`: Int = -1073734747;
public const val `EVENT_INDEXER_PROP_ERROR`: Int = -1073734812;
public const val `EVENT_INDEXER_PROP_STARTED`: Int = 1073748841;
public const val `EVENT_INDEXER_PROP_STATE_CORRUPT`: Int = -1073734780;
public const val `EVENT_INDEXER_PROP_STOPPED`: Int = -2147476633;
public const val `EVENT_INDEXER_PROP_SUCCEEDED`: Int = 7016;
public const val `EVENT_INDEXER_REG_ERROR`: Int = -1073734756;
public const val `EVENT_INDEXER_REG_MISSING`: Int = -1073734796;
public const val `EVENT_INDEXER_REMOVED_PROJECT`: Int = -1073734753;
public const val `EVENT_INDEXER_REMOVE_DSS_FAILED`: Int = -1073734801;
public const val `EVENT_INDEXER_REMOVE_DSS_SUCCEEDED`: Int = 7020;
public const val `EVENT_INDEXER_RESET_FOR_CORRUPTION`: Int = -1073734784;
public const val `EVENT_INDEXER_SCHEMA_COPY_ERROR`: Int = -1073734823;
public const val `EVENT_INDEXER_SHUTDOWN`: Int = 1073748866;
public const val `EVENT_INDEXER_STARTED`: Int = 1073748824;
public const val `EVENT_INDEXER_VERIFY_PROP_ACCOUNT`: Int = -1073734768;
public const val `EVENT_LEARN_COMPILE_FAILED`: Int = -2147480583;
public const val `EVENT_LEARN_CREATE_DB_FAILED`: Int = -2147480584;
public const val `EVENT_LEARN_PROPAGATION_COPY_FAILED`: Int = -2147480585;
public const val `EVENT_LEARN_PROPAGATION_FAILED`: Int = -2147480582;
public const val `EVENT_LOCAL_GROUPS_CACHE_FLUSHED`: Int = 1073744920;
public const val `EVENT_LOCAL_GROUP_NOT_EXPANDED`: Int = 1073744919;
public const val `EVENT_NOTIFICATION_FAILURE`: Int = -1073738745;
public const val `EVENT_NOTIFICATION_FAILURE_SCOPE_EXCEEDED_LOGGING`: Int = -2147480568;
public const val `EVENT_NOTIFICATION_RESTORED`: Int = 1073744905;
public const val `EVENT_NOTIFICATION_RESTORED_SCOPE_EXCEEDED_LOGGING`: Int = -2147480566;
public const val `EVENT_NOTIFICATION_THREAD_EXIT_FAILED`: Int = -1073738725;
public const val `EVENT_OUTOFMEMORY`: Int = -1073740817;
public const val `EVENT_PERF_COUNTERS_ALREADY_EXISTS`: Int = -2147473626;
public const val `EVENT_PERF_COUNTERS_NOT_LOADED`: Int = -2147473628;
public const val `EVENT_PERF_COUNTERS_REGISTRY_TROUBLE`: Int = -2147473627;
public const val `EVENT_PROTOCOL_HOST_FORCE_TERMINATE`: Int = -2147473625;
public const val `EVENT_REG_VERSION`: Int = -1073738790;
public const val `EVENT_SSSEARCH_CREATE_PATH_RULES_FAILED`: Int = -2147482634;
public const val `EVENT_SSSEARCH_CSM_SAVE_FAILED`: Int = -1073740805;
public const val `EVENT_SSSEARCH_DATAFILES_MOVE_FAILED`: Int = -1073740808;
public const val `EVENT_SSSEARCH_DATAFILES_MOVE_ROLLBACK_ERRORS`: Int = -2147482630;
public const val `EVENT_SSSEARCH_DATAFILES_MOVE_SUCCEEDED`: Int = 1073742841;
public const val `EVENT_SSSEARCH_DROPPED_EVENTS`: Int = -2147482633;
public const val `EVENT_SSSEARCH_SETUP_CLEANUP_FAILED`: Int = -1073740813;
public const val `EVENT_SSSEARCH_SETUP_CLEANUP_STARTED`: Int = -2147482640;
public const val `EVENT_SSSEARCH_SETUP_CLEANUP_SUCCEEDED`: Int = 1073742834;
public const val `EVENT_SSSEARCH_SETUP_FAILED`: Int = -1073740818;
public const val `EVENT_SSSEARCH_SETUP_SUCCEEDED`: Int = 1073742829;
public const val `EVENT_SSSEARCH_STARTED`: Int = 1073742827;
public const val `EVENT_SSSEARCH_STARTING_SETUP`: Int = 1073742828;
public const val `EVENT_SSSEARCH_STOPPED`: Int = 1073742837;
public const val `EVENT_STS_INIT_SECURITY_FAILED`: Int = -2147480554;
public const val `EVENT_SYSTEM_EXCEPTION`: Int = -2147482595;
public const val `EVENT_TRANSACTION_READ`: Int = -1073738809;
public const val `EVENT_TRANSLOG_APPEND`: Int = -1073738814;
public const val `EVENT_TRANSLOG_CREATE`: Int = -1073738791;
public const val `EVENT_TRANSLOG_CREATE_TRX`: Int = -1073738815;
public const val `EVENT_TRANSLOG_UPDATE`: Int = -1073738813;
public const val `EVENT_UNPRIVILEGED_SERVICE_ACCOUNT`: Int = -2147482596;
public const val `EVENT_USING_DIFFERENT_WORD_BREAKER`: Int = -2147480580;
public const val `EVENT_WARNING_CANNOT_UPGRADE_NOISE_FILE`: Int = -2147473634;
public const val `EVENT_WARNING_CANNOT_UPGRADE_NOISE_FILES`: Int = -2147473635;
public const val `EVENT_WBREAKER_NOT_LOADED`: Int = -2147480586;
public const val `EVENT_WIN32_ERROR`: Int = -2147473633;
public const val `EXCI_E_ACCESS_DENIED`: Int = -2147216990;
public const val `EXCI_E_BADCONFIG_OR_ACCESSDENIED`: Int = -2147216988;
public const val `EXCI_E_INVALID_ACCOUNT_INFO`: Int = -2147216984;
public const val `EXCI_E_INVALID_EXCHANGE_SERVER`: Int = -2147216989;
public const val `EXCI_E_INVALID_SERVER_CONFIG`: Int = -2147216991;
public const val `EXCI_E_NOT_ADMIN_OR_WRONG_SITE`: Int = -2147216986;
public const val `EXCI_E_NO_CONFIG`: Int = -2147216992;
public const val `EXCI_E_NO_MAPI`: Int = -2147216985;
public const val `EXCI_E_WRONG_SERVER_OR_ACCT`: Int = -2147216987;
public const val `EXSTOREPH_E_UNEXPECTED`: Int = -2147211519;
public const val `EX_ANY`: UInt = 0u;
public const val `EX_CMDFATAL`: UInt = 20u;
public const val `EX_CONTROL`: UInt = 25u;
public const val `EX_DBCORRUPT`: UInt = 23u;
public const val `EX_DBFATAL`: UInt = 21u;
public const val `EX_DEADLOCK`: UInt = 13u;
public const val `EX_HARDWARE`: UInt = 24u;
public const val `EX_INFO`: UInt = 10u;
public const val `EX_INTOK`: UInt = 18u;
public const val `EX_LIMIT`: UInt = 19u;
public const val `EX_MAXISEVERITY`: UInt = 10u;
public const val `EX_MISSING`: UInt = 11u;
public const val `EX_PERMIT`: UInt = 14u;
public const val `EX_RESOURCE`: UInt = 17u;
public const val `EX_SYNTAX`: UInt = 15u;
public const val `EX_TABCORRUPT`: UInt = 22u;
public const val `EX_TYPE`: UInt = 12u;
public const val `EX_USER`: UInt = 16u;
public const val `FAIL`: UInt = 0u;
public const val `FF_INDEXCOMPLEXURLS`: `FOLLOW_FLAGS` = 1;
public const val `FF_SUPPRESSINDEXING`: `FOLLOW_FLAGS` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FILTERED_DATA_SOURCES` (
    public var `pwcsExtension`: `windows_sys`.`core`.`PCWSTR`,
    public var `pwcsMime`: `windows_sys`.`core`.`PCWSTR`,
    public var `pClsid`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `pwcsOverride`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 2916:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILTERED_DATA_SOURCES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FLTRDMN_E_CANNOT_DECRYPT_PASSWORD`: Int = -2147212282;
public const val `FLTRDMN_E_ENCRYPTED_DOCUMENT`: Int = -2147212283;
public const val `FLTRDMN_E_FILTER_INIT_FAILED`: Int = -2147212284;
public const val `FLTRDMN_E_QI_FILTER_FAILED`: Int = -2147212286;
public const val `FLTRDMN_E_UNEXPECTED`: Int = -2147212287;
public typealias `FOLLOW_FLAGS` = Int;
public const val `FTE_E_ADMIN_BLOB_CORRUPT`: Int = -2147207676;
public const val `FTE_E_AFFINITY_MASK`: Int = -2147207651;
public const val `FTE_E_ALREADY_INITIALIZED`: Int = -2147207604;
public const val `FTE_E_ANOTHER_STATUS_CHANGE_IS_ALREADY_ACTIVE`: Int = -2147207635;
public const val `FTE_E_BATCH_ABORTED`: Int = -2147207636;
public const val `FTE_E_CATALOG_ALREADY_EXISTS`: Int = -2147207656;
public const val `FTE_E_CATALOG_DOES_NOT_EXIST`: Int = -2147207639;
public const val `FTE_E_CB_CBID_OUT_OF_BOUND`: Int = -2147169535;
public const val `FTE_E_CB_NOT_ENOUGH_AVAIL_PHY_MEM`: Int = -2147169534;
public const val `FTE_E_CB_NOT_ENOUGH_OCC_BUFFER`: Int = -2147169533;
public const val `FTE_E_CB_OUT_OF_MEMORY`: Int = -2147169536;
public const val `FTE_E_COM_SIGNATURE_VALIDATION`: Int = -2147207652;
public const val `FTE_E_CORRUPT_GATHERER_HASH_MAP`: Int = -2147207619;
public const val `FTE_E_CORRUPT_PROPERTY_STORE`: Int = -2147207622;
public const val `FTE_E_CORRUPT_WORDLIST`: Int = -2147169532;
public const val `FTE_E_DATATYPE_MISALIGNMENT`: Int = -2147207605;
public const val `FTE_E_DEPENDENT_TRAN_FAILED_TO_PERSIST`: Int = -2147207641;
public const val `FTE_E_DOC_TOO_HUGE`: Int = -2147207606;
public const val `FTE_E_DUPLICATE_OBJECT`: Int = -2147207644;
public const val `FTE_E_ERROR_WRITING_REGISTRY`: Int = -2147207674;
public const val `FTE_E_EXCEEDED_MAX_PLUGINS`: Int = -2147207647;
public const val `FTE_E_FAILED_TO_CREATE_ACCESSOR`: Int = -2147207625;
public const val `FTE_E_FAILURE_TO_POST_SETCOMPLETION_STATUS`: Int = -2147207597;
public const val `FTE_E_FD_DID_NOT_CONNECT`: Int = -2147207660;
public const val `FTE_E_FD_DOC_TIMEOUT`: Int = -2147156733;
public const val `FTE_E_FD_DOC_UNEXPECTED_EXIT`: Int = -2147156731;
public const val `FTE_E_FD_FAILED_TO_LOAD_IFILTER`: Int = -2147156734;
public const val `FTE_E_FD_FILTER_CAUSED_SHARING_VIOLATION`: Int = -2147156725;
public const val `FTE_E_FD_IDLE`: Int = -2147207595;
public const val `FTE_E_FD_IFILTER_INIT_FAILED`: Int = -2147156735;
public const val `FTE_E_FD_NOISE_NO_IPERSISTSTREAM_ON_TEXT_FILTER`: Int = -2147156729;
public const val `FTE_E_FD_NOISE_NO_TEXT_FILTER`: Int = -2147156730;
public const val `FTE_E_FD_NOISE_TEXT_FILTER_INIT_FAILED`: Int = -2147156727;
public const val `FTE_E_FD_NOISE_TEXT_FILTER_LOAD_FAILED`: Int = -2147156728;
public const val `FTE_E_FD_NO_IPERSIST_INTERFACE`: Int = -2147156736;
public const val `FTE_E_FD_OCCURRENCE_OVERFLOW`: Int = -2147156726;
public const val `FTE_E_FD_OWNERSHIP_OBSOLETE`: Int = -2147207650;
public const val `FTE_E_FD_SHUTDOWN`: Int = -2147207640;
public const val `FTE_E_FD_TIMEOUT`: Int = -2147207632;
public const val `FTE_E_FD_UNEXPECTED_EXIT`: Int = -2147156732;
public const val `FTE_E_FD_UNRESPONSIVE`: Int = -2147207594;
public const val `FTE_E_FD_USED_TOO_MUCH_MEMORY`: Int = -2147207603;
public const val `FTE_E_FILTER_SINGLE_THREADED`: Int = -2147207675;
public const val `FTE_E_HIGH_MEMORY_PRESSURE`: Int = -2147207601;
public const val `FTE_E_INVALID_CODEPAGE`: Int = -2147207596;
public const val `FTE_E_INVALID_DOCID`: Int = -2147207663;
public const val `FTE_E_INVALID_ISOLATE_ERROR_BATCH`: Int = -2147207600;
public const val `FTE_E_INVALID_PROG_ID`: Int = -2147207614;
public const val `FTE_E_INVALID_PROJECT_ID`: Int = -2147207598;
public const val `FTE_E_INVALID_PROPERTY`: Int = -2147207630;
public const val `FTE_E_INVALID_TYPE`: Int = -2147207624;
public const val `FTE_E_KEY_NOT_CACHED`: Int = -2147207618;
public const val `FTE_E_LIBRARY_NOT_LOADED`: Int = -2147207627;
public const val `FTE_E_NOT_PROCESSED_DUE_TO_PREVIOUS_ERRORS`: Int = -2147207633;
public const val `FTE_E_NO_MORE_PROPERTIES`: Int = -2147207629;
public const val `FTE_E_NO_PLUGINS`: Int = -2147207638;
public const val `FTE_E_NO_PROPERTY_STORE`: Int = -1073465766;
public const val `FTE_E_OUT_OF_RANGE`: Int = -2147207623;
public const val `FTE_E_PATH_TOO_LONG`: Int = -2147207654;
public const val `FTE_E_PAUSE_EXTERNAL`: Int = -2147207662;
public const val `FTE_E_PERFMON_FULL`: Int = -2147207626;
public const val `FTE_E_PERF_NOT_LOADED`: Int = -2147207611;
public const val `FTE_E_PIPE_DATA_CORRUPTED`: Int = -2147207671;
public const val `FTE_E_PIPE_NOT_CONNECTED`: Int = -2147207677;
public const val `FTE_E_PROGID_REQUIRED`: Int = -2147207658;
public const val `FTE_E_PROJECT_NOT_INITALIZED`: Int = -2147207672;
public const val `FTE_E_PROJECT_SHUTDOWN`: Int = -2147207673;
public const val `FTE_E_PROPERTY_STORE_WORKID_NOTVALID`: Int = -2147207621;
public const val `FTE_E_READONLY_CATALOG`: Int = -2147207612;
public const val `FTE_E_REDUNDANT_TRAN_FAILURE`: Int = -2147207642;
public const val `FTE_E_REJECTED_DUE_TO_PROJECT_STATUS`: Int = -2147207661;
public const val `FTE_E_RESOURCE_SHUTDOWN`: Int = -2147207631;
public const val `FTE_E_RETRY_HUGE_DOC`: Int = -2147207608;
public const val `FTE_E_RETRY_SINGLE_DOC_PER_BATCH`: Int = -2147207599;
public const val `FTE_E_SECRET_NOT_FOUND`: Int = -2147207678;
public const val `FTE_E_SERIAL_STREAM_CORRUPT`: Int = -2147207613;
public const val `FTE_E_STACK_CORRUPTED`: Int = -2147207615;
public const val `FTE_E_STATIC_THREAD_INVALID_ARGUMENTS`: Int = -2147207657;
public const val `FTE_E_UNEXPECTED_EXIT`: Int = -2147207602;
public const val `FTE_E_UNKNOWN_FD_TYPE`: Int = -2147207607;
public const val `FTE_E_UNKNOWN_PLUGIN`: Int = -2147207628;
public const val `FTE_E_UPGRADE_INTERFACE_ALREADY_INSTANTIATED`: Int = -2147207616;
public const val `FTE_E_UPGRADE_INTERFACE_ALREADY_SHUTDOWN`: Int = -2147207617;
public const val `FTE_E_URB_TOO_BIG`: Int = -2147207664;
public const val `FTE_INVALID_ADMIN_CLIENT`: Int = -2147207653;
public const val `FTE_S_BEYOND_QUOTA`: Int = 276002;
public const val `FTE_S_CATALOG_BLOB_MISMATCHED`: Int = 276056;
public const val `FTE_S_PROPERTY_RESET`: Int = 276057;
public const val `FTE_S_PROPERTY_STORE_END_OF_ENUMERATION`: Int = 276028;
public const val `FTE_S_READONLY_CATALOG`: Int = 276038;
public const val `FTE_S_REDUNDANT`: Int = 276005;
public const val `FTE_S_RESOURCES_STARTING_TO_GET_LOW`: Int = 275993;
public const val `FTE_S_RESUME`: Int = 276014;
public const val `FTE_S_STATUS_CHANGE_REQUEST`: Int = 276011;
public const val `FTE_S_TRY_TO_FLUSH`: Int = 276055;
// UNSUPPORTED Rust 3022:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FilterRegistration: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9e175b8d_f52a_11d8_b9a5_505054503030);

public const val `GENERATE_METHOD_PREFIXMATCH`: UInt = 1u;
public const val `GENERATE_METHOD_STEMMED`: UInt = 2u;
public const val `GHTR_E_INSUFFICIENT_DISK_SPACE`: Int = -2147218037;
public const val `GHTR_E_LOCAL_SERVER_UNAVAILABLE`: Int = -2147218055;
public const val `GTHR_E_ADDLINKS_FAILED_WILL_RETRY_PARENT`: Int = -2147217989;
public const val `GTHR_E_APPLICATION_NOT_FOUND`: Int = -2147218079;
public const val `GTHR_E_AUTOCAT_UNEXPECTED`: Int = -2147218012;
public const val `GTHR_E_BACKUP_VALIDATION_FAIL`: Int = -2147217994;
public const val `GTHR_E_BAD_FILTER_DAEMON`: Int = -2147218119;
public const val `GTHR_E_BAD_FILTER_HOST`: Int = -2147217993;
public const val `GTHR_E_CANNOT_ENABLE_CHECKPOINT`: Int = -2147218002;
public const val `GTHR_E_CANNOT_REMOVE_PLUGINMGR`: Int = -2147218078;
public const val `GTHR_E_CONFIG_DUP_EXTENSION`: Int = -2147218165;
public const val `GTHR_E_CONFIG_DUP_PROJECT`: Int = -2147218166;
public const val `GTHR_E_CONTENT_ID_CONFLICT`: Int = -2147218062;
public const val `GTHR_E_DIRMON_NOT_INITIALZED`: Int = -2147218019;
public const val `GTHR_E_DUPLICATE_OBJECT`: Int = -2147218174;
public const val `GTHR_E_DUPLICATE_PROJECT`: Int = -2147218094;
public const val `GTHR_E_DUPLICATE_URL`: Int = -2147218163;
public const val `GTHR_E_DUP_PROPERTY_MAPPING`: Int = -2147218134;
public const val `GTHR_E_EMPTY_DACL`: Int = -2147218006;
public const val `GTHR_E_ERROR_INITIALIZING_PERFMON`: Int = -2147218171;
public const val `GTHR_E_ERROR_OBJECT_NOT_FOUND`: Int = -2147218170;
public const val `GTHR_E_ERROR_WRITING_REGISTRY`: Int = -2147218172;
public const val `GTHR_E_FILTERPOOL_NOTFOUND`: Int = -2147217990;
public const val `GTHR_E_FILTER_FAULT`: Int = -2147218075;
public const val `GTHR_E_FILTER_INIT`: Int = -2147218130;
public const val `GTHR_E_FILTER_INTERRUPTED`: Int = -2147218092;
public const val `GTHR_E_FILTER_INVALID_MESSAGE`: Int = -2147218158;
public const val `GTHR_E_FILTER_NOT_FOUND`: Int = -2147218154;
public const val `GTHR_E_FILTER_NO_CODEPAGE`: Int = -2147218123;
public const val `GTHR_E_FILTER_NO_MORE_THREADS`: Int = -2147218153;
public const val `GTHR_E_FILTER_PROCESS_TERMINATED`: Int = -2147218159;
public const val `GTHR_E_FILTER_PROCESS_TERMINATED_QUOTA`: Int = -2147218151;
public const val `GTHR_E_FILTER_SINGLE_THREADED`: Int = -2147218069;
public const val `GTHR_E_FOLDER_CRAWLED_BY_ANOTHER_WORKSPACE`: Int = -2147218007;
public const val `GTHR_E_FORCE_NOTIFICATION_RESET`: Int = -2147218065;
public const val `GTHR_E_FROM_NOT_SPECIFIED`: Int = -2147218109;
public const val `GTHR_E_IE_OFFLINE`: Int = -2147218120;
public const val `GTHR_E_INSUFFICIENT_EXAMPLE_CATEGORIES`: Int = -2147218014;
public const val `GTHR_E_INSUFFICIENT_EXAMPLE_DOCUMENTS`: Int = -2147218013;
public const val `GTHR_E_INSUFFICIENT_FEATURE_TERMS`: Int = -2147218015;
public const val `GTHR_E_INVALIDFUNCTION`: Int = -2147218161;
public const val `GTHR_E_INVALID_ACCOUNT`: Int = -2147218132;
public const val `GTHR_E_INVALID_ACCOUNT_SYNTAX`: Int = -2147218129;
public const val `GTHR_E_INVALID_APPLICATION_NAME`: Int = -2147218077;
public const val `GTHR_E_INVALID_CALL_FROM_WBREAKER`: Int = -2147218058;
public const val `GTHR_E_INVALID_DIRECTORY`: Int = -2147218093;
public const val `GTHR_E_INVALID_EXTENSION`: Int = -2147218107;
public const val `GTHR_E_INVALID_GROW_FACTOR`: Int = -2147218106;
public const val `GTHR_E_INVALID_HOST_NAME`: Int = -2147218096;
public const val `GTHR_E_INVALID_LOG_FILE_NAME`: Int = -2147218103;
public const val `GTHR_E_INVALID_MAPPING`: Int = -2147218112;
public const val `GTHR_E_INVALID_PATH`: Int = -2147218124;
public const val `GTHR_E_INVALID_PATH_EXPRESSION`: Int = -2147218088;
public const val `GTHR_E_INVALID_PATH_SPEC`: Int = -2147218016;
public const val `GTHR_E_INVALID_PROJECT_NAME`: Int = -2147218142;
public const val `GTHR_E_INVALID_PROXY_PORT`: Int = -2147218091;
public const val `GTHR_E_INVALID_RESOURCE_ID`: Int = -2147218035;
public const val `GTHR_E_INVALID_RETRIES`: Int = -2147218104;
public const val `GTHR_E_INVALID_START_ADDRESS`: Int = -2147217998;
public const val `GTHR_E_INVALID_START_PAGE`: Int = -2147218095;
public const val `GTHR_E_INVALID_START_PAGE_HOST`: Int = -2147218087;
public const val `GTHR_E_INVALID_START_PAGE_PATH`: Int = -2147218080;
public const val `GTHR_E_INVALID_STREAM_LOGS_COUNT`: Int = -2147218108;
public const val `GTHR_E_INVALID_TIME_OUT`: Int = -2147218105;
public const val `GTHR_E_JET_BACKUP_ERROR`: Int = -2147218026;
public const val `GTHR_E_JET_RESTORE_ERROR`: Int = -2147218025;
public const val `GTHR_E_LOCAL_GROUPS_EXPANSION_INTERNAL_ERROR`: Int = -2147216867;
public const val `GTHR_E_NAME_TOO_LONG`: Int = -2147218156;
public const val `GTHR_E_NESTED_HIERARCHICAL_START_ADDRESSES`: Int = -2147218034;
public const val `GTHR_E_NOFILTERSINK`: Int = -2147218160;
public const val `GTHR_E_NON_FIXED_DRIVE`: Int = -2147218074;
public const val `GTHR_E_NOTIFICATION_FILE_SHARE_INFO_NOT_AVAILABLE`: Int = -2147218040;
public const val `GTHR_E_NOTIFICATION_LOCAL_PATH_MUST_USE_FIXED_DRIVE`: Int = -2147218039;
public const val `GTHR_E_NOTIFICATION_START_ADDRESS_INVALID`: Int = -2147218042;
public const val `GTHR_E_NOTIFICATION_START_PAGE`: Int = -2147218137;
public const val `GTHR_E_NOTIFICATION_TYPE_NOT_SUPPORTED`: Int = -2147218041;
public const val `GTHR_E_NOTIF_ACCESS_TOKEN_UPDATED`: Int = -2147218020;
public const val `GTHR_E_NOTIF_BEING_REMOVED`: Int = -2147218018;
public const val `GTHR_E_NOTIF_EXCESSIVE_THROUGHPUT`: Int = -2147218017;
public const val `GTHR_E_NO_IDENTITY`: Int = -2147218155;
public const val `GTHR_E_NO_PRTCLHNLR`: Int = -2147218121;
public const val `GTHR_E_NTF_CLIENT_NOT_SUBSCRIBED`: Int = -1073476167;
public const val `GTHR_E_OBJECT_NOT_VALID`: Int = -2147218005;
public const val `GTHR_E_OUT_OF_DOC_ID`: Int = -2147218138;
public const val `GTHR_E_PIPE_NOT_CONNECTTED`: Int = -2147217996;
public const val `GTHR_E_PLUGIN_NOT_REGISTERED`: Int = -2147218021;
public const val `GTHR_E_PROJECT_NOT_INITIALIZED`: Int = -2147218149;
public const val `GTHR_E_PROPERTIES_EXCEEDED`: Int = -2147218000;
public const val `GTHR_E_PROPERTY_LIST_NOT_INITIALIZED`: Int = -2147218057;
public const val `GTHR_E_PROXY_NAME`: Int = -2147218127;
public const val `GTHR_E_PRT_HNDLR_PROGID_MISSING`: Int = -2147218152;
public const val `GTHR_E_RECOVERABLE_EXOLEDB_ERROR`: Int = -2147218060;
public const val `GTHR_E_RETRY`: Int = -2147218027;
public const val `GTHR_E_SCHEMA_ERRORS_OCCURRED`: Int = -2147218054;
public const val `GTHR_E_SCOPES_EXCEEDED`: Int = -2147218001;
public const val `GTHR_E_SECRET_NOT_FOUND`: Int = -2147218089;
public const val `GTHR_E_SERVER_UNAVAILABLE`: Int = -2147218126;
public const val `GTHR_E_SHUTTING_DOWN`: Int = -2147218141;
public const val `GTHR_E_SINGLE_THREADED_EMBEDDING`: Int = -2147218011;
public const val `GTHR_E_TIMEOUT`: Int = -2147218053;
public const val `GTHR_E_TOO_MANY_PLUGINS`: Int = -2147218162;
public const val `GTHR_E_UNABLE_TO_READ_EXCHANGE_STORE`: Int = -2147218061;
public const val `GTHR_E_UNABLE_TO_READ_REGISTRY`: Int = -2147218173;
public const val `GTHR_E_UNKNOWN_PROTOCOL`: Int = -2147218150;
public const val `GTHR_E_UNSUPPORTED_PROPERTY_TYPE`: Int = -2147218157;
public const val `GTHR_E_URL_EXCLUDED`: Int = -2147218169;
public const val `GTHR_E_URL_UNIDENTIFIED`: Int = -2147218067;
public const val `GTHR_E_USER_AGENT_NOT_SPECIFIED`: Int = -2147218111;
public const val `GTHR_E_VALUE_NOT_AVAILABLE`: Int = -2147218139;
public const val `GTHR_S_BAD_FILE_LINK`: Int = 265580;
public const val `GTHR_S_CANNOT_FILTER`: Int = 265520;
public const val `GTHR_S_CANNOT_WORDBREAK`: Int = 265638;
public const val `GTHR_S_CONFIG_HAS_ACCOUNTS`: Int = 265558;
public const val `GTHR_S_CRAWL_ADAPTIVE`: Int = 265605;
public const val `GTHR_S_CRAWL_FULL`: Int = 265603;
public const val `GTHR_S_CRAWL_INCREMENTAL`: Int = 265604;
public const val `GTHR_S_CRAWL_SCHEDULED`: Int = 265576;
public const val `GTHR_S_END_PROCESS_LOOP_NOTIFY_QUEUE`: Int = 265584;
public const val `GTHR_S_END_STD_CHUNKS`: Int = 265508;
public const val `GTHR_S_MODIFIED_PARTS`: Int = 265592;
public const val `GTHR_S_NOT_ALL_PARTS`: Int = 265582;
public const val `GTHR_S_NO_CRAWL_SEEDS`: Int = 265515;
public const val `GTHR_S_NO_INDEX`: Int = 265616;
public const val `GTHR_S_OFFICE_CHILD`: Int = 265626;
public const val `GTHR_S_PAUSE_REASON_BACKOFF`: Int = 265620;
public const val `GTHR_S_PAUSE_REASON_EXTERNAL`: Int = 265618;
public const val `GTHR_S_PAUSE_REASON_PROFILE_IMPORT`: Int = 265651;
public const val `GTHR_S_PAUSE_REASON_UPGRADING`: Int = 265619;
public const val `GTHR_S_PROB_NOT_MODIFIED`: Int = 265575;
public const val `GTHR_S_START_FILTER_FROM_BODY`: Int = 265585;
public const val `GTHR_S_START_FILTER_FROM_PROTOCOL`: Int = 265578;
public const val `GTHR_S_STATUS_CHANGE_IGNORED`: Int = 265500;
public const val `GTHR_S_STATUS_END_CRAWL`: Int = 265501;
public const val `GTHR_S_STATUS_PAUSE`: Int = 265505;
public const val `GTHR_S_STATUS_RESET`: Int = 265502;
public const val `GTHR_S_STATUS_RESUME`: Int = 265504;
public const val `GTHR_S_STATUS_START`: Int = 265526;
public const val `GTHR_S_STATUS_STOP`: Int = 265523;
public const val `GTHR_S_STATUS_THROTTLE`: Int = 265503;
public const val `GTHR_S_TRANSACTION_IGNORED`: Int = 265577;
public const val `GTHR_S_USE_MIME_FILTER`: Int = 265639;
public typealias `HACCESSOR` = ULong;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HITRANGE` (
    public var `iPosition`: UInt,
    public var `cLength`: UInt,
)
public const val `IDENTIFIER_SDK_ERROR`: UInt = 268435456u;
public const val `IDENTIFIER_SDK_MASK`: UInt = 4026531840u;
public const val `IDS_MON_BUILTIN_PROPERTY`: Int = 264511;
public const val `IDS_MON_BUILTIN_VIEW`: Int = 264503;
public const val `IDS_MON_CANNOT_CAST`: Int = 264518;
public const val `IDS_MON_CANNOT_CONVERT`: Int = 264507;
public const val `IDS_MON_COLUMN_NOT_DEFINED`: Int = 264502;
public const val `IDS_MON_DATE_OUT_OF_RANGE`: Int = 264519;
public const val `IDS_MON_DEFAULT_ERROR`: Int = 264495;
public const val `IDS_MON_ILLEGAL_PASSTHROUGH`: Int = 264496;
public const val `IDS_MON_INVALIDSELECT_COALESCE`: Int = 264517;
public const val `IDS_MON_INVALID_CATALOG`: Int = 264516;
public const val `IDS_MON_INVALID_IN_GROUP_CLAUSE`: Int = 264520;
public const val `IDS_MON_MATCH_STRING`: Int = 264513;
public const val `IDS_MON_NOT_COLUMN_OF_VIEW`: Int = 264510;
public const val `IDS_MON_ORDINAL_OUT_OF_RANGE`: Int = 264500;
public const val `IDS_MON_OR_NOT`: Int = 264506;
public const val `IDS_MON_OUT_OF_MEMORY`: Int = 264504;
public const val `IDS_MON_OUT_OF_RANGE`: Int = 264508;
public const val `IDS_MON_PARSE_ERR_1_PARAM`: Int = 264497;
public const val `IDS_MON_PARSE_ERR_2_PARAM`: Int = 264498;
public const val `IDS_MON_PROPERTY_NAME_IN_VIEW`: Int = 264514;
public const val `IDS_MON_RELATIVE_INTERVAL`: Int = 264509;
public const val `IDS_MON_SELECT_STAR`: Int = 264505;
public const val `IDS_MON_SEMI_COLON`: Int = 264499;
public const val `IDS_MON_VIEW_ALREADY_DEFINED`: Int = 264515;
public const val `IDS_MON_VIEW_NOT_DEFINED`: Int = 264501;
public const val `IDS_MON_WEIGHT_OUT_OF_RANGE`: Int = 264512;
public const val `IDX_E_BUILD_IN_PROGRESS`: Int = -2147217147;
public const val `IDX_E_CATALOG_DISMOUNTED`: Int = -2147217124;
public const val `IDX_E_CORRUPT_INDEX`: Int = -2147217136;
public const val `IDX_E_DISKFULL`: Int = -2147217138;
public const val `IDX_E_DOCUMENT_ABORTED`: Int = -2147217125;
public const val `IDX_E_DSS_NOT_CONNECTED`: Int = -2147217126;
public const val `IDX_E_IDXLSTFILE_CORRUPT`: Int = -2147217146;
public const val `IDX_E_INVALIDTAG`: Int = -2147217151;
public const val `IDX_E_INVALID_INDEX`: Int = -2147217137;
public const val `IDX_E_METAFILE_CORRUPT`: Int = -2147217150;
public const val `IDX_E_NOISELIST_NOTFOUND`: Int = -2147217141;
public const val `IDX_E_NOT_LOADED`: Int = -2147217129;
public const val `IDX_E_OBJECT_NOT_FOUND`: Int = -2147217144;
public const val `IDX_E_PROPSTORE_INIT_FAILED`: Int = -2147217134;
public const val `IDX_E_PROP_MAJOR_VERSION_MISMATCH`: Int = -2147217128;
public const val `IDX_E_PROP_MINOR_VERSION_MISMATCH`: Int = -2147217127;
public const val `IDX_E_PROP_STATE_CORRUPT`: Int = -2147217133;
public const val `IDX_E_PROP_STOPPED`: Int = -2147217139;
public const val `IDX_E_REGISTRY_ENTRY`: Int = -2147217145;
public const val `IDX_E_SEARCH_SERVER_ALREADY_EXISTS`: Int = -2147217148;
public const val `IDX_E_SEARCH_SERVER_NOT_FOUND`: Int = -2147217143;
public const val `IDX_E_STEMMER_NOTFOUND`: Int = -2147217140;
public const val `IDX_E_TOO_MANY_SEARCH_SERVERS`: Int = -2147217149;
public const val `IDX_E_USE_APPGLOBAL_PROPTABLE`: Int = -2147217120;
public const val `IDX_E_USE_DEFAULT_CONTENTCLASS`: Int = -2147217121;
public const val `IDX_E_WB_NOTFOUND`: Int = -2147217142;
public const val `IDX_S_DSS_NOT_AVAILABLE`: Int = 266525;
public const val `IDX_S_NO_BUILD_IN_PROGRESS`: Int = 266516;
public const val `IDX_S_SEARCH_SERVER_ALREADY_EXISTS`: Int = 266517;
public const val `IDX_S_SEARCH_SERVER_DOES_NOT_EXIST`: Int = 266518;
public const val `ILK_EXPLICIT_EXCLUDED`: `INTERVAL_LIMIT_KIND` = 1;
public const val `ILK_EXPLICIT_INCLUDED`: `INTERVAL_LIMIT_KIND` = 0;
public const val `ILK_NEGATIVE_INFINITY`: `INTERVAL_LIMIT_KIND` = 2;
public const val `ILK_POSITIVE_INFINITY`: `INTERVAL_LIMIT_KIND` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INCREMENTAL_ACCESS_INFO` (
    public var `dwSize`: UInt,
    public var `ftLastModifiedTime`: `super`.`super`.`Foundation`.`FILETIME`,
)
public const val `INET_E_AGENT_CACHE_SIZE_EXCEEDED`: Int = -2146693246;
public const val `INET_E_AGENT_CONNECTION_FAILED`: Int = -2146693245;
public const val `INET_E_AGENT_EXCEEDING_CACHE_SIZE`: Int = -2146693232;
public const val `INET_E_AGENT_MAX_SIZE_EXCEEDED`: Int = -2146693248;
public const val `INET_E_SCHEDULED_EXCLUDE_RANGE`: Int = -2146693241;
public const val `INET_E_SCHEDULED_UPDATES_DISABLED`: Int = -2146693244;
public const val `INET_E_SCHEDULED_UPDATES_RESTRICTED`: Int = -2146693243;
public const val `INET_E_SCHEDULED_UPDATE_INTERVAL`: Int = -2146693242;
public const val `INET_S_AGENT_INCREASED_CACHE_SIZE`: Int = 790416;
public const val `INET_S_AGENT_PART_FAIL`: Int = 790401;
public typealias `INTERVAL_LIMIT_KIND` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ITEMPROP` (
    public var `variantValue`: `super`.`Variant`.`VARIANT`,
    public var `pwszName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 3259:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// impl Default for ITEMPROP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ITEM_INFO` (
    public var `dwSize`: UInt,
    public var `pcwszFromEMail`: `windows_sys`.`core`.`PCWSTR`,
    public var `pcwszApplicationName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pcwszCatalogName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pcwszContentClass`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 3274:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ITEM_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3279:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Interval: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd957171f_4bf9_4de2_bcd5_c70a7ca55836);

public const val `JET_GET_PROP_STORE_ERROR`: Int = -1073732822;
public const val `JET_INIT_ERROR`: Int = -1073732824;
public const val `JET_MULTIINSTANCE_DISABLED`: Int = -2147474645;
public const val `JET_NEW_PROP_STORE_ERROR`: Int = -1073732823;
public const val `JPS_E_CATALOG_DECSRIPTION_MISSING`: Int = -2147217023;
public const val `JPS_E_INSUFFICIENT_DATABASE_RESOURCES`: Int = -2147217019;
public const val `JPS_E_INSUFFICIENT_DATABASE_SESSIONS`: Int = -2147217020;
public const val `JPS_E_INSUFFICIENT_VERSION_STORAGE`: Int = -2147217021;
public const val `JPS_E_JET_ERR`: Int = -2147217025;
public const val `JPS_E_MISSING_INFORMATION`: Int = -2147217022;
public const val `JPS_E_PROPAGATION_CORRUPTION`: Int = -2147217016;
public const val `JPS_E_PROPAGATION_FILE`: Int = -2147217017;
public const val `JPS_E_PROPAGATION_VERSION_MISMATCH`: Int = -2147217015;
public const val `JPS_E_SCHEMA_ERROR`: Int = -2147217018;
public const val `JPS_E_SHARING_VIOLATION`: Int = -2147217014;
public const val `JPS_S_DUPLICATE_DOC_DETECTED`: Int = 266624;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KAGGETDIAG` (
    public var `ulSize`: UInt,
    public var `vDiagInfo`: `super`.`Variant`.`VARIANT`,
    public var `sDiagField`: Short,
)
// UNSUPPORTED Rust 3304:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// impl Default for KAGGETDIAG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KAGPROPVAL_CONCUR_LOCK`: UInt = 4u;
public const val `KAGPROPVAL_CONCUR_READ_ONLY`: UInt = 8u;
public const val `KAGPROPVAL_CONCUR_ROWVER`: UInt = 1u;
public const val `KAGPROPVAL_CONCUR_VALUES`: UInt = 2u;
public const val `KAGPROP_ACCESSIBLEPROCEDURES`: UInt = 2u;
public const val `KAGPROP_ACCESSIBLETABLES`: UInt = 3u;
public const val `KAGPROP_ACTIVESTATEMENTS`: UInt = 24u;
public const val `KAGPROP_AUTH_SERVERINTEGRATED`: UInt = 3u;
public const val `KAGPROP_AUTH_TRUSTEDCONNECTION`: UInt = 2u;
public const val `KAGPROP_BLOBSONFOCURSOR`: UInt = 8u;
public const val `KAGPROP_CONCURRENCY`: UInt = 7u;
public const val `KAGPROP_CURSOR`: UInt = 6u;
public const val `KAGPROP_DRIVERNAME`: UInt = 7u;
public const val `KAGPROP_DRIVERODBCVER`: UInt = 9u;
public const val `KAGPROP_DRIVERVER`: UInt = 8u;
public const val `KAGPROP_FILEUSAGE`: UInt = 23u;
public const val `KAGPROP_FORCENOPARAMETERREBIND`: UInt = 11u;
public const val `KAGPROP_FORCENOPREPARE`: UInt = 12u;
public const val `KAGPROP_FORCENOREEXECUTE`: UInt = 13u;
public const val `KAGPROP_FORCESSFIREHOSEMODE`: UInt = 10u;
public const val `KAGPROP_INCLUDENONEXACT`: UInt = 9u;
public const val `KAGPROP_IRowsetChangeExtInfo`: UInt = 5u;
public const val `KAGPROP_LIKEESCAPECLAUSE`: UInt = 10u;
public const val `KAGPROP_MARSHALLABLE`: UInt = 3u;
public const val `KAGPROP_MAXCOLUMNSINGROUPBY`: UInt = 12u;
public const val `KAGPROP_MAXCOLUMNSININDEX`: UInt = 13u;
public const val `KAGPROP_MAXCOLUMNSINORDERBY`: UInt = 14u;
public const val `KAGPROP_MAXCOLUMNSINSELECT`: UInt = 15u;
public const val `KAGPROP_MAXCOLUMNSINTABLE`: UInt = 16u;
public const val `KAGPROP_NUMERICFUNCTIONS`: UInt = 17u;
public const val `KAGPROP_ODBCSQLCONFORMANCE`: UInt = 18u;
public const val `KAGPROP_ODBCSQLOPTIEF`: UInt = 4u;
public const val `KAGPROP_OJCAPABILITY`: UInt = 5u;
public const val `KAGPROP_OUTERJOINS`: UInt = 19u;
public const val `KAGPROP_POSITIONONNEWROW`: UInt = 4u;
public const val `KAGPROP_PROCEDURES`: UInt = 6u;
public const val `KAGPROP_QUERYBASEDUPDATES`: UInt = 2u;
public const val `KAGPROP_SPECIALCHARACTERS`: UInt = 11u;
public const val `KAGPROP_STRINGFUNCTIONS`: UInt = 20u;
public const val `KAGPROP_SYSTEMFUNCTIONS`: UInt = 21u;
public const val `KAGPROP_TIMEDATEFUNCTIONS`: UInt = 22u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KAGREQDIAG` (
    public var `ulDiagFlags`: UInt,
    public var `vt`: `super`.`Variant`.`VARENUM`,
    public var `sDiagField`: Short,
)
public typealias `KAGREQDIAGFLAGSENUM` = Int;
public const val `KAGREQDIAGFLAGS_HEADER`: `KAGREQDIAGFLAGSENUM` = 1;
public const val `KAGREQDIAGFLAGS_RECORD`: `KAGREQDIAGFLAGSENUM` = 2;
public typealias `LOCKMODEENUM` = Int;
public const val `LOCKMODE_EXCLUSIVE`: `LOCKMODEENUM` = 1;
public const val `LOCKMODE_INVALID`: `LOCKMODEENUM` = 0;
public const val `LOCKMODE_SHARED`: `LOCKMODEENUM` = 2;
// UNSUPPORTED Rust 3366:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LeafCondition: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x52f15c89_5a17_48e1_bbcd_46a3f89c7cc2);

public const val `MAXNAME`: UInt = 129u;
public const val `MAXNUMERICLEN`: UInt = 16u;
public const val `MAXUSEVERITY`: UInt = 18u;
public const val `MAX_QUERY_RANK`: UInt = 1000u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MDAXISINFO` (
    public var `cbSize`: ULong,
    public var `iAxis`: ULong,
    public var `cDimensions`: ULong,
    public var `cCoordinates`: ULong,
    public var `rgcColumns`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `rgpwszDimensionNames`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?,
)
// UNSUPPORTED Rust 3382:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for MDAXISINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MDAXISINFO` (
    public var `cbSize`: ULong,
    public var `iAxis`: ULong,
    public var `cDimensions`: ULong,
    public var `cCoordinates`: ULong,
    public var `rgcColumns`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `rgpwszDimensionNames`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?,
)
// UNSUPPORTED Rust 3399:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for MDAXISINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MDAXIS_CHAPTERS`: UInt = 4u;
public const val `MDAXIS_COLUMNS`: UInt = 0u;
public const val `MDAXIS_PAGES`: UInt = 2u;
public const val `MDAXIS_ROWS`: UInt = 1u;
public const val `MDAXIS_SECTIONS`: UInt = 3u;
public const val `MDAXIS_SLICERS`: UInt = 4294967295u;
public const val `MDDISPINFO_DRILLED_DOWN`: UInt = 65536u;
public const val `MDDISPINFO_PARENT_SAME_AS_PREV`: UInt = 131072u;
public const val `MDFF_BOLD`: UInt = 1u;
public const val `MDFF_ITALIC`: UInt = 2u;
public const val `MDFF_STRIKEOUT`: UInt = 8u;
public const val `MDFF_UNDERLINE`: UInt = 4u;
public const val `MDLEVEL_TYPE_ALL`: UInt = 1u;
public const val `MDLEVEL_TYPE_CALCULATED`: UInt = 2u;
public const val `MDLEVEL_TYPE_REGULAR`: UInt = 0u;
public const val `MDLEVEL_TYPE_RESERVED1`: UInt = 8u;
public const val `MDLEVEL_TYPE_TIME`: UInt = 4u;
public const val `MDLEVEL_TYPE_TIME_DAYS`: UInt = 516u;
public const val `MDLEVEL_TYPE_TIME_HALF_YEAR`: UInt = 36u;
public const val `MDLEVEL_TYPE_TIME_HOURS`: UInt = 772u;
public const val `MDLEVEL_TYPE_TIME_MINUTES`: UInt = 1028u;
public const val `MDLEVEL_TYPE_TIME_MONTHS`: UInt = 132u;
public const val `MDLEVEL_TYPE_TIME_QUARTERS`: UInt = 68u;
public const val `MDLEVEL_TYPE_TIME_SECONDS`: UInt = 2052u;
public const val `MDLEVEL_TYPE_TIME_UNDEFINED`: UInt = 4100u;
public const val `MDLEVEL_TYPE_TIME_WEEKS`: UInt = 260u;
public const val `MDLEVEL_TYPE_TIME_YEARS`: UInt = 20u;
public const val `MDLEVEL_TYPE_UNKNOWN`: UInt = 0u;
public const val `MDMEASURE_AGGR_AVG`: UInt = 5u;
public const val `MDMEASURE_AGGR_CALCULATED`: UInt = 127u;
public const val `MDMEASURE_AGGR_COUNT`: UInt = 2u;
public const val `MDMEASURE_AGGR_MAX`: UInt = 4u;
public const val `MDMEASURE_AGGR_MIN`: UInt = 3u;
public const val `MDMEASURE_AGGR_STD`: UInt = 7u;
public const val `MDMEASURE_AGGR_SUM`: UInt = 1u;
public const val `MDMEASURE_AGGR_UNKNOWN`: UInt = 0u;
public const val `MDMEASURE_AGGR_VAR`: UInt = 6u;
public const val `MDMEMBER_TYPE_ALL`: UInt = 2u;
public const val `MDMEMBER_TYPE_FORMULA`: UInt = 4u;
public const val `MDMEMBER_TYPE_MEASURE`: UInt = 3u;
public const val `MDMEMBER_TYPE_REGULAR`: UInt = 1u;
public const val `MDMEMBER_TYPE_RESERVE1`: UInt = 5u;
public const val `MDMEMBER_TYPE_RESERVE2`: UInt = 6u;
public const val `MDMEMBER_TYPE_RESERVE3`: UInt = 7u;
public const val `MDMEMBER_TYPE_RESERVE4`: UInt = 8u;
public const val `MDMEMBER_TYPE_UNKNOWN`: UInt = 0u;
public const val `MDPROPVAL_AU_UNCHANGED`: Int = 1;
public const val `MDPROPVAL_AU_UNKNOWN`: Int = 2;
public const val `MDPROPVAL_AU_UNSUPPORTED`: Int = 0;
public const val `MDPROPVAL_FS_FULL_SUPPORT`: Int = 1;
public const val `MDPROPVAL_FS_GENERATED_COLUMN`: Int = 2;
public const val `MDPROPVAL_FS_GENERATED_DIMENSION`: Int = 3;
public const val `MDPROPVAL_FS_NO_SUPPORT`: Int = 4;
public const val `MDPROPVAL_MC_SEARCHEDCASE`: Int = 2;
public const val `MDPROPVAL_MC_SINGLECASE`: Int = 1;
public const val `MDPROPVAL_MD_AFTER`: Int = 4;
public const val `MDPROPVAL_MD_BEFORE`: Int = 2;
public const val `MDPROPVAL_MD_SELF`: Int = 1;
public const val `MDPROPVAL_MF_CREATE_CALCMEMBERS`: Int = 4;
public const val `MDPROPVAL_MF_CREATE_NAMEDSETS`: Int = 8;
public const val `MDPROPVAL_MF_SCOPE_GLOBAL`: Int = 32;
public const val `MDPROPVAL_MF_SCOPE_SESSION`: Int = 16;
public const val `MDPROPVAL_MF_WITH_CALCMEMBERS`: Int = 1;
public const val `MDPROPVAL_MF_WITH_NAMEDSETS`: Int = 2;
public const val `MDPROPVAL_MJC_IMPLICITCUBE`: Int = 4;
public const val `MDPROPVAL_MJC_MULTICUBES`: Int = 2;
public const val `MDPROPVAL_MJC_SINGLECUBE`: Int = 1;
public const val `MDPROPVAL_MMF_CLOSINGPERIOD`: Int = 8;
public const val `MDPROPVAL_MMF_COUSIN`: Int = 1;
public const val `MDPROPVAL_MMF_OPENINGPERIOD`: Int = 4;
public const val `MDPROPVAL_MMF_PARALLELPERIOD`: Int = 2;
public const val `MDPROPVAL_MNF_AGGREGATE`: Int = 16;
public const val `MDPROPVAL_MNF_CORRELATION`: Int = 64;
public const val `MDPROPVAL_MNF_COVARIANCE`: Int = 32;
public const val `MDPROPVAL_MNF_DRILLDOWNLEVEL`: Int = 2048;
public const val `MDPROPVAL_MNF_DRILLDOWNLEVELBOTTOM`: Int = 32768;
public const val `MDPROPVAL_MNF_DRILLDOWNLEVELTOP`: Int = 16384;
public const val `MDPROPVAL_MNF_DRILLDOWNMEMBERBOTTOM`: Int = 8192;
public const val `MDPROPVAL_MNF_DRILLDOWNMEMBERTOP`: Int = 4096;
public const val `MDPROPVAL_MNF_DRILLUPLEVEL`: Int = 131072;
public const val `MDPROPVAL_MNF_DRILLUPMEMBER`: Int = 65536;
public const val `MDPROPVAL_MNF_LINREG2`: Int = 512;
public const val `MDPROPVAL_MNF_LINREGPOINT`: Int = 1024;
public const val `MDPROPVAL_MNF_LINREGSLOPE`: Int = 128;
public const val `MDPROPVAL_MNF_LINREGVARIANCE`: Int = 256;
public const val `MDPROPVAL_MNF_MEDIAN`: Int = 1;
public const val `MDPROPVAL_MNF_RANK`: Int = 8;
public const val `MDPROPVAL_MNF_STDDEV`: Int = 4;
public const val `MDPROPVAL_MNF_VAR`: Int = 2;
public const val `MDPROPVAL_MOQ_CATALOG_CUBE`: Int = 2;
public const val `MDPROPVAL_MOQ_CUBE_DIM`: Int = 8;
public const val `MDPROPVAL_MOQ_DATASOURCE_CUBE`: Int = 1;
public const val `MDPROPVAL_MOQ_DIMHIER_LEVEL`: Int = 32;
public const val `MDPROPVAL_MOQ_DIMHIER_MEMBER`: Int = 256;
public const val `MDPROPVAL_MOQ_DIM_HIER`: Int = 16;
public const val `MDPROPVAL_MOQ_LEVEL_MEMBER`: Int = 64;
public const val `MDPROPVAL_MOQ_MEMBER_MEMBER`: Int = 128;
public const val `MDPROPVAL_MOQ_OUTERREFERENCE`: Int = 1;
public const val `MDPROPVAL_MOQ_SCHEMA_CUBE`: Int = 4;
public const val `MDPROPVAL_MSC_GREATERTHAN`: Int = 2;
public const val `MDPROPVAL_MSC_GREATERTHANEQUAL`: Int = 8;
public const val `MDPROPVAL_MSC_LESSTHAN`: Int = 1;
public const val `MDPROPVAL_MSC_LESSTHANEQUAL`: Int = 4;
public const val `MDPROPVAL_MSF_BOTTOMPERCENT`: Int = 2;
public const val `MDPROPVAL_MSF_BOTTOMSUM`: Int = 8;
public const val `MDPROPVAL_MSF_DRILLDOWNLEVEL`: Int = 2048;
public const val `MDPROPVAL_MSF_DRILLDOWNLEVELBOTTOM`: Int = 32768;
public const val `MDPROPVAL_MSF_DRILLDOWNLEVELTOP`: Int = 16384;
public const val `MDPROPVAL_MSF_DRILLDOWNMEMBBER`: Int = 1024;
public const val `MDPROPVAL_MSF_DRILLDOWNMEMBERBOTTOM`: Int = 8192;
public const val `MDPROPVAL_MSF_DRILLDOWNMEMBERTOP`: Int = 4096;
public const val `MDPROPVAL_MSF_DRILLUPLEVEL`: Int = 131072;
public const val `MDPROPVAL_MSF_DRILLUPMEMBER`: Int = 65536;
public const val `MDPROPVAL_MSF_LASTPERIODS`: Int = 32;
public const val `MDPROPVAL_MSF_MTD`: Int = 256;
public const val `MDPROPVAL_MSF_PERIODSTODATE`: Int = 16;
public const val `MDPROPVAL_MSF_QTD`: Int = 128;
public const val `MDPROPVAL_MSF_TOGGLEDRILLSTATE`: Int = 262144;
public const val `MDPROPVAL_MSF_TOPPERCENT`: Int = 1;
public const val `MDPROPVAL_MSF_TOPSUM`: Int = 4;
public const val `MDPROPVAL_MSF_WTD`: Int = 512;
public const val `MDPROPVAL_MSF_YTD`: Int = 64;
public const val `MDPROPVAL_MS_MULTIPLETUPLES`: Int = 1;
public const val `MDPROPVAL_MS_SINGLETUPLE`: Int = 2;
public const val `MDPROPVAL_NL_NAMEDLEVELS`: Int = 1;
public const val `MDPROPVAL_NL_NUMBEREDLEVELS`: Int = 2;
public const val `MDPROPVAL_NL_SCHEMAONLY`: Int = 4;
public const val `MDPROPVAL_NME_ALLDIMENSIONS`: Int = 0;
public const val `MDPROPVAL_NME_MEASURESONLY`: Int = 1;
public const val `MDPROPVAL_RR_NORANGEROWSET`: Int = 1;
public const val `MDPROPVAL_RR_READONLY`: Int = 2;
public const val `MDPROPVAL_RR_UPDATE`: Int = 4;
public const val `MDPROPVAL_VISUAL_MODE_DEFAULT`: Int = 0;
public const val `MDPROPVAL_VISUAL_MODE_VISUAL`: Int = 1;
public const val `MDPROPVAL_VISUAL_MODE_VISUAL_OFF`: Int = 2;
public const val `MDPROP_AGGREGATECELL_UPDATE`: `DBPROPENUM20` = 230;
public const val `MDPROP_AXES`: `DBPROPENUM20` = 252;
public const val `MDPROP_CELL`: UInt = 2u;
public const val `MDPROP_FLATTENING_SUPPORT`: `DBPROPENUM20` = 253;
public const val `MDPROP_MDX_AGGREGATECELL_UPDATE`: `DBPROPENUM20` = 230;
public const val `MDPROP_MDX_CASESUPPORT`: `DBPROPENUM20` = 222;
public const val `MDPROP_MDX_CUBEQUALIFICATION`: `DBPROPENUM20` = 219;
public const val `MDPROP_MDX_DESCFLAGS`: `DBPROPENUM20` = 225;
public const val `MDPROP_MDX_FORMULAS`: `DBPROPENUM20` = 229;
public const val `MDPROP_MDX_JOINCUBES`: `DBPROPENUM20` = 254;
public const val `MDPROP_MDX_MEMBER_FUNCTIONS`: `DBPROPENUM20` = 227;
public const val `MDPROP_MDX_NONMEASURE_EXPRESSIONS`: `DBPROPENUM20` = 262;
public const val `MDPROP_MDX_NUMERIC_FUNCTIONS`: `DBPROPENUM20` = 228;
public const val `MDPROP_MDX_OBJQUALIFICATION`: `DBPROPENUM20` = 261;
public const val `MDPROP_MDX_OUTERREFERENCE`: `DBPROPENUM20` = 220;
public const val `MDPROP_MDX_QUERYBYPROPERTY`: `DBPROPENUM20` = 221;
public const val `MDPROP_MDX_SET_FUNCTIONS`: `DBPROPENUM20` = 226;
public const val `MDPROP_MDX_SLICER`: `DBPROPENUM20` = 218;
public const val `MDPROP_MDX_STRING_COMPOP`: `DBPROPENUM20` = 224;
public const val `MDPROP_MEMBER`: UInt = 1u;
public const val `MDPROP_NAMED_LEVELS`: `DBPROPENUM20` = 255;
public const val `MDPROP_RANGEROWSET`: `DBPROPENUM20` = 256;
public const val `MDPROP_VISUALMODE`: `DBPROPENUM26` = 293;
public const val `MDSTATUS_S_CELLEMPTY`: `DBSTATUSENUM20` = 14;
public const val `MDTREEOP_ANCESTORS`: UInt = 32u;
public const val `MDTREEOP_CHILDREN`: UInt = 1u;
public const val `MDTREEOP_DESCENDANTS`: UInt = 16u;
public const val `MDTREEOP_PARENT`: UInt = 4u;
public const val `MDTREEOP_SELF`: UInt = 8u;
public const val `MDTREEOP_SIBLINGS`: UInt = 2u;
public const val `MD_DIMTYPE_MEASURE`: UInt = 2u;
public const val `MD_DIMTYPE_OTHER`: UInt = 3u;
public const val `MD_DIMTYPE_TIME`: UInt = 1u;
public const val `MD_DIMTYPE_UNKNOWN`: UInt = 0u;
public const val `MD_E_BADCOORDINATE`: Int = -2147217822;
public const val `MD_E_BADTUPLE`: Int = -2147217823;
public const val `MD_E_INVALIDAXIS`: Int = -2147217821;
public const val `MD_E_INVALIDCELLRANGE`: Int = -2147217820;
public const val `MINFATALERR`: UInt = 20u;
public const val `MIN_USER_DATATYPE`: UInt = 256u;
// UNSUPPORTED Rust 3580:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MSDAINITIALIZE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2206cdb0_19c1_11d1_89e0_00c04fd7a829);

// UNSUPPORTED Rust 3581:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MSDAORA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe8cc4cbe_fdff_11d0_b865_00a0c9081c1d);

// UNSUPPORTED Rust 3582:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MSDAORA8: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7f06a373_dd6a_43db_b4e0_1fc121e5e62b);

// UNSUPPORTED Rust 3583:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MSDAORA8_ERROR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7f06a374_dd6a_43db_b4e0_1fc121e5e62b);

// UNSUPPORTED Rust 3584:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const MSDAORA_ERROR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe8cc4cbf_fdff_11d0_b865_00a0c9081c1d);

public typealias `MSDSDBINITPROPENUM` = Int;
public typealias `MSDSSESSIONPROPENUM` = Int;
public const val `MSG_CI_CORRUPT_INDEX_COMPONENT`: Int = 1073745962;
public const val `MSG_CI_CREATE_SEVER_ITEM_FAILED`: Int = -2147479480;
public const val `MSG_CI_MASTER_MERGE_ABORTED`: Int = 1073745928;
public const val `MSG_CI_MASTER_MERGE_ABORTED_LOW_DISK`: Int = 1073745987;
public const val `MSG_CI_MASTER_MERGE_CANT_RESTART`: Int = -1073737718;
public const val `MSG_CI_MASTER_MERGE_CANT_START`: Int = -1073737719;
public const val `MSG_CI_MASTER_MERGE_COMPLETED`: Int = 1073745927;
public const val `MSG_CI_MASTER_MERGE_REASON_EXPECTED_DOCS`: Int = 1073745990;
public const val `MSG_CI_MASTER_MERGE_REASON_EXTERNAL`: Int = 1073745988;
public const val `MSG_CI_MASTER_MERGE_REASON_INDEX_LIMIT`: Int = 1073745989;
public const val `MSG_CI_MASTER_MERGE_REASON_NUMBER`: Int = 1073745991;
public const val `MSG_CI_MASTER_MERGE_RESTARTED`: Int = 1073745945;
public const val `MSG_CI_MASTER_MERGE_STARTED`: Int = 1073745926;
public const val `MSG_TEST_MESSAGE`: Int = 1074008064;
public const val `MSS_E_APPALREADYEXISTS`: Int = -2147213054;
public const val `MSS_E_APPNOTFOUND`: Int = -2147213055;
public const val `MSS_E_CATALOGALREADYEXISTS`: Int = -2147213050;
public const val `MSS_E_CATALOGNOTFOUND`: Int = -2147213053;
public const val `MSS_E_CATALOGSTOPPING`: Int = -2147213052;
public const val `MSS_E_INVALIDAPPNAME`: Int = -2147213056;
public const val `MSS_E_UNICODEFILEHEADERMISSING`: Int = -2147213051;
// UNSUPPORTED Rust 3608:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MS_PERSIST_PROGID: windows_sys::core::PCSTR = windows_sys::core::s!("MSPersist");

public typealias `NAMED_ENTITY_CERTAINTY` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com_StructuredStorage"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NATLANGUAGERESTRICTION` (
    public var `prop`: `super`.`super`.`Storage`.`IndexServer`.`FULLPROPSPEC`,
    public var `pwcsPhrase`: `windows_sys`.`core`.`PWSTR`,
    public var `lcid`: UInt,
)
// UNSUPPORTED Rust 3618:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com_StructuredStorage"))]
// impl Default for NATLANGUAGERESTRICTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NEC_HIGH`: `NAMED_ENTITY_CERTAINTY` = 2;
public const val `NEC_LOW`: `NAMED_ENTITY_CERTAINTY` = 0;
public const val `NEC_MEDIUM`: `NAMED_ENTITY_CERTAINTY` = 1;
public const val `NET_E_DISCONNECTED`: Int = -2147220733;
public const val `NET_E_GENERAL`: Int = -2147220736;
public const val `NET_E_INVALIDPARAMS`: Int = -2147220728;
public const val `NET_E_OPERATIONINPROGRESS`: Int = -2147220727;
public const val `NLADMIN_E_BUILD_CATALOG_NOT_INITIALIZED`: Int = -2147215100;
public const val `NLADMIN_E_DUPLICATE_CATALOG`: Int = -2147215103;
public const val `NLADMIN_E_FAILED_TO_GIVE_ACCOUNT_PRIVILEGE`: Int = -2147215101;
public const val `NLADMIN_S_NOT_ALL_BUILD_CATALOGS_INITIALIZED`: Int = 268546;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NODERESTRICTION` (
    public var `cRes`: UInt,
    public var `paRes`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RESTRICTION`>>?,
    public var `reserved`: UInt,
)
// UNSUPPORTED Rust 3643:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// impl Default for NODERESTRICTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NOTESPH_E_ATTACHMENTS`: Int = -2147211770;
public const val `NOTESPH_E_DB_ACCESS_DENIED`: Int = -2147211768;
public const val `NOTESPH_E_FAIL`: Int = -2147211759;
public const val `NOTESPH_E_ITEM_NOT_FOUND`: Int = -2147211772;
public const val `NOTESPH_E_NOTESSETUP_ID_MAPPING_ERROR`: Int = -2147211767;
public const val `NOTESPH_E_NO_NTID`: Int = -2147211769;
public const val `NOTESPH_E_SERVER_CONFIG`: Int = -2147211771;
public const val `NOTESPH_E_UNEXPECTED_STATE`: Int = -2147211775;
public const val `NOTESPH_E_UNSUPPORTED_CONTENT_FIELD_TYPE`: Int = -2147211773;
public const val `NOTESPH_S_IGNORE_ID`: Int = 271874;
public const val `NOTESPH_S_LISTKNOWNFIELDS`: Int = 271888;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NOTRESTRICTION` (
    public var `pRes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RESTRICTION`>?,
)
// UNSUPPORTED Rust 3666:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// impl Default for NOTRESTRICTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NOT_N_PARSE_ERROR`: Int = 526638;
// UNSUPPORTED Rust 3673:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const NegationCondition: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8de9c74c_605a_4acd_bee3_2b222aa2d23d);

public const val `OCC_INVALID`: UInt = 4294967295u;
public const val `ODBCVER`: UInt = 896u;
public const val `ODBC_ADD_DSN`: UInt = 1u;
public const val `ODBC_ADD_SYS_DSN`: UInt = 4u;
public const val `ODBC_BOTH_DSN`: UInt = 0u;
public const val `ODBC_CONFIG_DRIVER`: UInt = 3u;
public const val `ODBC_CONFIG_DRIVER_MAX`: UInt = 100u;
public const val `ODBC_CONFIG_DSN`: UInt = 2u;
public const val `ODBC_CONFIG_SYS_DSN`: UInt = 5u;
public const val `ODBC_ERROR_COMPONENT_NOT_FOUND`: UInt = 6u;
public const val `ODBC_ERROR_CREATE_DSN_FAILED`: UInt = 18u;
public const val `ODBC_ERROR_GENERAL_ERR`: UInt = 1u;
public const val `ODBC_ERROR_INVALID_BUFF_LEN`: UInt = 2u;
public const val `ODBC_ERROR_INVALID_DSN`: UInt = 9u;
public const val `ODBC_ERROR_INVALID_HWND`: UInt = 3u;
public const val `ODBC_ERROR_INVALID_INF`: UInt = 10u;
public const val `ODBC_ERROR_INVALID_KEYWORD_VALUE`: UInt = 8u;
public const val `ODBC_ERROR_INVALID_LOG_FILE`: UInt = 15u;
public const val `ODBC_ERROR_INVALID_NAME`: UInt = 7u;
public const val `ODBC_ERROR_INVALID_PARAM_SEQUENCE`: UInt = 14u;
public const val `ODBC_ERROR_INVALID_PATH`: UInt = 12u;
public const val `ODBC_ERROR_INVALID_REQUEST_TYPE`: UInt = 5u;
public const val `ODBC_ERROR_INVALID_STR`: UInt = 4u;
public const val `ODBC_ERROR_LOAD_LIB_FAILED`: UInt = 13u;
public const val `ODBC_ERROR_MAX`: UInt = 23u;
public const val `ODBC_ERROR_NOTRANINFO`: UInt = 23u;
public const val `ODBC_ERROR_OUTPUT_STRING_TRUNCATED`: UInt = 22u;
public const val `ODBC_ERROR_OUT_OF_MEM`: UInt = 21u;
public const val `ODBC_ERROR_REMOVE_DSN_FAILED`: UInt = 20u;
public const val `ODBC_ERROR_REQUEST_FAILED`: UInt = 11u;
public const val `ODBC_ERROR_USAGE_UPDATE_FAILED`: UInt = 17u;
public const val `ODBC_ERROR_USER_CANCELED`: UInt = 16u;
public const val `ODBC_ERROR_WRITING_SYSINFO_FAILED`: UInt = 19u;
public const val `ODBC_INSTALL_COMPLETE`: UInt = 2u;
public const val `ODBC_INSTALL_DRIVER`: UInt = 1u;
public const val `ODBC_INSTALL_INQUIRY`: UInt = 1u;
public const val `ODBC_REMOVE_DEFAULT_DSN`: UInt = 7u;
public const val `ODBC_REMOVE_DRIVER`: UInt = 2u;
public const val `ODBC_REMOVE_DSN`: UInt = 3u;
public const val `ODBC_REMOVE_SYS_DSN`: UInt = 6u;
public const val `ODBC_SYSTEM_DSN`: UInt = 2u;
public const val `ODBC_USER_DSN`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ODBC_VS_ARGS` (
    public var `pguidEvent`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `dwFlags`: UInt,
    public var `Anonymous1`: `ODBC_VS_ARGS_0`,
    public var `Anonymous2`: `ODBC_VS_ARGS_1`,
    public var `RetCode`: Short,
)
// UNSUPPORTED Rust 3725:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ODBC_VS_ARGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3730:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union ODBC_VS_ARGS_0 {
//     pub wszArg: windows_sys::core::PWSTR,
//     pub szArg: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 3736:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ODBC_VS_ARGS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3741:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union ODBC_VS_ARGS_1 {
//     pub wszCorrelation: windows_sys::core::PWSTR,
//     pub szCorrelation: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 3747:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ODBC_VS_ARGS_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ODBC_VS_FLAG_RETCODE`: Int = 4;
public const val `ODBC_VS_FLAG_STOP`: Int = 8;
public const val `ODBC_VS_FLAG_UNICODE_ARG`: Int = 1;
public const val `ODBC_VS_FLAG_UNICODE_COR`: Int = 2;
public const val `OLEDBVER`: UInt = 624u;
public const val `OLEDB_BINDER_CUSTOM_ERROR`: Int = -2147212032;
public typealias `OSPCOMP` = Int;
public const val `OSPCOMP_DEFAULT`: `OSPCOMP` = 1;
public const val `OSPCOMP_EQ`: `OSPCOMP` = 1;
public const val `OSPCOMP_GE`: `OSPCOMP` = 4;
public const val `OSPCOMP_GT`: `OSPCOMP` = 5;
public const val `OSPCOMP_LE`: `OSPCOMP` = 3;
public const val `OSPCOMP_LT`: `OSPCOMP` = 2;
public const val `OSPCOMP_NE`: `OSPCOMP` = 6;
public typealias `OSPFIND` = Int;
public const val `OSPFIND_CASESENSITIVE`: `OSPFIND` = 2;
public const val `OSPFIND_DEFAULT`: `OSPFIND` = 0;
public const val `OSPFIND_UP`: `OSPFIND` = 1;
public const val `OSPFIND_UPCASESENSITIVE`: `OSPFIND` = 3;
public typealias `OSPFORMAT` = Int;
public const val `OSPFORMAT_DEFAULT`: `OSPFORMAT` = 0;
public const val `OSPFORMAT_FORMATTED`: `OSPFORMAT` = 1;
public const val `OSPFORMAT_HTML`: `OSPFORMAT` = 2;
public const val `OSPFORMAT_RAW`: `OSPFORMAT` = 0;
public typealias `OSPRW` = Int;
public const val `OSPRW_DEFAULT`: `OSPRW` = 1;
public const val `OSPRW_MIXED`: `OSPRW` = 2;
public const val `OSPRW_READONLY`: `OSPRW` = 0;
public const val `OSPRW_READWRITE`: `OSPRW` = 1;
public typealias `OSPXFER` = Int;
public const val `OSPXFER_ABORT`: `OSPXFER` = 1;
public const val `OSPXFER_COMPLETE`: `OSPXFER` = 0;
public const val `OSPXFER_ERROR`: `OSPXFER` = 2;
public const val `OSP_IndexLabel`: UInt = 0u;
// UNSUPPORTED Rust 3786:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PDPO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xccb4ec60_b9dc_11d1_ac80_00a0c9034873);

public const val `PEOPLE_IMPORT_E_CANONICALURL_TOOLONG`: Int = -2147205110;
public const val `PEOPLE_IMPORT_E_DATATYPENOTSUPPORTED`: Int = -2147205115;
public const val `PEOPLE_IMPORT_E_DBCONNFAIL`: Int = -2147205120;
public const val `PEOPLE_IMPORT_E_DC_NOT_AVAILABLE`: Int = -2147205108;
public const val `PEOPLE_IMPORT_E_DIRSYNC_NOTREFRESHED`: Int = -2147205103;
public const val `PEOPLE_IMPORT_E_DIRSYNC_ZERO_COOKIE`: Int = -2147205112;
public const val `PEOPLE_IMPORT_E_DOMAIN_DISCOVER_FAILED`: Int = -2147205107;
public const val `PEOPLE_IMPORT_E_DOMAIN_REMOVED`: Int = -2147205105;
public const val `PEOPLE_IMPORT_E_ENUM_ACCESSDENIED`: Int = -2147205104;
public const val `PEOPLE_IMPORT_E_FAILTOGETDSDEF`: Int = -2147205118;
public const val `PEOPLE_IMPORT_E_FAILTOGETDSMAPPING`: Int = -2147205116;
public const val `PEOPLE_IMPORT_E_FAILTOGETLCID`: Int = -2147205106;
public const val `PEOPLE_IMPORT_E_LDAPPATH_TOOLONG`: Int = -2147205111;
public const val `PEOPLE_IMPORT_E_NOCASTINGSUPPORTED`: Int = -2147205114;
public const val `PEOPLE_IMPORT_E_UPDATE_DIRSYNC_COOKIE`: Int = -2147205113;
public const val `PEOPLE_IMPORT_E_USERNAME_NOTRESOLVED`: Int = -2147205109;
public const val `PEOPLE_IMPORT_NODSDEFINED`: Int = -2147205119;
public const val `PEOPLE_IMPORT_NOMAPPINGDEFINED`: Int = -2147205117;
public const val `PERM_ALL`: `ACCESS_MASKENUM` = 268435456;
public const val `PERM_CREATE`: `ACCESS_MASKENUM` = 16384;
public const val `PERM_DELETE`: `ACCESS_MASKENUM` = 65536;
public const val `PERM_DROP`: `ACCESS_MASKENUM` = 256;
public const val `PERM_EXCLUSIVE`: `ACCESS_MASKENUM` = 512;
public const val `PERM_EXECUTE`: `ACCESS_MASKENUM` = 536870912;
public const val `PERM_INSERT`: `ACCESS_MASKENUM` = 32768;
public const val `PERM_MAXIMUM_ALLOWED`: `ACCESS_MASKENUM` = 33554432;
public const val `PERM_READ`: `ACCESS_MASKENUM` = -2147483648;
public const val `PERM_READCONTROL`: `ACCESS_MASKENUM` = 131072;
public const val `PERM_READDESIGN`: `ACCESS_MASKENUM` = 1024;
public const val `PERM_REFERENCE`: `ACCESS_MASKENUM` = 8192;
public const val `PERM_UPDATE`: `ACCESS_MASKENUM` = 1073741824;
public const val `PERM_WITHGRANT`: `ACCESS_MASKENUM` = 4096;
public const val `PERM_WRITEDESIGN`: `ACCESS_MASKENUM` = 2048;
public const val `PERM_WRITEOWNER`: `ACCESS_MASKENUM` = 524288;
public const val `PERM_WRITEPERMISSIONS`: `ACCESS_MASKENUM` = 262144;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNFILLTEXTBUFFER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`TEXT_SOURCE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public const val `PRAll`: UInt = 256u;
public const val `PRAllBits`: UInt = 7u;
public const val `PRAny`: UInt = 512u;
public typealias `PRIORITIZE_FLAGS` = Int;
public const val `PRIORITIZE_FLAG_IGNOREFAILURECOUNT`: `PRIORITIZE_FLAGS` = 2;
public const val `PRIORITIZE_FLAG_RETRYFAILEDITEMS`: `PRIORITIZE_FLAGS` = 1;
public typealias `PRIORITY_LEVEL` = Int;
public const val `PRIORITY_LEVEL_DEFAULT`: `PRIORITY_LEVEL` = 3;
public const val `PRIORITY_LEVEL_FOREGROUND`: `PRIORITY_LEVEL` = 0;
public const val `PRIORITY_LEVEL_HIGH`: `PRIORITY_LEVEL` = 1;
public const val `PRIORITY_LEVEL_LOW`: `PRIORITY_LEVEL` = 2;
// UNSUPPORTED Rust 3834:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const PROGID_MSPersist_Version_W: windows_sys::core::PCWSTR = windows_sys::core::w!("MSPersist.1");

// UNSUPPORTED Rust 3835:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const PROGID_MSPersist_W: windows_sys::core::PCWSTR = windows_sys::core::w!("MSPersist");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROPERTYRESTRICTION` (
    public var `rel`: UInt,
    public var `prop`: `super`.`super`.`Storage`.`IndexServer`.`FULLPROPSPEC`,
    public var `prval`: `super`.`Com`.`StructuredStorage`.`PROPVARIANT`,
)
// UNSUPPORTED Rust 3844:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// impl Default for PROPERTYRESTRICTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PROPID_DBBMK_BOOKMARK`: UInt = 2u;
public const val `PROPID_DBBMK_CHAPTER`: UInt = 3u;
public const val `PROPID_DBSELF_SELF`: UInt = 2u;
public typealias `PROXY_ACCESS` = Int;
public const val `PROXY_ACCESS_DIRECT`: `PROXY_ACCESS` = 1;
public const val `PROXY_ACCESS_PRECONFIG`: `PROXY_ACCESS` = 0;
public const val `PROXY_ACCESS_PROXY`: `PROXY_ACCESS` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROXY_INFO` (
    public var `dwSize`: UInt,
    public var `pcwszUserAgent`: `windows_sys`.`core`.`PCWSTR`,
    public var `paUseProxy`: `PROXY_ACCESS`,
    public var `fLocalBypass`: `windows_sys`.`core`.`BOOL`,
    public var `dwPortNumber`: UInt,
    public var `pcwszProxyName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pcwszBypassList`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 3868:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROXY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PRRE`: UInt = 6u;
public const val `PRSomeBits`: UInt = 8u;
public const val `PRTH_E_ACCESS_DENIED`: UInt = 2147750405u;
public const val `PRTH_E_ACL_IS_READ_NONE`: UInt = 2147750417u;
public const val `PRTH_E_ACL_TOO_BIG`: UInt = 2147750418u;
public const val `PRTH_E_BAD_REQUEST`: UInt = 2147750408u;
public const val `PRTH_E_CANT_TRANSFORM_DENIED_ACE`: Int = -2147216881;
public const val `PRTH_E_CANT_TRANSFORM_EXTERNAL_ACL`: Int = -2147216882;
public const val `PRTH_E_COMM_ERROR`: UInt = 2147750400u;
public const val `PRTH_E_DATABASE_OPEN_ERROR`: Int = -2147216875;
public const val `PRTH_E_HTTPS_CERTIFICATE_ERROR`: Int = -2147216861;
public const val `PRTH_E_HTTPS_REQUIRE_CERTIFICATE`: Int = -2147216860;
public const val `PRTH_E_HTTP_CANNOT_CONNECT`: UInt = 2147750409u;
public const val `PRTH_E_INIT_FAILED`: Int = -2147216872;
public const val `PRTH_E_INTERNAL_ERROR`: Int = -2147216892;
public const val `PRTH_E_LOAD_FAILED`: Int = -2147216873;
public const val `PRTH_E_MIME_EXCLUDED`: Int = -2147216883;
public const val `PRTH_E_NOT_REDIRECTED`: UInt = 2147750407u;
public const val `PRTH_E_NO_PROPERTY`: Int = -2147216877;
public const val `PRTH_E_OBJ_NOT_FOUND`: UInt = 2147750401u;
public const val `PRTH_E_OPLOCK_BROKEN`: Int = -2147216874;
public const val `PRTH_E_REQUEST_ERROR`: UInt = 2147750402u;
public const val `PRTH_E_RETRY`: Int = -2147216885;
public const val `PRTH_E_SERVER_ERROR`: UInt = 2147750406u;
public const val `PRTH_E_TRUNCATED`: Int = -2147216870;
public const val `PRTH_E_VOLUME_MOUNT_POINT`: Int = -2147216871;
public const val `PRTH_E_WININET`: Int = -2147216886;
public const val `PRTH_S_ACL_IS_READ_EVERYONE`: UInt = 266768u;
public const val `PRTH_S_MAX_DOWNLOAD`: Int = 266764;
public const val `PRTH_S_MAX_GROWTH`: Int = 266761;
public const val `PRTH_S_NOT_ALL_PARTS`: UInt = 266779u;
public const val `PRTH_S_NOT_MODIFIED`: UInt = 266755u;
public const val `PRTH_S_TRY_IMPERSONATING`: Int = 266789;
public const val `PRTH_S_USE_ROSEBUD`: Int = 266772;
// UNSUPPORTED Rust 3907:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PSGUID_CHARACTERIZATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x560c36c0_503a_11cf_baa1_00004c752a9a);

// UNSUPPORTED Rust 3908:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PSGUID_QUERY_METADATA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x624c9360_93d0_11cf_a787_00004c752752);

// UNSUPPORTED Rust 3909:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PSGUID_STORAGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb725f130_47ef_101a_a5f1_02608c9eebac);

public const val `PWPROP_OSPVALUE`: UInt = 2u;
public const val `QPMO_APPEND_LCID_TO_LOCALIZED_PATH`: `QUERY_PARSER_MANAGER_OPTION` = 4;
public const val `QPMO_LOCALIZED_SCHEMA_BINARY_PATH`: `QUERY_PARSER_MANAGER_OPTION` = 3;
public const val `QPMO_LOCALIZER_SUPPORT`: `QUERY_PARSER_MANAGER_OPTION` = 5;
public const val `QPMO_PRELOCALIZED_SCHEMA_BINARY_PATH`: `QUERY_PARSER_MANAGER_OPTION` = 1;
public const val `QPMO_SCHEMA_BINARY_NAME`: `QUERY_PARSER_MANAGER_OPTION` = 0;
public const val `QPMO_UNLOCALIZED_SCHEMA_BINARY_PATH`: `QUERY_PARSER_MANAGER_OPTION` = 2;
public const val `QRY_E_COLUMNNOTSEARCHABLE`: Int = -2147219700;
public const val `QRY_E_COLUMNNOTSORTABLE`: Int = -2147219701;
public const val `QRY_E_ENGINEFAILED`: Int = -2147219693;
public const val `QRY_E_INFIXWILDCARD`: Int = -2147219696;
public const val `QRY_E_INVALIDCATALOG`: Int = -2147219687;
public const val `QRY_E_INVALIDCOLUMN`: Int = -2147219699;
public const val `QRY_E_INVALIDINTERVAL`: Int = -2147219682;
public const val `QRY_E_INVALIDPATH`: Int = -2147219684;
public const val `QRY_E_INVALIDSCOPES`: Int = -2147219688;
public const val `QRY_E_LMNOTINITIALIZED`: Int = -2147219683;
public const val `QRY_E_NOCOLUMNS`: Int = -2147219689;
public const val `QRY_E_NODATASOURCES`: Int = -2147219703;
public const val `QRY_E_NOLOGMANAGER`: Int = -2147219681;
public const val `QRY_E_NULLQUERY`: Int = -2147219691;
public const val `QRY_E_PREFIXWILDCARD`: Int = -2147219697;
public const val `QRY_E_QUERYCORRUPT`: Int = -2147219698;
public const val `QRY_E_QUERYSYNTAX`: Int = -2147219711;
public const val `QRY_E_SCOPECARDINALIDY`: Int = -2147219686;
public const val `QRY_E_SEARCHTOOBIG`: Int = -2147219692;
public const val `QRY_E_STARTHITTOBIG`: Int = -2147219705;
public const val `QRY_E_TIMEOUT`: Int = -2147219702;
public const val `QRY_E_TOOMANYCOLUMNS`: Int = -2147219707;
public const val `QRY_E_TOOMANYDATABASES`: Int = -2147219706;
public const val `QRY_E_TOOMANYQUERYTERMS`: Int = -2147219704;
public const val `QRY_E_TYPEMISMATCH`: Int = -2147219710;
public const val `QRY_E_UNEXPECTED`: Int = -2147219685;
public const val `QRY_E_UNHANDLEDTYPE`: Int = -2147219709;
public const val `QRY_E_WILDCARDPREFIXLENGTH`: Int = -2147219695;
public const val `QRY_S_INEXACTRESULTS`: Int = 263958;
public const val `QRY_S_NOROWSFOUND`: Int = 263940;
public const val `QRY_S_TERMIGNORED`: Int = 263954;
public const val `QUERY_E_AGGREGATE_NOT_SUPPORTED`: Int = -2147215847;
public const val `QUERY_E_ALLNOISE_AND_NO_RELDOC`: Int = -2147215859;
public const val `QUERY_E_ALLNOISE_AND_NO_RELPROP`: Int = -2147215857;
public const val `QUERY_E_DUPLICATE_RANGE_NAME`: Int = -2147215845;
public const val `QUERY_E_INCORRECT_VERSION`: Int = -2147215852;
public const val `QUERY_E_INVALIDCOALESCE`: Int = -2147215849;
public const val `QUERY_E_INVALIDSCOPE_COALESCE`: Int = -2147215851;
public const val `QUERY_E_INVALIDSORT_COALESCE`: Int = -2147215850;
public const val `QUERY_E_INVALID_DOCUMENT_IDENTIFIER`: Int = -2147215853;
public const val `QUERY_E_NO_RELDOC`: Int = -2147215858;
public const val `QUERY_E_NO_RELPROP`: Int = -2147215856;
public const val `QUERY_E_RELDOC_SYNTAX_NOT_SUPPORTED`: Int = -2147215854;
public const val `QUERY_E_REPEATED_RELDOC`: Int = -2147215855;
public const val `QUERY_E_TOP_LEVEL_IN_GROUP`: Int = -2147215846;
public const val `QUERY_E_UPGRADEINPROGRESS`: Int = -2147215848;
public typealias `QUERY_PARSER_MANAGER_OPTION` = Int;
public const val `QUERY_SORTDEFAULT`: UInt = 4u;
public const val `QUERY_SORTXASCEND`: UInt = 2u;
public const val `QUERY_SORTXDESCEND`: UInt = 3u;
public const val `QUERY_VALIDBITS`: UInt = 3u;
// UNSUPPORTED Rust 3968:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const QueryParser: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb72f8fd8_0fab_4dd9_bdbf_245a6ce1485b);

// UNSUPPORTED Rust 3969:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const QueryParserManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5088b39a_29b4_4d9d_8245_4ee289222f66);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RANGECATEGORIZE` (
    public var `cRange`: UInt,
    public var `aRangeBegin`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`StructuredStorage`.`PROPVARIANT`>?,
)
// UNSUPPORTED Rust 3977:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// impl Default for RANGECATEGORIZE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RESTRICTION` (
    public var `rt`: UInt,
    public var `weight`: UInt,
    public var `res`: `RESTRICTION_0`,
)
// UNSUPPORTED Rust 3991:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// impl Default for RESTRICTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3997:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// #[derive(Clone, Copy)]
// pub union RESTRICTION_0 {
//     pub ar: NODERESTRICTION,
//     pub orRestriction: NODERESTRICTION,
//     pub pxr: NODERESTRICTION,
//     pub vr: VECTORRESTRICTION,
//     pub nr: NOTRESTRICTION,
//     pub cr: CONTENTRESTRICTION,
//     pub nlr: NATLANGUAGERESTRICTION,
//     pub pr: PROPERTYRESTRICTION,
// }

// UNSUPPORTED Rust 4010:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// impl Default for RESTRICTION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `REXSPH_E_DUPLICATE_PROPERTY`: Int = -2147207927;
public const val `REXSPH_E_INVALID_CALL`: Int = -2147207936;
public const val `REXSPH_E_MULTIPLE_REDIRECT`: Int = -2147207933;
public const val `REXSPH_E_NO_PROPERTY_ON_ROW`: Int = -2147207932;
public const val `REXSPH_E_REDIRECT_ON_SECURITY_UPDATE`: Int = -2147207934;
public const val `REXSPH_E_TYPE_MISMATCH_ON_READ`: Int = -2147207931;
public const val `REXSPH_E_UNEXPECTED_DATA_STATUS`: Int = -2147207930;
public const val `REXSPH_E_UNEXPECTED_FILTER_STATE`: Int = -2147207928;
public const val `REXSPH_E_UNKNOWN_DATA_TYPE`: Int = -2147207929;
public const val `REXSPH_S_REDIRECTED`: Int = 275713;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RMTPACK` (
    public var `pISeqStream`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `cbData`: UInt,
    public var `cBSTR`: UInt,
    public var `rgBSTR`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?,
    public var `cVARIANT`: UInt,
    public var `rgVARIANT`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?,
    public var `cIDISPATCH`: UInt,
    public var `rgIDISPATCH`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?,
    public var `cIUNKNOWN`: UInt,
    public var `rgIUNKNOWN`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?,
    public var `cPROPVARIANT`: UInt,
    public var `rgPROPVARIANT`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`StructuredStorage`.`PROPVARIANT`>?,
    public var `cArray`: UInt,
    public var `rgArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?,
)
// UNSUPPORTED Rust 4046:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// impl Default for RMTPACK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RMTPACK` (
    public var `pISeqStream`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `cbData`: UInt,
    public var `cBSTR`: UInt,
    public var `rgBSTR`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?,
    public var `cVARIANT`: UInt,
    public var `rgVARIANT`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?,
    public var `cIDISPATCH`: UInt,
    public var `rgIDISPATCH`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?,
    public var `cIUNKNOWN`: UInt,
    public var `rgIUNKNOWN`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?,
    public var `cPROPVARIANT`: UInt,
    public var `rgPROPVARIANT`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`StructuredStorage`.`PROPVARIANT`>?,
    public var `cArray`: UInt,
    public var `rgArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?,
)
// UNSUPPORTED Rust 4073:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// impl Default for RMTPACK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ROWSETEVENT_ITEMSTATE` = Int;
public const val `ROWSETEVENT_ITEMSTATE_INROWSET`: `ROWSETEVENT_ITEMSTATE` = 1;
public const val `ROWSETEVENT_ITEMSTATE_NOTINROWSET`: `ROWSETEVENT_ITEMSTATE` = 0;
public const val `ROWSETEVENT_ITEMSTATE_UNKNOWN`: `ROWSETEVENT_ITEMSTATE` = 2;
public typealias `ROWSETEVENT_TYPE` = Int;
public const val `ROWSETEVENT_TYPE_DATAEXPIRED`: `ROWSETEVENT_TYPE` = 0;
public const val `ROWSETEVENT_TYPE_FOREGROUNDLOST`: `ROWSETEVENT_TYPE` = 1;
public const val `ROWSETEVENT_TYPE_SCOPESTATISTICS`: `ROWSETEVENT_TYPE` = 2;
public const val `RS_COMPLETED`: UInt = 2147483648u;
public const val `RS_MAYBOTHERUSER`: UInt = 131072u;
public const val `RS_READY`: UInt = 1u;
public const val `RS_SUSPENDED`: UInt = 2u;
public const val `RS_SUSPENDONIDLE`: UInt = 65536u;
public const val `RS_UPDATING`: UInt = 4u;
public const val `RTAnd`: UInt = 1u;
public const val `RTContent`: UInt = 4u;
public const val `RTNatLanguage`: UInt = 8u;
public const val `RTNone`: UInt = 0u;
public const val `RTNot`: UInt = 3u;
public const val `RTOr`: UInt = 2u;
public const val `RTProperty`: UInt = 5u;
public const val `RTProximity`: UInt = 6u;
public const val `RTVector`: UInt = 7u;
// UNSUPPORTED Rust 4103:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const RootBinder: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xff151822_b0bf_11d1_a80d_000000000000);

public const val `SCHEMA_E_ADDSTOPWORDS`: Int = -2147218420;
public const val `SCHEMA_E_BADATTRIBUTE`: Int = -2147218412;
public const val `SCHEMA_E_BADCOLUMNNAME`: Int = -2147218414;
public const val `SCHEMA_E_BADFILENAME`: Int = -2147218411;
public const val `SCHEMA_E_BADPROPPID`: Int = -2147218413;
public const val `SCHEMA_E_BADPROPSPEC`: Int = -2147218417;
public const val `SCHEMA_E_CANNOTCREATEFILE`: Int = -2147218426;
public const val `SCHEMA_E_CANNOTCREATENOISEWORDFILE`: Int = -2147218421;
public const val `SCHEMA_E_CANNOTWRITEFILE`: Int = -2147218425;
public const val `SCHEMA_E_DUPLICATENOISE`: Int = -2147218409;
public const val `SCHEMA_E_EMPTYFILE`: Int = -2147218424;
public const val `SCHEMA_E_FILECHANGED`: Int = -2147218415;
public const val `SCHEMA_E_FILENOTFOUND`: Int = -2147218430;
public const val `SCHEMA_E_INVALIDDATATYPE`: Int = -2147218422;
public const val `SCHEMA_E_INVALIDFILETYPE`: Int = -2147218423;
public const val `SCHEMA_E_INVALIDVALUE`: Int = -2147218418;
public const val `SCHEMA_E_LOAD_SPECIAL`: Int = -2147218431;
public const val `SCHEMA_E_NAMEEXISTS`: Int = -2147218419;
public const val `SCHEMA_E_NESTEDTAG`: Int = -2147218429;
public const val `SCHEMA_E_NOMORECOLUMNS`: Int = -2147218416;
public const val `SCHEMA_E_PROPEXISTS`: Int = -2147218410;
public const val `SCHEMA_E_UNEXPECTEDTAG`: Int = -2147218428;
public const val `SCHEMA_E_VERSIONMISMATCH`: Int = -2147218427;
public const val `SCRIPTPI_E_ALREADY_COMPLETED`: Int = -2147213307;
public const val `SCRIPTPI_E_CANNOT_ALTER_CHUNK`: Int = -2147213308;
public const val `SCRIPTPI_E_CHUNK_NOT_TEXT`: Int = -2147213312;
public const val `SCRIPTPI_E_CHUNK_NOT_VALUE`: Int = -2147213309;
public const val `SCRIPTPI_E_PID_NOT_NAME`: Int = -2147213311;
public const val `SCRIPTPI_E_PID_NOT_NUMERIC`: Int = -2147213310;
public const val `SEARCH_ADVANCED_QUERY_SYNTAX`: `SEARCH_QUERY_SYNTAX` = 1;
public const val `SEARCH_CHANGE_ADD`: `SEARCH_KIND_OF_CHANGE` = 0;
public const val `SEARCH_CHANGE_DELETE`: `SEARCH_KIND_OF_CHANGE` = 1;
public const val `SEARCH_CHANGE_MODIFY`: `SEARCH_KIND_OF_CHANGE` = 2;
public const val `SEARCH_CHANGE_MOVE_RENAME`: `SEARCH_KIND_OF_CHANGE` = 3;
public const val `SEARCH_CHANGE_SEMANTICS_DIRECTORY`: `SEARCH_KIND_OF_CHANGE` = 262144;
public const val `SEARCH_CHANGE_SEMANTICS_SHALLOW`: `SEARCH_KIND_OF_CHANGE` = 524288;
public const val `SEARCH_CHANGE_SEMANTICS_UPDATE_SECURITY`: `SEARCH_KIND_OF_CHANGE` = 4194304;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SEARCH_COLUMN_PROPERTIES` (
    public var `Value`: `super`.`Com`.`StructuredStorage`.`PROPVARIANT`,
    public var `lcid`: UInt,
)
// UNSUPPORTED Rust 4148:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// impl Default for SEARCH_COLUMN_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SEARCH_HIGH_PRIORITY`: `SEARCH_NOTIFICATION_PRIORITY` = 1;
public typealias `SEARCH_INDEXING_PHASE` = Int;
public const val `SEARCH_INDEXING_PHASE_GATHERER`: `SEARCH_INDEXING_PHASE` = 0;
public const val `SEARCH_INDEXING_PHASE_PERSISTED`: `SEARCH_INDEXING_PHASE` = 2;
public const val `SEARCH_INDEXING_PHASE_QUERYABLE`: `SEARCH_INDEXING_PHASE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SEARCH_ITEM_CHANGE` (
    public var `Change`: `SEARCH_KIND_OF_CHANGE`,
    public var `Priority`: `SEARCH_NOTIFICATION_PRIORITY`,
    public var `pUserData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`BLOB`>?,
    public var `lpwszURL`: `windows_sys`.`core`.`PWSTR`,
    public var `lpwszOldURL`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 4169:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SEARCH_ITEM_CHANGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SEARCH_ITEM_INDEXING_STATUS` (
    public var `dwDocID`: UInt,
    public var `hrIndexingStatus`: `windows_sys`.`core`.`HRESULT`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SEARCH_ITEM_PERSISTENT_CHANGE` (
    public var `Change`: `SEARCH_KIND_OF_CHANGE`,
    public var `URL`: `windows_sys`.`core`.`PWSTR`,
    public var `OldURL`: `windows_sys`.`core`.`PWSTR`,
    public var `Priority`: `SEARCH_NOTIFICATION_PRIORITY`,
)
// UNSUPPORTED Rust 4189:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SEARCH_ITEM_PERSISTENT_CHANGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SEARCH_KIND_OF_CHANGE` = Int;
public const val `SEARCH_NATURAL_QUERY_SYNTAX`: `SEARCH_QUERY_SYNTAX` = 2;
public const val `SEARCH_NORMAL_PRIORITY`: `SEARCH_NOTIFICATION_PRIORITY` = 0;
public typealias `SEARCH_NOTIFICATION_PRIORITY` = Int;
public const val `SEARCH_NO_QUERY_SYNTAX`: `SEARCH_QUERY_SYNTAX` = 0;
public typealias `SEARCH_QUERY_SYNTAX` = Int;
public typealias `SEARCH_TERM_EXPANSION` = Int;
public const val `SEARCH_TERM_NO_EXPANSION`: `SEARCH_TERM_EXPANSION` = 0;
public const val `SEARCH_TERM_PREFIX_ALL`: `SEARCH_TERM_EXPANSION` = 1;
public const val `SEARCH_TERM_STEM_ALL`: `SEARCH_TERM_EXPANSION` = 2;
public const val `SEC_E_ACCESSDENIED`: Int = -2147216129;
public const val `SEC_E_BADTRUSTEEID`: Int = -2147217814;
public const val `SEC_E_INITFAILED`: Int = -2147216383;
public const val `SEC_E_INVALIDACCESSENTRY`: Int = -2147217807;
public const val `SEC_E_INVALIDACCESSENTRYLIST`: Int = -2147217809;
public const val `SEC_E_INVALIDCONTEXT`: Int = -2147216381;
public const val `SEC_E_INVALIDOBJECT`: Int = -2147217811;
public const val `SEC_E_INVALIDOWNER`: Int = -2147217808;
public const val `SEC_E_NOMEMBERSHIPSUPPORT`: Int = -2147217812;
public const val `SEC_E_NOOWNER`: Int = -2147217810;
public const val `SEC_E_NOTINITIALIZED`: Int = -2147216382;
public const val `SEC_E_NOTRUSTEEID`: Int = -2147217813;
public const val `SEC_E_PERMISSIONDENIED`: Int = -2147217911;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_IndexServer")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SEC_OBJECT` (
    public var `cObjects`: UInt,
    public var `prgObjects`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SEC_OBJECT_ELEMENT`>?,
)
// UNSUPPORTED Rust 4225:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_Storage_IndexServer")]
// impl Default for SEC_OBJECT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_IndexServer")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SEC_OBJECT` (
    public var `cObjects`: UInt,
    public var `prgObjects`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SEC_OBJECT_ELEMENT`>?,
)
// UNSUPPORTED Rust 4240:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_Storage_IndexServer")]
// impl Default for SEC_OBJECT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_IndexServer")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SEC_OBJECT_ELEMENT` (
    public var `guidObjectType`: `windows_sys`.`core`.`GUID`,
    public var `ObjectID`: `super`.`super`.`Storage`.`IndexServer`.`DBID`,
)
// UNSUPPORTED Rust 4255:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_Storage_IndexServer")]
// impl Default for SEC_OBJECT_ELEMENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_IndexServer")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SEC_OBJECT_ELEMENT` (
    public var `guidObjectType`: `windows_sys`.`core`.`GUID`,
    public var `ObjectID`: `super`.`super`.`Storage`.`IndexServer`.`DBID`,
)
// UNSUPPORTED Rust 4270:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_Storage_IndexServer")]
// impl Default for SEC_OBJECT_ELEMENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SI_TEMPORARY`: UInt = 2147483648u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com_StructuredStorage"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SORTKEY` (
    public var `propColumn`: `super`.`super`.`Storage`.`IndexServer`.`FULLPROPSPEC`,
    public var `dwOrder`: UInt,
    public var `locale`: UInt,
)
// UNSUPPORTED Rust 4286:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com_StructuredStorage"))]
// impl Default for SORTKEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com_StructuredStorage"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SORTSET` (
    public var `cCol`: UInt,
    public var `aCol`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SORTKEY`>?,
)
// UNSUPPORTED Rust 4299:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com_StructuredStorage"))]
// impl Default for SORTSET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SPS_WS_ERROR`: Int = -2147211753;
public const val `SQLAOPANY`: UInt = 83u;
public const val `SQLAOPAVG`: UInt = 79u;
public const val `SQLAOPCNT`: UInt = 75u;
public const val `SQLAOPMAX`: UInt = 82u;
public const val `SQLAOPMIN`: UInt = 81u;
public const val `SQLAOPNOOP`: UInt = 86u;
public const val `SQLAOPSTDEV`: UInt = 48u;
public const val `SQLAOPSTDEVP`: UInt = 49u;
public const val `SQLAOPSUM`: UInt = 77u;
public const val `SQLAOPVAR`: UInt = 50u;
public const val `SQLAOPVARP`: UInt = 51u;
public const val `SQLBIGBINARY`: UInt = 173u;
public const val `SQLBIGCHAR`: UInt = 175u;
public const val `SQLBIGVARBINARY`: UInt = 165u;
public const val `SQLBIGVARCHAR`: UInt = 167u;
public const val `SQLBINARY`: UInt = 45u;
public const val `SQLBIT`: UInt = 50u;
public const val `SQLBITN`: UInt = 104u;
public const val `SQLCHARACTER`: UInt = 47u;
public const val `SQLDATETIM4`: UInt = 58u;
public const val `SQLDATETIME`: UInt = 61u;
public const val `SQLDATETIMN`: UInt = 111u;
public const val `SQLDECIMAL`: UInt = 106u;
public const val `SQLDECIMALN`: UInt = 106u;
public const val `SQLFLT4`: UInt = 59u;
public const val `SQLFLT8`: UInt = 62u;
public const val `SQLFLTN`: UInt = 109u;
public const val `SQLIMAGE`: UInt = 34u;
public const val `SQLINT1`: UInt = 48u;
public const val `SQLINT2`: UInt = 52u;
public const val `SQLINT4`: UInt = 56u;
public const val `SQLINT8`: UInt = 127u;
public typealias `SQLINTERVAL` = Int;
public const val `SQLINTN`: UInt = 38u;
public const val `SQLMONEY`: UInt = 60u;
public const val `SQLMONEY4`: UInt = 122u;
public const val `SQLMONEYN`: UInt = 110u;
public const val `SQLNCHAR`: UInt = 239u;
public const val `SQLNTEXT`: UInt = 99u;
public const val `SQLNUMERIC`: UInt = 108u;
public const val `SQLNUMERICN`: UInt = 108u;
public const val `SQLNVARCHAR`: UInt = 231u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SQLPERF` (
    public var `TimerResolution`: UInt,
    public var `SQLidu`: UInt,
    public var `SQLiduRows`: UInt,
    public var `SQLSelects`: UInt,
    public var `SQLSelectRows`: UInt,
    public var `Transactions`: UInt,
    public var `SQLPrepares`: UInt,
    public var `ExecDirects`: UInt,
    public var `SQLExecutes`: UInt,
    public var `CursorOpens`: UInt,
    public var `CursorSize`: UInt,
    public var `CursorUsed`: UInt,
    public var `PercentCursorUsed`: Double,
    public var `AvgFetchTime`: Double,
    public var `AvgCursorSize`: Double,
    public var `AvgCursorUsed`: Double,
    public var `SQLFetchTime`: UInt,
    public var `SQLFetchCount`: UInt,
    public var `CurrentStmtCount`: UInt,
    public var `MaxOpenStmt`: UInt,
    public var `SumOpenStmt`: UInt,
    public var `CurrentConnectionCount`: UInt,
    public var `MaxConnectionsOpened`: UInt,
    public var `SumConnectionsOpened`: UInt,
    public var `SumConnectiontime`: UInt,
    public var `AvgTimeOpened`: Double,
    public var `ServerRndTrips`: UInt,
    public var `BuffersSent`: UInt,
    public var `BuffersRec`: UInt,
    public var `BytesSent`: UInt,
    public var `BytesRec`: UInt,
    public var `msExecutionTime`: UInt,
    public var `msNetWorkServerTime`: UInt,
)
public const val `SQLTEXT`: UInt = 35u;
public const val `SQLUNIQUEID`: UInt = 36u;
public const val `SQLVARBINARY`: UInt = 37u;
public const val `SQLVARCHAR`: UInt = 39u;
public typealias `SQLVARENUM` = Int;
public const val `SQLVARIANT`: UInt = 98u;
public const val `SQL_AA_FALSE`: Int = 0;
public const val `SQL_AA_TRUE`: Int = 1;
public const val `SQL_ACCESSIBLE_PROCEDURES`: UInt = 20u;
public const val `SQL_ACCESSIBLE_TABLES`: UInt = 19u;
public const val `SQL_ACCESS_MODE`: UInt = 101u;
public const val `SQL_ACTIVE_CONNECTIONS`: UInt = 0u;
public const val `SQL_ACTIVE_ENVIRONMENTS`: UInt = 116u;
public const val `SQL_ACTIVE_STATEMENTS`: UInt = 1u;
public const val `SQL_ADD`: UInt = 4u;
public const val `SQL_AD_ADD_CONSTRAINT_DEFERRABLE`: Int = 128;
public const val `SQL_AD_ADD_CONSTRAINT_INITIALLY_DEFERRED`: Int = 32;
public const val `SQL_AD_ADD_CONSTRAINT_INITIALLY_IMMEDIATE`: Int = 64;
public const val `SQL_AD_ADD_CONSTRAINT_NON_DEFERRABLE`: Int = 256;
public const val `SQL_AD_ADD_DOMAIN_CONSTRAINT`: Int = 2;
public const val `SQL_AD_ADD_DOMAIN_DEFAULT`: Int = 8;
public const val `SQL_AD_CONSTRAINT_NAME_DEFINITION`: Int = 1;
public const val `SQL_AD_DEFAULT`: Int = 1;
public const val `SQL_AD_DROP_DOMAIN_CONSTRAINT`: Int = 4;
public const val `SQL_AD_DROP_DOMAIN_DEFAULT`: Int = 16;
public const val `SQL_AD_OFF`: Int = 0;
public const val `SQL_AD_ON`: Int = 1;
public const val `SQL_AF_ALL`: Int = 64;
public const val `SQL_AF_AVG`: Int = 1;
public const val `SQL_AF_COUNT`: Int = 2;
public const val `SQL_AF_DISTINCT`: Int = 32;
public const val `SQL_AF_MAX`: Int = 4;
public const val `SQL_AF_MIN`: Int = 8;
public const val `SQL_AF_SUM`: Int = 16;
public const val `SQL_AGGREGATE_FUNCTIONS`: UInt = 169u;
// UNSUPPORTED Rust 4420:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SQL_ALL_CATALOGS: windows_sys::core::PCSTR = windows_sys::core::s!("%");

public const val `SQL_ALL_EXCEPT_LIKE`: UInt = 2u;
// UNSUPPORTED Rust 4422:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SQL_ALL_SCHEMAS: windows_sys::core::PCSTR = windows_sys::core::s!("%");

// UNSUPPORTED Rust 4423:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SQL_ALL_TABLE_TYPES: windows_sys::core::PCSTR = windows_sys::core::s!("%");

public const val `SQL_ALL_TYPES`: UInt = 0u;
public const val `SQL_ALTER_DOMAIN`: UInt = 117u;
public const val `SQL_ALTER_TABLE`: UInt = 86u;
public const val `SQL_AM_CONNECTION`: UInt = 1u;
public const val `SQL_AM_NONE`: UInt = 0u;
public const val `SQL_AM_STATEMENT`: UInt = 2u;
public const val `SQL_AO_DEFAULT`: Int = 0;
public const val `SQL_AO_OFF`: Int = 0;
public const val `SQL_AO_ON`: Int = 1;
public const val `SQL_APD_TYPE`: Int = -100;
public const val `SQL_API_ALL_FUNCTIONS`: UInt = 0u;
public const val `SQL_API_LOADBYORDINAL`: UInt = 199u;
public const val `SQL_API_ODBC3_ALL_FUNCTIONS`: UInt = 999u;
public const val `SQL_API_ODBC3_ALL_FUNCTIONS_SIZE`: UInt = 250u;
public const val `SQL_API_SQLALLOCCONNECT`: UInt = 1u;
public const val `SQL_API_SQLALLOCENV`: UInt = 2u;
public const val `SQL_API_SQLALLOCHANDLE`: UInt = 1001u;
public const val `SQL_API_SQLALLOCHANDLESTD`: UInt = 73u;
public const val `SQL_API_SQLALLOCSTMT`: UInt = 3u;
public const val `SQL_API_SQLBINDCOL`: UInt = 4u;
public const val `SQL_API_SQLBINDPARAM`: UInt = 1002u;
public const val `SQL_API_SQLBINDPARAMETER`: UInt = 72u;
public const val `SQL_API_SQLBROWSECONNECT`: UInt = 55u;
public const val `SQL_API_SQLBULKOPERATIONS`: UInt = 24u;
public const val `SQL_API_SQLCANCEL`: UInt = 5u;
public const val `SQL_API_SQLCANCELHANDLE`: UInt = 1550u;
public const val `SQL_API_SQLCLOSECURSOR`: UInt = 1003u;
public const val `SQL_API_SQLCOLATTRIBUTE`: UInt = 6u;
public const val `SQL_API_SQLCOLATTRIBUTES`: UInt = 6u;
public const val `SQL_API_SQLCOLUMNPRIVILEGES`: UInt = 56u;
public const val `SQL_API_SQLCOLUMNS`: UInt = 40u;
public const val `SQL_API_SQLCOMPLETEASYNC`: UInt = 1551u;
public const val `SQL_API_SQLCONNECT`: UInt = 7u;
public const val `SQL_API_SQLCOPYDESC`: UInt = 1004u;
public const val `SQL_API_SQLDATASOURCES`: UInt = 57u;
public const val `SQL_API_SQLDESCRIBECOL`: UInt = 8u;
public const val `SQL_API_SQLDESCRIBEPARAM`: UInt = 58u;
public const val `SQL_API_SQLDISCONNECT`: UInt = 9u;
public const val `SQL_API_SQLDRIVERCONNECT`: UInt = 41u;
public const val `SQL_API_SQLDRIVERS`: UInt = 71u;
public const val `SQL_API_SQLENDTRAN`: UInt = 1005u;
public const val `SQL_API_SQLERROR`: UInt = 10u;
public const val `SQL_API_SQLEXECDIRECT`: UInt = 11u;
public const val `SQL_API_SQLEXECUTE`: UInt = 12u;
public const val `SQL_API_SQLEXTENDEDFETCH`: UInt = 59u;
public const val `SQL_API_SQLFETCH`: UInt = 13u;
public const val `SQL_API_SQLFETCHSCROLL`: UInt = 1021u;
public const val `SQL_API_SQLFOREIGNKEYS`: UInt = 60u;
public const val `SQL_API_SQLFREECONNECT`: UInt = 14u;
public const val `SQL_API_SQLFREEENV`: UInt = 15u;
public const val `SQL_API_SQLFREEHANDLE`: UInt = 1006u;
public const val `SQL_API_SQLFREESTMT`: UInt = 16u;
public const val `SQL_API_SQLGETCONNECTATTR`: UInt = 1007u;
public const val `SQL_API_SQLGETCONNECTOPTION`: UInt = 42u;
public const val `SQL_API_SQLGETCURSORNAME`: UInt = 17u;
public const val `SQL_API_SQLGETDATA`: UInt = 43u;
public const val `SQL_API_SQLGETDESCFIELD`: UInt = 1008u;
public const val `SQL_API_SQLGETDESCREC`: UInt = 1009u;
public const val `SQL_API_SQLGETDIAGFIELD`: UInt = 1010u;
public const val `SQL_API_SQLGETDIAGREC`: UInt = 1011u;
public const val `SQL_API_SQLGETENVATTR`: UInt = 1012u;
public const val `SQL_API_SQLGETFUNCTIONS`: UInt = 44u;
public const val `SQL_API_SQLGETINFO`: UInt = 45u;
public const val `SQL_API_SQLGETSTMTATTR`: UInt = 1014u;
public const val `SQL_API_SQLGETSTMTOPTION`: UInt = 46u;
public const val `SQL_API_SQLGETTYPEINFO`: UInt = 47u;
public const val `SQL_API_SQLMORERESULTS`: UInt = 61u;
public const val `SQL_API_SQLNATIVESQL`: UInt = 62u;
public const val `SQL_API_SQLNUMPARAMS`: UInt = 63u;
public const val `SQL_API_SQLNUMRESULTCOLS`: UInt = 18u;
public const val `SQL_API_SQLPARAMDATA`: UInt = 48u;
public const val `SQL_API_SQLPARAMOPTIONS`: UInt = 64u;
public const val `SQL_API_SQLPREPARE`: UInt = 19u;
public const val `SQL_API_SQLPRIMARYKEYS`: UInt = 65u;
public const val `SQL_API_SQLPRIVATEDRIVERS`: UInt = 79u;
public const val `SQL_API_SQLPROCEDURECOLUMNS`: UInt = 66u;
public const val `SQL_API_SQLPROCEDURES`: UInt = 67u;
public const val `SQL_API_SQLPUTDATA`: UInt = 49u;
public const val `SQL_API_SQLROWCOUNT`: UInt = 20u;
public const val `SQL_API_SQLSETCONNECTATTR`: UInt = 1016u;
public const val `SQL_API_SQLSETCONNECTOPTION`: UInt = 50u;
public const val `SQL_API_SQLSETCURSORNAME`: UInt = 21u;
public const val `SQL_API_SQLSETDESCFIELD`: UInt = 1017u;
public const val `SQL_API_SQLSETDESCREC`: UInt = 1018u;
public const val `SQL_API_SQLSETENVATTR`: UInt = 1019u;
public const val `SQL_API_SQLSETPARAM`: UInt = 22u;
public const val `SQL_API_SQLSETPOS`: UInt = 68u;
public const val `SQL_API_SQLSETSCROLLOPTIONS`: UInt = 69u;
public const val `SQL_API_SQLSETSTMTATTR`: UInt = 1020u;
public const val `SQL_API_SQLSETSTMTOPTION`: UInt = 51u;
public const val `SQL_API_SQLSPECIALCOLUMNS`: UInt = 52u;
public const val `SQL_API_SQLSTATISTICS`: UInt = 53u;
public const val `SQL_API_SQLTABLEPRIVILEGES`: UInt = 70u;
public const val `SQL_API_SQLTABLES`: UInt = 54u;
public const val `SQL_API_SQLTRANSACT`: UInt = 23u;
public const val `SQL_ARD_TYPE`: Int = -99;
public const val `SQL_ASYNC_DBC_CAPABLE`: Int = 1;
public const val `SQL_ASYNC_DBC_ENABLE_DEFAULT`: UInt = 0u;
public const val `SQL_ASYNC_DBC_ENABLE_OFF`: UInt = 0u;
public const val `SQL_ASYNC_DBC_ENABLE_ON`: UInt = 1u;
public const val `SQL_ASYNC_DBC_FUNCTIONS`: UInt = 10023u;
public const val `SQL_ASYNC_DBC_NOT_CAPABLE`: Int = 0;
public const val `SQL_ASYNC_ENABLE`: UInt = 4u;
public const val `SQL_ASYNC_ENABLE_DEFAULT`: UInt = 0u;
public const val `SQL_ASYNC_ENABLE_OFF`: UInt = 0u;
public const val `SQL_ASYNC_ENABLE_ON`: UInt = 1u;
public const val `SQL_ASYNC_MODE`: UInt = 10021u;
public const val `SQL_ASYNC_NOTIFICATION`: UInt = 10025u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SQL_ASYNC_NOTIFICATION_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`BOOL`) -> Short>>>;
public const val `SQL_ASYNC_NOTIFICATION_CAPABLE`: Int = 1;
public const val `SQL_ASYNC_NOTIFICATION_NOT_CAPABLE`: Int = 0;
public const val `SQL_ATTR_ACCESS_MODE`: UInt = 101u;
public const val `SQL_ATTR_ANSI_APP`: UInt = 115u;
public const val `SQL_ATTR_APPLICATION_KEY`: UInt = 203u;
public const val `SQL_ATTR_APP_PARAM_DESC`: UInt = 10011u;
public const val `SQL_ATTR_APP_ROW_DESC`: UInt = 10010u;
public const val `SQL_ATTR_ASYNC_DBC_EVENT`: UInt = 119u;
public const val `SQL_ATTR_ASYNC_DBC_FUNCTIONS_ENABLE`: UInt = 117u;
public const val `SQL_ATTR_ASYNC_DBC_NOTIFICATION_CALLBACK`: UInt = 120u;
public const val `SQL_ATTR_ASYNC_DBC_NOTIFICATION_CONTEXT`: UInt = 121u;
public const val `SQL_ATTR_ASYNC_ENABLE`: UInt = 4u;
public const val `SQL_ATTR_ASYNC_STMT_EVENT`: UInt = 29u;
public const val `SQL_ATTR_ASYNC_STMT_NOTIFICATION_CALLBACK`: UInt = 30u;
public const val `SQL_ATTR_ASYNC_STMT_NOTIFICATION_CONTEXT`: UInt = 31u;
public const val `SQL_ATTR_AUTOCOMMIT`: UInt = 102u;
public const val `SQL_ATTR_AUTO_IPD`: UInt = 10001u;
public const val `SQL_ATTR_CONCURRENCY`: UInt = 7u;
public const val `SQL_ATTR_CONNECTION_DEAD`: UInt = 1209u;
public const val `SQL_ATTR_CONNECTION_POOLING`: UInt = 201u;
public const val `SQL_ATTR_CONNECTION_TIMEOUT`: UInt = 113u;
public const val `SQL_ATTR_CP_MATCH`: UInt = 202u;
public const val `SQL_ATTR_CURRENT_CATALOG`: UInt = 109u;
public const val `SQL_ATTR_CURSOR_SCROLLABLE`: Int = -1;
public const val `SQL_ATTR_CURSOR_SENSITIVITY`: Int = -2;
public const val `SQL_ATTR_CURSOR_TYPE`: UInt = 6u;
public const val `SQL_ATTR_DBC_INFO_TOKEN`: UInt = 118u;
public const val `SQL_ATTR_DISCONNECT_BEHAVIOR`: UInt = 114u;
public const val `SQL_ATTR_ENABLE_AUTO_IPD`: UInt = 15u;
public const val `SQL_ATTR_ENLIST_IN_DTC`: UInt = 1207u;
public const val `SQL_ATTR_ENLIST_IN_XA`: UInt = 1208u;
public const val `SQL_ATTR_FETCH_BOOKMARK_PTR`: UInt = 16u;
public const val `SQL_ATTR_IMP_PARAM_DESC`: UInt = 10013u;
public const val `SQL_ATTR_IMP_ROW_DESC`: UInt = 10012u;
public const val `SQL_ATTR_KEYSET_SIZE`: UInt = 8u;
public const val `SQL_ATTR_LOGIN_TIMEOUT`: UInt = 103u;
public const val `SQL_ATTR_MAX_LENGTH`: UInt = 3u;
public const val `SQL_ATTR_MAX_ROWS`: UInt = 1u;
public const val `SQL_ATTR_METADATA_ID`: UInt = 10014u;
public const val `SQL_ATTR_NOSCAN`: UInt = 2u;
public const val `SQL_ATTR_ODBC_CURSORS`: UInt = 110u;
public const val `SQL_ATTR_ODBC_VERSION`: UInt = 200u;
public const val `SQL_ATTR_OUTPUT_NTS`: UInt = 10001u;
public const val `SQL_ATTR_PACKET_SIZE`: UInt = 112u;
public const val `SQL_ATTR_PARAMSET_SIZE`: UInt = 22u;
public const val `SQL_ATTR_PARAMS_PROCESSED_PTR`: UInt = 21u;
public const val `SQL_ATTR_PARAM_BIND_OFFSET_PTR`: UInt = 17u;
public const val `SQL_ATTR_PARAM_BIND_TYPE`: UInt = 18u;
public const val `SQL_ATTR_PARAM_OPERATION_PTR`: UInt = 19u;
public const val `SQL_ATTR_PARAM_STATUS_PTR`: UInt = 20u;
public const val `SQL_ATTR_QUERY_TIMEOUT`: UInt = 0u;
public const val `SQL_ATTR_QUIET_MODE`: UInt = 111u;
public const val `SQL_ATTR_READONLY`: UInt = 0u;
public const val `SQL_ATTR_READWRITE_UNKNOWN`: UInt = 2u;
public const val `SQL_ATTR_RESET_CONNECTION`: UInt = 116u;
public const val `SQL_ATTR_RETRIEVE_DATA`: UInt = 11u;
public const val `SQL_ATTR_ROWS_FETCHED_PTR`: UInt = 26u;
public const val `SQL_ATTR_ROW_ARRAY_SIZE`: UInt = 27u;
public const val `SQL_ATTR_ROW_BIND_OFFSET_PTR`: UInt = 23u;
public const val `SQL_ATTR_ROW_BIND_TYPE`: UInt = 5u;
public const val `SQL_ATTR_ROW_NUMBER`: UInt = 14u;
public const val `SQL_ATTR_ROW_OPERATION_PTR`: UInt = 24u;
public const val `SQL_ATTR_ROW_STATUS_PTR`: UInt = 25u;
public const val `SQL_ATTR_SIMULATE_CURSOR`: UInt = 10u;
public const val `SQL_ATTR_TRACE`: UInt = 104u;
public const val `SQL_ATTR_TRACEFILE`: UInt = 105u;
public const val `SQL_ATTR_TRANSLATE_LIB`: UInt = 106u;
public const val `SQL_ATTR_TRANSLATE_OPTION`: UInt = 107u;
public const val `SQL_ATTR_TXN_ISOLATION`: UInt = 108u;
public const val `SQL_ATTR_USE_BOOKMARKS`: UInt = 12u;
public const val `SQL_ATTR_WRITE`: UInt = 1u;
public const val `SQL_AT_ADD_COLUMN`: Int = 1;
public const val `SQL_AT_ADD_COLUMN_COLLATION`: Int = 128;
public const val `SQL_AT_ADD_COLUMN_DEFAULT`: Int = 64;
public const val `SQL_AT_ADD_COLUMN_SINGLE`: Int = 32;
public const val `SQL_AT_ADD_CONSTRAINT`: Int = 8;
public const val `SQL_AT_ADD_TABLE_CONSTRAINT`: Int = 4096;
public const val `SQL_AT_CONSTRAINT_DEFERRABLE`: Int = 262144;
public const val `SQL_AT_CONSTRAINT_INITIALLY_DEFERRED`: Int = 65536;
public const val `SQL_AT_CONSTRAINT_INITIALLY_IMMEDIATE`: Int = 131072;
public const val `SQL_AT_CONSTRAINT_NAME_DEFINITION`: Int = 32768;
public const val `SQL_AT_CONSTRAINT_NON_DEFERRABLE`: Int = 524288;
public const val `SQL_AT_DROP_COLUMN`: Int = 2;
public const val `SQL_AT_DROP_COLUMN_CASCADE`: Int = 1024;
public const val `SQL_AT_DROP_COLUMN_DEFAULT`: Int = 512;
public const val `SQL_AT_DROP_COLUMN_RESTRICT`: Int = 2048;
public const val `SQL_AT_DROP_TABLE_CONSTRAINT_CASCADE`: Int = 8192;
public const val `SQL_AT_DROP_TABLE_CONSTRAINT_RESTRICT`: Int = 16384;
public const val `SQL_AT_SET_COLUMN_DEFAULT`: Int = 256;
public const val `SQL_AUTOCOMMIT`: UInt = 102u;
public const val `SQL_AUTOCOMMIT_DEFAULT`: UInt = 1u;
public const val `SQL_AUTOCOMMIT_OFF`: UInt = 0u;
public const val `SQL_AUTOCOMMIT_ON`: UInt = 1u;
public const val `SQL_BATCH_ROW_COUNT`: UInt = 120u;
public const val `SQL_BATCH_SUPPORT`: UInt = 121u;
public const val `SQL_BCP_DEFAULT`: Int = 0;
public const val `SQL_BCP_OFF`: Int = 0;
public const val `SQL_BCP_ON`: Int = 1;
public const val `SQL_BEST_ROWID`: UInt = 1u;
public const val `SQL_BIGINT`: Int = -5;
public const val `SQL_BINARY`: Int = -2;
public const val `SQL_BIND_BY_COLUMN`: UInt = 0u;
public const val `SQL_BIND_TYPE`: UInt = 5u;
public const val `SQL_BIND_TYPE_DEFAULT`: UInt = 0u;
public const val `SQL_BIT`: Int = -7;
public const val `SQL_BOOKMARK_PERSISTENCE`: UInt = 82u;
public const val `SQL_BP_CLOSE`: Int = 1;
public const val `SQL_BP_DELETE`: Int = 2;
public const val `SQL_BP_DROP`: Int = 4;
public const val `SQL_BP_OTHER_HSTMT`: Int = 32;
public const val `SQL_BP_SCROLL`: Int = 64;
public const val `SQL_BP_TRANSACTION`: Int = 8;
public const val `SQL_BP_UPDATE`: Int = 16;
public const val `SQL_BRC_EXPLICIT`: UInt = 2u;
public const val `SQL_BRC_PROCEDURES`: UInt = 1u;
public const val `SQL_BRC_ROLLED_UP`: UInt = 4u;
public const val `SQL_BS_ROW_COUNT_EXPLICIT`: Int = 2;
public const val `SQL_BS_ROW_COUNT_PROC`: Int = 8;
public const val `SQL_BS_SELECT_EXPLICIT`: Int = 1;
public const val `SQL_BS_SELECT_PROC`: Int = 4;
public const val `SQL_CA1_ABSOLUTE`: Int = 2;
public const val `SQL_CA1_BOOKMARK`: Int = 8;
public const val `SQL_CA1_BULK_ADD`: Int = 65536;
public const val `SQL_CA1_BULK_DELETE_BY_BOOKMARK`: Int = 262144;
public const val `SQL_CA1_BULK_FETCH_BY_BOOKMARK`: Int = 524288;
public const val `SQL_CA1_BULK_UPDATE_BY_BOOKMARK`: Int = 131072;
public const val `SQL_CA1_LOCK_EXCLUSIVE`: Int = 128;
public const val `SQL_CA1_LOCK_NO_CHANGE`: Int = 64;
public const val `SQL_CA1_LOCK_UNLOCK`: Int = 256;
public const val `SQL_CA1_NEXT`: Int = 1;
public const val `SQL_CA1_POSITIONED_DELETE`: Int = 16384;
public const val `SQL_CA1_POSITIONED_UPDATE`: Int = 8192;
public const val `SQL_CA1_POS_DELETE`: Int = 2048;
public const val `SQL_CA1_POS_POSITION`: Int = 512;
public const val `SQL_CA1_POS_REFRESH`: Int = 4096;
public const val `SQL_CA1_POS_UPDATE`: Int = 1024;
public const val `SQL_CA1_RELATIVE`: Int = 4;
public const val `SQL_CA1_SELECT_FOR_UPDATE`: Int = 32768;
public const val `SQL_CA2_CRC_APPROXIMATE`: Int = 8192;
public const val `SQL_CA2_CRC_EXACT`: Int = 4096;
public const val `SQL_CA2_LOCK_CONCURRENCY`: Int = 2;
public const val `SQL_CA2_MAX_ROWS_CATALOG`: Int = 2048;
public const val `SQL_CA2_MAX_ROWS_DELETE`: Int = 512;
public const val `SQL_CA2_MAX_ROWS_INSERT`: Int = 256;
public const val `SQL_CA2_MAX_ROWS_SELECT`: Int = 128;
public const val `SQL_CA2_MAX_ROWS_UPDATE`: Int = 1024;
public const val `SQL_CA2_OPT_ROWVER_CONCURRENCY`: Int = 4;
public const val `SQL_CA2_OPT_VALUES_CONCURRENCY`: Int = 8;
public const val `SQL_CA2_READ_ONLY_CONCURRENCY`: Int = 1;
public const val `SQL_CA2_SENSITIVITY_ADDITIONS`: Int = 16;
public const val `SQL_CA2_SENSITIVITY_DELETIONS`: Int = 32;
public const val `SQL_CA2_SENSITIVITY_UPDATES`: Int = 64;
public const val `SQL_CA2_SIMULATE_NON_UNIQUE`: Int = 16384;
public const val `SQL_CA2_SIMULATE_TRY_UNIQUE`: Int = 32768;
public const val `SQL_CA2_SIMULATE_UNIQUE`: Int = 65536;
public const val `SQL_CACHE_DATA_NO`: Int = 0;
public const val `SQL_CACHE_DATA_YES`: Int = 1;
public const val `SQL_CASCADE`: UInt = 0u;
public const val `SQL_CATALOG_LOCATION`: UInt = 114u;
public const val `SQL_CATALOG_NAME`: UInt = 10003u;
public const val `SQL_CATALOG_NAME_SEPARATOR`: UInt = 41u;
public const val `SQL_CATALOG_TERM`: UInt = 42u;
public const val `SQL_CATALOG_USAGE`: UInt = 92u;
public const val `SQL_CA_CONSTRAINT_DEFERRABLE`: Int = 64;
public const val `SQL_CA_CONSTRAINT_INITIALLY_DEFERRED`: Int = 16;
public const val `SQL_CA_CONSTRAINT_INITIALLY_IMMEDIATE`: Int = 32;
public const val `SQL_CA_CONSTRAINT_NON_DEFERRABLE`: Int = 128;
public const val `SQL_CA_CREATE_ASSERTION`: Int = 1;
public const val `SQL_CA_SS_BASE`: UInt = 1200u;
public const val `SQL_CA_SS_COLUMN_COLLATION`: UInt = 1214u;
public const val `SQL_CA_SS_COLUMN_HIDDEN`: UInt = 1211u;
public const val `SQL_CA_SS_COLUMN_ID`: UInt = 1208u;
public const val `SQL_CA_SS_COLUMN_KEY`: UInt = 1212u;
public const val `SQL_CA_SS_COLUMN_OP`: UInt = 1209u;
public const val `SQL_CA_SS_COLUMN_ORDER`: UInt = 1203u;
public const val `SQL_CA_SS_COLUMN_SIZE`: UInt = 1210u;
public const val `SQL_CA_SS_COLUMN_SSTYPE`: UInt = 1200u;
public const val `SQL_CA_SS_COLUMN_UTYPE`: UInt = 1201u;
public const val `SQL_CA_SS_COLUMN_VARYLEN`: UInt = 1204u;
public const val `SQL_CA_SS_COMPUTE_BYLIST`: UInt = 1207u;
public const val `SQL_CA_SS_COMPUTE_ID`: UInt = 1206u;
public const val `SQL_CA_SS_MAX_USED`: UInt = 1218u;
public const val `SQL_CA_SS_NUM_COMPUTES`: UInt = 1205u;
public const val `SQL_CA_SS_NUM_ORDERS`: UInt = 1202u;
public const val `SQL_CA_SS_VARIANT_SERVER_TYPE`: UInt = 1217u;
public const val `SQL_CA_SS_VARIANT_SQL_TYPE`: UInt = 1216u;
public const val `SQL_CA_SS_VARIANT_TYPE`: UInt = 1215u;
public const val `SQL_CB_CLOSE`: UInt = 1u;
public const val `SQL_CB_DELETE`: UInt = 0u;
public const val `SQL_CB_NON_NULL`: UInt = 1u;
public const val `SQL_CB_NULL`: UInt = 0u;
public const val `SQL_CB_PRESERVE`: UInt = 2u;
public const val `SQL_CCOL_CREATE_COLLATION`: Int = 1;
public const val `SQL_CCS_COLLATE_CLAUSE`: Int = 2;
public const val `SQL_CCS_CREATE_CHARACTER_SET`: Int = 1;
public const val `SQL_CCS_LIMITED_COLLATION`: Int = 4;
public const val `SQL_CC_CLOSE`: UInt = 1u;
public const val `SQL_CC_DELETE`: UInt = 0u;
public const val `SQL_CC_PRESERVE`: UInt = 2u;
public const val `SQL_CDO_COLLATION`: Int = 8;
public const val `SQL_CDO_CONSTRAINT`: Int = 4;
public const val `SQL_CDO_CONSTRAINT_DEFERRABLE`: Int = 128;
public const val `SQL_CDO_CONSTRAINT_INITIALLY_DEFERRED`: Int = 32;
public const val `SQL_CDO_CONSTRAINT_INITIALLY_IMMEDIATE`: Int = 64;
public const val `SQL_CDO_CONSTRAINT_NAME_DEFINITION`: Int = 16;
public const val `SQL_CDO_CONSTRAINT_NON_DEFERRABLE`: Int = 256;
public const val `SQL_CDO_CREATE_DOMAIN`: Int = 1;
public const val `SQL_CDO_DEFAULT`: Int = 2;
public const val `SQL_CD_FALSE`: Int = 0;
public const val `SQL_CD_TRUE`: Int = 1;
public const val `SQL_CHAR`: UInt = 1u;
public const val `SQL_CLOSE`: UInt = 0u;
public const val `SQL_CL_END`: UInt = 2u;
public const val `SQL_CL_START`: UInt = 1u;
public const val `SQL_CN_ANY`: UInt = 2u;
public const val `SQL_CN_DEFAULT`: Int = 1;
public const val `SQL_CN_DIFFERENT`: UInt = 1u;
public const val `SQL_CN_NONE`: UInt = 0u;
public const val `SQL_CN_OFF`: Int = 0;
public const val `SQL_CN_ON`: Int = 1;
public const val `SQL_CODE_DATE`: UInt = 1u;
public const val `SQL_CODE_DAY`: UInt = 3u;
public const val `SQL_CODE_DAY_TO_HOUR`: UInt = 8u;
public const val `SQL_CODE_DAY_TO_MINUTE`: UInt = 9u;
public const val `SQL_CODE_DAY_TO_SECOND`: UInt = 10u;
public const val `SQL_CODE_HOUR`: UInt = 4u;
public const val `SQL_CODE_HOUR_TO_MINUTE`: UInt = 11u;
public const val `SQL_CODE_HOUR_TO_SECOND`: UInt = 12u;
public const val `SQL_CODE_MINUTE`: UInt = 5u;
public const val `SQL_CODE_MINUTE_TO_SECOND`: UInt = 13u;
public const val `SQL_CODE_MONTH`: UInt = 2u;
public const val `SQL_CODE_SECOND`: UInt = 6u;
public const val `SQL_CODE_TIME`: UInt = 2u;
public const val `SQL_CODE_TIMESTAMP`: UInt = 3u;
public const val `SQL_CODE_YEAR`: UInt = 1u;
public const val `SQL_CODE_YEAR_TO_MONTH`: UInt = 7u;
public const val `SQL_COLATT_OPT_MAX`: UInt = 18u;
public const val `SQL_COLATT_OPT_MIN`: UInt = 0u;
public const val `SQL_COLLATION_SEQ`: UInt = 10004u;
public const val `SQL_COLUMN_ALIAS`: UInt = 87u;
public const val `SQL_COLUMN_AUTO_INCREMENT`: UInt = 11u;
public const val `SQL_COLUMN_CASE_SENSITIVE`: UInt = 12u;
public const val `SQL_COLUMN_COUNT`: UInt = 0u;
public const val `SQL_COLUMN_DISPLAY_SIZE`: UInt = 6u;
public const val `SQL_COLUMN_DRIVER_START`: UInt = 1000u;
public const val `SQL_COLUMN_IGNORE`: Int = -6;
public const val `SQL_COLUMN_LABEL`: UInt = 18u;
public const val `SQL_COLUMN_LENGTH`: UInt = 3u;
public const val `SQL_COLUMN_MONEY`: UInt = 9u;
public const val `SQL_COLUMN_NAME`: UInt = 1u;
public const val `SQL_COLUMN_NULLABLE`: UInt = 7u;
public const val `SQL_COLUMN_NUMBER_UNKNOWN`: Int = -2;
public const val `SQL_COLUMN_OWNER_NAME`: UInt = 16u;
public const val `SQL_COLUMN_PRECISION`: UInt = 4u;
public const val `SQL_COLUMN_QUALIFIER_NAME`: UInt = 17u;
public const val `SQL_COLUMN_SCALE`: UInt = 5u;
public const val `SQL_COLUMN_SEARCHABLE`: UInt = 13u;
public const val `SQL_COLUMN_TABLE_NAME`: UInt = 15u;
public const val `SQL_COLUMN_TYPE`: UInt = 2u;
public const val `SQL_COLUMN_TYPE_NAME`: UInt = 14u;
public const val `SQL_COLUMN_UNSIGNED`: UInt = 8u;
public const val `SQL_COLUMN_UPDATABLE`: UInt = 10u;
public const val `SQL_COMMIT`: UInt = 0u;
public const val `SQL_CONCAT_NULL_BEHAVIOR`: UInt = 22u;
public const val `SQL_CONCURRENCY`: UInt = 7u;
public const val `SQL_CONCUR_DEFAULT`: UInt = 1u;
public const val `SQL_CONCUR_LOCK`: UInt = 2u;
public const val `SQL_CONCUR_READ_ONLY`: UInt = 1u;
public const val `SQL_CONCUR_ROWVER`: UInt = 3u;
public const val `SQL_CONCUR_TIMESTAMP`: UInt = 3u;
public const val `SQL_CONCUR_VALUES`: UInt = 4u;
public const val `SQL_CONNECT_OPT_DRVR_START`: UInt = 1000u;
public const val `SQL_CONN_OPT_MAX`: UInt = 112u;
public const val `SQL_CONN_OPT_MIN`: UInt = 101u;
public const val `SQL_CONN_POOL_RATING_BEST`: UInt = 100u;
public const val `SQL_CONN_POOL_RATING_GOOD_ENOUGH`: UInt = 99u;
public const val `SQL_CONN_POOL_RATING_USELESS`: UInt = 0u;
public const val `SQL_CONVERT_BIGINT`: UInt = 53u;
public const val `SQL_CONVERT_BINARY`: UInt = 54u;
public const val `SQL_CONVERT_BIT`: UInt = 55u;
public const val `SQL_CONVERT_CHAR`: UInt = 56u;
public const val `SQL_CONVERT_DATE`: UInt = 57u;
public const val `SQL_CONVERT_DECIMAL`: UInt = 58u;
public const val `SQL_CONVERT_DOUBLE`: UInt = 59u;
public const val `SQL_CONVERT_FLOAT`: UInt = 60u;
public const val `SQL_CONVERT_FUNCTIONS`: UInt = 48u;
public const val `SQL_CONVERT_GUID`: UInt = 173u;
public const val `SQL_CONVERT_INTEGER`: UInt = 61u;
public const val `SQL_CONVERT_INTERVAL_DAY_TIME`: UInt = 123u;
public const val `SQL_CONVERT_INTERVAL_YEAR_MONTH`: UInt = 124u;
public const val `SQL_CONVERT_LONGVARBINARY`: UInt = 71u;
public const val `SQL_CONVERT_LONGVARCHAR`: UInt = 62u;
public const val `SQL_CONVERT_NUMERIC`: UInt = 63u;
public const val `SQL_CONVERT_REAL`: UInt = 64u;
public const val `SQL_CONVERT_SMALLINT`: UInt = 65u;
public const val `SQL_CONVERT_TIME`: UInt = 66u;
public const val `SQL_CONVERT_TIMESTAMP`: UInt = 67u;
public const val `SQL_CONVERT_TINYINT`: UInt = 68u;
public const val `SQL_CONVERT_VARBINARY`: UInt = 69u;
public const val `SQL_CONVERT_VARCHAR`: UInt = 70u;
public const val `SQL_CONVERT_WCHAR`: UInt = 122u;
public const val `SQL_CONVERT_WLONGVARCHAR`: UInt = 125u;
public const val `SQL_CONVERT_WVARCHAR`: UInt = 126u;
public const val `SQL_COPT_SS_ANSI_NPW`: UInt = 1218u;
public const val `SQL_COPT_SS_ANSI_OEM`: UInt = 1206u;
public const val `SQL_COPT_SS_ATTACHDBFILENAME`: UInt = 1221u;
public const val `SQL_COPT_SS_BASE`: UInt = 1200u;
public const val `SQL_COPT_SS_BASE_EX`: UInt = 1240u;
public const val `SQL_COPT_SS_BCP`: UInt = 1219u;
public const val `SQL_COPT_SS_BROWSE_CACHE_DATA`: UInt = 1245u;
public const val `SQL_COPT_SS_BROWSE_CONNECT`: UInt = 1241u;
public const val `SQL_COPT_SS_BROWSE_SERVER`: UInt = 1242u;
public const val `SQL_COPT_SS_CONCAT_NULL`: UInt = 1222u;
public const val `SQL_COPT_SS_CONNECTION_DEAD`: UInt = 1244u;
public const val `SQL_COPT_SS_ENCRYPT`: UInt = 1223u;
public const val `SQL_COPT_SS_EX_MAX_USED`: UInt = 1246u;
public const val `SQL_COPT_SS_FALLBACK_CONNECT`: UInt = 1210u;
public const val `SQL_COPT_SS_INTEGRATED_SECURITY`: UInt = 1203u;
public const val `SQL_COPT_SS_MAX_USED`: UInt = 1223u;
public const val `SQL_COPT_SS_PERF_DATA`: UInt = 1211u;
public const val `SQL_COPT_SS_PERF_DATA_LOG`: UInt = 1212u;
public const val `SQL_COPT_SS_PERF_DATA_LOG_NOW`: UInt = 1216u;
public const val `SQL_COPT_SS_PERF_QUERY`: UInt = 1215u;
public const val `SQL_COPT_SS_PERF_QUERY_INTERVAL`: UInt = 1213u;
public const val `SQL_COPT_SS_PERF_QUERY_LOG`: UInt = 1214u;
public const val `SQL_COPT_SS_PRESERVE_CURSORS`: UInt = 1204u;
public const val `SQL_COPT_SS_QUOTED_IDENT`: UInt = 1217u;
public const val `SQL_COPT_SS_REMOTE_PWD`: UInt = 1201u;
public const val `SQL_COPT_SS_RESET_CONNECTION`: UInt = 1246u;
public const val `SQL_COPT_SS_TRANSLATE`: UInt = 1220u;
public const val `SQL_COPT_SS_USER_DATA`: UInt = 1205u;
public const val `SQL_COPT_SS_USE_PROC_FOR_PREP`: UInt = 1202u;
public const val `SQL_COPT_SS_WARN_ON_CP_ERROR`: UInt = 1243u;
public const val `SQL_CORRELATION_NAME`: UInt = 74u;
public const val `SQL_CO_AF`: Int = 2;
public const val `SQL_CO_DEFAULT`: Int = 0;
public const val `SQL_CO_FFO`: Int = 1;
public const val `SQL_CO_FIREHOSE_AF`: Int = 4;
public const val `SQL_CO_OFF`: Int = 0;
public const val `SQL_CP_DEFAULT`: UInt = 0u;
public const val `SQL_CP_DRIVER_AWARE`: UInt = 3u;
public const val `SQL_CP_MATCH_DEFAULT`: UInt = 0u;
public const val `SQL_CP_OFF`: UInt = 0u;
public const val `SQL_CP_ONE_PER_DRIVER`: UInt = 1u;
public const val `SQL_CP_ONE_PER_HENV`: UInt = 2u;
public const val `SQL_CP_RELAXED_MATCH`: UInt = 1u;
public const val `SQL_CP_STRICT_MATCH`: UInt = 0u;
public const val `SQL_CREATE_ASSERTION`: UInt = 127u;
public const val `SQL_CREATE_CHARACTER_SET`: UInt = 128u;
public const val `SQL_CREATE_COLLATION`: UInt = 129u;
public const val `SQL_CREATE_DOMAIN`: UInt = 130u;
public const val `SQL_CREATE_SCHEMA`: UInt = 131u;
public const val `SQL_CREATE_TABLE`: UInt = 132u;
public const val `SQL_CREATE_TRANSLATION`: UInt = 133u;
public const val `SQL_CREATE_VIEW`: UInt = 134u;
public const val `SQL_CR_CLOSE`: UInt = 1u;
public const val `SQL_CR_DELETE`: UInt = 0u;
public const val `SQL_CR_PRESERVE`: UInt = 2u;
public const val `SQL_CS_AUTHORIZATION`: Int = 2;
public const val `SQL_CS_CREATE_SCHEMA`: Int = 1;
public const val `SQL_CS_DEFAULT_CHARACTER_SET`: Int = 4;
public const val `SQL_CTR_CREATE_TRANSLATION`: Int = 1;
public const val `SQL_CT_COLUMN_COLLATION`: Int = 2048;
public const val `SQL_CT_COLUMN_CONSTRAINT`: Int = 512;
public const val `SQL_CT_COLUMN_DEFAULT`: Int = 1024;
public const val `SQL_CT_COMMIT_DELETE`: Int = 4;
public const val `SQL_CT_COMMIT_PRESERVE`: Int = 2;
public const val `SQL_CT_CONSTRAINT_DEFERRABLE`: Int = 128;
public const val `SQL_CT_CONSTRAINT_INITIALLY_DEFERRED`: Int = 32;
public const val `SQL_CT_CONSTRAINT_INITIALLY_IMMEDIATE`: Int = 64;
public const val `SQL_CT_CONSTRAINT_NAME_DEFINITION`: Int = 8192;
public const val `SQL_CT_CONSTRAINT_NON_DEFERRABLE`: Int = 256;
public const val `SQL_CT_CREATE_TABLE`: Int = 1;
public const val `SQL_CT_GLOBAL_TEMPORARY`: Int = 8;
public const val `SQL_CT_LOCAL_TEMPORARY`: Int = 16;
public const val `SQL_CT_TABLE_CONSTRAINT`: Int = 4096;
public const val `SQL_CURRENT_QUALIFIER`: UInt = 109u;
public const val `SQL_CURSOR_COMMIT_BEHAVIOR`: UInt = 23u;
public const val `SQL_CURSOR_DYNAMIC`: UInt = 2u;
public const val `SQL_CURSOR_FAST_FORWARD_ONLY`: UInt = 8u;
public const val `SQL_CURSOR_FORWARD_ONLY`: UInt = 0u;
public const val `SQL_CURSOR_KEYSET_DRIVEN`: UInt = 1u;
public const val `SQL_CURSOR_ROLLBACK_BEHAVIOR`: UInt = 24u;
public const val `SQL_CURSOR_SENSITIVITY`: UInt = 10001u;
public const val `SQL_CURSOR_STATIC`: UInt = 3u;
public const val `SQL_CURSOR_TYPE`: UInt = 6u;
public const val `SQL_CURSOR_TYPE_DEFAULT`: UInt = 0u;
public const val `SQL_CUR_DEFAULT`: UInt = 2u;
public const val `SQL_CUR_USE_DRIVER`: UInt = 2u;
public const val `SQL_CUR_USE_IF_NEEDED`: UInt = 0u;
public const val `SQL_CUR_USE_ODBC`: UInt = 1u;
public const val `SQL_CU_DML_STATEMENTS`: Int = 1;
public const val `SQL_CU_INDEX_DEFINITION`: Int = 8;
public const val `SQL_CU_PRIVILEGE_DEFINITION`: Int = 16;
public const val `SQL_CU_PROCEDURE_INVOCATION`: Int = 2;
public const val `SQL_CU_TABLE_DEFINITION`: Int = 4;
public const val `SQL_CVT_BIGINT`: Int = 16384;
public const val `SQL_CVT_BINARY`: Int = 1024;
public const val `SQL_CVT_BIT`: Int = 4096;
public const val `SQL_CVT_CHAR`: Int = 1;
public const val `SQL_CVT_DATE`: Int = 32768;
public const val `SQL_CVT_DECIMAL`: Int = 4;
public const val `SQL_CVT_DOUBLE`: Int = 128;
public const val `SQL_CVT_FLOAT`: Int = 32;
public const val `SQL_CVT_GUID`: Int = 16777216;
public const val `SQL_CVT_INTEGER`: Int = 8;
public const val `SQL_CVT_INTERVAL_DAY_TIME`: Int = 1048576;
public const val `SQL_CVT_INTERVAL_YEAR_MONTH`: Int = 524288;
public const val `SQL_CVT_LONGVARBINARY`: Int = 262144;
public const val `SQL_CVT_LONGVARCHAR`: Int = 512;
public const val `SQL_CVT_NUMERIC`: Int = 2;
public const val `SQL_CVT_REAL`: Int = 64;
public const val `SQL_CVT_SMALLINT`: Int = 16;
public const val `SQL_CVT_TIME`: Int = 65536;
public const val `SQL_CVT_TIMESTAMP`: Int = 131072;
public const val `SQL_CVT_TINYINT`: Int = 8192;
public const val `SQL_CVT_VARBINARY`: Int = 2048;
public const val `SQL_CVT_VARCHAR`: Int = 256;
public const val `SQL_CVT_WCHAR`: Int = 2097152;
public const val `SQL_CVT_WLONGVARCHAR`: Int = 4194304;
public const val `SQL_CVT_WVARCHAR`: Int = 8388608;
public const val `SQL_CV_CASCADED`: Int = 4;
public const val `SQL_CV_CHECK_OPTION`: Int = 2;
public const val `SQL_CV_CREATE_VIEW`: Int = 1;
public const val `SQL_CV_LOCAL`: Int = 8;
public const val `SQL_C_BINARY`: Int = -2;
public const val `SQL_C_BIT`: Int = -7;
public const val `SQL_C_CHAR`: UInt = 1u;
public const val `SQL_C_DATE`: UInt = 9u;
public const val `SQL_C_DEFAULT`: UInt = 99u;
public const val `SQL_C_DOUBLE`: UInt = 8u;
public const val `SQL_C_FLOAT`: UInt = 7u;
public const val `SQL_C_GUID`: Int = -11;
public const val `SQL_C_INTERVAL_DAY`: Int = -83;
public const val `SQL_C_INTERVAL_DAY_TO_HOUR`: Int = -87;
public const val `SQL_C_INTERVAL_DAY_TO_MINUTE`: Int = -88;
public const val `SQL_C_INTERVAL_DAY_TO_SECOND`: Int = -89;
public const val `SQL_C_INTERVAL_HOUR`: Int = -84;
public const val `SQL_C_INTERVAL_HOUR_TO_MINUTE`: Int = -90;
public const val `SQL_C_INTERVAL_HOUR_TO_SECOND`: Int = -91;
public const val `SQL_C_INTERVAL_MINUTE`: Int = -85;
public const val `SQL_C_INTERVAL_MINUTE_TO_SECOND`: Int = -92;
public const val `SQL_C_INTERVAL_MONTH`: Int = -81;
public const val `SQL_C_INTERVAL_SECOND`: Int = -86;
public const val `SQL_C_INTERVAL_YEAR`: Int = -80;
public const val `SQL_C_INTERVAL_YEAR_TO_MONTH`: Int = -82;
public const val `SQL_C_LONG`: UInt = 4u;
public const val `SQL_C_NUMERIC`: UInt = 2u;
public const val `SQL_C_SHORT`: UInt = 5u;
public const val `SQL_C_TCHAR`: Int = -8;
public const val `SQL_C_TIME`: UInt = 10u;
public const val `SQL_C_TIMESTAMP`: UInt = 11u;
public const val `SQL_C_TINYINT`: Int = -6;
public const val `SQL_C_TYPE_DATE`: UInt = 91u;
public const val `SQL_C_TYPE_TIME`: UInt = 92u;
public const val `SQL_C_TYPE_TIMESTAMP`: UInt = 93u;
public const val `SQL_C_VARBOOKMARK`: Int = -2;
public const val `SQL_C_WCHAR`: Int = -8;
public const val `SQL_DATABASE_NAME`: UInt = 16u;
public const val `SQL_DATA_AT_EXEC`: Int = -2;
public const val `SQL_DATA_SOURCE_NAME`: UInt = 2u;
public const val `SQL_DATA_SOURCE_READ_ONLY`: UInt = 25u;
public const val `SQL_DATE`: UInt = 9u;
public const val `SQL_DATETIME`: UInt = 9u;
public const val `SQL_DATETIME_LITERALS`: UInt = 119u;
public const val `SQL_DATE_LEN`: UInt = 10u;
public const val `SQL_DAY`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SQL_DAY_SECOND_STRUCT` (
    public var `day`: UInt,
    public var `hour`: UInt,
    public var `minute`: UInt,
    public var `second`: UInt,
    public var `fraction`: UInt,
)
public const val `SQL_DAY_TO_HOUR`: UInt = 8u;
public const val `SQL_DAY_TO_MINUTE`: UInt = 9u;
public const val `SQL_DAY_TO_SECOND`: UInt = 10u;
public const val `SQL_DA_DROP_ASSERTION`: Int = 1;
public const val `SQL_DBMS_NAME`: UInt = 17u;
public const val `SQL_DBMS_VER`: UInt = 18u;
public const val `SQL_DB_DEFAULT`: UInt = 0u;
public const val `SQL_DB_DISCONNECT`: UInt = 1u;
public const val `SQL_DB_RETURN_TO_POOL`: UInt = 0u;
public const val `SQL_DCS_DROP_CHARACTER_SET`: Int = 1;
public const val `SQL_DC_DROP_COLLATION`: Int = 1;
public const val `SQL_DDL_INDEX`: UInt = 170u;
public const val `SQL_DD_CASCADE`: Int = 4;
public const val `SQL_DD_DROP_DOMAIN`: Int = 1;
public const val `SQL_DD_RESTRICT`: Int = 2;
public const val `SQL_DECIMAL`: UInt = 3u;
public const val `SQL_DEFAULT`: UInt = 99u;
public const val `SQL_DEFAULT_PARAM`: Int = -5;
public const val `SQL_DEFAULT_TXN_ISOLATION`: UInt = 26u;
public const val `SQL_DELETE`: UInt = 3u;
public const val `SQL_DELETE_BY_BOOKMARK`: UInt = 6u;
public const val `SQL_DESCRIBE_PARAMETER`: UInt = 10002u;
public const val `SQL_DESC_ALLOC_AUTO`: UInt = 1u;
public const val `SQL_DESC_ALLOC_TYPE`: UInt = 1099u;
public const val `SQL_DESC_ALLOC_USER`: UInt = 2u;
public const val `SQL_DESC_ARRAY_SIZE`: UInt = 20u;
public const val `SQL_DESC_ARRAY_STATUS_PTR`: UInt = 21u;
public const val `SQL_DESC_BASE_COLUMN_NAME`: UInt = 22u;
public const val `SQL_DESC_BASE_TABLE_NAME`: UInt = 23u;
public const val `SQL_DESC_BIND_OFFSET_PTR`: UInt = 24u;
public const val `SQL_DESC_BIND_TYPE`: UInt = 25u;
public const val `SQL_DESC_COUNT`: UInt = 1001u;
public const val `SQL_DESC_DATA_PTR`: UInt = 1010u;
public const val `SQL_DESC_DATETIME_INTERVAL_CODE`: UInt = 1007u;
public const val `SQL_DESC_DATETIME_INTERVAL_PRECISION`: UInt = 26u;
public const val `SQL_DESC_INDICATOR_PTR`: UInt = 1009u;
public const val `SQL_DESC_LENGTH`: UInt = 1003u;
public const val `SQL_DESC_LITERAL_PREFIX`: UInt = 27u;
public const val `SQL_DESC_LITERAL_SUFFIX`: UInt = 28u;
public const val `SQL_DESC_LOCAL_TYPE_NAME`: UInt = 29u;
public const val `SQL_DESC_MAXIMUM_SCALE`: UInt = 30u;
public const val `SQL_DESC_MINIMUM_SCALE`: UInt = 31u;
public const val `SQL_DESC_NAME`: UInt = 1011u;
public const val `SQL_DESC_NULLABLE`: UInt = 1008u;
public const val `SQL_DESC_NUM_PREC_RADIX`: UInt = 32u;
public const val `SQL_DESC_OCTET_LENGTH`: UInt = 1013u;
public const val `SQL_DESC_OCTET_LENGTH_PTR`: UInt = 1004u;
public const val `SQL_DESC_PARAMETER_TYPE`: UInt = 33u;
public const val `SQL_DESC_PRECISION`: UInt = 1005u;
public const val `SQL_DESC_ROWS_PROCESSED_PTR`: UInt = 34u;
public const val `SQL_DESC_ROWVER`: UInt = 35u;
public const val `SQL_DESC_SCALE`: UInt = 1006u;
public const val `SQL_DESC_TYPE`: UInt = 1002u;
public const val `SQL_DESC_UNNAMED`: UInt = 1012u;
public const val `SQL_DIAG_ALTER_DOMAIN`: UInt = 3u;
public const val `SQL_DIAG_ALTER_TABLE`: UInt = 4u;
public const val `SQL_DIAG_CALL`: UInt = 7u;
public const val `SQL_DIAG_CLASS_ORIGIN`: UInt = 8u;
public const val `SQL_DIAG_COLUMN_NUMBER`: Int = -1247;
public const val `SQL_DIAG_CONNECTION_NAME`: UInt = 10u;
public const val `SQL_DIAG_CREATE_ASSERTION`: UInt = 6u;
public const val `SQL_DIAG_CREATE_CHARACTER_SET`: UInt = 8u;
public const val `SQL_DIAG_CREATE_COLLATION`: UInt = 10u;
public const val `SQL_DIAG_CREATE_DOMAIN`: UInt = 23u;
public const val `SQL_DIAG_CREATE_INDEX`: Int = -1;
public const val `SQL_DIAG_CREATE_SCHEMA`: UInt = 64u;
public const val `SQL_DIAG_CREATE_TABLE`: UInt = 77u;
public const val `SQL_DIAG_CREATE_TRANSLATION`: UInt = 79u;
public const val `SQL_DIAG_CREATE_VIEW`: UInt = 84u;
public const val `SQL_DIAG_CURSOR_ROW_COUNT`: Int = -1249;
public const val `SQL_DIAG_DELETE_WHERE`: UInt = 19u;
public const val `SQL_DIAG_DFC_SS_ALTER_DATABASE`: Int = -200;
public const val `SQL_DIAG_DFC_SS_BASE`: Int = -200;
public const val `SQL_DIAG_DFC_SS_CHECKPOINT`: Int = -201;
public const val `SQL_DIAG_DFC_SS_CONDITION`: Int = -202;
public const val `SQL_DIAG_DFC_SS_CREATE_DATABASE`: Int = -203;
public const val `SQL_DIAG_DFC_SS_CREATE_DEFAULT`: Int = -204;
public const val `SQL_DIAG_DFC_SS_CREATE_PROCEDURE`: Int = -205;
public const val `SQL_DIAG_DFC_SS_CREATE_RULE`: Int = -206;
public const val `SQL_DIAG_DFC_SS_CREATE_TRIGGER`: Int = -207;
public const val `SQL_DIAG_DFC_SS_CURSOR_CLOSE`: Int = -211;
public const val `SQL_DIAG_DFC_SS_CURSOR_DECLARE`: Int = -208;
public const val `SQL_DIAG_DFC_SS_CURSOR_FETCH`: Int = -210;
public const val `SQL_DIAG_DFC_SS_CURSOR_OPEN`: Int = -209;
public const val `SQL_DIAG_DFC_SS_DBCC`: Int = -213;
public const val `SQL_DIAG_DFC_SS_DEALLOCATE_CURSOR`: Int = -212;
public const val `SQL_DIAG_DFC_SS_DENY`: Int = -254;
public const val `SQL_DIAG_DFC_SS_DISK`: Int = -214;
public const val `SQL_DIAG_DFC_SS_DROP_DATABASE`: Int = -215;
public const val `SQL_DIAG_DFC_SS_DROP_DEFAULT`: Int = -216;
public const val `SQL_DIAG_DFC_SS_DROP_PROCEDURE`: Int = -217;
public const val `SQL_DIAG_DFC_SS_DROP_RULE`: Int = -218;
public const val `SQL_DIAG_DFC_SS_DROP_TRIGGER`: Int = -219;
public const val `SQL_DIAG_DFC_SS_DUMP_DATABASE`: Int = -220;
public const val `SQL_DIAG_DFC_SS_DUMP_TABLE`: Int = -221;
public const val `SQL_DIAG_DFC_SS_DUMP_TRANSACTION`: Int = -222;
public const val `SQL_DIAG_DFC_SS_GOTO`: Int = -223;
public const val `SQL_DIAG_DFC_SS_INSERT_BULK`: Int = -224;
public const val `SQL_DIAG_DFC_SS_KILL`: Int = -225;
public const val `SQL_DIAG_DFC_SS_LOAD_DATABASE`: Int = -226;
public const val `SQL_DIAG_DFC_SS_LOAD_HEADERONLY`: Int = -227;
public const val `SQL_DIAG_DFC_SS_LOAD_TABLE`: Int = -228;
public const val `SQL_DIAG_DFC_SS_LOAD_TRANSACTION`: Int = -229;
public const val `SQL_DIAG_DFC_SS_PRINT`: Int = -230;
public const val `SQL_DIAG_DFC_SS_RAISERROR`: Int = -231;
public const val `SQL_DIAG_DFC_SS_READTEXT`: Int = -232;
public const val `SQL_DIAG_DFC_SS_RECONFIGURE`: Int = -233;
public const val `SQL_DIAG_DFC_SS_RETURN`: Int = -234;
public const val `SQL_DIAG_DFC_SS_SELECT_INTO`: Int = -235;
public const val `SQL_DIAG_DFC_SS_SET`: Int = -236;
public const val `SQL_DIAG_DFC_SS_SETUSER`: Int = -241;
public const val `SQL_DIAG_DFC_SS_SET_IDENTITY_INSERT`: Int = -237;
public const val `SQL_DIAG_DFC_SS_SET_ROW_COUNT`: Int = -238;
public const val `SQL_DIAG_DFC_SS_SET_STATISTICS`: Int = -239;
public const val `SQL_DIAG_DFC_SS_SET_TEXTSIZE`: Int = -240;
public const val `SQL_DIAG_DFC_SS_SET_XCTLVL`: Int = -255;
public const val `SQL_DIAG_DFC_SS_SHUTDOWN`: Int = -242;
public const val `SQL_DIAG_DFC_SS_TRANS_BEGIN`: Int = -243;
public const val `SQL_DIAG_DFC_SS_TRANS_COMMIT`: Int = -244;
public const val `SQL_DIAG_DFC_SS_TRANS_PREPARE`: Int = -245;
public const val `SQL_DIAG_DFC_SS_TRANS_ROLLBACK`: Int = -246;
public const val `SQL_DIAG_DFC_SS_TRANS_SAVE`: Int = -247;
public const val `SQL_DIAG_DFC_SS_TRUNCATE_TABLE`: Int = -248;
public const val `SQL_DIAG_DFC_SS_UPDATETEXT`: Int = -250;
public const val `SQL_DIAG_DFC_SS_UPDATE_STATISTICS`: Int = -249;
public const val `SQL_DIAG_DFC_SS_USE`: Int = -251;
public const val `SQL_DIAG_DFC_SS_WAITFOR`: Int = -252;
public const val `SQL_DIAG_DFC_SS_WRITETEXT`: Int = -253;
public const val `SQL_DIAG_DROP_ASSERTION`: UInt = 24u;
public const val `SQL_DIAG_DROP_CHARACTER_SET`: UInt = 25u;
public const val `SQL_DIAG_DROP_COLLATION`: UInt = 26u;
public const val `SQL_DIAG_DROP_DOMAIN`: UInt = 27u;
public const val `SQL_DIAG_DROP_INDEX`: Int = -2;
public const val `SQL_DIAG_DROP_SCHEMA`: UInt = 31u;
public const val `SQL_DIAG_DROP_TABLE`: UInt = 32u;
public const val `SQL_DIAG_DROP_TRANSLATION`: UInt = 33u;
public const val `SQL_DIAG_DROP_VIEW`: UInt = 36u;
public const val `SQL_DIAG_DYNAMIC_DELETE_CURSOR`: UInt = 38u;
public const val `SQL_DIAG_DYNAMIC_FUNCTION`: UInt = 7u;
public const val `SQL_DIAG_DYNAMIC_FUNCTION_CODE`: UInt = 12u;
public const val `SQL_DIAG_DYNAMIC_UPDATE_CURSOR`: UInt = 81u;
public const val `SQL_DIAG_GRANT`: UInt = 48u;
public const val `SQL_DIAG_INSERT`: UInt = 50u;
public const val `SQL_DIAG_MESSAGE_TEXT`: UInt = 6u;
public const val `SQL_DIAG_NATIVE`: UInt = 5u;
public const val `SQL_DIAG_NUMBER`: UInt = 2u;
public const val `SQL_DIAG_RETURNCODE`: UInt = 1u;
public const val `SQL_DIAG_REVOKE`: UInt = 59u;
public const val `SQL_DIAG_ROW_COUNT`: UInt = 3u;
public const val `SQL_DIAG_ROW_NUMBER`: Int = -1248;
public const val `SQL_DIAG_SELECT_CURSOR`: UInt = 85u;
public const val `SQL_DIAG_SERVER_NAME`: UInt = 11u;
public const val `SQL_DIAG_SQLSTATE`: UInt = 4u;
public const val `SQL_DIAG_SS_BASE`: Int = -1150;
public const val `SQL_DIAG_SS_LINE`: Int = -1154;
public const val `SQL_DIAG_SS_MSGSTATE`: Int = -1150;
public const val `SQL_DIAG_SS_PROCNAME`: Int = -1153;
public const val `SQL_DIAG_SS_SEVERITY`: Int = -1151;
public const val `SQL_DIAG_SS_SRVNAME`: Int = -1152;
public const val `SQL_DIAG_SUBCLASS_ORIGIN`: UInt = 9u;
public const val `SQL_DIAG_UNKNOWN_STATEMENT`: UInt = 0u;
public const val `SQL_DIAG_UPDATE_WHERE`: UInt = 82u;
public const val `SQL_DI_CREATE_INDEX`: Int = 1;
public const val `SQL_DI_DROP_INDEX`: Int = 2;
public const val `SQL_DL_SQL92_DATE`: Int = 1;
public const val `SQL_DL_SQL92_INTERVAL_DAY`: Int = 32;
public const val `SQL_DL_SQL92_INTERVAL_DAY_TO_HOUR`: Int = 1024;
public const val `SQL_DL_SQL92_INTERVAL_DAY_TO_MINUTE`: Int = 2048;
public const val `SQL_DL_SQL92_INTERVAL_DAY_TO_SECOND`: Int = 4096;
public const val `SQL_DL_SQL92_INTERVAL_HOUR`: Int = 64;
public const val `SQL_DL_SQL92_INTERVAL_HOUR_TO_MINUTE`: Int = 8192;
public const val `SQL_DL_SQL92_INTERVAL_HOUR_TO_SECOND`: Int = 16384;
public const val `SQL_DL_SQL92_INTERVAL_MINUTE`: Int = 128;
public const val `SQL_DL_SQL92_INTERVAL_MINUTE_TO_SECOND`: Int = 32768;
public const val `SQL_DL_SQL92_INTERVAL_MONTH`: Int = 16;
public const val `SQL_DL_SQL92_INTERVAL_SECOND`: Int = 256;
public const val `SQL_DL_SQL92_INTERVAL_YEAR`: Int = 8;
public const val `SQL_DL_SQL92_INTERVAL_YEAR_TO_MONTH`: Int = 512;
public const val `SQL_DL_SQL92_TIME`: Int = 2;
public const val `SQL_DL_SQL92_TIMESTAMP`: Int = 4;
public const val `SQL_DM_VER`: UInt = 171u;
public const val `SQL_DOUBLE`: UInt = 8u;
public const val `SQL_DP_OFF`: Int = 0;
public const val `SQL_DP_ON`: Int = 1;
public const val `SQL_DRIVER_AWARE_POOLING_CAPABLE`: Int = 1;
public const val `SQL_DRIVER_AWARE_POOLING_NOT_CAPABLE`: Int = 0;
public const val `SQL_DRIVER_AWARE_POOLING_SUPPORTED`: UInt = 10024u;
public const val `SQL_DRIVER_COMPLETE`: UInt = 1u;
public const val `SQL_DRIVER_COMPLETE_REQUIRED`: UInt = 3u;
public const val `SQL_DRIVER_CONN_ATTR_BASE`: UInt = 16384u;
public const val `SQL_DRIVER_C_TYPE_BASE`: UInt = 16384u;
public const val `SQL_DRIVER_DESC_FIELD_BASE`: UInt = 16384u;
public const val `SQL_DRIVER_DIAG_FIELD_BASE`: UInt = 16384u;
public const val `SQL_DRIVER_HDBC`: UInt = 3u;
public const val `SQL_DRIVER_HDESC`: UInt = 135u;
public const val `SQL_DRIVER_HENV`: UInt = 4u;
public const val `SQL_DRIVER_HLIB`: UInt = 76u;
public const val `SQL_DRIVER_HSTMT`: UInt = 5u;
public const val `SQL_DRIVER_INFO_TYPE_BASE`: UInt = 16384u;
public const val `SQL_DRIVER_NAME`: UInt = 6u;
public const val `SQL_DRIVER_NOPROMPT`: UInt = 0u;
public const val `SQL_DRIVER_ODBC_VER`: UInt = 77u;
public const val `SQL_DRIVER_PROMPT`: UInt = 2u;
public const val `SQL_DRIVER_SQL_TYPE_BASE`: UInt = 16384u;
public const val `SQL_DRIVER_STMT_ATTR_BASE`: UInt = 16384u;
public const val `SQL_DRIVER_VER`: UInt = 7u;
public const val `SQL_DROP`: UInt = 1u;
public const val `SQL_DROP_ASSERTION`: UInt = 136u;
public const val `SQL_DROP_CHARACTER_SET`: UInt = 137u;
public const val `SQL_DROP_COLLATION`: UInt = 138u;
public const val `SQL_DROP_DOMAIN`: UInt = 139u;
public const val `SQL_DROP_SCHEMA`: UInt = 140u;
public const val `SQL_DROP_TABLE`: UInt = 141u;
public const val `SQL_DROP_TRANSLATION`: UInt = 142u;
public const val `SQL_DROP_VIEW`: UInt = 143u;
public const val `SQL_DS_CASCADE`: Int = 4;
public const val `SQL_DS_DROP_SCHEMA`: Int = 1;
public const val `SQL_DS_RESTRICT`: Int = 2;
public const val `SQL_DTC_DONE`: Int = 0;
public const val `SQL_DTC_ENLIST_EXPENSIVE`: Int = 1;
public const val `SQL_DTC_TRANSITION_COST`: UInt = 1750u;
public const val `SQL_DTC_UNENLIST_EXPENSIVE`: Int = 2;
public const val `SQL_DTR_DROP_TRANSLATION`: Int = 1;
public const val `SQL_DT_CASCADE`: Int = 4;
public const val `SQL_DT_DROP_TABLE`: Int = 1;
public const val `SQL_DT_RESTRICT`: Int = 2;
public const val `SQL_DV_CASCADE`: Int = 4;
public const val `SQL_DV_DROP_VIEW`: Int = 1;
public const val `SQL_DV_RESTRICT`: Int = 2;
public const val `SQL_DYNAMIC_CURSOR_ATTRIBUTES1`: UInt = 144u;
public const val `SQL_DYNAMIC_CURSOR_ATTRIBUTES2`: UInt = 145u;
public const val `SQL_ENSURE`: UInt = 1u;
public const val `SQL_ENTIRE_ROWSET`: UInt = 0u;
public const val `SQL_EN_OFF`: Int = 0;
public const val `SQL_EN_ON`: Int = 1;
public const val `SQL_ERROR`: Int = -1;
public const val `SQL_EXPRESSIONS_IN_ORDERBY`: UInt = 27u;
public const val `SQL_EXT_API_LAST`: UInt = 72u;
public const val `SQL_EXT_API_START`: UInt = 40u;
public const val `SQL_FALSE`: UInt = 0u;
public const val `SQL_FAST_CONNECT`: UInt = 1200u;
public const val `SQL_FB_DEFAULT`: Int = 0;
public const val `SQL_FB_OFF`: Int = 0;
public const val `SQL_FB_ON`: Int = 1;
public const val `SQL_FC_DEFAULT`: Int = 0;
public const val `SQL_FC_OFF`: Int = 0;
public const val `SQL_FC_ON`: Int = 1;
public const val `SQL_FD_FETCH_ABSOLUTE`: Int = 16;
public const val `SQL_FD_FETCH_BOOKMARK`: Int = 128;
public const val `SQL_FD_FETCH_FIRST`: Int = 2;
public const val `SQL_FD_FETCH_LAST`: Int = 4;
public const val `SQL_FD_FETCH_NEXT`: Int = 1;
public const val `SQL_FD_FETCH_PREV`: Int = 8;
public const val `SQL_FD_FETCH_PRIOR`: Int = 8;
public const val `SQL_FD_FETCH_RELATIVE`: Int = 32;
public const val `SQL_FD_FETCH_RESUME`: Int = 64;
public const val `SQL_FETCH_ABSOLUTE`: UInt = 5u;
public const val `SQL_FETCH_BOOKMARK`: UInt = 8u;
public const val `SQL_FETCH_BY_BOOKMARK`: UInt = 7u;
public const val `SQL_FETCH_DIRECTION`: UInt = 8u;
public const val `SQL_FETCH_FIRST`: UInt = 2u;
public const val `SQL_FETCH_FIRST_SYSTEM`: UInt = 32u;
public const val `SQL_FETCH_FIRST_USER`: UInt = 31u;
public const val `SQL_FETCH_LAST`: UInt = 3u;
public const val `SQL_FETCH_NEXT`: UInt = 1u;
public const val `SQL_FETCH_PREV`: UInt = 4u;
public const val `SQL_FETCH_PRIOR`: UInt = 4u;
public const val `SQL_FETCH_RELATIVE`: UInt = 6u;
public const val `SQL_FETCH_RESUME`: UInt = 7u;
public const val `SQL_FILE_CATALOG`: UInt = 2u;
public const val `SQL_FILE_NOT_SUPPORTED`: UInt = 0u;
public const val `SQL_FILE_QUALIFIER`: UInt = 2u;
public const val `SQL_FILE_TABLE`: UInt = 1u;
public const val `SQL_FILE_USAGE`: UInt = 84u;
public const val `SQL_FLOAT`: UInt = 6u;
public const val `SQL_FN_CVT_CAST`: Int = 2;
public const val `SQL_FN_CVT_CONVERT`: Int = 1;
public const val `SQL_FN_NUM_ABS`: Int = 1;
public const val `SQL_FN_NUM_ACOS`: Int = 2;
public const val `SQL_FN_NUM_ASIN`: Int = 4;
public const val `SQL_FN_NUM_ATAN`: Int = 8;
public const val `SQL_FN_NUM_ATAN2`: Int = 16;
public const val `SQL_FN_NUM_CEILING`: Int = 32;
public const val `SQL_FN_NUM_COS`: Int = 64;
public const val `SQL_FN_NUM_COT`: Int = 128;
public const val `SQL_FN_NUM_DEGREES`: Int = 262144;
public const val `SQL_FN_NUM_EXP`: Int = 256;
public const val `SQL_FN_NUM_FLOOR`: Int = 512;
public const val `SQL_FN_NUM_LOG`: Int = 1024;
public const val `SQL_FN_NUM_LOG10`: Int = 524288;
public const val `SQL_FN_NUM_MOD`: Int = 2048;
public const val `SQL_FN_NUM_PI`: Int = 65536;
public const val `SQL_FN_NUM_POWER`: Int = 1048576;
public const val `SQL_FN_NUM_RADIANS`: Int = 2097152;
public const val `SQL_FN_NUM_RAND`: Int = 131072;
public const val `SQL_FN_NUM_ROUND`: Int = 4194304;
public const val `SQL_FN_NUM_SIGN`: Int = 4096;
public const val `SQL_FN_NUM_SIN`: Int = 8192;
public const val `SQL_FN_NUM_SQRT`: Int = 16384;
public const val `SQL_FN_NUM_TAN`: Int = 32768;
public const val `SQL_FN_NUM_TRUNCATE`: Int = 8388608;
public const val `SQL_FN_STR_ASCII`: Int = 8192;
public const val `SQL_FN_STR_BIT_LENGTH`: Int = 524288;
public const val `SQL_FN_STR_CHAR`: Int = 16384;
public const val `SQL_FN_STR_CHARACTER_LENGTH`: Int = 2097152;
public const val `SQL_FN_STR_CHAR_LENGTH`: Int = 1048576;
public const val `SQL_FN_STR_CONCAT`: Int = 1;
public const val `SQL_FN_STR_DIFFERENCE`: Int = 32768;
public const val `SQL_FN_STR_INSERT`: Int = 2;
public const val `SQL_FN_STR_LCASE`: Int = 64;
public const val `SQL_FN_STR_LEFT`: Int = 4;
public const val `SQL_FN_STR_LENGTH`: Int = 16;
public const val `SQL_FN_STR_LOCATE`: Int = 32;
public const val `SQL_FN_STR_LOCATE_2`: Int = 65536;
public const val `SQL_FN_STR_LTRIM`: Int = 8;
public const val `SQL_FN_STR_OCTET_LENGTH`: Int = 4194304;
public const val `SQL_FN_STR_POSITION`: Int = 8388608;
public const val `SQL_FN_STR_REPEAT`: Int = 128;
public const val `SQL_FN_STR_REPLACE`: Int = 256;
public const val `SQL_FN_STR_RIGHT`: Int = 512;
public const val `SQL_FN_STR_RTRIM`: Int = 1024;
public const val `SQL_FN_STR_SOUNDEX`: Int = 131072;
public const val `SQL_FN_STR_SPACE`: Int = 262144;
public const val `SQL_FN_STR_SUBSTRING`: Int = 2048;
public const val `SQL_FN_STR_UCASE`: Int = 4096;
public const val `SQL_FN_SYS_DBNAME`: Int = 2;
public const val `SQL_FN_SYS_IFNULL`: Int = 4;
public const val `SQL_FN_SYS_USERNAME`: Int = 1;
public const val `SQL_FN_TD_CURDATE`: Int = 2;
public const val `SQL_FN_TD_CURRENT_DATE`: Int = 131072;
public const val `SQL_FN_TD_CURRENT_TIME`: Int = 262144;
public const val `SQL_FN_TD_CURRENT_TIMESTAMP`: Int = 524288;
public const val `SQL_FN_TD_CURTIME`: Int = 512;
public const val `SQL_FN_TD_DAYNAME`: Int = 32768;
public const val `SQL_FN_TD_DAYOFMONTH`: Int = 4;
public const val `SQL_FN_TD_DAYOFWEEK`: Int = 8;
public const val `SQL_FN_TD_DAYOFYEAR`: Int = 16;
public const val `SQL_FN_TD_EXTRACT`: Int = 1048576;
public const val `SQL_FN_TD_HOUR`: Int = 1024;
public const val `SQL_FN_TD_MINUTE`: Int = 2048;
public const val `SQL_FN_TD_MONTH`: Int = 32;
public const val `SQL_FN_TD_MONTHNAME`: Int = 65536;
public const val `SQL_FN_TD_NOW`: Int = 1;
public const val `SQL_FN_TD_QUARTER`: Int = 64;
public const val `SQL_FN_TD_SECOND`: Int = 4096;
public const val `SQL_FN_TD_TIMESTAMPADD`: Int = 8192;
public const val `SQL_FN_TD_TIMESTAMPDIFF`: Int = 16384;
public const val `SQL_FN_TD_WEEK`: Int = 128;
public const val `SQL_FN_TD_YEAR`: Int = 256;
public const val `SQL_FN_TSI_DAY`: Int = 16;
public const val `SQL_FN_TSI_FRAC_SECOND`: Int = 1;
public const val `SQL_FN_TSI_HOUR`: Int = 8;
public const val `SQL_FN_TSI_MINUTE`: Int = 4;
public const val `SQL_FN_TSI_MONTH`: Int = 64;
public const val `SQL_FN_TSI_QUARTER`: Int = 128;
public const val `SQL_FN_TSI_SECOND`: Int = 2;
public const val `SQL_FN_TSI_WEEK`: Int = 32;
public const val `SQL_FN_TSI_YEAR`: Int = 256;
public const val `SQL_FORWARD_ONLY_CURSOR_ATTRIBUTES1`: UInt = 146u;
public const val `SQL_FORWARD_ONLY_CURSOR_ATTRIBUTES2`: UInt = 147u;
public const val `SQL_GB_COLLATE`: UInt = 4u;
public const val `SQL_GB_GROUP_BY_CONTAINS_SELECT`: UInt = 2u;
public const val `SQL_GB_GROUP_BY_EQUALS_SELECT`: UInt = 1u;
public const val `SQL_GB_NOT_SUPPORTED`: UInt = 0u;
public const val `SQL_GB_NO_RELATION`: UInt = 3u;
public const val `SQL_GD_ANY_COLUMN`: Int = 1;
public const val `SQL_GD_ANY_ORDER`: Int = 2;
public const val `SQL_GD_BLOCK`: Int = 4;
public const val `SQL_GD_BOUND`: Int = 8;
public const val `SQL_GD_OUTPUT_PARAMS`: Int = 16;
public const val `SQL_GETDATA_EXTENSIONS`: UInt = 81u;
public const val `SQL_GET_BOOKMARK`: UInt = 13u;
public const val `SQL_GROUP_BY`: UInt = 88u;
public const val `SQL_GUID`: Int = -11;
public const val `SQL_HANDLE_DBC`: UInt = 2u;
public const val `SQL_HANDLE_DBC_INFO_TOKEN`: UInt = 6u;
public const val `SQL_HANDLE_DESC`: UInt = 4u;
public const val `SQL_HANDLE_ENV`: UInt = 1u;
public const val `SQL_HANDLE_SENV`: UInt = 5u;
public const val `SQL_HANDLE_STMT`: UInt = 3u;
public const val `SQL_HC_DEFAULT`: Int = 0;
public const val `SQL_HC_OFF`: Int = 0;
public const val `SQL_HC_ON`: Int = 1;
public const val `SQL_HOUR`: UInt = 4u;
public const val `SQL_HOUR_TO_MINUTE`: UInt = 11u;
public const val `SQL_HOUR_TO_SECOND`: UInt = 12u;
public const val `SQL_IC_LOWER`: UInt = 2u;
public const val `SQL_IC_MIXED`: UInt = 4u;
public const val `SQL_IC_SENSITIVE`: UInt = 3u;
public const val `SQL_IC_UPPER`: UInt = 1u;
public const val `SQL_IDENTIFIER_CASE`: UInt = 28u;
public const val `SQL_IDENTIFIER_QUOTE_CHAR`: UInt = 29u;
public const val `SQL_IGNORE`: Int = -6;
public const val `SQL_IK_ASC`: Int = 1;
public const val `SQL_IK_DESC`: Int = 2;
public const val `SQL_IK_NONE`: Int = 0;
public const val `SQL_INDEX_ALL`: UInt = 1u;
public const val `SQL_INDEX_CLUSTERED`: UInt = 1u;
public const val `SQL_INDEX_HASHED`: UInt = 2u;
public const val `SQL_INDEX_KEYWORDS`: UInt = 148u;
public const val `SQL_INDEX_OTHER`: UInt = 3u;
public const val `SQL_INDEX_UNIQUE`: UInt = 0u;
public const val `SQL_INFO_DRIVER_START`: UInt = 1000u;
public const val `SQL_INFO_FIRST`: UInt = 0u;
public const val `SQL_INFO_LAST`: UInt = 114u;
public const val `SQL_INFO_SCHEMA_VIEWS`: UInt = 149u;
public const val `SQL_INFO_SS_FIRST`: UInt = 1199u;
public const val `SQL_INFO_SS_MAX_USED`: UInt = 1200u;
public const val `SQL_INFO_SS_NETLIB_NAME`: UInt = 1199u;
public const val `SQL_INFO_SS_NETLIB_NAMEA`: UInt = 1200u;
public const val `SQL_INFO_SS_NETLIB_NAMEW`: UInt = 1199u;
public const val `SQL_INITIALLY_DEFERRED`: UInt = 5u;
public const val `SQL_INITIALLY_IMMEDIATE`: UInt = 6u;
public const val `SQL_INSENSITIVE`: UInt = 1u;
public const val `SQL_INSERT_STATEMENT`: UInt = 172u;
public const val `SQL_INTEGER`: UInt = 4u;
public const val `SQL_INTEGRATED_SECURITY`: UInt = 1203u;
public const val `SQL_INTEGRITY`: UInt = 73u;
public const val `SQL_INTERVAL`: UInt = 10u;
public const val `SQL_INTERVAL_DAY`: Int = -83;
public const val `SQL_INTERVAL_DAY_TO_HOUR`: Int = -87;
public const val `SQL_INTERVAL_DAY_TO_MINUTE`: Int = -88;
public const val `SQL_INTERVAL_DAY_TO_SECOND`: Int = -89;
public const val `SQL_INTERVAL_HOUR`: Int = -84;
public const val `SQL_INTERVAL_HOUR_TO_MINUTE`: Int = -90;
public const val `SQL_INTERVAL_HOUR_TO_SECOND`: Int = -91;
public const val `SQL_INTERVAL_MINUTE`: Int = -85;
public const val `SQL_INTERVAL_MINUTE_TO_SECOND`: Int = -92;
public const val `SQL_INTERVAL_MONTH`: Int = -81;
public const val `SQL_INTERVAL_SECOND`: Int = -86;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SQL_INTERVAL_STRUCT` (
    public var `interval_type`: `SQLINTERVAL`,
    public var `interval_sign`: Short,
    public var `intval`: `SQL_INTERVAL_STRUCT_0`,
)
// UNSUPPORTED Rust 5446:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SQL_INTERVAL_STRUCT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5451:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SQL_INTERVAL_STRUCT_0 {
//     pub year_month: SQL_YEAR_MONTH_STRUCT,
//     pub day_second: SQL_DAY_SECOND_STRUCT,
// }

// UNSUPPORTED Rust 5457:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SQL_INTERVAL_STRUCT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SQL_INTERVAL_YEAR`: Int = -80;
public const val `SQL_INTERVAL_YEAR_TO_MONTH`: Int = -82;
public const val `SQL_INVALID_HANDLE`: Int = -2;
public const val `SQL_ISV_ASSERTIONS`: Int = 1;
public const val `SQL_ISV_CHARACTER_SETS`: Int = 2;
public const val `SQL_ISV_CHECK_CONSTRAINTS`: Int = 4;
public const val `SQL_ISV_COLLATIONS`: Int = 8;
public const val `SQL_ISV_COLUMNS`: Int = 64;
public const val `SQL_ISV_COLUMN_DOMAIN_USAGE`: Int = 16;
public const val `SQL_ISV_COLUMN_PRIVILEGES`: Int = 32;
public const val `SQL_ISV_CONSTRAINT_COLUMN_USAGE`: Int = 128;
public const val `SQL_ISV_CONSTRAINT_TABLE_USAGE`: Int = 256;
public const val `SQL_ISV_DOMAINS`: Int = 1024;
public const val `SQL_ISV_DOMAIN_CONSTRAINTS`: Int = 512;
public const val `SQL_ISV_KEY_COLUMN_USAGE`: Int = 2048;
public const val `SQL_ISV_REFERENTIAL_CONSTRAINTS`: Int = 4096;
public const val `SQL_ISV_SCHEMATA`: Int = 8192;
public const val `SQL_ISV_SQL_LANGUAGES`: Int = 16384;
public const val `SQL_ISV_TABLES`: Int = 131072;
public const val `SQL_ISV_TABLE_CONSTRAINTS`: Int = 32768;
public const val `SQL_ISV_TABLE_PRIVILEGES`: Int = 65536;
public const val `SQL_ISV_TRANSLATIONS`: Int = 262144;
public const val `SQL_ISV_USAGE_PRIVILEGES`: Int = 524288;
public const val `SQL_ISV_VIEWS`: Int = 4194304;
public const val `SQL_ISV_VIEW_COLUMN_USAGE`: Int = 1048576;
public const val `SQL_ISV_VIEW_TABLE_USAGE`: Int = 2097152;
public const val `SQL_IS_DAY`: `SQLINTERVAL` = 3;
public const val `SQL_IS_DAY_TO_HOUR`: `SQLINTERVAL` = 8;
public const val `SQL_IS_DAY_TO_MINUTE`: `SQLINTERVAL` = 9;
public const val `SQL_IS_DAY_TO_SECOND`: `SQLINTERVAL` = 10;
public const val `SQL_IS_DEFAULT`: Int = 0;
public const val `SQL_IS_HOUR`: `SQLINTERVAL` = 4;
public const val `SQL_IS_HOUR_TO_MINUTE`: `SQLINTERVAL` = 11;
public const val `SQL_IS_HOUR_TO_SECOND`: `SQLINTERVAL` = 12;
public const val `SQL_IS_INSERT_LITERALS`: Int = 1;
public const val `SQL_IS_INSERT_SEARCHED`: Int = 2;
public const val `SQL_IS_INTEGER`: Int = -6;
public const val `SQL_IS_MINUTE`: `SQLINTERVAL` = 5;
public const val `SQL_IS_MINUTE_TO_SECOND`: `SQLINTERVAL` = 13;
public const val `SQL_IS_MONTH`: `SQLINTERVAL` = 2;
public const val `SQL_IS_OFF`: Int = 0;
public const val `SQL_IS_ON`: Int = 1;
public const val `SQL_IS_POINTER`: Int = -4;
public const val `SQL_IS_SECOND`: `SQLINTERVAL` = 6;
public const val `SQL_IS_SELECT_INTO`: Int = 4;
public const val `SQL_IS_SMALLINT`: Int = -8;
public const val `SQL_IS_UINTEGER`: Int = -5;
public const val `SQL_IS_USMALLINT`: Int = -7;
public const val `SQL_IS_YEAR`: `SQLINTERVAL` = 1;
public const val `SQL_IS_YEAR_TO_MONTH`: `SQLINTERVAL` = 7;
public const val `SQL_KEYSET_CURSOR_ATTRIBUTES1`: UInt = 150u;
public const val `SQL_KEYSET_CURSOR_ATTRIBUTES2`: UInt = 151u;
public const val `SQL_KEYSET_SIZE`: UInt = 8u;
public const val `SQL_KEYSET_SIZE_DEFAULT`: UInt = 0u;
public const val `SQL_KEYWORDS`: UInt = 89u;
public const val `SQL_LCK_EXCLUSIVE`: Int = 2;
public const val `SQL_LCK_NO_CHANGE`: Int = 1;
public const val `SQL_LCK_UNLOCK`: Int = 4;
public const val `SQL_LEN_BINARY_ATTR_OFFSET`: Int = -100;
public const val `SQL_LEN_DATA_AT_EXEC_OFFSET`: Int = -100;
public const val `SQL_LIKE_ESCAPE_CLAUSE`: UInt = 113u;
public const val `SQL_LIKE_ONLY`: UInt = 1u;
public const val `SQL_LOCK_EXCLUSIVE`: UInt = 1u;
public const val `SQL_LOCK_NO_CHANGE`: UInt = 0u;
public const val `SQL_LOCK_TYPES`: UInt = 78u;
public const val `SQL_LOCK_UNLOCK`: UInt = 2u;
public const val `SQL_LOGIN_TIMEOUT`: UInt = 103u;
public const val `SQL_LOGIN_TIMEOUT_DEFAULT`: UInt = 15u;
public const val `SQL_LONGVARBINARY`: Int = -4;
public const val `SQL_LONGVARCHAR`: Int = -1;
public const val `SQL_MAXIMUM_CATALOG_NAME_LENGTH`: UInt = 34u;
public const val `SQL_MAXIMUM_COLUMNS_IN_GROUP_BY`: UInt = 97u;
public const val `SQL_MAXIMUM_COLUMNS_IN_INDEX`: UInt = 98u;
public const val `SQL_MAXIMUM_COLUMNS_IN_ORDER_BY`: UInt = 99u;
public const val `SQL_MAXIMUM_COLUMNS_IN_SELECT`: UInt = 100u;
public const val `SQL_MAXIMUM_COLUMN_NAME_LENGTH`: UInt = 30u;
public const val `SQL_MAXIMUM_CONCURRENT_ACTIVITIES`: UInt = 1u;
public const val `SQL_MAXIMUM_CURSOR_NAME_LENGTH`: UInt = 31u;
public const val `SQL_MAXIMUM_DRIVER_CONNECTIONS`: UInt = 0u;
public const val `SQL_MAXIMUM_IDENTIFIER_LENGTH`: UInt = 10005u;
public const val `SQL_MAXIMUM_INDEX_SIZE`: UInt = 102u;
public const val `SQL_MAXIMUM_ROW_SIZE`: UInt = 104u;
public const val `SQL_MAXIMUM_SCHEMA_NAME_LENGTH`: UInt = 32u;
public const val `SQL_MAXIMUM_STATEMENT_LENGTH`: UInt = 105u;
public const val `SQL_MAXIMUM_TABLES_IN_SELECT`: UInt = 106u;
public const val `SQL_MAXIMUM_USER_NAME_LENGTH`: UInt = 107u;
public const val `SQL_MAX_ASYNC_CONCURRENT_STATEMENTS`: UInt = 10022u;
public const val `SQL_MAX_BINARY_LITERAL_LEN`: UInt = 112u;
public const val `SQL_MAX_CATALOG_NAME_LEN`: UInt = 34u;
public const val `SQL_MAX_CHAR_LITERAL_LEN`: UInt = 108u;
public const val `SQL_MAX_COLUMNS_IN_GROUP_BY`: UInt = 97u;
public const val `SQL_MAX_COLUMNS_IN_INDEX`: UInt = 98u;
public const val `SQL_MAX_COLUMNS_IN_ORDER_BY`: UInt = 99u;
public const val `SQL_MAX_COLUMNS_IN_SELECT`: UInt = 100u;
public const val `SQL_MAX_COLUMNS_IN_TABLE`: UInt = 101u;
public const val `SQL_MAX_COLUMN_NAME_LEN`: UInt = 30u;
public const val `SQL_MAX_CONCURRENT_ACTIVITIES`: UInt = 1u;
public const val `SQL_MAX_CURSOR_NAME_LEN`: UInt = 31u;
public const val `SQL_MAX_DRIVER_CONNECTIONS`: UInt = 0u;
public const val `SQL_MAX_DSN_LENGTH`: UInt = 32u;
public const val `SQL_MAX_IDENTIFIER_LEN`: UInt = 10005u;
public const val `SQL_MAX_INDEX_SIZE`: UInt = 102u;
public const val `SQL_MAX_LENGTH`: UInt = 3u;
public const val `SQL_MAX_LENGTH_DEFAULT`: UInt = 0u;
public const val `SQL_MAX_MESSAGE_LENGTH`: UInt = 512u;
public const val `SQL_MAX_NUMERIC_LEN`: UInt = 16u;
public const val `SQL_MAX_OPTION_STRING_LENGTH`: UInt = 256u;
public const val `SQL_MAX_OWNER_NAME_LEN`: UInt = 32u;
public const val `SQL_MAX_PROCEDURE_NAME_LEN`: UInt = 33u;
public const val `SQL_MAX_QUALIFIER_NAME_LEN`: UInt = 34u;
public const val `SQL_MAX_ROWS`: UInt = 1u;
public const val `SQL_MAX_ROWS_DEFAULT`: UInt = 0u;
public const val `SQL_MAX_ROW_SIZE`: UInt = 104u;
public const val `SQL_MAX_ROW_SIZE_INCLUDES_LONG`: UInt = 103u;
public const val `SQL_MAX_SCHEMA_NAME_LEN`: UInt = 32u;
public const val `SQL_MAX_SQLSERVERNAME`: UInt = 128u;
public const val `SQL_MAX_STATEMENT_LEN`: UInt = 105u;
public const val `SQL_MAX_TABLES_IN_SELECT`: UInt = 106u;
public const val `SQL_MAX_TABLE_NAME_LEN`: UInt = 35u;
public const val `SQL_MAX_USER_NAME_LEN`: UInt = 107u;
public const val `SQL_MINUTE`: UInt = 5u;
public const val `SQL_MINUTE_TO_SECOND`: UInt = 13u;
public const val `SQL_MODE_DEFAULT`: UInt = 0u;
public const val `SQL_MODE_READ_ONLY`: UInt = 1u;
public const val `SQL_MODE_READ_WRITE`: UInt = 0u;
public const val `SQL_MONTH`: UInt = 2u;
public const val `SQL_MORE_INFO_NO`: Int = 0;
public const val `SQL_MORE_INFO_YES`: Int = 1;
public const val `SQL_MULTIPLE_ACTIVE_TXN`: UInt = 37u;
public const val `SQL_MULT_RESULT_SETS`: UInt = 36u;
public const val `SQL_NAMED`: UInt = 0u;
public const val `SQL_NB_DEFAULT`: Int = 0;
public const val `SQL_NB_OFF`: Int = 0;
public const val `SQL_NB_ON`: Int = 1;
public const val `SQL_NC_END`: UInt = 4u;
public const val `SQL_NC_HIGH`: UInt = 0u;
public const val `SQL_NC_LOW`: UInt = 1u;
public const val `SQL_NC_OFF`: Int = 0;
public const val `SQL_NC_ON`: Int = 1;
public const val `SQL_NC_START`: UInt = 2u;
public const val `SQL_NEED_DATA`: UInt = 99u;
public const val `SQL_NEED_LONG_DATA_LEN`: UInt = 111u;
public const val `SQL_NNC_NON_NULL`: UInt = 1u;
public const val `SQL_NNC_NULL`: UInt = 0u;
public const val `SQL_NONSCROLLABLE`: UInt = 0u;
public const val `SQL_NON_NULLABLE_COLUMNS`: UInt = 75u;
public const val `SQL_NOSCAN`: UInt = 2u;
public const val `SQL_NOSCAN_DEFAULT`: UInt = 0u;
public const val `SQL_NOSCAN_OFF`: UInt = 0u;
public const val `SQL_NOSCAN_ON`: UInt = 1u;
public const val `SQL_NOT_DEFERRABLE`: UInt = 7u;
public const val `SQL_NO_ACTION`: UInt = 3u;
public const val `SQL_NO_COLUMN_NUMBER`: Int = -1;
public const val `SQL_NO_DATA`: UInt = 100u;
public const val `SQL_NO_DATA_FOUND`: UInt = 100u;
public const val `SQL_NO_NULLS`: UInt = 0u;
public const val `SQL_NO_ROW_NUMBER`: Int = -1;
public const val `SQL_NO_TOTAL`: Int = -4;
public const val `SQL_NTS`: Int = -3;
public const val `SQL_NTSL`: Int = -3;
public const val `SQL_NULLABLE`: UInt = 1u;
public const val `SQL_NULLABLE_UNKNOWN`: UInt = 2u;
public const val `SQL_NULL_COLLATION`: UInt = 85u;
public const val `SQL_NULL_DATA`: Int = -1;
public const val `SQL_NULL_HANDLE`: Int = 0;
public const val `SQL_NULL_HDBC`: UInt = 0u;
public const val `SQL_NULL_HDESC`: UInt = 0u;
public const val `SQL_NULL_HENV`: UInt = 0u;
public const val `SQL_NULL_HSTMT`: UInt = 0u;
public const val `SQL_NUMERIC`: UInt = 2u;
public const val `SQL_NUMERIC_FUNCTIONS`: UInt = 49u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SQL_NUMERIC_STRUCT` (
    public var `precision`: UByte,
    public var `scale`: Byte,
    public var `sign`: UByte,
    public var `val`: UByteArray,
)
// UNSUPPORTED Rust 5641:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SQL_NUMERIC_STRUCT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SQL_NUM_FUNCTIONS`: UInt = 23u;
public const val `SQL_OAC_LEVEL1`: UInt = 1u;
public const val `SQL_OAC_LEVEL2`: UInt = 2u;
public const val `SQL_OAC_NONE`: UInt = 0u;
public const val `SQL_ODBC_API_CONFORMANCE`: UInt = 9u;
public const val `SQL_ODBC_CURSORS`: UInt = 110u;
public const val `SQL_ODBC_INTERFACE_CONFORMANCE`: UInt = 152u;
// UNSUPPORTED Rust 5653:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SQL_ODBC_KEYWORDS : windows_sys::core::PCSTR = windows_sys::core::s ! ( "ABSOLUTE,ACTION,ADA,ADD,ALL,ALLOCATE,ALTER,AND,ANY,ARE,AS,ASC,ASSERTION,AT,AUTHORIZATION,AVG,BEGIN,BETWEEN,BIT,BIT_LENGTH,BOTH,BY,CASCADE,CASCADED,CASE,CAST,CATALOG,CHAR,CHAR_LENGTH,CHARACTER,CHARACTER_LENGTH,CHECK,CLOSE,COALESCE,COLLATE,COLLATION,COLUMN,COMMIT,CONNECT,CONNECTION,CONSTRAINT,CONSTRAINTS,CONTINUE,CONVERT,CORRESPONDING,COUNT,CREATE,CROSS,CURRENT,CURRENT_DATE,CURRENT_TIME,CURRENT_TIMESTAMP,CURRENT_USER,CURSOR,DATE,DAY,DEALLOCATE,DEC,DECIMAL,DECLARE,DEFAULT,DEFERRABLE,DEFERRED,DELETE,DESC,DESCRIBE,DESCRIPTOR,DIAGNOSTICS,DISCONNECT,DISTINCT,DOMAIN,DOUBLE,DROP,ELSE,END,END-EXEC,ESCAPE,EXCEPT,EXCEPTION,EXEC,EXECUTE,EXISTS,EXTERNAL,EXTRACT,FALSE,FETCH,FIRST,FLOAT,FOR,FOREIGN,FORTRAN,FOUND,FROM,FULL,GET,GLOBAL,GO,GOTO,GRANT,GROUP,HAVING,HOUR,IDENTITY,IMMEDIATE,IN,INCLUDE,INDEX,INDICATOR,INITIALLY,INNER,INPUT,INSENSITIVE,INSERT,INT,INTEGER,INTERSECT,INTERVAL,INTO,IS,ISOLATION,JOIN,KEY,LANGUAGE,LAST,LEADING,LEFT,LEVEL,LIKE,LOCAL,LOWER,MATCH,MAX,MIN,MINUTE,MODULE,MONTH,NAMES,NATIONAL,NATURAL,NCHAR,NEXT,NO,NONE,NOT,NULL,NULLIF,NUMERIC,OCTET_LENGTH,OF,ON,ONLY,OPEN,OPTION,OR,ORDER,OUTER,OUTPUT,OVERLAPS,PAD,PARTIAL,PASCAL,PLI,POSITION,PRECISION,PREPARE,PRESERVE,PRIMARY,PRIOR,PRIVILEGES,PROCEDURE,PUBLIC,READ,REAL,REFERENCES,RELATIVE,RESTRICT,REVOKE,RIGHT,ROLLBACK,ROWSSCHEMA,SCROLL,SECOND,SECTION,SELECT,SESSION,SESSION_USER,SET,SIZE,SMALLINT,SOME,SPACE,SQL,SQLCA,SQLCODE,SQLERROR,SQLSTATE,SQLWARNING,SUBSTRING,SUM,SYSTEM_USER,TABLE,TEMPORARY,THEN,TIME,TIMESTAMP,TIMEZONE_HOUR,TIMEZONE_MINUTE,TO,TRAILING,TRANSACTION,TRANSLATE,TRANSLATION,TRIM,TRUE,UNION,UNIQUE,UNKNOWN,UPDATE,UPPER,USAGE,USER,USING,VALUE,VALUES,VARCHAR,VARYING,VIEW,WHEN,WHENEVER,WHERE,WITH,WORK,WRITE,YEAR,ZONE" ) ;

public const val `SQL_ODBC_SAG_CLI_CONFORMANCE`: UInt = 12u;
public const val `SQL_ODBC_SQL_CONFORMANCE`: UInt = 15u;
public const val `SQL_ODBC_SQL_OPT_IEF`: UInt = 73u;
public const val `SQL_ODBC_VER`: UInt = 10u;
public const val `SQL_OIC_CORE`: UInt = 1u;
public const val `SQL_OIC_LEVEL1`: UInt = 2u;
public const val `SQL_OIC_LEVEL2`: UInt = 3u;
public const val `SQL_OJ_ALL_COMPARISON_OPS`: Int = 64;
public const val `SQL_OJ_CAPABILITIES`: UInt = 115u;
public const val `SQL_OJ_FULL`: Int = 4;
public const val `SQL_OJ_INNER`: Int = 32;
public const val `SQL_OJ_LEFT`: Int = 1;
public const val `SQL_OJ_NESTED`: Int = 8;
public const val `SQL_OJ_NOT_ORDERED`: Int = 16;
public const val `SQL_OJ_RIGHT`: Int = 2;
public const val `SQL_OPT_TRACE`: UInt = 104u;
public const val `SQL_OPT_TRACEFILE`: UInt = 105u;
public const val `SQL_OPT_TRACE_DEFAULT`: UInt = 0u;
// UNSUPPORTED Rust 5672:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SQL_OPT_TRACE_FILE_DEFAULT: windows_sys::core::PCSTR = windows_sys::core::s!("\\SQL.LOG");

public const val `SQL_OPT_TRACE_OFF`: UInt = 0u;
public const val `SQL_OPT_TRACE_ON`: UInt = 1u;
public const val `SQL_ORDER_BY_COLUMNS_IN_SELECT`: UInt = 90u;
public const val `SQL_OSCC_COMPLIANT`: UInt = 1u;
public const val `SQL_OSCC_NOT_COMPLIANT`: UInt = 0u;
public const val `SQL_OSC_CORE`: UInt = 1u;
public const val `SQL_OSC_EXTENDED`: UInt = 2u;
public const val `SQL_OSC_MINIMUM`: UInt = 0u;
public const val `SQL_OUTER_JOINS`: UInt = 38u;
public const val `SQL_OUTER_JOIN_CAPABILITIES`: UInt = 115u;
public const val `SQL_OU_DML_STATEMENTS`: Int = 1;
public const val `SQL_OU_INDEX_DEFINITION`: Int = 8;
public const val `SQL_OU_PRIVILEGE_DEFINITION`: Int = 16;
public const val `SQL_OU_PROCEDURE_INVOCATION`: Int = 2;
public const val `SQL_OU_TABLE_DEFINITION`: Int = 4;
public const val `SQL_OV_ODBC2`: UInt = 2u;
public const val `SQL_OV_ODBC3`: UInt = 3u;
public const val `SQL_OV_ODBC3_80`: UInt = 380u;
public const val `SQL_OWNER_TERM`: UInt = 39u;
public const val `SQL_OWNER_USAGE`: UInt = 91u;
public const val `SQL_PACKET_SIZE`: UInt = 112u;
public const val `SQL_PARAM_ARRAY_ROW_COUNTS`: UInt = 153u;
public const val `SQL_PARAM_ARRAY_SELECTS`: UInt = 154u;
public const val `SQL_PARAM_BIND_BY_COLUMN`: UInt = 0u;
public const val `SQL_PARAM_BIND_TYPE_DEFAULT`: UInt = 0u;
public const val `SQL_PARAM_DATA_AVAILABLE`: UInt = 101u;
public const val `SQL_PARAM_DIAG_UNAVAILABLE`: UInt = 1u;
public const val `SQL_PARAM_ERROR`: UInt = 5u;
public const val `SQL_PARAM_IGNORE`: UInt = 1u;
public const val `SQL_PARAM_INPUT`: UInt = 1u;
public const val `SQL_PARAM_INPUT_OUTPUT`: UInt = 2u;
public const val `SQL_PARAM_INPUT_OUTPUT_STREAM`: UInt = 8u;
public const val `SQL_PARAM_OUTPUT`: UInt = 4u;
public const val `SQL_PARAM_OUTPUT_STREAM`: UInt = 16u;
public const val `SQL_PARAM_PROCEED`: UInt = 0u;
public const val `SQL_PARAM_SUCCESS`: UInt = 0u;
public const val `SQL_PARAM_SUCCESS_WITH_INFO`: UInt = 6u;
public const val `SQL_PARAM_TYPE_UNKNOWN`: UInt = 0u;
public const val `SQL_PARAM_UNUSED`: UInt = 7u;
public const val `SQL_PARC_BATCH`: UInt = 1u;
public const val `SQL_PARC_NO_BATCH`: UInt = 2u;
public const val `SQL_PAS_BATCH`: UInt = 1u;
public const val `SQL_PAS_NO_BATCH`: UInt = 2u;
public const val `SQL_PAS_NO_SELECT`: UInt = 3u;
public const val `SQL_PC_DEFAULT`: Int = 0;
public const val `SQL_PC_NON_PSEUDO`: UInt = 1u;
public const val `SQL_PC_NOT_PSEUDO`: UInt = 1u;
public const val `SQL_PC_OFF`: Int = 0;
public const val `SQL_PC_ON`: Int = 1;
public const val `SQL_PC_PSEUDO`: UInt = 2u;
public const val `SQL_PC_UNKNOWN`: UInt = 0u;
public const val `SQL_PERF_START`: UInt = 1u;
public const val `SQL_PERF_STOP`: UInt = 2u;
public const val `SQL_POSITION`: UInt = 0u;
public const val `SQL_POSITIONED_STATEMENTS`: UInt = 80u;
public const val `SQL_POS_ADD`: Int = 16;
public const val `SQL_POS_DELETE`: Int = 8;
public const val `SQL_POS_OPERATIONS`: UInt = 79u;
public const val `SQL_POS_POSITION`: Int = 1;
public const val `SQL_POS_REFRESH`: Int = 2;
public const val `SQL_POS_UPDATE`: Int = 4;
public const val `SQL_PRED_BASIC`: UInt = 2u;
public const val `SQL_PRED_CHAR`: UInt = 1u;
public const val `SQL_PRED_NONE`: UInt = 0u;
public const val `SQL_PRED_SEARCHABLE`: UInt = 3u;
public const val `SQL_PRESERVE_CURSORS`: UInt = 1204u;
public const val `SQL_PROCEDURES`: UInt = 21u;
public const val `SQL_PROCEDURE_TERM`: UInt = 40u;
public const val `SQL_PS_POSITIONED_DELETE`: Int = 1;
public const val `SQL_PS_POSITIONED_UPDATE`: Int = 2;
public const val `SQL_PS_SELECT_FOR_UPDATE`: Int = 4;
public const val `SQL_PT_FUNCTION`: UInt = 2u;
public const val `SQL_PT_PROCEDURE`: UInt = 1u;
public const val `SQL_PT_UNKNOWN`: UInt = 0u;
public const val `SQL_QI_DEFAULT`: Int = 1;
public const val `SQL_QI_OFF`: Int = 0;
public const val `SQL_QI_ON`: Int = 1;
public const val `SQL_QL_END`: UInt = 2u;
public const val `SQL_QL_START`: UInt = 1u;
public const val `SQL_QUALIFIER_LOCATION`: UInt = 114u;
public const val `SQL_QUALIFIER_NAME_SEPARATOR`: UInt = 41u;
public const val `SQL_QUALIFIER_TERM`: UInt = 42u;
public const val `SQL_QUALIFIER_USAGE`: UInt = 92u;
public const val `SQL_QUERY_TIMEOUT`: UInt = 0u;
public const val `SQL_QUERY_TIMEOUT_DEFAULT`: UInt = 0u;
public const val `SQL_QUICK`: UInt = 0u;
public const val `SQL_QUIET_MODE`: UInt = 111u;
public const val `SQL_QUOTED_IDENTIFIER_CASE`: UInt = 93u;
public const val `SQL_QU_DML_STATEMENTS`: Int = 1;
public const val `SQL_QU_INDEX_DEFINITION`: Int = 8;
public const val `SQL_QU_PRIVILEGE_DEFINITION`: Int = 16;
public const val `SQL_QU_PROCEDURE_INVOCATION`: Int = 2;
public const val `SQL_QU_TABLE_DEFINITION`: Int = 4;
public const val `SQL_RD_DEFAULT`: UInt = 1u;
public const val `SQL_RD_OFF`: UInt = 0u;
public const val `SQL_RD_ON`: UInt = 1u;
public const val `SQL_REAL`: UInt = 7u;
public const val `SQL_REFRESH`: UInt = 1u;
public const val `SQL_REMOTE_PWD`: UInt = 1201u;
public const val `SQL_RESET_CONNECTION_YES`: UInt = 1u;
public const val `SQL_RESET_PARAMS`: UInt = 3u;
public const val `SQL_RESET_YES`: Int = 1;
public const val `SQL_RESTRICT`: UInt = 1u;
public const val `SQL_RESULT_COL`: UInt = 3u;
public const val `SQL_RETRIEVE_DATA`: UInt = 11u;
public const val `SQL_RETURN_VALUE`: UInt = 5u;
public const val `SQL_RE_DEFAULT`: Int = 0;
public const val `SQL_RE_OFF`: Int = 0;
public const val `SQL_RE_ON`: Int = 1;
public const val `SQL_ROLLBACK`: UInt = 1u;
public const val `SQL_ROWSET_SIZE`: UInt = 9u;
public const val `SQL_ROWSET_SIZE_DEFAULT`: UInt = 1u;
public const val `SQL_ROWVER`: UInt = 2u;
public const val `SQL_ROW_ADDED`: UInt = 4u;
public const val `SQL_ROW_DELETED`: UInt = 1u;
public const val `SQL_ROW_ERROR`: UInt = 5u;
public const val `SQL_ROW_IDENTIFIER`: UInt = 1u;
public const val `SQL_ROW_IGNORE`: UInt = 1u;
public const val `SQL_ROW_NOROW`: UInt = 3u;
public const val `SQL_ROW_NUMBER`: UInt = 14u;
public const val `SQL_ROW_NUMBER_UNKNOWN`: Int = -2;
public const val `SQL_ROW_PROCEED`: UInt = 0u;
public const val `SQL_ROW_SUCCESS`: UInt = 0u;
public const val `SQL_ROW_SUCCESS_WITH_INFO`: UInt = 6u;
public const val `SQL_ROW_UPDATED`: UInt = 2u;
public const val `SQL_ROW_UPDATES`: UInt = 11u;
public const val `SQL_SCCO_LOCK`: Int = 2;
public const val `SQL_SCCO_OPT_ROWVER`: Int = 4;
public const val `SQL_SCCO_OPT_TIMESTAMP`: Int = 4;
public const val `SQL_SCCO_OPT_VALUES`: Int = 8;
public const val `SQL_SCCO_READ_ONLY`: Int = 1;
public const val `SQL_SCC_ISO92_CLI`: Int = 2;
public const val `SQL_SCC_XOPEN_CLI_VERSION1`: Int = 1;
public const val `SQL_SCHEMA_TERM`: UInt = 39u;
public const val `SQL_SCHEMA_USAGE`: UInt = 91u;
public const val `SQL_SCOPE_CURROW`: UInt = 0u;
public const val `SQL_SCOPE_SESSION`: UInt = 2u;
public const val `SQL_SCOPE_TRANSACTION`: UInt = 1u;
public const val `SQL_SCROLLABLE`: UInt = 1u;
public const val `SQL_SCROLL_CONCURRENCY`: UInt = 43u;
public const val `SQL_SCROLL_DYNAMIC`: Int = -2;
public const val `SQL_SCROLL_FORWARD_ONLY`: Int = 0;
public const val `SQL_SCROLL_KEYSET_DRIVEN`: Int = -1;
public const val `SQL_SCROLL_OPTIONS`: UInt = 44u;
public const val `SQL_SCROLL_STATIC`: Int = -3;
public const val `SQL_SC_FIPS127_2_TRANSITIONAL`: Int = 2;
public const val `SQL_SC_NON_UNIQUE`: UInt = 0u;
public const val `SQL_SC_SQL92_ENTRY`: Int = 1;
public const val `SQL_SC_SQL92_FULL`: Int = 8;
public const val `SQL_SC_SQL92_INTERMEDIATE`: Int = 4;
public const val `SQL_SC_TRY_UNIQUE`: UInt = 1u;
public const val `SQL_SC_UNIQUE`: UInt = 2u;
public const val `SQL_SDF_CURRENT_DATE`: Int = 1;
public const val `SQL_SDF_CURRENT_TIME`: Int = 2;
public const val `SQL_SDF_CURRENT_TIMESTAMP`: Int = 4;
public const val `SQL_SEARCHABLE`: UInt = 3u;
public const val `SQL_SEARCH_PATTERN_ESCAPE`: UInt = 14u;
public const val `SQL_SECOND`: UInt = 6u;
public const val `SQL_SENSITIVE`: UInt = 2u;
public const val `SQL_SERVER_NAME`: UInt = 13u;
public const val `SQL_SETPARAM_VALUE_MAX`: Int = -1;
public const val `SQL_SETPOS_MAX_LOCK_VALUE`: UInt = 2u;
public const val `SQL_SETPOS_MAX_OPTION_VALUE`: UInt = 4u;
public const val `SQL_SET_DEFAULT`: UInt = 4u;
public const val `SQL_SET_NULL`: UInt = 2u;
public const val `SQL_SFKD_CASCADE`: Int = 1;
public const val `SQL_SFKD_NO_ACTION`: Int = 2;
public const val `SQL_SFKD_SET_DEFAULT`: Int = 4;
public const val `SQL_SFKD_SET_NULL`: Int = 8;
public const val `SQL_SFKU_CASCADE`: Int = 1;
public const val `SQL_SFKU_NO_ACTION`: Int = 2;
public const val `SQL_SFKU_SET_DEFAULT`: Int = 4;
public const val `SQL_SFKU_SET_NULL`: Int = 8;
public const val `SQL_SG_DELETE_TABLE`: Int = 32;
public const val `SQL_SG_INSERT_COLUMN`: Int = 128;
public const val `SQL_SG_INSERT_TABLE`: Int = 64;
public const val `SQL_SG_REFERENCES_COLUMN`: Int = 512;
public const val `SQL_SG_REFERENCES_TABLE`: Int = 256;
public const val `SQL_SG_SELECT_TABLE`: Int = 1024;
public const val `SQL_SG_UPDATE_COLUMN`: Int = 4096;
public const val `SQL_SG_UPDATE_TABLE`: Int = 2048;
public const val `SQL_SG_USAGE_ON_CHARACTER_SET`: Int = 2;
public const val `SQL_SG_USAGE_ON_COLLATION`: Int = 4;
public const val `SQL_SG_USAGE_ON_DOMAIN`: Int = 1;
public const val `SQL_SG_USAGE_ON_TRANSLATION`: Int = 8;
public const val `SQL_SG_WITH_GRANT_OPTION`: Int = 16;
public const val `SQL_SIGNED_OFFSET`: Int = -20;
public const val `SQL_SIMULATE_CURSOR`: UInt = 10u;
public const val `SQL_SMALLINT`: UInt = 5u;
public const val `SQL_SNVF_BIT_LENGTH`: Int = 1;
public const val `SQL_SNVF_CHARACTER_LENGTH`: Int = 4;
public const val `SQL_SNVF_CHAR_LENGTH`: Int = 2;
public const val `SQL_SNVF_EXTRACT`: Int = 8;
public const val `SQL_SNVF_OCTET_LENGTH`: Int = 16;
public const val `SQL_SNVF_POSITION`: Int = 32;
public const val `SQL_SOPT_SS_BASE`: UInt = 1225u;
public const val `SQL_SOPT_SS_CURRENT_COMMAND`: UInt = 1226u;
public const val `SQL_SOPT_SS_CURSOR_OPTIONS`: UInt = 1230u;
public const val `SQL_SOPT_SS_DEFER_PREPARE`: UInt = 1232u;
public const val `SQL_SOPT_SS_HIDDEN_COLUMNS`: UInt = 1227u;
public const val `SQL_SOPT_SS_MAX_USED`: UInt = 1232u;
public const val `SQL_SOPT_SS_NOBROWSETABLE`: UInt = 1228u;
public const val `SQL_SOPT_SS_NOCOUNT_STATUS`: UInt = 1231u;
public const val `SQL_SOPT_SS_REGIONALIZE`: UInt = 1229u;
public const val `SQL_SOPT_SS_TEXTPTR_LOGGING`: UInt = 1225u;
public const val `SQL_SO_DYNAMIC`: Int = 4;
public const val `SQL_SO_FORWARD_ONLY`: Int = 1;
public const val `SQL_SO_KEYSET_DRIVEN`: Int = 2;
public const val `SQL_SO_MIXED`: Int = 8;
public const val `SQL_SO_STATIC`: Int = 16;
public const val `SQL_SPECIAL_CHARACTERS`: UInt = 94u;
public const val `SQL_SPEC_MAJOR`: UInt = 3u;
public const val `SQL_SPEC_MINOR`: UInt = 80u;
// UNSUPPORTED Rust 5886:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SQL_SPEC_STRING: windows_sys::core::PCSTR = windows_sys::core::s!("03.80");

public const val `SQL_SP_BETWEEN`: Int = 2048;
public const val `SQL_SP_COMPARISON`: Int = 4096;
public const val `SQL_SP_EXISTS`: Int = 1;
public const val `SQL_SP_IN`: Int = 1024;
public const val `SQL_SP_ISNOTNULL`: Int = 2;
public const val `SQL_SP_ISNULL`: Int = 4;
public const val `SQL_SP_LIKE`: Int = 512;
public const val `SQL_SP_MATCH_FULL`: Int = 8;
public const val `SQL_SP_MATCH_PARTIAL`: Int = 16;
public const val `SQL_SP_MATCH_UNIQUE_FULL`: Int = 32;
public const val `SQL_SP_MATCH_UNIQUE_PARTIAL`: Int = 64;
public const val `SQL_SP_OVERLAPS`: Int = 128;
public const val `SQL_SP_QUANTIFIED_COMPARISON`: Int = 8192;
public const val `SQL_SP_UNIQUE`: Int = 256;
public const val `SQL_SQL92_DATETIME_FUNCTIONS`: UInt = 155u;
public const val `SQL_SQL92_FOREIGN_KEY_DELETE_RULE`: UInt = 156u;
public const val `SQL_SQL92_FOREIGN_KEY_UPDATE_RULE`: UInt = 157u;
public const val `SQL_SQL92_GRANT`: UInt = 158u;
public const val `SQL_SQL92_NUMERIC_VALUE_FUNCTIONS`: UInt = 159u;
public const val `SQL_SQL92_PREDICATES`: UInt = 160u;
public const val `SQL_SQL92_RELATIONAL_JOIN_OPERATORS`: UInt = 161u;
public const val `SQL_SQL92_REVOKE`: UInt = 162u;
public const val `SQL_SQL92_ROW_VALUE_CONSTRUCTOR`: UInt = 163u;
public const val `SQL_SQL92_STRING_FUNCTIONS`: UInt = 164u;
public const val `SQL_SQL92_VALUE_EXPRESSIONS`: UInt = 165u;
public const val `SQL_SQLSTATE_SIZE`: UInt = 5u;
public const val `SQL_SQLSTATE_SIZEW`: UInt = 10u;
public const val `SQL_SQL_CONFORMANCE`: UInt = 118u;
public const val `SQL_SQ_COMPARISON`: Int = 1;
public const val `SQL_SQ_CORRELATED_SUBQUERIES`: Int = 16;
public const val `SQL_SQ_EXISTS`: Int = 2;
public const val `SQL_SQ_IN`: Int = 4;
public const val `SQL_SQ_QUANTIFIED`: Int = 8;
public const val `SQL_SRJO_CORRESPONDING_CLAUSE`: Int = 1;
public const val `SQL_SRJO_CROSS_JOIN`: Int = 2;
public const val `SQL_SRJO_EXCEPT_JOIN`: Int = 4;
public const val `SQL_SRJO_FULL_OUTER_JOIN`: Int = 8;
public const val `SQL_SRJO_INNER_JOIN`: Int = 16;
public const val `SQL_SRJO_INTERSECT_JOIN`: Int = 32;
public const val `SQL_SRJO_LEFT_OUTER_JOIN`: Int = 64;
public const val `SQL_SRJO_NATURAL_JOIN`: Int = 128;
public const val `SQL_SRJO_RIGHT_OUTER_JOIN`: Int = 256;
public const val `SQL_SRJO_UNION_JOIN`: Int = 512;
public const val `SQL_SRVC_DEFAULT`: Int = 4;
public const val `SQL_SRVC_NULL`: Int = 2;
public const val `SQL_SRVC_ROW_SUBQUERY`: Int = 8;
public const val `SQL_SRVC_VALUE_EXPRESSION`: Int = 1;
public const val `SQL_SR_CASCADE`: Int = 32;
public const val `SQL_SR_DELETE_TABLE`: Int = 128;
public const val `SQL_SR_GRANT_OPTION_FOR`: Int = 16;
public const val `SQL_SR_INSERT_COLUMN`: Int = 512;
public const val `SQL_SR_INSERT_TABLE`: Int = 256;
public const val `SQL_SR_REFERENCES_COLUMN`: Int = 2048;
public const val `SQL_SR_REFERENCES_TABLE`: Int = 1024;
public const val `SQL_SR_RESTRICT`: Int = 64;
public const val `SQL_SR_SELECT_TABLE`: Int = 4096;
public const val `SQL_SR_UPDATE_COLUMN`: Int = 16384;
public const val `SQL_SR_UPDATE_TABLE`: Int = 8192;
public const val `SQL_SR_USAGE_ON_CHARACTER_SET`: Int = 2;
public const val `SQL_SR_USAGE_ON_COLLATION`: Int = 4;
public const val `SQL_SR_USAGE_ON_DOMAIN`: Int = 1;
public const val `SQL_SR_USAGE_ON_TRANSLATION`: Int = 8;
public const val `SQL_SSF_CONVERT`: Int = 1;
public const val `SQL_SSF_LOWER`: Int = 2;
public const val `SQL_SSF_SUBSTRING`: Int = 8;
public const val `SQL_SSF_TRANSLATE`: Int = 16;
public const val `SQL_SSF_TRIM_BOTH`: Int = 32;
public const val `SQL_SSF_TRIM_LEADING`: Int = 64;
public const val `SQL_SSF_TRIM_TRAILING`: Int = 128;
public const val `SQL_SSF_UPPER`: Int = 4;
public const val `SQL_SS_ADDITIONS`: Int = 1;
public const val `SQL_SS_DELETIONS`: Int = 2;
// UNSUPPORTED Rust 5959:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SQL_SS_DL_DEFAULT: windows_sys::core::PCWSTR = windows_sys::core::w!("STATS.LOG");

public const val `SQL_SS_QI_DEFAULT`: UInt = 30000u;
// UNSUPPORTED Rust 5961:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SQL_SS_QL_DEFAULT: windows_sys::core::PCWSTR = windows_sys::core::w!("QUERY.LOG");

public const val `SQL_SS_UPDATES`: Int = 4;
public const val `SQL_SS_VARIANT`: Int = -150;
public const val `SQL_STANDARD_CLI_CONFORMANCE`: UInt = 166u;
public const val `SQL_STATIC_CURSOR_ATTRIBUTES1`: UInt = 167u;
public const val `SQL_STATIC_CURSOR_ATTRIBUTES2`: UInt = 168u;
public const val `SQL_STATIC_SENSITIVITY`: UInt = 83u;
public const val `SQL_STILL_EXECUTING`: UInt = 2u;
public const val `SQL_STMT_OPT_MAX`: UInt = 14u;
public const val `SQL_STMT_OPT_MIN`: UInt = 0u;
public const val `SQL_STRING_FUNCTIONS`: UInt = 50u;
public const val `SQL_SUBQUERIES`: UInt = 95u;
public const val `SQL_SUCCESS`: UInt = 0u;
public const val `SQL_SUCCESS_WITH_INFO`: UInt = 1u;
public const val `SQL_SU_DML_STATEMENTS`: Int = 1;
public const val `SQL_SU_INDEX_DEFINITION`: Int = 8;
public const val `SQL_SU_PRIVILEGE_DEFINITION`: Int = 16;
public const val `SQL_SU_PROCEDURE_INVOCATION`: Int = 2;
public const val `SQL_SU_TABLE_DEFINITION`: Int = 4;
public const val `SQL_SVE_CASE`: Int = 1;
public const val `SQL_SVE_CAST`: Int = 2;
public const val `SQL_SVE_COALESCE`: Int = 4;
public const val `SQL_SVE_NULLIF`: Int = 8;
public const val `SQL_SYSTEM_FUNCTIONS`: UInt = 51u;
public const val `SQL_TABLE_STAT`: UInt = 0u;
public const val `SQL_TABLE_TERM`: UInt = 45u;
public const val `SQL_TC_ALL`: UInt = 2u;
public const val `SQL_TC_DDL_COMMIT`: UInt = 3u;
public const val `SQL_TC_DDL_IGNORE`: UInt = 4u;
public const val `SQL_TC_DML`: UInt = 1u;
public const val `SQL_TC_NONE`: UInt = 0u;
public const val `SQL_TEXTPTR_LOGGING`: UInt = 1225u;
public const val `SQL_TIME`: UInt = 10u;
public const val `SQL_TIMEDATE_ADD_INTERVALS`: UInt = 109u;
public const val `SQL_TIMEDATE_DIFF_INTERVALS`: UInt = 110u;
public const val `SQL_TIMEDATE_FUNCTIONS`: UInt = 52u;
public const val `SQL_TIMESTAMP`: UInt = 11u;
public const val `SQL_TIMESTAMP_LEN`: UInt = 19u;
public const val `SQL_TIME_LEN`: UInt = 8u;
public const val `SQL_TINYINT`: Int = -6;
public const val `SQL_TL_DEFAULT`: Int = 1;
public const val `SQL_TL_OFF`: Int = 0;
public const val `SQL_TL_ON`: Int = 1;
public const val `SQL_TRANSACTION_CAPABLE`: UInt = 46u;
public const val `SQL_TRANSACTION_ISOLATION_OPTION`: UInt = 72u;
public const val `SQL_TRANSACTION_READ_COMMITTED`: Int = 2;
public const val `SQL_TRANSACTION_READ_UNCOMMITTED`: Int = 1;
public const val `SQL_TRANSACTION_REPEATABLE_READ`: Int = 4;
public const val `SQL_TRANSACTION_SERIALIZABLE`: Int = 8;
public const val `SQL_TRANSLATE_DLL`: UInt = 106u;
public const val `SQL_TRANSLATE_OPTION`: UInt = 107u;
public const val `SQL_TRUE`: UInt = 1u;
public const val `SQL_TXN_CAPABLE`: UInt = 46u;
public const val `SQL_TXN_ISOLATION`: UInt = 108u;
public const val `SQL_TXN_ISOLATION_OPTION`: UInt = 72u;
public const val `SQL_TXN_READ_COMMITTED`: Int = 2;
public const val `SQL_TXN_READ_UNCOMMITTED`: Int = 1;
public const val `SQL_TXN_REPEATABLE_READ`: Int = 4;
public const val `SQL_TXN_SERIALIZABLE`: Int = 8;
public const val `SQL_TXN_VERSIONING`: Int = 16;
public const val `SQL_TYPE_DATE`: UInt = 91u;
public const val `SQL_TYPE_DRIVER_END`: Int = -97;
public const val `SQL_TYPE_DRIVER_START`: Int = -80;
public const val `SQL_TYPE_MAX`: UInt = 12u;
public const val `SQL_TYPE_MIN`: Int = -7;
public const val `SQL_TYPE_NULL`: UInt = 0u;
public const val `SQL_TYPE_TIME`: UInt = 92u;
public const val `SQL_TYPE_TIMESTAMP`: UInt = 93u;
public const val `SQL_UB_DEFAULT`: UInt = 0u;
public const val `SQL_UB_FIXED`: UInt = 1u;
public const val `SQL_UB_OFF`: UInt = 0u;
public const val `SQL_UB_ON`: UInt = 1u;
public const val `SQL_UB_VARIABLE`: UInt = 2u;
public const val `SQL_UNBIND`: UInt = 2u;
public const val `SQL_UNICODE`: Int = -95;
public const val `SQL_UNICODE_CHAR`: Int = -95;
public const val `SQL_UNICODE_LONGVARCHAR`: Int = -97;
public const val `SQL_UNICODE_VARCHAR`: Int = -96;
public const val `SQL_UNION`: UInt = 96u;
public const val `SQL_UNION_STATEMENT`: UInt = 96u;
public const val `SQL_UNKNOWN_TYPE`: UInt = 0u;
public const val `SQL_UNNAMED`: UInt = 1u;
public const val `SQL_UNSEARCHABLE`: UInt = 0u;
public const val `SQL_UNSIGNED_OFFSET`: Int = -22;
public const val `SQL_UNSPECIFIED`: UInt = 0u;
public const val `SQL_UPDATE`: UInt = 2u;
public const val `SQL_UPDATE_BY_BOOKMARK`: UInt = 5u;
public const val `SQL_UP_DEFAULT`: Int = 1;
public const val `SQL_UP_OFF`: Int = 0;
public const val `SQL_UP_ON`: Int = 1;
public const val `SQL_UP_ON_DROP`: Int = 2;
public const val `SQL_USER_NAME`: UInt = 47u;
public const val `SQL_USE_BOOKMARKS`: UInt = 12u;
public const val `SQL_USE_PROCEDURE_FOR_PREPARE`: UInt = 1202u;
public const val `SQL_US_UNION`: Int = 1;
public const val `SQL_US_UNION_ALL`: Int = 2;
public const val `SQL_U_UNION`: Int = 1;
public const val `SQL_U_UNION_ALL`: Int = 2;
public const val `SQL_VARBINARY`: Int = -3;
public const val `SQL_VARCHAR`: UInt = 12u;
public const val `SQL_VARLEN_DATA`: Int = -10;
public const val `SQL_WARN_NO`: Int = 0;
public const val `SQL_WARN_YES`: Int = 1;
public const val `SQL_WCHAR`: Int = -8;
public const val `SQL_WLONGVARCHAR`: Int = -10;
public const val `SQL_WVARCHAR`: Int = -9;
public const val `SQL_XL_DEFAULT`: Int = 1;
public const val `SQL_XL_OFF`: Int = 0;
public const val `SQL_XL_ON`: Int = 1;
public const val `SQL_XOPEN_CLI_YEAR`: UInt = 10000u;
public const val `SQL_YEAR`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SQL_YEAR_MONTH_STRUCT` (
    public var `year`: UInt,
    public var `month`: UInt,
)
public const val `SQL_YEAR_TO_MONTH`: UInt = 7u;
public const val `SQLudtBINARY`: UInt = 3u;
public const val `SQLudtBIT`: UInt = 16u;
public const val `SQLudtBITN`: UInt = 0u;
public const val `SQLudtCHAR`: UInt = 1u;
public const val `SQLudtDATETIM4`: UInt = 22u;
public const val `SQLudtDATETIME`: UInt = 12u;
public const val `SQLudtDATETIMN`: UInt = 15u;
public const val `SQLudtDECML`: UInt = 24u;
public const val `SQLudtDECMLN`: UInt = 26u;
public const val `SQLudtFLT4`: UInt = 23u;
public const val `SQLudtFLT8`: UInt = 8u;
public const val `SQLudtFLTN`: UInt = 14u;
public const val `SQLudtIMAGE`: UInt = 20u;
public const val `SQLudtINT1`: UInt = 5u;
public const val `SQLudtINT2`: UInt = 6u;
public const val `SQLudtINT4`: UInt = 7u;
public const val `SQLudtINTN`: UInt = 13u;
public const val `SQLudtMONEY`: UInt = 11u;
public const val `SQLudtMONEY4`: UInt = 21u;
public const val `SQLudtMONEYN`: UInt = 17u;
public const val `SQLudtNUM`: UInt = 10u;
public const val `SQLudtNUMN`: UInt = 25u;
public const val `SQLudtSYSNAME`: UInt = 18u;
public const val `SQLudtTEXT`: UInt = 19u;
public const val `SQLudtTIMESTAMP`: UInt = 80u;
public const val `SQLudtUNIQUEIDENTIFIER`: UInt = 0u;
public const val `SQLudtVARBINARY`: UInt = 4u;
public const val `SQLudtVARCHAR`: UInt = 2u;
public const val `SQMO_DEFAULT_PROPERTY`: `STRUCTURED_QUERY_MULTIOPTION` = 1;
public const val `SQMO_GENERATOR_FOR_TYPE`: `STRUCTURED_QUERY_MULTIOPTION` = 2;
public const val `SQMO_MAP_PROPERTY`: `STRUCTURED_QUERY_MULTIOPTION` = 3;
public const val `SQMO_VIRTUAL_PROPERTY`: `STRUCTURED_QUERY_MULTIOPTION` = 0;
public const val `SQPE_EXTRA_CLOSING_PARENTHESIS`: `STRUCTURED_QUERY_PARSE_ERROR` = 2;
public const val `SQPE_EXTRA_OPENING_PARENTHESIS`: `STRUCTURED_QUERY_PARSE_ERROR` = 1;
public const val `SQPE_IGNORED_CONNECTOR`: `STRUCTURED_QUERY_PARSE_ERROR` = 4;
public const val `SQPE_IGNORED_KEYWORD`: `STRUCTURED_QUERY_PARSE_ERROR` = 5;
public const val `SQPE_IGNORED_MODIFIER`: `STRUCTURED_QUERY_PARSE_ERROR` = 3;
public const val `SQPE_NONE`: `STRUCTURED_QUERY_PARSE_ERROR` = 0;
public const val `SQPE_UNHANDLED`: `STRUCTURED_QUERY_PARSE_ERROR` = 6;
public const val `SQRO_ADD_ROBUST_ITEM_NAME`: `STRUCTURED_QUERY_RESOLVE_OPTION` = 512;
public const val `SQRO_ADD_VALUE_TYPE_FOR_PLAIN_VALUES`: `STRUCTURED_QUERY_RESOLVE_OPTION` = 256;
public const val `SQRO_ALWAYS_ONE_INTERVAL`: `STRUCTURED_QUERY_RESOLVE_OPTION` = 2;
public const val `SQRO_DEFAULT`: `STRUCTURED_QUERY_RESOLVE_OPTION` = 0;
public const val `SQRO_DONT_MAP_RELATIONS`: `STRUCTURED_QUERY_RESOLVE_OPTION` = 8;
public const val `SQRO_DONT_REMOVE_UNRESTRICTED_KEYWORDS`: `STRUCTURED_QUERY_RESOLVE_OPTION` = 32;
public const val `SQRO_DONT_RESOLVE_DATETIME`: `STRUCTURED_QUERY_RESOLVE_OPTION` = 1;
public const val `SQRO_DONT_RESOLVE_RANGES`: `STRUCTURED_QUERY_RESOLVE_OPTION` = 16;
public const val `SQRO_DONT_SIMPLIFY_CONDITION_TREES`: `STRUCTURED_QUERY_RESOLVE_OPTION` = 4;
public const val `SQRO_DONT_SPLIT_WORDS`: `STRUCTURED_QUERY_RESOLVE_OPTION` = 64;
public const val `SQRO_IGNORE_PHRASE_ORDER`: `STRUCTURED_QUERY_RESOLVE_OPTION` = 128;
public const val `SQSO_AUTOMATIC_WILDCARD`: `STRUCTURED_QUERY_SINGLE_OPTION` = 4;
public const val `SQSO_CONNECTOR_CASE`: `STRUCTURED_QUERY_SINGLE_OPTION` = 10;
public const val `SQSO_IMPLICIT_CONNECTOR`: `STRUCTURED_QUERY_SINGLE_OPTION` = 9;
public const val `SQSO_LANGUAGE_KEYWORDS`: `STRUCTURED_QUERY_SINGLE_OPTION` = 6;
public const val `SQSO_LOCALE_WORD_BREAKING`: `STRUCTURED_QUERY_SINGLE_OPTION` = 1;
public const val `SQSO_NATURAL_SYNTAX`: `STRUCTURED_QUERY_SINGLE_OPTION` = 3;
public const val `SQSO_SCHEMA`: `STRUCTURED_QUERY_SINGLE_OPTION` = 0;
public const val `SQSO_SYNTAX`: `STRUCTURED_QUERY_SINGLE_OPTION` = 7;
public const val `SQSO_TIME_ZONE`: `STRUCTURED_QUERY_SINGLE_OPTION` = 8;
public const val `SQSO_TRACE_LEVEL`: `STRUCTURED_QUERY_SINGLE_OPTION` = 5;
public const val `SQSO_WORD_BREAKER`: `STRUCTURED_QUERY_SINGLE_OPTION` = 2;
public const val `SQS_ADVANCED_QUERY_SYNTAX`: `STRUCTURED_QUERY_SYNTAX` = 1;
public const val `SQS_NATURAL_QUERY_SYNTAX`: `STRUCTURED_QUERY_SYNTAX` = 2;
public const val `SQS_NO_SYNTAX`: `STRUCTURED_QUERY_SYNTAX` = 0;
public const val `SRCH_SCHEMA_CACHE_E_UNEXPECTED`: Int = -2147208447;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SSERRORINFO` (
    public var `pwszMessage`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszServer`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszProcedure`: `windows_sys`.`core`.`PWSTR`,
    public var `lNative`: Int,
    public var `bState`: UByte,
    public var `bClass`: UByte,
    public var `wLineNumber`: UShort,
)
// UNSUPPORTED Rust 6155:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SSERRORINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SSPROPVAL_COMMANDTYPE_BULKLOAD`: UInt = 22u;
public const val `SSPROPVAL_COMMANDTYPE_REGULAR`: UInt = 21u;
public const val `SSPROPVAL_USEPROCFORPREP_OFF`: UInt = 0u;
public const val `SSPROPVAL_USEPROCFORPREP_ON`: UInt = 1u;
public const val `SSPROPVAL_USEPROCFORPREP_ON_DROP`: UInt = 2u;
public const val `SSPROP_ALLOWNATIVEVARIANT`: UInt = 3u;
public const val `SSPROP_AUTH_REPL_SERVER_NAME`: UInt = 14u;
public const val `SSPROP_CHARACTERSET`: UInt = 5u;
public const val `SSPROP_COLUMNLEVELCOLLATION`: UInt = 4u;
public const val `SSPROP_COL_COLLATIONNAME`: UInt = 14u;
public const val `SSPROP_CURRENTCOLLATION`: UInt = 7u;
public const val `SSPROP_CURSORAUTOFETCH`: UInt = 12u;
public const val `SSPROP_DEFERPREPARE`: UInt = 13u;
public const val `SSPROP_ENABLEFASTLOAD`: UInt = 2u;
public const val `SSPROP_FASTLOADKEEPIDENTITY`: UInt = 11u;
public const val `SSPROP_FASTLOADKEEPNULLS`: UInt = 10u;
public const val `SSPROP_FASTLOADOPTIONS`: UInt = 9u;
public const val `SSPROP_INIT_APPNAME`: UInt = 10u;
public const val `SSPROP_INIT_AUTOTRANSLATE`: UInt = 8u;
public const val `SSPROP_INIT_CURRENTLANGUAGE`: UInt = 4u;
public const val `SSPROP_INIT_ENCRYPT`: UInt = 13u;
public const val `SSPROP_INIT_FILENAME`: UInt = 12u;
public const val `SSPROP_INIT_NETWORKADDRESS`: UInt = 5u;
public const val `SSPROP_INIT_NETWORKLIBRARY`: UInt = 6u;
public const val `SSPROP_INIT_PACKETSIZE`: UInt = 9u;
public const val `SSPROP_INIT_TAGCOLUMNCOLLATION`: UInt = 15u;
public const val `SSPROP_INIT_USEPROCFORPREP`: UInt = 7u;
public const val `SSPROP_INIT_WSID`: UInt = 11u;
public const val `SSPROP_IRowsetFastLoad`: UInt = 14u;
public const val `SSPROP_MAXBLOBLENGTH`: UInt = 8u;
public const val `SSPROP_QUOTEDCATALOGNAMES`: UInt = 2u;
public const val `SSPROP_SORTORDER`: UInt = 6u;
public const val `SSPROP_SQLXMLXPROGID`: UInt = 4u;
public const val `SSPROP_STREAM_BASEPATH`: UInt = 17u;
public const val `SSPROP_STREAM_COMMANDTYPE`: UInt = 18u;
public const val `SSPROP_STREAM_CONTENTTYPE`: UInt = 23u;
public const val `SSPROP_STREAM_FLAGS`: UInt = 20u;
public const val `SSPROP_STREAM_MAPPINGSCHEMA`: UInt = 15u;
public const val `SSPROP_STREAM_XMLROOT`: UInt = 19u;
public const val `SSPROP_STREAM_XSL`: UInt = 16u;
public const val `SSPROP_UNICODECOMPARISONSTYLE`: UInt = 3u;
public const val `SSPROP_UNICODELCID`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SSVARIANT` (
    public var `vt`: UShort,
    public var `dwReserved1`: UInt,
    public var `dwReserved2`: UInt,
    public var `Anonymous`: `SSVARIANT_0`,
)
// UNSUPPORTED Rust 6211:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SSVARIANT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6217:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union SSVARIANT_0 {
//     pub bTinyIntVal: u8,
//     pub sShortIntVal: i16,
//     pub lIntVal: i32,
//     pub llBigIntVal: i64,
//     pub fltRealVal: f32,
//     pub dblFloatVal: f64,
//     pub cyMoneyVal: super::Com::CY,
//     pub NCharVal: SSVARIANT_0_0,
//     pub CharVal: SSVARIANT_0_1,
//     pub fBitVal: super::super::Foundation::VARIANT_BOOL,
//     pub rgbGuidVal: [u8; 16],
//     pub numNumericVal: DB_NUMERIC,
//     pub BinaryVal: SSVARIANT_0_2,
//     pub tsDateTimeVal: DBTIMESTAMP,
//     pub UnknownType: SSVARIANT_0_3,
//     pub BLOBType: SSVARIANT_0_4,
// }

// UNSUPPORTED Rust 6238:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SSVARIANT_0 {
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
public class `SSVARIANT_0_4` (
    public var `dbobj`: `DBOBJECT`,
    public var `pUnk`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 6251:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SSVARIANT_0_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SSVARIANT_0_2` (
    public var `sActualLength`: Short,
    public var `sMaxLength`: Short,
    public var `prgbBinaryVal`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `dwReserved`: UInt,
)
// UNSUPPORTED Rust 6266:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SSVARIANT_0_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 5 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SSVARIANT_0_1` (
    public var `sActualLength`: Short,
    public var `sMaxLength`: Short,
    public var `pchCharVal`: `windows_sys`.`core`.`PSTR`,
    public var `rgbReserved`: UByteArray,
    public var `dwReserved`: UInt,
    public var `pwchReserved`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 6283:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SSVARIANT_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 5 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SSVARIANT_0_0` (
    public var `sActualLength`: Short,
    public var `sMaxLength`: Short,
    public var `pwchNCharVal`: `windows_sys`.`core`.`PWSTR`,
    public var `rgbReserved`: UByteArray,
    public var `dwReserved`: UInt,
    public var `pwchReserved`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 6300:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SSVARIANT_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SSVARIANT_0_3` (
    public var `dwActualLength`: UInt,
    public var `rgMetadata`: UByteArray,
    public var `pUnknownData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 6314:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SSVARIANT_0_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STD_BOOKMARKLENGTH`: UInt = 1u;
public const val `STGM_COLLECTION`: Int = 8192;
public const val `STGM_OPEN`: Int = -2147483648;
public const val `STGM_OUTPUT`: Int = 32768;
public const val `STGM_RECURSIVE`: Int = 16777216;
public const val `STGM_STRICTOPEN`: Int = 1073741824;
public const val `STREAM_FLAGS_DISALLOW_ABSOLUTE_PATH`: UInt = 2u;
public const val `STREAM_FLAGS_DISALLOW_QUERY`: UInt = 4u;
public const val `STREAM_FLAGS_DISALLOW_UPDATEGRAMS`: UInt = 64u;
public const val `STREAM_FLAGS_DISALLOW_URL`: UInt = 1u;
public const val `STREAM_FLAGS_DONTCACHEMAPPINGSCHEMA`: UInt = 8u;
public const val `STREAM_FLAGS_DONTCACHETEMPLATE`: UInt = 16u;
public const val `STREAM_FLAGS_DONTCACHEXSL`: UInt = 32u;
public const val `STREAM_FLAGS_RESERVED`: UInt = 4294901760u;
public typealias `STRUCTURED_QUERY_MULTIOPTION` = Int;
public typealias `STRUCTURED_QUERY_PARSE_ERROR` = Int;
public typealias `STRUCTURED_QUERY_RESOLVE_OPTION` = Int;
public typealias `STRUCTURED_QUERY_SINGLE_OPTION` = Int;
public typealias `STRUCTURED_QUERY_SYNTAX` = Int;
public const val `STS_ABORTXMLPARSE`: Int = -2147211756;
public const val `STS_WS_ERROR`: Int = -2147211754;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SUBSCRIPTIONINFO` (
    public var `cbSize`: UInt,
    public var `fUpdateFlags`: UInt,
    public var `schedule`: `SUBSCRIPTIONSCHEDULE`,
    public var `customGroupCookie`: `windows_sys`.`core`.`GUID`,
    public var `pTrigger`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwRecurseLevels`: UInt,
    public var `fWebcrawlerFlags`: UInt,
    public var `bMailNotification`: `windows_sys`.`core`.`BOOL`,
    public var `bGleam`: `windows_sys`.`core`.`BOOL`,
    public var `bChangesOnly`: `windows_sys`.`core`.`BOOL`,
    public var `bNeedPassword`: `windows_sys`.`core`.`BOOL`,
    public var `fChannelFlags`: UInt,
    public var `bstrUserName`: `windows_sys`.`core`.`BSTR`,
    public var `bstrPassword`: `windows_sys`.`core`.`BSTR`,
    public var `bstrFriendlyName`: `windows_sys`.`core`.`BSTR`,
    public var `dwMaxSizeKB`: UInt,
    public var `subType`: `SUBSCRIPTIONTYPE`,
    public var `fTaskFlags`: UInt,
    public var `dwReserved`: UInt,
)
// UNSUPPORTED Rust 6364:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SUBSCRIPTIONINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SUBSCRIPTIONINFOFLAGS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SUBSCRIPTIONITEMINFO` (
    public var `cbSize`: UInt,
    public var `dwFlags`: UInt,
    public var `dwPriority`: UInt,
    public var `ScheduleGroup`: `windows_sys`.`core`.`GUID`,
    public var `clsidAgent`: `windows_sys`.`core`.`GUID`,
)
public typealias `SUBSCRIPTIONSCHEDULE` = Int;
public typealias `SUBSCRIPTIONTYPE` = Int;
public const val `SUBSINFO_ALLFLAGS`: UInt = 61311u;
public const val `SUBSINFO_CHANGESONLY`: `SUBSCRIPTIONINFOFLAGS` = 1024;
public const val `SUBSINFO_CHANNELFLAGS`: `SUBSCRIPTIONINFOFLAGS` = 2048;
public const val `SUBSINFO_FRIENDLYNAME`: `SUBSCRIPTIONINFOFLAGS` = 8192;
public const val `SUBSINFO_GLEAM`: `SUBSCRIPTIONINFOFLAGS` = 512;
public const val `SUBSINFO_MAILNOT`: `SUBSCRIPTIONINFOFLAGS` = 8;
public const val `SUBSINFO_MAXSIZEKB`: `SUBSCRIPTIONINFOFLAGS` = 16;
public const val `SUBSINFO_NEEDPASSWORD`: `SUBSCRIPTIONINFOFLAGS` = 16384;
public const val `SUBSINFO_PASSWORD`: `SUBSCRIPTIONINFOFLAGS` = 64;
public const val `SUBSINFO_RECURSE`: `SUBSCRIPTIONINFOFLAGS` = 2;
public const val `SUBSINFO_SCHEDULE`: `SUBSCRIPTIONINFOFLAGS` = 1;
public const val `SUBSINFO_TASKFLAGS`: `SUBSCRIPTIONINFOFLAGS` = 256;
public const val `SUBSINFO_TYPE`: `SUBSCRIPTIONINFOFLAGS` = 32768;
public const val `SUBSINFO_USER`: `SUBSCRIPTIONINFOFLAGS` = 32;
public const val `SUBSINFO_WEBCRAWL`: `SUBSCRIPTIONINFOFLAGS` = 4;
public const val `SUBSMGRENUM_MASK`: UInt = 1u;
public const val `SUBSMGRENUM_TEMP`: UInt = 1u;
public const val `SUBSMGRUPDATE_MASK`: UInt = 1u;
public const val `SUBSMGRUPDATE_MINIMIZE`: UInt = 1u;
public const val `SUBSSCHED_AUTO`: `SUBSCRIPTIONSCHEDULE` = 0;
public const val `SUBSSCHED_CUSTOM`: `SUBSCRIPTIONSCHEDULE` = 3;
public const val `SUBSSCHED_DAILY`: `SUBSCRIPTIONSCHEDULE` = 1;
public const val `SUBSSCHED_MANUAL`: `SUBSCRIPTIONSCHEDULE` = 4;
public const val `SUBSSCHED_WEEKLY`: `SUBSCRIPTIONSCHEDULE` = 2;
public const val `SUBSTYPE_CHANNEL`: `SUBSCRIPTIONTYPE` = 1;
public const val `SUBSTYPE_DESKTOPCHANNEL`: `SUBSCRIPTIONTYPE` = 4;
public const val `SUBSTYPE_DESKTOPURL`: `SUBSCRIPTIONTYPE` = 2;
public const val `SUBSTYPE_EXTERNAL`: `SUBSCRIPTIONTYPE` = 3;
public const val `SUBSTYPE_URL`: `SUBSCRIPTIONTYPE` = 0;
public const val `SUCCEED`: UInt = 1u;
public const val `SUCCEED_ABORT`: UInt = 2u;
public const val `SUCCEED_ASYNC`: UInt = 3u;
// UNSUPPORTED Rust 6413:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SubscriptionMgr: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xabbe31d0_6dae_11d0_beca_00c04fd940be);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TEXT_SOURCE` (
    public var `pfnFillTextBuffer`: `PFNFILLTEXTBUFFER`,
    public var `awcBuffer`: `windows_sys`.`core`.`PCWSTR`,
    public var `iEnd`: UInt,
    public var `iCur`: UInt,
)
// UNSUPPORTED Rust 6422:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TEXT_SOURCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TIMEOUT_INFO` (
    public var `dwSize`: UInt,
    public var `dwConnectTimeout`: UInt,
    public var `dwDataTimeout`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TIMESTAMP_STRUCT` (
    public var `year`: Short,
    public var `month`: UShort,
    public var `day`: UShort,
    public var `hour`: UShort,
    public var `minute`: UShort,
    public var `second`: UShort,
    public var `fraction`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TIME_STRUCT` (
    public var `hour`: UShort,
    public var `minute`: UShort,
    public var `second`: UShort,
)
public const val `TRACE_ON`: Int = 1;
public const val `TRACE_VERSION`: UInt = 1000u;
public const val `TRACE_VS_EVENT_ON`: Int = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_IndexServer", feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VECTORRESTRICTION` (
    public var `Node`: `NODERESTRICTION`,
    public var `RankMethod`: UInt,
)
public const val `VT_SS_BINARY`: `SQLVARENUM` = 207;
public const val `VT_SS_BIT`: `SQLVARENUM` = 11;
public const val `VT_SS_DATETIME`: `SQLVARENUM` = 135;
public const val `VT_SS_DECIMAL`: `SQLVARENUM` = 205;
public const val `VT_SS_EMPTY`: `SQLVARENUM` = 0;
public const val `VT_SS_GUID`: `SQLVARENUM` = 72;
public const val `VT_SS_I2`: `SQLVARENUM` = 2;
public const val `VT_SS_I4`: `SQLVARENUM` = 3;
public const val `VT_SS_I8`: `SQLVARENUM` = 20;
public const val `VT_SS_MONEY`: `SQLVARENUM` = 6;
public const val `VT_SS_NULL`: `SQLVARENUM` = 1;
public const val `VT_SS_NUMERIC`: `SQLVARENUM` = 131;
public const val `VT_SS_R4`: `SQLVARENUM` = 4;
public const val `VT_SS_R8`: `SQLVARENUM` = 5;
public const val `VT_SS_SMALLDATETIME`: `SQLVARENUM` = 206;
public const val `VT_SS_SMALLMONEY`: `SQLVARENUM` = 200;
public const val `VT_SS_STRING`: `SQLVARENUM` = 203;
public const val `VT_SS_UI1`: `SQLVARENUM` = 17;
public const val `VT_SS_UNKNOWN`: `SQLVARENUM` = 209;
public const val `VT_SS_VARBINARY`: `SQLVARENUM` = 208;
public const val `VT_SS_VARSTRING`: `SQLVARENUM` = 204;
public const val `VT_SS_WSTRING`: `SQLVARENUM` = 201;
public const val `VT_SS_WVARSTRING`: `SQLVARENUM` = 202;
public const val `WEBCRAWL_DONT_MAKE_STICKY`: `WEBCRAWL_RECURSEFLAGS` = 1;
public const val `WEBCRAWL_GET_BGSOUNDS`: `WEBCRAWL_RECURSEFLAGS` = 8;
public const val `WEBCRAWL_GET_CONTROLS`: `WEBCRAWL_RECURSEFLAGS` = 16;
public const val `WEBCRAWL_GET_IMAGES`: `WEBCRAWL_RECURSEFLAGS` = 2;
public const val `WEBCRAWL_GET_VIDEOS`: `WEBCRAWL_RECURSEFLAGS` = 4;
public const val `WEBCRAWL_IGNORE_ROBOTSTXT`: `WEBCRAWL_RECURSEFLAGS` = 128;
public const val `WEBCRAWL_LINKS_ELSEWHERE`: `WEBCRAWL_RECURSEFLAGS` = 32;
public const val `WEBCRAWL_ONLY_LINKS_TO_HTML`: `WEBCRAWL_RECURSEFLAGS` = 256;
public typealias `WEBCRAWL_RECURSEFLAGS` = Int;
public const val `XML_E_BADSXQL`: Int = -2147212799;
public const val `XML_E_NODEFAULTNS`: Int = -2147212800;
public const val `_MAPI_E_ACCOUNT_DISABLED`: Int = -2147221212;
public const val `_MAPI_E_BAD_CHARWIDTH`: Int = -2147221245;
public const val `_MAPI_E_BAD_COLUMN`: Int = -2147221224;
public const val `_MAPI_E_BUSY`: Int = -2147221237;
public const val `_MAPI_E_COMPUTED`: Int = -2147221222;
public const val `_MAPI_E_CORRUPT_DATA`: Int = -2147221221;
public const val `_MAPI_E_DISK_ERROR`: Int = -2147221226;
public const val `_MAPI_E_END_OF_SESSION`: Int = -2147220992;
public const val `_MAPI_E_EXTENDED_ERROR`: Int = -2147221223;
public const val `_MAPI_E_FAILONEPROVIDER`: Int = -2147221219;
public const val `_MAPI_E_INVALID_ACCESS_TIME`: Int = -2147221213;
public const val `_MAPI_E_INVALID_ENTRYID`: Int = -2147221241;
public const val `_MAPI_E_INVALID_OBJECT`: Int = -2147221240;
public const val `_MAPI_E_INVALID_WORKSTATION_ACCOUNT`: Int = -2147221214;
public const val `_MAPI_E_LOGON_FAILED`: Int = -2147221231;
public const val `_MAPI_E_MISSING_REQUIRED_COLUMN`: Int = -2147220990;
public const val `_MAPI_E_NETWORK_ERROR`: Int = -2147221227;
public const val `_MAPI_E_NOT_ENOUGH_DISK`: Int = -2147221235;
public const val `_MAPI_E_NOT_ENOUGH_RESOURCES`: Int = -2147221234;
public const val `_MAPI_E_NOT_FOUND`: Int = -2147221233;
public const val `_MAPI_E_NO_SUPPORT`: Int = -2147221246;
public const val `_MAPI_E_OBJECT_CHANGED`: Int = -2147221239;
public const val `_MAPI_E_OBJECT_DELETED`: Int = -2147221238;
public const val `_MAPI_E_PASSWORD_CHANGE_REQUIRED`: Int = -2147221216;
public const val `_MAPI_E_PASSWORD_EXPIRED`: Int = -2147221215;
public const val `_MAPI_E_SESSION_LIMIT`: Int = -2147221230;
public const val `_MAPI_E_STRING_TOO_LONG`: Int = -2147221243;
public const val `_MAPI_E_TOO_COMPLEX`: Int = -2147221225;
public const val `_MAPI_E_UNABLE_TO_ABORT`: Int = -2147221228;
public const val `_MAPI_E_UNCONFIGURED`: Int = -2147221220;
public const val `_MAPI_E_UNKNOWN_CPID`: Int = -2147221218;
public const val `_MAPI_E_UNKNOWN_ENTRYID`: Int = -2147220991;
public const val `_MAPI_E_UNKNOWN_FLAGS`: Int = -2147221242;
public const val `_MAPI_E_UNKNOWN_LCID`: Int = -2147221217;
public const val `_MAPI_E_USER_CANCEL`: Int = -2147221229;
public const val `_MAPI_E_VERSION`: Int = -2147221232;
public const val `_MAPI_W_NO_SERVICE`: Int = 262659;
public const val `eAUTH_TYPE_ANONYMOUS`: `AUTH_TYPE` = 0;
public const val `eAUTH_TYPE_BASIC`: `AUTH_TYPE` = 2;
public const val `eAUTH_TYPE_NTLM`: `AUTH_TYPE` = 1;
