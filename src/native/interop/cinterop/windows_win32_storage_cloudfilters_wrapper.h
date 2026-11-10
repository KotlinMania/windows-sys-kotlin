#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_CLOUDFILTERS_WINDOWS_WIN32_STORAGE_CLOUDFILTERS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_CLOUDFILTERS_WINDOWS_WIN32_STORAGE_CLOUDFILTERS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssys_windows_win32_storage_cloudfilters_cfCloseHandle(void* filehandle);
int32_t windowssys_windows_win32_storage_cloudfilters_cfConnectSyncRoot(void* syncrootpath, void* callbacktable, void* callbackcontext, int32_t connectflags, void* connectionkey);
int32_t windowssys_windows_win32_storage_cloudfilters_cfConvertToPlaceholder(void* filehandle, void* fileidentity, uint32_t fileidentitylength, int32_t convertflags, void* convertusn, void* overlapped);
int32_t windowssys_windows_win32_storage_cloudfilters_cfCreatePlaceholders(void* basedirectorypath, void* placeholderarray, uint32_t placeholdercount, int32_t createflags, void* entriesprocessed);
int32_t windowssys_windows_win32_storage_cloudfilters_cfDehydratePlaceholder(void* filehandle, int64_t startingoffset, int64_t length, int32_t dehydrateflags, void* overlapped);
int32_t windowssys_windows_win32_storage_cloudfilters_cfDisconnectSyncRoot(int64_t connectionkey);
int32_t windowssys_windows_win32_storage_cloudfilters_cfExecute(void* opinfo, void* opparams);
int32_t windowssys_windows_win32_storage_cloudfilters_cfGetCorrelationVector(void* filehandle, void* correlationvector);
int32_t windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderInfo(void* filehandle, int32_t infoclass, void* infobuffer, uint32_t infobufferlength, void* returnedlength);
int32_t windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderRangeInfo(void* filehandle, int32_t infoclass, int64_t startingoffset, int64_t length, void* infobuffer, uint32_t infobufferlength, void* returnedlength);
int32_t windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderRangeInfoForHydration(int64_t connectionkey, int64_t transferkey, int64_t fileid, int32_t infoclass, int64_t startingoffset, int64_t rangelength, void* infobuffer, uint32_t infobuffersize, void* infobufferwritten);
uint32_t windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderStateFromAttributeTag(uint32_t fileattributes, uint32_t reparsetag);
uint32_t windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderStateFromFileInfo(void* infobuffer, int32_t infoclass);
uint32_t windowssys_windows_win32_storage_cloudfilters_cfGetPlaceholderStateFromFindData(void* finddata);
int32_t windowssys_windows_win32_storage_cloudfilters_cfGetPlatformInfo(void* platformversion);
int32_t windowssys_windows_win32_storage_cloudfilters_cfGetSyncRootInfoByHandle(void* filehandle, int32_t infoclass, void* infobuffer, uint32_t infobufferlength, void* returnedlength);
int32_t windowssys_windows_win32_storage_cloudfilters_cfGetSyncRootInfoByPath(void* filepath, int32_t infoclass, void* infobuffer, uint32_t infobufferlength, void* returnedlength);
int32_t windowssys_windows_win32_storage_cloudfilters_cfGetTransferKey(void* filehandle, void* transferkey);
void* windowssys_windows_win32_storage_cloudfilters_cfGetWin32HandleFromProtectedHandle(void* protectedhandle);
int32_t windowssys_windows_win32_storage_cloudfilters_cfHydratePlaceholder(void* filehandle, int64_t startingoffset, int64_t length, int32_t hydrateflags, void* overlapped);
int32_t windowssys_windows_win32_storage_cloudfilters_cfOpenFileWithOplock(void* filepath, int32_t flags, void* protectedhandle);
int32_t windowssys_windows_win32_storage_cloudfilters_cfQuerySyncProviderStatus(int64_t connectionkey, void* providerstatus);
bool windowssys_windows_win32_storage_cloudfilters_cfReferenceProtectedHandle(void* protectedhandle);
int32_t windowssys_windows_win32_storage_cloudfilters_cfRegisterSyncRoot(void* syncrootpath, void* registration, void* policies, int32_t registerflags);
void windowssys_windows_win32_storage_cloudfilters_cfReleaseProtectedHandle(void* protectedhandle);
void windowssys_windows_win32_storage_cloudfilters_cfReleaseTransferKey(void* filehandle, void* transferkey);
int32_t windowssys_windows_win32_storage_cloudfilters_cfReportProviderProgress(int64_t connectionkey, int64_t transferkey, int64_t providerprogresstotal, int64_t providerprogresscompleted);
int32_t windowssys_windows_win32_storage_cloudfilters_cfReportProviderProgress2(int64_t connectionkey, int64_t transferkey, int64_t requestkey, int64_t providerprogresstotal, int64_t providerprogresscompleted, uint32_t targetsessionid);
int32_t windowssys_windows_win32_storage_cloudfilters_cfReportSyncStatus(void* syncrootpath, void* syncstatus);
int32_t windowssys_windows_win32_storage_cloudfilters_cfRevertPlaceholder(void* filehandle, int32_t revertflags, void* overlapped);
int32_t windowssys_windows_win32_storage_cloudfilters_cfSetCorrelationVector(void* filehandle, void* correlationvector);
int32_t windowssys_windows_win32_storage_cloudfilters_cfSetInSyncState(void* filehandle, int32_t insyncstate, int32_t insyncflags, void* insyncusn);
int32_t windowssys_windows_win32_storage_cloudfilters_cfSetPinState(void* filehandle, int32_t pinstate, int32_t pinflags, void* overlapped);
int32_t windowssys_windows_win32_storage_cloudfilters_cfUnregisterSyncRoot(void* syncrootpath);
int32_t windowssys_windows_win32_storage_cloudfilters_cfUpdatePlaceholder(void* filehandle, void* fsmetadata, void* fileidentity, uint32_t fileidentitylength, void* dehydraterangearray, uint32_t dehydraterangecount, int32_t updateflags, void* updateusn, void* overlapped);
int32_t windowssys_windows_win32_storage_cloudfilters_cfUpdateSyncProviderStatus(int64_t connectionkey, uint32_t providerstatus);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_CLOUDFILTERS_WINDOWS_WIN32_STORAGE_CLOUDFILTERS_WRAPPER_H */
