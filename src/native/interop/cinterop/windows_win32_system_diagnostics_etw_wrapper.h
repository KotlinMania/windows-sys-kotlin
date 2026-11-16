#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_ETW_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_ETW_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_ETW_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_ETW_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssysWindowsWin32SystemDiagnosticsEtwCreateTraceInstanceId(void* reghandle, void* instinfo);
int32_t windowssysWindowsWin32SystemDiagnosticsEtwCveEventWrite(void* cveid, void* additionaldetails);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwEnumerateTraceGuids(void* guidpropertiesarray, uint32_t propertyarraycount, void* guidcount);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwEnumerateTraceGuidsEx(int32_t tracequeryinfoclass, void* inbuffer, uint32_t inbuffersize, void* outbuffer, uint32_t outbuffersize, void* returnlength);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwEventAccessControl(void* guid, uint32_t operation, void* sid, uint32_t rights, bool allowordeny);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwEventAccessQuery(void* guid, void* buffer, void* buffersize);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwEventAccessRemove(void* guid);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwEventActivityIdControl(uint32_t controlcode, void* activityid);
bool windowssysWindowsWin32SystemDiagnosticsEtwEventEnabled(int64_t reghandle, void* eventdescriptor);
bool windowssysWindowsWin32SystemDiagnosticsEtwEventProviderEnabled(int64_t reghandle, uint8_t level, uint64_t keyword);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwEventRegister(void* providerid, void* enablecallback, void* callbackcontext, void* reghandle);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwEventSetInformation(int64_t reghandle, int32_t informationclass, void* eventinformation, uint32_t informationlength);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwEventUnregister(int64_t reghandle);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwEventWrite(int64_t reghandle, void* eventdescriptor, uint32_t userdatacount, void* userdata);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwEventWriteEx(int64_t reghandle, void* eventdescriptor, uint64_t filter, uint32_t flags, void* activityid, void* relatedactivityid, uint32_t userdatacount, void* userdata);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwEventWriteString(int64_t reghandle, uint8_t level, uint64_t keyword, void* string);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwEventWriteTransfer(int64_t reghandle, void* eventdescriptor, void* activityid, void* relatedactivityid, uint32_t userdatacount, void* userdata);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableFlags(uint64_t tracehandle);
uint8_t windowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableLevel(uint64_t tracehandle);
uint64_t windowssysWindowsWin32SystemDiagnosticsEtwGetTraceLoggerHandle(void* buffer);
uint64_t windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromBufferStream(void* options, void* buffercompletioncallback, void* buffercompletioncontext);
uint64_t windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromFile(void* logfilename, void* options, void* logfileheader);
uint64_t windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromRealTimeLogger(void* loggername, void* options, void* logfileheader);
uint64_t windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromRealTimeLoggerWithAllocationOptions(void* loggername, void* options, uint64_t allocationsize, void* memorypartitionhandle, void* logfileheader);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwProcessTrace(void* handlearray, uint32_t handlecount, void* starttime, void* endtime);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceAddBufferToBufferStream(uint64_t tracehandle, void* buffer, uint32_t buffersize);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceBufferDecrementReference(void* buffer);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceBufferIncrementReference(uint64_t tracehandle, void* buffer);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwQueryAllTracesA(void* propertyarray, uint32_t propertyarraycount, void* loggercount);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwQueryAllTracesW(void* propertyarray, uint32_t propertyarraycount, void* loggercount);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwRegisterTraceGuidsA(void* requestaddress, void* requestcontext, void* controlguid, uint32_t guidcount, void* traceguidreg, void* mofimagepath, void* mofresourcename, void* registrationhandle);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwRegisterTraceGuidsW(void* requestaddress, void* requestcontext, void* controlguid, uint32_t guidcount, void* traceguidreg, void* mofimagepath, void* mofresourcename, void* registrationhandle);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwRemoveTraceCallback(void* pguid);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwSetTraceCallback(void* pguid, void* eventcallback);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwStartTraceA(void* tracehandle, void* instancename, void* properties);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwStartTraceW(void* tracehandle, void* instancename, void* properties);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTdhAggregatePayloadFilters(uint32_t payloadfiltercount, void* payloadfilterptrs, void* eventmatchallflags, void* eventfilterdescriptor);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTdhCleanupPayloadEventFilterDescriptor(void* eventfilterdescriptor);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTdhCloseDecodingHandle(int64_t handle);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTdhCreatePayloadFilter(void* providerguid, void* eventdescriptor, bool eventmatchany, uint32_t payloadpredicatecount, void* payloadpredicates, void* payloadfilter);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTdhDeletePayloadFilter(void* payloadfilter);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateManifestProviderEvents(void* providerguid, void* buffer, void* buffersize);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviderFieldInformation(void* pguid, int32_t eventfieldtype, void* pbuffer, void* pbuffersize);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviderFilters(void* guid, uint32_t tdhcontextcount, void* tdhcontext, void* filtercount, void* buffer, void* buffersize);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviders(void* pbuffer, void* pbuffersize);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProvidersForDecodingSource(int32_t filter, void* buffer, uint32_t buffersize, void* bufferrequired);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTdhFormatProperty(void* eventinfo, void* mapinfo, uint32_t pointersize, uint16_t propertyintype, uint16_t propertyouttype, uint16_t propertylength, uint16_t userdatalength, void* userdata, void* buffersize, void* buffer, void* userdataconsumed);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTdhGetDecodingParameter(int64_t handle, void* tdhcontext);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTdhGetEventInformation(void* event, uint32_t tdhcontextcount, void* tdhcontext, void* buffer, void* buffersize);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTdhGetEventMapInformation(void* pevent, void* pmapname, void* pbuffer, void* pbuffersize);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTdhGetManifestEventInformation(void* providerguid, void* eventdescriptor, void* buffer, void* buffersize);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTdhGetProperty(void* pevent, uint32_t tdhcontextcount, void* ptdhcontext, uint32_t propertydatacount, void* ppropertydata, uint32_t buffersize, void* pbuffer);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTdhGetPropertySize(void* pevent, uint32_t tdhcontextcount, void* ptdhcontext, uint32_t propertydatacount, void* ppropertydata, void* ppropertysize);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTdhGetWppMessage(int64_t handle, void* eventrecord, void* buffersize, void* buffer);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTdhGetWppProperty(int64_t handle, void* eventrecord, void* propertyname, void* buffersize, void* buffer);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifest(void* manifest);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifestFromBinary(void* binarypath);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifestFromMemory(void* pdata, uint32_t cbdata);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTdhOpenDecodingHandle(void* handle);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTdhQueryProviderFieldInformation(void* pguid, uint64_t eventfieldvalue, int32_t eventfieldtype, void* pbuffer, void* pbuffersize);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTdhSetDecodingParameter(int64_t handle, void* tdhcontext);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTdhUnloadManifest(void* manifest);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTdhUnloadManifestFromMemory(void* pdata, uint32_t cbdata);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTraceEvent(uint64_t tracehandle, void* eventtrace);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTraceEventInstance(uint64_t tracehandle, void* eventtrace, void* instinfo, void* parentinstinfo);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTraceMessage(uint64_t loggerhandle, uint32_t messageflags, void* messageguid, uint16_t messagenumber, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwTraceMessageVa(uint64_t loggerhandle, uint32_t messageflags, void* messageguid, uint16_t messagenumber, void* messagearglist);
uint32_t windowssysWindowsWin32SystemDiagnosticsEtwUnregisterTraceGuids(uint64_t registrationhandle);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_ETW_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_ETW_WRAPPER_H */
