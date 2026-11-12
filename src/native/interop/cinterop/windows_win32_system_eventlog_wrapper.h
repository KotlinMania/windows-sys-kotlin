#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_EVENTLOG_WINDOWS_WIN32_SYSTEM_EVENTLOG_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_EVENTLOG_WINDOWS_WIN32_SYSTEM_EVENTLOG_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemEventlogBackupEventLogA(void* heventlog, void* lpbackupfilename);
int32_t windowssysWindowsWin32SystemEventlogBackupEventLogW(void* heventlog, void* lpbackupfilename);
int32_t windowssysWindowsWin32SystemEventlogClearEventLogA(void* heventlog, void* lpbackupfilename);
int32_t windowssysWindowsWin32SystemEventlogClearEventLogW(void* heventlog, void* lpbackupfilename);
int32_t windowssysWindowsWin32SystemEventlogCloseEventLog(void* heventlog);
int32_t windowssysWindowsWin32SystemEventlogDeregisterEventSource(void* heventlog);
int32_t windowssysWindowsWin32SystemEventlogEvtArchiveExportedLog(int64_t session, void* logfilepath, uint32_t locale, uint32_t flags);
int32_t windowssysWindowsWin32SystemEventlogEvtCancel(int64_t object);
int32_t windowssysWindowsWin32SystemEventlogEvtClearLog(int64_t session, void* channelpath, void* targetfilepath, uint32_t flags);
int32_t windowssysWindowsWin32SystemEventlogEvtClose(int64_t object);
int64_t windowssysWindowsWin32SystemEventlogEvtCreateBookmark(void* bookmarkxml);
int64_t windowssysWindowsWin32SystemEventlogEvtCreateRenderContext(uint32_t valuepathscount, void* valuepaths, uint32_t flags);
int32_t windowssysWindowsWin32SystemEventlogEvtExportLog(int64_t session, void* path, void* query, void* targetfilepath, uint32_t flags);
int32_t windowssysWindowsWin32SystemEventlogEvtFormatMessage(int64_t publishermetadata, int64_t event, uint32_t messageid, uint32_t valuecount, void* values, uint32_t flags, uint32_t buffersize, void* buffer, void* bufferused);
int32_t windowssysWindowsWin32SystemEventlogEvtGetChannelConfigProperty(int64_t channelconfig, int32_t propertyid, uint32_t flags, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused);
int32_t windowssysWindowsWin32SystemEventlogEvtGetEventInfo(int64_t event, int32_t propertyid, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused);
int32_t windowssysWindowsWin32SystemEventlogEvtGetEventMetadataProperty(int64_t eventmetadata, int32_t propertyid, uint32_t flags, uint32_t eventmetadatapropertybuffersize, void* eventmetadatapropertybuffer, void* eventmetadatapropertybufferused);
uint32_t windowssysWindowsWin32SystemEventlogEvtGetExtendedStatus(uint32_t buffersize, void* buffer, void* bufferused);
int32_t windowssysWindowsWin32SystemEventlogEvtGetLogInfo(int64_t arg0Log, int32_t propertyid, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused);
int32_t windowssysWindowsWin32SystemEventlogEvtGetObjectArrayProperty(int64_t objectarray, uint32_t propertyid, uint32_t arrayindex, uint32_t flags, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused);
int32_t windowssysWindowsWin32SystemEventlogEvtGetObjectArraySize(int64_t objectarray, void* objectarraysize);
int32_t windowssysWindowsWin32SystemEventlogEvtGetPublisherMetadataProperty(int64_t publishermetadata, int32_t propertyid, uint32_t flags, uint32_t publishermetadatapropertybuffersize, void* publishermetadatapropertybuffer, void* publishermetadatapropertybufferused);
int32_t windowssysWindowsWin32SystemEventlogEvtGetQueryInfo(int64_t queryorsubscription, int32_t propertyid, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused);
int32_t windowssysWindowsWin32SystemEventlogEvtNext(int64_t resultset, uint32_t eventssize, void* events, uint32_t timeout, uint32_t flags, void* returned);
int32_t windowssysWindowsWin32SystemEventlogEvtNextChannelPath(int64_t channelenum, uint32_t channelpathbuffersize, void* channelpathbuffer, void* channelpathbufferused);
int64_t windowssysWindowsWin32SystemEventlogEvtNextEventMetadata(int64_t eventmetadataenum, uint32_t flags);
int32_t windowssysWindowsWin32SystemEventlogEvtNextPublisherId(int64_t publisherenum, uint32_t publisheridbuffersize, void* publisheridbuffer, void* publisheridbufferused);
int64_t windowssysWindowsWin32SystemEventlogEvtOpenChannelConfig(int64_t session, void* channelpath, uint32_t flags);
int64_t windowssysWindowsWin32SystemEventlogEvtOpenChannelEnum(int64_t session, uint32_t flags);
int64_t windowssysWindowsWin32SystemEventlogEvtOpenEventMetadataEnum(int64_t publishermetadata, uint32_t flags);
int64_t windowssysWindowsWin32SystemEventlogEvtOpenLog(int64_t session, void* path, uint32_t flags);
int64_t windowssysWindowsWin32SystemEventlogEvtOpenPublisherEnum(int64_t session, uint32_t flags);
int64_t windowssysWindowsWin32SystemEventlogEvtOpenPublisherMetadata(int64_t session, void* publisherid, void* logfilepath, uint32_t locale, uint32_t flags);
int64_t windowssysWindowsWin32SystemEventlogEvtOpenSession(int32_t loginclass, void* login, uint32_t timeout, uint32_t flags);
int64_t windowssysWindowsWin32SystemEventlogEvtQuery(int64_t session, void* path, void* query, uint32_t flags);
int32_t windowssysWindowsWin32SystemEventlogEvtRender(int64_t context, int64_t fragment, uint32_t flags, uint32_t buffersize, void* buffer, void* bufferused, void* propertycount);
int32_t windowssysWindowsWin32SystemEventlogEvtSaveChannelConfig(int64_t channelconfig, uint32_t flags);
int32_t windowssysWindowsWin32SystemEventlogEvtSeek(int64_t resultset, int64_t position, int64_t bookmark, uint32_t timeout, uint32_t flags);
int32_t windowssysWindowsWin32SystemEventlogEvtSetChannelConfigProperty(int64_t channelconfig, int32_t propertyid, uint32_t flags, void* propertyvalue);
int64_t windowssysWindowsWin32SystemEventlogEvtSubscribe(int64_t session, void* signalevent, void* channelpath, void* query, int64_t bookmark, void* context, void* callback, uint32_t flags);
int32_t windowssysWindowsWin32SystemEventlogEvtUpdateBookmark(int64_t bookmark, int64_t event);
int32_t windowssysWindowsWin32SystemEventlogGetEventLogInformation(void* heventlog, uint32_t dwinfolevel, void* lpbuffer, uint32_t cbbufsize, void* pcbbytesneeded);
int32_t windowssysWindowsWin32SystemEventlogGetNumberOfEventLogRecords(void* heventlog, void* numberofrecords);
int32_t windowssysWindowsWin32SystemEventlogGetOldestEventLogRecord(void* heventlog, void* oldestrecord);
int32_t windowssysWindowsWin32SystemEventlogNotifyChangeEventLog(void* heventlog, void* hevent);
void* windowssysWindowsWin32SystemEventlogOpenBackupEventLogA(void* lpuncservername, void* lpfilename);
void* windowssysWindowsWin32SystemEventlogOpenBackupEventLogW(void* lpuncservername, void* lpfilename);
void* windowssysWindowsWin32SystemEventlogOpenEventLogA(void* lpuncservername, void* lpsourcename);
void* windowssysWindowsWin32SystemEventlogOpenEventLogW(void* lpuncservername, void* lpsourcename);
int32_t windowssysWindowsWin32SystemEventlogReadEventLogA(void* heventlog, uint32_t dwreadflags, uint32_t dwrecordoffset, void* lpbuffer, uint32_t nnumberofbytestoread, void* pnbytesread, void* pnminnumberofbytesneeded);
int32_t windowssysWindowsWin32SystemEventlogReadEventLogW(void* heventlog, uint32_t dwreadflags, uint32_t dwrecordoffset, void* lpbuffer, uint32_t nnumberofbytestoread, void* pnbytesread, void* pnminnumberofbytesneeded);
void* windowssysWindowsWin32SystemEventlogRegisterEventSourceA(void* lpuncservername, void* lpsourcename);
void* windowssysWindowsWin32SystemEventlogRegisterEventSourceW(void* lpuncservername, void* lpsourcename);
int32_t windowssysWindowsWin32SystemEventlogReportEventA(void* heventlog, uint16_t wtype, uint16_t wcategory, uint32_t dweventid, void* lpusersid, uint16_t wnumstrings, uint32_t dwdatasize, void* lpstrings, void* lprawdata);
int32_t windowssysWindowsWin32SystemEventlogReportEventW(void* heventlog, uint16_t wtype, uint16_t wcategory, uint32_t dweventid, void* lpusersid, uint16_t wnumstrings, uint32_t dwdatasize, void* lpstrings, void* lprawdata);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_EVENTLOG_WINDOWS_WIN32_SYSTEM_EVENTLOG_WRAPPER_H */
