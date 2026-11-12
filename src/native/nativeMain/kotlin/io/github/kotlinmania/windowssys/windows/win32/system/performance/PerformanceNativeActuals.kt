@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.performance

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformanceBackupPerfRegistryToFileW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformanceInstallPerfDllA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformanceInstallPerfDllW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformanceLoadPerfCounterTextStringsA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformanceLoadPerfCounterTextStringsW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhAddCounterA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhAddCounterW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhAddEnglishCounterA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhAddEnglishCounterW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhBindInputDataSourceA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhBindInputDataSourceW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhBrowseCountersA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhBrowseCountersHA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhBrowseCountersHW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhBrowseCountersW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhCalculateCounterFromRawValue
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhCloseLog
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhCloseQuery
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhCollectQueryData
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhCollectQueryDataEx
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhCollectQueryDataWithTime
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhComputeCounterStatistics
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhConnectMachineA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhConnectMachineW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhCreateSQLTablesA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhCreateSQLTablesW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhEnumLogSetNamesA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhEnumLogSetNamesW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhEnumMachinesA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhEnumMachinesHA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhEnumMachinesHW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhEnumMachinesW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsHA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsHW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhEnumObjectsA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhEnumObjectsHA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhEnumObjectsHW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhEnumObjectsW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhExpandCounterPathA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhExpandCounterPathW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathHA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathHW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhFormatFromRawValue
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhGetCounterInfoA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhGetCounterInfoW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhGetCounterTimeBase
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeH
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterHA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterHW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectHA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectHW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhGetDllVersion
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhGetFormattedCounterArrayA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhGetFormattedCounterArrayW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhGetFormattedCounterValue
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhGetLogFileSize
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhGetLogSetGUID
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhGetRawCounterArrayA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhGetRawCounterArrayW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhGetRawCounterValue
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhIsRealTimeQuery
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhLookupPerfIndexByNameA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhLookupPerfIndexByNameW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhLookupPerfNameByIndexA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhLookupPerfNameByIndexW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhMakeCounterPathA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhMakeCounterPathW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhOpenLogA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhOpenLogW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhOpenQueryA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhOpenQueryH
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhOpenQueryW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhParseCounterPathA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhParseCounterPathW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhParseInstanceNameA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhParseInstanceNameW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhRemoveCounter
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhSelectDataSourceA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhSelectDataSourceW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhSetCounterScaleFactor
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhSetDefaultRealTimeDataSource
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhSetLogSetRunID
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhSetQueryTimeRange
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhUpdateLogA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhUpdateLogFileCatalog
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhUpdateLogW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhValidatePathA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhValidatePathExA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhValidatePathExW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhValidatePathW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhVerifySQLDBA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePdhVerifySQLDBW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePerfAddCounters
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePerfCloseQueryHandle
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePerfCreateInstance
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePerfDecrementULongCounterValue
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePerfDecrementULongLongCounterValue
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePerfDeleteCounters
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePerfDeleteInstance
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePerfEnumerateCounterSet
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePerfEnumerateCounterSetInstances
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePerfIncrementULongCounterValue
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePerfIncrementULongLongCounterValue
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePerfOpenQueryHandle
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePerfQueryCounterData
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePerfQueryCounterInfo
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePerfQueryCounterSetRegistrationInfo
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePerfQueryInstance
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePerfSetCounterRefValue
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePerfSetCounterSetInfo
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePerfSetULongCounterValue
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePerfSetULongLongCounterValue
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePerfStartProvider
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePerfStartProviderEx
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformancePerfStopProvider
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformanceQueryPerformanceCounter
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformanceQueryPerformanceFrequency
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformanceRestorePerfRegistryFromFileW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformanceSetServiceAsTrustedA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformanceSetServiceAsTrustedW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformanceUnloadPerfCounterTextStringsA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformanceUnloadPerfCounterTextStringsW
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformanceUpdatePerfNameFilesA
import io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssysWindowsWin32SystemPerformanceUpdatePerfNameFilesW
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun backupPerfRegistryToFileW(szfilename: Pcwstr, szcommentstring: Pcwstr): UInt =
    windowssysWindowsWin32SystemPerformanceBackupPerfRegistryToFileW(szfilename.rawAddress.toCPointer<ByteVar>(), szcommentstring.rawAddress.toCPointer<ByteVar>())

public actual fun installPerfDllA(szcomputername: Pcstr, lpinifile: Pcstr, dwflags: ULong): UInt =
    windowssysWindowsWin32SystemPerformanceInstallPerfDllA(szcomputername.rawAddress.toCPointer<ByteVar>(), lpinifile.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun installPerfDllW(szcomputername: Pcwstr, lpinifile: Pcwstr, dwflags: ULong): UInt =
    windowssysWindowsWin32SystemPerformanceInstallPerfDllW(szcomputername.rawAddress.toCPointer<ByteVar>(), lpinifile.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun loadPerfCounterTextStringsA(lpcommandline: Pcstr, bquietmodearg: Bool): UInt =
    windowssysWindowsWin32SystemPerformanceLoadPerfCounterTextStringsA(lpcommandline.rawAddress.toCPointer<ByteVar>(), bquietmodearg)

public actual fun loadPerfCounterTextStringsW(lpcommandline: Pcwstr, bquietmodearg: Bool): UInt =
    windowssysWindowsWin32SystemPerformanceLoadPerfCounterTextStringsW(lpcommandline.rawAddress.toCPointer<ByteVar>(), bquietmodearg)

public actual fun pdhAddCounterA(hquery: PdhHquery, szfullcounterpath: Pcstr, dwuserdata: ULong, phcounter: MutPtr<PdhHcounter>): UInt =
    windowssysWindowsWin32SystemPerformancePdhAddCounterA(hquery.rawAddress.toCPointer<ByteVar>(), szfullcounterpath.rawAddress.toCPointer<ByteVar>(), dwuserdata, phcounter.rawAddress.toCPointer<ByteVar>())

public actual fun pdhAddCounterW(hquery: PdhHquery, szfullcounterpath: Pcwstr, dwuserdata: ULong, phcounter: MutPtr<PdhHcounter>): UInt =
    windowssysWindowsWin32SystemPerformancePdhAddCounterW(hquery.rawAddress.toCPointer<ByteVar>(), szfullcounterpath.rawAddress.toCPointer<ByteVar>(), dwuserdata, phcounter.rawAddress.toCPointer<ByteVar>())

public actual fun pdhAddEnglishCounterA(hquery: PdhHquery, szfullcounterpath: Pcstr, dwuserdata: ULong, phcounter: MutPtr<PdhHcounter>): UInt =
    windowssysWindowsWin32SystemPerformancePdhAddEnglishCounterA(hquery.rawAddress.toCPointer<ByteVar>(), szfullcounterpath.rawAddress.toCPointer<ByteVar>(), dwuserdata, phcounter.rawAddress.toCPointer<ByteVar>())

public actual fun pdhAddEnglishCounterW(hquery: PdhHquery, szfullcounterpath: Pcwstr, dwuserdata: ULong, phcounter: MutPtr<PdhHcounter>): UInt =
    windowssysWindowsWin32SystemPerformancePdhAddEnglishCounterW(hquery.rawAddress.toCPointer<ByteVar>(), szfullcounterpath.rawAddress.toCPointer<ByteVar>(), dwuserdata, phcounter.rawAddress.toCPointer<ByteVar>())

public actual fun pdhBindInputDataSourceA(phdatasource: MutPtr<PdhHlog>, logfilenamelist: Pcstr): UInt =
    windowssysWindowsWin32SystemPerformancePdhBindInputDataSourceA(phdatasource.rawAddress.toCPointer<ByteVar>(), logfilenamelist.rawAddress.toCPointer<ByteVar>())

public actual fun pdhBindInputDataSourceW(phdatasource: MutPtr<PdhHlog>, logfilenamelist: Pcwstr): UInt =
    windowssysWindowsWin32SystemPerformancePdhBindInputDataSourceW(phdatasource.rawAddress.toCPointer<ByteVar>(), logfilenamelist.rawAddress.toCPointer<ByteVar>())

public actual fun pdhBrowseCountersA(pbrowsedlgdata: ConstPtr<PdhBrowseDlgConfigA>): UInt =
    windowssysWindowsWin32SystemPerformancePdhBrowseCountersA(pbrowsedlgdata.rawAddress.toCPointer<ByteVar>())

public actual fun pdhBrowseCountersHA(pbrowsedlgdata: ConstPtr<PdhBrowseDlgConfigHa>): UInt =
    windowssysWindowsWin32SystemPerformancePdhBrowseCountersHA(pbrowsedlgdata.rawAddress.toCPointer<ByteVar>())

public actual fun pdhBrowseCountersHW(pbrowsedlgdata: ConstPtr<PdhBrowseDlgConfigHw>): UInt =
    windowssysWindowsWin32SystemPerformancePdhBrowseCountersHW(pbrowsedlgdata.rawAddress.toCPointer<ByteVar>())

public actual fun pdhBrowseCountersW(pbrowsedlgdata: ConstPtr<PdhBrowseDlgConfigW>): UInt =
    windowssysWindowsWin32SystemPerformancePdhBrowseCountersW(pbrowsedlgdata.rawAddress.toCPointer<ByteVar>())

public actual fun pdhCalculateCounterFromRawValue(hcounter: PdhHcounter, dwformat: PdhFmt, rawvalue1: ConstPtr<PdhRawCounter>, rawvalue2: ConstPtr<PdhRawCounter>, fmtvalue: MutPtr<PdhFmtCountervalue>): UInt =
    windowssysWindowsWin32SystemPerformancePdhCalculateCounterFromRawValue(hcounter.rawAddress.toCPointer<ByteVar>(), dwformat, rawvalue1.rawAddress.toCPointer<ByteVar>(), rawvalue2.rawAddress.toCPointer<ByteVar>(), fmtvalue.rawAddress.toCPointer<ByteVar>())

public actual fun pdhCloseLog(hlog: PdhHlog, dwflags: UInt): UInt =
    windowssysWindowsWin32SystemPerformancePdhCloseLog(hlog.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun pdhCloseQuery(hquery: PdhHquery): UInt =
    windowssysWindowsWin32SystemPerformancePdhCloseQuery(hquery.rawAddress.toCPointer<ByteVar>())

public actual fun pdhCollectQueryData(hquery: PdhHquery): UInt =
    windowssysWindowsWin32SystemPerformancePdhCollectQueryData(hquery.rawAddress.toCPointer<ByteVar>())

public actual fun pdhCollectQueryDataEx(hquery: PdhHquery, dwintervaltime: UInt, hnewdataevent: Handle): UInt =
    windowssysWindowsWin32SystemPerformancePdhCollectQueryDataEx(hquery.rawAddress.toCPointer<ByteVar>(), dwintervaltime, hnewdataevent.rawAddress.toCPointer<ByteVar>())

public actual fun pdhCollectQueryDataWithTime(hquery: PdhHquery, plltimestamp: MutPtr<Long>): UInt =
    windowssysWindowsWin32SystemPerformancePdhCollectQueryDataWithTime(hquery.rawAddress.toCPointer<ByteVar>(), plltimestamp.rawAddress.toCPointer<ByteVar>())

public actual fun pdhComputeCounterStatistics(hcounter: PdhHcounter, dwformat: PdhFmt, dwfirstentry: UInt, dwnumentries: UInt, lprawvaluearray: ConstPtr<PdhRawCounter>, data: MutPtr<PdhStatistics>): UInt =
    windowssysWindowsWin32SystemPerformancePdhComputeCounterStatistics(hcounter.rawAddress.toCPointer<ByteVar>(), dwformat, dwfirstentry, dwnumentries, lprawvaluearray.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>())

public actual fun pdhConnectMachineA(szmachinename: Pcstr): UInt =
    windowssysWindowsWin32SystemPerformancePdhConnectMachineA(szmachinename.rawAddress.toCPointer<ByteVar>())

public actual fun pdhConnectMachineW(szmachinename: Pcwstr): UInt =
    windowssysWindowsWin32SystemPerformancePdhConnectMachineW(szmachinename.rawAddress.toCPointer<ByteVar>())

public actual fun pdhCreateSQLTablesA(szdatasource: Pcstr): UInt =
    windowssysWindowsWin32SystemPerformancePdhCreateSQLTablesA(szdatasource.rawAddress.toCPointer<ByteVar>())

public actual fun pdhCreateSQLTablesW(szdatasource: Pcwstr): UInt =
    windowssysWindowsWin32SystemPerformancePdhCreateSQLTablesW(szdatasource.rawAddress.toCPointer<ByteVar>())

public actual fun pdhEnumLogSetNamesA(szdatasource: Pcstr, mszdatasetnamelist: Pstr, pcchbufferlength: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePdhEnumLogSetNamesA(szdatasource.rawAddress.toCPointer<ByteVar>(), mszdatasetnamelist.rawAddress.toCPointer<ByteVar>(), pcchbufferlength.rawAddress.toCPointer<ByteVar>())

public actual fun pdhEnumLogSetNamesW(szdatasource: Pcwstr, mszdatasetnamelist: Pwstr, pcchbufferlength: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePdhEnumLogSetNamesW(szdatasource.rawAddress.toCPointer<ByteVar>(), mszdatasetnamelist.rawAddress.toCPointer<ByteVar>(), pcchbufferlength.rawAddress.toCPointer<ByteVar>())

public actual fun pdhEnumMachinesA(szdatasource: Pcstr, mszmachinelist: Pstr, pcchbuffersize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePdhEnumMachinesA(szdatasource.rawAddress.toCPointer<ByteVar>(), mszmachinelist.rawAddress.toCPointer<ByteVar>(), pcchbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun pdhEnumMachinesHA(hdatasource: PdhHlog, mszmachinelist: Pstr, pcchbuffersize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePdhEnumMachinesHA(hdatasource.rawAddress.toCPointer<ByteVar>(), mszmachinelist.rawAddress.toCPointer<ByteVar>(), pcchbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun pdhEnumMachinesHW(hdatasource: PdhHlog, mszmachinelist: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePdhEnumMachinesHW(hdatasource.rawAddress.toCPointer<ByteVar>(), mszmachinelist.rawAddress.toCPointer<ByteVar>(), pcchbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun pdhEnumMachinesW(szdatasource: Pcwstr, mszmachinelist: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePdhEnumMachinesW(szdatasource.rawAddress.toCPointer<ByteVar>(), mszmachinelist.rawAddress.toCPointer<ByteVar>(), pcchbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun pdhEnumObjectItemsA(szdatasource: Pcstr, szmachinename: Pcstr, szobjectname: Pcstr, mszcounterlist: Pstr, pcchcounterlistlength: MutPtr<UInt>, mszinstancelist: Pstr, pcchinstancelistlength: MutPtr<UInt>, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsA(szdatasource.rawAddress.toCPointer<ByteVar>(), szmachinename.rawAddress.toCPointer<ByteVar>(), szobjectname.rawAddress.toCPointer<ByteVar>(), mszcounterlist.rawAddress.toCPointer<ByteVar>(), pcchcounterlistlength.rawAddress.toCPointer<ByteVar>(), mszinstancelist.rawAddress.toCPointer<ByteVar>(), pcchinstancelistlength.rawAddress.toCPointer<ByteVar>(), dwdetaillevel, dwflags)

public actual fun pdhEnumObjectItemsHA(hdatasource: PdhHlog, szmachinename: Pcstr, szobjectname: Pcstr, mszcounterlist: Pstr, pcchcounterlistlength: MutPtr<UInt>, mszinstancelist: Pstr, pcchinstancelistlength: MutPtr<UInt>, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsHA(hdatasource.rawAddress.toCPointer<ByteVar>(), szmachinename.rawAddress.toCPointer<ByteVar>(), szobjectname.rawAddress.toCPointer<ByteVar>(), mszcounterlist.rawAddress.toCPointer<ByteVar>(), pcchcounterlistlength.rawAddress.toCPointer<ByteVar>(), mszinstancelist.rawAddress.toCPointer<ByteVar>(), pcchinstancelistlength.rawAddress.toCPointer<ByteVar>(), dwdetaillevel, dwflags)

public actual fun pdhEnumObjectItemsHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szobjectname: Pcwstr, mszcounterlist: Pwstr, pcchcounterlistlength: MutPtr<UInt>, mszinstancelist: Pwstr, pcchinstancelistlength: MutPtr<UInt>, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsHW(hdatasource.rawAddress.toCPointer<ByteVar>(), szmachinename.rawAddress.toCPointer<ByteVar>(), szobjectname.rawAddress.toCPointer<ByteVar>(), mszcounterlist.rawAddress.toCPointer<ByteVar>(), pcchcounterlistlength.rawAddress.toCPointer<ByteVar>(), mszinstancelist.rawAddress.toCPointer<ByteVar>(), pcchinstancelistlength.rawAddress.toCPointer<ByteVar>(), dwdetaillevel, dwflags)

public actual fun pdhEnumObjectItemsW(szdatasource: Pcwstr, szmachinename: Pcwstr, szobjectname: Pcwstr, mszcounterlist: Pwstr, pcchcounterlistlength: MutPtr<UInt>, mszinstancelist: Pwstr, pcchinstancelistlength: MutPtr<UInt>, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsW(szdatasource.rawAddress.toCPointer<ByteVar>(), szmachinename.rawAddress.toCPointer<ByteVar>(), szobjectname.rawAddress.toCPointer<ByteVar>(), mszcounterlist.rawAddress.toCPointer<ByteVar>(), pcchcounterlistlength.rawAddress.toCPointer<ByteVar>(), mszinstancelist.rawAddress.toCPointer<ByteVar>(), pcchinstancelistlength.rawAddress.toCPointer<ByteVar>(), dwdetaillevel, dwflags)

public actual fun pdhEnumObjectsA(szdatasource: Pcstr, szmachinename: Pcstr, mszobjectlist: Pstr, pcchbuffersize: MutPtr<UInt>, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    windowssysWindowsWin32SystemPerformancePdhEnumObjectsA(szdatasource.rawAddress.toCPointer<ByteVar>(), szmachinename.rawAddress.toCPointer<ByteVar>(), mszobjectlist.rawAddress.toCPointer<ByteVar>(), pcchbuffersize.rawAddress.toCPointer<ByteVar>(), dwdetaillevel, brefresh)

public actual fun pdhEnumObjectsHA(hdatasource: PdhHlog, szmachinename: Pcstr, mszobjectlist: Pstr, pcchbuffersize: MutPtr<UInt>, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    windowssysWindowsWin32SystemPerformancePdhEnumObjectsHA(hdatasource.rawAddress.toCPointer<ByteVar>(), szmachinename.rawAddress.toCPointer<ByteVar>(), mszobjectlist.rawAddress.toCPointer<ByteVar>(), pcchbuffersize.rawAddress.toCPointer<ByteVar>(), dwdetaillevel, brefresh)

public actual fun pdhEnumObjectsHW(hdatasource: PdhHlog, szmachinename: Pcwstr, mszobjectlist: Pwstr, pcchbuffersize: MutPtr<UInt>, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    windowssysWindowsWin32SystemPerformancePdhEnumObjectsHW(hdatasource.rawAddress.toCPointer<ByteVar>(), szmachinename.rawAddress.toCPointer<ByteVar>(), mszobjectlist.rawAddress.toCPointer<ByteVar>(), pcchbuffersize.rawAddress.toCPointer<ByteVar>(), dwdetaillevel, brefresh)

public actual fun pdhEnumObjectsW(szdatasource: Pcwstr, szmachinename: Pcwstr, mszobjectlist: Pwstr, pcchbuffersize: MutPtr<UInt>, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    windowssysWindowsWin32SystemPerformancePdhEnumObjectsW(szdatasource.rawAddress.toCPointer<ByteVar>(), szmachinename.rawAddress.toCPointer<ByteVar>(), mszobjectlist.rawAddress.toCPointer<ByteVar>(), pcchbuffersize.rawAddress.toCPointer<ByteVar>(), dwdetaillevel, brefresh)

public actual fun pdhExpandCounterPathA(szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePdhExpandCounterPathA(szwildcardpath.rawAddress.toCPointer<ByteVar>(), mszexpandedpathlist.rawAddress.toCPointer<ByteVar>(), pcchpathlistlength.rawAddress.toCPointer<ByteVar>())

public actual fun pdhExpandCounterPathW(szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePdhExpandCounterPathW(szwildcardpath.rawAddress.toCPointer<ByteVar>(), mszexpandedpathlist.rawAddress.toCPointer<ByteVar>(), pcchpathlistlength.rawAddress.toCPointer<ByteVar>())

public actual fun pdhExpandWildCardPathA(szdatasource: Pcstr, szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: MutPtr<UInt>, dwflags: UInt): UInt =
    windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathA(szdatasource.rawAddress.toCPointer<ByteVar>(), szwildcardpath.rawAddress.toCPointer<ByteVar>(), mszexpandedpathlist.rawAddress.toCPointer<ByteVar>(), pcchpathlistlength.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun pdhExpandWildCardPathHA(hdatasource: PdhHlog, szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: MutPtr<UInt>, dwflags: UInt): UInt =
    windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathHA(hdatasource.rawAddress.toCPointer<ByteVar>(), szwildcardpath.rawAddress.toCPointer<ByteVar>(), mszexpandedpathlist.rawAddress.toCPointer<ByteVar>(), pcchpathlistlength.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun pdhExpandWildCardPathHW(hdatasource: PdhHlog, szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: MutPtr<UInt>, dwflags: UInt): UInt =
    windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathHW(hdatasource.rawAddress.toCPointer<ByteVar>(), szwildcardpath.rawAddress.toCPointer<ByteVar>(), mszexpandedpathlist.rawAddress.toCPointer<ByteVar>(), pcchpathlistlength.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun pdhExpandWildCardPathW(szdatasource: Pcwstr, szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: MutPtr<UInt>, dwflags: UInt): UInt =
    windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathW(szdatasource.rawAddress.toCPointer<ByteVar>(), szwildcardpath.rawAddress.toCPointer<ByteVar>(), mszexpandedpathlist.rawAddress.toCPointer<ByteVar>(), pcchpathlistlength.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun pdhFormatFromRawValue(dwcountertype: UInt, dwformat: PdhFmt, ptimebase: ConstPtr<Long>, prawvalue1: ConstPtr<PdhRawCounter>, prawvalue2: ConstPtr<PdhRawCounter>, pfmtvalue: MutPtr<PdhFmtCountervalue>): UInt =
    windowssysWindowsWin32SystemPerformancePdhFormatFromRawValue(dwcountertype, dwformat, ptimebase.rawAddress.toCPointer<ByteVar>(), prawvalue1.rawAddress.toCPointer<ByteVar>(), prawvalue2.rawAddress.toCPointer<ByteVar>(), pfmtvalue.rawAddress.toCPointer<ByteVar>())

public actual fun pdhGetCounterInfoA(hcounter: PdhHcounter, bretrieveexplaintext: Boolean, pdwbuffersize: MutPtr<UInt>, lpbuffer: MutPtr<PdhCounterInfoA>): UInt =
    windowssysWindowsWin32SystemPerformancePdhGetCounterInfoA(hcounter.rawAddress.toCPointer<ByteVar>(), bretrieveexplaintext, pdwbuffersize.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun pdhGetCounterInfoW(hcounter: PdhHcounter, bretrieveexplaintext: Boolean, pdwbuffersize: MutPtr<UInt>, lpbuffer: MutPtr<PdhCounterInfoW>): UInt =
    windowssysWindowsWin32SystemPerformancePdhGetCounterInfoW(hcounter.rawAddress.toCPointer<ByteVar>(), bretrieveexplaintext, pdwbuffersize.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun pdhGetCounterTimeBase(hcounter: PdhHcounter, ptimebase: MutPtr<Long>): UInt =
    windowssysWindowsWin32SystemPerformancePdhGetCounterTimeBase(hcounter.rawAddress.toCPointer<ByteVar>(), ptimebase.rawAddress.toCPointer<ByteVar>())

public actual fun pdhGetDataSourceTimeRangeA(szdatasource: Pcstr, pdwnumentries: MutPtr<UInt>, pinfo: MutPtr<PdhTimeInfo>, pdwbuffersize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeA(szdatasource.rawAddress.toCPointer<ByteVar>(), pdwnumentries.rawAddress.toCPointer<ByteVar>(), pinfo.rawAddress.toCPointer<ByteVar>(), pdwbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun pdhGetDataSourceTimeRangeH(hdatasource: PdhHlog, pdwnumentries: MutPtr<UInt>, pinfo: MutPtr<PdhTimeInfo>, pdwbuffersize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeH(hdatasource.rawAddress.toCPointer<ByteVar>(), pdwnumentries.rawAddress.toCPointer<ByteVar>(), pinfo.rawAddress.toCPointer<ByteVar>(), pdwbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun pdhGetDataSourceTimeRangeW(szdatasource: Pcwstr, pdwnumentries: MutPtr<UInt>, pinfo: MutPtr<PdhTimeInfo>, pdwbuffersize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeW(szdatasource.rawAddress.toCPointer<ByteVar>(), pdwnumentries.rawAddress.toCPointer<ByteVar>(), pinfo.rawAddress.toCPointer<ByteVar>(), pdwbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun pdhGetDefaultPerfCounterA(szdatasource: Pcstr, szmachinename: Pcstr, szobjectname: Pcstr, szdefaultcountername: Pstr, pcchbuffersize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterA(szdatasource.rawAddress.toCPointer<ByteVar>(), szmachinename.rawAddress.toCPointer<ByteVar>(), szobjectname.rawAddress.toCPointer<ByteVar>(), szdefaultcountername.rawAddress.toCPointer<ByteVar>(), pcchbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun pdhGetDefaultPerfCounterHA(hdatasource: PdhHlog, szmachinename: Pcstr, szobjectname: Pcstr, szdefaultcountername: Pstr, pcchbuffersize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterHA(hdatasource.rawAddress.toCPointer<ByteVar>(), szmachinename.rawAddress.toCPointer<ByteVar>(), szobjectname.rawAddress.toCPointer<ByteVar>(), szdefaultcountername.rawAddress.toCPointer<ByteVar>(), pcchbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun pdhGetDefaultPerfCounterHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szobjectname: Pcwstr, szdefaultcountername: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterHW(hdatasource.rawAddress.toCPointer<ByteVar>(), szmachinename.rawAddress.toCPointer<ByteVar>(), szobjectname.rawAddress.toCPointer<ByteVar>(), szdefaultcountername.rawAddress.toCPointer<ByteVar>(), pcchbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun pdhGetDefaultPerfCounterW(szdatasource: Pcwstr, szmachinename: Pcwstr, szobjectname: Pcwstr, szdefaultcountername: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterW(szdatasource.rawAddress.toCPointer<ByteVar>(), szmachinename.rawAddress.toCPointer<ByteVar>(), szobjectname.rawAddress.toCPointer<ByteVar>(), szdefaultcountername.rawAddress.toCPointer<ByteVar>(), pcchbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun pdhGetDefaultPerfObjectA(szdatasource: Pcstr, szmachinename: Pcstr, szdefaultobjectname: Pstr, pcchbuffersize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectA(szdatasource.rawAddress.toCPointer<ByteVar>(), szmachinename.rawAddress.toCPointer<ByteVar>(), szdefaultobjectname.rawAddress.toCPointer<ByteVar>(), pcchbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun pdhGetDefaultPerfObjectHA(hdatasource: PdhHlog, szmachinename: Pcstr, szdefaultobjectname: Pstr, pcchbuffersize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectHA(hdatasource.rawAddress.toCPointer<ByteVar>(), szmachinename.rawAddress.toCPointer<ByteVar>(), szdefaultobjectname.rawAddress.toCPointer<ByteVar>(), pcchbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun pdhGetDefaultPerfObjectHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szdefaultobjectname: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectHW(hdatasource.rawAddress.toCPointer<ByteVar>(), szmachinename.rawAddress.toCPointer<ByteVar>(), szdefaultobjectname.rawAddress.toCPointer<ByteVar>(), pcchbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun pdhGetDefaultPerfObjectW(szdatasource: Pcwstr, szmachinename: Pcwstr, szdefaultobjectname: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectW(szdatasource.rawAddress.toCPointer<ByteVar>(), szmachinename.rawAddress.toCPointer<ByteVar>(), szdefaultobjectname.rawAddress.toCPointer<ByteVar>(), pcchbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun pdhGetDllVersion(lpdwversion: MutPtr<PdhDllVersion>): UInt =
    windowssysWindowsWin32SystemPerformancePdhGetDllVersion(lpdwversion.rawAddress.toCPointer<ByteVar>())

public actual fun pdhGetFormattedCounterArrayA(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwbuffersize: MutPtr<UInt>, lpdwitemcount: MutPtr<UInt>, itembuffer: MutPtr<PdhFmtCountervalueItemA>): UInt =
    windowssysWindowsWin32SystemPerformancePdhGetFormattedCounterArrayA(hcounter.rawAddress.toCPointer<ByteVar>(), dwformat, lpdwbuffersize.rawAddress.toCPointer<ByteVar>(), lpdwitemcount.rawAddress.toCPointer<ByteVar>(), itembuffer.rawAddress.toCPointer<ByteVar>())

public actual fun pdhGetFormattedCounterArrayW(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwbuffersize: MutPtr<UInt>, lpdwitemcount: MutPtr<UInt>, itembuffer: MutPtr<PdhFmtCountervalueItemW>): UInt =
    windowssysWindowsWin32SystemPerformancePdhGetFormattedCounterArrayW(hcounter.rawAddress.toCPointer<ByteVar>(), dwformat, lpdwbuffersize.rawAddress.toCPointer<ByteVar>(), lpdwitemcount.rawAddress.toCPointer<ByteVar>(), itembuffer.rawAddress.toCPointer<ByteVar>())

public actual fun pdhGetFormattedCounterValue(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwtype: MutPtr<UInt>, pvalue: MutPtr<PdhFmtCountervalue>): UInt =
    windowssysWindowsWin32SystemPerformancePdhGetFormattedCounterValue(hcounter.rawAddress.toCPointer<ByteVar>(), dwformat, lpdwtype.rawAddress.toCPointer<ByteVar>(), pvalue.rawAddress.toCPointer<ByteVar>())

public actual fun pdhGetLogFileSize(hlog: PdhHlog, llsize: MutPtr<Long>): UInt =
    windowssysWindowsWin32SystemPerformancePdhGetLogFileSize(hlog.rawAddress.toCPointer<ByteVar>(), llsize.rawAddress.toCPointer<ByteVar>())

public actual fun pdhGetLogSetGUID(hlog: PdhHlog, pguid: MutPtr<Guid>, prunid: MutPtr<Int>): UInt =
    windowssysWindowsWin32SystemPerformancePdhGetLogSetGUID(hlog.rawAddress.toCPointer<ByteVar>(), pguid.rawAddress.toCPointer<ByteVar>(), prunid.rawAddress.toCPointer<ByteVar>())

public actual fun pdhGetRawCounterArrayA(hcounter: PdhHcounter, lpdwbuffersize: MutPtr<UInt>, lpdwitemcount: MutPtr<UInt>, itembuffer: MutPtr<PdhRawCounterItemA>): UInt =
    windowssysWindowsWin32SystemPerformancePdhGetRawCounterArrayA(hcounter.rawAddress.toCPointer<ByteVar>(), lpdwbuffersize.rawAddress.toCPointer<ByteVar>(), lpdwitemcount.rawAddress.toCPointer<ByteVar>(), itembuffer.rawAddress.toCPointer<ByteVar>())

public actual fun pdhGetRawCounterArrayW(hcounter: PdhHcounter, lpdwbuffersize: MutPtr<UInt>, lpdwitemcount: MutPtr<UInt>, itembuffer: MutPtr<PdhRawCounterItemW>): UInt =
    windowssysWindowsWin32SystemPerformancePdhGetRawCounterArrayW(hcounter.rawAddress.toCPointer<ByteVar>(), lpdwbuffersize.rawAddress.toCPointer<ByteVar>(), lpdwitemcount.rawAddress.toCPointer<ByteVar>(), itembuffer.rawAddress.toCPointer<ByteVar>())

public actual fun pdhGetRawCounterValue(hcounter: PdhHcounter, lpdwtype: MutPtr<UInt>, pvalue: MutPtr<PdhRawCounter>): UInt =
    windowssysWindowsWin32SystemPerformancePdhGetRawCounterValue(hcounter.rawAddress.toCPointer<ByteVar>(), lpdwtype.rawAddress.toCPointer<ByteVar>(), pvalue.rawAddress.toCPointer<ByteVar>())

public actual fun pdhIsRealTimeQuery(hquery: PdhHquery): Bool =
    windowssysWindowsWin32SystemPerformancePdhIsRealTimeQuery(hquery.rawAddress.toCPointer<ByteVar>())

public actual fun pdhLookupPerfIndexByNameA(szmachinename: Pcstr, sznamebuffer: Pcstr, pdwindex: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePdhLookupPerfIndexByNameA(szmachinename.rawAddress.toCPointer<ByteVar>(), sznamebuffer.rawAddress.toCPointer<ByteVar>(), pdwindex.rawAddress.toCPointer<ByteVar>())

public actual fun pdhLookupPerfIndexByNameW(szmachinename: Pcwstr, sznamebuffer: Pcwstr, pdwindex: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePdhLookupPerfIndexByNameW(szmachinename.rawAddress.toCPointer<ByteVar>(), sznamebuffer.rawAddress.toCPointer<ByteVar>(), pdwindex.rawAddress.toCPointer<ByteVar>())

public actual fun pdhLookupPerfNameByIndexA(szmachinename: Pcstr, dwnameindex: UInt, sznamebuffer: Pstr, pcchnamebuffersize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePdhLookupPerfNameByIndexA(szmachinename.rawAddress.toCPointer<ByteVar>(), dwnameindex, sznamebuffer.rawAddress.toCPointer<ByteVar>(), pcchnamebuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun pdhLookupPerfNameByIndexW(szmachinename: Pcwstr, dwnameindex: UInt, sznamebuffer: Pwstr, pcchnamebuffersize: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePdhLookupPerfNameByIndexW(szmachinename.rawAddress.toCPointer<ByteVar>(), dwnameindex, sznamebuffer.rawAddress.toCPointer<ByteVar>(), pcchnamebuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun pdhMakeCounterPathA(pcounterpathelements: ConstPtr<PdhCounterPathElementsA>, szfullpathbuffer: Pstr, pcchbuffersize: MutPtr<UInt>, dwflags: PdhPathFlags): UInt =
    windowssysWindowsWin32SystemPerformancePdhMakeCounterPathA(pcounterpathelements.rawAddress.toCPointer<ByteVar>(), szfullpathbuffer.rawAddress.toCPointer<ByteVar>(), pcchbuffersize.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun pdhMakeCounterPathW(pcounterpathelements: ConstPtr<PdhCounterPathElementsW>, szfullpathbuffer: Pwstr, pcchbuffersize: MutPtr<UInt>, dwflags: PdhPathFlags): UInt =
    windowssysWindowsWin32SystemPerformancePdhMakeCounterPathW(pcounterpathelements.rawAddress.toCPointer<ByteVar>(), szfullpathbuffer.rawAddress.toCPointer<ByteVar>(), pcchbuffersize.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun pdhOpenLogA(szlogfilename: Pcstr, dwaccessflags: PdhLog, lpdwlogtype: MutPtr<PdhLogType>, hquery: PdhHquery, dwmaxsize: UInt, szusercaption: Pcstr, phlog: MutPtr<PdhHlog>): UInt =
    windowssysWindowsWin32SystemPerformancePdhOpenLogA(szlogfilename.rawAddress.toCPointer<ByteVar>(), dwaccessflags, lpdwlogtype.rawAddress.toCPointer<ByteVar>(), hquery.rawAddress.toCPointer<ByteVar>(), dwmaxsize, szusercaption.rawAddress.toCPointer<ByteVar>(), phlog.rawAddress.toCPointer<ByteVar>())

public actual fun pdhOpenLogW(szlogfilename: Pcwstr, dwaccessflags: PdhLog, lpdwlogtype: MutPtr<PdhLogType>, hquery: PdhHquery, dwmaxsize: UInt, szusercaption: Pcwstr, phlog: MutPtr<PdhHlog>): UInt =
    windowssysWindowsWin32SystemPerformancePdhOpenLogW(szlogfilename.rawAddress.toCPointer<ByteVar>(), dwaccessflags, lpdwlogtype.rawAddress.toCPointer<ByteVar>(), hquery.rawAddress.toCPointer<ByteVar>(), dwmaxsize, szusercaption.rawAddress.toCPointer<ByteVar>(), phlog.rawAddress.toCPointer<ByteVar>())

public actual fun pdhOpenQueryA(szdatasource: Pcstr, dwuserdata: ULong, phquery: MutPtr<PdhHquery>): UInt =
    windowssysWindowsWin32SystemPerformancePdhOpenQueryA(szdatasource.rawAddress.toCPointer<ByteVar>(), dwuserdata, phquery.rawAddress.toCPointer<ByteVar>())

public actual fun pdhOpenQueryH(hdatasource: PdhHlog, dwuserdata: ULong, phquery: MutPtr<PdhHquery>): UInt =
    windowssysWindowsWin32SystemPerformancePdhOpenQueryH(hdatasource.rawAddress.toCPointer<ByteVar>(), dwuserdata, phquery.rawAddress.toCPointer<ByteVar>())

public actual fun pdhOpenQueryW(szdatasource: Pcwstr, dwuserdata: ULong, phquery: MutPtr<PdhHquery>): UInt =
    windowssysWindowsWin32SystemPerformancePdhOpenQueryW(szdatasource.rawAddress.toCPointer<ByteVar>(), dwuserdata, phquery.rawAddress.toCPointer<ByteVar>())

public actual fun pdhParseCounterPathA(szfullpathbuffer: Pcstr, pcounterpathelements: MutPtr<PdhCounterPathElementsA>, pdwbuffersize: MutPtr<UInt>, dwflags: UInt): UInt =
    windowssysWindowsWin32SystemPerformancePdhParseCounterPathA(szfullpathbuffer.rawAddress.toCPointer<ByteVar>(), pcounterpathelements.rawAddress.toCPointer<ByteVar>(), pdwbuffersize.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun pdhParseCounterPathW(szfullpathbuffer: Pcwstr, pcounterpathelements: MutPtr<PdhCounterPathElementsW>, pdwbuffersize: MutPtr<UInt>, dwflags: UInt): UInt =
    windowssysWindowsWin32SystemPerformancePdhParseCounterPathW(szfullpathbuffer.rawAddress.toCPointer<ByteVar>(), pcounterpathelements.rawAddress.toCPointer<ByteVar>(), pdwbuffersize.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun pdhParseInstanceNameA(szinstancestring: Pcstr, szinstancename: Pstr, pcchinstancenamelength: MutPtr<UInt>, szparentname: Pstr, pcchparentnamelength: MutPtr<UInt>, lpindex: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePdhParseInstanceNameA(szinstancestring.rawAddress.toCPointer<ByteVar>(), szinstancename.rawAddress.toCPointer<ByteVar>(), pcchinstancenamelength.rawAddress.toCPointer<ByteVar>(), szparentname.rawAddress.toCPointer<ByteVar>(), pcchparentnamelength.rawAddress.toCPointer<ByteVar>(), lpindex.rawAddress.toCPointer<ByteVar>())

public actual fun pdhParseInstanceNameW(szinstancestring: Pcwstr, szinstancename: Pwstr, pcchinstancenamelength: MutPtr<UInt>, szparentname: Pwstr, pcchparentnamelength: MutPtr<UInt>, lpindex: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePdhParseInstanceNameW(szinstancestring.rawAddress.toCPointer<ByteVar>(), szinstancename.rawAddress.toCPointer<ByteVar>(), pcchinstancenamelength.rawAddress.toCPointer<ByteVar>(), szparentname.rawAddress.toCPointer<ByteVar>(), pcchparentnamelength.rawAddress.toCPointer<ByteVar>(), lpindex.rawAddress.toCPointer<ByteVar>())

public actual fun pdhReadRawLogRecord(hlog: PdhHlog, ftrecord: Filetime, prawlogrecord: MutPtr<PdhRawLogRecord>, pdwbufferlength: MutPtr<UInt>): UInt =
    0u

public actual fun pdhRemoveCounter(hcounter: PdhHcounter): UInt =
    windowssysWindowsWin32SystemPerformancePdhRemoveCounter(hcounter.rawAddress.toCPointer<ByteVar>())

public actual fun pdhSelectDataSourceA(hwndowner: Hwnd, dwflags: PdhSelectDataSourceFlags, szdatasource: Pstr, pcchbufferlength: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePdhSelectDataSourceA(hwndowner.rawAddress.toCPointer<ByteVar>(), dwflags, szdatasource.rawAddress.toCPointer<ByteVar>(), pcchbufferlength.rawAddress.toCPointer<ByteVar>())

public actual fun pdhSelectDataSourceW(hwndowner: Hwnd, dwflags: PdhSelectDataSourceFlags, szdatasource: Pwstr, pcchbufferlength: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePdhSelectDataSourceW(hwndowner.rawAddress.toCPointer<ByteVar>(), dwflags, szdatasource.rawAddress.toCPointer<ByteVar>(), pcchbufferlength.rawAddress.toCPointer<ByteVar>())

public actual fun pdhSetCounterScaleFactor(hcounter: PdhHcounter, lfactor: Int): UInt =
    windowssysWindowsWin32SystemPerformancePdhSetCounterScaleFactor(hcounter.rawAddress.toCPointer<ByteVar>(), lfactor)

public actual fun pdhSetDefaultRealTimeDataSource(dwdatasourceid: RealTimeDataSourceIdFlags): UInt =
    windowssysWindowsWin32SystemPerformancePdhSetDefaultRealTimeDataSource(dwdatasourceid)

public actual fun pdhSetLogSetRunID(hlog: PdhHlog, runid: Int): UInt =
    windowssysWindowsWin32SystemPerformancePdhSetLogSetRunID(hlog.rawAddress.toCPointer<ByteVar>(), runid)

public actual fun pdhSetQueryTimeRange(hquery: PdhHquery, pinfo: ConstPtr<PdhTimeInfo>): UInt =
    windowssysWindowsWin32SystemPerformancePdhSetQueryTimeRange(hquery.rawAddress.toCPointer<ByteVar>(), pinfo.rawAddress.toCPointer<ByteVar>())

public actual fun pdhUpdateLogA(hlog: PdhHlog, szuserstring: Pcstr): UInt =
    windowssysWindowsWin32SystemPerformancePdhUpdateLogA(hlog.rawAddress.toCPointer<ByteVar>(), szuserstring.rawAddress.toCPointer<ByteVar>())

public actual fun pdhUpdateLogFileCatalog(hlog: PdhHlog): UInt =
    windowssysWindowsWin32SystemPerformancePdhUpdateLogFileCatalog(hlog.rawAddress.toCPointer<ByteVar>())

public actual fun pdhUpdateLogW(hlog: PdhHlog, szuserstring: Pcwstr): UInt =
    windowssysWindowsWin32SystemPerformancePdhUpdateLogW(hlog.rawAddress.toCPointer<ByteVar>(), szuserstring.rawAddress.toCPointer<ByteVar>())

public actual fun pdhValidatePathA(szfullpathbuffer: Pcstr): UInt =
    windowssysWindowsWin32SystemPerformancePdhValidatePathA(szfullpathbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun pdhValidatePathExA(hdatasource: PdhHlog, szfullpathbuffer: Pcstr): UInt =
    windowssysWindowsWin32SystemPerformancePdhValidatePathExA(hdatasource.rawAddress.toCPointer<ByteVar>(), szfullpathbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun pdhValidatePathExW(hdatasource: PdhHlog, szfullpathbuffer: Pcwstr): UInt =
    windowssysWindowsWin32SystemPerformancePdhValidatePathExW(hdatasource.rawAddress.toCPointer<ByteVar>(), szfullpathbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun pdhValidatePathW(szfullpathbuffer: Pcwstr): UInt =
    windowssysWindowsWin32SystemPerformancePdhValidatePathW(szfullpathbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun pdhVerifySQLDBA(szdatasource: Pcstr): UInt =
    windowssysWindowsWin32SystemPerformancePdhVerifySQLDBA(szdatasource.rawAddress.toCPointer<ByteVar>())

public actual fun pdhVerifySQLDBW(szdatasource: Pcwstr): UInt =
    windowssysWindowsWin32SystemPerformancePdhVerifySQLDBW(szdatasource.rawAddress.toCPointer<ByteVar>())

public actual fun perfAddCounters(hquery: Handle, pcounters: MutPtr<PerfCounterIdentifier>, cbcounters: UInt): UInt =
    windowssysWindowsWin32SystemPerformancePerfAddCounters(hquery.rawAddress.toCPointer<ByteVar>(), pcounters.rawAddress.toCPointer<ByteVar>(), cbcounters)

public actual fun perfCloseQueryHandle(hquery: Handle): UInt =
    windowssysWindowsWin32SystemPerformancePerfCloseQueryHandle(hquery.rawAddress.toCPointer<ByteVar>())

public actual fun perfCreateInstance(providerhandle: Handle, countersetguid: ConstPtr<Guid>, name: Pcwstr, id: UInt): MutPtr<PerfCountersetInstance> =
    MutPtr(windowssysWindowsWin32SystemPerformancePerfCreateInstance(providerhandle.rawAddress.toCPointer<ByteVar>(), countersetguid.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), id)?.toLong() ?: 0L)

public actual fun perfDecrementULongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: UInt): UInt =
    windowssysWindowsWin32SystemPerformancePerfDecrementULongCounterValue(provider.rawAddress.toCPointer<ByteVar>(), instance.rawAddress.toCPointer<ByteVar>(), counterid, value)

public actual fun perfDecrementULongLongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: ULong): UInt =
    windowssysWindowsWin32SystemPerformancePerfDecrementULongLongCounterValue(provider.rawAddress.toCPointer<ByteVar>(), instance.rawAddress.toCPointer<ByteVar>(), counterid, value)

public actual fun perfDeleteCounters(hquery: Handle, pcounters: MutPtr<PerfCounterIdentifier>, cbcounters: UInt): UInt =
    windowssysWindowsWin32SystemPerformancePerfDeleteCounters(hquery.rawAddress.toCPointer<ByteVar>(), pcounters.rawAddress.toCPointer<ByteVar>(), cbcounters)

public actual fun perfDeleteInstance(provider: Handle, instanceblock: ConstPtr<PerfCountersetInstance>): UInt =
    windowssysWindowsWin32SystemPerformancePerfDeleteInstance(provider.rawAddress.toCPointer<ByteVar>(), instanceblock.rawAddress.toCPointer<ByteVar>())

public actual fun perfEnumerateCounterSet(szmachine: Pcwstr, pcountersetids: MutPtr<Guid>, ccountersetids: UInt, pccountersetidsactual: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePerfEnumerateCounterSet(szmachine.rawAddress.toCPointer<ByteVar>(), pcountersetids.rawAddress.toCPointer<ByteVar>(), ccountersetids, pccountersetidsactual.rawAddress.toCPointer<ByteVar>())

public actual fun perfEnumerateCounterSetInstances(szmachine: Pcwstr, pcountersetid: ConstPtr<Guid>, pinstances: MutPtr<PerfInstanceHeader>, cbinstances: UInt, pcbinstancesactual: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePerfEnumerateCounterSetInstances(szmachine.rawAddress.toCPointer<ByteVar>(), pcountersetid.rawAddress.toCPointer<ByteVar>(), pinstances.rawAddress.toCPointer<ByteVar>(), cbinstances, pcbinstancesactual.rawAddress.toCPointer<ByteVar>())

public actual fun perfIncrementULongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: UInt): UInt =
    windowssysWindowsWin32SystemPerformancePerfIncrementULongCounterValue(provider.rawAddress.toCPointer<ByteVar>(), instance.rawAddress.toCPointer<ByteVar>(), counterid, value)

public actual fun perfIncrementULongLongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: ULong): UInt =
    windowssysWindowsWin32SystemPerformancePerfIncrementULongLongCounterValue(provider.rawAddress.toCPointer<ByteVar>(), instance.rawAddress.toCPointer<ByteVar>(), counterid, value)

public actual fun perfOpenQueryHandle(szmachine: Pcwstr, phquery: MutPtr<Handle>): UInt =
    windowssysWindowsWin32SystemPerformancePerfOpenQueryHandle(szmachine.rawAddress.toCPointer<ByteVar>(), phquery.rawAddress.toCPointer<ByteVar>())

public actual fun perfQueryCounterData(hquery: Handle, pcounterblock: MutPtr<PerfDataHeader>, cbcounterblock: UInt, pcbcounterblockactual: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePerfQueryCounterData(hquery.rawAddress.toCPointer<ByteVar>(), pcounterblock.rawAddress.toCPointer<ByteVar>(), cbcounterblock, pcbcounterblockactual.rawAddress.toCPointer<ByteVar>())

public actual fun perfQueryCounterInfo(hquery: Handle, pcounters: MutPtr<PerfCounterIdentifier>, cbcounters: UInt, pcbcountersactual: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePerfQueryCounterInfo(hquery.rawAddress.toCPointer<ByteVar>(), pcounters.rawAddress.toCPointer<ByteVar>(), cbcounters, pcbcountersactual.rawAddress.toCPointer<ByteVar>())

public actual fun perfQueryCounterSetRegistrationInfo(szmachine: Pcwstr, pcountersetid: ConstPtr<Guid>, requestcode: PerfRegInfoType, requestlangid: UInt, pbreginfo: MutPtr<UByte>, cbreginfo: UInt, pcbreginfoactual: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemPerformancePerfQueryCounterSetRegistrationInfo(szmachine.rawAddress.toCPointer<ByteVar>(), pcountersetid.rawAddress.toCPointer<ByteVar>(), requestcode, requestlangid, pbreginfo.rawAddress.toCPointer<ByteVar>(), cbreginfo, pcbreginfoactual.rawAddress.toCPointer<ByteVar>())

public actual fun perfQueryInstance(providerhandle: Handle, countersetguid: ConstPtr<Guid>, name: Pcwstr, id: UInt): MutPtr<PerfCountersetInstance> =
    MutPtr(windowssysWindowsWin32SystemPerformancePerfQueryInstance(providerhandle.rawAddress.toCPointer<ByteVar>(), countersetguid.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), id)?.toLong() ?: 0L)

public actual fun perfSetCounterRefValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, address: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32SystemPerformancePerfSetCounterRefValue(provider.rawAddress.toCPointer<ByteVar>(), instance.rawAddress.toCPointer<ByteVar>(), counterid, address.rawAddress.toCPointer<ByteVar>())

public actual fun perfSetCounterSetInfo(providerhandle: Handle, template: MutPtr<PerfCountersetInfo>, templatesize: UInt): UInt =
    windowssysWindowsWin32SystemPerformancePerfSetCounterSetInfo(providerhandle.rawAddress.toCPointer<ByteVar>(), template.rawAddress.toCPointer<ByteVar>(), templatesize)

public actual fun perfSetULongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: UInt): UInt =
    windowssysWindowsWin32SystemPerformancePerfSetULongCounterValue(provider.rawAddress.toCPointer<ByteVar>(), instance.rawAddress.toCPointer<ByteVar>(), counterid, value)

public actual fun perfSetULongLongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: ULong): UInt =
    windowssysWindowsWin32SystemPerformancePerfSetULongLongCounterValue(provider.rawAddress.toCPointer<ByteVar>(), instance.rawAddress.toCPointer<ByteVar>(), counterid, value)

public actual fun perfStartProvider(providerguid: ConstPtr<Guid>, controlcallback: Perflibrequest, phprovider: MutPtr<Handle>): UInt =
    windowssysWindowsWin32SystemPerformancePerfStartProvider(providerguid.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), phprovider.rawAddress.toCPointer<ByteVar>())

public actual fun perfStartProviderEx(providerguid: ConstPtr<Guid>, providercontext: ConstPtr<PerfProviderContext>, provider: MutPtr<Handle>): UInt =
    windowssysWindowsWin32SystemPerformancePerfStartProviderEx(providerguid.rawAddress.toCPointer<ByteVar>(), providercontext.rawAddress.toCPointer<ByteVar>(), provider.rawAddress.toCPointer<ByteVar>())

public actual fun perfStopProvider(providerhandle: Handle): UInt =
    windowssysWindowsWin32SystemPerformancePerfStopProvider(providerhandle.rawAddress.toCPointer<ByteVar>())

public actual fun queryPerformanceCounter(lpperformancecount: MutPtr<Long>): Bool =
    windowssysWindowsWin32SystemPerformanceQueryPerformanceCounter(lpperformancecount.rawAddress.toCPointer<ByteVar>())

public actual fun queryPerformanceFrequency(lpfrequency: MutPtr<Long>): Bool =
    windowssysWindowsWin32SystemPerformanceQueryPerformanceFrequency(lpfrequency.rawAddress.toCPointer<ByteVar>())

public actual fun restorePerfRegistryFromFileW(szfilename: Pcwstr, szlangid: Pcwstr): UInt =
    windowssysWindowsWin32SystemPerformanceRestorePerfRegistryFromFileW(szfilename.rawAddress.toCPointer<ByteVar>(), szlangid.rawAddress.toCPointer<ByteVar>())

public actual fun setServiceAsTrustedA(szreserved: Pcstr, szservicename: Pcstr): UInt =
    windowssysWindowsWin32SystemPerformanceSetServiceAsTrustedA(szreserved.rawAddress.toCPointer<ByteVar>(), szservicename.rawAddress.toCPointer<ByteVar>())

public actual fun setServiceAsTrustedW(szreserved: Pcwstr, szservicename: Pcwstr): UInt =
    windowssysWindowsWin32SystemPerformanceSetServiceAsTrustedW(szreserved.rawAddress.toCPointer<ByteVar>(), szservicename.rawAddress.toCPointer<ByteVar>())

public actual fun unloadPerfCounterTextStringsA(lpcommandline: Pcstr, bquietmodearg: Bool): UInt =
    windowssysWindowsWin32SystemPerformanceUnloadPerfCounterTextStringsA(lpcommandline.rawAddress.toCPointer<ByteVar>(), bquietmodearg)

public actual fun unloadPerfCounterTextStringsW(lpcommandline: Pcwstr, bquietmodearg: Bool): UInt =
    windowssysWindowsWin32SystemPerformanceUnloadPerfCounterTextStringsW(lpcommandline.rawAddress.toCPointer<ByteVar>(), bquietmodearg)

public actual fun updatePerfNameFilesA(sznewctrfilepath: Pcstr, sznewhlpfilepath: Pcstr, szlanguageid: Pcstr, dwflags: ULong): UInt =
    windowssysWindowsWin32SystemPerformanceUpdatePerfNameFilesA(sznewctrfilepath.rawAddress.toCPointer<ByteVar>(), sznewhlpfilepath.rawAddress.toCPointer<ByteVar>(), szlanguageid.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun updatePerfNameFilesW(sznewctrfilepath: Pcwstr, sznewhlpfilepath: Pcwstr, szlanguageid: Pcwstr, dwflags: ULong): UInt =
    windowssysWindowsWin32SystemPerformanceUpdatePerfNameFilesW(sznewctrfilepath.rawAddress.toCPointer<ByteVar>(), sznewhlpfilepath.rawAddress.toCPointer<ByteVar>(), szlanguageid.rawAddress.toCPointer<ByteVar>(), dwflags)
