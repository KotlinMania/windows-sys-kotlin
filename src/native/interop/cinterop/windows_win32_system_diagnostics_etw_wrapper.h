#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_ETW_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_ETW_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_ETW_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_ETW_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_system_diagnostics_etw_createTraceInstanceId(void* reghandle, void* instinfo);
int32_t windowssys_windows_win32_system_diagnostics_etw_cveEventWrite(void* cveid, void* additionaldetails);
uint32_t windowssys_windows_win32_system_diagnostics_etw_enumerateTraceGuids(void* guidpropertiesarray, uint32_t propertyarraycount, void* guidcount);
uint32_t windowssys_windows_win32_system_diagnostics_etw_enumerateTraceGuidsEx(int32_t tracequeryinfoclass, void* inbuffer, uint32_t inbuffersize, void* outbuffer, uint32_t outbuffersize, void* returnlength);
uint32_t windowssys_windows_win32_system_diagnostics_etw_eventAccessControl(void* guid, uint32_t operation, void* sid, uint32_t rights, bool allowordeny);
uint32_t windowssys_windows_win32_system_diagnostics_etw_eventAccessQuery(void* guid, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_diagnostics_etw_eventAccessRemove(void* guid);
uint32_t windowssys_windows_win32_system_diagnostics_etw_eventActivityIdControl(uint32_t controlcode, void* activityid);
bool windowssys_windows_win32_system_diagnostics_etw_eventEnabled(int64_t reghandle, void* eventdescriptor);
bool windowssys_windows_win32_system_diagnostics_etw_eventProviderEnabled(int64_t reghandle, uint8_t level, uint64_t keyword);
uint32_t windowssys_windows_win32_system_diagnostics_etw_eventRegister(void* providerid, void* enablecallback, void* callbackcontext, void* reghandle);
uint32_t windowssys_windows_win32_system_diagnostics_etw_eventSetInformation(int64_t reghandle, int32_t informationclass, void* eventinformation, uint32_t informationlength);
uint32_t windowssys_windows_win32_system_diagnostics_etw_eventUnregister(int64_t reghandle);
uint32_t windowssys_windows_win32_system_diagnostics_etw_eventWrite(int64_t reghandle, void* eventdescriptor, uint32_t userdatacount, void* userdata);
uint32_t windowssys_windows_win32_system_diagnostics_etw_eventWriteEx(int64_t reghandle, void* eventdescriptor, uint64_t filter, uint32_t flags, void* activityid, void* relatedactivityid, uint32_t userdatacount, void* userdata);
uint32_t windowssys_windows_win32_system_diagnostics_etw_eventWriteString(int64_t reghandle, uint8_t level, uint64_t keyword, void* string);
uint32_t windowssys_windows_win32_system_diagnostics_etw_eventWriteTransfer(int64_t reghandle, void* eventdescriptor, void* activityid, void* relatedactivityid, uint32_t userdatacount, void* userdata);
uint32_t windowssys_windows_win32_system_diagnostics_etw_getTraceEnableFlags(uint64_t tracehandle);
uint8_t windowssys_windows_win32_system_diagnostics_etw_getTraceEnableLevel(uint64_t tracehandle);
uint64_t windowssys_windows_win32_system_diagnostics_etw_getTraceLoggerHandle(void* buffer);
uint64_t windowssys_windows_win32_system_diagnostics_etw_openTraceFromBufferStream(void* options, void* buffercompletioncallback, void* buffercompletioncontext);
uint64_t windowssys_windows_win32_system_diagnostics_etw_openTraceFromFile(void* logfilename, void* options, void* logfileheader);
uint64_t windowssys_windows_win32_system_diagnostics_etw_openTraceFromRealTimeLogger(void* loggername, void* options, void* logfileheader);
uint64_t windowssys_windows_win32_system_diagnostics_etw_openTraceFromRealTimeLoggerWithAllocationOptions(void* loggername, void* options, uint64_t allocationsize, void* memorypartitionhandle, void* logfileheader);
uint32_t windowssys_windows_win32_system_diagnostics_etw_processTrace(void* handlearray, uint32_t handlecount, void* starttime, void* endtime);
uint32_t windowssys_windows_win32_system_diagnostics_etw_processTraceAddBufferToBufferStream(uint64_t tracehandle, void* buffer, uint32_t buffersize);
uint32_t windowssys_windows_win32_system_diagnostics_etw_processTraceBufferDecrementReference(void* buffer);
uint32_t windowssys_windows_win32_system_diagnostics_etw_processTraceBufferIncrementReference(uint64_t tracehandle, void* buffer);
uint32_t windowssys_windows_win32_system_diagnostics_etw_queryAllTracesA(void* propertyarray, uint32_t propertyarraycount, void* loggercount);
uint32_t windowssys_windows_win32_system_diagnostics_etw_queryAllTracesW(void* propertyarray, uint32_t propertyarraycount, void* loggercount);
uint32_t windowssys_windows_win32_system_diagnostics_etw_registerTraceGuidsA(void* requestaddress, void* requestcontext, void* controlguid, uint32_t guidcount, void* traceguidreg, void* mofimagepath, void* mofresourcename, void* registrationhandle);
uint32_t windowssys_windows_win32_system_diagnostics_etw_registerTraceGuidsW(void* requestaddress, void* requestcontext, void* controlguid, uint32_t guidcount, void* traceguidreg, void* mofimagepath, void* mofresourcename, void* registrationhandle);
uint32_t windowssys_windows_win32_system_diagnostics_etw_removeTraceCallback(void* pguid);
uint32_t windowssys_windows_win32_system_diagnostics_etw_setTraceCallback(void* pguid, void* eventcallback);
uint32_t windowssys_windows_win32_system_diagnostics_etw_startTraceA(void* tracehandle, void* instancename, void* properties);
uint32_t windowssys_windows_win32_system_diagnostics_etw_startTraceW(void* tracehandle, void* instancename, void* properties);
uint32_t windowssys_windows_win32_system_diagnostics_etw_tdhAggregatePayloadFilters(uint32_t payloadfiltercount, void* payloadfilterptrs, void* eventmatchallflags, void* eventfilterdescriptor);
uint32_t windowssys_windows_win32_system_diagnostics_etw_tdhCleanupPayloadEventFilterDescriptor(void* eventfilterdescriptor);
uint32_t windowssys_windows_win32_system_diagnostics_etw_tdhCloseDecodingHandle(int64_t handle);
uint32_t windowssys_windows_win32_system_diagnostics_etw_tdhCreatePayloadFilter(void* providerguid, void* eventdescriptor, bool eventmatchany, uint32_t payloadpredicatecount, void* payloadpredicates, void* payloadfilter);
uint32_t windowssys_windows_win32_system_diagnostics_etw_tdhDeletePayloadFilter(void* payloadfilter);
uint32_t windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateManifestProviderEvents(void* providerguid, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProviderFieldInformation(void* pguid, int32_t eventfieldtype, void* pbuffer, void* pbuffersize);
uint32_t windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProviderFilters(void* guid, uint32_t tdhcontextcount, void* tdhcontext, void* filtercount, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProviders(void* pbuffer, void* pbuffersize);
uint32_t windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProvidersForDecodingSource(int32_t filter, void* buffer, uint32_t buffersize, void* bufferrequired);
uint32_t windowssys_windows_win32_system_diagnostics_etw_tdhFormatProperty(void* eventinfo, void* mapinfo, uint32_t pointersize, uint16_t propertyintype, uint16_t propertyouttype, uint16_t propertylength, uint16_t userdatalength, void* userdata, void* buffersize, void* buffer, void* userdataconsumed);
uint32_t windowssys_windows_win32_system_diagnostics_etw_tdhGetDecodingParameter(int64_t handle, void* tdhcontext);
uint32_t windowssys_windows_win32_system_diagnostics_etw_tdhGetEventInformation(void* event, uint32_t tdhcontextcount, void* tdhcontext, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_diagnostics_etw_tdhGetEventMapInformation(void* pevent, void* pmapname, void* pbuffer, void* pbuffersize);
uint32_t windowssys_windows_win32_system_diagnostics_etw_tdhGetManifestEventInformation(void* providerguid, void* eventdescriptor, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_diagnostics_etw_tdhGetProperty(void* pevent, uint32_t tdhcontextcount, void* ptdhcontext, uint32_t propertydatacount, void* ppropertydata, uint32_t buffersize, void* pbuffer);
uint32_t windowssys_windows_win32_system_diagnostics_etw_tdhGetPropertySize(void* pevent, uint32_t tdhcontextcount, void* ptdhcontext, uint32_t propertydatacount, void* ppropertydata, void* ppropertysize);
uint32_t windowssys_windows_win32_system_diagnostics_etw_tdhGetWppMessage(int64_t handle, void* eventrecord, void* buffersize, void* buffer);
uint32_t windowssys_windows_win32_system_diagnostics_etw_tdhGetWppProperty(int64_t handle, void* eventrecord, void* propertyname, void* buffersize, void* buffer);
uint32_t windowssys_windows_win32_system_diagnostics_etw_tdhLoadManifest(void* manifest);
uint32_t windowssys_windows_win32_system_diagnostics_etw_tdhLoadManifestFromBinary(void* binarypath);
uint32_t windowssys_windows_win32_system_diagnostics_etw_tdhLoadManifestFromMemory(void* pdata, uint32_t cbdata);
uint32_t windowssys_windows_win32_system_diagnostics_etw_tdhOpenDecodingHandle(void* handle);
uint32_t windowssys_windows_win32_system_diagnostics_etw_tdhQueryProviderFieldInformation(void* pguid, uint64_t eventfieldvalue, int32_t eventfieldtype, void* pbuffer, void* pbuffersize);
uint32_t windowssys_windows_win32_system_diagnostics_etw_tdhSetDecodingParameter(int64_t handle, void* tdhcontext);
uint32_t windowssys_windows_win32_system_diagnostics_etw_tdhUnloadManifest(void* manifest);
uint32_t windowssys_windows_win32_system_diagnostics_etw_tdhUnloadManifestFromMemory(void* pdata, uint32_t cbdata);
uint32_t windowssys_windows_win32_system_diagnostics_etw_traceEvent(uint64_t tracehandle, void* eventtrace);
uint32_t windowssys_windows_win32_system_diagnostics_etw_traceEventInstance(uint64_t tracehandle, void* eventtrace, void* instinfo, void* parentinstinfo);
uint32_t windowssys_windows_win32_system_diagnostics_etw_traceMessage(uint64_t loggerhandle, uint32_t messageflags, void* messageguid, uint16_t messagenumber, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
uint32_t windowssys_windows_win32_system_diagnostics_etw_traceMessageVa(uint64_t loggerhandle, uint32_t messageflags, void* messageguid, uint16_t messagenumber, void* messagearglist);
uint32_t windowssys_windows_win32_system_diagnostics_etw_unregisterTraceGuids(uint64_t registrationhandle);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_ETW_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_ETW_WRAPPER_H */
