#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PERFORMANCE_WINDOWS_WIN32_SYSTEM_PERFORMANCE_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PERFORMANCE_WINDOWS_WIN32_SYSTEM_PERFORMANCE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_system_performance_backupPerfRegistryToFileW(void* szfilename, void* szcommentstring);
uint32_t windowssys_windows_win32_system_performance_installPerfDllA(void* szcomputername, void* lpinifile, uint64_t dwflags);
uint32_t windowssys_windows_win32_system_performance_installPerfDllW(void* szcomputername, void* lpinifile, uint64_t dwflags);
uint32_t windowssys_windows_win32_system_performance_loadPerfCounterTextStringsA(void* lpcommandline, int32_t bquietmodearg);
uint32_t windowssys_windows_win32_system_performance_loadPerfCounterTextStringsW(void* lpcommandline, int32_t bquietmodearg);
uint32_t windowssys_windows_win32_system_performance_pdhAddCounterA(void* hquery, void* szfullcounterpath, uint64_t dwuserdata, void* phcounter);
uint32_t windowssys_windows_win32_system_performance_pdhAddCounterW(void* hquery, void* szfullcounterpath, uint64_t dwuserdata, void* phcounter);
uint32_t windowssys_windows_win32_system_performance_pdhAddEnglishCounterA(void* hquery, void* szfullcounterpath, uint64_t dwuserdata, void* phcounter);
uint32_t windowssys_windows_win32_system_performance_pdhAddEnglishCounterW(void* hquery, void* szfullcounterpath, uint64_t dwuserdata, void* phcounter);
uint32_t windowssys_windows_win32_system_performance_pdhBindInputDataSourceA(void* phdatasource, void* logfilenamelist);
uint32_t windowssys_windows_win32_system_performance_pdhBindInputDataSourceW(void* phdatasource, void* logfilenamelist);
uint32_t windowssys_windows_win32_system_performance_pdhBrowseCountersA(void* pbrowsedlgdata);
uint32_t windowssys_windows_win32_system_performance_pdhBrowseCountersHA(void* pbrowsedlgdata);
uint32_t windowssys_windows_win32_system_performance_pdhBrowseCountersHW(void* pbrowsedlgdata);
uint32_t windowssys_windows_win32_system_performance_pdhBrowseCountersW(void* pbrowsedlgdata);
uint32_t windowssys_windows_win32_system_performance_pdhCalculateCounterFromRawValue(void* hcounter, uint32_t dwformat, void* rawvalue1, void* rawvalue2, void* fmtvalue);
uint32_t windowssys_windows_win32_system_performance_pdhCloseLog(void* hlog, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_performance_pdhCloseQuery(void* hquery);
uint32_t windowssys_windows_win32_system_performance_pdhCollectQueryData(void* hquery);
uint32_t windowssys_windows_win32_system_performance_pdhCollectQueryDataEx(void* hquery, uint32_t dwintervaltime, void* hnewdataevent);
uint32_t windowssys_windows_win32_system_performance_pdhCollectQueryDataWithTime(void* hquery, void* plltimestamp);
uint32_t windowssys_windows_win32_system_performance_pdhComputeCounterStatistics(void* hcounter, uint32_t dwformat, uint32_t dwfirstentry, uint32_t dwnumentries, void* lprawvaluearray, void* data);
uint32_t windowssys_windows_win32_system_performance_pdhConnectMachineA(void* szmachinename);
uint32_t windowssys_windows_win32_system_performance_pdhConnectMachineW(void* szmachinename);
uint32_t windowssys_windows_win32_system_performance_pdhCreateSQLTablesA(void* szdatasource);
uint32_t windowssys_windows_win32_system_performance_pdhCreateSQLTablesW(void* szdatasource);
uint32_t windowssys_windows_win32_system_performance_pdhEnumLogSetNamesA(void* szdatasource, void* mszdatasetnamelist, void* pcchbufferlength);
uint32_t windowssys_windows_win32_system_performance_pdhEnumLogSetNamesW(void* szdatasource, void* mszdatasetnamelist, void* pcchbufferlength);
uint32_t windowssys_windows_win32_system_performance_pdhEnumMachinesA(void* szdatasource, void* mszmachinelist, void* pcchbuffersize);
uint32_t windowssys_windows_win32_system_performance_pdhEnumMachinesHA(void* hdatasource, void* mszmachinelist, void* pcchbuffersize);
uint32_t windowssys_windows_win32_system_performance_pdhEnumMachinesHW(void* hdatasource, void* mszmachinelist, void* pcchbuffersize);
uint32_t windowssys_windows_win32_system_performance_pdhEnumMachinesW(void* szdatasource, void* mszmachinelist, void* pcchbuffersize);
uint32_t windowssys_windows_win32_system_performance_pdhEnumObjectItemsA(void* szdatasource, void* szmachinename, void* szobjectname, void* mszcounterlist, void* pcchcounterlistlength, void* mszinstancelist, void* pcchinstancelistlength, uint32_t dwdetaillevel, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_performance_pdhEnumObjectItemsHA(void* hdatasource, void* szmachinename, void* szobjectname, void* mszcounterlist, void* pcchcounterlistlength, void* mszinstancelist, void* pcchinstancelistlength, uint32_t dwdetaillevel, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_performance_pdhEnumObjectItemsHW(void* hdatasource, void* szmachinename, void* szobjectname, void* mszcounterlist, void* pcchcounterlistlength, void* mszinstancelist, void* pcchinstancelistlength, uint32_t dwdetaillevel, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_performance_pdhEnumObjectItemsW(void* szdatasource, void* szmachinename, void* szobjectname, void* mszcounterlist, void* pcchcounterlistlength, void* mszinstancelist, void* pcchinstancelistlength, uint32_t dwdetaillevel, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_performance_pdhEnumObjectsA(void* szdatasource, void* szmachinename, void* mszobjectlist, void* pcchbuffersize, uint32_t dwdetaillevel, int32_t brefresh);
uint32_t windowssys_windows_win32_system_performance_pdhEnumObjectsHA(void* hdatasource, void* szmachinename, void* mszobjectlist, void* pcchbuffersize, uint32_t dwdetaillevel, int32_t brefresh);
uint32_t windowssys_windows_win32_system_performance_pdhEnumObjectsHW(void* hdatasource, void* szmachinename, void* mszobjectlist, void* pcchbuffersize, uint32_t dwdetaillevel, int32_t brefresh);
uint32_t windowssys_windows_win32_system_performance_pdhEnumObjectsW(void* szdatasource, void* szmachinename, void* mszobjectlist, void* pcchbuffersize, uint32_t dwdetaillevel, int32_t brefresh);
uint32_t windowssys_windows_win32_system_performance_pdhExpandCounterPathA(void* szwildcardpath, void* mszexpandedpathlist, void* pcchpathlistlength);
uint32_t windowssys_windows_win32_system_performance_pdhExpandCounterPathW(void* szwildcardpath, void* mszexpandedpathlist, void* pcchpathlistlength);
uint32_t windowssys_windows_win32_system_performance_pdhExpandWildCardPathA(void* szdatasource, void* szwildcardpath, void* mszexpandedpathlist, void* pcchpathlistlength, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_performance_pdhExpandWildCardPathHA(void* hdatasource, void* szwildcardpath, void* mszexpandedpathlist, void* pcchpathlistlength, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_performance_pdhExpandWildCardPathHW(void* hdatasource, void* szwildcardpath, void* mszexpandedpathlist, void* pcchpathlistlength, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_performance_pdhExpandWildCardPathW(void* szdatasource, void* szwildcardpath, void* mszexpandedpathlist, void* pcchpathlistlength, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_performance_pdhFormatFromRawValue(uint32_t dwcountertype, uint32_t dwformat, void* ptimebase, void* prawvalue1, void* prawvalue2, void* pfmtvalue);
uint32_t windowssys_windows_win32_system_performance_pdhGetCounterInfoA(void* hcounter, bool bretrieveexplaintext, void* pdwbuffersize, void* lpbuffer);
uint32_t windowssys_windows_win32_system_performance_pdhGetCounterInfoW(void* hcounter, bool bretrieveexplaintext, void* pdwbuffersize, void* lpbuffer);
uint32_t windowssys_windows_win32_system_performance_pdhGetCounterTimeBase(void* hcounter, void* ptimebase);
uint32_t windowssys_windows_win32_system_performance_pdhGetDataSourceTimeRangeA(void* szdatasource, void* pdwnumentries, void* pinfo, void* pdwbuffersize);
uint32_t windowssys_windows_win32_system_performance_pdhGetDataSourceTimeRangeH(void* hdatasource, void* pdwnumentries, void* pinfo, void* pdwbuffersize);
uint32_t windowssys_windows_win32_system_performance_pdhGetDataSourceTimeRangeW(void* szdatasource, void* pdwnumentries, void* pinfo, void* pdwbuffersize);
uint32_t windowssys_windows_win32_system_performance_pdhGetDefaultPerfCounterA(void* szdatasource, void* szmachinename, void* szobjectname, void* szdefaultcountername, void* pcchbuffersize);
uint32_t windowssys_windows_win32_system_performance_pdhGetDefaultPerfCounterHA(void* hdatasource, void* szmachinename, void* szobjectname, void* szdefaultcountername, void* pcchbuffersize);
uint32_t windowssys_windows_win32_system_performance_pdhGetDefaultPerfCounterHW(void* hdatasource, void* szmachinename, void* szobjectname, void* szdefaultcountername, void* pcchbuffersize);
uint32_t windowssys_windows_win32_system_performance_pdhGetDefaultPerfCounterW(void* szdatasource, void* szmachinename, void* szobjectname, void* szdefaultcountername, void* pcchbuffersize);
uint32_t windowssys_windows_win32_system_performance_pdhGetDefaultPerfObjectA(void* szdatasource, void* szmachinename, void* szdefaultobjectname, void* pcchbuffersize);
uint32_t windowssys_windows_win32_system_performance_pdhGetDefaultPerfObjectHA(void* hdatasource, void* szmachinename, void* szdefaultobjectname, void* pcchbuffersize);
uint32_t windowssys_windows_win32_system_performance_pdhGetDefaultPerfObjectHW(void* hdatasource, void* szmachinename, void* szdefaultobjectname, void* pcchbuffersize);
uint32_t windowssys_windows_win32_system_performance_pdhGetDefaultPerfObjectW(void* szdatasource, void* szmachinename, void* szdefaultobjectname, void* pcchbuffersize);
uint32_t windowssys_windows_win32_system_performance_pdhGetDllVersion(void* lpdwversion);
uint32_t windowssys_windows_win32_system_performance_pdhGetFormattedCounterArrayA(void* hcounter, uint32_t dwformat, void* lpdwbuffersize, void* lpdwitemcount, void* itembuffer);
uint32_t windowssys_windows_win32_system_performance_pdhGetFormattedCounterArrayW(void* hcounter, uint32_t dwformat, void* lpdwbuffersize, void* lpdwitemcount, void* itembuffer);
uint32_t windowssys_windows_win32_system_performance_pdhGetFormattedCounterValue(void* hcounter, uint32_t dwformat, void* lpdwtype, void* pvalue);
uint32_t windowssys_windows_win32_system_performance_pdhGetLogFileSize(void* hlog, void* llsize);
uint32_t windowssys_windows_win32_system_performance_pdhGetLogSetGUID(void* hlog, void* pguid, void* prunid);
uint32_t windowssys_windows_win32_system_performance_pdhGetRawCounterArrayA(void* hcounter, void* lpdwbuffersize, void* lpdwitemcount, void* itembuffer);
uint32_t windowssys_windows_win32_system_performance_pdhGetRawCounterArrayW(void* hcounter, void* lpdwbuffersize, void* lpdwitemcount, void* itembuffer);
uint32_t windowssys_windows_win32_system_performance_pdhGetRawCounterValue(void* hcounter, void* lpdwtype, void* pvalue);
int32_t windowssys_windows_win32_system_performance_pdhIsRealTimeQuery(void* hquery);
uint32_t windowssys_windows_win32_system_performance_pdhLookupPerfIndexByNameA(void* szmachinename, void* sznamebuffer, void* pdwindex);
uint32_t windowssys_windows_win32_system_performance_pdhLookupPerfIndexByNameW(void* szmachinename, void* sznamebuffer, void* pdwindex);
uint32_t windowssys_windows_win32_system_performance_pdhLookupPerfNameByIndexA(void* szmachinename, uint32_t dwnameindex, void* sznamebuffer, void* pcchnamebuffersize);
uint32_t windowssys_windows_win32_system_performance_pdhLookupPerfNameByIndexW(void* szmachinename, uint32_t dwnameindex, void* sznamebuffer, void* pcchnamebuffersize);
uint32_t windowssys_windows_win32_system_performance_pdhMakeCounterPathA(void* pcounterpathelements, void* szfullpathbuffer, void* pcchbuffersize, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_performance_pdhMakeCounterPathW(void* pcounterpathelements, void* szfullpathbuffer, void* pcchbuffersize, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_performance_pdhOpenLogA(void* szlogfilename, uint32_t dwaccessflags, void* lpdwlogtype, void* hquery, uint32_t dwmaxsize, void* szusercaption, void* phlog);
uint32_t windowssys_windows_win32_system_performance_pdhOpenLogW(void* szlogfilename, uint32_t dwaccessflags, void* lpdwlogtype, void* hquery, uint32_t dwmaxsize, void* szusercaption, void* phlog);
uint32_t windowssys_windows_win32_system_performance_pdhOpenQueryA(void* szdatasource, uint64_t dwuserdata, void* phquery);
uint32_t windowssys_windows_win32_system_performance_pdhOpenQueryH(void* hdatasource, uint64_t dwuserdata, void* phquery);
uint32_t windowssys_windows_win32_system_performance_pdhOpenQueryW(void* szdatasource, uint64_t dwuserdata, void* phquery);
uint32_t windowssys_windows_win32_system_performance_pdhParseCounterPathA(void* szfullpathbuffer, void* pcounterpathelements, void* pdwbuffersize, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_performance_pdhParseCounterPathW(void* szfullpathbuffer, void* pcounterpathelements, void* pdwbuffersize, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_performance_pdhParseInstanceNameA(void* szinstancestring, void* szinstancename, void* pcchinstancenamelength, void* szparentname, void* pcchparentnamelength, void* lpindex);
uint32_t windowssys_windows_win32_system_performance_pdhParseInstanceNameW(void* szinstancestring, void* szinstancename, void* pcchinstancenamelength, void* szparentname, void* pcchparentnamelength, void* lpindex);
uint32_t windowssys_windows_win32_system_performance_pdhRemoveCounter(void* hcounter);
uint32_t windowssys_windows_win32_system_performance_pdhSelectDataSourceA(void* hwndowner, uint32_t dwflags, void* szdatasource, void* pcchbufferlength);
uint32_t windowssys_windows_win32_system_performance_pdhSelectDataSourceW(void* hwndowner, uint32_t dwflags, void* szdatasource, void* pcchbufferlength);
uint32_t windowssys_windows_win32_system_performance_pdhSetCounterScaleFactor(void* hcounter, int32_t lfactor);
uint32_t windowssys_windows_win32_system_performance_pdhSetDefaultRealTimeDataSource(uint32_t dwdatasourceid);
uint32_t windowssys_windows_win32_system_performance_pdhSetLogSetRunID(void* hlog, int32_t runid);
uint32_t windowssys_windows_win32_system_performance_pdhSetQueryTimeRange(void* hquery, void* pinfo);
uint32_t windowssys_windows_win32_system_performance_pdhUpdateLogA(void* hlog, void* szuserstring);
uint32_t windowssys_windows_win32_system_performance_pdhUpdateLogFileCatalog(void* hlog);
uint32_t windowssys_windows_win32_system_performance_pdhUpdateLogW(void* hlog, void* szuserstring);
uint32_t windowssys_windows_win32_system_performance_pdhValidatePathA(void* szfullpathbuffer);
uint32_t windowssys_windows_win32_system_performance_pdhValidatePathExA(void* hdatasource, void* szfullpathbuffer);
uint32_t windowssys_windows_win32_system_performance_pdhValidatePathExW(void* hdatasource, void* szfullpathbuffer);
uint32_t windowssys_windows_win32_system_performance_pdhValidatePathW(void* szfullpathbuffer);
uint32_t windowssys_windows_win32_system_performance_pdhVerifySQLDBA(void* szdatasource);
uint32_t windowssys_windows_win32_system_performance_pdhVerifySQLDBW(void* szdatasource);
uint32_t windowssys_windows_win32_system_performance_perfAddCounters(void* hquery, void* pcounters, uint32_t cbcounters);
uint32_t windowssys_windows_win32_system_performance_perfCloseQueryHandle(void* hquery);
void* windowssys_windows_win32_system_performance_perfCreateInstance(void* providerhandle, void* countersetguid, void* name, uint32_t id);
uint32_t windowssys_windows_win32_system_performance_perfDecrementULongCounterValue(void* provider, void* instance, uint32_t counterid, uint32_t value);
uint32_t windowssys_windows_win32_system_performance_perfDecrementULongLongCounterValue(void* provider, void* instance, uint32_t counterid, uint64_t value);
uint32_t windowssys_windows_win32_system_performance_perfDeleteCounters(void* hquery, void* pcounters, uint32_t cbcounters);
uint32_t windowssys_windows_win32_system_performance_perfDeleteInstance(void* provider, void* instanceblock);
uint32_t windowssys_windows_win32_system_performance_perfEnumerateCounterSet(void* szmachine, void* pcountersetids, uint32_t ccountersetids, void* pccountersetidsactual);
uint32_t windowssys_windows_win32_system_performance_perfEnumerateCounterSetInstances(void* szmachine, void* pcountersetid, void* pinstances, uint32_t cbinstances, void* pcbinstancesactual);
uint32_t windowssys_windows_win32_system_performance_perfIncrementULongCounterValue(void* provider, void* instance, uint32_t counterid, uint32_t value);
uint32_t windowssys_windows_win32_system_performance_perfIncrementULongLongCounterValue(void* provider, void* instance, uint32_t counterid, uint64_t value);
uint32_t windowssys_windows_win32_system_performance_perfOpenQueryHandle(void* szmachine, void* phquery);
uint32_t windowssys_windows_win32_system_performance_perfQueryCounterData(void* hquery, void* pcounterblock, uint32_t cbcounterblock, void* pcbcounterblockactual);
uint32_t windowssys_windows_win32_system_performance_perfQueryCounterInfo(void* hquery, void* pcounters, uint32_t cbcounters, void* pcbcountersactual);
uint32_t windowssys_windows_win32_system_performance_perfQueryCounterSetRegistrationInfo(void* szmachine, void* pcountersetid, int32_t requestcode, uint32_t requestlangid, void* pbreginfo, uint32_t cbreginfo, void* pcbreginfoactual);
void* windowssys_windows_win32_system_performance_perfQueryInstance(void* providerhandle, void* countersetguid, void* name, uint32_t id);
uint32_t windowssys_windows_win32_system_performance_perfSetCounterRefValue(void* provider, void* instance, uint32_t counterid, void* address);
uint32_t windowssys_windows_win32_system_performance_perfSetCounterSetInfo(void* providerhandle, void* arg_1_template, uint32_t templatesize);
uint32_t windowssys_windows_win32_system_performance_perfSetULongCounterValue(void* provider, void* instance, uint32_t counterid, uint32_t value);
uint32_t windowssys_windows_win32_system_performance_perfSetULongLongCounterValue(void* provider, void* instance, uint32_t counterid, uint64_t value);
uint32_t windowssys_windows_win32_system_performance_perfStartProvider(void* providerguid, void* controlcallback, void* phprovider);
uint32_t windowssys_windows_win32_system_performance_perfStartProviderEx(void* providerguid, void* providercontext, void* provider);
uint32_t windowssys_windows_win32_system_performance_perfStopProvider(void* providerhandle);
int32_t windowssys_windows_win32_system_performance_queryPerformanceCounter(void* lpperformancecount);
int32_t windowssys_windows_win32_system_performance_queryPerformanceFrequency(void* lpfrequency);
uint32_t windowssys_windows_win32_system_performance_restorePerfRegistryFromFileW(void* szfilename, void* szlangid);
uint32_t windowssys_windows_win32_system_performance_setServiceAsTrustedA(void* szreserved, void* szservicename);
uint32_t windowssys_windows_win32_system_performance_setServiceAsTrustedW(void* szreserved, void* szservicename);
uint32_t windowssys_windows_win32_system_performance_unloadPerfCounterTextStringsA(void* lpcommandline, int32_t bquietmodearg);
uint32_t windowssys_windows_win32_system_performance_unloadPerfCounterTextStringsW(void* lpcommandline, int32_t bquietmodearg);
uint32_t windowssys_windows_win32_system_performance_updatePerfNameFilesA(void* sznewctrfilepath, void* sznewhlpfilepath, void* szlanguageid, uint64_t dwflags);
uint32_t windowssys_windows_win32_system_performance_updatePerfNameFilesW(void* sznewctrfilepath, void* sznewhlpfilepath, void* szlanguageid, uint64_t dwflags);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PERFORMANCE_WINDOWS_WIN32_SYSTEM_PERFORMANCE_WRAPPER_H */
