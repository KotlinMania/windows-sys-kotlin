#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PERFORMANCE_WINDOWS_WIN32_SYSTEM_PERFORMANCE_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PERFORMANCE_WINDOWS_WIN32_SYSTEM_PERFORMANCE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssysWindowsWin32SystemPerformanceBackupPerfRegistryToFileW(void* szfilename, void* szcommentstring);
uint32_t windowssysWindowsWin32SystemPerformanceInstallPerfDllA(void* szcomputername, void* lpinifile, uint64_t dwflags);
uint32_t windowssysWindowsWin32SystemPerformanceInstallPerfDllW(void* szcomputername, void* lpinifile, uint64_t dwflags);
uint32_t windowssysWindowsWin32SystemPerformanceLoadPerfCounterTextStringsA(void* lpcommandline, int32_t bquietmodearg);
uint32_t windowssysWindowsWin32SystemPerformanceLoadPerfCounterTextStringsW(void* lpcommandline, int32_t bquietmodearg);
uint32_t windowssysWindowsWin32SystemPerformancePdhAddCounterA(void* hquery, void* szfullcounterpath, uint64_t dwuserdata, void* phcounter);
uint32_t windowssysWindowsWin32SystemPerformancePdhAddCounterW(void* hquery, void* szfullcounterpath, uint64_t dwuserdata, void* phcounter);
uint32_t windowssysWindowsWin32SystemPerformancePdhAddEnglishCounterA(void* hquery, void* szfullcounterpath, uint64_t dwuserdata, void* phcounter);
uint32_t windowssysWindowsWin32SystemPerformancePdhAddEnglishCounterW(void* hquery, void* szfullcounterpath, uint64_t dwuserdata, void* phcounter);
uint32_t windowssysWindowsWin32SystemPerformancePdhBindInputDataSourceA(void* phdatasource, void* logfilenamelist);
uint32_t windowssysWindowsWin32SystemPerformancePdhBindInputDataSourceW(void* phdatasource, void* logfilenamelist);
uint32_t windowssysWindowsWin32SystemPerformancePdhBrowseCountersA(void* pbrowsedlgdata);
uint32_t windowssysWindowsWin32SystemPerformancePdhBrowseCountersHA(void* pbrowsedlgdata);
uint32_t windowssysWindowsWin32SystemPerformancePdhBrowseCountersHW(void* pbrowsedlgdata);
uint32_t windowssysWindowsWin32SystemPerformancePdhBrowseCountersW(void* pbrowsedlgdata);
uint32_t windowssysWindowsWin32SystemPerformancePdhCalculateCounterFromRawValue(void* hcounter, uint32_t dwformat, void* rawvalue1, void* rawvalue2, void* fmtvalue);
uint32_t windowssysWindowsWin32SystemPerformancePdhCloseLog(void* hlog, uint32_t dwflags);
uint32_t windowssysWindowsWin32SystemPerformancePdhCloseQuery(void* hquery);
uint32_t windowssysWindowsWin32SystemPerformancePdhCollectQueryData(void* hquery);
uint32_t windowssysWindowsWin32SystemPerformancePdhCollectQueryDataEx(void* hquery, uint32_t dwintervaltime, void* hnewdataevent);
uint32_t windowssysWindowsWin32SystemPerformancePdhCollectQueryDataWithTime(void* hquery, void* plltimestamp);
uint32_t windowssysWindowsWin32SystemPerformancePdhComputeCounterStatistics(void* hcounter, uint32_t dwformat, uint32_t dwfirstentry, uint32_t dwnumentries, void* lprawvaluearray, void* data);
uint32_t windowssysWindowsWin32SystemPerformancePdhConnectMachineA(void* szmachinename);
uint32_t windowssysWindowsWin32SystemPerformancePdhConnectMachineW(void* szmachinename);
uint32_t windowssysWindowsWin32SystemPerformancePdhCreateSQLTablesA(void* szdatasource);
uint32_t windowssysWindowsWin32SystemPerformancePdhCreateSQLTablesW(void* szdatasource);
uint32_t windowssysWindowsWin32SystemPerformancePdhEnumLogSetNamesA(void* szdatasource, void* mszdatasetnamelist, void* pcchbufferlength);
uint32_t windowssysWindowsWin32SystemPerformancePdhEnumLogSetNamesW(void* szdatasource, void* mszdatasetnamelist, void* pcchbufferlength);
uint32_t windowssysWindowsWin32SystemPerformancePdhEnumMachinesA(void* szdatasource, void* mszmachinelist, void* pcchbuffersize);
uint32_t windowssysWindowsWin32SystemPerformancePdhEnumMachinesHA(void* hdatasource, void* mszmachinelist, void* pcchbuffersize);
uint32_t windowssysWindowsWin32SystemPerformancePdhEnumMachinesHW(void* hdatasource, void* mszmachinelist, void* pcchbuffersize);
uint32_t windowssysWindowsWin32SystemPerformancePdhEnumMachinesW(void* szdatasource, void* mszmachinelist, void* pcchbuffersize);
uint32_t windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsA(void* szdatasource, void* szmachinename, void* szobjectname, void* mszcounterlist, void* pcchcounterlistlength, void* mszinstancelist, void* pcchinstancelistlength, uint32_t dwdetaillevel, uint32_t dwflags);
uint32_t windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsHA(void* hdatasource, void* szmachinename, void* szobjectname, void* mszcounterlist, void* pcchcounterlistlength, void* mszinstancelist, void* pcchinstancelistlength, uint32_t dwdetaillevel, uint32_t dwflags);
uint32_t windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsHW(void* hdatasource, void* szmachinename, void* szobjectname, void* mszcounterlist, void* pcchcounterlistlength, void* mszinstancelist, void* pcchinstancelistlength, uint32_t dwdetaillevel, uint32_t dwflags);
uint32_t windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsW(void* szdatasource, void* szmachinename, void* szobjectname, void* mszcounterlist, void* pcchcounterlistlength, void* mszinstancelist, void* pcchinstancelistlength, uint32_t dwdetaillevel, uint32_t dwflags);
uint32_t windowssysWindowsWin32SystemPerformancePdhEnumObjectsA(void* szdatasource, void* szmachinename, void* mszobjectlist, void* pcchbuffersize, uint32_t dwdetaillevel, int32_t brefresh);
uint32_t windowssysWindowsWin32SystemPerformancePdhEnumObjectsHA(void* hdatasource, void* szmachinename, void* mszobjectlist, void* pcchbuffersize, uint32_t dwdetaillevel, int32_t brefresh);
uint32_t windowssysWindowsWin32SystemPerformancePdhEnumObjectsHW(void* hdatasource, void* szmachinename, void* mszobjectlist, void* pcchbuffersize, uint32_t dwdetaillevel, int32_t brefresh);
uint32_t windowssysWindowsWin32SystemPerformancePdhEnumObjectsW(void* szdatasource, void* szmachinename, void* mszobjectlist, void* pcchbuffersize, uint32_t dwdetaillevel, int32_t brefresh);
uint32_t windowssysWindowsWin32SystemPerformancePdhExpandCounterPathA(void* szwildcardpath, void* mszexpandedpathlist, void* pcchpathlistlength);
uint32_t windowssysWindowsWin32SystemPerformancePdhExpandCounterPathW(void* szwildcardpath, void* mszexpandedpathlist, void* pcchpathlistlength);
uint32_t windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathA(void* szdatasource, void* szwildcardpath, void* mszexpandedpathlist, void* pcchpathlistlength, uint32_t dwflags);
uint32_t windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathHA(void* hdatasource, void* szwildcardpath, void* mszexpandedpathlist, void* pcchpathlistlength, uint32_t dwflags);
uint32_t windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathHW(void* hdatasource, void* szwildcardpath, void* mszexpandedpathlist, void* pcchpathlistlength, uint32_t dwflags);
uint32_t windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathW(void* szdatasource, void* szwildcardpath, void* mszexpandedpathlist, void* pcchpathlistlength, uint32_t dwflags);
uint32_t windowssysWindowsWin32SystemPerformancePdhFormatFromRawValue(uint32_t dwcountertype, uint32_t dwformat, void* ptimebase, void* prawvalue1, void* prawvalue2, void* pfmtvalue);
uint32_t windowssysWindowsWin32SystemPerformancePdhGetCounterInfoA(void* hcounter, bool bretrieveexplaintext, void* pdwbuffersize, void* lpbuffer);
uint32_t windowssysWindowsWin32SystemPerformancePdhGetCounterInfoW(void* hcounter, bool bretrieveexplaintext, void* pdwbuffersize, void* lpbuffer);
uint32_t windowssysWindowsWin32SystemPerformancePdhGetCounterTimeBase(void* hcounter, void* ptimebase);
uint32_t windowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeA(void* szdatasource, void* pdwnumentries, void* pinfo, void* pdwbuffersize);
uint32_t windowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeH(void* hdatasource, void* pdwnumentries, void* pinfo, void* pdwbuffersize);
uint32_t windowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeW(void* szdatasource, void* pdwnumentries, void* pinfo, void* pdwbuffersize);
uint32_t windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterA(void* szdatasource, void* szmachinename, void* szobjectname, void* szdefaultcountername, void* pcchbuffersize);
uint32_t windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterHA(void* hdatasource, void* szmachinename, void* szobjectname, void* szdefaultcountername, void* pcchbuffersize);
uint32_t windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterHW(void* hdatasource, void* szmachinename, void* szobjectname, void* szdefaultcountername, void* pcchbuffersize);
uint32_t windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterW(void* szdatasource, void* szmachinename, void* szobjectname, void* szdefaultcountername, void* pcchbuffersize);
uint32_t windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectA(void* szdatasource, void* szmachinename, void* szdefaultobjectname, void* pcchbuffersize);
uint32_t windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectHA(void* hdatasource, void* szmachinename, void* szdefaultobjectname, void* pcchbuffersize);
uint32_t windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectHW(void* hdatasource, void* szmachinename, void* szdefaultobjectname, void* pcchbuffersize);
uint32_t windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectW(void* szdatasource, void* szmachinename, void* szdefaultobjectname, void* pcchbuffersize);
uint32_t windowssysWindowsWin32SystemPerformancePdhGetDllVersion(void* lpdwversion);
uint32_t windowssysWindowsWin32SystemPerformancePdhGetFormattedCounterArrayA(void* hcounter, uint32_t dwformat, void* lpdwbuffersize, void* lpdwitemcount, void* itembuffer);
uint32_t windowssysWindowsWin32SystemPerformancePdhGetFormattedCounterArrayW(void* hcounter, uint32_t dwformat, void* lpdwbuffersize, void* lpdwitemcount, void* itembuffer);
uint32_t windowssysWindowsWin32SystemPerformancePdhGetFormattedCounterValue(void* hcounter, uint32_t dwformat, void* lpdwtype, void* pvalue);
uint32_t windowssysWindowsWin32SystemPerformancePdhGetLogFileSize(void* hlog, void* llsize);
uint32_t windowssysWindowsWin32SystemPerformancePdhGetLogSetGUID(void* hlog, void* pguid, void* prunid);
uint32_t windowssysWindowsWin32SystemPerformancePdhGetRawCounterArrayA(void* hcounter, void* lpdwbuffersize, void* lpdwitemcount, void* itembuffer);
uint32_t windowssysWindowsWin32SystemPerformancePdhGetRawCounterArrayW(void* hcounter, void* lpdwbuffersize, void* lpdwitemcount, void* itembuffer);
uint32_t windowssysWindowsWin32SystemPerformancePdhGetRawCounterValue(void* hcounter, void* lpdwtype, void* pvalue);
int32_t windowssysWindowsWin32SystemPerformancePdhIsRealTimeQuery(void* hquery);
uint32_t windowssysWindowsWin32SystemPerformancePdhLookupPerfIndexByNameA(void* szmachinename, void* sznamebuffer, void* pdwindex);
uint32_t windowssysWindowsWin32SystemPerformancePdhLookupPerfIndexByNameW(void* szmachinename, void* sznamebuffer, void* pdwindex);
uint32_t windowssysWindowsWin32SystemPerformancePdhLookupPerfNameByIndexA(void* szmachinename, uint32_t dwnameindex, void* sznamebuffer, void* pcchnamebuffersize);
uint32_t windowssysWindowsWin32SystemPerformancePdhLookupPerfNameByIndexW(void* szmachinename, uint32_t dwnameindex, void* sznamebuffer, void* pcchnamebuffersize);
uint32_t windowssysWindowsWin32SystemPerformancePdhMakeCounterPathA(void* pcounterpathelements, void* szfullpathbuffer, void* pcchbuffersize, uint32_t dwflags);
uint32_t windowssysWindowsWin32SystemPerformancePdhMakeCounterPathW(void* pcounterpathelements, void* szfullpathbuffer, void* pcchbuffersize, uint32_t dwflags);
uint32_t windowssysWindowsWin32SystemPerformancePdhOpenLogA(void* szlogfilename, uint32_t dwaccessflags, void* lpdwlogtype, void* hquery, uint32_t dwmaxsize, void* szusercaption, void* phlog);
uint32_t windowssysWindowsWin32SystemPerformancePdhOpenLogW(void* szlogfilename, uint32_t dwaccessflags, void* lpdwlogtype, void* hquery, uint32_t dwmaxsize, void* szusercaption, void* phlog);
uint32_t windowssysWindowsWin32SystemPerformancePdhOpenQueryA(void* szdatasource, uint64_t dwuserdata, void* phquery);
uint32_t windowssysWindowsWin32SystemPerformancePdhOpenQueryH(void* hdatasource, uint64_t dwuserdata, void* phquery);
uint32_t windowssysWindowsWin32SystemPerformancePdhOpenQueryW(void* szdatasource, uint64_t dwuserdata, void* phquery);
uint32_t windowssysWindowsWin32SystemPerformancePdhParseCounterPathA(void* szfullpathbuffer, void* pcounterpathelements, void* pdwbuffersize, uint32_t dwflags);
uint32_t windowssysWindowsWin32SystemPerformancePdhParseCounterPathW(void* szfullpathbuffer, void* pcounterpathelements, void* pdwbuffersize, uint32_t dwflags);
uint32_t windowssysWindowsWin32SystemPerformancePdhParseInstanceNameA(void* szinstancestring, void* szinstancename, void* pcchinstancenamelength, void* szparentname, void* pcchparentnamelength, void* lpindex);
uint32_t windowssysWindowsWin32SystemPerformancePdhParseInstanceNameW(void* szinstancestring, void* szinstancename, void* pcchinstancenamelength, void* szparentname, void* pcchparentnamelength, void* lpindex);
uint32_t windowssysWindowsWin32SystemPerformancePdhRemoveCounter(void* hcounter);
uint32_t windowssysWindowsWin32SystemPerformancePdhSelectDataSourceA(void* hwndowner, uint32_t dwflags, void* szdatasource, void* pcchbufferlength);
uint32_t windowssysWindowsWin32SystemPerformancePdhSelectDataSourceW(void* hwndowner, uint32_t dwflags, void* szdatasource, void* pcchbufferlength);
uint32_t windowssysWindowsWin32SystemPerformancePdhSetCounterScaleFactor(void* hcounter, int32_t lfactor);
uint32_t windowssysWindowsWin32SystemPerformancePdhSetDefaultRealTimeDataSource(uint32_t dwdatasourceid);
uint32_t windowssysWindowsWin32SystemPerformancePdhSetLogSetRunID(void* hlog, int32_t runid);
uint32_t windowssysWindowsWin32SystemPerformancePdhSetQueryTimeRange(void* hquery, void* pinfo);
uint32_t windowssysWindowsWin32SystemPerformancePdhUpdateLogA(void* hlog, void* szuserstring);
uint32_t windowssysWindowsWin32SystemPerformancePdhUpdateLogFileCatalog(void* hlog);
uint32_t windowssysWindowsWin32SystemPerformancePdhUpdateLogW(void* hlog, void* szuserstring);
uint32_t windowssysWindowsWin32SystemPerformancePdhValidatePathA(void* szfullpathbuffer);
uint32_t windowssysWindowsWin32SystemPerformancePdhValidatePathExA(void* hdatasource, void* szfullpathbuffer);
uint32_t windowssysWindowsWin32SystemPerformancePdhValidatePathExW(void* hdatasource, void* szfullpathbuffer);
uint32_t windowssysWindowsWin32SystemPerformancePdhValidatePathW(void* szfullpathbuffer);
uint32_t windowssysWindowsWin32SystemPerformancePdhVerifySQLDBA(void* szdatasource);
uint32_t windowssysWindowsWin32SystemPerformancePdhVerifySQLDBW(void* szdatasource);
uint32_t windowssysWindowsWin32SystemPerformancePerfAddCounters(void* hquery, void* pcounters, uint32_t cbcounters);
uint32_t windowssysWindowsWin32SystemPerformancePerfCloseQueryHandle(void* hquery);
void* windowssysWindowsWin32SystemPerformancePerfCreateInstance(void* providerhandle, void* countersetguid, void* name, uint32_t id);
uint32_t windowssysWindowsWin32SystemPerformancePerfDecrementULongCounterValue(void* provider, void* instance, uint32_t counterid, uint32_t value);
uint32_t windowssysWindowsWin32SystemPerformancePerfDecrementULongLongCounterValue(void* provider, void* instance, uint32_t counterid, uint64_t value);
uint32_t windowssysWindowsWin32SystemPerformancePerfDeleteCounters(void* hquery, void* pcounters, uint32_t cbcounters);
uint32_t windowssysWindowsWin32SystemPerformancePerfDeleteInstance(void* provider, void* instanceblock);
uint32_t windowssysWindowsWin32SystemPerformancePerfEnumerateCounterSet(void* szmachine, void* pcountersetids, uint32_t ccountersetids, void* pccountersetidsactual);
uint32_t windowssysWindowsWin32SystemPerformancePerfEnumerateCounterSetInstances(void* szmachine, void* pcountersetid, void* pinstances, uint32_t cbinstances, void* pcbinstancesactual);
uint32_t windowssysWindowsWin32SystemPerformancePerfIncrementULongCounterValue(void* provider, void* instance, uint32_t counterid, uint32_t value);
uint32_t windowssysWindowsWin32SystemPerformancePerfIncrementULongLongCounterValue(void* provider, void* instance, uint32_t counterid, uint64_t value);
uint32_t windowssysWindowsWin32SystemPerformancePerfOpenQueryHandle(void* szmachine, void* phquery);
uint32_t windowssysWindowsWin32SystemPerformancePerfQueryCounterData(void* hquery, void* pcounterblock, uint32_t cbcounterblock, void* pcbcounterblockactual);
uint32_t windowssysWindowsWin32SystemPerformancePerfQueryCounterInfo(void* hquery, void* pcounters, uint32_t cbcounters, void* pcbcountersactual);
uint32_t windowssysWindowsWin32SystemPerformancePerfQueryCounterSetRegistrationInfo(void* szmachine, void* pcountersetid, int32_t requestcode, uint32_t requestlangid, void* pbreginfo, uint32_t cbreginfo, void* pcbreginfoactual);
void* windowssysWindowsWin32SystemPerformancePerfQueryInstance(void* providerhandle, void* countersetguid, void* name, uint32_t id);
uint32_t windowssysWindowsWin32SystemPerformancePerfSetCounterRefValue(void* provider, void* instance, uint32_t counterid, void* address);
uint32_t windowssysWindowsWin32SystemPerformancePerfSetCounterSetInfo(void* providerhandle, void* arg1Template, uint32_t templatesize);
uint32_t windowssysWindowsWin32SystemPerformancePerfSetULongCounterValue(void* provider, void* instance, uint32_t counterid, uint32_t value);
uint32_t windowssysWindowsWin32SystemPerformancePerfSetULongLongCounterValue(void* provider, void* instance, uint32_t counterid, uint64_t value);
uint32_t windowssysWindowsWin32SystemPerformancePerfStartProvider(void* providerguid, void* controlcallback, void* phprovider);
uint32_t windowssysWindowsWin32SystemPerformancePerfStartProviderEx(void* providerguid, void* providercontext, void* provider);
uint32_t windowssysWindowsWin32SystemPerformancePerfStopProvider(void* providerhandle);
int32_t windowssysWindowsWin32SystemPerformanceQueryPerformanceCounter(void* lpperformancecount);
int32_t windowssysWindowsWin32SystemPerformanceQueryPerformanceFrequency(void* lpfrequency);
uint32_t windowssysWindowsWin32SystemPerformanceRestorePerfRegistryFromFileW(void* szfilename, void* szlangid);
uint32_t windowssysWindowsWin32SystemPerformanceSetServiceAsTrustedA(void* szreserved, void* szservicename);
uint32_t windowssysWindowsWin32SystemPerformanceSetServiceAsTrustedW(void* szreserved, void* szservicename);
uint32_t windowssysWindowsWin32SystemPerformanceUnloadPerfCounterTextStringsA(void* lpcommandline, int32_t bquietmodearg);
uint32_t windowssysWindowsWin32SystemPerformanceUnloadPerfCounterTextStringsW(void* lpcommandline, int32_t bquietmodearg);
uint32_t windowssysWindowsWin32SystemPerformanceUpdatePerfNameFilesA(void* sznewctrfilepath, void* sznewhlpfilepath, void* szlanguageid, uint64_t dwflags);
uint32_t windowssysWindowsWin32SystemPerformanceUpdatePerfNameFilesW(void* sznewctrfilepath, void* sznewhlpfilepath, void* szlanguageid, uint64_t dwflags);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PERFORMANCE_WINDOWS_WIN32_SYSTEM_PERFORMANCE_WRAPPER_H */
