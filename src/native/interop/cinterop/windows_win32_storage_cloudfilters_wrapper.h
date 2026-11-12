#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_CLOUDFILTERS_WINDOWS_WIN32_STORAGE_CLOUDFILTERS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_CLOUDFILTERS_WINDOWS_WIN32_STORAGE_CLOUDFILTERS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssysWindowsWin32StorageCloudfiltersCfCloseHandle(void* filehandle);
int32_t windowssysWindowsWin32StorageCloudfiltersCfConnectSyncRoot(void* syncrootpath, void* callbacktable, void* callbackcontext, int32_t connectflags, void* connectionkey);
int32_t windowssysWindowsWin32StorageCloudfiltersCfConvertToPlaceholder(void* filehandle, void* fileidentity, uint32_t fileidentitylength, int32_t convertflags, void* convertusn, void* overlapped);
int32_t windowssysWindowsWin32StorageCloudfiltersCfCreatePlaceholders(void* basedirectorypath, void* placeholderarray, uint32_t placeholdercount, int32_t createflags, void* entriesprocessed);
int32_t windowssysWindowsWin32StorageCloudfiltersCfDehydratePlaceholder(void* filehandle, int64_t startingoffset, int64_t length, int32_t dehydrateflags, void* overlapped);
int32_t windowssysWindowsWin32StorageCloudfiltersCfDisconnectSyncRoot(int64_t connectionkey);
int32_t windowssysWindowsWin32StorageCloudfiltersCfExecute(void* opinfo, void* opparams);
int32_t windowssysWindowsWin32StorageCloudfiltersCfGetCorrelationVector(void* filehandle, void* correlationvector);
int32_t windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderInfo(void* filehandle, int32_t infoclass, void* infobuffer, uint32_t infobufferlength, void* returnedlength);
int32_t windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderRangeInfo(void* filehandle, int32_t infoclass, int64_t startingoffset, int64_t length, void* infobuffer, uint32_t infobufferlength, void* returnedlength);
int32_t windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderRangeInfoForHydration(int64_t connectionkey, int64_t transferkey, int64_t fileid, int32_t infoclass, int64_t startingoffset, int64_t rangelength, void* infobuffer, uint32_t infobuffersize, void* infobufferwritten);
uint32_t windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromAttributeTag(uint32_t fileattributes, uint32_t reparsetag);
uint32_t windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromFileInfo(void* infobuffer, int32_t infoclass);
uint32_t windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromFindData(void* finddata);
int32_t windowssysWindowsWin32StorageCloudfiltersCfGetPlatformInfo(void* platformversion);
int32_t windowssysWindowsWin32StorageCloudfiltersCfGetSyncRootInfoByHandle(void* filehandle, int32_t infoclass, void* infobuffer, uint32_t infobufferlength, void* returnedlength);
int32_t windowssysWindowsWin32StorageCloudfiltersCfGetSyncRootInfoByPath(void* filepath, int32_t infoclass, void* infobuffer, uint32_t infobufferlength, void* returnedlength);
int32_t windowssysWindowsWin32StorageCloudfiltersCfGetTransferKey(void* filehandle, void* transferkey);
void* windowssysWindowsWin32StorageCloudfiltersCfGetWin32HandleFromProtectedHandle(void* protectedhandle);
int32_t windowssysWindowsWin32StorageCloudfiltersCfHydratePlaceholder(void* filehandle, int64_t startingoffset, int64_t length, int32_t hydrateflags, void* overlapped);
int32_t windowssysWindowsWin32StorageCloudfiltersCfOpenFileWithOplock(void* filepath, int32_t flags, void* protectedhandle);
int32_t windowssysWindowsWin32StorageCloudfiltersCfQuerySyncProviderStatus(int64_t connectionkey, void* providerstatus);
bool windowssysWindowsWin32StorageCloudfiltersCfReferenceProtectedHandle(void* protectedhandle);
int32_t windowssysWindowsWin32StorageCloudfiltersCfRegisterSyncRoot(void* syncrootpath, void* registration, void* policies, int32_t registerflags);
void windowssysWindowsWin32StorageCloudfiltersCfReleaseProtectedHandle(void* protectedhandle);
void windowssysWindowsWin32StorageCloudfiltersCfReleaseTransferKey(void* filehandle, void* transferkey);
int32_t windowssysWindowsWin32StorageCloudfiltersCfReportProviderProgress(int64_t connectionkey, int64_t transferkey, int64_t providerprogresstotal, int64_t providerprogresscompleted);
int32_t windowssysWindowsWin32StorageCloudfiltersCfReportProviderProgress2(int64_t connectionkey, int64_t transferkey, int64_t requestkey, int64_t providerprogresstotal, int64_t providerprogresscompleted, uint32_t targetsessionid);
int32_t windowssysWindowsWin32StorageCloudfiltersCfReportSyncStatus(void* syncrootpath, void* syncstatus);
int32_t windowssysWindowsWin32StorageCloudfiltersCfRevertPlaceholder(void* filehandle, int32_t revertflags, void* overlapped);
int32_t windowssysWindowsWin32StorageCloudfiltersCfSetCorrelationVector(void* filehandle, void* correlationvector);
int32_t windowssysWindowsWin32StorageCloudfiltersCfSetInSyncState(void* filehandle, int32_t insyncstate, int32_t insyncflags, void* insyncusn);
int32_t windowssysWindowsWin32StorageCloudfiltersCfSetPinState(void* filehandle, int32_t pinstate, int32_t pinflags, void* overlapped);
int32_t windowssysWindowsWin32StorageCloudfiltersCfUnregisterSyncRoot(void* syncrootpath);
int32_t windowssysWindowsWin32StorageCloudfiltersCfUpdatePlaceholder(void* filehandle, void* fsmetadata, void* fileidentity, uint32_t fileidentitylength, void* dehydraterangearray, uint32_t dehydraterangecount, int32_t updateflags, void* updateusn, void* overlapped);
int32_t windowssysWindowsWin32StorageCloudfiltersCfUpdateSyncProviderStatus(int64_t connectionkey, uint32_t providerstatus);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_CLOUDFILTERS_WINDOWS_WIN32_STORAGE_CLOUDFILTERS_WRAPPER_H */
