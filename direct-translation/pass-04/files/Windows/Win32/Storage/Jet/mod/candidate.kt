// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetAddColumnA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetAddColumnA`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `szcolumnname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `pcolumndef` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_COLUMNDEF`>?, `pvdefault` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbdefault` : UInt, `pcolumnid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetAddColumnW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetAddColumnW`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `szcolumnname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pcolumndef` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_COLUMNDEF`>?, `pvdefault` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbdefault` : UInt, `pcolumnid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetAttachDatabase2A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetAttachDatabase2A`(`sesid` : `JET_SESID`, `szfilename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `cpgdatabasesizemax` : UInt, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetAttachDatabase2W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetAttachDatabase2W`(`sesid` : `JET_SESID`, `szfilename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cpgdatabasesizemax` : UInt, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetAttachDatabaseA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetAttachDatabaseA`(`sesid` : `JET_SESID`, `szfilename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetAttachDatabaseW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetAttachDatabaseW`(`sesid` : `JET_SESID`, `szfilename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetBackupA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetBackupA`(`szbackuppath` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `grbit` : UInt, `pfnstatus` : `JET_PFNSTATUS`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetBackupInstanceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetBackupInstanceA`(`instance` : `JET_INSTANCE`, `szbackuppath` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `grbit` : UInt, `pfnstatus` : `JET_PFNSTATUS`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetBackupInstanceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetBackupInstanceW`(`instance` : `JET_INSTANCE`, `szbackuppath` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `grbit` : UInt, `pfnstatus` : `JET_PFNSTATUS`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetBackupW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetBackupW`(`szbackuppath` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `grbit` : UInt, `pfnstatus` : `JET_PFNSTATUS`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetBeginExternalBackup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetBeginExternalBackup`(`grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetBeginExternalBackupInstance; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetBeginExternalBackupInstance`(`instance` : `JET_INSTANCE`, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetBeginSessionA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetBeginSessionA`(`instance` : `JET_INSTANCE`, `psesid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_SESID`>?, `szusername` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `szpassword` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetBeginSessionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetBeginSessionW`(`instance` : `JET_INSTANCE`, `psesid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_SESID`>?, `szusername` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `szpassword` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetBeginTransaction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetBeginTransaction`(`sesid` : `JET_SESID`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetBeginTransaction2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetBeginTransaction2`(`sesid` : `JET_SESID`, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetBeginTransaction3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetBeginTransaction3`(`sesid` : `JET_SESID`, `trxid` : Long, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCloseDatabase; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetCloseDatabase`(`sesid` : `JET_SESID`, `dbid` : UInt, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCloseFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetCloseFile`(`hffile` : `super`.`StructuredStorage`.`JET_HANDLE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCloseFileInstance; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetCloseFileInstance`(`instance` : `JET_INSTANCE`, `hffile` : `super`.`StructuredStorage`.`JET_HANDLE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCloseTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetCloseTable`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCommitTransaction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetCommitTransaction`(`sesid` : `JET_SESID`, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCommitTransaction2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetCommitTransaction2`(`sesid` : `JET_SESID`, `grbit` : UInt, `cmsecdurablecommit` : UInt, `pcommitid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_COMMIT_ID`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCompactA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetCompactA`(`sesid` : `JET_SESID`, `szdatabasesrc` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `szdatabasedest` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `pfnstatus` : `JET_PFNSTATUS`, `pconvert` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_CONVERT_A`>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCompactW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetCompactW`(`sesid` : `JET_SESID`, `szdatabasesrc` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `szdatabasedest` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pfnstatus` : `JET_PFNSTATUS`, `pconvert` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_CONVERT_W`>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetComputeStats; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetComputeStats`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetConfigureProcessForCrashDump; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetConfigureProcessForCrashDump`(`grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCreateDatabase2A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetCreateDatabase2A`(`sesid` : `JET_SESID`, `szfilename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `cpgdatabasesizemax` : UInt, `pdbid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCreateDatabase2W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetCreateDatabase2W`(`sesid` : `JET_SESID`, `szfilename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cpgdatabasesizemax` : UInt, `pdbid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCreateDatabaseA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetCreateDatabaseA`(`sesid` : `JET_SESID`, `szfilename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `szconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `pdbid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCreateDatabaseW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetCreateDatabaseW`(`sesid` : `JET_SESID`, `szfilename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `szconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pdbid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCreateIndex2A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetCreateIndex2A`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `pindexcreate` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_INDEXCREATE_A`>?, `cindexcreate` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCreateIndex2W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetCreateIndex2W`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `pindexcreate` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_INDEXCREATE_W`>?, `cindexcreate` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCreateIndex3A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetCreateIndex3A`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `pindexcreate` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_INDEXCREATE2_A`>?, `cindexcreate` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCreateIndex3W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetCreateIndex3W`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `pindexcreate` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_INDEXCREATE2_W`>?, `cindexcreate` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCreateIndex4A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetCreateIndex4A`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `pindexcreate` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_INDEXCREATE3_A`>?, `cindexcreate` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCreateIndex4W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetCreateIndex4W`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `pindexcreate` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_INDEXCREATE3_W`>?, `cindexcreate` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCreateIndexA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetCreateIndexA`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `szindexname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `grbit` : UInt, `szkey` : `windows_sys`.`core`.`PCSTR`, `cbkey` : UInt, `ldensity` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCreateIndexW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetCreateIndexW`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `szindexname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `grbit` : UInt, `szkey` : `windows_sys`.`core`.`PCWSTR`, `cbkey` : UInt, `ldensity` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCreateInstance2A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetCreateInstance2A`(`pinstance` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_INSTANCE`>?, `szinstancename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `szdisplayname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCreateInstance2W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetCreateInstance2W`(`pinstance` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_INSTANCE`>?, `szinstancename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `szdisplayname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCreateInstanceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetCreateInstanceA`(`pinstance` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_INSTANCE`>?, `szinstancename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCreateInstanceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetCreateInstanceW`(`pinstance` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_INSTANCE`>?, `szinstancename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCreateTableA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetCreateTableA`(`sesid` : `JET_SESID`, `dbid` : UInt, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `lpages` : UInt, `ldensity` : UInt, `ptableid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`StructuredStorage`.`JET_TABLEID`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCreateTableColumnIndex2A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetCreateTableColumnIndex2A`(`sesid` : `JET_SESID`, `dbid` : UInt, `ptablecreate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_TABLECREATE2_A`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCreateTableColumnIndex2W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetCreateTableColumnIndex2W`(`sesid` : `JET_SESID`, `dbid` : UInt, `ptablecreate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_TABLECREATE2_W`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCreateTableColumnIndex3A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetCreateTableColumnIndex3A`(`sesid` : `JET_SESID`, `dbid` : UInt, `ptablecreate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_TABLECREATE3_A`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCreateTableColumnIndex3W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetCreateTableColumnIndex3W`(`sesid` : `JET_SESID`, `dbid` : UInt, `ptablecreate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_TABLECREATE3_W`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCreateTableColumnIndex4A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetCreateTableColumnIndex4A`(`sesid` : `JET_SESID`, `dbid` : UInt, `ptablecreate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_TABLECREATE4_A`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCreateTableColumnIndex4W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetCreateTableColumnIndex4W`(`sesid` : `JET_SESID`, `dbid` : UInt, `ptablecreate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_TABLECREATE4_W`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCreateTableColumnIndexA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetCreateTableColumnIndexA`(`sesid` : `JET_SESID`, `dbid` : UInt, `ptablecreate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_TABLECREATE_A`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCreateTableColumnIndexW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetCreateTableColumnIndexW`(`sesid` : `JET_SESID`, `dbid` : UInt, `ptablecreate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_TABLECREATE_W`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetCreateTableW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetCreateTableW`(`sesid` : `JET_SESID`, `dbid` : UInt, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `lpages` : UInt, `ldensity` : UInt, `ptableid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`StructuredStorage`.`JET_TABLEID`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetDefragment2A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetDefragment2A`(`sesid` : `JET_SESID`, `dbid` : UInt, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `pcpasses` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pcseconds` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `callback` : `JET_CALLBACK`, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetDefragment2W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetDefragment2W`(`sesid` : `JET_SESID`, `dbid` : UInt, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pcpasses` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pcseconds` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `callback` : `JET_CALLBACK`, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetDefragment3A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetDefragment3A`(`sesid` : `JET_SESID`, `szdatabasename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `pcpasses` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pcseconds` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `callback` : `JET_CALLBACK`, `pvcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetDefragment3W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetDefragment3W`(`sesid` : `JET_SESID`, `szdatabasename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pcpasses` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pcseconds` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `callback` : `JET_CALLBACK`, `pvcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetDefragmentA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetDefragmentA`(`sesid` : `JET_SESID`, `dbid` : UInt, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `pcpasses` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pcseconds` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetDefragmentW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetDefragmentW`(`sesid` : `JET_SESID`, `dbid` : UInt, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pcpasses` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pcseconds` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetDelete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetDelete`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetDeleteColumn2A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetDeleteColumn2A`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `szcolumnname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetDeleteColumn2W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetDeleteColumn2W`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `szcolumnname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetDeleteColumnA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetDeleteColumnA`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `szcolumnname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetDeleteColumnW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetDeleteColumnW`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `szcolumnname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetDeleteIndexA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetDeleteIndexA`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `szindexname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetDeleteIndexW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetDeleteIndexW`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `szindexname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetDeleteTableA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetDeleteTableA`(`sesid` : `JET_SESID`, `dbid` : UInt, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetDeleteTableW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetDeleteTableW`(`sesid` : `JET_SESID`, `dbid` : UInt, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetDetachDatabase2A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetDetachDatabase2A`(`sesid` : `JET_SESID`, `szfilename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetDetachDatabase2W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetDetachDatabase2W`(`sesid` : `JET_SESID`, `szfilename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetDetachDatabaseA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetDetachDatabaseA`(`sesid` : `JET_SESID`, `szfilename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetDetachDatabaseW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetDetachDatabaseW`(`sesid` : `JET_SESID`, `szfilename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetDupCursor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetDupCursor`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `ptableid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`StructuredStorage`.`JET_TABLEID`>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetDupSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetDupSession`(`sesid` : `JET_SESID`, `psesid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_SESID`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetEnableMultiInstanceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetEnableMultiInstanceA`(`psetsysparam` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_SETSYSPARAM_A`>?, `csetsysparam` : UInt, `pcsetsucceed` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetEnableMultiInstanceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetEnableMultiInstanceW`(`psetsysparam` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_SETSYSPARAM_W`>?, `csetsysparam` : UInt, `pcsetsucceed` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetEndExternalBackup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetEndExternalBackup`() : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetEndExternalBackupInstance; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetEndExternalBackupInstance`(`instance` : `JET_INSTANCE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetEndExternalBackupInstance2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetEndExternalBackupInstance2`(`instance` : `JET_INSTANCE`, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetEndSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetEndSession`(`sesid` : `JET_SESID`, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetEnumerateColumns; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetEnumerateColumns`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `cenumcolumnid` : UInt, `rgenumcolumnid` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_ENUMCOLUMNID`>?, `pcenumcolumn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `prgenumcolumn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`JET_ENUMCOLUMN`>>?, `pfnrealloc` : `JET_PFNREALLOC`, `pvrealloccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbdatamost` : UInt, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetEscrowUpdate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetEscrowUpdate`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `columnid` : UInt, `pv` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbmax` : UInt, `pvold` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cboldmax` : UInt, `pcboldactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetExternalRestore2A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetExternalRestore2A`(`szcheckpointfilepath` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `szlogpath` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `rgrstmap` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_RSTMAP_A`>?, `crstfilemap` : Int, `szbackuplogpath` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `ploginfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_LOGINFO_A`>?, `sztargetinstancename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `sztargetinstancelogpath` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `sztargetinstancecheckpointpath` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `pfn` : `JET_PFNSTATUS`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetExternalRestore2W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetExternalRestore2W`(`szcheckpointfilepath` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `szlogpath` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `rgrstmap` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_RSTMAP_W`>?, `crstfilemap` : Int, `szbackuplogpath` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `ploginfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_LOGINFO_W`>?, `sztargetinstancename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `sztargetinstancelogpath` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `sztargetinstancecheckpointpath` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pfn` : `JET_PFNSTATUS`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetExternalRestoreA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetExternalRestoreA`(`szcheckpointfilepath` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `szlogpath` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `rgrstmap` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_RSTMAP_A`>?, `crstfilemap` : Int, `szbackuplogpath` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `genlow` : Int, `genhigh` : Int, `pfn` : `JET_PFNSTATUS`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetExternalRestoreW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetExternalRestoreW`(`szcheckpointfilepath` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `szlogpath` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `rgrstmap` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_RSTMAP_W`>?, `crstfilemap` : Int, `szbackuplogpath` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `genlow` : Int, `genhigh` : Int, `pfn` : `JET_PFNSTATUS`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetFreeBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetFreeBuffer`(`pbbuf` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetAttachInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetGetAttachInfoA`(`szzdatabases` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `cbmax` : UInt, `pcbactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetAttachInfoInstanceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetGetAttachInfoInstanceA`(`instance` : `JET_INSTANCE`, `szzdatabases` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `cbmax` : UInt, `pcbactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetAttachInfoInstanceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetGetAttachInfoInstanceW`(`instance` : `JET_INSTANCE`, `szzdatabases` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cbmax` : UInt, `pcbactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetAttachInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetGetAttachInfoW`(`wszzdatabases` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cbmax` : UInt, `pcbactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetBookmark; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetGetBookmark`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `pvbookmark` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbmax` : UInt, `pcbactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetColumnInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetGetColumnInfoA`(`sesid` : `JET_SESID`, `dbid` : UInt, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `pcolumnnameorid` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `pvresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbmax` : UInt, `infolevel` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetColumnInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetGetColumnInfoW`(`sesid` : `JET_SESID`, `dbid` : UInt, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pwcolumnnameorid` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pvresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbmax` : UInt, `infolevel` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetCurrentIndexA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetGetCurrentIndexA`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `szindexname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `cbindexname` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetCurrentIndexW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetGetCurrentIndexW`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `szindexname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cbindexname` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetCursorInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetGetCursorInfo`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `pvresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbmax` : UInt, `infolevel` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetDatabaseFileInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetGetDatabaseFileInfoA`(`szdatabasename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `pvresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbmax` : UInt, `infolevel` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetDatabaseFileInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetGetDatabaseFileInfoW`(`szdatabasename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pvresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbmax` : UInt, `infolevel` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetDatabaseInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetGetDatabaseInfoA`(`sesid` : `JET_SESID`, `dbid` : UInt, `pvresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbmax` : UInt, `infolevel` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetDatabaseInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetGetDatabaseInfoW`(`sesid` : `JET_SESID`, `dbid` : UInt, `pvresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbmax` : UInt, `infolevel` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetErrorInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetGetErrorInfoW`(`pvcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pvresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbmax` : UInt, `infolevel` : UInt, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetIndexInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetGetIndexInfoA`(`sesid` : `JET_SESID`, `dbid` : UInt, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `szindexname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `pvresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbresult` : UInt, `infolevel` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetIndexInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetGetIndexInfoW`(`sesid` : `JET_SESID`, `dbid` : UInt, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `szindexname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pvresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbresult` : UInt, `infolevel` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetInstanceInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetGetInstanceInfoA`(`pcinstanceinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `painstanceinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`JET_INSTANCE_INFO_A`>>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetInstanceInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetGetInstanceInfoW`(`pcinstanceinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `painstanceinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`JET_INSTANCE_INFO_W`>>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetInstanceMiscInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetGetInstanceMiscInfo`(`instance` : `JET_INSTANCE`, `pvresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbmax` : UInt, `infolevel` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetLS; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetGetLS`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `pls` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_LS`>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetLock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetGetLock`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetLogInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetGetLogInfoA`(`szzlogs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `cbmax` : UInt, `pcbactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetLogInfoInstance2A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetGetLogInfoInstance2A`(`instance` : `JET_INSTANCE`, `szzlogs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `cbmax` : UInt, `pcbactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ploginfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_LOGINFO_A`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetLogInfoInstance2W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetGetLogInfoInstance2W`(`instance` : `JET_INSTANCE`, `wszzlogs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cbmax` : UInt, `pcbactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ploginfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_LOGINFO_W`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetLogInfoInstanceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetGetLogInfoInstanceA`(`instance` : `JET_INSTANCE`, `szzlogs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `cbmax` : UInt, `pcbactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetLogInfoInstanceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetGetLogInfoInstanceW`(`instance` : `JET_INSTANCE`, `wszzlogs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cbmax` : UInt, `pcbactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetLogInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetGetLogInfoW`(`szzlogs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cbmax` : UInt, `pcbactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetObjectInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetGetObjectInfoA`(`sesid` : `JET_SESID`, `dbid` : UInt, `objtyp` : UInt, `szcontainername` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `szobjectname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `pvresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbmax` : UInt, `infolevel` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetObjectInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetGetObjectInfoW`(`sesid` : `JET_SESID`, `dbid` : UInt, `objtyp` : UInt, `szcontainername` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `szobjectname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pvresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbmax` : UInt, `infolevel` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetRecordPosition; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetGetRecordPosition`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `precpos` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_RECPOS`>?, `cbrecpos` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetRecordSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetGetRecordSize`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `precsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_RECSIZE`>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetRecordSize2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetGetRecordSize2`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `precsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_RECSIZE2`>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetSecondaryIndexBookmark; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetGetSecondaryIndexBookmark`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `pvsecondarykey` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbsecondarykeymax` : UInt, `pcbsecondarykeyactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pvprimarybookmark` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbprimarybookmarkmax` : UInt, `pcbprimarybookmarkactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetSessionParameter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetGetSessionParameter`(`sesid` : `JET_SESID`, `sesparamid` : UInt, `pvparam` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbparammax` : UInt, `pcbparamactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetSystemParameterA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetGetSystemParameterA`(`instance` : `JET_INSTANCE`, `sesid` : `JET_SESID`, `paramid` : UInt, `plparam` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`StructuredStorage`.`JET_API_PTR`>?, `szparam` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `cbmax` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetSystemParameterW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetGetSystemParameterW`(`instance` : `JET_INSTANCE`, `sesid` : `JET_SESID`, `paramid` : UInt, `plparam` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`StructuredStorage`.`JET_API_PTR`>?, `szparam` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cbmax` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetTableColumnInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetGetTableColumnInfoA`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `szcolumnname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `pvresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbmax` : UInt, `infolevel` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetTableColumnInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetGetTableColumnInfoW`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `szcolumnname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pvresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbmax` : UInt, `infolevel` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetTableIndexInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetGetTableIndexInfoA`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `szindexname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `pvresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbresult` : UInt, `infolevel` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetTableIndexInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetGetTableIndexInfoW`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `szindexname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pvresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbresult` : UInt, `infolevel` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetTableInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetGetTableInfoA`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `pvresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbmax` : UInt, `infolevel` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetTableInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetGetTableInfoW`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `pvresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbmax` : UInt, `infolevel` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetThreadStats; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetGetThreadStats`(`pvresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbmax` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetTruncateLogInfoInstanceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetGetTruncateLogInfoInstanceA`(`instance` : `JET_INSTANCE`, `szzlogs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `cbmax` : UInt, `pcbactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetTruncateLogInfoInstanceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetGetTruncateLogInfoInstanceW`(`instance` : `JET_INSTANCE`, `wszzlogs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cbmax` : UInt, `pcbactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGetVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetGetVersion`(`sesid` : `JET_SESID`, `pwversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGotoBookmark; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetGotoBookmark`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `pvbookmark` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbbookmark` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGotoPosition; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetGotoPosition`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `precpos` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_RECPOS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGotoSecondaryIndexBookmark; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetGotoSecondaryIndexBookmark`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `pvsecondarykey` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbsecondarykey` : UInt, `pvprimarybookmark` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbprimarybookmark` : UInt, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetGrowDatabase; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetGrowDatabase`(`sesid` : `JET_SESID`, `dbid` : UInt, `cpg` : UInt, `pcpgreal` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetIdle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetIdle`(`sesid` : `JET_SESID`, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetIndexRecordCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetIndexRecordCount`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `pcrec` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `crecmax` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetInit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetInit`(`pinstance` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_INSTANCE`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetInit2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetInit2`(`pinstance` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_INSTANCE`>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetInit3A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetInit3A`(`pinstance` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_INSTANCE`>?, `prstinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_RSTINFO_A`>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetInit3W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetInit3W`(`pinstance` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_INSTANCE`>?, `prstinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_RSTINFO_W`>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetIntersectIndexes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetIntersectIndexes`(`sesid` : `JET_SESID`, `rgindexrange` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_INDEXRANGE`>?, `cindexrange` : UInt, `precordlist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_RECORDLIST`>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetMakeKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetMakeKey`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `pvdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbdata` : UInt, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetMove; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetMove`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `crow` : Int, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetOSSnapshotAbort; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetOSSnapshotAbort`(`snapid` : `JET_OSSNAPID`, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetOSSnapshotEnd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetOSSnapshotEnd`(`snapid` : `JET_OSSNAPID`, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetOSSnapshotFreezeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetOSSnapshotFreezeA`(`snapid` : `JET_OSSNAPID`, `pcinstanceinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `painstanceinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`JET_INSTANCE_INFO_A`>>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetOSSnapshotFreezeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetOSSnapshotFreezeW`(`snapid` : `JET_OSSNAPID`, `pcinstanceinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `painstanceinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`JET_INSTANCE_INFO_W`>>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetOSSnapshotGetFreezeInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetOSSnapshotGetFreezeInfoA`(`snapid` : `JET_OSSNAPID`, `pcinstanceinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `painstanceinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`JET_INSTANCE_INFO_A`>>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetOSSnapshotGetFreezeInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetOSSnapshotGetFreezeInfoW`(`snapid` : `JET_OSSNAPID`, `pcinstanceinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `painstanceinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`JET_INSTANCE_INFO_W`>>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetOSSnapshotPrepare; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetOSSnapshotPrepare`(`psnapid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_OSSNAPID`>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetOSSnapshotPrepareInstance; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetOSSnapshotPrepareInstance`(`snapid` : `JET_OSSNAPID`, `instance` : `JET_INSTANCE`, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetOSSnapshotThaw; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetOSSnapshotThaw`(`snapid` : `JET_OSSNAPID`, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetOSSnapshotTruncateLog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetOSSnapshotTruncateLog`(`snapid` : `JET_OSSNAPID`, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetOSSnapshotTruncateLogInstance; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetOSSnapshotTruncateLogInstance`(`snapid` : `JET_OSSNAPID`, `instance` : `JET_INSTANCE`, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetOpenDatabaseA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetOpenDatabaseA`(`sesid` : `JET_SESID`, `szfilename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `szconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `pdbid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetOpenDatabaseW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetOpenDatabaseW`(`sesid` : `JET_SESID`, `szfilename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `szconnect` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pdbid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetOpenFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetOpenFileA`(`szfilename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `phffile` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`StructuredStorage`.`JET_HANDLE`>?, `pulfilesizelow` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pulfilesizehigh` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetOpenFileInstanceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetOpenFileInstanceA`(`instance` : `JET_INSTANCE`, `szfilename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `phffile` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`StructuredStorage`.`JET_HANDLE`>?, `pulfilesizelow` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pulfilesizehigh` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetOpenFileInstanceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetOpenFileInstanceW`(`instance` : `JET_INSTANCE`, `szfilename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `phffile` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`StructuredStorage`.`JET_HANDLE`>?, `pulfilesizelow` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pulfilesizehigh` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetOpenFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetOpenFileW`(`szfilename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `phffile` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`StructuredStorage`.`JET_HANDLE`>?, `pulfilesizelow` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pulfilesizehigh` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetOpenTableA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetOpenTableA`(`sesid` : `JET_SESID`, `dbid` : UInt, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `pvparameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbparameters` : UInt, `grbit` : UInt, `ptableid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`StructuredStorage`.`JET_TABLEID`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetOpenTableW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetOpenTableW`(`sesid` : `JET_SESID`, `dbid` : UInt, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pvparameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbparameters` : UInt, `grbit` : UInt, `ptableid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`StructuredStorage`.`JET_TABLEID`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetOpenTempTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetOpenTempTable`(`sesid` : `JET_SESID`, `prgcolumndef` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_COLUMNDEF`>?, `ccolumn` : UInt, `grbit` : UInt, `ptableid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`StructuredStorage`.`JET_TABLEID`>?, `prgcolumnid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetOpenTempTable2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetOpenTempTable2`(`sesid` : `JET_SESID`, `prgcolumndef` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_COLUMNDEF`>?, `ccolumn` : UInt, `lcid` : UInt, `grbit` : UInt, `ptableid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`StructuredStorage`.`JET_TABLEID`>?, `prgcolumnid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetOpenTempTable3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetOpenTempTable3`(`sesid` : `JET_SESID`, `prgcolumndef` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_COLUMNDEF`>?, `ccolumn` : UInt, `pidxunicode` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_UNICODEINDEX`>?, `grbit` : UInt, `ptableid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`StructuredStorage`.`JET_TABLEID`>?, `prgcolumnid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetOpenTemporaryTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetOpenTemporaryTable`(`sesid` : `JET_SESID`, `popentemporarytable` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_OPENTEMPORARYTABLE`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetOpenTemporaryTable2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetOpenTemporaryTable2`(`sesid` : `JET_SESID`, `popentemporarytable` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_OPENTEMPORARYTABLE2`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetPrepareUpdate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetPrepareUpdate`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `prep` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetPrereadIndexRanges; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetPrereadIndexRanges`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `rgindexranges` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_INDEX_RANGE`>?, `cindexranges` : UInt, `pcrangespreread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `rgcolumnidpreread` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ccolumnidpreread` : UInt, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetPrereadKeys; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetPrereadKeys`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `rgpvkeys` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `rgcbkeys` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ckeys` : Int, `pckeyspreread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetReadFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetReadFile`(`hffile` : `super`.`StructuredStorage`.`JET_HANDLE`, `pv` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cb` : UInt, `pcbactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetReadFileInstance; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetReadFileInstance`(`instance` : `JET_INSTANCE`, `hffile` : `super`.`StructuredStorage`.`JET_HANDLE`, `pv` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cb` : UInt, `pcbactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetRegisterCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetRegisterCallback`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `cbtyp` : UInt, `pcallback` : `JET_CALLBACK`, `pvcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phcallbackid` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`StructuredStorage`.`JET_HANDLE`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetRenameColumnA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetRenameColumnA`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `szname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `sznamenew` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetRenameColumnW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetRenameColumnW`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `szname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `sznamenew` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetRenameTableA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetRenameTableA`(`sesid` : `JET_SESID`, `dbid` : UInt, `szname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `sznamenew` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetRenameTableW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetRenameTableW`(`sesid` : `JET_SESID`, `dbid` : UInt, `szname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `sznamenew` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetResetSessionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetResetSessionContext`(`sesid` : `JET_SESID`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetResetTableSequential; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetResetTableSequential`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetResizeDatabase; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetResizeDatabase`(`sesid` : `JET_SESID`, `dbid` : UInt, `cpgtarget` : UInt, `pcpgactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetRestore2A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetRestore2A`(`sz` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `szdest` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `pfn` : `JET_PFNSTATUS`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetRestore2W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetRestore2W`(`sz` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `szdest` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pfn` : `JET_PFNSTATUS`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetRestoreA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetRestoreA`(`szsource` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `pfn` : `JET_PFNSTATUS`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetRestoreInstanceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetRestoreInstanceA`(`instance` : `JET_INSTANCE`, `sz` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `szdest` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `pfn` : `JET_PFNSTATUS`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetRestoreInstanceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetRestoreInstanceW`(`instance` : `JET_INSTANCE`, `sz` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `szdest` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pfn` : `JET_PFNSTATUS`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetRestoreW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetRestoreW`(`szsource` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pfn` : `JET_PFNSTATUS`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetRetrieveColumn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetRetrieveColumn`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `columnid` : UInt, `pvdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbdata` : UInt, `pcbactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `grbit` : UInt, `pretinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_RETINFO`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetRetrieveColumns; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetRetrieveColumns`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `pretrievecolumn` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_RETRIEVECOLUMN`>?, `cretrievecolumn` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetRetrieveKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetRetrieveKey`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `pvkey` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbmax` : UInt, `pcbactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetRollback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetRollback`(`sesid` : `JET_SESID`, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetSeek; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetSeek`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetSetColumn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetSetColumn`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `columnid` : UInt, `pvdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbdata` : UInt, `grbit` : UInt, `psetinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_SETINFO`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetSetColumnDefaultValueA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetSetColumnDefaultValueA`(`sesid` : `JET_SESID`, `dbid` : UInt, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `szcolumnname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `pvdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbdata` : UInt, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetSetColumnDefaultValueW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetSetColumnDefaultValueW`(`sesid` : `JET_SESID`, `dbid` : UInt, `sztablename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `szcolumnname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pvdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbdata` : UInt, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetSetColumns; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetSetColumns`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `psetcolumn` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_SETCOLUMN`>?, `csetcolumn` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetSetCurrentIndex2A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetSetCurrentIndex2A`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `szindexname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetSetCurrentIndex2W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetSetCurrentIndex2W`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `szindexname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetSetCurrentIndex3A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetSetCurrentIndex3A`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `szindexname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `grbit` : UInt, `itagsequence` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetSetCurrentIndex3W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetSetCurrentIndex3W`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `szindexname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `grbit` : UInt, `itagsequence` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetSetCurrentIndex4A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetSetCurrentIndex4A`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `szindexname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `pindexid` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_INDEXID`>?, `grbit` : UInt, `itagsequence` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetSetCurrentIndex4W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetSetCurrentIndex4W`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `szindexname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pindexid` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_INDEXID`>?, `grbit` : UInt, `itagsequence` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetSetCurrentIndexA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetSetCurrentIndexA`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `szindexname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetSetCurrentIndexW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetSetCurrentIndexW`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `szindexname` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetSetCursorFilter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetSetCursorFilter`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `rgcolumnfilters` : /* Rust *const */ kotlinx.cinterop.CPointer<`JET_INDEX_COLUMN`>?, `ccolumnfilters` : UInt, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetSetDatabaseSizeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetSetDatabaseSizeA`(`sesid` : `JET_SESID`, `szdatabasename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `cpg` : UInt, `pcpgreal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetSetDatabaseSizeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetSetDatabaseSizeW`(`sesid` : `JET_SESID`, `szdatabasename` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `cpg` : UInt, `pcpgreal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetSetIndexRange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetSetIndexRange`(`sesid` : `JET_SESID`, `tableidsrc` : `super`.`StructuredStorage`.`JET_TABLEID`, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetSetLS; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetSetLS`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `ls` : `JET_LS`, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetSetSessionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetSetSessionContext`(`sesid` : `JET_SESID`, `ulcontext` : `super`.`StructuredStorage`.`JET_API_PTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetSetSessionParameter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetSetSessionParameter`(`sesid` : `JET_SESID`, `sesparamid` : UInt, `pvparam` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbparam` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetSetSystemParameterA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetSetSystemParameterA`(`pinstance` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_INSTANCE`>?, `sesid` : `JET_SESID`, `paramid` : UInt, `lparam` : `super`.`StructuredStorage`.`JET_API_PTR`, `szparam` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetSetSystemParameterW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetSetSystemParameterW`(`pinstance` : /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_INSTANCE`>?, `sesid` : `JET_SESID`, `paramid` : UInt, `lparam` : `super`.`StructuredStorage`.`JET_API_PTR`, `szparam` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetSetTableSequential; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetSetTableSequential`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetStopBackup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetStopBackup`() : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetStopBackupInstance; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetStopBackupInstance`(`instance` : `JET_INSTANCE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetStopService; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetStopService`() : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetStopServiceInstance; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetStopServiceInstance`(`instance` : `JET_INSTANCE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetStopServiceInstance2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetStopServiceInstance2`(`instance` : `JET_INSTANCE`, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetTerm; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetTerm`(`instance` : `JET_INSTANCE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetTerm2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetTerm2`(`instance` : `JET_INSTANCE`, `grbit` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetTruncateLog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetTruncateLog`() : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetTruncateLogInstance; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `JetTruncateLogInstance`(`instance` : `JET_INSTANCE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetUnregisterCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetUnregisterCallback`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `cbtyp` : UInt, `hcallbackid` : `super`.`StructuredStorage`.`JET_HANDLE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetUpdate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetUpdate`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `pvbookmark` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbbookmark` : UInt, `pcbactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=esent.dll, ABI=system, export=JetUpdate2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public external fun `JetUpdate2`(`sesid` : `JET_SESID`, `tableid` : `super`.`StructuredStorage`.`JET_TABLEID`, `pvbookmark` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbbookmark` : UInt, `pcbactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `grbit` : UInt) : Int
public const val `JET_BASE_NAME_LENGTH`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_BKINFO` (
    public var `lgposMark`: `JET_LGPOS`,
    public var `Anonymous`: `JET_BKINFO_0`,
    public var `genLow`: UInt,
    public var `genHigh`: UInt,
)
// UNSUPPORTED Rust 354:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_BKINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 359:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JET_BKINFO_0 {
//     pub logtimeMark: JET_LOGTIME,
//     pub bklogtimeMark: JET_BKLOGTIME,
// }

// UNSUPPORTED Rust 365:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_BKINFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_BKLOGTIME` (
    public var `bSeconds`: Byte,
    public var `bMinutes`: Byte,
    public var `bHours`: Byte,
    public var `bDay`: Byte,
    public var `bMonth`: Byte,
    public var `bYear`: Byte,
    public var `Anonymous1`: `JET_BKLOGTIME_0`,
    public var `Anonymous2`: `JET_BKLOGTIME_1`,
)
// UNSUPPORTED Rust 382:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_BKLOGTIME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 387:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JET_BKLOGTIME_0 {
//     pub bFiller1: i8,
//     pub Anonymous: JET_BKLOGTIME_0_0,
// }

// UNSUPPORTED Rust 393:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_BKLOGTIME_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_BKLOGTIME_0_0` (
    public var `_bitfield`: UByte,
)
// UNSUPPORTED Rust 403:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JET_BKLOGTIME_1 {
//     pub bFiller2: i8,
//     pub Anonymous: JET_BKLOGTIME_1_0,
// }

// UNSUPPORTED Rust 409:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_BKLOGTIME_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_BKLOGTIME_1_0` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
public typealias `JET_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`JET_SESID`, UInt, `super`.`StructuredStorage`.`JET_TABLEID`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `super`.`StructuredStorage`.`JET_API_PTR`) -> Int>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_COLUMNBASE_A` (
    public var `cbStruct`: UInt,
    public var `columnid`: UInt,
    public var `coltyp`: UInt,
    public var `wCountry`: UShort,
    public var `langid`: UShort,
    public var `cp`: UShort,
    public var `wFiller`: UShort,
    public var `cbMax`: UInt,
    public var `grbit`: UInt,
    public var `szBaseTableName`: ByteArray,
    public var `szBaseColumnName`: ByteArray,
)
// UNSUPPORTED Rust 436:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_COLUMNBASE_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_COLUMNBASE_W` (
    public var `cbStruct`: UInt,
    public var `columnid`: UInt,
    public var `coltyp`: UInt,
    public var `wCountry`: UShort,
    public var `langid`: UShort,
    public var `cp`: UShort,
    public var `wFiller`: UShort,
    public var `cbMax`: UInt,
    public var `grbit`: UInt,
    public var `szBaseTableName`: UShortArray,
    public var `szBaseColumnName`: UShortArray,
)
// UNSUPPORTED Rust 456:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_COLUMNBASE_W {
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
public class `JET_COLUMNCREATE_A` (
    public var `cbStruct`: UInt,
    public var `szColumnName`: `windows_sys`.`core`.`PSTR`,
    public var `coltyp`: UInt,
    public var `cbMax`: UInt,
    public var `grbit`: UInt,
    public var `pvDefault`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `cbDefault`: UInt,
    public var `cp`: UInt,
    public var `columnid`: UInt,
    public var `err`: Int,
)
// UNSUPPORTED Rust 475:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_COLUMNCREATE_A {
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
public class `JET_COLUMNCREATE_W` (
    public var `cbStruct`: UInt,
    public var `szColumnName`: `windows_sys`.`core`.`PWSTR`,
    public var `coltyp`: UInt,
    public var `cbMax`: UInt,
    public var `grbit`: UInt,
    public var `pvDefault`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `cbDefault`: UInt,
    public var `cp`: UInt,
    public var `columnid`: UInt,
    public var `err`: Int,
)
// UNSUPPORTED Rust 494:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_COLUMNCREATE_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_COLUMNDEF` (
    public var `cbStruct`: UInt,
    public var `columnid`: UInt,
    public var `coltyp`: UInt,
    public var `wCountry`: UShort,
    public var `langid`: UShort,
    public var `cp`: UShort,
    public var `wCollate`: UShort,
    public var `cbMax`: UInt,
    public var `grbit`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_COLUMNLIST` (
    public var `cbStruct`: UInt,
    public var `tableid`: `super`.`StructuredStorage`.`JET_TABLEID`,
    public var `cRecord`: UInt,
    public var `columnidPresentationOrder`: UInt,
    public var `columnidcolumnname`: UInt,
    public var `columnidcolumnid`: UInt,
    public var `columnidcoltyp`: UInt,
    public var `columnidCountry`: UInt,
    public var `columnidLangid`: UInt,
    public var `columnidCp`: UInt,
    public var `columnidCollate`: UInt,
    public var `columnidcbMax`: UInt,
    public var `columnidgrbit`: UInt,
    public var `columnidDefault`: UInt,
    public var `columnidBaseTableName`: UInt,
    public var `columnidBaseColumnName`: UInt,
    public var `columnidDefinitionName`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_COMMIT_ID` (
    public var `signLog`: `JET_SIGNATURE`,
    public var `reserved`: Int,
    public var `commitId`: Long,
)
// UNSUPPORTED Rust 542:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for JET_COMMIT_ID {
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
public class `JET_COMMIT_ID` (
    public var `signLog`: `JET_SIGNATURE`,
    public var `reserved`: Int,
    public var `commitId`: Long,
)
// UNSUPPORTED Rust 556:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for JET_COMMIT_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_CONDITIONALCOLUMN_A` (
    public var `cbStruct`: UInt,
    public var `szColumnName`: `windows_sys`.`core`.`PSTR`,
    public var `grbit`: UInt,
)
// UNSUPPORTED Rust 569:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_CONDITIONALCOLUMN_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_CONDITIONALCOLUMN_W` (
    public var `cbStruct`: UInt,
    public var `szColumnName`: `windows_sys`.`core`.`PWSTR`,
    public var `grbit`: UInt,
)
// UNSUPPORTED Rust 581:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_CONDITIONALCOLUMN_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_CONVERT_A` (
    public var `szOldDll`: `windows_sys`.`core`.`PSTR`,
    public var `Anonymous`: `JET_CONVERT_A_0`,
)
// UNSUPPORTED Rust 592:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_CONVERT_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 597:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JET_CONVERT_A_0 {
//     pub fFlags: u32,
//     pub Anonymous: JET_CONVERT_A_0_0,
// }

// UNSUPPORTED Rust 603:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_CONVERT_A_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_CONVERT_A_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_CONVERT_W` (
    public var `szOldDll`: `windows_sys`.`core`.`PWSTR`,
    public var `Anonymous`: `JET_CONVERT_W_0`,
)
// UNSUPPORTED Rust 619:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_CONVERT_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 624:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JET_CONVERT_W_0 {
//     pub fFlags: u32,
//     pub Anonymous: JET_CONVERT_W_0_0,
// }

// UNSUPPORTED Rust 630:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_CONVERT_W_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_CONVERT_W_0_0` (
    public var `_bitfield`: UInt,
)
public const val `JET_ColInfoGrbitMinimalInfo`: UInt = 1073741824u;
public const val `JET_ColInfoGrbitNonDerivedColumnsOnly`: UInt = 2147483648u;
public const val `JET_ColInfoGrbitSortByColumnid`: UInt = 536870912u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_DBINFOMISC` (
    public var `ulVersion`: UInt,
    public var `ulUpdate`: UInt,
    public var `signDb`: `JET_SIGNATURE`,
    public var `dbstate`: UInt,
    public var `lgposConsistent`: `JET_LGPOS`,
    public var `logtimeConsistent`: `JET_LOGTIME`,
    public var `logtimeAttach`: `JET_LOGTIME`,
    public var `lgposAttach`: `JET_LGPOS`,
    public var `logtimeDetach`: `JET_LOGTIME`,
    public var `lgposDetach`: `JET_LGPOS`,
    public var `signLog`: `JET_SIGNATURE`,
    public var `bkinfoFullPrev`: `JET_BKINFO`,
    public var `bkinfoIncPrev`: `JET_BKINFO`,
    public var `bkinfoFullCur`: `JET_BKINFO`,
    public var `fShadowingDisabled`: UInt,
    public var `fUpgradeDb`: UInt,
    public var `dwMajorVersion`: UInt,
    public var `dwMinorVersion`: UInt,
    public var `dwBuildNumber`: UInt,
    public var `lSPNumber`: Int,
    public var `cbPageSize`: UInt,
)
// UNSUPPORTED Rust 668:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_DBINFOMISC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_DBINFOMISC2` (
    public var `ulVersion`: UInt,
    public var `ulUpdate`: UInt,
    public var `signDb`: `JET_SIGNATURE`,
    public var `dbstate`: UInt,
    public var `lgposConsistent`: `JET_LGPOS`,
    public var `logtimeConsistent`: `JET_LOGTIME`,
    public var `logtimeAttach`: `JET_LOGTIME`,
    public var `lgposAttach`: `JET_LGPOS`,
    public var `logtimeDetach`: `JET_LOGTIME`,
    public var `lgposDetach`: `JET_LGPOS`,
    public var `signLog`: `JET_SIGNATURE`,
    public var `bkinfoFullPrev`: `JET_BKINFO`,
    public var `bkinfoIncPrev`: `JET_BKINFO`,
    public var `bkinfoFullCur`: `JET_BKINFO`,
    public var `fShadowingDisabled`: UInt,
    public var `fUpgradeDb`: UInt,
    public var `dwMajorVersion`: UInt,
    public var `dwMinorVersion`: UInt,
    public var `dwBuildNumber`: UInt,
    public var `lSPNumber`: Int,
    public var `cbPageSize`: UInt,
    public var `genMinRequired`: UInt,
    public var `genMaxRequired`: UInt,
    public var `logtimeGenMaxCreate`: `JET_LOGTIME`,
    public var `ulRepairCount`: UInt,
    public var `logtimeRepair`: `JET_LOGTIME`,
    public var `ulRepairCountOld`: UInt,
    public var `ulECCFixSuccess`: UInt,
    public var `logtimeECCFixSuccess`: `JET_LOGTIME`,
    public var `ulECCFixSuccessOld`: UInt,
    public var `ulECCFixFail`: UInt,
    public var `logtimeECCFixFail`: `JET_LOGTIME`,
    public var `ulECCFixFailOld`: UInt,
    public var `ulBadChecksum`: UInt,
    public var `logtimeBadChecksum`: `JET_LOGTIME`,
    public var `ulBadChecksumOld`: UInt,
)
// UNSUPPORTED Rust 713:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_DBINFOMISC2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_DBINFOMISC3` (
    public var `ulVersion`: UInt,
    public var `ulUpdate`: UInt,
    public var `signDb`: `JET_SIGNATURE`,
    public var `dbstate`: UInt,
    public var `lgposConsistent`: `JET_LGPOS`,
    public var `logtimeConsistent`: `JET_LOGTIME`,
    public var `logtimeAttach`: `JET_LOGTIME`,
    public var `lgposAttach`: `JET_LGPOS`,
    public var `logtimeDetach`: `JET_LOGTIME`,
    public var `lgposDetach`: `JET_LGPOS`,
    public var `signLog`: `JET_SIGNATURE`,
    public var `bkinfoFullPrev`: `JET_BKINFO`,
    public var `bkinfoIncPrev`: `JET_BKINFO`,
    public var `bkinfoFullCur`: `JET_BKINFO`,
    public var `fShadowingDisabled`: UInt,
    public var `fUpgradeDb`: UInt,
    public var `dwMajorVersion`: UInt,
    public var `dwMinorVersion`: UInt,
    public var `dwBuildNumber`: UInt,
    public var `lSPNumber`: Int,
    public var `cbPageSize`: UInt,
    public var `genMinRequired`: UInt,
    public var `genMaxRequired`: UInt,
    public var `logtimeGenMaxCreate`: `JET_LOGTIME`,
    public var `ulRepairCount`: UInt,
    public var `logtimeRepair`: `JET_LOGTIME`,
    public var `ulRepairCountOld`: UInt,
    public var `ulECCFixSuccess`: UInt,
    public var `logtimeECCFixSuccess`: `JET_LOGTIME`,
    public var `ulECCFixSuccessOld`: UInt,
    public var `ulECCFixFail`: UInt,
    public var `logtimeECCFixFail`: `JET_LOGTIME`,
    public var `ulECCFixFailOld`: UInt,
    public var `ulBadChecksum`: UInt,
    public var `logtimeBadChecksum`: `JET_LOGTIME`,
    public var `ulBadChecksumOld`: UInt,
    public var `genCommitted`: UInt,
)
// UNSUPPORTED Rust 759:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_DBINFOMISC3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_DBINFOMISC4` (
    public var `ulVersion`: UInt,
    public var `ulUpdate`: UInt,
    public var `signDb`: `JET_SIGNATURE`,
    public var `dbstate`: UInt,
    public var `lgposConsistent`: `JET_LGPOS`,
    public var `logtimeConsistent`: `JET_LOGTIME`,
    public var `logtimeAttach`: `JET_LOGTIME`,
    public var `lgposAttach`: `JET_LGPOS`,
    public var `logtimeDetach`: `JET_LOGTIME`,
    public var `lgposDetach`: `JET_LGPOS`,
    public var `signLog`: `JET_SIGNATURE`,
    public var `bkinfoFullPrev`: `JET_BKINFO`,
    public var `bkinfoIncPrev`: `JET_BKINFO`,
    public var `bkinfoFullCur`: `JET_BKINFO`,
    public var `fShadowingDisabled`: UInt,
    public var `fUpgradeDb`: UInt,
    public var `dwMajorVersion`: UInt,
    public var `dwMinorVersion`: UInt,
    public var `dwBuildNumber`: UInt,
    public var `lSPNumber`: Int,
    public var `cbPageSize`: UInt,
    public var `genMinRequired`: UInt,
    public var `genMaxRequired`: UInt,
    public var `logtimeGenMaxCreate`: `JET_LOGTIME`,
    public var `ulRepairCount`: UInt,
    public var `logtimeRepair`: `JET_LOGTIME`,
    public var `ulRepairCountOld`: UInt,
    public var `ulECCFixSuccess`: UInt,
    public var `logtimeECCFixSuccess`: `JET_LOGTIME`,
    public var `ulECCFixSuccessOld`: UInt,
    public var `ulECCFixFail`: UInt,
    public var `logtimeECCFixFail`: `JET_LOGTIME`,
    public var `ulECCFixFailOld`: UInt,
    public var `ulBadChecksum`: UInt,
    public var `logtimeBadChecksum`: `JET_LOGTIME`,
    public var `ulBadChecksumOld`: UInt,
    public var `genCommitted`: UInt,
    public var `bkinfoCopyPrev`: `JET_BKINFO`,
    public var `bkinfoDiffPrev`: `JET_BKINFO`,
)
// UNSUPPORTED Rust 807:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_DBINFOMISC4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_DBINFOUPGRADE` (
    public var `cbStruct`: UInt,
    public var `cbFilesizeLow`: UInt,
    public var `cbFilesizeHigh`: UInt,
    public var `cbFreeSpaceRequiredLow`: UInt,
    public var `cbFreeSpaceRequiredHigh`: UInt,
    public var `csecToUpgrade`: UInt,
    public var `Anonymous`: `JET_DBINFOUPGRADE_0`,
)
// UNSUPPORTED Rust 823:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_DBINFOUPGRADE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 828:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JET_DBINFOUPGRADE_0 {
//     pub ulFlags: u32,
//     pub Anonymous: JET_DBINFOUPGRADE_0_0,
// }

// UNSUPPORTED Rust 834:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_DBINFOUPGRADE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_DBINFOUPGRADE_0_0` (
    public var `_bitfield`: UInt,
)
public const val `JET_DbInfoCollate`: UInt = 5u;
public const val `JET_DbInfoConnect`: UInt = 1u;
public const val `JET_DbInfoCountry`: UInt = 2u;
public const val `JET_DbInfoCp`: UInt = 4u;
public const val `JET_DbInfoDBInUse`: UInt = 15u;
public const val `JET_DbInfoFileType`: UInt = 19u;
public const val `JET_DbInfoFilename`: UInt = 0u;
public const val `JET_DbInfoFilesize`: UInt = 10u;
public const val `JET_DbInfoFilesizeOnDisk`: UInt = 21u;
public const val `JET_DbInfoIsam`: UInt = 9u;
public const val `JET_DbInfoLCID`: UInt = 3u;
public const val `JET_DbInfoLangid`: UInt = 3u;
public const val `JET_DbInfoMisc`: UInt = 14u;
public const val `JET_DbInfoOptions`: UInt = 6u;
public const val `JET_DbInfoPageSize`: UInt = 17u;
public const val `JET_DbInfoSpaceAvailable`: UInt = 12u;
public const val `JET_DbInfoSpaceOwned`: UInt = 11u;
public const val `JET_DbInfoTransactions`: UInt = 7u;
public const val `JET_DbInfoUpgrade`: UInt = 13u;
public const val `JET_DbInfoVersion`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_ENUMCOLUMN` (
    public var `columnid`: UInt,
    public var `err`: Int,
    public var `Anonymous`: `JET_ENUMCOLUMN_0`,
)
// UNSUPPORTED Rust 871:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_ENUMCOLUMN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 876:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JET_ENUMCOLUMN_0 {
//     pub Anonymous1: JET_ENUMCOLUMN_0_0,
//     pub Anonymous2: JET_ENUMCOLUMN_0_1,
// }

// UNSUPPORTED Rust 882:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_ENUMCOLUMN_0 {
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
public class `JET_ENUMCOLUMN_0_0` (
    public var `cEnumColumnValue`: UInt,
    public var `rgEnumColumnValue`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_ENUMCOLUMNVALUE`>?,
)
// UNSUPPORTED Rust 893:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_ENUMCOLUMN_0_0 {
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
public class `JET_ENUMCOLUMN_0_1` (
    public var `cbData`: UInt,
    public var `pvData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 904:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_ENUMCOLUMN_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_ENUMCOLUMNID` (
    public var `columnid`: UInt,
    public var `ctagSequence`: UInt,
    public var `rgtagSequence`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
)
// UNSUPPORTED Rust 916:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_ENUMCOLUMNID {
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
public class `JET_ENUMCOLUMNVALUE` (
    public var `itagSequence`: UInt,
    public var `err`: Int,
    public var `cbData`: UInt,
    public var `pvData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 929:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_ENUMCOLUMNVALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `JET_ERRCAT` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_ERRINFOBASIC_W` (
    public var `cbStruct`: UInt,
    public var `errValue`: Int,
    public var `errcatMostSpecific`: `JET_ERRCAT`,
    public var `rgCategoricalHierarchy`: UByteArray,
    public var `lSourceLine`: UInt,
    public var `rgszSourceFile`: UShortArray,
)
// UNSUPPORTED Rust 945:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_ERRINFOBASIC_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `JET_EventLoggingDisable`: UInt = 0u;
public const val `JET_EventLoggingLevelHigh`: UInt = 75u;
public const val `JET_EventLoggingLevelLow`: UInt = 25u;
public const val `JET_EventLoggingLevelMax`: UInt = 100u;
public const val `JET_EventLoggingLevelMedium`: UInt = 50u;
public const val `JET_EventLoggingLevelMin`: UInt = 1u;
public const val `JET_ExceptionFailFast`: UInt = 4u;
public const val `JET_ExceptionMsgBox`: UInt = 1u;
public const val `JET_ExceptionNone`: UInt = 2u;
public typealias `JET_INDEXCHECKING` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_INDEXCREATE2_A` (
    public var `cbStruct`: UInt,
    public var `szIndexName`: `windows_sys`.`core`.`PSTR`,
    public var `szKey`: `windows_sys`.`core`.`PSTR`,
    public var `cbKey`: UInt,
    public var `grbit`: UInt,
    public var `ulDensity`: UInt,
    public var `Anonymous1`: `JET_INDEXCREATE2_A_0`,
    public var `Anonymous2`: `JET_INDEXCREATE2_A_1`,
    public var `rgconditionalcolumn`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_CONDITIONALCOLUMN_A`>?,
    public var `cConditionalColumn`: UInt,
    public var `err`: Int,
    public var `cbKeyMost`: UInt,
    public var `pSpacehints`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_SPACEHINTS`>?,
)
// UNSUPPORTED Rust 977:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_INDEXCREATE2_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 982:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JET_INDEXCREATE2_A_0 {
//     pub lcid: u32,
//     pub pidxunicode: *mut JET_UNICODEINDEX,
// }

// UNSUPPORTED Rust 988:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_INDEXCREATE2_A_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 993:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JET_INDEXCREATE2_A_1 {
//     pub cbVarSegMac: u32,
//     pub ptuplelimits: *mut JET_TUPLELIMITS,
// }

// UNSUPPORTED Rust 999:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_INDEXCREATE2_A_1 {
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
public class `JET_INDEXCREATE2_W` (
    public var `cbStruct`: UInt,
    public var `szIndexName`: `windows_sys`.`core`.`PWSTR`,
    public var `szKey`: `windows_sys`.`core`.`PWSTR`,
    public var `cbKey`: UInt,
    public var `grbit`: UInt,
    public var `ulDensity`: UInt,
    public var `Anonymous1`: `JET_INDEXCREATE2_W_0`,
    public var `Anonymous2`: `JET_INDEXCREATE2_W_1`,
    public var `rgconditionalcolumn`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_CONDITIONALCOLUMN_W`>?,
    public var `cConditionalColumn`: UInt,
    public var `err`: Int,
    public var `cbKeyMost`: UInt,
    public var `pSpacehints`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_SPACEHINTS`>?,
)
// UNSUPPORTED Rust 1021:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_INDEXCREATE2_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1026:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JET_INDEXCREATE2_W_0 {
//     pub lcid: u32,
//     pub pidxunicode: *mut JET_UNICODEINDEX,
// }

// UNSUPPORTED Rust 1032:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_INDEXCREATE2_W_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1037:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JET_INDEXCREATE2_W_1 {
//     pub cbVarSegMac: u32,
//     pub ptuplelimits: *mut JET_TUPLELIMITS,
// }

// UNSUPPORTED Rust 1043:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_INDEXCREATE2_W_1 {
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
public class `JET_INDEXCREATE3_A` (
    public var `cbStruct`: UInt,
    public var `szIndexName`: `windows_sys`.`core`.`PSTR`,
    public var `szKey`: `windows_sys`.`core`.`PSTR`,
    public var `cbKey`: UInt,
    public var `grbit`: UInt,
    public var `ulDensity`: UInt,
    public var `pidxunicode`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_UNICODEINDEX2`>?,
    public var `Anonymous`: `JET_INDEXCREATE3_A_0`,
    public var `rgconditionalcolumn`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_CONDITIONALCOLUMN_A`>?,
    public var `cConditionalColumn`: UInt,
    public var `err`: Int,
    public var `cbKeyMost`: UInt,
    public var `pSpacehints`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_SPACEHINTS`>?,
)
// UNSUPPORTED Rust 1065:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_INDEXCREATE3_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1070:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JET_INDEXCREATE3_A_0 {
//     pub cbVarSegMac: u32,
//     pub ptuplelimits: *mut JET_TUPLELIMITS,
// }

// UNSUPPORTED Rust 1076:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_INDEXCREATE3_A_0 {
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
public class `JET_INDEXCREATE3_W` (
    public var `cbStruct`: UInt,
    public var `szIndexName`: `windows_sys`.`core`.`PWSTR`,
    public var `szKey`: `windows_sys`.`core`.`PWSTR`,
    public var `cbKey`: UInt,
    public var `grbit`: UInt,
    public var `ulDensity`: UInt,
    public var `pidxunicode`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_UNICODEINDEX2`>?,
    public var `Anonymous`: `JET_INDEXCREATE3_W_0`,
    public var `rgconditionalcolumn`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_CONDITIONALCOLUMN_W`>?,
    public var `cConditionalColumn`: UInt,
    public var `err`: Int,
    public var `cbKeyMost`: UInt,
    public var `pSpacehints`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_SPACEHINTS`>?,
)
// UNSUPPORTED Rust 1098:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_INDEXCREATE3_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1103:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JET_INDEXCREATE3_W_0 {
//     pub cbVarSegMac: u32,
//     pub ptuplelimits: *mut JET_TUPLELIMITS,
// }

// UNSUPPORTED Rust 1109:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_INDEXCREATE3_W_0 {
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
public class `JET_INDEXCREATE_A` (
    public var `cbStruct`: UInt,
    public var `szIndexName`: `windows_sys`.`core`.`PSTR`,
    public var `szKey`: `windows_sys`.`core`.`PSTR`,
    public var `cbKey`: UInt,
    public var `grbit`: UInt,
    public var `ulDensity`: UInt,
    public var `Anonymous1`: `JET_INDEXCREATE_A_0`,
    public var `Anonymous2`: `JET_INDEXCREATE_A_1`,
    public var `rgconditionalcolumn`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_CONDITIONALCOLUMN_A`>?,
    public var `cConditionalColumn`: UInt,
    public var `err`: Int,
    public var `cbKeyMost`: UInt,
)
// UNSUPPORTED Rust 1130:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_INDEXCREATE_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1135:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JET_INDEXCREATE_A_0 {
//     pub lcid: u32,
//     pub pidxunicode: *mut JET_UNICODEINDEX,
// }

// UNSUPPORTED Rust 1141:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_INDEXCREATE_A_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1146:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JET_INDEXCREATE_A_1 {
//     pub cbVarSegMac: u32,
//     pub ptuplelimits: *mut JET_TUPLELIMITS,
// }

// UNSUPPORTED Rust 1152:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_INDEXCREATE_A_1 {
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
public class `JET_INDEXCREATE_W` (
    public var `cbStruct`: UInt,
    public var `szIndexName`: `windows_sys`.`core`.`PWSTR`,
    public var `szKey`: `windows_sys`.`core`.`PWSTR`,
    public var `cbKey`: UInt,
    public var `grbit`: UInt,
    public var `ulDensity`: UInt,
    public var `Anonymous1`: `JET_INDEXCREATE_W_0`,
    public var `Anonymous2`: `JET_INDEXCREATE_W_1`,
    public var `rgconditionalcolumn`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_CONDITIONALCOLUMN_W`>?,
    public var `cConditionalColumn`: UInt,
    public var `err`: Int,
    public var `cbKeyMost`: UInt,
)
// UNSUPPORTED Rust 1173:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_INDEXCREATE_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1178:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JET_INDEXCREATE_W_0 {
//     pub lcid: u32,
//     pub pidxunicode: *mut JET_UNICODEINDEX,
// }

// UNSUPPORTED Rust 1184:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_INDEXCREATE_W_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1189:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JET_INDEXCREATE_W_1 {
//     pub cbVarSegMac: u32,
//     pub ptuplelimits: *mut JET_TUPLELIMITS,
// }

// UNSUPPORTED Rust 1195:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_INDEXCREATE_W_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 12 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_INDEXID` (
    public var `cbStruct`: UInt,
    public var `rgbIndexId`: UByteArray,
)
// UNSUPPORTED Rust 1207:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for JET_INDEXID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_INDEXID` (
    public var `cbStruct`: UInt,
    public var `rgbIndexId`: UByteArray,
)
// UNSUPPORTED Rust 1220:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for JET_INDEXID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_INDEXLIST` (
    public var `cbStruct`: UInt,
    public var `tableid`: `super`.`StructuredStorage`.`JET_TABLEID`,
    public var `cRecord`: UInt,
    public var `columnidindexname`: UInt,
    public var `columnidgrbitIndex`: UInt,
    public var `columnidcKey`: UInt,
    public var `columnidcEntry`: UInt,
    public var `columnidcPage`: UInt,
    public var `columnidcColumn`: UInt,
    public var `columnidiColumn`: UInt,
    public var `columnidcolumnid`: UInt,
    public var `columnidcoltyp`: UInt,
    public var `columnidCountry`: UInt,
    public var `columnidLangid`: UInt,
    public var `columnidCp`: UInt,
    public var `columnidCollate`: UInt,
    public var `columnidgrbitColumn`: UInt,
    public var `columnidcolumnname`: UInt,
    public var `columnidLCMapFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_INDEXRANGE` (
    public var `cbStruct`: UInt,
    public var `tableid`: `super`.`StructuredStorage`.`JET_TABLEID`,
    public var `grbit`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_INDEX_COLUMN` (
    public var `columnid`: UInt,
    public var `relop`: `JET_RELOP`,
    public var `pv`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `cb`: UInt,
    public var `grbit`: UInt,
)
// UNSUPPORTED Rust 1267:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_INDEX_COLUMN {
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
public class `JET_INDEX_RANGE` (
    public var `rgStartColumns`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_INDEX_COLUMN`>?,
    public var `cStartColumns`: UInt,
    public var `rgEndColumns`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_INDEX_COLUMN`>?,
    public var `cEndColumns`: UInt,
)
// UNSUPPORTED Rust 1280:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_INDEX_RANGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `JET_INSTANCE` = ULong;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_INSTANCE_INFO_A` (
    public var `hInstanceId`: `JET_INSTANCE`,
    public var `szInstanceName`: `windows_sys`.`core`.`PSTR`,
    public var `cDatabases`: `super`.`StructuredStorage`.`JET_API_PTR`,
    public var `szDatabaseFileName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?,
    public var `szDatabaseDisplayName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?,
    public var `szDatabaseSLVFileName_Obsolete`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?,
)
// UNSUPPORTED Rust 1297:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_StructuredStorage")]
// impl Default for JET_INSTANCE_INFO_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_INSTANCE_INFO_W` (
    public var `hInstanceId`: `JET_INSTANCE`,
    public var `szInstanceName`: `windows_sys`.`core`.`PWSTR`,
    public var `cDatabases`: `super`.`StructuredStorage`.`JET_API_PTR`,
    public var `szDatabaseFileName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>?,
    public var `szDatabaseDisplayName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>?,
    public var `szDatabaseSLVFileName_Obsolete`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>?,
)
// UNSUPPORTED Rust 1314:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_StructuredStorage")]
// impl Default for JET_INSTANCE_INFO_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `JET_IOPriorityLow`: UInt = 1u;
public const val `JET_IOPriorityNormal`: UInt = 0u;
public const val `JET_IndexCheckingDeferToOpenTable`: `JET_INDEXCHECKING` = 2;
public const val `JET_IndexCheckingMax`: `JET_INDEXCHECKING` = 3;
public const val `JET_IndexCheckingOff`: `JET_INDEXCHECKING` = 0;
public const val `JET_IndexCheckingOn`: `JET_INDEXCHECKING` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_LGPOS` (
    public var `ib`: UShort,
    public var `isec`: UShort,
    public var `lGeneration`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_LOGINFO_A` (
    public var `cbSize`: UInt,
    public var `ulGenLow`: UInt,
    public var `ulGenHigh`: UInt,
    public var `szBaseName`: ByteArray,
)
// UNSUPPORTED Rust 1341:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_LOGINFO_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_LOGINFO_W` (
    public var `cbSize`: UInt,
    public var `ulGenLow`: UInt,
    public var `ulGenHigh`: UInt,
    public var `szBaseName`: UShortArray,
)
// UNSUPPORTED Rust 1354:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_LOGINFO_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_LOGTIME` (
    public var `bSeconds`: Byte,
    public var `bMinutes`: Byte,
    public var `bHours`: Byte,
    public var `bDay`: Byte,
    public var `bMonth`: Byte,
    public var `bYear`: Byte,
    public var `Anonymous1`: `JET_LOGTIME_0`,
    public var `Anonymous2`: `JET_LOGTIME_1`,
)
// UNSUPPORTED Rust 1371:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_LOGTIME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1376:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JET_LOGTIME_0 {
//     pub bFiller1: i8,
//     pub Anonymous: JET_LOGTIME_0_0,
// }

// UNSUPPORTED Rust 1382:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_LOGTIME_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_LOGTIME_0_0` (
    public var `_bitfield`: UByte,
)
// UNSUPPORTED Rust 1392:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union JET_LOGTIME_1 {
//     pub bFiller2: i8,
//     pub Anonymous: JET_LOGTIME_1_0,
// }

// UNSUPPORTED Rust 1398:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_LOGTIME_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_LOGTIME_1_0` (
    public var `_bitfield`: UByte,
)
public typealias `JET_LS` = ULong;
public const val `JET_MAX_COMPUTERNAME_LENGTH`: UInt = 15u;
public const val `JET_MoveFirst`: UInt = 2147483648u;
public const val `JET_MoveLast`: UInt = 2147483647u;
public const val `JET_MovePrevious`: Int = -1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_OBJECTINFO` (
    public var `cbStruct`: UInt,
    public var `objtyp`: UInt,
    public var `dtCreate`: Double,
    public var `dtUpdate`: Double,
    public var `grbit`: UInt,
    public var `flags`: UInt,
    public var `cRecord`: UInt,
    public var `cPage`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_OBJECTINFO` (
    public var `cbStruct`: UInt,
    public var `objtyp`: UInt,
    public var `dtCreate`: Double,
    public var `dtUpdate`: Double,
    public var `grbit`: UInt,
    public var `flags`: UInt,
    public var `cRecord`: UInt,
    public var `cPage`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_OBJECTLIST` (
    public var `cbStruct`: UInt,
    public var `tableid`: `super`.`StructuredStorage`.`JET_TABLEID`,
    public var `cRecord`: UInt,
    public var `columnidcontainername`: UInt,
    public var `columnidobjectname`: UInt,
    public var `columnidobjtyp`: UInt,
    public var `columniddtCreate`: UInt,
    public var `columniddtUpdate`: UInt,
    public var `columnidgrbit`: UInt,
    public var `columnidflags`: UInt,
    public var `columnidcRecord`: UInt,
    public var `columnidcPage`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_OPENTEMPORARYTABLE` (
    public var `cbStruct`: UInt,
    public var `prgcolumndef`: /* Rust *const */ kotlinx.cinterop.CPointer<`JET_COLUMNDEF`>?,
    public var `ccolumn`: UInt,
    public var `pidxunicode`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_UNICODEINDEX`>?,
    public var `grbit`: UInt,
    public var `prgcolumnid`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `cbKeyMost`: UInt,
    public var `cbVarSegMac`: UInt,
    public var `tableid`: `super`.`StructuredStorage`.`JET_TABLEID`,
)
// UNSUPPORTED Rust 1470:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_StructuredStorage")]
// impl Default for JET_OPENTEMPORARYTABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_OPENTEMPORARYTABLE2` (
    public var `cbStruct`: UInt,
    public var `prgcolumndef`: /* Rust *const */ kotlinx.cinterop.CPointer<`JET_COLUMNDEF`>?,
    public var `ccolumn`: UInt,
    public var `pidxunicode`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_UNICODEINDEX2`>?,
    public var `grbit`: UInt,
    public var `prgcolumnid`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `cbKeyMost`: UInt,
    public var `cbVarSegMac`: UInt,
    public var `tableid`: `super`.`StructuredStorage`.`JET_TABLEID`,
)
// UNSUPPORTED Rust 1490:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_StructuredStorage")]
// impl Default for JET_OPENTEMPORARYTABLE2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_OPERATIONCONTEXT` (
    public var `ulUserID`: UInt,
    public var `nOperationID`: UByte,
    public var `nOperationType`: UByte,
    public var `nClientType`: UByte,
    public var `fFlags`: UByte,
)
public typealias `JET_OSSNAPID` = ULong;
public const val `JET_OnlineDefragAll`: UInt = 65535u;
public const val `JET_OnlineDefragAllOBSOLETE`: UInt = 1u;
public const val `JET_OnlineDefragDatabases`: UInt = 2u;
public const val `JET_OnlineDefragDisable`: UInt = 0u;
public const val `JET_OnlineDefragSpaceTrees`: UInt = 4u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `JET_PFNDURABLECOMMITCALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`JET_INSTANCE`, /* Rust *const */ kotlinx.cinterop.CPointer<`JET_COMMIT_ID`>?, UInt) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `JET_PFNREALLOC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `JET_PFNSTATUS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`JET_SESID`, UInt, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Int>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_RECORDLIST` (
    public var `cbStruct`: UInt,
    public var `tableid`: `super`.`StructuredStorage`.`JET_TABLEID`,
    public var `cRecord`: UInt,
    public var `columnidBookmark`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_RECPOS` (
    public var `cbStruct`: UInt,
    public var `centriesLT`: UInt,
    public var `centriesInRange`: UInt,
    public var `centriesTotal`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_RECPOS2` (
    public var `cbStruct`: UInt,
    public var `centriesLTDeprecated`: UInt,
    public var `centriesInRangeDeprecated`: UInt,
    public var `centriesTotalDeprecated`: UInt,
    public var `centriesLT`: ULong,
    public var `centriesTotal`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_RECPOS2` (
    public var `cbStruct`: UInt,
    public var `centriesLTDeprecated`: UInt,
    public var `centriesInRangeDeprecated`: UInt,
    public var `centriesTotalDeprecated`: UInt,
    public var `centriesLT`: ULong,
    public var `centriesTotal`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_RECSIZE` (
    public var `cbData`: ULong,
    public var `cbLongValueData`: ULong,
    public var `cbOverhead`: ULong,
    public var `cbLongValueOverhead`: ULong,
    public var `cNonTaggedColumns`: ULong,
    public var `cTaggedColumns`: ULong,
    public var `cLongValues`: ULong,
    public var `cMultiValues`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_RECSIZE` (
    public var `cbData`: ULong,
    public var `cbLongValueData`: ULong,
    public var `cbOverhead`: ULong,
    public var `cbLongValueOverhead`: ULong,
    public var `cNonTaggedColumns`: ULong,
    public var `cTaggedColumns`: ULong,
    public var `cLongValues`: ULong,
    public var `cMultiValues`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_RECSIZE2` (
    public var `cbData`: ULong,
    public var `cbLongValueData`: ULong,
    public var `cbOverhead`: ULong,
    public var `cbLongValueOverhead`: ULong,
    public var `cNonTaggedColumns`: ULong,
    public var `cTaggedColumns`: ULong,
    public var `cLongValues`: ULong,
    public var `cMultiValues`: ULong,
    public var `cCompressedColumns`: ULong,
    public var `cbDataCompressed`: ULong,
    public var `cbLongValueDataCompressed`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_RECSIZE2` (
    public var `cbData`: ULong,
    public var `cbLongValueData`: ULong,
    public var `cbOverhead`: ULong,
    public var `cbLongValueOverhead`: ULong,
    public var `cNonTaggedColumns`: ULong,
    public var `cTaggedColumns`: ULong,
    public var `cLongValues`: ULong,
    public var `cMultiValues`: ULong,
    public var `cCompressedColumns`: ULong,
    public var `cbDataCompressed`: ULong,
    public var `cbLongValueDataCompressed`: ULong,
)
public typealias `JET_RELOP` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_RETINFO` (
    public var `cbStruct`: UInt,
    public var `ibLongValue`: UInt,
    public var `itagSequence`: UInt,
    public var `columnidNextTagged`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_RETRIEVECOLUMN` (
    public var `columnid`: UInt,
    public var `pvData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `cbData`: UInt,
    public var `cbActual`: UInt,
    public var `grbit`: UInt,
    public var `ibLongValue`: UInt,
    public var `itagSequence`: UInt,
    public var `columnidNextTagged`: UInt,
    public var `err`: Int,
)
// UNSUPPORTED Rust 1633:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_RETRIEVECOLUMN {
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
public class `JET_RSTINFO_A` (
    public var `cbStruct`: UInt,
    public var `rgrstmap`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_RSTMAP_A`>?,
    public var `crstmap`: Int,
    public var `lgposStop`: `JET_LGPOS`,
    public var `logtimeStop`: `JET_LOGTIME`,
    public var `pfnStatus`: `JET_PFNSTATUS`,
)
// UNSUPPORTED Rust 1648:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_RSTINFO_A {
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
public class `JET_RSTINFO_W` (
    public var `cbStruct`: UInt,
    public var `rgrstmap`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_RSTMAP_W`>?,
    public var `crstmap`: Int,
    public var `lgposStop`: `JET_LGPOS`,
    public var `logtimeStop`: `JET_LOGTIME`,
    public var `pfnStatus`: `JET_PFNSTATUS`,
)
// UNSUPPORTED Rust 1663:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_RSTINFO_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_RSTMAP_A` (
    public var `szDatabaseName`: `windows_sys`.`core`.`PSTR`,
    public var `szNewDatabaseName`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 1674:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_RSTMAP_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_RSTMAP_W` (
    public var `szDatabaseName`: `windows_sys`.`core`.`PWSTR`,
    public var `szNewDatabaseName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1685:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_RSTMAP_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `JET_SESID` = ULong;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_SETCOLUMN` (
    public var `columnid`: UInt,
    public var `pvData`: /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `cbData`: UInt,
    public var `grbit`: UInt,
    public var `ibLongValue`: UInt,
    public var `itagSequence`: UInt,
    public var `err`: Int,
)
// UNSUPPORTED Rust 1702:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_SETCOLUMN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_SETINFO` (
    public var `cbStruct`: UInt,
    public var `ibLongValue`: UInt,
    public var `itagSequence`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_SETSYSPARAM_A` (
    public var `paramid`: UInt,
    public var `lParam`: `super`.`StructuredStorage`.`JET_API_PTR`,
    public var `sz`: `windows_sys`.`core`.`PCSTR`,
    public var `err`: Int,
)
// UNSUPPORTED Rust 1723:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_StructuredStorage")]
// impl Default for JET_SETSYSPARAM_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_SETSYSPARAM_W` (
    public var `paramid`: UInt,
    public var `lParam`: `super`.`StructuredStorage`.`JET_API_PTR`,
    public var `sz`: `windows_sys`.`core`.`PCWSTR`,
    public var `err`: Int,
)
// UNSUPPORTED Rust 1738:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_StructuredStorage")]
// impl Default for JET_SETSYSPARAM_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_SIGNATURE` (
    public var `ulRandom`: UInt,
    public var `logtimeCreate`: `JET_LOGTIME`,
    public var `szComputerName`: ByteArray,
)
// UNSUPPORTED Rust 1751:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_SIGNATURE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_SNPROG` (
    public var `cbStruct`: UInt,
    public var `cunitDone`: UInt,
    public var `cunitTotal`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_SPACEHINTS` (
    public var `cbStruct`: UInt,
    public var `ulInitialDensity`: UInt,
    public var `cbInitial`: UInt,
    public var `grbit`: UInt,
    public var `ulMaintDensity`: UInt,
    public var `ulGrowth`: UInt,
    public var `cbMinExtent`: UInt,
    public var `cbMaxExtent`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_TABLECREATE2_A` (
    public var `cbStruct`: UInt,
    public var `szTableName`: `windows_sys`.`core`.`PSTR`,
    public var `szTemplateTableName`: `windows_sys`.`core`.`PSTR`,
    public var `ulPages`: UInt,
    public var `ulDensity`: UInt,
    public var `rgcolumncreate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_COLUMNCREATE_A`>?,
    public var `cColumns`: UInt,
    public var `rgindexcreate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_INDEXCREATE_A`>?,
    public var `cIndexes`: UInt,
    public var `szCallback`: `windows_sys`.`core`.`PSTR`,
    public var `cbtyp`: UInt,
    public var `grbit`: UInt,
    public var `tableid`: `super`.`StructuredStorage`.`JET_TABLEID`,
    public var `cCreated`: UInt,
)
// UNSUPPORTED Rust 1794:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_StructuredStorage")]
// impl Default for JET_TABLECREATE2_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_TABLECREATE2_W` (
    public var `cbStruct`: UInt,
    public var `szTableName`: `windows_sys`.`core`.`PWSTR`,
    public var `szTemplateTableName`: `windows_sys`.`core`.`PWSTR`,
    public var `ulPages`: UInt,
    public var `ulDensity`: UInt,
    public var `rgcolumncreate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_COLUMNCREATE_W`>?,
    public var `cColumns`: UInt,
    public var `rgindexcreate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_INDEXCREATE_W`>?,
    public var `cIndexes`: UInt,
    public var `szCallback`: `windows_sys`.`core`.`PWSTR`,
    public var `cbtyp`: UInt,
    public var `grbit`: UInt,
    public var `tableid`: `super`.`StructuredStorage`.`JET_TABLEID`,
    public var `cCreated`: UInt,
)
// UNSUPPORTED Rust 1819:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_StructuredStorage")]
// impl Default for JET_TABLECREATE2_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_TABLECREATE3_A` (
    public var `cbStruct`: UInt,
    public var `szTableName`: `windows_sys`.`core`.`PSTR`,
    public var `szTemplateTableName`: `windows_sys`.`core`.`PSTR`,
    public var `ulPages`: UInt,
    public var `ulDensity`: UInt,
    public var `rgcolumncreate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_COLUMNCREATE_A`>?,
    public var `cColumns`: UInt,
    public var `rgindexcreate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_INDEXCREATE2_A`>?,
    public var `cIndexes`: UInt,
    public var `szCallback`: `windows_sys`.`core`.`PSTR`,
    public var `cbtyp`: UInt,
    public var `grbit`: UInt,
    public var `pSeqSpacehints`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_SPACEHINTS`>?,
    public var `pLVSpacehints`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_SPACEHINTS`>?,
    public var `cbSeparateLV`: UInt,
    public var `tableid`: `super`.`StructuredStorage`.`JET_TABLEID`,
    public var `cCreated`: UInt,
)
// UNSUPPORTED Rust 1847:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_StructuredStorage")]
// impl Default for JET_TABLECREATE3_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_TABLECREATE3_W` (
    public var `cbStruct`: UInt,
    public var `szTableName`: `windows_sys`.`core`.`PWSTR`,
    public var `szTemplateTableName`: `windows_sys`.`core`.`PWSTR`,
    public var `ulPages`: UInt,
    public var `ulDensity`: UInt,
    public var `rgcolumncreate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_COLUMNCREATE_W`>?,
    public var `cColumns`: UInt,
    public var `rgindexcreate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_INDEXCREATE2_W`>?,
    public var `cIndexes`: UInt,
    public var `szCallback`: `windows_sys`.`core`.`PWSTR`,
    public var `cbtyp`: UInt,
    public var `grbit`: UInt,
    public var `pSeqSpacehints`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_SPACEHINTS`>?,
    public var `pLVSpacehints`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_SPACEHINTS`>?,
    public var `cbSeparateLV`: UInt,
    public var `tableid`: `super`.`StructuredStorage`.`JET_TABLEID`,
    public var `cCreated`: UInt,
)
// UNSUPPORTED Rust 1875:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_StructuredStorage")]
// impl Default for JET_TABLECREATE3_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_TABLECREATE4_A` (
    public var `cbStruct`: UInt,
    public var `szTableName`: `windows_sys`.`core`.`PSTR`,
    public var `szTemplateTableName`: `windows_sys`.`core`.`PSTR`,
    public var `ulPages`: UInt,
    public var `ulDensity`: UInt,
    public var `rgcolumncreate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_COLUMNCREATE_A`>?,
    public var `cColumns`: UInt,
    public var `rgindexcreate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_INDEXCREATE3_A`>?,
    public var `cIndexes`: UInt,
    public var `szCallback`: `windows_sys`.`core`.`PSTR`,
    public var `cbtyp`: UInt,
    public var `grbit`: UInt,
    public var `pSeqSpacehints`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_SPACEHINTS`>?,
    public var `pLVSpacehints`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_SPACEHINTS`>?,
    public var `cbSeparateLV`: UInt,
    public var `tableid`: `super`.`StructuredStorage`.`JET_TABLEID`,
    public var `cCreated`: UInt,
)
// UNSUPPORTED Rust 1903:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_StructuredStorage")]
// impl Default for JET_TABLECREATE4_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_TABLECREATE4_W` (
    public var `cbStruct`: UInt,
    public var `szTableName`: `windows_sys`.`core`.`PWSTR`,
    public var `szTemplateTableName`: `windows_sys`.`core`.`PWSTR`,
    public var `ulPages`: UInt,
    public var `ulDensity`: UInt,
    public var `rgcolumncreate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_COLUMNCREATE_W`>?,
    public var `cColumns`: UInt,
    public var `rgindexcreate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_INDEXCREATE3_W`>?,
    public var `cIndexes`: UInt,
    public var `szCallback`: `windows_sys`.`core`.`PWSTR`,
    public var `cbtyp`: UInt,
    public var `grbit`: UInt,
    public var `pSeqSpacehints`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_SPACEHINTS`>?,
    public var `pLVSpacehints`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_SPACEHINTS`>?,
    public var `cbSeparateLV`: UInt,
    public var `tableid`: `super`.`StructuredStorage`.`JET_TABLEID`,
    public var `cCreated`: UInt,
)
// UNSUPPORTED Rust 1931:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_StructuredStorage")]
// impl Default for JET_TABLECREATE4_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_TABLECREATE_A` (
    public var `cbStruct`: UInt,
    public var `szTableName`: `windows_sys`.`core`.`PSTR`,
    public var `szTemplateTableName`: `windows_sys`.`core`.`PSTR`,
    public var `ulPages`: UInt,
    public var `ulDensity`: UInt,
    public var `rgcolumncreate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_COLUMNCREATE_A`>?,
    public var `cColumns`: UInt,
    public var `rgindexcreate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_INDEXCREATE_A`>?,
    public var `cIndexes`: UInt,
    public var `grbit`: UInt,
    public var `tableid`: `super`.`StructuredStorage`.`JET_TABLEID`,
    public var `cCreated`: UInt,
)
// UNSUPPORTED Rust 1954:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_StructuredStorage")]
// impl Default for JET_TABLECREATE_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_StructuredStorage")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_TABLECREATE_W` (
    public var `cbStruct`: UInt,
    public var `szTableName`: `windows_sys`.`core`.`PWSTR`,
    public var `szTemplateTableName`: `windows_sys`.`core`.`PWSTR`,
    public var `ulPages`: UInt,
    public var `ulDensity`: UInt,
    public var `rgcolumncreate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_COLUMNCREATE_W`>?,
    public var `cColumns`: UInt,
    public var `rgindexcreate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`JET_INDEXCREATE_W`>?,
    public var `cIndexes`: UInt,
    public var `grbit`: UInt,
    public var `tableid`: `super`.`StructuredStorage`.`JET_TABLEID`,
    public var `cCreated`: UInt,
)
// UNSUPPORTED Rust 1977:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_StructuredStorage")]
// impl Default for JET_TABLECREATE_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_THREADSTATS` (
    public var `cbStruct`: UInt,
    public var `cPageReferenced`: UInt,
    public var `cPageRead`: UInt,
    public var `cPagePreread`: UInt,
    public var `cPageDirtied`: UInt,
    public var `cPageRedirtied`: UInt,
    public var `cLogRecord`: UInt,
    public var `cbLogRecord`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_THREADSTATS2` (
    public var `cbStruct`: UInt,
    public var `cPageReferenced`: UInt,
    public var `cPageRead`: UInt,
    public var `cPagePreread`: UInt,
    public var `cPageDirtied`: UInt,
    public var `cPageRedirtied`: UInt,
    public var `cLogRecord`: UInt,
    public var `cbLogRecord`: UInt,
    public var `cusecPageCacheMiss`: ULong,
    public var `cPageCacheMiss`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_THREADSTATS2` (
    public var `cbStruct`: UInt,
    public var `cPageReferenced`: UInt,
    public var `cPageRead`: UInt,
    public var `cPagePreread`: UInt,
    public var `cPageDirtied`: UInt,
    public var `cPageRedirtied`: UInt,
    public var `cLogRecord`: UInt,
    public var `cbLogRecord`: UInt,
    public var `cusecPageCacheMiss`: ULong,
    public var `cPageCacheMiss`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_TUPLELIMITS` (
    public var `chLengthMin`: UInt,
    public var `chLengthMax`: UInt,
    public var `chToIndexMax`: UInt,
    public var `cchIncrement`: UInt,
    public var `ichStart`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JET_UNICODEINDEX` (
    public var `lcid`: UInt,
    public var `dwMapFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JET_UNICODEINDEX2` (
    public var `szLocaleName`: `windows_sys`.`core`.`PWSTR`,
    public var `dwMapFlags`: UInt,
)
// UNSUPPORTED Rust 2046:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_UNICODEINDEX2 {
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
public class `JET_USERDEFINEDDEFAULT_A` (
    public var `szCallback`: `windows_sys`.`core`.`PSTR`,
    public var `pbUserData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbUserData`: UInt,
    public var `szDependantColumns`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 2059:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_USERDEFINEDDEFAULT_A {
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
public class `JET_USERDEFINEDDEFAULT_W` (
    public var `szCallback`: `windows_sys`.`core`.`PWSTR`,
    public var `pbUserData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbUserData`: UInt,
    public var `szDependantColumns`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 2072:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JET_USERDEFINEDDEFAULT_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `JET_VERSION`: UInt = 1280u;
public const val `JET_bitAbortSnapshot`: UInt = 1u;
public const val `JET_bitAllDatabasesSnapshot`: UInt = 1u;
public const val `JET_bitBackupAtomic`: UInt = 4u;
public const val `JET_bitBackupEndAbort`: UInt = 2u;
public const val `JET_bitBackupEndNormal`: UInt = 1u;
public const val `JET_bitBackupIncremental`: UInt = 1u;
public const val `JET_bitBackupSnapshot`: UInt = 16u;
public const val `JET_bitBackupTruncateDone`: UInt = 256u;
public const val `JET_bitBookmarkPermitVirtualCurrency`: UInt = 1u;
public const val `JET_bitCheckUniqueness`: UInt = 64u;
public const val `JET_bitColumnAutoincrement`: UInt = 16u;
public const val `JET_bitColumnCompressed`: UInt = 524288u;
public const val `JET_bitColumnDeleteOnZero`: UInt = 131072u;
public const val `JET_bitColumnEscrowUpdate`: UInt = 2048u;
public const val `JET_bitColumnFinalize`: UInt = 16384u;
public const val `JET_bitColumnFixed`: UInt = 1u;
public const val `JET_bitColumnMaybeNull`: UInt = 8192u;
public const val `JET_bitColumnMultiValued`: UInt = 1024u;
public const val `JET_bitColumnNotNULL`: UInt = 4u;
public const val `JET_bitColumnTTDescending`: UInt = 128u;
public const val `JET_bitColumnTTKey`: UInt = 64u;
public const val `JET_bitColumnTagged`: UInt = 2u;
public const val `JET_bitColumnUnversioned`: UInt = 4096u;
public const val `JET_bitColumnUpdatable`: UInt = 32u;
public const val `JET_bitColumnUserDefinedDefault`: UInt = 32768u;
public const val `JET_bitColumnVersion`: UInt = 8u;
public const val `JET_bitCommitLazyFlush`: UInt = 1u;
public const val `JET_bitCompactRepair`: UInt = 64u;
public const val `JET_bitCompactStats`: UInt = 32u;
public const val `JET_bitConfigStoreReadControlDefault`: UInt = 0u;
public const val `JET_bitConfigStoreReadControlDisableAll`: UInt = 2u;
public const val `JET_bitConfigStoreReadControlInhibitRead`: UInt = 1u;
public const val `JET_bitContinueAfterThaw`: UInt = 4u;
public const val `JET_bitCopySnapshot`: UInt = 2u;
public const val `JET_bitCreateHintAppendSequential`: UInt = 2u;
public const val `JET_bitCreateHintHotpointSequential`: UInt = 4u;
public const val `JET_bitDbDeleteCorruptIndexes`: UInt = 16u;
public const val `JET_bitDbDeleteUnicodeIndexes`: UInt = 1024u;
public const val `JET_bitDbEnableBackgroundMaintenance`: UInt = 2048u;
public const val `JET_bitDbExclusive`: UInt = 2u;
public const val `JET_bitDbOverwriteExisting`: UInt = 512u;
public const val `JET_bitDbPurgeCacheOnAttach`: UInt = 4096u;
public const val `JET_bitDbReadOnly`: UInt = 1u;
public const val `JET_bitDbRecoveryOff`: UInt = 8u;
public const val `JET_bitDbShadowingOff`: UInt = 128u;
public const val `JET_bitDbUpgrade`: UInt = 512u;
public const val `JET_bitDefragmentAvailSpaceTreesOnly`: UInt = 64u;
public const val `JET_bitDefragmentBTree`: UInt = 256u;
public const val `JET_bitDefragmentBatchStart`: UInt = 1u;
public const val `JET_bitDefragmentBatchStop`: UInt = 2u;
public const val `JET_bitDefragmentNoPartialMerges`: UInt = 128u;
public const val `JET_bitDeleteColumnIgnoreTemplateColumns`: UInt = 1u;
public const val `JET_bitDeleteHintTableSequential`: UInt = 256u;
public const val `JET_bitDumpCacheIncludeCachedPages`: UInt = 32u;
public const val `JET_bitDumpCacheIncludeCorruptedPages`: UInt = 64u;
public const val `JET_bitDumpCacheIncludeDirtyPages`: UInt = 16u;
public const val `JET_bitDumpCacheMaximum`: UInt = 8u;
public const val `JET_bitDumpCacheMinimum`: UInt = 4u;
public const val `JET_bitDumpCacheNoDecommit`: UInt = 128u;
public const val `JET_bitDumpMaximum`: UInt = 2u;
public const val `JET_bitDumpMinimum`: UInt = 1u;
public const val `JET_bitDurableCommitCallbackLogUnavailable`: UInt = 1u;
public const val `JET_bitESE98FileNames`: UInt = 1u;
public const val `JET_bitEightDotThreeSoftCompat`: UInt = 2u;
public const val `JET_bitEnumerateCompressOutput`: UInt = 524288u;
public const val `JET_bitEnumerateCopy`: UInt = 1u;
public const val `JET_bitEnumerateIgnoreDefault`: UInt = 32u;
public const val `JET_bitEnumerateIgnoreUserDefinedDefault`: UInt = 1048576u;
public const val `JET_bitEnumerateInRecordOnly`: UInt = 2097152u;
public const val `JET_bitEnumeratePresenceOnly`: UInt = 131072u;
public const val `JET_bitEnumerateTaggedOnly`: UInt = 262144u;
public const val `JET_bitEscrowNoRollback`: UInt = 1u;
public const val `JET_bitExplicitPrepare`: UInt = 8u;
public const val `JET_bitForceDetach`: UInt = 1u;
public const val `JET_bitForceNewLog`: UInt = 16u;
public const val `JET_bitFullColumnEndLimit`: UInt = 512u;
public const val `JET_bitFullColumnStartLimit`: UInt = 256u;
public const val `JET_bitHungIOEvent`: UInt = 1u;
public const val `JET_bitIdleCompact`: UInt = 2u;
public const val `JET_bitIdleFlushBuffers`: UInt = 1u;
public const val `JET_bitIdleStatus`: UInt = 4u;
public const val `JET_bitIncrementalSnapshot`: UInt = 1u;
public const val `JET_bitIndexColumnMustBeNonNull`: UInt = 2u;
public const val `JET_bitIndexColumnMustBeNull`: UInt = 1u;
public const val `JET_bitIndexCrossProduct`: UInt = 16384u;
public const val `JET_bitIndexDisallowNull`: UInt = 4u;
public const val `JET_bitIndexDisallowTruncation`: UInt = 65536u;
public const val `JET_bitIndexDotNetGuid`: UInt = 262144u;
public const val `JET_bitIndexEmpty`: UInt = 256u;
public const val `JET_bitIndexIgnoreAnyNull`: UInt = 32u;
public const val `JET_bitIndexIgnoreFirstNull`: UInt = 64u;
public const val `JET_bitIndexIgnoreNull`: UInt = 8u;
public const val `JET_bitIndexImmutableStructure`: UInt = 524288u;
public const val `JET_bitIndexKeyMost`: UInt = 32768u;
public const val `JET_bitIndexLazyFlush`: UInt = 128u;
public const val `JET_bitIndexNestedTable`: UInt = 131072u;
public const val `JET_bitIndexPrimary`: UInt = 2u;
public const val `JET_bitIndexSortNullsHigh`: UInt = 1024u;
public const val `JET_bitIndexTupleLimits`: UInt = 8192u;
public const val `JET_bitIndexTuples`: UInt = 4096u;
public const val `JET_bitIndexUnicode`: UInt = 2048u;
public const val `JET_bitIndexUnique`: UInt = 1u;
public const val `JET_bitIndexUnversioned`: UInt = 512u;
public const val `JET_bitKeepDbAttachedAtEndOfRecovery`: UInt = 4096u;
public const val `JET_bitKeyAscending`: UInt = 0u;
public const val `JET_bitKeyDataZeroLength`: UInt = 16u;
public const val `JET_bitKeyDescending`: UInt = 1u;
public const val `JET_bitLSCursor`: UInt = 2u;
public const val `JET_bitLSReset`: UInt = 1u;
public const val `JET_bitLSTable`: UInt = 4u;
public const val `JET_bitLogStreamMustExist`: UInt = 64u;
public const val `JET_bitMoveFirst`: UInt = 0u;
public const val `JET_bitMoveKeyNE`: UInt = 1u;
public const val `JET_bitNewKey`: UInt = 1u;
public const val `JET_bitNoMove`: UInt = 2u;
public const val `JET_bitNormalizedKey`: UInt = 8u;
public const val `JET_bitObjectSystem`: UInt = 2147483648u;
public const val `JET_bitObjectTableDerived`: UInt = 268435456u;
public const val `JET_bitObjectTableFixedDDL`: UInt = 1073741824u;
public const val `JET_bitObjectTableNoFixedVarColumnsInDerivedTables`: UInt = 67108864u;
public const val `JET_bitObjectTableTemplate`: UInt = 536870912u;
public const val `JET_bitPartialColumnEndLimit`: UInt = 2048u;
public const val `JET_bitPartialColumnStartLimit`: UInt = 1024u;
public const val `JET_bitPrereadBackward`: UInt = 2u;
public const val `JET_bitPrereadFirstPage`: UInt = 4u;
public const val `JET_bitPrereadForward`: UInt = 1u;
public const val `JET_bitPrereadNormalizedKey`: UInt = 8u;
public const val `JET_bitRangeInclusive`: UInt = 1u;
public const val `JET_bitRangeInstantDuration`: UInt = 4u;
public const val `JET_bitRangeRemove`: UInt = 8u;
public const val `JET_bitRangeUpperLimit`: UInt = 2u;
public const val `JET_bitReadLock`: UInt = 1u;
public const val `JET_bitRecordInIndex`: UInt = 1u;
public const val `JET_bitRecordNotInIndex`: UInt = 2u;
public const val `JET_bitRecordSizeInCopyBuffer`: UInt = 1u;
public const val `JET_bitRecordSizeLocal`: UInt = 4u;
public const val `JET_bitRecordSizeRunningTotal`: UInt = 2u;
public const val `JET_bitRecoveryWithoutUndo`: UInt = 8u;
public const val `JET_bitReplayIgnoreLostLogs`: UInt = 128u;
public const val `JET_bitReplayIgnoreMissingDB`: UInt = 4u;
public const val `JET_bitReplayMissingMapEntryDB`: UInt = 32u;
public const val `JET_bitResizeDatabaseOnlyGrow`: UInt = 1u;
public const val `JET_bitResizeDatabaseOnlyShrink`: UInt = 2u;
public const val `JET_bitRetrieveCopy`: UInt = 1u;
public const val `JET_bitRetrieveFromIndex`: UInt = 2u;
public const val `JET_bitRetrieveFromPrimaryBookmark`: UInt = 4u;
public const val `JET_bitRetrieveHintReserve1`: UInt = 8u;
public const val `JET_bitRetrieveHintReserve2`: UInt = 64u;
public const val `JET_bitRetrieveHintReserve3`: UInt = 128u;
public const val `JET_bitRetrieveHintTableScanBackward`: UInt = 32u;
public const val `JET_bitRetrieveHintTableScanForward`: UInt = 16u;
public const val `JET_bitRetrieveIgnoreDefault`: UInt = 32u;
public const val `JET_bitRetrieveNull`: UInt = 16u;
public const val `JET_bitRetrieveTag`: UInt = 8u;
public const val `JET_bitRetrieveTuple`: UInt = 2048u;
public const val `JET_bitRollbackAll`: UInt = 1u;
public const val `JET_bitSeekEQ`: UInt = 1u;
public const val `JET_bitSeekGE`: UInt = 8u;
public const val `JET_bitSeekGT`: UInt = 16u;
public const val `JET_bitSeekLE`: UInt = 4u;
public const val `JET_bitSeekLT`: UInt = 2u;
public const val `JET_bitSetAppendLV`: UInt = 1u;
public const val `JET_bitSetCompressed`: UInt = 131072u;
public const val `JET_bitSetContiguousLV`: UInt = 262144u;
public const val `JET_bitSetIndexRange`: UInt = 32u;
public const val `JET_bitSetIntrinsicLV`: UInt = 1024u;
public const val `JET_bitSetOverwriteLV`: UInt = 4u;
public const val `JET_bitSetRevertToDefaultValue`: UInt = 512u;
public const val `JET_bitSetSeparateLV`: UInt = 64u;
public const val `JET_bitSetSizeLV`: UInt = 8u;
public const val `JET_bitSetUncompressed`: UInt = 65536u;
public const val `JET_bitSetUniqueMultiValues`: UInt = 128u;
public const val `JET_bitSetUniqueNormalizedMultiValues`: UInt = 256u;
public const val `JET_bitSetZeroLength`: UInt = 32u;
public const val `JET_bitShrinkDatabaseOff`: UInt = 0u;
public const val `JET_bitShrinkDatabaseOn`: UInt = 1u;
public const val `JET_bitShrinkDatabaseRealtime`: UInt = 2u;
public const val `JET_bitShrinkDatabaseTrim`: UInt = 1u;
public const val `JET_bitSpaceHintsUtilizeParentSpace`: UInt = 1u;
public const val `JET_bitStopServiceAll`: UInt = 0u;
public const val `JET_bitStopServiceBackgroundUserTasks`: UInt = 2u;
public const val `JET_bitStopServiceQuiesceCaches`: UInt = 4u;
public const val `JET_bitStopServiceResume`: UInt = 2147483648u;
public const val `JET_bitStrLimit`: UInt = 2u;
public const val `JET_bitSubStrLimit`: UInt = 4u;
public const val `JET_bitTTDotNetGuid`: UInt = 256u;
public const val `JET_bitTTErrorOnDuplicateInsertion`: UInt = 32u;
public const val `JET_bitTTForceMaterialization`: UInt = 32u;
public const val `JET_bitTTForwardOnly`: UInt = 64u;
public const val `JET_bitTTIndexed`: UInt = 1u;
public const val `JET_bitTTIntrinsicLVsOnly`: UInt = 128u;
public const val `JET_bitTTScrollable`: UInt = 8u;
public const val `JET_bitTTSortNullsHigh`: UInt = 16u;
public const val `JET_bitTTUnique`: UInt = 2u;
public const val `JET_bitTTUpdatable`: UInt = 4u;
public const val `JET_bitTableClass1`: UInt = 65536u;
public const val `JET_bitTableClass10`: UInt = 655360u;
public const val `JET_bitTableClass11`: UInt = 720896u;
public const val `JET_bitTableClass12`: UInt = 786432u;
public const val `JET_bitTableClass13`: UInt = 851968u;
public const val `JET_bitTableClass14`: UInt = 917504u;
public const val `JET_bitTableClass15`: UInt = 983040u;
public const val `JET_bitTableClass2`: UInt = 131072u;
public const val `JET_bitTableClass3`: UInt = 196608u;
public const val `JET_bitTableClass4`: UInt = 262144u;
public const val `JET_bitTableClass5`: UInt = 327680u;
public const val `JET_bitTableClass6`: UInt = 393216u;
public const val `JET_bitTableClass7`: UInt = 458752u;
public const val `JET_bitTableClass8`: UInt = 524288u;
public const val `JET_bitTableClass9`: UInt = 589824u;
public const val `JET_bitTableClassMask`: UInt = 2031616u;
public const val `JET_bitTableClassNone`: UInt = 0u;
public const val `JET_bitTableCreateFixedDDL`: UInt = 1u;
public const val `JET_bitTableCreateImmutableStructure`: UInt = 8u;
public const val `JET_bitTableCreateNoFixedVarColumnsInDerivedTables`: UInt = 4u;
public const val `JET_bitTableCreateTemplateTable`: UInt = 2u;
public const val `JET_bitTableDenyRead`: UInt = 2u;
public const val `JET_bitTableDenyWrite`: UInt = 1u;
public const val `JET_bitTableInfoBookmark`: UInt = 2u;
public const val `JET_bitTableInfoRollback`: UInt = 4u;
public const val `JET_bitTableInfoUpdatable`: UInt = 1u;
public const val `JET_bitTableNoCache`: UInt = 32u;
public const val `JET_bitTableOpportuneRead`: UInt = 128u;
public const val `JET_bitTablePermitDDL`: UInt = 16u;
public const val `JET_bitTablePreread`: UInt = 64u;
public const val `JET_bitTableReadOnly`: UInt = 4u;
public const val `JET_bitTableSequential`: UInt = 32768u;
public const val `JET_bitTableUpdatable`: UInt = 8u;
public const val `JET_bitTermAbrupt`: UInt = 2u;
public const val `JET_bitTermComplete`: UInt = 1u;
public const val `JET_bitTermDirty`: UInt = 8u;
public const val `JET_bitTermStopBackup`: UInt = 4u;
public const val `JET_bitTransactionReadOnly`: UInt = 1u;
public const val `JET_bitTruncateLogsAfterRecovery`: UInt = 16u;
public const val `JET_bitUpdateCheckESE97Compatibility`: UInt = 1u;
public const val `JET_bitWaitAllLevel0Commit`: UInt = 8u;
public const val `JET_bitWaitLastLevel0Commit`: UInt = 2u;
public const val `JET_bitWriteLock`: UInt = 2u;
public const val `JET_bitZeroLength`: UInt = 1u;
public const val `JET_cbBookmarkMost`: UInt = 256u;
public const val `JET_cbColumnLVPageOverhead`: UInt = 82u;
public const val `JET_cbColumnMost`: UInt = 255u;
public const val `JET_cbFullNameMost`: UInt = 255u;
public const val `JET_cbKeyMost`: UInt = 255u;
public const val `JET_cbKeyMost2KBytePage`: UInt = 500u;
public const val `JET_cbKeyMost4KBytePage`: UInt = 1000u;
public const val `JET_cbKeyMost8KBytePage`: UInt = 2000u;
public const val `JET_cbKeyMostMin`: UInt = 255u;
public const val `JET_cbLVColumnMost`: UInt = 2147483647u;
public const val `JET_cbLVDefaultValueMost`: UInt = 255u;
public const val `JET_cbLimitKeyMost`: UInt = 256u;
public const val `JET_cbNameMost`: UInt = 64u;
public const val `JET_cbPrimaryKeyMost`: UInt = 255u;
public const val `JET_cbSecondaryKeyMost`: UInt = 255u;
public const val `JET_cbtypAfterDelete`: UInt = 64u;
public const val `JET_cbtypAfterInsert`: UInt = 4u;
public const val `JET_cbtypAfterReplace`: UInt = 16u;
public const val `JET_cbtypBeforeDelete`: UInt = 32u;
public const val `JET_cbtypBeforeInsert`: UInt = 2u;
public const val `JET_cbtypBeforeReplace`: UInt = 8u;
public const val `JET_cbtypFinalize`: UInt = 1u;
public const val `JET_cbtypFreeCursorLS`: UInt = 512u;
public const val `JET_cbtypFreeTableLS`: UInt = 1024u;
public const val `JET_cbtypNull`: UInt = 0u;
public const val `JET_cbtypOnlineDefragCompleted`: UInt = 256u;
public const val `JET_cbtypUserDefinedDefaultValue`: UInt = 128u;
public const val `JET_ccolFixedMost`: UInt = 127u;
public const val `JET_ccolKeyMost`: UInt = 16u;
public const val `JET_ccolMost`: UInt = 65248u;
public const val `JET_ccolTaggedMost`: UInt = 64993u;
public const val `JET_ccolVarMost`: UInt = 128u;
public const val `JET_coltypBinary`: UInt = 9u;
public const val `JET_coltypBit`: UInt = 1u;
public const val `JET_coltypCurrency`: UInt = 5u;
public const val `JET_coltypDateTime`: UInt = 8u;
public const val `JET_coltypGUID`: UInt = 16u;
public const val `JET_coltypIEEEDouble`: UInt = 7u;
public const val `JET_coltypIEEESingle`: UInt = 6u;
public const val `JET_coltypLong`: UInt = 4u;
public const val `JET_coltypLongBinary`: UInt = 11u;
public const val `JET_coltypLongLong`: UInt = 15u;
public const val `JET_coltypLongText`: UInt = 12u;
public const val `JET_coltypMax`: UInt = 13u;
public const val `JET_coltypNil`: UInt = 0u;
public const val `JET_coltypSLV`: UInt = 13u;
public const val `JET_coltypShort`: UInt = 3u;
public const val `JET_coltypText`: UInt = 10u;
public const val `JET_coltypUnsignedByte`: UInt = 2u;
public const val `JET_coltypUnsignedLong`: UInt = 14u;
public const val `JET_coltypUnsignedLongLong`: UInt = 18u;
public const val `JET_coltypUnsignedShort`: UInt = 17u;
public const val `JET_configDefault`: UInt = 1u;
public const val `JET_configDynamicMediumMemory`: UInt = 32u;
public const val `JET_configHighConcurrencyScaling`: UInt = 1024u;
public const val `JET_configLowDiskFootprint`: UInt = 4u;
public const val `JET_configLowMemory`: UInt = 16u;
public const val `JET_configLowPower`: UInt = 64u;
public const val `JET_configMediumDiskFootprint`: UInt = 8u;
public const val `JET_configRemoveQuotas`: UInt = 2u;
public const val `JET_configRunSilent`: UInt = 256u;
public const val `JET_configSSDProfileIO`: UInt = 128u;
public const val `JET_configUnthrottledMemory`: UInt = 512u;
public const val `JET_dbstateBeingConverted`: UInt = 4u;
public const val `JET_dbstateCleanShutdown`: UInt = 3u;
public const val `JET_dbstateDirtyShutdown`: UInt = 2u;
public const val `JET_dbstateForceDetach`: UInt = 5u;
public const val `JET_dbstateJustCreated`: UInt = 1u;
public const val `JET_errAccessDenied`: Int = -1907;
public const val `JET_errAfterInitialization`: Int = -1850;
public const val `JET_errAlreadyInitialized`: Int = -1030;
public const val `JET_errAlreadyPrepared`: Int = -1607;
public const val `JET_errAttachedDatabaseMismatch`: Int = -1216;
public const val `JET_errBackupAbortByServer`: Int = -801;
public const val `JET_errBackupDirectoryNotEmpty`: Int = -504;
public const val `JET_errBackupInProgress`: Int = -505;
public const val `JET_errBackupNotAllowedYet`: Int = -523;
public const val `JET_errBadBackupDatabaseSize`: Int = -561;
public const val `JET_errBadBookmark`: Int = -328;
public const val `JET_errBadCheckpointSignature`: Int = -532;
public const val `JET_errBadColumnId`: Int = -1517;
public const val `JET_errBadDbSignature`: Int = -531;
public const val `JET_errBadEmptyPage`: Int = -351;
public const val `JET_errBadItagSequence`: Int = -1518;
public const val `JET_errBadLineCount`: Int = -354;
public const val `JET_errBadLogSignature`: Int = -530;
public const val `JET_errBadLogVersion`: Int = -514;
public const val `JET_errBadPageLink`: Int = -327;
public const val `JET_errBadParentPageLink`: Int = -338;
public const val `JET_errBadPatchPage`: Int = -535;
public const val `JET_errBadRestoreTargetInstance`: Int = -577;
public const val `JET_errBufferTooSmall`: Int = -1038;
public const val `JET_errCallbackFailed`: Int = -2101;
public const val `JET_errCallbackNotResolved`: Int = -2102;
public const val `JET_errCannotAddFixedVarColumnToDerivedTable`: Int = -1330;
public const val `JET_errCannotBeTagged`: Int = -1521;
public const val `JET_errCannotDeleteSystemTable`: Int = -1318;
public const val `JET_errCannotDeleteTempTable`: Int = -1317;
public const val `JET_errCannotDeleteTemplateTable`: Int = -1319;
public const val `JET_errCannotDisableVersioning`: Int = -1208;
public const val `JET_errCannotIndex`: Int = -1071;
public const val `JET_errCannotIndexOnEncryptedColumn`: Int = -1440;
public const val `JET_errCannotLogDuringRecoveryRedo`: Int = -512;
public const val `JET_errCannotMaterializeForwardOnlySort`: Int = -1113;
public const val `JET_errCannotNestDDL`: Int = -1325;
public const val `JET_errCannotSeparateIntrinsicLV`: Int = -416;
public const val `JET_errCatalogCorrupted`: Int = -1220;
public const val `JET_errCheckpointCorrupt`: Int = -533;
public const val `JET_errCheckpointDepthTooDeep`: Int = -614;
public const val `JET_errCheckpointFileNotFound`: Int = -542;
public const val `JET_errClientRequestToStopJetService`: Int = -1329;
public const val `JET_errColumnCannotBeCompressed`: Int = -1538;
public const val `JET_errColumnCannotBeEncrypted`: Int = -1439;
public const val `JET_errColumnDoesNotFit`: Int = -1503;
public const val `JET_errColumnDuplicate`: Int = -1508;
public const val `JET_errColumnInRelationship`: Int = -1519;
public const val `JET_errColumnInUse`: Int = -1046;
public const val `JET_errColumnIndexed`: Int = -1505;
public const val `JET_errColumnLong`: Int = -1501;
public const val `JET_errColumnNoChunk`: Int = -1502;
public const val `JET_errColumnNoEncryptionKey`: Int = -1540;
public const val `JET_errColumnNotFound`: Int = -1507;
public const val `JET_errColumnNotUpdatable`: Int = -1048;
public const val `JET_errColumnRedundant`: Int = -1510;
public const val `JET_errColumnTooBig`: Int = -1506;
public const val `JET_errCommittedLogFileCorrupt`: Int = -586;
public const val `JET_errCommittedLogFilesMissing`: Int = -582;
public const val `JET_errConsistentTimeMismatch`: Int = -551;
public const val `JET_errContainerNotEmpty`: Int = -1043;
public const val `JET_errDDLNotInheritable`: Int = -1326;
public const val `JET_errDataHasChanged`: Int = -1611;
public const val `JET_errDatabase200Format`: Int = -1210;
public const val `JET_errDatabase400Format`: Int = -1211;
public const val `JET_errDatabase500Format`: Int = -1212;
public const val `JET_errDatabaseAlreadyRunningMaintenance`: Int = -2004;
public const val `JET_errDatabaseAlreadyUpgraded`: Int = -562;
public const val `JET_errDatabaseAttachedForRecovery`: Int = -1231;
public const val `JET_errDatabaseBufferDependenciesCorrupted`: Int = -255;
public const val `JET_errDatabaseCorrupted`: Int = -1206;
public const val `JET_errDatabaseCorruptedNoRepair`: Int = -1224;
public const val `JET_errDatabaseDirtyShutdown`: Int = -550;
public const val `JET_errDatabaseDuplicate`: Int = -1201;
public const val `JET_errDatabaseFileReadOnly`: Int = -1008;
public const val `JET_errDatabaseIdInUse`: Int = -1218;
public const val `JET_errDatabaseInUse`: Int = -1202;
public const val `JET_errDatabaseIncompleteUpgrade`: Int = -563;
public const val `JET_errDatabaseInconsistent`: Int = -550;
public const val `JET_errDatabaseInvalidName`: Int = -1204;
public const val `JET_errDatabaseInvalidPages`: Int = -1205;
public const val `JET_errDatabaseInvalidPath`: Int = -1217;
public const val `JET_errDatabaseLeakInSpace`: Int = -348;
public const val `JET_errDatabaseLocked`: Int = -1207;
public const val `JET_errDatabaseLogSetMismatch`: Int = -539;
public const val `JET_errDatabaseNotFound`: Int = -1203;
public const val `JET_errDatabaseNotReady`: Int = -1230;
public const val `JET_errDatabasePatchFileMismatch`: Int = -552;
public const val `JET_errDatabaseSharingViolation`: Int = -1215;
public const val `JET_errDatabaseSignInUse`: Int = -1222;
public const val `JET_errDatabaseStreamingFileMismatch`: Int = -540;
public const val `JET_errDatabaseUnavailable`: Int = -1091;
public const val `JET_errDatabasesNotFromSameSnapshot`: Int = -580;
public const val `JET_errDbTimeBeyondMaxRequired`: Int = -625;
public const val `JET_errDbTimeCorrupted`: Int = -344;
public const val `JET_errDbTimeTooNew`: Int = -567;
public const val `JET_errDbTimeTooOld`: Int = -566;
public const val `JET_errDecompressionFailed`: Int = -1620;
public const val `JET_errDecryptionFailed`: Int = -1622;
public const val `JET_errDefaultValueTooBig`: Int = -1524;
public const val `JET_errDeleteBackupFileFail`: Int = -524;
public const val `JET_errDensityInvalid`: Int = -1307;
public const val `JET_errDerivedColumnCorruption`: Int = -1529;
public const val `JET_errDirtyShutdown`: Int = -1116;
public const val `JET_errDisabledFunctionality`: Int = -112;
public const val `JET_errDiskFull`: Int = -1808;
public const val `JET_errDiskIO`: Int = -1022;
public const val `JET_errDiskReadVerificationFailure`: Int = -1021;
public const val `JET_errEncryptionBadItag`: Int = -1623;
public const val `JET_errEndingRestoreLogTooLow`: Int = -553;
public const val `JET_errEngineFormatVersionNoLongerSupportedTooLow`: Int = -619;
public const val `JET_errEngineFormatVersionNotYetImplementedTooHigh`: Int = -620;
public const val `JET_errEngineFormatVersionParamTooLowForRequestedFeature`: Int = -621;
public const val `JET_errEngineFormatVersionSpecifiedTooLowForDatabaseVersion`: Int = -623;
public const val `JET_errEngineFormatVersionSpecifiedTooLowForLogVersion`: Int = -622;
public const val `JET_errEntryPointNotFound`: Int = -1911;
public const val `JET_errExclusiveTableLockRequired`: Int = -1322;
public const val `JET_errExistingLogFileHasBadSignature`: Int = -610;
public const val `JET_errExistingLogFileIsNotContiguous`: Int = -611;
public const val `JET_errFeatureNotAvailable`: Int = -1001;
public const val `JET_errFileAccessDenied`: Int = -1032;
public const val `JET_errFileAlreadyExists`: Int = -1814;
public const val `JET_errFileClose`: Int = -102;
public const val `JET_errFileCompressed`: Int = -4005;
public const val `JET_errFileIOAbort`: Int = -4002;
public const val `JET_errFileIOBeyondEOF`: Int = -4001;
public const val `JET_errFileIOFail`: Int = -4004;
public const val `JET_errFileIORetry`: Int = -4003;
public const val `JET_errFileIOSparse`: Int = -4000;
public const val `JET_errFileInvalidType`: Int = -1812;
public const val `JET_errFileNotFound`: Int = -1811;
public const val `JET_errFileSystemCorruption`: Int = -1121;
public const val `JET_errFilteredMoveNotSupported`: Int = -1124;
public const val `JET_errFixedDDL`: Int = -1323;
public const val `JET_errFixedInheritedDDL`: Int = -1324;
public const val `JET_errFlushMapDatabaseMismatch`: Int = -1919;
public const val `JET_errFlushMapUnrecoverable`: Int = -1920;
public const val `JET_errFlushMapVersionUnsupported`: Int = -1918;
public const val `JET_errForceDetachNotAllowed`: Int = -1219;
public const val `JET_errGivenLogFileHasBadSignature`: Int = -555;
public const val `JET_errGivenLogFileIsNotContiguous`: Int = -556;
public const val `JET_errIllegalOperation`: Int = -1312;
public const val `JET_errInTransaction`: Int = -1108;
public const val `JET_errIndexBuildCorrupted`: Int = -1412;
public const val `JET_errIndexCantBuild`: Int = -1401;
public const val `JET_errIndexDuplicate`: Int = -1403;
public const val `JET_errIndexHasPrimary`: Int = -1402;
public const val `JET_errIndexInUse`: Int = -1051;
public const val `JET_errIndexInvalidDef`: Int = -1406;
public const val `JET_errIndexMustStay`: Int = -1405;
public const val `JET_errIndexNotFound`: Int = -1404;
public const val `JET_errIndexTuplesCannotRetrieveFromIndex`: Int = -1436;
public const val `JET_errIndexTuplesInvalidLimits`: Int = -1435;
public const val `JET_errIndexTuplesKeyTooSmall`: Int = -1437;
public const val `JET_errIndexTuplesNonUniqueOnly`: Int = -1432;
public const val `JET_errIndexTuplesOneColumnOnly`: Int = -1431;
public const val `JET_errIndexTuplesSecondaryIndexOnly`: Int = -1430;
public const val `JET_errIndexTuplesTextBinaryColumnsOnly`: Int = -1433;
public const val `JET_errIndexTuplesTextColumnsOnly`: Int = -1433;
public const val `JET_errIndexTuplesTooManyColumns`: Int = -1431;
public const val `JET_errIndexTuplesVarSegMacNotAllowed`: Int = -1434;
public const val `JET_errInitInProgress`: Int = -1031;
public const val `JET_errInstanceNameInUse`: Int = -1086;
public const val `JET_errInstanceUnavailable`: Int = -1090;
public const val `JET_errInstanceUnavailableDueToFatalLogDiskFull`: Int = -1092;
public const val `JET_errInternalError`: Int = -107;
public const val `JET_errInvalidBackup`: Int = -526;
public const val `JET_errInvalidBackupSequence`: Int = -521;
public const val `JET_errInvalidBookmark`: Int = -1045;
public const val `JET_errInvalidBufferSize`: Int = -1047;
public const val `JET_errInvalidCodePage`: Int = -1063;
public const val `JET_errInvalidColumnType`: Int = -1511;
public const val `JET_errInvalidCountry`: Int = -1061;
public const val `JET_errInvalidCreateDbVersion`: Int = -1225;
public const val `JET_errInvalidCreateIndex`: Int = -1409;
public const val `JET_errInvalidDatabase`: Int = -1028;
public const val `JET_errInvalidDatabaseId`: Int = -1010;
public const val `JET_errInvalidDatabaseVersion`: Int = -1209;
public const val `JET_errInvalidDbparamId`: Int = -1095;
public const val `JET_errInvalidFilename`: Int = -1044;
public const val `JET_errInvalidGrbit`: Int = -900;
public const val `JET_errInvalidIndexId`: Int = -1416;
public const val `JET_errInvalidInstance`: Int = -1115;
public const val `JET_errInvalidLCMapStringFlags`: Int = -1064;
public const val `JET_errInvalidLVChunkSize`: Int = -1438;
public const val `JET_errInvalidLanguageId`: Int = -1062;
public const val `JET_errInvalidLogDirectory`: Int = -1025;
public const val `JET_errInvalidLogSequence`: Int = -515;
public const val `JET_errInvalidLoggedOperation`: Int = -500;
public const val `JET_errInvalidName`: Int = -1002;
public const val `JET_errInvalidObject`: Int = -1316;
public const val `JET_errInvalidOnSort`: Int = -1702;
public const val `JET_errInvalidOperation`: Int = -1906;
public const val `JET_errInvalidParameter`: Int = -1003;
public const val `JET_errInvalidPath`: Int = -1023;
public const val `JET_errInvalidPlaceholderColumn`: Int = -1530;
public const val `JET_errInvalidPreread`: Int = -424;
public const val `JET_errInvalidSesid`: Int = -1104;
public const val `JET_errInvalidSesparamId`: Int = -1093;
public const val `JET_errInvalidSettings`: Int = -1328;
public const val `JET_errInvalidSystemPath`: Int = -1024;
public const val `JET_errInvalidTableId`: Int = -1310;
public const val `JET_errKeyBoundary`: Int = -324;
public const val `JET_errKeyDuplicate`: Int = -1605;
public const val `JET_errKeyIsMade`: Int = -1516;
public const val `JET_errKeyNotMade`: Int = -1608;
public const val `JET_errKeyTooBig`: Int = -408;
public const val `JET_errKeyTruncated`: Int = -346;
public const val `JET_errLSAlreadySet`: Int = -3001;
public const val `JET_errLSCallbackNotSpecified`: Int = -3000;
public const val `JET_errLSNotSet`: Int = -3002;
public const val `JET_errLVCorrupted`: Int = -1526;
public const val `JET_errLanguageNotSupported`: Int = -1619;
public const val `JET_errLinkNotSupported`: Int = -1052;
public const val `JET_errLogBufferTooSmall`: Int = -517;
public const val `JET_errLogCorruptDuringHardRecovery`: Int = -574;
public const val `JET_errLogCorruptDuringHardRestore`: Int = -573;
public const val `JET_errLogCorrupted`: Int = -1852;
public const val `JET_errLogDisabledDueToRecoveryFailure`: Int = -511;
public const val `JET_errLogDiskFull`: Int = -529;
public const val `JET_errLogFileCorrupt`: Int = -501;
public const val `JET_errLogFileNotCopied`: Int = -616;
public const val `JET_errLogFilePathInUse`: Int = -1084;
public const val `JET_errLogFileSizeMismatch`: Int = -541;
public const val `JET_errLogFileSizeMismatchDatabasesConsistent`: Int = -545;
public const val `JET_errLogGenerationMismatch`: Int = -513;
public const val `JET_errLogReadVerifyFailure`: Int = -612;
public const val `JET_errLogSectorSizeMismatch`: Int = -546;
public const val `JET_errLogSectorSizeMismatchDatabasesConsistent`: Int = -547;
public const val `JET_errLogSequenceChecksumMismatch`: Int = -590;
public const val `JET_errLogSequenceEnd`: Int = -519;
public const val `JET_errLogSequenceEndDatabasesConsistent`: Int = -548;
public const val `JET_errLogTornWriteDuringHardRecovery`: Int = -571;
public const val `JET_errLogTornWriteDuringHardRestore`: Int = -570;
public const val `JET_errLogWriteFail`: Int = -510;
public const val `JET_errLoggingDisabled`: Int = -516;
public const val `JET_errMakeBackupDirectoryFail`: Int = -525;
public const val `JET_errMissingCurrentLogFiles`: Int = -565;
public const val `JET_errMissingFileToBackup`: Int = -569;
public const val `JET_errMissingFullBackup`: Int = -560;
public const val `JET_errMissingLogFile`: Int = -528;
public const val `JET_errMissingPatchPage`: Int = -534;
public const val `JET_errMissingPreviousLogFile`: Int = -509;
public const val `JET_errMissingRestoreLogFiles`: Int = -557;
public const val `JET_errMultiValuedColumnMustBeTagged`: Int = -1509;
public const val `JET_errMultiValuedDuplicate`: Int = -1525;
public const val `JET_errMultiValuedDuplicateAfterTruncation`: Int = -1528;
public const val `JET_errMultiValuedIndexViolation`: Int = -1411;
public const val `JET_errMustBeSeparateLongValue`: Int = -423;
public const val `JET_errMustDisableLoggingForDbUpgrade`: Int = -575;
public const val `JET_errMustRollback`: Int = -1057;
public const val `JET_errNTSystemCallFailed`: Int = -334;
public const val `JET_errNoBackup`: Int = -520;
public const val `JET_errNoBackupDirectory`: Int = -503;
public const val `JET_errNoCurrentIndex`: Int = -1515;
public const val `JET_errNoCurrentRecord`: Int = -1603;
public const val `JET_errNodeCorrupted`: Int = -358;
public const val `JET_errNotInTransaction`: Int = -1054;
public const val `JET_errNotInitialized`: Int = -1029;
public const val `JET_errNullInvalid`: Int = -1504;
public const val `JET_errNullKeyDisallowed`: Int = -1053;
public const val `JET_errOSSnapshotInvalidSequence`: Int = -2401;
public const val `JET_errOSSnapshotInvalidSnapId`: Int = -2404;
public const val `JET_errOSSnapshotNotAllowed`: Int = -2403;
public const val `JET_errOSSnapshotTimeOut`: Int = -2402;
public const val `JET_errObjectDuplicate`: Int = -1314;
public const val `JET_errObjectNotFound`: Int = -1305;
public const val `JET_errOneDatabasePerSession`: Int = -1916;
public const val `JET_errOutOfAutoincrementValues`: Int = -1076;
public const val `JET_errOutOfBuffers`: Int = -1014;
public const val `JET_errOutOfCursors`: Int = -1013;
public const val `JET_errOutOfDatabaseSpace`: Int = -1012;
public const val `JET_errOutOfDbtimeValues`: Int = -1077;
public const val `JET_errOutOfFileHandles`: Int = -1020;
public const val `JET_errOutOfLongValueIDs`: Int = -1075;
public const val `JET_errOutOfMemory`: Int = -1011;
public const val `JET_errOutOfObjectIDs`: Int = -1074;
public const val `JET_errOutOfSequentialIndexValues`: Int = -1078;
public const val `JET_errOutOfSessions`: Int = -1101;
public const val `JET_errOutOfThreads`: Int = -103;
public const val `JET_errPageBoundary`: Int = -323;
public const val `JET_errPageInitializedMismatch`: Int = -596;
public const val `JET_errPageNotInitialized`: Int = -1019;
public const val `JET_errPageSizeMismatch`: Int = -1213;
public const val `JET_errPageTagCorrupted`: Int = -357;
public const val `JET_errPartiallyAttachedDB`: Int = -1221;
public const val `JET_errPatchFileMissing`: Int = -538;
public const val `JET_errPermissionDenied`: Int = -1809;
public const val `JET_errPreviousVersion`: Int = -322;
public const val `JET_errPrimaryIndexCorrupted`: Int = -1413;
public const val `JET_errReadLostFlushVerifyFailure`: Int = -1119;
public const val `JET_errReadPgnoVerifyFailure`: Int = -1118;
public const val `JET_errReadVerifyFailure`: Int = -1018;
public const val `JET_errRecordDeleted`: Int = -1017;
public const val `JET_errRecordFormatConversionFailed`: Int = -1915;
public const val `JET_errRecordNoCopy`: Int = -1602;
public const val `JET_errRecordNotDeleted`: Int = -1072;
public const val `JET_errRecordNotFound`: Int = -1601;
public const val `JET_errRecordPrimaryChanged`: Int = -1604;
public const val `JET_errRecordTooBig`: Int = -1026;
public const val `JET_errRecordTooBigForBackwardCompatibility`: Int = -1112;
public const val `JET_errRecoveredWithErrors`: Int = -527;
public const val `JET_errRecoveredWithoutUndo`: Int = -579;
public const val `JET_errRecoveredWithoutUndoDatabasesConsistent`: Int = -584;
public const val `JET_errRecoveryVerifyFailure`: Int = -1123;
public const val `JET_errRedoAbruptEnded`: Int = -536;
public const val `JET_errRequiredLogFilesMissing`: Int = -543;
public const val `JET_errRestoreInProgress`: Int = -506;
public const val `JET_errRestoreOfNonBackupDatabase`: Int = -615;
public const val `JET_errRfsFailure`: Int = -100;
public const val `JET_errRfsNotArmed`: Int = -101;
public const val `JET_errRollbackError`: Int = -1917;
public const val `JET_errRollbackRequired`: Int = -1109;
public const val `JET_errRunningInMultiInstanceMode`: Int = -1081;
public const val `JET_errRunningInOneInstanceMode`: Int = -1080;
public const val `JET_errSPAvailExtCacheOutOfMemory`: Int = -342;
public const val `JET_errSPAvailExtCacheOutOfSync`: Int = -340;
public const val `JET_errSPAvailExtCorrupted`: Int = -341;
public const val `JET_errSPOwnExtCorrupted`: Int = -343;
public const val `JET_errSecondaryIndexCorrupted`: Int = -1414;
public const val `JET_errSectorSizeNotSupported`: Int = -583;
public const val `JET_errSeparatedLongValue`: Int = -421;
public const val `JET_errSesidTableIdMismatch`: Int = -1114;
public const val `JET_errSessionContextAlreadySet`: Int = -1912;
public const val `JET_errSessionContextNotSetByThisThread`: Int = -1913;
public const val `JET_errSessionInUse`: Int = -1914;
public const val `JET_errSessionSharingViolation`: Int = -1910;
public const val `JET_errSessionWriteConflict`: Int = -1111;
public const val `JET_errSoftRecoveryOnBackupDatabase`: Int = -544;
public const val `JET_errSoftRecoveryOnSnapshot`: Int = -581;
public const val `JET_errSpaceHintsInvalid`: Int = -2103;
public const val `JET_errStartingRestoreLogTooHigh`: Int = -554;
public const val `JET_errStreamingDataNotLogged`: Int = -549;
public const val `JET_errSuccess`: Int = 0;
public const val `JET_errSystemParameterConflict`: Int = -1087;
public const val `JET_errSystemParamsAlreadySet`: Int = -1082;
public const val `JET_errSystemPathInUse`: Int = -1083;
public const val `JET_errTableDuplicate`: Int = -1303;
public const val `JET_errTableInUse`: Int = -1304;
public const val `JET_errTableLocked`: Int = -1302;
public const val `JET_errTableNotEmpty`: Int = -1308;
public const val `JET_errTaggedNotNULL`: Int = -1514;
public const val `JET_errTaskDropped`: Int = -106;
public const val `JET_errTempFileOpenError`: Int = -1803;
public const val `JET_errTempPathInUse`: Int = -1085;
public const val `JET_errTermInProgress`: Int = -1000;
public const val `JET_errTooManyActiveUsers`: Int = -1059;
public const val `JET_errTooManyAttachedDatabases`: Int = -1805;
public const val `JET_errTooManyColumns`: Int = -1040;
public const val `JET_errTooManyIO`: Int = -105;
public const val `JET_errTooManyIndexes`: Int = -1015;
public const val `JET_errTooManyInstances`: Int = -1214;
public const val `JET_errTooManyKeys`: Int = -1016;
public const val `JET_errTooManyMempoolEntries`: Int = -1073;
public const val `JET_errTooManyOpenDatabases`: Int = -1027;
public const val `JET_errTooManyOpenIndexes`: Int = -1410;
public const val `JET_errTooManyOpenTables`: Int = -1311;
public const val `JET_errTooManyOpenTablesAndCleanupTimedOut`: Int = -1313;
public const val `JET_errTooManyRecords`: Int = -1094;
public const val `JET_errTooManySorts`: Int = -1701;
public const val `JET_errTooManySplits`: Int = -1909;
public const val `JET_errTransReadOnly`: Int = -1110;
public const val `JET_errTransTooDeep`: Int = -1103;
public const val `JET_errTransactionTooLong`: Int = -618;
public const val `JET_errTransactionsNotReadyDuringRecovery`: Int = -1232;
public const val `JET_errUnicodeLanguageValidationFailure`: Int = -604;
public const val `JET_errUnicodeNormalizationNotSupported`: Int = -603;
public const val `JET_errUnicodeTranslationBufferTooSmall`: Int = -601;
public const val `JET_errUnicodeTranslationFail`: Int = -602;
public const val `JET_errUnloadableOSFunctionality`: Int = -113;
public const val `JET_errUpdateMustVersion`: Int = -1621;
public const val `JET_errUpdateNotPrepared`: Int = -1609;
public const val `JET_errVersionStoreEntryTooBig`: Int = -1065;
public const val `JET_errVersionStoreOutOfMemory`: Int = -1069;
public const val `JET_errVersionStoreOutOfMemoryAndCleanupTimedOut`: Int = -1066;
public const val `JET_errWriteConflict`: Int = -1102;
public const val `JET_errWriteConflictPrimaryIndex`: Int = -1105;
public const val `JET_errcatApi`: `JET_ERRCAT` = 13;
public const val `JET_errcatCorruption`: `JET_ERRCAT` = 10;
public const val `JET_errcatData`: `JET_ERRCAT` = 9;
public const val `JET_errcatDisk`: `JET_ERRCAT` = 8;
public const val `JET_errcatError`: `JET_ERRCAT` = 1;
public const val `JET_errcatFatal`: `JET_ERRCAT` = 3;
public const val `JET_errcatFragmentation`: `JET_ERRCAT` = 12;
public const val `JET_errcatIO`: `JET_ERRCAT` = 4;
public const val `JET_errcatInconsistent`: `JET_ERRCAT` = 11;
public const val `JET_errcatMax`: `JET_ERRCAT` = 17;
public const val `JET_errcatMemory`: `JET_ERRCAT` = 6;
public const val `JET_errcatObsolete`: `JET_ERRCAT` = 16;
public const val `JET_errcatOperation`: `JET_ERRCAT` = 2;
public const val `JET_errcatQuota`: `JET_ERRCAT` = 7;
public const val `JET_errcatResource`: `JET_ERRCAT` = 5;
public const val `JET_errcatState`: `JET_ERRCAT` = 15;
public const val `JET_errcatUnknown`: `JET_ERRCAT` = 0;
public const val `JET_errcatUsage`: `JET_ERRCAT` = 14;
public const val `JET_filetypeCheckpoint`: UInt = 4u;
public const val `JET_filetypeDatabase`: UInt = 1u;
public const val `JET_filetypeFlushMap`: UInt = 7u;
public const val `JET_filetypeLog`: UInt = 3u;
public const val `JET_filetypeTempDatabase`: UInt = 5u;
public const val `JET_filetypeUnknown`: UInt = 0u;
public const val `JET_objtypNil`: UInt = 0u;
public const val `JET_objtypTable`: UInt = 1u;
public const val `JET_paramAccessDeniedRetryPeriod`: UInt = 53u;
public const val `JET_paramAlternateDatabaseRecoveryPath`: UInt = 113u;
public const val `JET_paramBaseName`: UInt = 3u;
public const val `JET_paramBatchIOBufferMax`: UInt = 22u;
public const val `JET_paramCachePriority`: UInt = 177u;
public const val `JET_paramCacheSize`: UInt = 41u;
public const val `JET_paramCacheSizeMax`: UInt = 23u;
public const val `JET_paramCacheSizeMin`: UInt = 60u;
public const val `JET_paramCachedClosedTables`: UInt = 125u;
public const val `JET_paramCheckFormatWhenOpenFail`: UInt = 44u;
public const val `JET_paramCheckpointDepthMax`: UInt = 24u;
public const val `JET_paramCheckpointIOMax`: UInt = 135u;
public const val `JET_paramCircularLog`: UInt = 17u;
public const val `JET_paramCleanupMismatchedLogFiles`: UInt = 77u;
public const val `JET_paramCommitDefault`: UInt = 16u;
public const val `JET_paramConfigStoreSpec`: UInt = 189u;
public const val `JET_paramConfiguration`: UInt = 129u;
public const val `JET_paramCreatePathIfNotExist`: UInt = 100u;
public const val `JET_paramDatabasePageSize`: UInt = 64u;
public const val `JET_paramDbExtensionSize`: UInt = 18u;
public const val `JET_paramDbScanIntervalMaxSec`: UInt = 172u;
public const val `JET_paramDbScanIntervalMinSec`: UInt = 171u;
public const val `JET_paramDbScanThrottle`: UInt = 170u;
public const val `JET_paramDefragmentSequentialBTrees`: UInt = 160u;
public const val `JET_paramDefragmentSequentialBTreesDensityCheckFrequency`: UInt = 161u;
public const val `JET_paramDeleteOldLogs`: UInt = 48u;
public const val `JET_paramDeleteOutOfRangeLogs`: UInt = 52u;
public const val `JET_paramDisableCallbacks`: UInt = 65u;
public const val `JET_paramDisablePerfmon`: UInt = 107u;
public const val `JET_paramDurableCommitCallback`: UInt = 187u;
public const val `JET_paramEnableAdvanced`: UInt = 130u;
public const val `JET_paramEnableDBScanInRecovery`: UInt = 169u;
public const val `JET_paramEnableDBScanSerialization`: UInt = 180u;
public const val `JET_paramEnableFileCache`: UInt = 126u;
public const val `JET_paramEnableIndexChecking`: UInt = 45u;
public const val `JET_paramEnableIndexCleanup`: UInt = 54u;
public const val `JET_paramEnableOnlineDefrag`: UInt = 35u;
public const val `JET_paramEnablePersistedCallbacks`: UInt = 156u;
public const val `JET_paramEnableRBS`: UInt = 215u;
public const val `JET_paramEnableShrinkDatabase`: UInt = 184u;
public const val `JET_paramEnableSqm`: UInt = 188u;
public const val `JET_paramEnableTempTableVersioning`: UInt = 46u;
public const val `JET_paramEnableViewCache`: UInt = 127u;
public const val `JET_paramErrorToString`: UInt = 70u;
public const val `JET_paramEventLogCache`: UInt = 99u;
public const val `JET_paramEventLoggingLevel`: UInt = 51u;
public const val `JET_paramEventSource`: UInt = 4u;
public const val `JET_paramEventSourceKey`: UInt = 49u;
public const val `JET_paramExceptionAction`: UInt = 98u;
public const val `JET_paramGlobalMinVerPages`: UInt = 81u;
public const val `JET_paramHungIOActions`: UInt = 182u;
public const val `JET_paramHungIOThreshold`: UInt = 181u;
public const val `JET_paramIOPriority`: UInt = 152u;
public const val `JET_paramIOThrottlingTimeQuanta`: UInt = 162u;
public const val `JET_paramIgnoreLogVersion`: UInt = 47u;
public const val `JET_paramIndexTupleIncrement`: UInt = 132u;
public const val `JET_paramIndexTupleStart`: UInt = 133u;
public const val `JET_paramIndexTuplesLengthMax`: UInt = 111u;
public const val `JET_paramIndexTuplesLengthMin`: UInt = 110u;
public const val `JET_paramIndexTuplesToIndexMax`: UInt = 112u;
public const val `JET_paramKeyMost`: UInt = 134u;
public const val `JET_paramLRUKCorrInterval`: UInt = 25u;
public const val `JET_paramLRUKHistoryMax`: UInt = 26u;
public const val `JET_paramLRUKPolicy`: UInt = 27u;
public const val `JET_paramLRUKTimeout`: UInt = 28u;
public const val `JET_paramLRUKTrxCorrInterval`: UInt = 29u;
public const val `JET_paramLVChunkSizeMost`: UInt = 163u;
public const val `JET_paramLegacyFileNames`: UInt = 136u;
public const val `JET_paramLogBuffers`: UInt = 12u;
public const val `JET_paramLogCheckpointPeriod`: UInt = 14u;
public const val `JET_paramLogFileCreateAsynch`: UInt = 69u;
public const val `JET_paramLogFilePath`: UInt = 2u;
public const val `JET_paramLogFileSize`: UInt = 11u;
public const val `JET_paramLogWaitingUserMax`: UInt = 15u;
public const val `JET_paramMaxCoalesceReadGapSize`: UInt = 166u;
public const val `JET_paramMaxCoalesceReadSize`: UInt = 164u;
public const val `JET_paramMaxCoalesceWriteGapSize`: UInt = 167u;
public const val `JET_paramMaxCoalesceWriteSize`: UInt = 165u;
public const val `JET_paramMaxColtyp`: UInt = 131u;
public const val `JET_paramMaxCursors`: UInt = 8u;
public const val `JET_paramMaxInstances`: UInt = 104u;
public const val `JET_paramMaxOpenTables`: UInt = 6u;
public const val `JET_paramMaxSessions`: UInt = 5u;
public const val `JET_paramMaxTemporaryTables`: UInt = 10u;
public const val `JET_paramMaxTransactionSize`: UInt = 178u;
public const val `JET_paramMaxValueInvalid`: UInt = 218u;
public const val `JET_paramMaxVerPages`: UInt = 9u;
public const val `JET_paramMinDataForXpress`: UInt = 183u;
public const val `JET_paramNoInformationEvent`: UInt = 50u;
public const val `JET_paramOSSnapshotTimeout`: UInt = 82u;
public const val `JET_paramOneDatabasePerSession`: UInt = 102u;
public const val `JET_paramOutstandingIOMax`: UInt = 30u;
public const val `JET_paramPageFragment`: UInt = 20u;
public const val `JET_paramPageHintCacheSize`: UInt = 101u;
public const val `JET_paramPageTempDBMin`: UInt = 19u;
public const val `JET_paramPerfmonRefreshInterval`: UInt = 217u;
public const val `JET_paramPreferredMaxOpenTables`: UInt = 7u;
public const val `JET_paramPreferredVerPages`: UInt = 63u;
public const val `JET_paramPrereadIOMax`: UInt = 179u;
public const val `JET_paramProcessFriendlyName`: UInt = 186u;
public const val `JET_paramRBSFilePath`: UInt = 216u;
public const val `JET_paramRecordUpgradeDirtyLevel`: UInt = 78u;
public const val `JET_paramRecovery`: UInt = 34u;
public const val `JET_paramRuntimeCallback`: UInt = 73u;
public const val `JET_paramStartFlushThreshold`: UInt = 31u;
public const val `JET_paramStopFlushThreshold`: UInt = 32u;
public const val `JET_paramSystemPath`: UInt = 0u;
public const val `JET_paramTableClass10Name`: UInt = 146u;
public const val `JET_paramTableClass11Name`: UInt = 147u;
public const val `JET_paramTableClass12Name`: UInt = 148u;
public const val `JET_paramTableClass13Name`: UInt = 149u;
public const val `JET_paramTableClass14Name`: UInt = 150u;
public const val `JET_paramTableClass15Name`: UInt = 151u;
public const val `JET_paramTableClass1Name`: UInt = 137u;
public const val `JET_paramTableClass2Name`: UInt = 138u;
public const val `JET_paramTableClass3Name`: UInt = 139u;
public const val `JET_paramTableClass4Name`: UInt = 140u;
public const val `JET_paramTableClass5Name`: UInt = 141u;
public const val `JET_paramTableClass6Name`: UInt = 142u;
public const val `JET_paramTableClass7Name`: UInt = 143u;
public const val `JET_paramTableClass8Name`: UInt = 144u;
public const val `JET_paramTableClass9Name`: UInt = 145u;
public const val `JET_paramTempPath`: UInt = 1u;
public const val `JET_paramUnicodeIndexDefault`: UInt = 72u;
public const val `JET_paramUseFlushForWriteDurability`: UInt = 214u;
public const val `JET_paramVerPageSize`: UInt = 128u;
public const val `JET_paramVersionStoreTaskQueueMax`: UInt = 105u;
public const val `JET_paramWaitLogFlush`: UInt = 13u;
public const val `JET_paramWaypointLatency`: UInt = 153u;
public const val `JET_paramZeroDatabaseDuringBackup`: UInt = 71u;
public const val `JET_prepCancel`: UInt = 3u;
public const val `JET_prepInsert`: UInt = 0u;
public const val `JET_prepInsertCopy`: UInt = 5u;
public const val `JET_prepInsertCopyDeleteOriginal`: UInt = 7u;
public const val `JET_prepInsertCopyReplaceOriginal`: UInt = 9u;
public const val `JET_prepReplace`: UInt = 2u;
public const val `JET_prepReplaceNoLock`: UInt = 4u;
public const val `JET_relopBitmaskEqualsZero`: `JET_RELOP` = 7;
public const val `JET_relopBitmaskNotEqualsZero`: `JET_RELOP` = 8;
public const val `JET_relopEquals`: `JET_RELOP` = 0;
public const val `JET_relopGreaterThan`: `JET_RELOP` = 6;
public const val `JET_relopGreaterThanOrEqual`: `JET_RELOP` = 5;
public const val `JET_relopLessThan`: `JET_RELOP` = 4;
public const val `JET_relopLessThanOrEqual`: `JET_RELOP` = 3;
public const val `JET_relopNotEquals`: `JET_RELOP` = 2;
public const val `JET_relopPrefixEquals`: `JET_RELOP` = 1;
public const val `JET_sesparamCommitDefault`: UInt = 4097u;
public const val `JET_sesparamCorrelationID`: UInt = 4101u;
public const val `JET_sesparamMaxValueInvalid`: UInt = 4111u;
public const val `JET_sesparamOperationContext`: UInt = 4100u;
public const val `JET_sesparamTransactionLevel`: UInt = 4099u;
public const val `JET_snpBackup`: UInt = 9u;
public const val `JET_snpCompact`: UInt = 4u;
public const val `JET_snpRepair`: UInt = 2u;
public const val `JET_snpRestore`: UInt = 8u;
public const val `JET_snpScrub`: UInt = 11u;
public const val `JET_snpUpgrade`: UInt = 10u;
public const val `JET_snpUpgradeRecordFormat`: UInt = 12u;
public const val `JET_sntBegin`: UInt = 5u;
public const val `JET_sntComplete`: UInt = 6u;
public const val `JET_sntFail`: UInt = 3u;
public const val `JET_sntProgress`: UInt = 0u;
public const val `JET_sntRequirements`: UInt = 7u;
public const val `JET_sqmDisable`: UInt = 0u;
public const val `JET_sqmEnable`: UInt = 1u;
public const val `JET_sqmFromCEIP`: UInt = 2u;
public const val `JET_wrnBufferTruncated`: UInt = 1006u;
public const val `JET_wrnCallbackNotRegistered`: UInt = 2100u;
public const val `JET_wrnColumnDefault`: UInt = 1537u;
public const val `JET_wrnColumnMaxTruncated`: UInt = 1512u;
public const val `JET_wrnColumnMoreTags`: UInt = 1533u;
public const val `JET_wrnColumnNotInRecord`: UInt = 1539u;
public const val `JET_wrnColumnNotLocal`: UInt = 1532u;
public const val `JET_wrnColumnNull`: UInt = 1004u;
public const val `JET_wrnColumnPresent`: UInt = 1535u;
public const val `JET_wrnColumnReference`: UInt = 1541u;
public const val `JET_wrnColumnSetNull`: UInt = 1068u;
public const val `JET_wrnColumnSingleValue`: UInt = 1536u;
public const val `JET_wrnColumnSkipped`: UInt = 1531u;
public const val `JET_wrnColumnTruncated`: UInt = 1534u;
public const val `JET_wrnCommittedLogFilesLost`: UInt = 585u;
public const val `JET_wrnCommittedLogFilesRemoved`: UInt = 587u;
public const val `JET_wrnCopyLongValue`: UInt = 1520u;
public const val `JET_wrnCorruptIndexDeleted`: UInt = 1415u;
public const val `JET_wrnDataHasChanged`: UInt = 1610u;
public const val `JET_wrnDatabaseAttached`: UInt = 1007u;
public const val `JET_wrnDatabaseRepaired`: UInt = 595u;
public const val `JET_wrnDefragAlreadyRunning`: UInt = 2000u;
public const val `JET_wrnDefragNotRunning`: UInt = 2001u;
public const val `JET_wrnExistingLogFileHasBadSignature`: UInt = 558u;
public const val `JET_wrnExistingLogFileIsNotContiguous`: UInt = 559u;
public const val `JET_wrnFileOpenReadOnly`: UInt = 1813u;
public const val `JET_wrnFinishWithUndo`: UInt = 588u;
public const val `JET_wrnIdleFull`: UInt = 1908u;
public const val `JET_wrnKeyChanged`: UInt = 1618u;
public const val `JET_wrnNoErrorInfo`: UInt = 1055u;
public const val `JET_wrnNoIdleActivity`: UInt = 1058u;
public const val `JET_wrnNoWriteLock`: UInt = 1067u;
public const val `JET_wrnNyi`: Int = -1;
public const val `JET_wrnPrimaryIndexOutOfDate`: UInt = 1417u;
public const val `JET_wrnRemainingVersions`: UInt = 321u;
public const val `JET_wrnSecondaryIndexOutOfDate`: UInt = 1418u;
public const val `JET_wrnSeekNotEqual`: UInt = 1039u;
public const val `JET_wrnSeparateLongValue`: UInt = 406u;
public const val `JET_wrnShrinkNotPossible`: UInt = 1122u;
public const val `JET_wrnSkipThisRecord`: UInt = 564u;
public const val `JET_wrnSortOverflow`: UInt = 1009u;
public const val `JET_wrnTableEmpty`: UInt = 1301u;
public const val `JET_wrnTableInUseBySystem`: UInt = 1327u;
public const val `JET_wrnTargetInstanceRunning`: UInt = 578u;
public const val `JET_wrnUniqueKey`: UInt = 345u;
// UNSUPPORTED Rust 2999:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const JET_wszConfigStoreReadControl: windows_sys::core::PCWSTR = windows_sys::core::w!("CsReadControl");

// UNSUPPORTED Rust 3000:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const JET_wszConfigStoreRelPathSysParamDefault: windows_sys::core::PCWSTR = windows_sys::core::w!("SysParamDefault");

// UNSUPPORTED Rust 3001:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const JET_wszConfigStoreRelPathSysParamOverride: windows_sys::core::PCWSTR = windows_sys::core::w!("SysParamOverride");

public const val `cColumnInfoCols`: UInt = 14u;
public const val `cIndexInfoCols`: UInt = 15u;
public const val `cObjectInfoCols`: UInt = 9u;
public const val `wrnBTNotVisibleAccumulated`: UInt = 353u;
public const val `wrnBTNotVisibleRejected`: UInt = 352u;
