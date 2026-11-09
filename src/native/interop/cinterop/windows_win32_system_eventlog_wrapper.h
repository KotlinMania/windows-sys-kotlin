#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_EVENTLOG_WINDOWS_WIN32_SYSTEM_EVENTLOG_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_EVENTLOG_WINDOWS_WIN32_SYSTEM_EVENTLOG_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_eventlog_BackupEventLogA(void* heventlog, void* lpbackupfilename);
int32_t windowssys_windows_win32_system_eventlog_BackupEventLogW(void* heventlog, void* lpbackupfilename);
int32_t windowssys_windows_win32_system_eventlog_ClearEventLogA(void* heventlog, void* lpbackupfilename);
int32_t windowssys_windows_win32_system_eventlog_ClearEventLogW(void* heventlog, void* lpbackupfilename);
int32_t windowssys_windows_win32_system_eventlog_CloseEventLog(void* heventlog);
int32_t windowssys_windows_win32_system_eventlog_DeregisterEventSource(void* heventlog);
int32_t windowssys_windows_win32_system_eventlog_EvtArchiveExportedLog(int64_t session, void* logfilepath, uint32_t locale, uint32_t flags);
int32_t windowssys_windows_win32_system_eventlog_EvtCancel(int64_t object);
int32_t windowssys_windows_win32_system_eventlog_EvtClearLog(int64_t session, void* channelpath, void* targetfilepath, uint32_t flags);
int32_t windowssys_windows_win32_system_eventlog_EvtClose(int64_t object);
int64_t windowssys_windows_win32_system_eventlog_EvtCreateBookmark(void* bookmarkxml);
int64_t windowssys_windows_win32_system_eventlog_EvtCreateRenderContext(uint32_t valuepathscount, void* valuepaths, uint32_t flags);
int32_t windowssys_windows_win32_system_eventlog_EvtExportLog(int64_t session, void* path, void* query, void* targetfilepath, uint32_t flags);
int32_t windowssys_windows_win32_system_eventlog_EvtFormatMessage(int64_t publishermetadata, int64_t event, uint32_t messageid, uint32_t valuecount, void* values, uint32_t flags, uint32_t buffersize, void* buffer, void* bufferused);
int32_t windowssys_windows_win32_system_eventlog_EvtGetChannelConfigProperty(int64_t channelconfig, int32_t propertyid, uint32_t flags, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused);
int32_t windowssys_windows_win32_system_eventlog_EvtGetEventInfo(int64_t event, int32_t propertyid, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused);
int32_t windowssys_windows_win32_system_eventlog_EvtGetEventMetadataProperty(int64_t eventmetadata, int32_t propertyid, uint32_t flags, uint32_t eventmetadatapropertybuffersize, void* eventmetadatapropertybuffer, void* eventmetadatapropertybufferused);
uint32_t windowssys_windows_win32_system_eventlog_EvtGetExtendedStatus(uint32_t buffersize, void* buffer, void* bufferused);
int32_t windowssys_windows_win32_system_eventlog_EvtGetLogInfo(int64_t arg_0_log, int32_t propertyid, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused);
int32_t windowssys_windows_win32_system_eventlog_EvtGetObjectArrayProperty(int64_t objectarray, uint32_t propertyid, uint32_t arrayindex, uint32_t flags, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused);
int32_t windowssys_windows_win32_system_eventlog_EvtGetObjectArraySize(int64_t objectarray, void* objectarraysize);
int32_t windowssys_windows_win32_system_eventlog_EvtGetPublisherMetadataProperty(int64_t publishermetadata, int32_t propertyid, uint32_t flags, uint32_t publishermetadatapropertybuffersize, void* publishermetadatapropertybuffer, void* publishermetadatapropertybufferused);
int32_t windowssys_windows_win32_system_eventlog_EvtGetQueryInfo(int64_t queryorsubscription, int32_t propertyid, uint32_t propertyvaluebuffersize, void* propertyvaluebuffer, void* propertyvaluebufferused);
int32_t windowssys_windows_win32_system_eventlog_EvtNext(int64_t resultset, uint32_t eventssize, void* events, uint32_t timeout, uint32_t flags, void* returned);
int32_t windowssys_windows_win32_system_eventlog_EvtNextChannelPath(int64_t channelenum, uint32_t channelpathbuffersize, void* channelpathbuffer, void* channelpathbufferused);
int64_t windowssys_windows_win32_system_eventlog_EvtNextEventMetadata(int64_t eventmetadataenum, uint32_t flags);
int32_t windowssys_windows_win32_system_eventlog_EvtNextPublisherId(int64_t publisherenum, uint32_t publisheridbuffersize, void* publisheridbuffer, void* publisheridbufferused);
int64_t windowssys_windows_win32_system_eventlog_EvtOpenChannelConfig(int64_t session, void* channelpath, uint32_t flags);
int64_t windowssys_windows_win32_system_eventlog_EvtOpenChannelEnum(int64_t session, uint32_t flags);
int64_t windowssys_windows_win32_system_eventlog_EvtOpenEventMetadataEnum(int64_t publishermetadata, uint32_t flags);
int64_t windowssys_windows_win32_system_eventlog_EvtOpenLog(int64_t session, void* path, uint32_t flags);
int64_t windowssys_windows_win32_system_eventlog_EvtOpenPublisherEnum(int64_t session, uint32_t flags);
int64_t windowssys_windows_win32_system_eventlog_EvtOpenPublisherMetadata(int64_t session, void* publisherid, void* logfilepath, uint32_t locale, uint32_t flags);
int64_t windowssys_windows_win32_system_eventlog_EvtOpenSession(int32_t loginclass, void* login, uint32_t timeout, uint32_t flags);
int64_t windowssys_windows_win32_system_eventlog_EvtQuery(int64_t session, void* path, void* query, uint32_t flags);
int32_t windowssys_windows_win32_system_eventlog_EvtRender(int64_t context, int64_t fragment, uint32_t flags, uint32_t buffersize, void* buffer, void* bufferused, void* propertycount);
int32_t windowssys_windows_win32_system_eventlog_EvtSaveChannelConfig(int64_t channelconfig, uint32_t flags);
int32_t windowssys_windows_win32_system_eventlog_EvtSeek(int64_t resultset, int64_t position, int64_t bookmark, uint32_t timeout, uint32_t flags);
int32_t windowssys_windows_win32_system_eventlog_EvtSetChannelConfigProperty(int64_t channelconfig, int32_t propertyid, uint32_t flags, void* propertyvalue);
int64_t windowssys_windows_win32_system_eventlog_EvtSubscribe(int64_t session, void* signalevent, void* channelpath, void* query, int64_t bookmark, void* context, void* callback, uint32_t flags);
int32_t windowssys_windows_win32_system_eventlog_EvtUpdateBookmark(int64_t bookmark, int64_t event);
int32_t windowssys_windows_win32_system_eventlog_GetEventLogInformation(void* heventlog, uint32_t dwinfolevel, void* lpbuffer, uint32_t cbbufsize, void* pcbbytesneeded);
int32_t windowssys_windows_win32_system_eventlog_GetNumberOfEventLogRecords(void* heventlog, void* numberofrecords);
int32_t windowssys_windows_win32_system_eventlog_GetOldestEventLogRecord(void* heventlog, void* oldestrecord);
int32_t windowssys_windows_win32_system_eventlog_NotifyChangeEventLog(void* heventlog, void* hevent);
void* windowssys_windows_win32_system_eventlog_OpenBackupEventLogA(void* lpuncservername, void* lpfilename);
void* windowssys_windows_win32_system_eventlog_OpenBackupEventLogW(void* lpuncservername, void* lpfilename);
void* windowssys_windows_win32_system_eventlog_OpenEventLogA(void* lpuncservername, void* lpsourcename);
void* windowssys_windows_win32_system_eventlog_OpenEventLogW(void* lpuncservername, void* lpsourcename);
int32_t windowssys_windows_win32_system_eventlog_ReadEventLogA(void* heventlog, uint32_t dwreadflags, uint32_t dwrecordoffset, void* lpbuffer, uint32_t nnumberofbytestoread, void* pnbytesread, void* pnminnumberofbytesneeded);
int32_t windowssys_windows_win32_system_eventlog_ReadEventLogW(void* heventlog, uint32_t dwreadflags, uint32_t dwrecordoffset, void* lpbuffer, uint32_t nnumberofbytestoread, void* pnbytesread, void* pnminnumberofbytesneeded);
void* windowssys_windows_win32_system_eventlog_RegisterEventSourceA(void* lpuncservername, void* lpsourcename);
void* windowssys_windows_win32_system_eventlog_RegisterEventSourceW(void* lpuncservername, void* lpsourcename);
int32_t windowssys_windows_win32_system_eventlog_ReportEventA(void* heventlog, uint16_t wtype, uint16_t wcategory, uint32_t dweventid, void* lpusersid, uint16_t wnumstrings, uint32_t dwdatasize, void* lpstrings, void* lprawdata);
int32_t windowssys_windows_win32_system_eventlog_ReportEventW(void* heventlog, uint16_t wtype, uint16_t wcategory, uint32_t dweventid, void* lpusersid, uint16_t wnumstrings, uint32_t dwdatasize, void* lpstrings, void* lprawdata);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_EVENTLOG_WINDOWS_WIN32_SYSTEM_EVENTLOG_WRAPPER_H */
