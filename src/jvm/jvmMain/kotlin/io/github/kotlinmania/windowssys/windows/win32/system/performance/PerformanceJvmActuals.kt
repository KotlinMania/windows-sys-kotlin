@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.performance

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32SystemPerformanceJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32SystemPerformanceJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformanceBackupPerfRegistryToFileW(szfilename: Long, szcommentstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformanceInstallPerfDllA(szcomputername: Long, lpinifile: Long, dwflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformanceInstallPerfDllW(szcomputername: Long, lpinifile: Long, dwflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformanceLoadPerfCounterTextStringsA(lpcommandline: Long, bquietmodearg: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformanceLoadPerfCounterTextStringsW(lpcommandline: Long, bquietmodearg: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhAddCounterA(hquery: Long, szfullcounterpath: Long, dwuserdata: Long, phcounter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhAddCounterW(hquery: Long, szfullcounterpath: Long, dwuserdata: Long, phcounter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhAddEnglishCounterA(hquery: Long, szfullcounterpath: Long, dwuserdata: Long, phcounter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhAddEnglishCounterW(hquery: Long, szfullcounterpath: Long, dwuserdata: Long, phcounter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhBindInputDataSourceA(phdatasource: Long, logfilenamelist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhBindInputDataSourceW(phdatasource: Long, logfilenamelist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhBrowseCountersA(pbrowsedlgdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhBrowseCountersHA(pbrowsedlgdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhBrowseCountersHW(pbrowsedlgdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhBrowseCountersW(pbrowsedlgdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhCalculateCounterFromRawValue(hcounter: Long, dwformat: Int, rawvalue1: Long, rawvalue2: Long, fmtvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhCloseLog(hlog: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhCloseQuery(hquery: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhCollectQueryData(hquery: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhCollectQueryDataEx(hquery: Long, dwintervaltime: Int, hnewdataevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhCollectQueryDataWithTime(hquery: Long, plltimestamp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhComputeCounterStatistics(hcounter: Long, dwformat: Int, dwfirstentry: Int, dwnumentries: Int, lprawvaluearray: Long, data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhConnectMachineA(szmachinename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhConnectMachineW(szmachinename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhCreateSQLTablesA(szdatasource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhCreateSQLTablesW(szdatasource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhEnumLogSetNamesA(szdatasource: Long, mszdatasetnamelist: Long, pcchbufferlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhEnumLogSetNamesW(szdatasource: Long, mszdatasetnamelist: Long, pcchbufferlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhEnumMachinesA(szdatasource: Long, mszmachinelist: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhEnumMachinesHA(hdatasource: Long, mszmachinelist: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhEnumMachinesHW(hdatasource: Long, mszmachinelist: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhEnumMachinesW(szdatasource: Long, mszmachinelist: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsA(szdatasource: Long, szmachinename: Long, szobjectname: Long, mszcounterlist: Long, pcchcounterlistlength: Long, mszinstancelist: Long, pcchinstancelistlength: Long, dwdetaillevel: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsHA(hdatasource: Long, szmachinename: Long, szobjectname: Long, mszcounterlist: Long, pcchcounterlistlength: Long, mszinstancelist: Long, pcchinstancelistlength: Long, dwdetaillevel: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsHW(hdatasource: Long, szmachinename: Long, szobjectname: Long, mszcounterlist: Long, pcchcounterlistlength: Long, mszinstancelist: Long, pcchinstancelistlength: Long, dwdetaillevel: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsW(szdatasource: Long, szmachinename: Long, szobjectname: Long, mszcounterlist: Long, pcchcounterlistlength: Long, mszinstancelist: Long, pcchinstancelistlength: Long, dwdetaillevel: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhEnumObjectsA(szdatasource: Long, szmachinename: Long, mszobjectlist: Long, pcchbuffersize: Long, dwdetaillevel: Int, brefresh: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhEnumObjectsHA(hdatasource: Long, szmachinename: Long, mszobjectlist: Long, pcchbuffersize: Long, dwdetaillevel: Int, brefresh: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhEnumObjectsHW(hdatasource: Long, szmachinename: Long, mszobjectlist: Long, pcchbuffersize: Long, dwdetaillevel: Int, brefresh: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhEnumObjectsW(szdatasource: Long, szmachinename: Long, mszobjectlist: Long, pcchbuffersize: Long, dwdetaillevel: Int, brefresh: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhExpandCounterPathA(szwildcardpath: Long, mszexpandedpathlist: Long, pcchpathlistlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhExpandCounterPathW(szwildcardpath: Long, mszexpandedpathlist: Long, pcchpathlistlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathA(szdatasource: Long, szwildcardpath: Long, mszexpandedpathlist: Long, pcchpathlistlength: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathHA(hdatasource: Long, szwildcardpath: Long, mszexpandedpathlist: Long, pcchpathlistlength: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathHW(hdatasource: Long, szwildcardpath: Long, mszexpandedpathlist: Long, pcchpathlistlength: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathW(szdatasource: Long, szwildcardpath: Long, mszexpandedpathlist: Long, pcchpathlistlength: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhFormatFromRawValue(dwcountertype: Int, dwformat: Int, ptimebase: Long, prawvalue1: Long, prawvalue2: Long, pfmtvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhGetCounterInfoA(hcounter: Long, bretrieveexplaintext: Boolean, pdwbuffersize: Long, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhGetCounterInfoW(hcounter: Long, bretrieveexplaintext: Boolean, pdwbuffersize: Long, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhGetCounterTimeBase(hcounter: Long, ptimebase: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeA(szdatasource: Long, pdwnumentries: Long, pinfo: Long, pdwbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeH(hdatasource: Long, pdwnumentries: Long, pinfo: Long, pdwbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeW(szdatasource: Long, pdwnumentries: Long, pinfo: Long, pdwbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterA(szdatasource: Long, szmachinename: Long, szobjectname: Long, szdefaultcountername: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterHA(hdatasource: Long, szmachinename: Long, szobjectname: Long, szdefaultcountername: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterHW(hdatasource: Long, szmachinename: Long, szobjectname: Long, szdefaultcountername: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterW(szdatasource: Long, szmachinename: Long, szobjectname: Long, szdefaultcountername: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectA(szdatasource: Long, szmachinename: Long, szdefaultobjectname: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectHA(hdatasource: Long, szmachinename: Long, szdefaultobjectname: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectHW(hdatasource: Long, szmachinename: Long, szdefaultobjectname: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectW(szdatasource: Long, szmachinename: Long, szdefaultobjectname: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhGetDllVersion(lpdwversion: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhGetFormattedCounterArrayA(hcounter: Long, dwformat: Int, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhGetFormattedCounterArrayW(hcounter: Long, dwformat: Int, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhGetFormattedCounterValue(hcounter: Long, dwformat: Int, lpdwtype: Long, pvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhGetLogFileSize(hlog: Long, llsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhGetLogSetGUID(hlog: Long, pguid: Long, prunid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhGetRawCounterArrayA(hcounter: Long, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhGetRawCounterArrayW(hcounter: Long, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhGetRawCounterValue(hcounter: Long, lpdwtype: Long, pvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhIsRealTimeQuery(hquery: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhLookupPerfIndexByNameA(szmachinename: Long, sznamebuffer: Long, pdwindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhLookupPerfIndexByNameW(szmachinename: Long, sznamebuffer: Long, pdwindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhLookupPerfNameByIndexA(szmachinename: Long, dwnameindex: Int, sznamebuffer: Long, pcchnamebuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhLookupPerfNameByIndexW(szmachinename: Long, dwnameindex: Int, sznamebuffer: Long, pcchnamebuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhMakeCounterPathA(pcounterpathelements: Long, szfullpathbuffer: Long, pcchbuffersize: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhMakeCounterPathW(pcounterpathelements: Long, szfullpathbuffer: Long, pcchbuffersize: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhOpenLogA(szlogfilename: Long, dwaccessflags: Int, lpdwlogtype: Long, hquery: Long, dwmaxsize: Int, szusercaption: Long, phlog: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhOpenLogW(szlogfilename: Long, dwaccessflags: Int, lpdwlogtype: Long, hquery: Long, dwmaxsize: Int, szusercaption: Long, phlog: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhOpenQueryA(szdatasource: Long, dwuserdata: Long, phquery: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhOpenQueryH(hdatasource: Long, dwuserdata: Long, phquery: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhOpenQueryW(szdatasource: Long, dwuserdata: Long, phquery: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhParseCounterPathA(szfullpathbuffer: Long, pcounterpathelements: Long, pdwbuffersize: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhParseCounterPathW(szfullpathbuffer: Long, pcounterpathelements: Long, pdwbuffersize: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhParseInstanceNameA(szinstancestring: Long, szinstancename: Long, pcchinstancenamelength: Long, szparentname: Long, pcchparentnamelength: Long, lpindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhParseInstanceNameW(szinstancestring: Long, szinstancename: Long, pcchinstancenamelength: Long, szparentname: Long, pcchparentnamelength: Long, lpindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhRemoveCounter(hcounter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhSelectDataSourceA(hwndowner: Long, dwflags: Int, szdatasource: Long, pcchbufferlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhSelectDataSourceW(hwndowner: Long, dwflags: Int, szdatasource: Long, pcchbufferlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhSetCounterScaleFactor(hcounter: Long, lfactor: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhSetDefaultRealTimeDataSource(dwdatasourceid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhSetLogSetRunID(hlog: Long, runid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhSetQueryTimeRange(hquery: Long, pinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhUpdateLogA(hlog: Long, szuserstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhUpdateLogFileCatalog(hlog: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhUpdateLogW(hlog: Long, szuserstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhValidatePathA(szfullpathbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhValidatePathExA(hdatasource: Long, szfullpathbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhValidatePathExW(hdatasource: Long, szfullpathbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhValidatePathW(szfullpathbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhVerifySQLDBA(szdatasource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePdhVerifySQLDBW(szdatasource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePerfAddCounters(hquery: Long, pcounters: Long, cbcounters: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePerfCloseQueryHandle(hquery: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePerfCreateInstance(providerhandle: Long, countersetguid: Long, name: Long, id: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePerfDecrementULongCounterValue(provider: Long, instance: Long, counterid: Int, value: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePerfDecrementULongLongCounterValue(provider: Long, instance: Long, counterid: Int, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePerfDeleteCounters(hquery: Long, pcounters: Long, cbcounters: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePerfDeleteInstance(provider: Long, instanceblock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePerfEnumerateCounterSet(szmachine: Long, pcountersetids: Long, ccountersetids: Int, pccountersetidsactual: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePerfEnumerateCounterSetInstances(szmachine: Long, pcountersetid: Long, pinstances: Long, cbinstances: Int, pcbinstancesactual: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePerfIncrementULongCounterValue(provider: Long, instance: Long, counterid: Int, value: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePerfIncrementULongLongCounterValue(provider: Long, instance: Long, counterid: Int, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePerfOpenQueryHandle(szmachine: Long, phquery: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePerfQueryCounterData(hquery: Long, pcounterblock: Long, cbcounterblock: Int, pcbcounterblockactual: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePerfQueryCounterInfo(hquery: Long, pcounters: Long, cbcounters: Int, pcbcountersactual: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePerfQueryCounterSetRegistrationInfo(szmachine: Long, pcountersetid: Long, requestcode: Int, requestlangid: Int, pbreginfo: Long, cbreginfo: Int, pcbreginfoactual: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePerfQueryInstance(providerhandle: Long, countersetguid: Long, name: Long, id: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePerfSetCounterRefValue(provider: Long, instance: Long, counterid: Int, address: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePerfSetCounterSetInfo(providerhandle: Long, template: Long, templatesize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePerfSetULongCounterValue(provider: Long, instance: Long, counterid: Int, value: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePerfSetULongLongCounterValue(provider: Long, instance: Long, counterid: Int, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePerfStartProvider(providerguid: Long, controlcallback: Long, phprovider: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePerfStartProviderEx(providerguid: Long, providercontext: Long, provider: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformancePerfStopProvider(providerhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformanceQueryPerformanceCounter(lpperformancecount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformanceQueryPerformanceFrequency(lpfrequency: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformanceRestorePerfRegistryFromFileW(szfilename: Long, szlangid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformanceSetServiceAsTrustedA(szreserved: Long, szservicename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformanceSetServiceAsTrustedW(szreserved: Long, szservicename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformanceUnloadPerfCounterTextStringsA(lpcommandline: Long, bquietmodearg: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformanceUnloadPerfCounterTextStringsW(lpcommandline: Long, bquietmodearg: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformanceUpdatePerfNameFilesA(sznewctrfilepath: Long, sznewhlpfilepath: Long, szlanguageid: Long, dwflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformanceUpdatePerfNameFilesW(sznewctrfilepath: Long, sznewhlpfilepath: Long, szlanguageid: Long, dwflags: Long): Int
}

public actual fun backupPerfRegistryToFileW(szfilename: Pcwstr, szcommentstring: Pcwstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformanceBackupPerfRegistryToFileW(szfilename.rawAddress, szcommentstring.rawAddress).toUInt()

public actual fun installPerfDllA(szcomputername: Pcstr, lpinifile: Pcstr, dwflags: ULong): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformanceInstallPerfDllA(szcomputername.rawAddress, lpinifile.rawAddress, dwflags.toLong()).toUInt()

public actual fun installPerfDllW(szcomputername: Pcwstr, lpinifile: Pcwstr, dwflags: ULong): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformanceInstallPerfDllW(szcomputername.rawAddress, lpinifile.rawAddress, dwflags.toLong()).toUInt()

public actual fun loadPerfCounterTextStringsA(lpcommandline: Pcstr, bquietmodearg: Bool): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformanceLoadPerfCounterTextStringsA(lpcommandline.rawAddress, bquietmodearg).toUInt()

public actual fun loadPerfCounterTextStringsW(lpcommandline: Pcwstr, bquietmodearg: Bool): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformanceLoadPerfCounterTextStringsW(lpcommandline.rawAddress, bquietmodearg).toUInt()

public actual fun pdhAddCounterA(hquery: PdhHquery, szfullcounterpath: Pcstr, dwuserdata: ULong, phcounter: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhAddCounterA(hquery.rawAddress, szfullcounterpath.rawAddress, dwuserdata.toLong(), phcounter.rawAddress).toUInt()

public actual fun pdhAddCounterW(hquery: PdhHquery, szfullcounterpath: Pcwstr, dwuserdata: ULong, phcounter: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhAddCounterW(hquery.rawAddress, szfullcounterpath.rawAddress, dwuserdata.toLong(), phcounter.rawAddress).toUInt()

public actual fun pdhAddEnglishCounterA(hquery: PdhHquery, szfullcounterpath: Pcstr, dwuserdata: ULong, phcounter: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhAddEnglishCounterA(hquery.rawAddress, szfullcounterpath.rawAddress, dwuserdata.toLong(), phcounter.rawAddress).toUInt()

public actual fun pdhAddEnglishCounterW(hquery: PdhHquery, szfullcounterpath: Pcwstr, dwuserdata: ULong, phcounter: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhAddEnglishCounterW(hquery.rawAddress, szfullcounterpath.rawAddress, dwuserdata.toLong(), phcounter.rawAddress).toUInt()

public actual fun pdhBindInputDataSourceA(phdatasource: MutPtr, logfilenamelist: Pcstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhBindInputDataSourceA(phdatasource.rawAddress, logfilenamelist.rawAddress).toUInt()

public actual fun pdhBindInputDataSourceW(phdatasource: MutPtr, logfilenamelist: Pcwstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhBindInputDataSourceW(phdatasource.rawAddress, logfilenamelist.rawAddress).toUInt()

public actual fun pdhBrowseCountersA(pbrowsedlgdata: ConstPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhBrowseCountersA(pbrowsedlgdata.rawAddress).toUInt()

public actual fun pdhBrowseCountersHA(pbrowsedlgdata: ConstPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhBrowseCountersHA(pbrowsedlgdata.rawAddress).toUInt()

public actual fun pdhBrowseCountersHW(pbrowsedlgdata: ConstPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhBrowseCountersHW(pbrowsedlgdata.rawAddress).toUInt()

public actual fun pdhBrowseCountersW(pbrowsedlgdata: ConstPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhBrowseCountersW(pbrowsedlgdata.rawAddress).toUInt()

public actual fun pdhCalculateCounterFromRawValue(hcounter: PdhHcounter, dwformat: PdhFmt, rawvalue1: ConstPtr, rawvalue2: ConstPtr, fmtvalue: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhCalculateCounterFromRawValue(hcounter.rawAddress, dwformat.toInt(), rawvalue1.rawAddress, rawvalue2.rawAddress, fmtvalue.rawAddress).toUInt()

public actual fun pdhCloseLog(hlog: PdhHlog, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhCloseLog(hlog.rawAddress, dwflags.toInt()).toUInt()

public actual fun pdhCloseQuery(hquery: PdhHquery): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhCloseQuery(hquery.rawAddress).toUInt()

public actual fun pdhCollectQueryData(hquery: PdhHquery): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhCollectQueryData(hquery.rawAddress).toUInt()

public actual fun pdhCollectQueryDataEx(hquery: PdhHquery, dwintervaltime: UInt, hnewdataevent: Handle): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhCollectQueryDataEx(hquery.rawAddress, dwintervaltime.toInt(), hnewdataevent.rawAddress).toUInt()

public actual fun pdhCollectQueryDataWithTime(hquery: PdhHquery, plltimestamp: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhCollectQueryDataWithTime(hquery.rawAddress, plltimestamp.rawAddress).toUInt()

public actual fun pdhComputeCounterStatistics(hcounter: PdhHcounter, dwformat: PdhFmt, dwfirstentry: UInt, dwnumentries: UInt, lprawvaluearray: ConstPtr, data: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhComputeCounterStatistics(hcounter.rawAddress, dwformat.toInt(), dwfirstentry.toInt(), dwnumentries.toInt(), lprawvaluearray.rawAddress, data.rawAddress).toUInt()

public actual fun pdhConnectMachineA(szmachinename: Pcstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhConnectMachineA(szmachinename.rawAddress).toUInt()

public actual fun pdhConnectMachineW(szmachinename: Pcwstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhConnectMachineW(szmachinename.rawAddress).toUInt()

public actual fun pdhCreateSQLTablesA(szdatasource: Pcstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhCreateSQLTablesA(szdatasource.rawAddress).toUInt()

public actual fun pdhCreateSQLTablesW(szdatasource: Pcwstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhCreateSQLTablesW(szdatasource.rawAddress).toUInt()

public actual fun pdhEnumLogSetNamesA(szdatasource: Pcstr, mszdatasetnamelist: Pstr, pcchbufferlength: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhEnumLogSetNamesA(szdatasource.rawAddress, mszdatasetnamelist.rawAddress, pcchbufferlength.rawAddress).toUInt()

public actual fun pdhEnumLogSetNamesW(szdatasource: Pcwstr, mszdatasetnamelist: Pwstr, pcchbufferlength: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhEnumLogSetNamesW(szdatasource.rawAddress, mszdatasetnamelist.rawAddress, pcchbufferlength.rawAddress).toUInt()

public actual fun pdhEnumMachinesA(szdatasource: Pcstr, mszmachinelist: Pstr, pcchbuffersize: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhEnumMachinesA(szdatasource.rawAddress, mszmachinelist.rawAddress, pcchbuffersize.rawAddress).toUInt()

public actual fun pdhEnumMachinesHA(hdatasource: PdhHlog, mszmachinelist: Pstr, pcchbuffersize: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhEnumMachinesHA(hdatasource.rawAddress, mszmachinelist.rawAddress, pcchbuffersize.rawAddress).toUInt()

public actual fun pdhEnumMachinesHW(hdatasource: PdhHlog, mszmachinelist: Pwstr, pcchbuffersize: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhEnumMachinesHW(hdatasource.rawAddress, mszmachinelist.rawAddress, pcchbuffersize.rawAddress).toUInt()

public actual fun pdhEnumMachinesW(szdatasource: Pcwstr, mszmachinelist: Pwstr, pcchbuffersize: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhEnumMachinesW(szdatasource.rawAddress, mszmachinelist.rawAddress, pcchbuffersize.rawAddress).toUInt()

public actual fun pdhEnumObjectItemsA(szdatasource: Pcstr, szmachinename: Pcstr, szobjectname: Pcstr, mszcounterlist: Pstr, pcchcounterlistlength: MutPtr, mszinstancelist: Pstr, pcchinstancelistlength: MutPtr, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsA(szdatasource.rawAddress, szmachinename.rawAddress, szobjectname.rawAddress, mszcounterlist.rawAddress, pcchcounterlistlength.rawAddress, mszinstancelist.rawAddress, pcchinstancelistlength.rawAddress, dwdetaillevel.toInt(), dwflags.toInt()).toUInt()

public actual fun pdhEnumObjectItemsHA(hdatasource: PdhHlog, szmachinename: Pcstr, szobjectname: Pcstr, mszcounterlist: Pstr, pcchcounterlistlength: MutPtr, mszinstancelist: Pstr, pcchinstancelistlength: MutPtr, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsHA(hdatasource.rawAddress, szmachinename.rawAddress, szobjectname.rawAddress, mszcounterlist.rawAddress, pcchcounterlistlength.rawAddress, mszinstancelist.rawAddress, pcchinstancelistlength.rawAddress, dwdetaillevel.toInt(), dwflags.toInt()).toUInt()

public actual fun pdhEnumObjectItemsHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szobjectname: Pcwstr, mszcounterlist: Pwstr, pcchcounterlistlength: MutPtr, mszinstancelist: Pwstr, pcchinstancelistlength: MutPtr, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsHW(hdatasource.rawAddress, szmachinename.rawAddress, szobjectname.rawAddress, mszcounterlist.rawAddress, pcchcounterlistlength.rawAddress, mszinstancelist.rawAddress, pcchinstancelistlength.rawAddress, dwdetaillevel.toInt(), dwflags.toInt()).toUInt()

public actual fun pdhEnumObjectItemsW(szdatasource: Pcwstr, szmachinename: Pcwstr, szobjectname: Pcwstr, mszcounterlist: Pwstr, pcchcounterlistlength: MutPtr, mszinstancelist: Pwstr, pcchinstancelistlength: MutPtr, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsW(szdatasource.rawAddress, szmachinename.rawAddress, szobjectname.rawAddress, mszcounterlist.rawAddress, pcchcounterlistlength.rawAddress, mszinstancelist.rawAddress, pcchinstancelistlength.rawAddress, dwdetaillevel.toInt(), dwflags.toInt()).toUInt()

public actual fun pdhEnumObjectsA(szdatasource: Pcstr, szmachinename: Pcstr, mszobjectlist: Pstr, pcchbuffersize: MutPtr, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhEnumObjectsA(szdatasource.rawAddress, szmachinename.rawAddress, mszobjectlist.rawAddress, pcchbuffersize.rawAddress, dwdetaillevel.toInt(), brefresh).toUInt()

public actual fun pdhEnumObjectsHA(hdatasource: PdhHlog, szmachinename: Pcstr, mszobjectlist: Pstr, pcchbuffersize: MutPtr, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhEnumObjectsHA(hdatasource.rawAddress, szmachinename.rawAddress, mszobjectlist.rawAddress, pcchbuffersize.rawAddress, dwdetaillevel.toInt(), brefresh).toUInt()

public actual fun pdhEnumObjectsHW(hdatasource: PdhHlog, szmachinename: Pcwstr, mszobjectlist: Pwstr, pcchbuffersize: MutPtr, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhEnumObjectsHW(hdatasource.rawAddress, szmachinename.rawAddress, mszobjectlist.rawAddress, pcchbuffersize.rawAddress, dwdetaillevel.toInt(), brefresh).toUInt()

public actual fun pdhEnumObjectsW(szdatasource: Pcwstr, szmachinename: Pcwstr, mszobjectlist: Pwstr, pcchbuffersize: MutPtr, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhEnumObjectsW(szdatasource.rawAddress, szmachinename.rawAddress, mszobjectlist.rawAddress, pcchbuffersize.rawAddress, dwdetaillevel.toInt(), brefresh).toUInt()

public actual fun pdhExpandCounterPathA(szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhExpandCounterPathA(szwildcardpath.rawAddress, mszexpandedpathlist.rawAddress, pcchpathlistlength.rawAddress).toUInt()

public actual fun pdhExpandCounterPathW(szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhExpandCounterPathW(szwildcardpath.rawAddress, mszexpandedpathlist.rawAddress, pcchpathlistlength.rawAddress).toUInt()

public actual fun pdhExpandWildCardPathA(szdatasource: Pcstr, szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: MutPtr, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathA(szdatasource.rawAddress, szwildcardpath.rawAddress, mszexpandedpathlist.rawAddress, pcchpathlistlength.rawAddress, dwflags.toInt()).toUInt()

public actual fun pdhExpandWildCardPathHA(hdatasource: PdhHlog, szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: MutPtr, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathHA(hdatasource.rawAddress, szwildcardpath.rawAddress, mszexpandedpathlist.rawAddress, pcchpathlistlength.rawAddress, dwflags.toInt()).toUInt()

public actual fun pdhExpandWildCardPathHW(hdatasource: PdhHlog, szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: MutPtr, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathHW(hdatasource.rawAddress, szwildcardpath.rawAddress, mszexpandedpathlist.rawAddress, pcchpathlistlength.rawAddress, dwflags.toInt()).toUInt()

public actual fun pdhExpandWildCardPathW(szdatasource: Pcwstr, szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: MutPtr, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathW(szdatasource.rawAddress, szwildcardpath.rawAddress, mszexpandedpathlist.rawAddress, pcchpathlistlength.rawAddress, dwflags.toInt()).toUInt()

public actual fun pdhFormatFromRawValue(dwcountertype: UInt, dwformat: PdhFmt, ptimebase: ConstPtr, prawvalue1: ConstPtr, prawvalue2: ConstPtr, pfmtvalue: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhFormatFromRawValue(dwcountertype.toInt(), dwformat.toInt(), ptimebase.rawAddress, prawvalue1.rawAddress, prawvalue2.rawAddress, pfmtvalue.rawAddress).toUInt()

public actual fun pdhGetCounterInfoA(hcounter: PdhHcounter, bretrieveexplaintext: Boolean, pdwbuffersize: MutPtr, lpbuffer: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhGetCounterInfoA(hcounter.rawAddress, bretrieveexplaintext, pdwbuffersize.rawAddress, lpbuffer.rawAddress).toUInt()

public actual fun pdhGetCounterInfoW(hcounter: PdhHcounter, bretrieveexplaintext: Boolean, pdwbuffersize: MutPtr, lpbuffer: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhGetCounterInfoW(hcounter.rawAddress, bretrieveexplaintext, pdwbuffersize.rawAddress, lpbuffer.rawAddress).toUInt()

public actual fun pdhGetCounterTimeBase(hcounter: PdhHcounter, ptimebase: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhGetCounterTimeBase(hcounter.rawAddress, ptimebase.rawAddress).toUInt()

public actual fun pdhGetDataSourceTimeRangeA(szdatasource: Pcstr, pdwnumentries: MutPtr, pinfo: MutPtr, pdwbuffersize: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeA(szdatasource.rawAddress, pdwnumentries.rawAddress, pinfo.rawAddress, pdwbuffersize.rawAddress).toUInt()

public actual fun pdhGetDataSourceTimeRangeH(hdatasource: PdhHlog, pdwnumentries: MutPtr, pinfo: MutPtr, pdwbuffersize: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeH(hdatasource.rawAddress, pdwnumentries.rawAddress, pinfo.rawAddress, pdwbuffersize.rawAddress).toUInt()

public actual fun pdhGetDataSourceTimeRangeW(szdatasource: Pcwstr, pdwnumentries: MutPtr, pinfo: MutPtr, pdwbuffersize: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeW(szdatasource.rawAddress, pdwnumentries.rawAddress, pinfo.rawAddress, pdwbuffersize.rawAddress).toUInt()

public actual fun pdhGetDefaultPerfCounterA(szdatasource: Pcstr, szmachinename: Pcstr, szobjectname: Pcstr, szdefaultcountername: Pstr, pcchbuffersize: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterA(szdatasource.rawAddress, szmachinename.rawAddress, szobjectname.rawAddress, szdefaultcountername.rawAddress, pcchbuffersize.rawAddress).toUInt()

public actual fun pdhGetDefaultPerfCounterHA(hdatasource: PdhHlog, szmachinename: Pcstr, szobjectname: Pcstr, szdefaultcountername: Pstr, pcchbuffersize: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterHA(hdatasource.rawAddress, szmachinename.rawAddress, szobjectname.rawAddress, szdefaultcountername.rawAddress, pcchbuffersize.rawAddress).toUInt()

public actual fun pdhGetDefaultPerfCounterHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szobjectname: Pcwstr, szdefaultcountername: Pwstr, pcchbuffersize: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterHW(hdatasource.rawAddress, szmachinename.rawAddress, szobjectname.rawAddress, szdefaultcountername.rawAddress, pcchbuffersize.rawAddress).toUInt()

public actual fun pdhGetDefaultPerfCounterW(szdatasource: Pcwstr, szmachinename: Pcwstr, szobjectname: Pcwstr, szdefaultcountername: Pwstr, pcchbuffersize: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterW(szdatasource.rawAddress, szmachinename.rawAddress, szobjectname.rawAddress, szdefaultcountername.rawAddress, pcchbuffersize.rawAddress).toUInt()

public actual fun pdhGetDefaultPerfObjectA(szdatasource: Pcstr, szmachinename: Pcstr, szdefaultobjectname: Pstr, pcchbuffersize: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectA(szdatasource.rawAddress, szmachinename.rawAddress, szdefaultobjectname.rawAddress, pcchbuffersize.rawAddress).toUInt()

public actual fun pdhGetDefaultPerfObjectHA(hdatasource: PdhHlog, szmachinename: Pcstr, szdefaultobjectname: Pstr, pcchbuffersize: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectHA(hdatasource.rawAddress, szmachinename.rawAddress, szdefaultobjectname.rawAddress, pcchbuffersize.rawAddress).toUInt()

public actual fun pdhGetDefaultPerfObjectHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szdefaultobjectname: Pwstr, pcchbuffersize: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectHW(hdatasource.rawAddress, szmachinename.rawAddress, szdefaultobjectname.rawAddress, pcchbuffersize.rawAddress).toUInt()

public actual fun pdhGetDefaultPerfObjectW(szdatasource: Pcwstr, szmachinename: Pcwstr, szdefaultobjectname: Pwstr, pcchbuffersize: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectW(szdatasource.rawAddress, szmachinename.rawAddress, szdefaultobjectname.rawAddress, pcchbuffersize.rawAddress).toUInt()

public actual fun pdhGetDllVersion(lpdwversion: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhGetDllVersion(lpdwversion.rawAddress).toUInt()

public actual fun pdhGetFormattedCounterArrayA(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwbuffersize: MutPtr, lpdwitemcount: MutPtr, itembuffer: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhGetFormattedCounterArrayA(hcounter.rawAddress, dwformat.toInt(), lpdwbuffersize.rawAddress, lpdwitemcount.rawAddress, itembuffer.rawAddress).toUInt()

public actual fun pdhGetFormattedCounterArrayW(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwbuffersize: MutPtr, lpdwitemcount: MutPtr, itembuffer: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhGetFormattedCounterArrayW(hcounter.rawAddress, dwformat.toInt(), lpdwbuffersize.rawAddress, lpdwitemcount.rawAddress, itembuffer.rawAddress).toUInt()

public actual fun pdhGetFormattedCounterValue(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwtype: MutPtr, pvalue: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhGetFormattedCounterValue(hcounter.rawAddress, dwformat.toInt(), lpdwtype.rawAddress, pvalue.rawAddress).toUInt()

public actual fun pdhGetLogFileSize(hlog: PdhHlog, llsize: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhGetLogFileSize(hlog.rawAddress, llsize.rawAddress).toUInt()

public actual fun pdhGetLogSetGUID(hlog: PdhHlog, pguid: MutPtr, prunid: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhGetLogSetGUID(hlog.rawAddress, pguid.rawAddress, prunid.rawAddress).toUInt()

public actual fun pdhGetRawCounterArrayA(hcounter: PdhHcounter, lpdwbuffersize: MutPtr, lpdwitemcount: MutPtr, itembuffer: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhGetRawCounterArrayA(hcounter.rawAddress, lpdwbuffersize.rawAddress, lpdwitemcount.rawAddress, itembuffer.rawAddress).toUInt()

public actual fun pdhGetRawCounterArrayW(hcounter: PdhHcounter, lpdwbuffersize: MutPtr, lpdwitemcount: MutPtr, itembuffer: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhGetRawCounterArrayW(hcounter.rawAddress, lpdwbuffersize.rawAddress, lpdwitemcount.rawAddress, itembuffer.rawAddress).toUInt()

public actual fun pdhGetRawCounterValue(hcounter: PdhHcounter, lpdwtype: MutPtr, pvalue: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhGetRawCounterValue(hcounter.rawAddress, lpdwtype.rawAddress, pvalue.rawAddress).toUInt()

public actual fun pdhIsRealTimeQuery(hquery: PdhHquery): Bool =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhIsRealTimeQuery(hquery.rawAddress)

public actual fun pdhLookupPerfIndexByNameA(szmachinename: Pcstr, sznamebuffer: Pcstr, pdwindex: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhLookupPerfIndexByNameA(szmachinename.rawAddress, sznamebuffer.rawAddress, pdwindex.rawAddress).toUInt()

public actual fun pdhLookupPerfIndexByNameW(szmachinename: Pcwstr, sznamebuffer: Pcwstr, pdwindex: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhLookupPerfIndexByNameW(szmachinename.rawAddress, sznamebuffer.rawAddress, pdwindex.rawAddress).toUInt()

public actual fun pdhLookupPerfNameByIndexA(szmachinename: Pcstr, dwnameindex: UInt, sznamebuffer: Pstr, pcchnamebuffersize: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhLookupPerfNameByIndexA(szmachinename.rawAddress, dwnameindex.toInt(), sznamebuffer.rawAddress, pcchnamebuffersize.rawAddress).toUInt()

public actual fun pdhLookupPerfNameByIndexW(szmachinename: Pcwstr, dwnameindex: UInt, sznamebuffer: Pwstr, pcchnamebuffersize: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhLookupPerfNameByIndexW(szmachinename.rawAddress, dwnameindex.toInt(), sznamebuffer.rawAddress, pcchnamebuffersize.rawAddress).toUInt()

public actual fun pdhMakeCounterPathA(pcounterpathelements: ConstPtr, szfullpathbuffer: Pstr, pcchbuffersize: MutPtr, dwflags: PdhPathFlags): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhMakeCounterPathA(pcounterpathelements.rawAddress, szfullpathbuffer.rawAddress, pcchbuffersize.rawAddress, dwflags.toInt()).toUInt()

public actual fun pdhMakeCounterPathW(pcounterpathelements: ConstPtr, szfullpathbuffer: Pwstr, pcchbuffersize: MutPtr, dwflags: PdhPathFlags): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhMakeCounterPathW(pcounterpathelements.rawAddress, szfullpathbuffer.rawAddress, pcchbuffersize.rawAddress, dwflags.toInt()).toUInt()

public actual fun pdhOpenLogA(szlogfilename: Pcstr, dwaccessflags: PdhLog, lpdwlogtype: MutPtr, hquery: PdhHquery, dwmaxsize: UInt, szusercaption: Pcstr, phlog: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhOpenLogA(szlogfilename.rawAddress, dwaccessflags.toInt(), lpdwlogtype.rawAddress, hquery.rawAddress, dwmaxsize.toInt(), szusercaption.rawAddress, phlog.rawAddress).toUInt()

public actual fun pdhOpenLogW(szlogfilename: Pcwstr, dwaccessflags: PdhLog, lpdwlogtype: MutPtr, hquery: PdhHquery, dwmaxsize: UInt, szusercaption: Pcwstr, phlog: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhOpenLogW(szlogfilename.rawAddress, dwaccessflags.toInt(), lpdwlogtype.rawAddress, hquery.rawAddress, dwmaxsize.toInt(), szusercaption.rawAddress, phlog.rawAddress).toUInt()

public actual fun pdhOpenQueryA(szdatasource: Pcstr, dwuserdata: ULong, phquery: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhOpenQueryA(szdatasource.rawAddress, dwuserdata.toLong(), phquery.rawAddress).toUInt()

public actual fun pdhOpenQueryH(hdatasource: PdhHlog, dwuserdata: ULong, phquery: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhOpenQueryH(hdatasource.rawAddress, dwuserdata.toLong(), phquery.rawAddress).toUInt()

public actual fun pdhOpenQueryW(szdatasource: Pcwstr, dwuserdata: ULong, phquery: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhOpenQueryW(szdatasource.rawAddress, dwuserdata.toLong(), phquery.rawAddress).toUInt()

public actual fun pdhParseCounterPathA(szfullpathbuffer: Pcstr, pcounterpathelements: MutPtr, pdwbuffersize: MutPtr, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhParseCounterPathA(szfullpathbuffer.rawAddress, pcounterpathelements.rawAddress, pdwbuffersize.rawAddress, dwflags.toInt()).toUInt()

public actual fun pdhParseCounterPathW(szfullpathbuffer: Pcwstr, pcounterpathelements: MutPtr, pdwbuffersize: MutPtr, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhParseCounterPathW(szfullpathbuffer.rawAddress, pcounterpathelements.rawAddress, pdwbuffersize.rawAddress, dwflags.toInt()).toUInt()

public actual fun pdhParseInstanceNameA(szinstancestring: Pcstr, szinstancename: Pstr, pcchinstancenamelength: MutPtr, szparentname: Pstr, pcchparentnamelength: MutPtr, lpindex: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhParseInstanceNameA(szinstancestring.rawAddress, szinstancename.rawAddress, pcchinstancenamelength.rawAddress, szparentname.rawAddress, pcchparentnamelength.rawAddress, lpindex.rawAddress).toUInt()

public actual fun pdhParseInstanceNameW(szinstancestring: Pcwstr, szinstancename: Pwstr, pcchinstancenamelength: MutPtr, szparentname: Pwstr, pcchparentnamelength: MutPtr, lpindex: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhParseInstanceNameW(szinstancestring.rawAddress, szinstancename.rawAddress, pcchinstancenamelength.rawAddress, szparentname.rawAddress, pcchparentnamelength.rawAddress, lpindex.rawAddress).toUInt()

public actual fun pdhReadRawLogRecord(hlog: PdhHlog, ftrecord: Filetime, prawlogrecord: MutPtr, pdwbufferlength: MutPtr): UInt =
    0u

public actual fun pdhRemoveCounter(hcounter: PdhHcounter): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhRemoveCounter(hcounter.rawAddress).toUInt()

public actual fun pdhSelectDataSourceA(hwndowner: Hwnd, dwflags: PdhSelectDataSourceFlags, szdatasource: Pstr, pcchbufferlength: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhSelectDataSourceA(hwndowner.rawAddress, dwflags.toInt(), szdatasource.rawAddress, pcchbufferlength.rawAddress).toUInt()

public actual fun pdhSelectDataSourceW(hwndowner: Hwnd, dwflags: PdhSelectDataSourceFlags, szdatasource: Pwstr, pcchbufferlength: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhSelectDataSourceW(hwndowner.rawAddress, dwflags.toInt(), szdatasource.rawAddress, pcchbufferlength.rawAddress).toUInt()

public actual fun pdhSetCounterScaleFactor(hcounter: PdhHcounter, lfactor: Int): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhSetCounterScaleFactor(hcounter.rawAddress, lfactor).toUInt()

public actual fun pdhSetDefaultRealTimeDataSource(dwdatasourceid: RealTimeDataSourceIdFlags): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhSetDefaultRealTimeDataSource(dwdatasourceid.toInt()).toUInt()

public actual fun pdhSetLogSetRunID(hlog: PdhHlog, runid: Int): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhSetLogSetRunID(hlog.rawAddress, runid).toUInt()

public actual fun pdhSetQueryTimeRange(hquery: PdhHquery, pinfo: ConstPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhSetQueryTimeRange(hquery.rawAddress, pinfo.rawAddress).toUInt()

public actual fun pdhUpdateLogA(hlog: PdhHlog, szuserstring: Pcstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhUpdateLogA(hlog.rawAddress, szuserstring.rawAddress).toUInt()

public actual fun pdhUpdateLogFileCatalog(hlog: PdhHlog): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhUpdateLogFileCatalog(hlog.rawAddress).toUInt()

public actual fun pdhUpdateLogW(hlog: PdhHlog, szuserstring: Pcwstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhUpdateLogW(hlog.rawAddress, szuserstring.rawAddress).toUInt()

public actual fun pdhValidatePathA(szfullpathbuffer: Pcstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhValidatePathA(szfullpathbuffer.rawAddress).toUInt()

public actual fun pdhValidatePathExA(hdatasource: PdhHlog, szfullpathbuffer: Pcstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhValidatePathExA(hdatasource.rawAddress, szfullpathbuffer.rawAddress).toUInt()

public actual fun pdhValidatePathExW(hdatasource: PdhHlog, szfullpathbuffer: Pcwstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhValidatePathExW(hdatasource.rawAddress, szfullpathbuffer.rawAddress).toUInt()

public actual fun pdhValidatePathW(szfullpathbuffer: Pcwstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhValidatePathW(szfullpathbuffer.rawAddress).toUInt()

public actual fun pdhVerifySQLDBA(szdatasource: Pcstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhVerifySQLDBA(szdatasource.rawAddress).toUInt()

public actual fun pdhVerifySQLDBW(szdatasource: Pcwstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePdhVerifySQLDBW(szdatasource.rawAddress).toUInt()

public actual fun perfAddCounters(hquery: Handle, pcounters: MutPtr, cbcounters: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePerfAddCounters(hquery.rawAddress, pcounters.rawAddress, cbcounters.toInt()).toUInt()

public actual fun perfCloseQueryHandle(hquery: Handle): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePerfCloseQueryHandle(hquery.rawAddress).toUInt()

public actual fun perfCreateInstance(providerhandle: Handle, countersetguid: ConstPtr, name: Pcwstr, id: UInt): MutPtr =
    MutPtr(WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePerfCreateInstance(providerhandle.rawAddress, countersetguid.rawAddress, name.rawAddress, id.toInt()))

public actual fun perfDecrementULongCounterValue(provider: Handle, instance: MutPtr, counterid: UInt, value: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePerfDecrementULongCounterValue(provider.rawAddress, instance.rawAddress, counterid.toInt(), value.toInt()).toUInt()

public actual fun perfDecrementULongLongCounterValue(provider: Handle, instance: MutPtr, counterid: UInt, value: ULong): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePerfDecrementULongLongCounterValue(provider.rawAddress, instance.rawAddress, counterid.toInt(), value.toLong()).toUInt()

public actual fun perfDeleteCounters(hquery: Handle, pcounters: MutPtr, cbcounters: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePerfDeleteCounters(hquery.rawAddress, pcounters.rawAddress, cbcounters.toInt()).toUInt()

public actual fun perfDeleteInstance(provider: Handle, instanceblock: ConstPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePerfDeleteInstance(provider.rawAddress, instanceblock.rawAddress).toUInt()

public actual fun perfEnumerateCounterSet(szmachine: Pcwstr, pcountersetids: MutPtr, ccountersetids: UInt, pccountersetidsactual: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePerfEnumerateCounterSet(szmachine.rawAddress, pcountersetids.rawAddress, ccountersetids.toInt(), pccountersetidsactual.rawAddress).toUInt()

public actual fun perfEnumerateCounterSetInstances(szmachine: Pcwstr, pcountersetid: ConstPtr, pinstances: MutPtr, cbinstances: UInt, pcbinstancesactual: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePerfEnumerateCounterSetInstances(szmachine.rawAddress, pcountersetid.rawAddress, pinstances.rawAddress, cbinstances.toInt(), pcbinstancesactual.rawAddress).toUInt()

public actual fun perfIncrementULongCounterValue(provider: Handle, instance: MutPtr, counterid: UInt, value: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePerfIncrementULongCounterValue(provider.rawAddress, instance.rawAddress, counterid.toInt(), value.toInt()).toUInt()

public actual fun perfIncrementULongLongCounterValue(provider: Handle, instance: MutPtr, counterid: UInt, value: ULong): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePerfIncrementULongLongCounterValue(provider.rawAddress, instance.rawAddress, counterid.toInt(), value.toLong()).toUInt()

public actual fun perfOpenQueryHandle(szmachine: Pcwstr, phquery: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePerfOpenQueryHandle(szmachine.rawAddress, phquery.rawAddress).toUInt()

public actual fun perfQueryCounterData(hquery: Handle, pcounterblock: MutPtr, cbcounterblock: UInt, pcbcounterblockactual: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePerfQueryCounterData(hquery.rawAddress, pcounterblock.rawAddress, cbcounterblock.toInt(), pcbcounterblockactual.rawAddress).toUInt()

public actual fun perfQueryCounterInfo(hquery: Handle, pcounters: MutPtr, cbcounters: UInt, pcbcountersactual: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePerfQueryCounterInfo(hquery.rawAddress, pcounters.rawAddress, cbcounters.toInt(), pcbcountersactual.rawAddress).toUInt()

public actual fun perfQueryCounterSetRegistrationInfo(szmachine: Pcwstr, pcountersetid: ConstPtr, requestcode: PerfRegInfoType, requestlangid: UInt, pbreginfo: MutPtr, cbreginfo: UInt, pcbreginfoactual: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePerfQueryCounterSetRegistrationInfo(szmachine.rawAddress, pcountersetid.rawAddress, requestcode, requestlangid.toInt(), pbreginfo.rawAddress, cbreginfo.toInt(), pcbreginfoactual.rawAddress).toUInt()

public actual fun perfQueryInstance(providerhandle: Handle, countersetguid: ConstPtr, name: Pcwstr, id: UInt): MutPtr =
    MutPtr(WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePerfQueryInstance(providerhandle.rawAddress, countersetguid.rawAddress, name.rawAddress, id.toInt()))

public actual fun perfSetCounterRefValue(provider: Handle, instance: MutPtr, counterid: UInt, address: ConstPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePerfSetCounterRefValue(provider.rawAddress, instance.rawAddress, counterid.toInt(), address.rawAddress).toUInt()

public actual fun perfSetCounterSetInfo(providerhandle: Handle, template: MutPtr, templatesize: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePerfSetCounterSetInfo(providerhandle.rawAddress, template.rawAddress, templatesize.toInt()).toUInt()

public actual fun perfSetULongCounterValue(provider: Handle, instance: MutPtr, counterid: UInt, value: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePerfSetULongCounterValue(provider.rawAddress, instance.rawAddress, counterid.toInt(), value.toInt()).toUInt()

public actual fun perfSetULongLongCounterValue(provider: Handle, instance: MutPtr, counterid: UInt, value: ULong): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePerfSetULongLongCounterValue(provider.rawAddress, instance.rawAddress, counterid.toInt(), value.toLong()).toUInt()

public actual fun perfStartProvider(providerguid: ConstPtr, controlcallback: Perflibrequest, phprovider: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePerfStartProvider(providerguid.rawAddress, 0L, phprovider.rawAddress).toUInt()

public actual fun perfStartProviderEx(providerguid: ConstPtr, providercontext: ConstPtr, provider: MutPtr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePerfStartProviderEx(providerguid.rawAddress, providercontext.rawAddress, provider.rawAddress).toUInt()

public actual fun perfStopProvider(providerhandle: Handle): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformancePerfStopProvider(providerhandle.rawAddress).toUInt()

public actual fun queryPerformanceCounter(lpperformancecount: MutPtr): Bool =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformanceQueryPerformanceCounter(lpperformancecount.rawAddress)

public actual fun queryPerformanceFrequency(lpfrequency: MutPtr): Bool =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformanceQueryPerformanceFrequency(lpfrequency.rawAddress)

public actual fun restorePerfRegistryFromFileW(szfilename: Pcwstr, szlangid: Pcwstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformanceRestorePerfRegistryFromFileW(szfilename.rawAddress, szlangid.rawAddress).toUInt()

public actual fun setServiceAsTrustedA(szreserved: Pcstr, szservicename: Pcstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformanceSetServiceAsTrustedA(szreserved.rawAddress, szservicename.rawAddress).toUInt()

public actual fun setServiceAsTrustedW(szreserved: Pcwstr, szservicename: Pcwstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformanceSetServiceAsTrustedW(szreserved.rawAddress, szservicename.rawAddress).toUInt()

public actual fun unloadPerfCounterTextStringsA(lpcommandline: Pcstr, bquietmodearg: Bool): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformanceUnloadPerfCounterTextStringsA(lpcommandline.rawAddress, bquietmodearg).toUInt()

public actual fun unloadPerfCounterTextStringsW(lpcommandline: Pcwstr, bquietmodearg: Bool): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformanceUnloadPerfCounterTextStringsW(lpcommandline.rawAddress, bquietmodearg).toUInt()

public actual fun updatePerfNameFilesA(sznewctrfilepath: Pcstr, sznewhlpfilepath: Pcstr, szlanguageid: Pcstr, dwflags: ULong): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformanceUpdatePerfNameFilesA(sznewctrfilepath.rawAddress, sznewhlpfilepath.rawAddress, szlanguageid.rawAddress, dwflags.toLong()).toUInt()

public actual fun updatePerfNameFilesW(sznewctrfilepath: Pcwstr, sznewhlpfilepath: Pcwstr, szlanguageid: Pcwstr, dwflags: ULong): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssysWindowsWin32SystemPerformanceUpdatePerfNameFilesW(sznewctrfilepath.rawAddress, sznewhlpfilepath.rawAddress, szlanguageid.rawAddress, dwflags.toLong()).toUInt()
