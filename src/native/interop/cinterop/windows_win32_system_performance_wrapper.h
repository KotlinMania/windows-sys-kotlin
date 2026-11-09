#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PERFORMANCE_WINDOWS_WIN32_SYSTEM_PERFORMANCE_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PERFORMANCE_WINDOWS_WIN32_SYSTEM_PERFORMANCE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_system_performance_BackupPerfRegistryToFileW(void* szfilename, void* szcommentstring);
uint32_t windowssys_windows_win32_system_performance_InstallPerfDllA(void* szcomputername, void* lpinifile, uint64_t dwflags);
uint32_t windowssys_windows_win32_system_performance_InstallPerfDllW(void* szcomputername, void* lpinifile, uint64_t dwflags);
uint32_t windowssys_windows_win32_system_performance_LoadPerfCounterTextStringsA(void* lpcommandline, int32_t bquietmodearg);
uint32_t windowssys_windows_win32_system_performance_LoadPerfCounterTextStringsW(void* lpcommandline, int32_t bquietmodearg);
uint32_t windowssys_windows_win32_system_performance_PdhAddCounterA(void* hquery, void* szfullcounterpath, uint64_t dwuserdata, void* phcounter);
uint32_t windowssys_windows_win32_system_performance_PdhAddCounterW(void* hquery, void* szfullcounterpath, uint64_t dwuserdata, void* phcounter);
uint32_t windowssys_windows_win32_system_performance_PdhAddEnglishCounterA(void* hquery, void* szfullcounterpath, uint64_t dwuserdata, void* phcounter);
uint32_t windowssys_windows_win32_system_performance_PdhAddEnglishCounterW(void* hquery, void* szfullcounterpath, uint64_t dwuserdata, void* phcounter);
uint32_t windowssys_windows_win32_system_performance_PdhBindInputDataSourceA(void* phdatasource, void* logfilenamelist);
uint32_t windowssys_windows_win32_system_performance_PdhBindInputDataSourceW(void* phdatasource, void* logfilenamelist);
uint32_t windowssys_windows_win32_system_performance_PdhBrowseCountersA(void* pbrowsedlgdata);
uint32_t windowssys_windows_win32_system_performance_PdhBrowseCountersHA(void* pbrowsedlgdata);
uint32_t windowssys_windows_win32_system_performance_PdhBrowseCountersHW(void* pbrowsedlgdata);
uint32_t windowssys_windows_win32_system_performance_PdhBrowseCountersW(void* pbrowsedlgdata);
uint32_t windowssys_windows_win32_system_performance_PdhCalculateCounterFromRawValue(void* hcounter, uint32_t dwformat, void* rawvalue1, void* rawvalue2, void* fmtvalue);
uint32_t windowssys_windows_win32_system_performance_PdhCloseLog(void* hlog, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_performance_PdhCloseQuery(void* hquery);
uint32_t windowssys_windows_win32_system_performance_PdhCollectQueryData(void* hquery);
uint32_t windowssys_windows_win32_system_performance_PdhCollectQueryDataEx(void* hquery, uint32_t dwintervaltime, void* hnewdataevent);
uint32_t windowssys_windows_win32_system_performance_PdhCollectQueryDataWithTime(void* hquery, void* plltimestamp);
uint32_t windowssys_windows_win32_system_performance_PdhComputeCounterStatistics(void* hcounter, uint32_t dwformat, uint32_t dwfirstentry, uint32_t dwnumentries, void* lprawvaluearray, void* data);
uint32_t windowssys_windows_win32_system_performance_PdhConnectMachineA(void* szmachinename);
uint32_t windowssys_windows_win32_system_performance_PdhConnectMachineW(void* szmachinename);
uint32_t windowssys_windows_win32_system_performance_PdhCreateSQLTablesA(void* szdatasource);
uint32_t windowssys_windows_win32_system_performance_PdhCreateSQLTablesW(void* szdatasource);
uint32_t windowssys_windows_win32_system_performance_PdhEnumLogSetNamesA(void* szdatasource, void* mszdatasetnamelist, void* pcchbufferlength);
uint32_t windowssys_windows_win32_system_performance_PdhEnumLogSetNamesW(void* szdatasource, void* mszdatasetnamelist, void* pcchbufferlength);
uint32_t windowssys_windows_win32_system_performance_PdhEnumMachinesA(void* szdatasource, void* mszmachinelist, void* pcchbuffersize);
uint32_t windowssys_windows_win32_system_performance_PdhEnumMachinesHA(void* hdatasource, void* mszmachinelist, void* pcchbuffersize);
uint32_t windowssys_windows_win32_system_performance_PdhEnumMachinesHW(void* hdatasource, void* mszmachinelist, void* pcchbuffersize);
uint32_t windowssys_windows_win32_system_performance_PdhEnumMachinesW(void* szdatasource, void* mszmachinelist, void* pcchbuffersize);
uint32_t windowssys_windows_win32_system_performance_PdhEnumObjectItemsA(void* szdatasource, void* szmachinename, void* szobjectname, void* mszcounterlist, void* pcchcounterlistlength, void* mszinstancelist, void* pcchinstancelistlength, uint32_t dwdetaillevel, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_performance_PdhEnumObjectItemsHA(void* hdatasource, void* szmachinename, void* szobjectname, void* mszcounterlist, void* pcchcounterlistlength, void* mszinstancelist, void* pcchinstancelistlength, uint32_t dwdetaillevel, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_performance_PdhEnumObjectItemsHW(void* hdatasource, void* szmachinename, void* szobjectname, void* mszcounterlist, void* pcchcounterlistlength, void* mszinstancelist, void* pcchinstancelistlength, uint32_t dwdetaillevel, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_performance_PdhEnumObjectItemsW(void* szdatasource, void* szmachinename, void* szobjectname, void* mszcounterlist, void* pcchcounterlistlength, void* mszinstancelist, void* pcchinstancelistlength, uint32_t dwdetaillevel, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_performance_PdhEnumObjectsA(void* szdatasource, void* szmachinename, void* mszobjectlist, void* pcchbuffersize, uint32_t dwdetaillevel, int32_t brefresh);
uint32_t windowssys_windows_win32_system_performance_PdhEnumObjectsHA(void* hdatasource, void* szmachinename, void* mszobjectlist, void* pcchbuffersize, uint32_t dwdetaillevel, int32_t brefresh);
uint32_t windowssys_windows_win32_system_performance_PdhEnumObjectsHW(void* hdatasource, void* szmachinename, void* mszobjectlist, void* pcchbuffersize, uint32_t dwdetaillevel, int32_t brefresh);
uint32_t windowssys_windows_win32_system_performance_PdhEnumObjectsW(void* szdatasource, void* szmachinename, void* mszobjectlist, void* pcchbuffersize, uint32_t dwdetaillevel, int32_t brefresh);
uint32_t windowssys_windows_win32_system_performance_PdhExpandCounterPathA(void* szwildcardpath, void* mszexpandedpathlist, void* pcchpathlistlength);
uint32_t windowssys_windows_win32_system_performance_PdhExpandCounterPathW(void* szwildcardpath, void* mszexpandedpathlist, void* pcchpathlistlength);
uint32_t windowssys_windows_win32_system_performance_PdhExpandWildCardPathA(void* szdatasource, void* szwildcardpath, void* mszexpandedpathlist, void* pcchpathlistlength, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_performance_PdhExpandWildCardPathHA(void* hdatasource, void* szwildcardpath, void* mszexpandedpathlist, void* pcchpathlistlength, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_performance_PdhExpandWildCardPathHW(void* hdatasource, void* szwildcardpath, void* mszexpandedpathlist, void* pcchpathlistlength, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_performance_PdhExpandWildCardPathW(void* szdatasource, void* szwildcardpath, void* mszexpandedpathlist, void* pcchpathlistlength, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_performance_PdhFormatFromRawValue(uint32_t dwcountertype, uint32_t dwformat, void* ptimebase, void* prawvalue1, void* prawvalue2, void* pfmtvalue);
uint32_t windowssys_windows_win32_system_performance_PdhGetCounterInfoA(void* hcounter, bool bretrieveexplaintext, void* pdwbuffersize, void* lpbuffer);
uint32_t windowssys_windows_win32_system_performance_PdhGetCounterInfoW(void* hcounter, bool bretrieveexplaintext, void* pdwbuffersize, void* lpbuffer);
uint32_t windowssys_windows_win32_system_performance_PdhGetCounterTimeBase(void* hcounter, void* ptimebase);
uint32_t windowssys_windows_win32_system_performance_PdhGetDataSourceTimeRangeA(void* szdatasource, void* pdwnumentries, void* pinfo, void* pdwbuffersize);
uint32_t windowssys_windows_win32_system_performance_PdhGetDataSourceTimeRangeH(void* hdatasource, void* pdwnumentries, void* pinfo, void* pdwbuffersize);
uint32_t windowssys_windows_win32_system_performance_PdhGetDataSourceTimeRangeW(void* szdatasource, void* pdwnumentries, void* pinfo, void* pdwbuffersize);
uint32_t windowssys_windows_win32_system_performance_PdhGetDefaultPerfCounterA(void* szdatasource, void* szmachinename, void* szobjectname, void* szdefaultcountername, void* pcchbuffersize);
uint32_t windowssys_windows_win32_system_performance_PdhGetDefaultPerfCounterHA(void* hdatasource, void* szmachinename, void* szobjectname, void* szdefaultcountername, void* pcchbuffersize);
uint32_t windowssys_windows_win32_system_performance_PdhGetDefaultPerfCounterHW(void* hdatasource, void* szmachinename, void* szobjectname, void* szdefaultcountername, void* pcchbuffersize);
uint32_t windowssys_windows_win32_system_performance_PdhGetDefaultPerfCounterW(void* szdatasource, void* szmachinename, void* szobjectname, void* szdefaultcountername, void* pcchbuffersize);
uint32_t windowssys_windows_win32_system_performance_PdhGetDefaultPerfObjectA(void* szdatasource, void* szmachinename, void* szdefaultobjectname, void* pcchbuffersize);
uint32_t windowssys_windows_win32_system_performance_PdhGetDefaultPerfObjectHA(void* hdatasource, void* szmachinename, void* szdefaultobjectname, void* pcchbuffersize);
uint32_t windowssys_windows_win32_system_performance_PdhGetDefaultPerfObjectHW(void* hdatasource, void* szmachinename, void* szdefaultobjectname, void* pcchbuffersize);
uint32_t windowssys_windows_win32_system_performance_PdhGetDefaultPerfObjectW(void* szdatasource, void* szmachinename, void* szdefaultobjectname, void* pcchbuffersize);
uint32_t windowssys_windows_win32_system_performance_PdhGetDllVersion(void* lpdwversion);
uint32_t windowssys_windows_win32_system_performance_PdhGetFormattedCounterArrayA(void* hcounter, uint32_t dwformat, void* lpdwbuffersize, void* lpdwitemcount, void* itembuffer);
uint32_t windowssys_windows_win32_system_performance_PdhGetFormattedCounterArrayW(void* hcounter, uint32_t dwformat, void* lpdwbuffersize, void* lpdwitemcount, void* itembuffer);
uint32_t windowssys_windows_win32_system_performance_PdhGetFormattedCounterValue(void* hcounter, uint32_t dwformat, void* lpdwtype, void* pvalue);
uint32_t windowssys_windows_win32_system_performance_PdhGetLogFileSize(void* hlog, void* llsize);
uint32_t windowssys_windows_win32_system_performance_PdhGetLogSetGUID(void* hlog, void* pguid, void* prunid);
uint32_t windowssys_windows_win32_system_performance_PdhGetRawCounterArrayA(void* hcounter, void* lpdwbuffersize, void* lpdwitemcount, void* itembuffer);
uint32_t windowssys_windows_win32_system_performance_PdhGetRawCounterArrayW(void* hcounter, void* lpdwbuffersize, void* lpdwitemcount, void* itembuffer);
uint32_t windowssys_windows_win32_system_performance_PdhGetRawCounterValue(void* hcounter, void* lpdwtype, void* pvalue);
int32_t windowssys_windows_win32_system_performance_PdhIsRealTimeQuery(void* hquery);
uint32_t windowssys_windows_win32_system_performance_PdhLookupPerfIndexByNameA(void* szmachinename, void* sznamebuffer, void* pdwindex);
uint32_t windowssys_windows_win32_system_performance_PdhLookupPerfIndexByNameW(void* szmachinename, void* sznamebuffer, void* pdwindex);
uint32_t windowssys_windows_win32_system_performance_PdhLookupPerfNameByIndexA(void* szmachinename, uint32_t dwnameindex, void* sznamebuffer, void* pcchnamebuffersize);
uint32_t windowssys_windows_win32_system_performance_PdhLookupPerfNameByIndexW(void* szmachinename, uint32_t dwnameindex, void* sznamebuffer, void* pcchnamebuffersize);
uint32_t windowssys_windows_win32_system_performance_PdhMakeCounterPathA(void* pcounterpathelements, void* szfullpathbuffer, void* pcchbuffersize, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_performance_PdhMakeCounterPathW(void* pcounterpathelements, void* szfullpathbuffer, void* pcchbuffersize, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_performance_PdhOpenLogA(void* szlogfilename, uint32_t dwaccessflags, void* lpdwlogtype, void* hquery, uint32_t dwmaxsize, void* szusercaption, void* phlog);
uint32_t windowssys_windows_win32_system_performance_PdhOpenLogW(void* szlogfilename, uint32_t dwaccessflags, void* lpdwlogtype, void* hquery, uint32_t dwmaxsize, void* szusercaption, void* phlog);
uint32_t windowssys_windows_win32_system_performance_PdhOpenQueryA(void* szdatasource, uint64_t dwuserdata, void* phquery);
uint32_t windowssys_windows_win32_system_performance_PdhOpenQueryH(void* hdatasource, uint64_t dwuserdata, void* phquery);
uint32_t windowssys_windows_win32_system_performance_PdhOpenQueryW(void* szdatasource, uint64_t dwuserdata, void* phquery);
uint32_t windowssys_windows_win32_system_performance_PdhParseCounterPathA(void* szfullpathbuffer, void* pcounterpathelements, void* pdwbuffersize, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_performance_PdhParseCounterPathW(void* szfullpathbuffer, void* pcounterpathelements, void* pdwbuffersize, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_performance_PdhParseInstanceNameA(void* szinstancestring, void* szinstancename, void* pcchinstancenamelength, void* szparentname, void* pcchparentnamelength, void* lpindex);
uint32_t windowssys_windows_win32_system_performance_PdhParseInstanceNameW(void* szinstancestring, void* szinstancename, void* pcchinstancenamelength, void* szparentname, void* pcchparentnamelength, void* lpindex);
uint32_t windowssys_windows_win32_system_performance_PdhRemoveCounter(void* hcounter);
uint32_t windowssys_windows_win32_system_performance_PdhSelectDataSourceA(void* hwndowner, uint32_t dwflags, void* szdatasource, void* pcchbufferlength);
uint32_t windowssys_windows_win32_system_performance_PdhSelectDataSourceW(void* hwndowner, uint32_t dwflags, void* szdatasource, void* pcchbufferlength);
uint32_t windowssys_windows_win32_system_performance_PdhSetCounterScaleFactor(void* hcounter, int32_t lfactor);
uint32_t windowssys_windows_win32_system_performance_PdhSetDefaultRealTimeDataSource(uint32_t dwdatasourceid);
uint32_t windowssys_windows_win32_system_performance_PdhSetLogSetRunID(void* hlog, int32_t runid);
uint32_t windowssys_windows_win32_system_performance_PdhSetQueryTimeRange(void* hquery, void* pinfo);
uint32_t windowssys_windows_win32_system_performance_PdhUpdateLogA(void* hlog, void* szuserstring);
uint32_t windowssys_windows_win32_system_performance_PdhUpdateLogFileCatalog(void* hlog);
uint32_t windowssys_windows_win32_system_performance_PdhUpdateLogW(void* hlog, void* szuserstring);
uint32_t windowssys_windows_win32_system_performance_PdhValidatePathA(void* szfullpathbuffer);
uint32_t windowssys_windows_win32_system_performance_PdhValidatePathExA(void* hdatasource, void* szfullpathbuffer);
uint32_t windowssys_windows_win32_system_performance_PdhValidatePathExW(void* hdatasource, void* szfullpathbuffer);
uint32_t windowssys_windows_win32_system_performance_PdhValidatePathW(void* szfullpathbuffer);
uint32_t windowssys_windows_win32_system_performance_PdhVerifySQLDBA(void* szdatasource);
uint32_t windowssys_windows_win32_system_performance_PdhVerifySQLDBW(void* szdatasource);
uint32_t windowssys_windows_win32_system_performance_PerfAddCounters(void* hquery, void* pcounters, uint32_t cbcounters);
uint32_t windowssys_windows_win32_system_performance_PerfCloseQueryHandle(void* hquery);
void* windowssys_windows_win32_system_performance_PerfCreateInstance(void* providerhandle, void* countersetguid, void* name, uint32_t id);
uint32_t windowssys_windows_win32_system_performance_PerfDecrementULongCounterValue(void* provider, void* instance, uint32_t counterid, uint32_t value);
uint32_t windowssys_windows_win32_system_performance_PerfDecrementULongLongCounterValue(void* provider, void* instance, uint32_t counterid, uint64_t value);
uint32_t windowssys_windows_win32_system_performance_PerfDeleteCounters(void* hquery, void* pcounters, uint32_t cbcounters);
uint32_t windowssys_windows_win32_system_performance_PerfDeleteInstance(void* provider, void* instanceblock);
uint32_t windowssys_windows_win32_system_performance_PerfEnumerateCounterSet(void* szmachine, void* pcountersetids, uint32_t ccountersetids, void* pccountersetidsactual);
uint32_t windowssys_windows_win32_system_performance_PerfEnumerateCounterSetInstances(void* szmachine, void* pcountersetid, void* pinstances, uint32_t cbinstances, void* pcbinstancesactual);
uint32_t windowssys_windows_win32_system_performance_PerfIncrementULongCounterValue(void* provider, void* instance, uint32_t counterid, uint32_t value);
uint32_t windowssys_windows_win32_system_performance_PerfIncrementULongLongCounterValue(void* provider, void* instance, uint32_t counterid, uint64_t value);
uint32_t windowssys_windows_win32_system_performance_PerfOpenQueryHandle(void* szmachine, void* phquery);
uint32_t windowssys_windows_win32_system_performance_PerfQueryCounterData(void* hquery, void* pcounterblock, uint32_t cbcounterblock, void* pcbcounterblockactual);
uint32_t windowssys_windows_win32_system_performance_PerfQueryCounterInfo(void* hquery, void* pcounters, uint32_t cbcounters, void* pcbcountersactual);
uint32_t windowssys_windows_win32_system_performance_PerfQueryCounterSetRegistrationInfo(void* szmachine, void* pcountersetid, int32_t requestcode, uint32_t requestlangid, void* pbreginfo, uint32_t cbreginfo, void* pcbreginfoactual);
void* windowssys_windows_win32_system_performance_PerfQueryInstance(void* providerhandle, void* countersetguid, void* name, uint32_t id);
uint32_t windowssys_windows_win32_system_performance_PerfSetCounterRefValue(void* provider, void* instance, uint32_t counterid, void* address);
uint32_t windowssys_windows_win32_system_performance_PerfSetCounterSetInfo(void* providerhandle, void* arg_1_template, uint32_t templatesize);
uint32_t windowssys_windows_win32_system_performance_PerfSetULongCounterValue(void* provider, void* instance, uint32_t counterid, uint32_t value);
uint32_t windowssys_windows_win32_system_performance_PerfSetULongLongCounterValue(void* provider, void* instance, uint32_t counterid, uint64_t value);
uint32_t windowssys_windows_win32_system_performance_PerfStartProvider(void* providerguid, void* controlcallback, void* phprovider);
uint32_t windowssys_windows_win32_system_performance_PerfStartProviderEx(void* providerguid, void* providercontext, void* provider);
uint32_t windowssys_windows_win32_system_performance_PerfStopProvider(void* providerhandle);
int32_t windowssys_windows_win32_system_performance_QueryPerformanceCounter(void* lpperformancecount);
int32_t windowssys_windows_win32_system_performance_QueryPerformanceFrequency(void* lpfrequency);
uint32_t windowssys_windows_win32_system_performance_RestorePerfRegistryFromFileW(void* szfilename, void* szlangid);
uint32_t windowssys_windows_win32_system_performance_SetServiceAsTrustedA(void* szreserved, void* szservicename);
uint32_t windowssys_windows_win32_system_performance_SetServiceAsTrustedW(void* szreserved, void* szservicename);
uint32_t windowssys_windows_win32_system_performance_UnloadPerfCounterTextStringsA(void* lpcommandline, int32_t bquietmodearg);
uint32_t windowssys_windows_win32_system_performance_UnloadPerfCounterTextStringsW(void* lpcommandline, int32_t bquietmodearg);
uint32_t windowssys_windows_win32_system_performance_UpdatePerfNameFilesA(void* sznewctrfilepath, void* sznewhlpfilepath, void* szlanguageid, uint64_t dwflags);
uint32_t windowssys_windows_win32_system_performance_UpdatePerfNameFilesW(void* sznewctrfilepath, void* sznewhlpfilepath, void* szlanguageid, uint64_t dwflags);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PERFORMANCE_WINDOWS_WIN32_SYSTEM_PERFORMANCE_WRAPPER_H */
