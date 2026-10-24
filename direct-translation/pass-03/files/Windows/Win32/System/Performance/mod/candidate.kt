// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Mod has no candidate rule; syntax: no per-file syntax rule for Mod
// #[cfg(feature = "Win32_System_Performance_HardwareCounterProfiling")]
// pub mod HardwareCounterProfiling;

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=loadperf.dll, ABI=system, export=BackupPerfRegistryToFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BackupPerfRegistryToFileW`(`szfilename` : `windows_sys`.`core`.`PCWSTR`, `szcommentstring` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=loadperf.dll, ABI=system, export=InstallPerfDllA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InstallPerfDllA`(`szcomputername` : `windows_sys`.`core`.`PCSTR`, `lpinifile` : `windows_sys`.`core`.`PCSTR`, `dwflags` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=loadperf.dll, ABI=system, export=InstallPerfDllW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InstallPerfDllW`(`szcomputername` : `windows_sys`.`core`.`PCWSTR`, `lpinifile` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=loadperf.dll, ABI=system, export=LoadPerfCounterTextStringsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadPerfCounterTextStringsA`(`lpcommandline` : `windows_sys`.`core`.`PCSTR`, `bquietmodearg` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=loadperf.dll, ABI=system, export=LoadPerfCounterTextStringsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadPerfCounterTextStringsW`(`lpcommandline` : `windows_sys`.`core`.`PCWSTR`, `bquietmodearg` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhAddCounterA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhAddCounterA`(`hquery` : `PDH_HQUERY`, `szfullcounterpath` : `windows_sys`.`core`.`PCSTR`, `dwuserdata` : ULong, `phcounter` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_HCOUNTER`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhAddCounterW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhAddCounterW`(`hquery` : `PDH_HQUERY`, `szfullcounterpath` : `windows_sys`.`core`.`PCWSTR`, `dwuserdata` : ULong, `phcounter` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_HCOUNTER`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhAddEnglishCounterA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhAddEnglishCounterA`(`hquery` : `PDH_HQUERY`, `szfullcounterpath` : `windows_sys`.`core`.`PCSTR`, `dwuserdata` : ULong, `phcounter` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_HCOUNTER`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhAddEnglishCounterW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhAddEnglishCounterW`(`hquery` : `PDH_HQUERY`, `szfullcounterpath` : `windows_sys`.`core`.`PCWSTR`, `dwuserdata` : ULong, `phcounter` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_HCOUNTER`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhBindInputDataSourceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhBindInputDataSourceA`(`phdatasource` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_HLOG`>?, `logfilenamelist` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhBindInputDataSourceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhBindInputDataSourceW`(`phdatasource` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_HLOG`>?, `logfilenamelist` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhBrowseCountersA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhBrowseCountersA`(`pbrowsedlgdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`PDH_BROWSE_DLG_CONFIG_A`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhBrowseCountersHA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhBrowseCountersHA`(`pbrowsedlgdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`PDH_BROWSE_DLG_CONFIG_HA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhBrowseCountersHW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhBrowseCountersHW`(`pbrowsedlgdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`PDH_BROWSE_DLG_CONFIG_HW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhBrowseCountersW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhBrowseCountersW`(`pbrowsedlgdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`PDH_BROWSE_DLG_CONFIG_W`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhCalculateCounterFromRawValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhCalculateCounterFromRawValue`(`hcounter` : `PDH_HCOUNTER`, `dwformat` : `PDH_FMT`, `rawvalue1` : /* Rust *const */ kotlinx.cinterop.CPointer<`PDH_RAW_COUNTER`>?, `rawvalue2` : /* Rust *const */ kotlinx.cinterop.CPointer<`PDH_RAW_COUNTER`>?, `fmtvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_FMT_COUNTERVALUE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhCloseLog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhCloseLog`(`hlog` : `PDH_HLOG`, `dwflags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhCloseQuery; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhCloseQuery`(`hquery` : `PDH_HQUERY`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhCollectQueryData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhCollectQueryData`(`hquery` : `PDH_HQUERY`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhCollectQueryDataEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhCollectQueryDataEx`(`hquery` : `PDH_HQUERY`, `dwintervaltime` : UInt, `hnewdataevent` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhCollectQueryDataWithTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhCollectQueryDataWithTime`(`hquery` : `PDH_HQUERY`, `plltimestamp` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhComputeCounterStatistics; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhComputeCounterStatistics`(`hcounter` : `PDH_HCOUNTER`, `dwformat` : `PDH_FMT`, `dwfirstentry` : UInt, `dwnumentries` : UInt, `lprawvaluearray` : /* Rust *const */ kotlinx.cinterop.CPointer<`PDH_RAW_COUNTER`>?, `data` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_STATISTICS`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhConnectMachineA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhConnectMachineA`(`szmachinename` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhConnectMachineW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhConnectMachineW`(`szmachinename` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhCreateSQLTablesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhCreateSQLTablesA`(`szdatasource` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhCreateSQLTablesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhCreateSQLTablesW`(`szdatasource` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhEnumLogSetNamesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhEnumLogSetNamesA`(`szdatasource` : `windows_sys`.`core`.`PCSTR`, `mszdatasetnamelist` : `windows_sys`.`core`.`PSTR`, `pcchbufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhEnumLogSetNamesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhEnumLogSetNamesW`(`szdatasource` : `windows_sys`.`core`.`PCWSTR`, `mszdatasetnamelist` : `windows_sys`.`core`.`PWSTR`, `pcchbufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhEnumMachinesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhEnumMachinesA`(`szdatasource` : `windows_sys`.`core`.`PCSTR`, `mszmachinelist` : `windows_sys`.`core`.`PSTR`, `pcchbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhEnumMachinesHA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhEnumMachinesHA`(`hdatasource` : `PDH_HLOG`, `mszmachinelist` : `windows_sys`.`core`.`PSTR`, `pcchbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhEnumMachinesHW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhEnumMachinesHW`(`hdatasource` : `PDH_HLOG`, `mszmachinelist` : `windows_sys`.`core`.`PWSTR`, `pcchbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhEnumMachinesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhEnumMachinesW`(`szdatasource` : `windows_sys`.`core`.`PCWSTR`, `mszmachinelist` : `windows_sys`.`core`.`PWSTR`, `pcchbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhEnumObjectItemsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhEnumObjectItemsA`(`szdatasource` : `windows_sys`.`core`.`PCSTR`, `szmachinename` : `windows_sys`.`core`.`PCSTR`, `szobjectname` : `windows_sys`.`core`.`PCSTR`, `mszcounterlist` : `windows_sys`.`core`.`PSTR`, `pcchcounterlistlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `mszinstancelist` : `windows_sys`.`core`.`PSTR`, `pcchinstancelistlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwdetaillevel` : `PERF_DETAIL`, `dwflags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhEnumObjectItemsHA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhEnumObjectItemsHA`(`hdatasource` : `PDH_HLOG`, `szmachinename` : `windows_sys`.`core`.`PCSTR`, `szobjectname` : `windows_sys`.`core`.`PCSTR`, `mszcounterlist` : `windows_sys`.`core`.`PSTR`, `pcchcounterlistlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `mszinstancelist` : `windows_sys`.`core`.`PSTR`, `pcchinstancelistlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwdetaillevel` : `PERF_DETAIL`, `dwflags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhEnumObjectItemsHW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhEnumObjectItemsHW`(`hdatasource` : `PDH_HLOG`, `szmachinename` : `windows_sys`.`core`.`PCWSTR`, `szobjectname` : `windows_sys`.`core`.`PCWSTR`, `mszcounterlist` : `windows_sys`.`core`.`PWSTR`, `pcchcounterlistlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `mszinstancelist` : `windows_sys`.`core`.`PWSTR`, `pcchinstancelistlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwdetaillevel` : `PERF_DETAIL`, `dwflags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhEnumObjectItemsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhEnumObjectItemsW`(`szdatasource` : `windows_sys`.`core`.`PCWSTR`, `szmachinename` : `windows_sys`.`core`.`PCWSTR`, `szobjectname` : `windows_sys`.`core`.`PCWSTR`, `mszcounterlist` : `windows_sys`.`core`.`PWSTR`, `pcchcounterlistlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `mszinstancelist` : `windows_sys`.`core`.`PWSTR`, `pcchinstancelistlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwdetaillevel` : `PERF_DETAIL`, `dwflags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhEnumObjectsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhEnumObjectsA`(`szdatasource` : `windows_sys`.`core`.`PCSTR`, `szmachinename` : `windows_sys`.`core`.`PCSTR`, `mszobjectlist` : `windows_sys`.`core`.`PSTR`, `pcchbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwdetaillevel` : `PERF_DETAIL`, `brefresh` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhEnumObjectsHA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhEnumObjectsHA`(`hdatasource` : `PDH_HLOG`, `szmachinename` : `windows_sys`.`core`.`PCSTR`, `mszobjectlist` : `windows_sys`.`core`.`PSTR`, `pcchbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwdetaillevel` : `PERF_DETAIL`, `brefresh` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhEnumObjectsHW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhEnumObjectsHW`(`hdatasource` : `PDH_HLOG`, `szmachinename` : `windows_sys`.`core`.`PCWSTR`, `mszobjectlist` : `windows_sys`.`core`.`PWSTR`, `pcchbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwdetaillevel` : `PERF_DETAIL`, `brefresh` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhEnumObjectsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhEnumObjectsW`(`szdatasource` : `windows_sys`.`core`.`PCWSTR`, `szmachinename` : `windows_sys`.`core`.`PCWSTR`, `mszobjectlist` : `windows_sys`.`core`.`PWSTR`, `pcchbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwdetaillevel` : `PERF_DETAIL`, `brefresh` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhExpandCounterPathA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhExpandCounterPathA`(`szwildcardpath` : `windows_sys`.`core`.`PCSTR`, `mszexpandedpathlist` : `windows_sys`.`core`.`PSTR`, `pcchpathlistlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhExpandCounterPathW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhExpandCounterPathW`(`szwildcardpath` : `windows_sys`.`core`.`PCWSTR`, `mszexpandedpathlist` : `windows_sys`.`core`.`PWSTR`, `pcchpathlistlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhExpandWildCardPathA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhExpandWildCardPathA`(`szdatasource` : `windows_sys`.`core`.`PCSTR`, `szwildcardpath` : `windows_sys`.`core`.`PCSTR`, `mszexpandedpathlist` : `windows_sys`.`core`.`PSTR`, `pcchpathlistlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwflags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhExpandWildCardPathHA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhExpandWildCardPathHA`(`hdatasource` : `PDH_HLOG`, `szwildcardpath` : `windows_sys`.`core`.`PCSTR`, `mszexpandedpathlist` : `windows_sys`.`core`.`PSTR`, `pcchpathlistlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwflags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhExpandWildCardPathHW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhExpandWildCardPathHW`(`hdatasource` : `PDH_HLOG`, `szwildcardpath` : `windows_sys`.`core`.`PCWSTR`, `mszexpandedpathlist` : `windows_sys`.`core`.`PWSTR`, `pcchpathlistlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwflags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhExpandWildCardPathW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhExpandWildCardPathW`(`szdatasource` : `windows_sys`.`core`.`PCWSTR`, `szwildcardpath` : `windows_sys`.`core`.`PCWSTR`, `mszexpandedpathlist` : `windows_sys`.`core`.`PWSTR`, `pcchpathlistlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwflags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhFormatFromRawValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhFormatFromRawValue`(`dwcountertype` : UInt, `dwformat` : `PDH_FMT`, `ptimebase` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `prawvalue1` : /* Rust *const */ kotlinx.cinterop.CPointer<`PDH_RAW_COUNTER`>?, `prawvalue2` : /* Rust *const */ kotlinx.cinterop.CPointer<`PDH_RAW_COUNTER`>?, `pfmtvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_FMT_COUNTERVALUE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhGetCounterInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhGetCounterInfoA`(`hcounter` : `PDH_HCOUNTER`, `bretrieveexplaintext` : Boolean, `pdwbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_COUNTER_INFO_A`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhGetCounterInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhGetCounterInfoW`(`hcounter` : `PDH_HCOUNTER`, `bretrieveexplaintext` : Boolean, `pdwbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_COUNTER_INFO_W`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhGetCounterTimeBase; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhGetCounterTimeBase`(`hcounter` : `PDH_HCOUNTER`, `ptimebase` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhGetDataSourceTimeRangeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhGetDataSourceTimeRangeA`(`szdatasource` : `windows_sys`.`core`.`PCSTR`, `pdwnumentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_TIME_INFO`>?, `pdwbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhGetDataSourceTimeRangeH; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhGetDataSourceTimeRangeH`(`hdatasource` : `PDH_HLOG`, `pdwnumentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_TIME_INFO`>?, `pdwbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhGetDataSourceTimeRangeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhGetDataSourceTimeRangeW`(`szdatasource` : `windows_sys`.`core`.`PCWSTR`, `pdwnumentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_TIME_INFO`>?, `pdwbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhGetDefaultPerfCounterA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhGetDefaultPerfCounterA`(`szdatasource` : `windows_sys`.`core`.`PCSTR`, `szmachinename` : `windows_sys`.`core`.`PCSTR`, `szobjectname` : `windows_sys`.`core`.`PCSTR`, `szdefaultcountername` : `windows_sys`.`core`.`PSTR`, `pcchbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhGetDefaultPerfCounterHA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhGetDefaultPerfCounterHA`(`hdatasource` : `PDH_HLOG`, `szmachinename` : `windows_sys`.`core`.`PCSTR`, `szobjectname` : `windows_sys`.`core`.`PCSTR`, `szdefaultcountername` : `windows_sys`.`core`.`PSTR`, `pcchbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhGetDefaultPerfCounterHW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhGetDefaultPerfCounterHW`(`hdatasource` : `PDH_HLOG`, `szmachinename` : `windows_sys`.`core`.`PCWSTR`, `szobjectname` : `windows_sys`.`core`.`PCWSTR`, `szdefaultcountername` : `windows_sys`.`core`.`PWSTR`, `pcchbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhGetDefaultPerfCounterW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhGetDefaultPerfCounterW`(`szdatasource` : `windows_sys`.`core`.`PCWSTR`, `szmachinename` : `windows_sys`.`core`.`PCWSTR`, `szobjectname` : `windows_sys`.`core`.`PCWSTR`, `szdefaultcountername` : `windows_sys`.`core`.`PWSTR`, `pcchbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhGetDefaultPerfObjectA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhGetDefaultPerfObjectA`(`szdatasource` : `windows_sys`.`core`.`PCSTR`, `szmachinename` : `windows_sys`.`core`.`PCSTR`, `szdefaultobjectname` : `windows_sys`.`core`.`PSTR`, `pcchbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhGetDefaultPerfObjectHA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhGetDefaultPerfObjectHA`(`hdatasource` : `PDH_HLOG`, `szmachinename` : `windows_sys`.`core`.`PCSTR`, `szdefaultobjectname` : `windows_sys`.`core`.`PSTR`, `pcchbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhGetDefaultPerfObjectHW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhGetDefaultPerfObjectHW`(`hdatasource` : `PDH_HLOG`, `szmachinename` : `windows_sys`.`core`.`PCWSTR`, `szdefaultobjectname` : `windows_sys`.`core`.`PWSTR`, `pcchbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhGetDefaultPerfObjectW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhGetDefaultPerfObjectW`(`szdatasource` : `windows_sys`.`core`.`PCWSTR`, `szmachinename` : `windows_sys`.`core`.`PCWSTR`, `szdefaultobjectname` : `windows_sys`.`core`.`PWSTR`, `pcchbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhGetDllVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhGetDllVersion`(`lpdwversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_DLL_VERSION`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhGetFormattedCounterArrayA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhGetFormattedCounterArrayA`(`hcounter` : `PDH_HCOUNTER`, `dwformat` : `PDH_FMT`, `lpdwbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwitemcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `itembuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_FMT_COUNTERVALUE_ITEM_A`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhGetFormattedCounterArrayW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhGetFormattedCounterArrayW`(`hcounter` : `PDH_HCOUNTER`, `dwformat` : `PDH_FMT`, `lpdwbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwitemcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `itembuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_FMT_COUNTERVALUE_ITEM_W`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhGetFormattedCounterValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhGetFormattedCounterValue`(`hcounter` : `PDH_HCOUNTER`, `dwformat` : `PDH_FMT`, `lpdwtype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_FMT_COUNTERVALUE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhGetLogFileSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhGetLogFileSize`(`hlog` : `PDH_HLOG`, `llsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhGetLogSetGUID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhGetLogSetGUID`(`hlog` : `PDH_HLOG`, `pguid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `prunid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhGetRawCounterArrayA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhGetRawCounterArrayA`(`hcounter` : `PDH_HCOUNTER`, `lpdwbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwitemcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `itembuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_RAW_COUNTER_ITEM_A`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhGetRawCounterArrayW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhGetRawCounterArrayW`(`hcounter` : `PDH_HCOUNTER`, `lpdwbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwitemcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `itembuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_RAW_COUNTER_ITEM_W`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhGetRawCounterValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhGetRawCounterValue`(`hcounter` : `PDH_HCOUNTER`, `lpdwtype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_RAW_COUNTER`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhIsRealTimeQuery; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhIsRealTimeQuery`(`hquery` : `PDH_HQUERY`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhLookupPerfIndexByNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhLookupPerfIndexByNameA`(`szmachinename` : `windows_sys`.`core`.`PCSTR`, `sznamebuffer` : `windows_sys`.`core`.`PCSTR`, `pdwindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhLookupPerfIndexByNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhLookupPerfIndexByNameW`(`szmachinename` : `windows_sys`.`core`.`PCWSTR`, `sznamebuffer` : `windows_sys`.`core`.`PCWSTR`, `pdwindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhLookupPerfNameByIndexA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhLookupPerfNameByIndexA`(`szmachinename` : `windows_sys`.`core`.`PCSTR`, `dwnameindex` : UInt, `sznamebuffer` : `windows_sys`.`core`.`PSTR`, `pcchnamebuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhLookupPerfNameByIndexW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhLookupPerfNameByIndexW`(`szmachinename` : `windows_sys`.`core`.`PCWSTR`, `dwnameindex` : UInt, `sznamebuffer` : `windows_sys`.`core`.`PWSTR`, `pcchnamebuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhMakeCounterPathA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhMakeCounterPathA`(`pcounterpathelements` : /* Rust *const */ kotlinx.cinterop.CPointer<`PDH_COUNTER_PATH_ELEMENTS_A`>?, `szfullpathbuffer` : `windows_sys`.`core`.`PSTR`, `pcchbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwflags` : `PDH_PATH_FLAGS`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhMakeCounterPathW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhMakeCounterPathW`(`pcounterpathelements` : /* Rust *const */ kotlinx.cinterop.CPointer<`PDH_COUNTER_PATH_ELEMENTS_W`>?, `szfullpathbuffer` : `windows_sys`.`core`.`PWSTR`, `pcchbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwflags` : `PDH_PATH_FLAGS`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhOpenLogA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhOpenLogA`(`szlogfilename` : `windows_sys`.`core`.`PCSTR`, `dwaccessflags` : `PDH_LOG`, `lpdwlogtype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_LOG_TYPE`>?, `hquery` : `PDH_HQUERY`, `dwmaxsize` : UInt, `szusercaption` : `windows_sys`.`core`.`PCSTR`, `phlog` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_HLOG`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhOpenLogW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhOpenLogW`(`szlogfilename` : `windows_sys`.`core`.`PCWSTR`, `dwaccessflags` : `PDH_LOG`, `lpdwlogtype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_LOG_TYPE`>?, `hquery` : `PDH_HQUERY`, `dwmaxsize` : UInt, `szusercaption` : `windows_sys`.`core`.`PCWSTR`, `phlog` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_HLOG`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhOpenQueryA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhOpenQueryA`(`szdatasource` : `windows_sys`.`core`.`PCSTR`, `dwuserdata` : ULong, `phquery` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_HQUERY`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhOpenQueryH; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhOpenQueryH`(`hdatasource` : `PDH_HLOG`, `dwuserdata` : ULong, `phquery` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_HQUERY`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhOpenQueryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhOpenQueryW`(`szdatasource` : `windows_sys`.`core`.`PCWSTR`, `dwuserdata` : ULong, `phquery` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_HQUERY`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhParseCounterPathA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhParseCounterPathA`(`szfullpathbuffer` : `windows_sys`.`core`.`PCSTR`, `pcounterpathelements` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_COUNTER_PATH_ELEMENTS_A`>?, `pdwbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwflags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhParseCounterPathW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhParseCounterPathW`(`szfullpathbuffer` : `windows_sys`.`core`.`PCWSTR`, `pcounterpathelements` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_COUNTER_PATH_ELEMENTS_W`>?, `pdwbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwflags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhParseInstanceNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhParseInstanceNameA`(`szinstancestring` : `windows_sys`.`core`.`PCSTR`, `szinstancename` : `windows_sys`.`core`.`PSTR`, `pcchinstancenamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `szparentname` : `windows_sys`.`core`.`PSTR`, `pcchparentnamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhParseInstanceNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhParseInstanceNameW`(`szinstancestring` : `windows_sys`.`core`.`PCWSTR`, `szinstancename` : `windows_sys`.`core`.`PWSTR`, `pcchinstancenamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `szparentname` : `windows_sys`.`core`.`PWSTR`, `pcchparentnamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhReadRawLogRecord; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhReadRawLogRecord`(`hlog` : `PDH_HLOG`, `ftrecord` : `super`.`super`.`Foundation`.`FILETIME`, `prawlogrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PDH_RAW_LOG_RECORD`>?, `pdwbufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhRemoveCounter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhRemoveCounter`(`hcounter` : `PDH_HCOUNTER`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhSelectDataSourceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhSelectDataSourceA`(`hwndowner` : `super`.`super`.`Foundation`.`HWND`, `dwflags` : `PDH_SELECT_DATA_SOURCE_FLAGS`, `szdatasource` : `windows_sys`.`core`.`PSTR`, `pcchbufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhSelectDataSourceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhSelectDataSourceW`(`hwndowner` : `super`.`super`.`Foundation`.`HWND`, `dwflags` : `PDH_SELECT_DATA_SOURCE_FLAGS`, `szdatasource` : `windows_sys`.`core`.`PWSTR`, `pcchbufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhSetCounterScaleFactor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhSetCounterScaleFactor`(`hcounter` : `PDH_HCOUNTER`, `lfactor` : Int) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhSetDefaultRealTimeDataSource; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhSetDefaultRealTimeDataSource`(`dwdatasourceid` : `REAL_TIME_DATA_SOURCE_ID_FLAGS`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhSetLogSetRunID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhSetLogSetRunID`(`hlog` : `PDH_HLOG`, `runid` : Int) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhSetQueryTimeRange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhSetQueryTimeRange`(`hquery` : `PDH_HQUERY`, `pinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`PDH_TIME_INFO`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhUpdateLogA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhUpdateLogA`(`hlog` : `PDH_HLOG`, `szuserstring` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhUpdateLogFileCatalog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhUpdateLogFileCatalog`(`hlog` : `PDH_HLOG`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhUpdateLogW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhUpdateLogW`(`hlog` : `PDH_HLOG`, `szuserstring` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhValidatePathA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhValidatePathA`(`szfullpathbuffer` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhValidatePathExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhValidatePathExA`(`hdatasource` : `PDH_HLOG`, `szfullpathbuffer` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhValidatePathExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhValidatePathExW`(`hdatasource` : `PDH_HLOG`, `szfullpathbuffer` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhValidatePathW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhValidatePathW`(`szfullpathbuffer` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhVerifySQLDBA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhVerifySQLDBA`(`szdatasource` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=pdh.dll, ABI=system, export=PdhVerifySQLDBW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PdhVerifySQLDBW`(`szdatasource` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=PerfAddCounters; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PerfAddCounters`(`hquery` : `super`.`super`.`Foundation`.`HANDLE`, `pcounters` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PERF_COUNTER_IDENTIFIER`>?, `cbcounters` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=PerfCloseQueryHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PerfCloseQueryHandle`(`hquery` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=PerfCreateInstance; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PerfCreateInstance`(`providerhandle` : `super`.`super`.`Foundation`.`HANDLE`, `countersetguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `name` : `windows_sys`.`core`.`PCWSTR`, `id` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`PERF_COUNTERSET_INSTANCE`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=PerfDecrementULongCounterValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PerfDecrementULongCounterValue`(`provider` : `super`.`super`.`Foundation`.`HANDLE`, `instance` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PERF_COUNTERSET_INSTANCE`>?, `counterid` : UInt, `value` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=PerfDecrementULongLongCounterValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PerfDecrementULongLongCounterValue`(`provider` : `super`.`super`.`Foundation`.`HANDLE`, `instance` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PERF_COUNTERSET_INSTANCE`>?, `counterid` : UInt, `value` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=PerfDeleteCounters; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PerfDeleteCounters`(`hquery` : `super`.`super`.`Foundation`.`HANDLE`, `pcounters` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PERF_COUNTER_IDENTIFIER`>?, `cbcounters` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=PerfDeleteInstance; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PerfDeleteInstance`(`provider` : `super`.`super`.`Foundation`.`HANDLE`, `instanceblock` : /* Rust *const */ kotlinx.cinterop.CPointer<`PERF_COUNTERSET_INSTANCE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=PerfEnumerateCounterSet; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PerfEnumerateCounterSet`(`szmachine` : `windows_sys`.`core`.`PCWSTR`, `pcountersetids` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ccountersetids` : UInt, `pccountersetidsactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=PerfEnumerateCounterSetInstances; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PerfEnumerateCounterSetInstances`(`szmachine` : `windows_sys`.`core`.`PCWSTR`, `pcountersetid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pinstances` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PERF_INSTANCE_HEADER`>?, `cbinstances` : UInt, `pcbinstancesactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=PerfIncrementULongCounterValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PerfIncrementULongCounterValue`(`provider` : `super`.`super`.`Foundation`.`HANDLE`, `instance` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PERF_COUNTERSET_INSTANCE`>?, `counterid` : UInt, `value` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=PerfIncrementULongLongCounterValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PerfIncrementULongLongCounterValue`(`provider` : `super`.`super`.`Foundation`.`HANDLE`, `instance` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PERF_COUNTERSET_INSTANCE`>?, `counterid` : UInt, `value` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=PerfOpenQueryHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PerfOpenQueryHandle`(`szmachine` : `windows_sys`.`core`.`PCWSTR`, `phquery` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=PerfQueryCounterData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PerfQueryCounterData`(`hquery` : `super`.`super`.`Foundation`.`HANDLE`, `pcounterblock` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PERF_DATA_HEADER`>?, `cbcounterblock` : UInt, `pcbcounterblockactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=PerfQueryCounterInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PerfQueryCounterInfo`(`hquery` : `super`.`super`.`Foundation`.`HANDLE`, `pcounters` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PERF_COUNTER_IDENTIFIER`>?, `cbcounters` : UInt, `pcbcountersactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=PerfQueryCounterSetRegistrationInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PerfQueryCounterSetRegistrationInfo`(`szmachine` : `windows_sys`.`core`.`PCWSTR`, `pcountersetid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `requestcode` : `PerfRegInfoType`, `requestlangid` : UInt, `pbreginfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbreginfo` : UInt, `pcbreginfoactual` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=PerfQueryInstance; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PerfQueryInstance`(`providerhandle` : `super`.`super`.`Foundation`.`HANDLE`, `countersetguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `name` : `windows_sys`.`core`.`PCWSTR`, `id` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`PERF_COUNTERSET_INSTANCE`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=PerfSetCounterRefValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PerfSetCounterRefValue`(`provider` : `super`.`super`.`Foundation`.`HANDLE`, `instance` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PERF_COUNTERSET_INSTANCE`>?, `counterid` : UInt, `address` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=PerfSetCounterSetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PerfSetCounterSetInfo`(`providerhandle` : `super`.`super`.`Foundation`.`HANDLE`, `template` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PERF_COUNTERSET_INFO`>?, `templatesize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=PerfSetULongCounterValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PerfSetULongCounterValue`(`provider` : `super`.`super`.`Foundation`.`HANDLE`, `instance` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PERF_COUNTERSET_INSTANCE`>?, `counterid` : UInt, `value` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=PerfSetULongLongCounterValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PerfSetULongLongCounterValue`(`provider` : `super`.`super`.`Foundation`.`HANDLE`, `instance` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PERF_COUNTERSET_INSTANCE`>?, `counterid` : UInt, `value` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=PerfStartProvider; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PerfStartProvider`(`providerguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `controlcallback` : `PERFLIBREQUEST`, `phprovider` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=PerfStartProviderEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PerfStartProviderEx`(`providerguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `providercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`PERF_PROVIDER_CONTEXT`>?, `provider` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=PerfStopProvider; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PerfStopProvider`(`providerhandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=QueryPerformanceCounter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryPerformanceCounter`(`lpperformancecount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=QueryPerformanceFrequency; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryPerformanceFrequency`(`lpfrequency` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=loadperf.dll, ABI=system, export=RestorePerfRegistryFromFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RestorePerfRegistryFromFileW`(`szfilename` : `windows_sys`.`core`.`PCWSTR`, `szlangid` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=loadperf.dll, ABI=system, export=SetServiceAsTrustedA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetServiceAsTrustedA`(`szreserved` : `windows_sys`.`core`.`PCSTR`, `szservicename` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=loadperf.dll, ABI=system, export=SetServiceAsTrustedW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetServiceAsTrustedW`(`szreserved` : `windows_sys`.`core`.`PCWSTR`, `szservicename` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=loadperf.dll, ABI=system, export=UnloadPerfCounterTextStringsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnloadPerfCounterTextStringsA`(`lpcommandline` : `windows_sys`.`core`.`PCSTR`, `bquietmodearg` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=loadperf.dll, ABI=system, export=UnloadPerfCounterTextStringsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnloadPerfCounterTextStringsW`(`lpcommandline` : `windows_sys`.`core`.`PCWSTR`, `bquietmodearg` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=loadperf.dll, ABI=system, export=UpdatePerfNameFilesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UpdatePerfNameFilesA`(`sznewctrfilepath` : `windows_sys`.`core`.`PCSTR`, `sznewhlpfilepath` : `windows_sys`.`core`.`PCSTR`, `szlanguageid` : `windows_sys`.`core`.`PCSTR`, `dwflags` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=loadperf.dll, ABI=system, export=UpdatePerfNameFilesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UpdatePerfNameFilesW`(`sznewctrfilepath` : `windows_sys`.`core`.`PCWSTR`, `sznewhlpfilepath` : `windows_sys`.`core`.`PCWSTR`, `szlanguageid` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : ULong) : UInt
// UNSUPPORTED Rust 138:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AppearPropPage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe49741e9_93a8_4ab1_8e96_bf4482282e9c);

public typealias `AutoPathFormat` = Int;
// UNSUPPORTED Rust 140:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const BootTraceSession: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837538_098b_11d8_9414_505054503030);

// UNSUPPORTED Rust 141:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const BootTraceSessionCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837539_098b_11d8_9414_505054503030);

public typealias `ClockType` = Int;
public typealias `CommitMode` = Int;
// UNSUPPORTED Rust 144:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CounterItem: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc4d2d8e0_d1dd_11ce_940f_008029004348);

// UNSUPPORTED Rust 145:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CounterItem2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x43196c62_c31f_4ce3_a02e_79efe0f6a525);

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CounterPathCallBack` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong) -> Int>>>;
// UNSUPPORTED Rust 147:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CounterPropPage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcf948561_ede8_11ce_941e_008029004347);

// UNSUPPORTED Rust 148:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const Counters: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb2b066d2_2aac_11cf_942f_008029004347);

public const val `DATA_SOURCE_REGISTRY`: `REAL_TIME_DATA_SOURCE_ID_FLAGS` = 1u;
public const val `DATA_SOURCE_WBEM`: `REAL_TIME_DATA_SOURCE_ID_FLAGS` = 4u;
// UNSUPPORTED Rust 151:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIID_DICounterItem: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc08c4ff2_0e2e_11cf_942c_008029004347);

// UNSUPPORTED Rust 152:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIID_DILogFileItem: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8d093ffc_f777_4917_82d1_833fbc54c58f);

// UNSUPPORTED Rust 153:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIID_DISystemMonitor: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x13d73d81_c32e_11cf_9398_00aa00a3ddea);

// UNSUPPORTED Rust 154:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIID_DISystemMonitorEvents: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x84979930_4ab3_11cf_943a_008029004347);

// UNSUPPORTED Rust 155:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DIID_DISystemMonitorInternal: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x194eb242_c32c_11cf_9398_00aa00a3ddea);

// UNSUPPORTED Rust 156:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DataCollectorSet: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837521_098b_11d8_9414_505054503030);

// UNSUPPORTED Rust 157:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DataCollectorSetCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837525_098b_11d8_9414_505054503030);

public typealias `DataCollectorSetStatus` = Int;
public typealias `DataCollectorType` = Int;
public typealias `DataManagerSteps` = Int;
public typealias `DataSourceTypeConstants` = Int;
public typealias `DisplayTypeConstants` = Int;
public typealias `FileFormat` = Int;
public typealias `FolderActionSteps` = Int;
// UNSUPPORTED Rust 165:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GeneralPropPage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc3e5d3d2_1a03_11cf_942d_008029004347);

// UNSUPPORTED Rust 166:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GraphPropPage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc3e5d3d3_1a03_11cf_942d_008029004347);

public const val `H_WBEM_DATASOURCE`: Int = -1;
// UNSUPPORTED Rust 168:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LIBID_SystemMonitor: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1b773e42_2509_11cf_942f_008029004347);

// UNSUPPORTED Rust 169:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LegacyDataCollectorSet: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837526_098b_11d8_9414_505054503030);

// UNSUPPORTED Rust 170:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LegacyDataCollectorSetCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837527_098b_11d8_9414_505054503030);

// UNSUPPORTED Rust 171:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LegacyTraceSession: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837528_098b_11d8_9414_505054503030);

// UNSUPPORTED Rust 172:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LegacyTraceSessionCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837529_098b_11d8_9414_505054503030);

// UNSUPPORTED Rust 173:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LogFileItem: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x16ec5be8_df93_4237_94e4_9ee918111d71);

// UNSUPPORTED Rust 174:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LogFiles: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2735d9fd_f6b9_4f19_a5d9_e2d068584bc5);

public const val `MAX_COUNTER_PATH`: UInt = 256u;
public const val `MAX_PERF_OBJECTS_IN_QUERY_FUNCTION`: Int = 64;
public const val `PDH_ACCESS_DENIED`: UInt = 3221228507u;
public const val `PDH_ASYNC_QUERY_TIMEOUT`: UInt = 2147485659u;
public const val `PDH_BINARY_LOG_CORRUPT`: UInt = 3221228535u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PDH_BROWSE_DLG_CONFIG_A` (
    public var `_bitfield`: UInt,
    public var `hWndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `szDataSource`: `windows_sys`.`core`.`PSTR`,
    public var `szReturnPathBuffer`: `windows_sys`.`core`.`PSTR`,
    public var `cchReturnPathLength`: UInt,
    public var `pCallBack`: `CounterPathCallBack`,
    public var `dwCallBackArg`: ULong,
    public var `CallBackStatus`: Int,
    public var `dwDefaultDetailLevel`: `PERF_DETAIL`,
    public var `szDialogBoxCaption`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 194:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_BROWSE_DLG_CONFIG_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PDH_BROWSE_DLG_CONFIG_HA` (
    public var `_bitfield`: UInt,
    public var `hWndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `hDataSource`: `PDH_HLOG`,
    public var `szReturnPathBuffer`: `windows_sys`.`core`.`PSTR`,
    public var `cchReturnPathLength`: UInt,
    public var `pCallBack`: `CounterPathCallBack`,
    public var `dwCallBackArg`: ULong,
    public var `CallBackStatus`: Int,
    public var `dwDefaultDetailLevel`: `PERF_DETAIL`,
    public var `szDialogBoxCaption`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 213:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_BROWSE_DLG_CONFIG_HA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PDH_BROWSE_DLG_CONFIG_HW` (
    public var `_bitfield`: UInt,
    public var `hWndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `hDataSource`: `PDH_HLOG`,
    public var `szReturnPathBuffer`: `windows_sys`.`core`.`PWSTR`,
    public var `cchReturnPathLength`: UInt,
    public var `pCallBack`: `CounterPathCallBack`,
    public var `dwCallBackArg`: ULong,
    public var `CallBackStatus`: Int,
    public var `dwDefaultDetailLevel`: `PERF_DETAIL`,
    public var `szDialogBoxCaption`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 232:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_BROWSE_DLG_CONFIG_HW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PDH_BROWSE_DLG_CONFIG_W` (
    public var `_bitfield`: UInt,
    public var `hWndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `szDataSource`: `windows_sys`.`core`.`PWSTR`,
    public var `szReturnPathBuffer`: `windows_sys`.`core`.`PWSTR`,
    public var `cchReturnPathLength`: UInt,
    public var `pCallBack`: `CounterPathCallBack`,
    public var `dwCallBackArg`: ULong,
    public var `CallBackStatus`: Int,
    public var `dwDefaultDetailLevel`: `PERF_DETAIL`,
    public var `szDialogBoxCaption`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 251:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_BROWSE_DLG_CONFIG_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PDH_CALC_NEGATIVE_DENOMINATOR`: UInt = 2147485654u;
public const val `PDH_CALC_NEGATIVE_TIMEBASE`: UInt = 2147485655u;
public const val `PDH_CALC_NEGATIVE_VALUE`: UInt = 2147485656u;
public const val `PDH_CANNOT_CONNECT_MACHINE`: UInt = 3221228483u;
public const val `PDH_CANNOT_CONNECT_WMI_SERVER`: UInt = 3221228520u;
public const val `PDH_CANNOT_READ_NAME_STRINGS`: UInt = 3221228488u;
public const val `PDH_CANNOT_SET_DEFAULT_REALTIME_DATASOURCE`: UInt = 2147485660u;
public const val `PDH_COUNTER_ALREADY_IN_QUERY`: UInt = 3221228534u;
// UNSUPPORTED Rust 264:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PDH_COUNTER_INFO_A {
//     pub dwLength: u32,
//     pub dwType: u32,
//     pub CVersion: u32,
//     pub CStatus: u32,
//     pub lScale: i32,
//     pub lDefaultScale: i32,
//     pub dwUserData: usize,
//     pub dwQueryUserData: usize,
//     pub szFullPath: windows_sys::core::PSTR,
//     pub Anonymous: PDH_COUNTER_INFO_A_0,
//     pub szExplainText: windows_sys::core::PSTR,
//     pub DataBuffer: [u32; 1],
// }

// UNSUPPORTED Rust 280:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_COUNTER_INFO_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 285:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PDH_COUNTER_INFO_A_0 {
//     pub DataItemPath: PDH_DATA_ITEM_PATH_ELEMENTS_A,
//     pub CounterPath: PDH_COUNTER_PATH_ELEMENTS_A,
//     pub Anonymous: PDH_COUNTER_INFO_A_0_0,
// }

// UNSUPPORTED Rust 292:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_COUNTER_INFO_A_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PDH_COUNTER_INFO_A_0_0` (
    public var `szMachineName`: `windows_sys`.`core`.`PSTR`,
    public var `szObjectName`: `windows_sys`.`core`.`PSTR`,
    public var `szInstanceName`: `windows_sys`.`core`.`PSTR`,
    public var `szParentInstance`: `windows_sys`.`core`.`PSTR`,
    public var `dwInstanceIndex`: UInt,
    public var `szCounterName`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 307:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_COUNTER_INFO_A_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 312:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PDH_COUNTER_INFO_W {
//     pub dwLength: u32,
//     pub dwType: u32,
//     pub CVersion: u32,
//     pub CStatus: u32,
//     pub lScale: i32,
//     pub lDefaultScale: i32,
//     pub dwUserData: usize,
//     pub dwQueryUserData: usize,
//     pub szFullPath: windows_sys::core::PWSTR,
//     pub Anonymous: PDH_COUNTER_INFO_W_0,
//     pub szExplainText: windows_sys::core::PWSTR,
//     pub DataBuffer: [u32; 1],
// }

// UNSUPPORTED Rust 328:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_COUNTER_INFO_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 333:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PDH_COUNTER_INFO_W_0 {
//     pub DataItemPath: PDH_DATA_ITEM_PATH_ELEMENTS_W,
//     pub CounterPath: PDH_COUNTER_PATH_ELEMENTS_W,
//     pub Anonymous: PDH_COUNTER_INFO_W_0_0,
// }

// UNSUPPORTED Rust 340:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_COUNTER_INFO_W_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PDH_COUNTER_INFO_W_0_0` (
    public var `szMachineName`: `windows_sys`.`core`.`PWSTR`,
    public var `szObjectName`: `windows_sys`.`core`.`PWSTR`,
    public var `szInstanceName`: `windows_sys`.`core`.`PWSTR`,
    public var `szParentInstance`: `windows_sys`.`core`.`PWSTR`,
    public var `dwInstanceIndex`: UInt,
    public var `szCounterName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 355:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_COUNTER_INFO_W_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PDH_COUNTER_PATH_ELEMENTS_A` (
    public var `szMachineName`: `windows_sys`.`core`.`PSTR`,
    public var `szObjectName`: `windows_sys`.`core`.`PSTR`,
    public var `szInstanceName`: `windows_sys`.`core`.`PSTR`,
    public var `szParentInstance`: `windows_sys`.`core`.`PSTR`,
    public var `dwInstanceIndex`: UInt,
    public var `szCounterName`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 370:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_COUNTER_PATH_ELEMENTS_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PDH_COUNTER_PATH_ELEMENTS_W` (
    public var `szMachineName`: `windows_sys`.`core`.`PWSTR`,
    public var `szObjectName`: `windows_sys`.`core`.`PWSTR`,
    public var `szInstanceName`: `windows_sys`.`core`.`PWSTR`,
    public var `szParentInstance`: `windows_sys`.`core`.`PWSTR`,
    public var `dwInstanceIndex`: UInt,
    public var `szCounterName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 385:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_COUNTER_PATH_ELEMENTS_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PDH_CSTATUS_BAD_COUNTERNAME`: UInt = 3221228480u;
public const val `PDH_CSTATUS_INVALID_DATA`: UInt = 3221228474u;
public const val `PDH_CSTATUS_ITEM_NOT_VALIDATED`: UInt = 2147485651u;
public const val `PDH_CSTATUS_NEW_DATA`: UInt = 1u;
public const val `PDH_CSTATUS_NO_COUNTER`: UInt = 3221228473u;
public const val `PDH_CSTATUS_NO_COUNTERNAME`: UInt = 3221228479u;
public const val `PDH_CSTATUS_NO_INSTANCE`: UInt = 2147485649u;
public const val `PDH_CSTATUS_NO_MACHINE`: UInt = 2147485648u;
public const val `PDH_CSTATUS_NO_OBJECT`: UInt = 3221228472u;
public const val `PDH_CSTATUS_VALID_DATA`: UInt = 0u;
public const val `PDH_CVERSION_WIN50`: `PDH_DLL_VERSION` = 1280u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PDH_DATA_ITEM_PATH_ELEMENTS_A` (
    public var `szMachineName`: `windows_sys`.`core`.`PSTR`,
    public var `ObjectGUID`: `windows_sys`.`core`.`GUID`,
    public var `dwItemId`: UInt,
    public var `szInstanceName`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 409:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_DATA_ITEM_PATH_ELEMENTS_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PDH_DATA_ITEM_PATH_ELEMENTS_W` (
    public var `szMachineName`: `windows_sys`.`core`.`PWSTR`,
    public var `ObjectGUID`: `windows_sys`.`core`.`GUID`,
    public var `dwItemId`: UInt,
    public var `szInstanceName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 422:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_DATA_ITEM_PATH_ELEMENTS_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PDH_DATA_SOURCE_IS_LOG_FILE`: UInt = 3221228494u;
public const val `PDH_DATA_SOURCE_IS_REAL_TIME`: UInt = 3221228495u;
public const val `PDH_DIALOG_CANCELLED`: UInt = 2147485657u;
public typealias `PDH_DLL_VERSION` = UInt;
public const val `PDH_END_OF_LOG_FILE`: UInt = 2147485658u;
public const val `PDH_ENTRY_NOT_IN_LOG_FILE`: UInt = 3221228493u;
public const val `PDH_FILE_ALREADY_EXISTS`: UInt = 3221228498u;
public const val `PDH_FILE_NOT_FOUND`: UInt = 3221228497u;
public const val `PDH_FLAGS_FILE_BROWSER_ONLY`: `PDH_SELECT_DATA_SOURCE_FLAGS` = 1u;
public const val `PDH_FLAGS_NONE`: `PDH_SELECT_DATA_SOURCE_FLAGS` = 0u;
public typealias `PDH_FMT` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PDH_FMT_COUNTERVALUE` (
    public var `CStatus`: UInt,
    public var `Anonymous`: `PDH_FMT_COUNTERVALUE_0`,
)
// UNSUPPORTED Rust 444:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_FMT_COUNTERVALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 449:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PDH_FMT_COUNTERVALUE_0 {
//     pub longValue: i32,
//     pub doubleValue: f64,
//     pub largeValue: i64,
//     pub AnsiStringValue: windows_sys::core::PCSTR,
//     pub WideStringValue: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 458:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_FMT_COUNTERVALUE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PDH_FMT_COUNTERVALUE_ITEM_A` (
    public var `szName`: `windows_sys`.`core`.`PSTR`,
    public var `FmtValue`: `PDH_FMT_COUNTERVALUE`,
)
// UNSUPPORTED Rust 469:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_FMT_COUNTERVALUE_ITEM_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PDH_FMT_COUNTERVALUE_ITEM_W` (
    public var `szName`: `windows_sys`.`core`.`PWSTR`,
    public var `FmtValue`: `PDH_FMT_COUNTERVALUE`,
)
// UNSUPPORTED Rust 480:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_FMT_COUNTERVALUE_ITEM_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PDH_FMT_DOUBLE`: `PDH_FMT` = 512u;
public const val `PDH_FMT_LARGE`: `PDH_FMT` = 1024u;
public const val `PDH_FMT_LONG`: `PDH_FMT` = 256u;
public const val `PDH_FUNCTION_NOT_FOUND`: UInt = 3221228478u;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PDH_HCOUNTER` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PDH_HLOG` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PDH_HQUERY` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public const val `PDH_INCORRECT_APPEND_TIME`: UInt = 3221228539u;
public const val `PDH_INSUFFICIENT_BUFFER`: UInt = 3221228482u;
public const val `PDH_INVALID_ARGUMENT`: UInt = 3221228477u;
public const val `PDH_INVALID_BUFFER`: UInt = 3221228481u;
public const val `PDH_INVALID_DATA`: UInt = 3221228486u;
public const val `PDH_INVALID_DATASOURCE`: UInt = 3221228509u;
public const val `PDH_INVALID_HANDLE`: UInt = 3221228476u;
public const val `PDH_INVALID_INSTANCE`: UInt = 3221228485u;
public const val `PDH_INVALID_PATH`: UInt = 3221228484u;
public const val `PDH_INVALID_SQLDB`: UInt = 3221228510u;
public const val `PDH_INVALID_SQL_LOG_FORMAT`: UInt = 3221228533u;
public typealias `PDH_LOG` = UInt;
public const val `PDH_LOGSVC_NOT_OPENED`: UInt = 3221228505u;
public const val `PDH_LOGSVC_QUERY_NOT_FOUND`: UInt = 3221228504u;
public const val `PDH_LOG_FILE_CREATE_ERROR`: UInt = 3221228489u;
public const val `PDH_LOG_FILE_OPEN_ERROR`: UInt = 3221228490u;
public const val `PDH_LOG_FILE_TOO_SMALL`: UInt = 3221228508u;
public const val `PDH_LOG_READ_ACCESS`: `PDH_LOG` = 65536u;
public const val `PDH_LOG_SAMPLE_TOO_SMALL`: UInt = 3221228536u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PDH_LOG_SERVICE_QUERY_INFO_A` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `dwLogQuota`: UInt,
    public var `szLogFileCaption`: `windows_sys`.`core`.`PSTR`,
    public var `szDefaultDir`: `windows_sys`.`core`.`PSTR`,
    public var `szBaseFileName`: `windows_sys`.`core`.`PSTR`,
    public var `dwFileType`: UInt,
    public var `dwReserved`: UInt,
    public var `Anonymous`: `PDH_LOG_SERVICE_QUERY_INFO_A_0`,
)
// UNSUPPORTED Rust 524:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_LOG_SERVICE_QUERY_INFO_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 529:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PDH_LOG_SERVICE_QUERY_INFO_A_0 {
//     pub Anonymous1: PDH_LOG_SERVICE_QUERY_INFO_A_0_0,
//     pub Anonymous2: PDH_LOG_SERVICE_QUERY_INFO_A_0_1,
// }

// UNSUPPORTED Rust 535:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_LOG_SERVICE_QUERY_INFO_A_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PDH_LOG_SERVICE_QUERY_INFO_A_0_0` (
    public var `PdlAutoNameInterval`: UInt,
    public var `PdlAutoNameUnits`: UInt,
    public var `PdlCommandFilename`: `windows_sys`.`core`.`PSTR`,
    public var `PdlCounterList`: `windows_sys`.`core`.`PSTR`,
    public var `PdlAutoNameFormat`: UInt,
    public var `PdlSampleInterval`: UInt,
    public var `PdlLogStartTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `PdlLogEndTime`: `super`.`super`.`Foundation`.`FILETIME`,
)
// UNSUPPORTED Rust 552:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_LOG_SERVICE_QUERY_INFO_A_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PDH_LOG_SERVICE_QUERY_INFO_A_0_1` (
    public var `TlNumberOfBuffers`: UInt,
    public var `TlMinimumBuffers`: UInt,
    public var `TlMaximumBuffers`: UInt,
    public var `TlFreeBuffers`: UInt,
    public var `TlBufferSize`: UInt,
    public var `TlEventsLost`: UInt,
    public var `TlLoggerThreadId`: UInt,
    public var `TlBuffersWritten`: UInt,
    public var `TlLogHandle`: UInt,
    public var `TlLogFileName`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 571:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_LOG_SERVICE_QUERY_INFO_A_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PDH_LOG_SERVICE_QUERY_INFO_W` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `dwLogQuota`: UInt,
    public var `szLogFileCaption`: `windows_sys`.`core`.`PWSTR`,
    public var `szDefaultDir`: `windows_sys`.`core`.`PWSTR`,
    public var `szBaseFileName`: `windows_sys`.`core`.`PWSTR`,
    public var `dwFileType`: UInt,
    public var `dwReserved`: UInt,
    public var `Anonymous`: `PDH_LOG_SERVICE_QUERY_INFO_W_0`,
)
// UNSUPPORTED Rust 589:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_LOG_SERVICE_QUERY_INFO_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 594:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PDH_LOG_SERVICE_QUERY_INFO_W_0 {
//     pub Anonymous1: PDH_LOG_SERVICE_QUERY_INFO_W_0_0,
//     pub Anonymous2: PDH_LOG_SERVICE_QUERY_INFO_W_0_1,
// }

// UNSUPPORTED Rust 600:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_LOG_SERVICE_QUERY_INFO_W_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PDH_LOG_SERVICE_QUERY_INFO_W_0_0` (
    public var `PdlAutoNameInterval`: UInt,
    public var `PdlAutoNameUnits`: UInt,
    public var `PdlCommandFilename`: `windows_sys`.`core`.`PWSTR`,
    public var `PdlCounterList`: `windows_sys`.`core`.`PWSTR`,
    public var `PdlAutoNameFormat`: UInt,
    public var `PdlSampleInterval`: UInt,
    public var `PdlLogStartTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `PdlLogEndTime`: `super`.`super`.`Foundation`.`FILETIME`,
)
// UNSUPPORTED Rust 617:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_LOG_SERVICE_QUERY_INFO_W_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PDH_LOG_SERVICE_QUERY_INFO_W_0_1` (
    public var `TlNumberOfBuffers`: UInt,
    public var `TlMinimumBuffers`: UInt,
    public var `TlMaximumBuffers`: UInt,
    public var `TlFreeBuffers`: UInt,
    public var `TlBufferSize`: UInt,
    public var `TlEventsLost`: UInt,
    public var `TlLoggerThreadId`: UInt,
    public var `TlBuffersWritten`: UInt,
    public var `TlLogHandle`: UInt,
    public var `TlLogFileName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 636:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_LOG_SERVICE_QUERY_INFO_W_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `PDH_LOG_TYPE` = UInt;
public const val `PDH_LOG_TYPE_BINARY`: `PDH_LOG_TYPE` = 8u;
public const val `PDH_LOG_TYPE_CSV`: `PDH_LOG_TYPE` = 1u;
public const val `PDH_LOG_TYPE_NOT_FOUND`: UInt = 3221228491u;
public const val `PDH_LOG_TYPE_PERFMON`: `PDH_LOG_TYPE` = 6u;
public const val `PDH_LOG_TYPE_RETIRED_BIN`: UInt = 3u;
public const val `PDH_LOG_TYPE_SQL`: `PDH_LOG_TYPE` = 7u;
public const val `PDH_LOG_TYPE_TRACE_GENERIC`: UInt = 5u;
public const val `PDH_LOG_TYPE_TRACE_KERNEL`: UInt = 4u;
public const val `PDH_LOG_TYPE_TSV`: `PDH_LOG_TYPE` = 2u;
public const val `PDH_LOG_TYPE_UNDEFINED`: `PDH_LOG_TYPE` = 0u;
public const val `PDH_LOG_UPDATE_ACCESS`: `PDH_LOG` = 262144u;
public const val `PDH_LOG_WRITE_ACCESS`: `PDH_LOG` = 131072u;
public const val `PDH_MAX_COUNTER_NAME`: UInt = 1024u;
public const val `PDH_MAX_COUNTER_PATH`: UInt = 2048u;
public const val `PDH_MAX_DATASOURCE_PATH`: UInt = 1024u;
public const val `PDH_MAX_INSTANCE_NAME`: UInt = 1024u;
public const val `PDH_MAX_SCALE`: Int = 7;
public const val `PDH_MEMORY_ALLOCATION_FAILURE`: UInt = 3221228475u;
public const val `PDH_MIN_SCALE`: Int = -7;
public const val `PDH_MORE_DATA`: UInt = 2147485650u;
public const val `PDH_NOEXPANDCOUNTERS`: UInt = 1u;
public const val `PDH_NOEXPANDINSTANCES`: UInt = 2u;
public const val `PDH_NOT_IMPLEMENTED`: UInt = 3221228499u;
public const val `PDH_NO_COUNTERS`: UInt = 3221228511u;
public const val `PDH_NO_DATA`: UInt = 2147485653u;
public const val `PDH_NO_DIALOG_DATA`: UInt = 3221228487u;
public const val `PDH_NO_MORE_DATA`: UInt = 3221228492u;
public const val `PDH_OS_EARLIER_VERSION`: UInt = 3221228538u;
public const val `PDH_OS_LATER_VERSION`: UInt = 3221228537u;
public typealias `PDH_PATH_FLAGS` = UInt;
public const val `PDH_PATH_WBEM_INPUT`: `PDH_PATH_FLAGS` = 2u;
public const val `PDH_PATH_WBEM_NONE`: `PDH_PATH_FLAGS` = 0u;
public const val `PDH_PATH_WBEM_RESULT`: `PDH_PATH_FLAGS` = 1u;
public const val `PDH_PLA_COLLECTION_ALREADY_RUNNING`: UInt = 3221228521u;
public const val `PDH_PLA_COLLECTION_NOT_FOUND`: UInt = 3221228523u;
public const val `PDH_PLA_ERROR_ALREADY_EXISTS`: UInt = 3221228526u;
public const val `PDH_PLA_ERROR_FILEPATH`: UInt = 3221228528u;
public const val `PDH_PLA_ERROR_NAME_TOO_LONG`: UInt = 3221228532u;
public const val `PDH_PLA_ERROR_NOSTART`: UInt = 3221228525u;
public const val `PDH_PLA_ERROR_SCHEDULE_ELAPSED`: UInt = 3221228524u;
public const val `PDH_PLA_ERROR_SCHEDULE_OVERLAP`: UInt = 3221228522u;
public const val `PDH_PLA_ERROR_TYPE_MISMATCH`: UInt = 3221228527u;
public const val `PDH_PLA_SERVICE_ERROR`: UInt = 3221228529u;
public const val `PDH_PLA_VALIDATION_ERROR`: UInt = 3221228530u;
public const val `PDH_PLA_VALIDATION_WARNING`: UInt = 2147486707u;
public const val `PDH_QUERY_PERF_DATA_TIMEOUT`: UInt = 3221228542u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PDH_RAW_COUNTER` (
    public var `CStatus`: UInt,
    public var `TimeStamp`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `FirstValue`: Long,
    public var `SecondValue`: Long,
    public var `MultiCount`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PDH_RAW_COUNTER_ITEM_A` (
    public var `szName`: `windows_sys`.`core`.`PSTR`,
    public var `RawValue`: `PDH_RAW_COUNTER`,
)
// UNSUPPORTED Rust 703:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_RAW_COUNTER_ITEM_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PDH_RAW_COUNTER_ITEM_W` (
    public var `szName`: `windows_sys`.`core`.`PWSTR`,
    public var `RawValue`: `PDH_RAW_COUNTER`,
)
// UNSUPPORTED Rust 714:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_RAW_COUNTER_ITEM_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 719:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PDH_RAW_LOG_RECORD {
//     pub dwStructureSize: u32,
//     pub dwRecordType: PDH_LOG_TYPE,
//     pub dwItems: u32,
//     pub RawBytes: [u8; 1],
// }

// UNSUPPORTED Rust 727:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_RAW_LOG_RECORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PDH_REFRESHCOUNTERS`: UInt = 4u;
public const val `PDH_RETRY`: UInt = 2147485652u;
public typealias `PDH_SELECT_DATA_SOURCE_FLAGS` = UInt;
public const val `PDH_SQL_ALLOCCON_FAILED`: UInt = 3221228513u;
public const val `PDH_SQL_ALLOC_FAILED`: UInt = 3221228512u;
public const val `PDH_SQL_ALTER_DETAIL_FAILED`: UInt = 3221228541u;
public const val `PDH_SQL_BIND_FAILED`: UInt = 3221228519u;
public const val `PDH_SQL_CONNECT_FAILED`: UInt = 3221228518u;
public const val `PDH_SQL_EXEC_DIRECT_FAILED`: UInt = 3221228514u;
public const val `PDH_SQL_FETCH_FAILED`: UInt = 3221228515u;
public const val `PDH_SQL_MORE_RESULTS_FAILED`: UInt = 3221228517u;
public const val `PDH_SQL_ROWCOUNT_FAILED`: UInt = 3221228516u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PDH_STATISTICS` (
    public var `dwFormat`: UInt,
    public var `count`: UInt,
    public var `min`: `PDH_FMT_COUNTERVALUE`,
    public var `max`: `PDH_FMT_COUNTERVALUE`,
    public var `mean`: `PDH_FMT_COUNTERVALUE`,
)
// UNSUPPORTED Rust 753:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PDH_STATISTICS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PDH_STRING_NOT_FOUND`: UInt = 3221228500u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PDH_TIME_INFO` (
    public var `StartTime`: Long,
    public var `EndTime`: Long,
    public var `SampleCount`: UInt,
)
public const val `PDH_UNABLE_MAP_NAME_FILES`: UInt = 2147486677u;
public const val `PDH_UNABLE_READ_LOG_HEADER`: UInt = 3221228496u;
public const val `PDH_UNKNOWN_LOGSVC_COMMAND`: UInt = 3221228503u;
public const val `PDH_UNKNOWN_LOG_FORMAT`: UInt = 3221228502u;
public const val `PDH_UNMATCHED_APPEND_COUNTER`: UInt = 3221228540u;
public const val `PDH_VERSION`: `PDH_DLL_VERSION` = 1283u;
public const val `PDH_WBEM_ERROR`: UInt = 3221228506u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PERFLIBREQUEST` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> UInt>>>;
public const val `PERF_ADD_COUNTER`: UInt = 1u;
public const val `PERF_AGGREGATE_AVG`: `PERF_COUNTER_AGGREGATE_FUNC` = 2u;
// UNSUPPORTED Rust 776:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const PERF_AGGREGATE_INSTANCE: windows_sys::core::PCWSTR = windows_sys::core::w!("_Total");

public const val `PERF_AGGREGATE_MAX`: `PERF_COUNTER_AGGREGATE_FUNC` = 4u;
public const val `PERF_AGGREGATE_MIN`: `PERF_COUNTER_AGGREGATE_FUNC` = 3u;
public const val `PERF_AGGREGATE_TOTAL`: `PERF_COUNTER_AGGREGATE_FUNC` = 1u;
public const val `PERF_AGGREGATE_UNDEFINED`: `PERF_COUNTER_AGGREGATE_FUNC` = 0u;
public const val `PERF_ATTRIB_BY_REFERENCE`: ULong = 1uL;
public const val `PERF_ATTRIB_DISPLAY_AS_HEX`: ULong = 16uL;
public const val `PERF_ATTRIB_DISPLAY_AS_REAL`: ULong = 8uL;
public const val `PERF_ATTRIB_NO_DISPLAYABLE`: ULong = 2uL;
public const val `PERF_ATTRIB_NO_GROUP_SEPARATOR`: ULong = 4uL;
public const val `PERF_COLLECT_END`: UInt = 6u;
public const val `PERF_COLLECT_START`: UInt = 5u;
public const val `PERF_COUNTERSET`: `PerfCounterDataType` = 6;
public const val `PERF_COUNTERSET_FLAG_AGGREGATE`: UInt = 4u;
public const val `PERF_COUNTERSET_FLAG_HISTORY`: UInt = 8u;
public const val `PERF_COUNTERSET_FLAG_INSTANCE`: UInt = 16u;
public const val `PERF_COUNTERSET_FLAG_MULTIPLE`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PERF_COUNTERSET_INFO` (
    public var `CounterSetGuid`: `windows_sys`.`core`.`GUID`,
    public var `ProviderGuid`: `windows_sys`.`core`.`GUID`,
    public var `NumCounters`: UInt,
    public var `InstanceType`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PERF_COUNTERSET_INSTANCE` (
    public var `CounterSetGuid`: `windows_sys`.`core`.`GUID`,
    public var `dwSize`: UInt,
    public var `InstanceId`: UInt,
    public var `InstanceNameOffset`: UInt,
    public var `InstanceNameSize`: UInt,
)
public const val `PERF_COUNTERSET_MULTI_INSTANCES`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PERF_COUNTERSET_REG_INFO` (
    public var `CounterSetGuid`: `windows_sys`.`core`.`GUID`,
    public var `CounterSetType`: UInt,
    public var `DetailLevel`: UInt,
    public var `NumCounters`: UInt,
    public var `InstanceType`: UInt,
)
public const val `PERF_COUNTERSET_SINGLE_AGGREGATE`: UInt = 4u;
public const val `PERF_COUNTERSET_SINGLE_INSTANCE`: UInt = 0u;
public typealias `PERF_COUNTER_AGGREGATE_FUNC` = UInt;
public const val `PERF_COUNTER_BASE`: UInt = 196608u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PERF_COUNTER_BLOCK` (
    public var `ByteLength`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PERF_COUNTER_DATA` (
    public var `dwDataSize`: UInt,
    public var `dwSize`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PERF_COUNTER_DEFINITION` (
    public var `ByteLength`: UInt,
    public var `CounterNameTitleIndex`: UInt,
    public var `CounterNameTitle`: `windows_sys`.`core`.`PWSTR`,
    public var `CounterHelpTitleIndex`: UInt,
    public var `CounterHelpTitle`: `windows_sys`.`core`.`PWSTR`,
    public var `DefaultScale`: Int,
    public var `DetailLevel`: UInt,
    public var `CounterType`: UInt,
    public var `CounterSize`: UInt,
    public var `CounterOffset`: UInt,
)
// UNSUPPORTED Rust 850:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for PERF_COUNTER_DEFINITION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PERF_COUNTER_DEFINITION` (
    public var `ByteLength`: UInt,
    public var `CounterNameTitleIndex`: UInt,
    public var `CounterNameTitle`: UInt,
    public var `CounterHelpTitleIndex`: UInt,
    public var `CounterHelpTitle`: UInt,
    public var `DefaultScale`: Int,
    public var `DetailLevel`: UInt,
    public var `CounterType`: UInt,
    public var `CounterSize`: UInt,
    public var `CounterOffset`: UInt,
)
public const val `PERF_COUNTER_ELAPSED`: UInt = 262144u;
public const val `PERF_COUNTER_FRACTION`: UInt = 131072u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PERF_COUNTER_HEADER` (
    public var `dwStatus`: UInt,
    public var `dwType`: `PerfCounterDataType`,
    public var `dwSize`: UInt,
    public var `Reserved`: UInt,
)
public const val `PERF_COUNTER_HISTOGRAM`: UInt = 393216u;
public const val `PERF_COUNTER_HISTOGRAM_TYPE`: UInt = 2147483648u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PERF_COUNTER_IDENTIFIER` (
    public var `CounterSetGuid`: `windows_sys`.`core`.`GUID`,
    public var `Status`: UInt,
    public var `Size`: UInt,
    public var `CounterId`: UInt,
    public var `InstanceId`: UInt,
    public var `Index`: UInt,
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PERF_COUNTER_IDENTITY` (
    public var `CounterSetGuid`: `windows_sys`.`core`.`GUID`,
    public var `BufferSize`: UInt,
    public var `CounterId`: UInt,
    public var `InstanceId`: UInt,
    public var `MachineOffset`: UInt,
    public var `NameOffset`: UInt,
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PERF_COUNTER_INFO` (
    public var `CounterId`: UInt,
    public var `Type`: UInt,
    public var `Attrib`: ULong,
    public var `Size`: UInt,
    public var `DetailLevel`: UInt,
    public var `Scale`: Int,
    public var `Offset`: UInt,
)
public const val `PERF_COUNTER_PRECISION`: UInt = 458752u;
public const val `PERF_COUNTER_QUEUELEN`: UInt = 327680u;
public const val `PERF_COUNTER_RATE`: UInt = 65536u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PERF_COUNTER_REG_INFO` (
    public var `CounterId`: UInt,
    public var `Type`: UInt,
    public var `Attrib`: ULong,
    public var `DetailLevel`: UInt,
    public var `DefaultScale`: Int,
    public var `BaseCounterId`: UInt,
    public var `PerfTimeId`: UInt,
    public var `PerfFreqId`: UInt,
    public var `MultiId`: UInt,
    public var `AggregateFunc`: `PERF_COUNTER_AGGREGATE_FUNC`,
    public var `Reserved`: UInt,
)
public const val `PERF_COUNTER_VALUE`: UInt = 0u;
// UNSUPPORTED Rust 935:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PERF_DATA_BLOCK {
//     pub Signature: [u16; 4],
//     pub LittleEndian: u32,
//     pub Version: u32,
//     pub Revision: u32,
//     pub TotalByteLength: u32,
//     pub HeaderLength: u32,
//     pub NumObjectTypes: u32,
//     pub DefaultObject: i32,
//     pub SystemTime: super::super::Foundation::SYSTEMTIME,
//     pub PerfTime: i64,
//     pub PerfFreq: i64,
//     pub PerfTime100nSec: i64,
//     pub SystemNameLength: u32,
//     pub SystemNameOffset: u32,
// }

// UNSUPPORTED Rust 953:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PERF_DATA_BLOCK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PERF_DATA_HEADER` (
    public var `dwTotalSize`: UInt,
    public var `dwNumCounters`: UInt,
    public var `PerfTimeStamp`: Long,
    public var `PerfTime100NSec`: Long,
    public var `PerfFreq`: Long,
    public var `SystemTime`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
)
public const val `PERF_DATA_REVISION`: UInt = 1u;
public const val `PERF_DATA_VERSION`: UInt = 1u;
public const val `PERF_DELTA_BASE`: UInt = 8388608u;
public const val `PERF_DELTA_COUNTER`: UInt = 4194304u;
public typealias `PERF_DETAIL` = UInt;
public const val `PERF_DETAIL_ADVANCED`: `PERF_DETAIL` = 200u;
public const val `PERF_DETAIL_EXPERT`: `PERF_DETAIL` = 300u;
public const val `PERF_DETAIL_NOVICE`: `PERF_DETAIL` = 100u;
public const val `PERF_DETAIL_WIZARD`: `PERF_DETAIL` = 400u;
public const val `PERF_DISPLAY_NOSHOW`: UInt = 1073741824u;
public const val `PERF_DISPLAY_NO_SUFFIX`: UInt = 0u;
public const val `PERF_DISPLAY_PERCENT`: UInt = 536870912u;
public const val `PERF_DISPLAY_PER_SEC`: UInt = 268435456u;
public const val `PERF_DISPLAY_SECONDS`: UInt = 805306368u;
public const val `PERF_ENUM_INSTANCES`: UInt = 3u;
public const val `PERF_ERROR_RETURN`: `PerfCounterDataType` = 0;
public const val `PERF_FILTER`: UInt = 9u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PERF_INSTANCE_DEFINITION` (
    public var `ByteLength`: UInt,
    public var `ParentObjectTitleIndex`: UInt,
    public var `ParentObjectInstance`: UInt,
    public var `UniqueID`: Int,
    public var `NameOffset`: UInt,
    public var `NameLength`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PERF_INSTANCE_HEADER` (
    public var `Size`: UInt,
    public var `InstanceId`: UInt,
)
public const val `PERF_INVERSE_COUNTER`: UInt = 16777216u;
public const val `PERF_MAX_INSTANCE_NAME`: UInt = 1024u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PERF_MEM_ALLOC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PERF_MEM_FREE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public const val `PERF_METADATA_MULTIPLE_INSTANCES`: Int = -2;
public const val `PERF_METADATA_NO_INSTANCES`: Int = -3;
public const val `PERF_MULTIPLE_COUNTERS`: `PerfCounterDataType` = 2;
public const val `PERF_MULTIPLE_INSTANCES`: `PerfCounterDataType` = 4;
public const val `PERF_MULTI_COUNTER`: UInt = 33554432u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PERF_MULTI_COUNTERS` (
    public var `dwSize`: UInt,
    public var `dwCounters`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PERF_MULTI_INSTANCES` (
    public var `dwTotalSize`: UInt,
    public var `dwInstances`: UInt,
)
public const val `PERF_NO_INSTANCES`: Int = -1;
public const val `PERF_NO_UNIQUE_ID`: Int = -1;
public const val `PERF_NUMBER_DECIMAL`: UInt = 65536u;
public const val `PERF_NUMBER_DEC_1000`: UInt = 131072u;
public const val `PERF_NUMBER_HEX`: UInt = 0u;
public const val `PERF_OBJECT_TIMER`: UInt = 2097152u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PERF_OBJECT_TYPE` (
    public var `TotalByteLength`: UInt,
    public var `DefinitionLength`: UInt,
    public var `HeaderLength`: UInt,
    public var `ObjectNameTitleIndex`: UInt,
    public var `ObjectNameTitle`: `windows_sys`.`core`.`PWSTR`,
    public var `ObjectHelpTitleIndex`: UInt,
    public var `ObjectHelpTitle`: `windows_sys`.`core`.`PWSTR`,
    public var `DetailLevel`: UInt,
    public var `NumCounters`: UInt,
    public var `DefaultCounter`: Int,
    public var `NumInstances`: Int,
    public var `CodePage`: UInt,
    public var `PerfTime`: Long,
    public var `PerfFreq`: Long,
)
// UNSUPPORTED Rust 1047:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for PERF_OBJECT_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PERF_OBJECT_TYPE` (
    public var `TotalByteLength`: UInt,
    public var `DefinitionLength`: UInt,
    public var `HeaderLength`: UInt,
    public var `ObjectNameTitleIndex`: UInt,
    public var `ObjectNameTitle`: UInt,
    public var `ObjectHelpTitleIndex`: UInt,
    public var `ObjectHelpTitle`: UInt,
    public var `DetailLevel`: UInt,
    public var `NumCounters`: UInt,
    public var `DefaultCounter`: Int,
    public var `NumInstances`: Int,
    public var `CodePage`: UInt,
    public var `PerfTime`: Long,
    public var `PerfFreq`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PERF_PROVIDER_CONTEXT` (
    public var `ContextSize`: UInt,
    public var `Reserved`: UInt,
    public var `ControlCallback`: `PERFLIBREQUEST`,
    public var `MemAllocRoutine`: `PERF_MEM_ALLOC`,
    public var `MemFreeRoutine`: `PERF_MEM_FREE`,
    public var `pMemContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1082:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PERF_PROVIDER_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PERF_PROVIDER_DRIVER`: UInt = 2u;
public const val `PERF_PROVIDER_KERNEL_MODE`: UInt = 1u;
public const val `PERF_PROVIDER_USER_MODE`: UInt = 0u;
public const val `PERF_REG_COUNTERSET_ENGLISH_NAME`: `PerfRegInfoType` = 9;
public const val `PERF_REG_COUNTERSET_HELP_STRING`: `PerfRegInfoType` = 4;
public const val `PERF_REG_COUNTERSET_NAME_STRING`: `PerfRegInfoType` = 3;
public const val `PERF_REG_COUNTERSET_STRUCT`: `PerfRegInfoType` = 1;
public const val `PERF_REG_COUNTER_ENGLISH_NAMES`: `PerfRegInfoType` = 10;
public const val `PERF_REG_COUNTER_HELP_STRINGS`: `PerfRegInfoType` = 6;
public const val `PERF_REG_COUNTER_NAME_STRINGS`: `PerfRegInfoType` = 5;
public const val `PERF_REG_COUNTER_STRUCT`: `PerfRegInfoType` = 2;
public const val `PERF_REG_PROVIDER_GUID`: `PerfRegInfoType` = 8;
public const val `PERF_REG_PROVIDER_NAME`: `PerfRegInfoType` = 7;
public const val `PERF_REMOVE_COUNTER`: UInt = 2u;
public const val `PERF_SINGLE_COUNTER`: `PerfCounterDataType` = 1;
public const val `PERF_SIZE_DWORD`: UInt = 0u;
public const val `PERF_SIZE_LARGE`: UInt = 256u;
public const val `PERF_SIZE_VARIABLE_LEN`: UInt = 768u;
public const val `PERF_SIZE_ZERO`: UInt = 512u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PERF_STRING_BUFFER_HEADER` (
    public var `dwSize`: UInt,
    public var `dwCounters`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PERF_STRING_COUNTER_HEADER` (
    public var `dwCounterId`: UInt,
    public var `dwOffset`: UInt,
)
public const val `PERF_TEXT_ASCII`: UInt = 65536u;
public const val `PERF_TEXT_UNICODE`: UInt = 0u;
public const val `PERF_TIMER_100NS`: UInt = 1048576u;
public const val `PERF_TIMER_TICK`: UInt = 0u;
public const val `PERF_TYPE_COUNTER`: UInt = 1024u;
public const val `PERF_TYPE_NUMBER`: UInt = 0u;
public const val `PERF_TYPE_TEXT`: UInt = 2048u;
public const val `PERF_TYPE_ZERO`: UInt = 3072u;
public const val `PERF_WILDCARD_COUNTER`: UInt = 4294967295u;
// UNSUPPORTED Rust 1127:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const PERF_WILDCARD_INSTANCE: windows_sys::core::PCWSTR = windows_sys::core::w!("*");

public const val `PLAL_ALERT_CMD_LINE_A_NAME`: UInt = 512u;
public const val `PLAL_ALERT_CMD_LINE_C_NAME`: UInt = 1024u;
public const val `PLAL_ALERT_CMD_LINE_D_TIME`: UInt = 2048u;
public const val `PLAL_ALERT_CMD_LINE_L_VAL`: UInt = 4096u;
public const val `PLAL_ALERT_CMD_LINE_MASK`: UInt = 32512u;
public const val `PLAL_ALERT_CMD_LINE_M_VAL`: UInt = 8192u;
public const val `PLAL_ALERT_CMD_LINE_SINGLE`: UInt = 256u;
public const val `PLAL_ALERT_CMD_LINE_U_TEXT`: UInt = 16384u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLA_CABEXTRACT_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public const val `PLA_CAPABILITY_AUTOLOGGER`: UInt = 32u;
public const val `PLA_CAPABILITY_LEGACY_SESSION`: UInt = 8u;
public const val `PLA_CAPABILITY_LEGACY_SVC`: UInt = 16u;
public const val `PLA_CAPABILITY_LOCAL`: UInt = 268435456u;
public const val `PLA_CAPABILITY_V1_SESSION`: UInt = 2u;
public const val `PLA_CAPABILITY_V1_SVC`: UInt = 1u;
public const val `PLA_CAPABILITY_V1_SYSTEM`: UInt = 4u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PM_CLOSE_PROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PM_COLLECT_PROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PM_OPEN_PROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`) -> UInt>>>;
public typealias `PerfCounterDataType` = Int;
public typealias `PerfRegInfoType` = Int;
public typealias `REAL_TIME_DATA_SOURCE_ID_FLAGS` = UInt;
public typealias `ReportValueTypeConstants` = Int;
public typealias `ResourcePolicy` = Int;
// UNSUPPORTED Rust 1152:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const S_PDH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x04d66358_c4a1_419b_8023_23b73902de2c);

// UNSUPPORTED Rust 1153:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ServerDataCollectorSet: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837531_098b_11d8_9414_505054503030);

// UNSUPPORTED Rust 1154:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ServerDataCollectorSetCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837532_098b_11d8_9414_505054503030);

// UNSUPPORTED Rust 1155:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SourcePropPage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cf32aa1_7571_11d0_93c4_00aa00a3ddea);

public typealias `StreamMode` = Int;
public typealias `SysmonBatchReason` = Int;
public typealias `SysmonDataType` = Int;
public typealias `SysmonFileType` = Int;
// UNSUPPORTED Rust 1160:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SystemDataCollectorSet: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837546_098b_11d8_9414_505054503030);

// UNSUPPORTED Rust 1161:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SystemDataCollectorSetCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837547_098b_11d8_9414_505054503030);

// UNSUPPORTED Rust 1162:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SystemMonitor: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc4d2d8e0_d1dd_11ce_940f_008029004347);

// UNSUPPORTED Rust 1163:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SystemMonitor2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7f30578c_5f38_4612_acfe_6ed04c7b7af8);

// UNSUPPORTED Rust 1164:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const TraceDataProvider: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837513_098b_11d8_9414_505054503030);

// UNSUPPORTED Rust 1165:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const TraceDataProviderCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837511_098b_11d8_9414_505054503030);

// UNSUPPORTED Rust 1166:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const TraceSession: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0383751c_098b_11d8_9414_505054503030);

// UNSUPPORTED Rust 1167:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const TraceSessionCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03837530_098b_11d8_9414_505054503030);

public typealias `ValueMapType` = Int;
public const val `WINPERF_LOG_DEBUG`: UInt = 2u;
public const val `WINPERF_LOG_NONE`: UInt = 0u;
public const val `WINPERF_LOG_USER`: UInt = 1u;
public const val `WINPERF_LOG_VERBOSE`: UInt = 3u;
public typealias `WeekDays` = Int;
public const val `plaAlert`: `DataCollectorType` = 3;
public const val `plaApiTrace`: `DataCollectorType` = 4;
public const val `plaBinary`: `FileFormat` = 3;
public const val `plaBoth`: `StreamMode` = 3;
public const val `plaBuffering`: `StreamMode` = 4;
public const val `plaCommaSeparated`: `FileFormat` = 0;
public const val `plaCompiling`: `DataCollectorSetStatus` = 2;
public const val `plaComputer`: `AutoPathFormat` = 2;
public const val `plaConfiguration`: `DataCollectorType` = 2;
public const val `plaCreateCab`: `FolderActionSteps` = 1;
public const val `plaCreateHtml`: `DataManagerSteps` = 4;
public const val `plaCreateNew`: `CommitMode` = 1;
public const val `plaCreateOrModify`: `CommitMode` = 3;
public const val `plaCreateReport`: `DataManagerSteps` = 1;
public const val `plaCycle`: `ClockType` = 3;
public const val `plaDeleteCab`: `FolderActionSteps` = 8;
public const val `plaDeleteData`: `FolderActionSteps` = 2;
public const val `plaDeleteLargest`: `ResourcePolicy` = 0;
public const val `plaDeleteOldest`: `ResourcePolicy` = 1;
public const val `plaDeleteReport`: `FolderActionSteps` = 16;
public const val `plaEveryday`: `WeekDays` = 127;
public const val `plaFile`: `StreamMode` = 1;
public const val `plaFlag`: `ValueMapType` = 2;
public const val `plaFlagArray`: `ValueMapType` = 3;
public const val `plaFlushTrace`: `CommitMode` = 32;
public const val `plaFolderActions`: `DataManagerSteps` = 8;
public const val `plaFriday`: `WeekDays` = 32;
public const val `plaIndex`: `ValueMapType` = 1;
public const val `plaModify`: `CommitMode` = 2;
public const val `plaMonday`: `WeekDays` = 2;
public const val `plaMonthDayHour`: `AutoPathFormat` = 256;
public const val `plaMonthDayHourMinute`: `AutoPathFormat` = 16384;
public const val `plaNone`: `AutoPathFormat` = 0;
public const val `plaPattern`: `AutoPathFormat` = 1;
public const val `plaPending`: `DataCollectorSetStatus` = 3;
public const val `plaPerformance`: `ClockType` = 1;
public const val `plaPerformanceCounter`: `DataCollectorType` = 0;
public const val `plaRealTime`: `StreamMode` = 2;
public const val `plaResourceFreeing`: `DataManagerSteps` = 16;
public const val `plaRunOnce`: `WeekDays` = 0;
public const val `plaRunRules`: `DataManagerSteps` = 2;
public const val `plaRunning`: `DataCollectorSetStatus` = 1;
public const val `plaSaturday`: `WeekDays` = 64;
public const val `plaSendCab`: `FolderActionSteps` = 4;
public const val `plaSerialNumber`: `AutoPathFormat` = 512;
public const val `plaSql`: `FileFormat` = 2;
public const val `plaStopped`: `DataCollectorSetStatus` = 0;
public const val `plaSunday`: `WeekDays` = 1;
public const val `plaSystem`: `ClockType` = 2;
public const val `plaTabSeparated`: `FileFormat` = 1;
public const val `plaThursday`: `WeekDays` = 16;
public const val `plaTimeStamp`: `ClockType` = 0;
public const val `plaTrace`: `DataCollectorType` = 1;
public const val `plaTuesday`: `WeekDays` = 4;
public const val `plaUndefined`: `DataCollectorSetStatus` = 4;
public const val `plaUpdateRunningInstance`: `CommitMode` = 16;
public const val `plaValidateOnly`: `CommitMode` = 4096;
public const val `plaValidation`: `ValueMapType` = 4;
public const val `plaWednesday`: `WeekDays` = 8;
public const val `plaYearDayOfYear`: `AutoPathFormat` = 1024;
public const val `plaYearMonth`: `AutoPathFormat` = 2048;
public const val `plaYearMonthDay`: `AutoPathFormat` = 4096;
public const val `plaYearMonthDayHour`: `AutoPathFormat` = 8192;
public const val `sysmonAverage`: `ReportValueTypeConstants` = 2;
public const val `sysmonBatchAddCounters`: `SysmonBatchReason` = 2;
public const val `sysmonBatchAddFiles`: `SysmonBatchReason` = 1;
public const val `sysmonBatchAddFilesAutoCounters`: `SysmonBatchReason` = 3;
public const val `sysmonBatchNone`: `SysmonBatchReason` = 0;
public const val `sysmonChartArea`: `DisplayTypeConstants` = 4;
public const val `sysmonChartStackedArea`: `DisplayTypeConstants` = 5;
public const val `sysmonCurrentActivity`: `DataSourceTypeConstants` = 1;
public const val `sysmonCurrentValue`: `ReportValueTypeConstants` = 1;
public const val `sysmonDataAvg`: `SysmonDataType` = 1;
public const val `sysmonDataCount`: `SysmonDataType` = 5;
public const val `sysmonDataMax`: `SysmonDataType` = 3;
public const val `sysmonDataMin`: `SysmonDataType` = 2;
public const val `sysmonDataTime`: `SysmonDataType` = 4;
public const val `sysmonDefaultValue`: `ReportValueTypeConstants` = 0;
public const val `sysmonFileBlg`: `SysmonFileType` = 5;
public const val `sysmonFileCsv`: `SysmonFileType` = 3;
public const val `sysmonFileGif`: `SysmonFileType` = 7;
public const val `sysmonFileHtml`: `SysmonFileType` = 1;
public const val `sysmonFileReport`: `SysmonFileType` = 2;
public const val `sysmonFileRetiredBlg`: `SysmonFileType` = 6;
public const val `sysmonFileTsv`: `SysmonFileType` = 4;
public const val `sysmonHistogram`: `DisplayTypeConstants` = 2;
public const val `sysmonLineGraph`: `DisplayTypeConstants` = 1;
public const val `sysmonLogFiles`: `DataSourceTypeConstants` = 2;
public const val `sysmonMaximum`: `ReportValueTypeConstants` = 4;
public const val `sysmonMinimum`: `ReportValueTypeConstants` = 3;
public const val `sysmonNullDataSource`: `DataSourceTypeConstants` = -1;
public const val `sysmonReport`: `DisplayTypeConstants` = 3;
public const val `sysmonSqlLog`: `DataSourceTypeConstants` = 3;
