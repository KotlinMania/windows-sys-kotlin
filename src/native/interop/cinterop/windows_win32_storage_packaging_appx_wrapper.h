#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_PACKAGING_APPX_WINDOWS_WIN32_STORAGE_PACKAGING_APPX_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_PACKAGING_APPX_WINDOWS_WIN32_STORAGE_PACKAGING_APPX_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32StoragePackagingAppxActivatePackageVirtualizationContext(void* context, void* cookie);
int32_t windowssysWindowsWin32StoragePackagingAppxAddPackageDependency(void* packagedependencyid, int32_t rank, int32_t options, void* packagedependencycontext, void* packagefullname);
uint32_t windowssysWindowsWin32StoragePackagingAppxAppPolicyGetClrCompat(void* processtoken, void* policy);
uint32_t windowssysWindowsWin32StoragePackagingAppxAppPolicyGetCreateFileAccess(void* processtoken, void* policy);
uint32_t windowssysWindowsWin32StoragePackagingAppxAppPolicyGetLifecycleManagement(void* processtoken, void* policy);
uint32_t windowssysWindowsWin32StoragePackagingAppxAppPolicyGetMediaFoundationCodecLoading(void* processtoken, void* policy);
uint32_t windowssysWindowsWin32StoragePackagingAppxAppPolicyGetProcessTerminationMethod(void* processtoken, void* policy);
uint32_t windowssysWindowsWin32StoragePackagingAppxAppPolicyGetShowDeveloperDiagnostic(void* processtoken, void* policy);
uint32_t windowssysWindowsWin32StoragePackagingAppxAppPolicyGetThreadInitializationType(void* processtoken, void* policy);
uint32_t windowssysWindowsWin32StoragePackagingAppxAppPolicyGetWindowingModel(void* processtoken, void* policy);
int32_t windowssysWindowsWin32StoragePackagingAppxCheckIsMSIXPackage(void* packagefullname, void* ismsixpackage);
uint32_t windowssysWindowsWin32StoragePackagingAppxClosePackageInfo(void* packageinforeference);
int32_t windowssysWindowsWin32StoragePackagingAppxCreatePackageVirtualizationContext(void* packagefamilyname, void* context);
void windowssysWindowsWin32StoragePackagingAppxDeactivatePackageVirtualizationContext(uint64_t cookie);
int32_t windowssysWindowsWin32StoragePackagingAppxDeletePackageDependency(void* packagedependencyid);
int32_t windowssysWindowsWin32StoragePackagingAppxDuplicatePackageVirtualizationContext(void* sourcecontext, void* destcontext);
uint32_t windowssysWindowsWin32StoragePackagingAppxFindPackagesByPackageFamily(void* packagefamilyname, uint32_t packagefilters, void* count, void* packagefullnames, void* bufferlength, void* buffer, void* packageproperties);
uint32_t windowssysWindowsWin32StoragePackagingAppxFormatApplicationUserModelId(void* packagefamilyname, void* packagerelativeapplicationid, void* applicationusermodelidlength, void* applicationusermodelid);
uint32_t windowssysWindowsWin32StoragePackagingAppxGetApplicationUserModelId(void* hprocess, void* applicationusermodelidlength, void* applicationusermodelid);
uint32_t windowssysWindowsWin32StoragePackagingAppxGetApplicationUserModelIdFromToken(void* token, void* applicationusermodelidlength, void* applicationusermodelid);
uint32_t windowssysWindowsWin32StoragePackagingAppxGetCurrentApplicationUserModelId(void* applicationusermodelidlength, void* applicationusermodelid);
uint32_t windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageFamilyName(void* packagefamilynamelength, void* packagefamilyname);
uint32_t windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageFullName(void* packagefullnamelength, void* packagefullname);
uint32_t windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageId(void* bufferlength, void* buffer);
uint32_t windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo(uint32_t flags, void* bufferlength, void* buffer, void* count);
uint32_t windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo2(uint32_t flags, int32_t packagepathtype, void* bufferlength, void* buffer, void* count);
int32_t windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo3(uint32_t flags, int32_t packageinfotype, void* bufferlength, void* buffer, void* count);
uint32_t windowssysWindowsWin32StoragePackagingAppxGetCurrentPackagePath(void* pathlength, void* path);
uint32_t windowssysWindowsWin32StoragePackagingAppxGetCurrentPackagePath2(int32_t packagepathtype, void* pathlength, void* path);
void* windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageVirtualizationContext(void);
int32_t windowssysWindowsWin32StoragePackagingAppxGetIdForPackageDependencyContext(void* packagedependencycontext, void* packagedependencyid);
uint32_t windowssysWindowsWin32StoragePackagingAppxGetPackageApplicationIds(void* packageinforeference, void* bufferlength, void* buffer, void* count);
uint32_t windowssysWindowsWin32StoragePackagingAppxGetPackageFamilyName(void* hprocess, void* packagefamilynamelength, void* packagefamilyname);
uint32_t windowssysWindowsWin32StoragePackagingAppxGetPackageFamilyNameFromToken(void* token, void* packagefamilynamelength, void* packagefamilyname);
uint32_t windowssysWindowsWin32StoragePackagingAppxGetPackageFullName(void* hprocess, void* packagefullnamelength, void* packagefullname);
uint32_t windowssysWindowsWin32StoragePackagingAppxGetPackageFullNameFromToken(void* token, void* packagefullnamelength, void* packagefullname);
uint32_t windowssysWindowsWin32StoragePackagingAppxGetPackageGraphRevisionId(void);
uint32_t windowssysWindowsWin32StoragePackagingAppxGetPackageId(void* hprocess, void* bufferlength, void* buffer);
uint32_t windowssysWindowsWin32StoragePackagingAppxGetPackageInfo(void* packageinforeference, uint32_t flags, void* bufferlength, void* buffer, void* count);
uint32_t windowssysWindowsWin32StoragePackagingAppxGetPackageInfo2(void* packageinforeference, uint32_t flags, int32_t packagepathtype, void* bufferlength, void* buffer, void* count);
uint32_t windowssysWindowsWin32StoragePackagingAppxGetPackagePath(void* packageid, uint32_t reserved, void* pathlength, void* path);
uint32_t windowssysWindowsWin32StoragePackagingAppxGetPackagePathByFullName(void* packagefullname, void* pathlength, void* path);
uint32_t windowssysWindowsWin32StoragePackagingAppxGetPackagePathByFullName2(void* packagefullname, int32_t packagepathtype, void* pathlength, void* path);
uint32_t windowssysWindowsWin32StoragePackagingAppxGetPackagesByPackageFamily(void* packagefamilyname, void* count, void* packagefullnames, void* bufferlength, void* buffer);
int32_t windowssysWindowsWin32StoragePackagingAppxGetProcessesInVirtualizationContext(void* packagefamilyname, void* count, void* processes);
int32_t windowssysWindowsWin32StoragePackagingAppxGetResolvedPackageFullNameForPackageDependency(void* packagedependencyid, void* packagefullname);
uint32_t windowssysWindowsWin32StoragePackagingAppxGetStagedPackageOrigin(void* packagefullname, void* origin);
uint32_t windowssysWindowsWin32StoragePackagingAppxGetStagedPackagePathByFullName(void* packagefullname, void* pathlength, void* path);
uint32_t windowssysWindowsWin32StoragePackagingAppxGetStagedPackagePathByFullName2(void* packagefullname, int32_t packagepathtype, void* pathlength, void* path);
uint32_t windowssysWindowsWin32StoragePackagingAppxOpenPackageInfoByFullName(void* packagefullname, uint32_t reserved, void* packageinforeference);
uint32_t windowssysWindowsWin32StoragePackagingAppxOpenPackageInfoByFullNameForUser(void* usersid, void* packagefullname, uint32_t reserved, void* packageinforeference);
uint32_t windowssysWindowsWin32StoragePackagingAppxPackageFamilyNameFromFullName(void* packagefullname, void* packagefamilynamelength, void* packagefamilyname);
uint32_t windowssysWindowsWin32StoragePackagingAppxPackageFamilyNameFromId(void* packageid, void* packagefamilynamelength, void* packagefamilyname);
uint32_t windowssysWindowsWin32StoragePackagingAppxPackageFullNameFromId(void* packageid, void* packagefullnamelength, void* packagefullname);
uint32_t windowssysWindowsWin32StoragePackagingAppxPackageIdFromFullName(void* packagefullname, uint32_t flags, void* bufferlength, void* buffer);
uint32_t windowssysWindowsWin32StoragePackagingAppxPackageNameAndPublisherIdFromFamilyName(void* packagefamilyname, void* packagenamelength, void* packagename, void* packagepublisheridlength, void* packagepublisherid);
uint32_t windowssysWindowsWin32StoragePackagingAppxParseApplicationUserModelId(void* applicationusermodelid, void* packagefamilynamelength, void* packagefamilyname, void* packagerelativeapplicationidlength, void* packagerelativeapplicationid);
void windowssysWindowsWin32StoragePackagingAppxReleasePackageVirtualizationContext(void* context);
int32_t windowssysWindowsWin32StoragePackagingAppxRemovePackageDependency(void* packagedependencycontext);
uint32_t windowssysWindowsWin32StoragePackagingAppxVerifyApplicationUserModelId(void* applicationusermodelid);
uint32_t windowssysWindowsWin32StoragePackagingAppxVerifyPackageFamilyName(void* packagefamilyname);
uint32_t windowssysWindowsWin32StoragePackagingAppxVerifyPackageFullName(void* packagefullname);
uint32_t windowssysWindowsWin32StoragePackagingAppxVerifyPackageId(void* packageid);
uint32_t windowssysWindowsWin32StoragePackagingAppxVerifyPackageRelativeApplicationId(void* packagerelativeapplicationid);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_PACKAGING_APPX_WINDOWS_WIN32_STORAGE_PACKAGING_APPX_WRAPPER_H */
