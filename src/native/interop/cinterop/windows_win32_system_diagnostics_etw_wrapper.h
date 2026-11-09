#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_ETW_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_ETW_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_ETW_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_ETW_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_system_diagnostics_etw_CreateTraceInstanceId(void* reghandle, void* instinfo);
int32_t windowssys_windows_win32_system_diagnostics_etw_CveEventWrite(void* cveid, void* additionaldetails);
uint32_t windowssys_windows_win32_system_diagnostics_etw_EnumerateTraceGuids(void* guidpropertiesarray, uint32_t propertyarraycount, void* guidcount);
uint32_t windowssys_windows_win32_system_diagnostics_etw_EnumerateTraceGuidsEx(int32_t tracequeryinfoclass, void* inbuffer, uint32_t inbuffersize, void* outbuffer, uint32_t outbuffersize, void* returnlength);
uint32_t windowssys_windows_win32_system_diagnostics_etw_EventAccessControl(void* guid, uint32_t operation, void* sid, uint32_t rights, bool allowordeny);
uint32_t windowssys_windows_win32_system_diagnostics_etw_EventAccessQuery(void* guid, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_diagnostics_etw_EventAccessRemove(void* guid);
uint32_t windowssys_windows_win32_system_diagnostics_etw_EventActivityIdControl(uint32_t controlcode, void* activityid);
bool windowssys_windows_win32_system_diagnostics_etw_EventEnabled(int64_t reghandle, void* eventdescriptor);
bool windowssys_windows_win32_system_diagnostics_etw_EventProviderEnabled(int64_t reghandle, uint8_t level, uint64_t keyword);
uint32_t windowssys_windows_win32_system_diagnostics_etw_EventRegister(void* providerid, void* enablecallback, void* callbackcontext, void* reghandle);
uint32_t windowssys_windows_win32_system_diagnostics_etw_EventSetInformation(int64_t reghandle, int32_t informationclass, void* eventinformation, uint32_t informationlength);
uint32_t windowssys_windows_win32_system_diagnostics_etw_EventUnregister(int64_t reghandle);
uint32_t windowssys_windows_win32_system_diagnostics_etw_EventWrite(int64_t reghandle, void* eventdescriptor, uint32_t userdatacount, void* userdata);
uint32_t windowssys_windows_win32_system_diagnostics_etw_EventWriteEx(int64_t reghandle, void* eventdescriptor, uint64_t filter, uint32_t flags, void* activityid, void* relatedactivityid, uint32_t userdatacount, void* userdata);
uint32_t windowssys_windows_win32_system_diagnostics_etw_EventWriteString(int64_t reghandle, uint8_t level, uint64_t keyword, void* string);
uint32_t windowssys_windows_win32_system_diagnostics_etw_EventWriteTransfer(int64_t reghandle, void* eventdescriptor, void* activityid, void* relatedactivityid, uint32_t userdatacount, void* userdata);
uint32_t windowssys_windows_win32_system_diagnostics_etw_GetTraceEnableFlags(uint64_t tracehandle);
uint8_t windowssys_windows_win32_system_diagnostics_etw_GetTraceEnableLevel(uint64_t tracehandle);
uint64_t windowssys_windows_win32_system_diagnostics_etw_GetTraceLoggerHandle(void* buffer);
uint64_t windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromBufferStream(void* options, void* buffercompletioncallback, void* buffercompletioncontext);
uint64_t windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromFile(void* logfilename, void* options, void* logfileheader);
uint64_t windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromRealTimeLogger(void* loggername, void* options, void* logfileheader);
uint64_t windowssys_windows_win32_system_diagnostics_etw_OpenTraceFromRealTimeLoggerWithAllocationOptions(void* loggername, void* options, uint64_t allocationsize, void* memorypartitionhandle, void* logfileheader);
uint32_t windowssys_windows_win32_system_diagnostics_etw_ProcessTrace(void* handlearray, uint32_t handlecount, void* starttime, void* endtime);
uint32_t windowssys_windows_win32_system_diagnostics_etw_ProcessTraceAddBufferToBufferStream(uint64_t tracehandle, void* buffer, uint32_t buffersize);
uint32_t windowssys_windows_win32_system_diagnostics_etw_ProcessTraceBufferDecrementReference(void* buffer);
uint32_t windowssys_windows_win32_system_diagnostics_etw_ProcessTraceBufferIncrementReference(uint64_t tracehandle, void* buffer);
uint32_t windowssys_windows_win32_system_diagnostics_etw_QueryAllTracesA(void* propertyarray, uint32_t propertyarraycount, void* loggercount);
uint32_t windowssys_windows_win32_system_diagnostics_etw_QueryAllTracesW(void* propertyarray, uint32_t propertyarraycount, void* loggercount);
uint32_t windowssys_windows_win32_system_diagnostics_etw_RegisterTraceGuidsA(void* requestaddress, void* requestcontext, void* controlguid, uint32_t guidcount, void* traceguidreg, void* mofimagepath, void* mofresourcename, void* registrationhandle);
uint32_t windowssys_windows_win32_system_diagnostics_etw_RegisterTraceGuidsW(void* requestaddress, void* requestcontext, void* controlguid, uint32_t guidcount, void* traceguidreg, void* mofimagepath, void* mofresourcename, void* registrationhandle);
uint32_t windowssys_windows_win32_system_diagnostics_etw_RemoveTraceCallback(void* pguid);
uint32_t windowssys_windows_win32_system_diagnostics_etw_SetTraceCallback(void* pguid, void* eventcallback);
uint32_t windowssys_windows_win32_system_diagnostics_etw_StartTraceA(void* tracehandle, void* instancename, void* properties);
uint32_t windowssys_windows_win32_system_diagnostics_etw_StartTraceW(void* tracehandle, void* instancename, void* properties);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhAggregatePayloadFilters(uint32_t payloadfiltercount, void* payloadfilterptrs, void* eventmatchallflags, void* eventfilterdescriptor);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhCleanupPayloadEventFilterDescriptor(void* eventfilterdescriptor);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhCloseDecodingHandle(int64_t handle);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhCreatePayloadFilter(void* providerguid, void* eventdescriptor, bool eventmatchany, uint32_t payloadpredicatecount, void* payloadpredicates, void* payloadfilter);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhDeletePayloadFilter(void* payloadfilter);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateManifestProviderEvents(void* providerguid, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProviderFieldInformation(void* pguid, int32_t eventfieldtype, void* pbuffer, void* pbuffersize);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProviderFilters(void* guid, uint32_t tdhcontextcount, void* tdhcontext, void* filtercount, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProviders(void* pbuffer, void* pbuffersize);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhEnumerateProvidersForDecodingSource(int32_t filter, void* buffer, uint32_t buffersize, void* bufferrequired);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhFormatProperty(void* eventinfo, void* mapinfo, uint32_t pointersize, uint16_t propertyintype, uint16_t propertyouttype, uint16_t propertylength, uint16_t userdatalength, void* userdata, void* buffersize, void* buffer, void* userdataconsumed);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhGetDecodingParameter(int64_t handle, void* tdhcontext);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhGetEventInformation(void* event, uint32_t tdhcontextcount, void* tdhcontext, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhGetEventMapInformation(void* pevent, void* pmapname, void* pbuffer, void* pbuffersize);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhGetManifestEventInformation(void* providerguid, void* eventdescriptor, void* buffer, void* buffersize);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhGetProperty(void* pevent, uint32_t tdhcontextcount, void* ptdhcontext, uint32_t propertydatacount, void* ppropertydata, uint32_t buffersize, void* pbuffer);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhGetPropertySize(void* pevent, uint32_t tdhcontextcount, void* ptdhcontext, uint32_t propertydatacount, void* ppropertydata, void* ppropertysize);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhGetWppMessage(int64_t handle, void* eventrecord, void* buffersize, void* buffer);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhGetWppProperty(int64_t handle, void* eventrecord, void* propertyname, void* buffersize, void* buffer);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhLoadManifest(void* manifest);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhLoadManifestFromBinary(void* binarypath);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhLoadManifestFromMemory(void* pdata, uint32_t cbdata);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhOpenDecodingHandle(void* handle);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhQueryProviderFieldInformation(void* pguid, uint64_t eventfieldvalue, int32_t eventfieldtype, void* pbuffer, void* pbuffersize);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhSetDecodingParameter(int64_t handle, void* tdhcontext);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhUnloadManifest(void* manifest);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TdhUnloadManifestFromMemory(void* pdata, uint32_t cbdata);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TraceEvent(uint64_t tracehandle, void* eventtrace);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TraceEventInstance(uint64_t tracehandle, void* eventtrace, void* instinfo, void* parentinstinfo);
uint32_t windowssys_windows_win32_system_diagnostics_etw_TraceMessageVa(uint64_t loggerhandle, uint32_t messageflags, void* messageguid, uint16_t messagenumber, void* messagearglist);
uint32_t windowssys_windows_win32_system_diagnostics_etw_UnregisterTraceGuids(uint64_t registrationhandle);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_ETW_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_ETW_WRAPPER_H */
