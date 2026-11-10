#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_DISTRIBUTEDFILESYSTEM_WINDOWS_WIN32_STORAGE_DISTRIBUTEDFILESYSTEM_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_DISTRIBUTEDFILESYSTEM_WINDOWS_WIN32_STORAGE_DISTRIBUTEDFILESYSTEM_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsAdd(void* dfsentrypath, void* servername, void* sharename, void* comment, uint32_t flags);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsAddFtRoot(void* servername, void* rootshare, void* ftdfsname, void* comment, uint32_t flags);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsAddRootTarget(void* pdfspath, void* ptargetpath, uint32_t majorversion, void* pcomment, uint32_t flags);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsAddStdRoot(void* servername, void* rootshare, void* comment, uint32_t flags);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsEnum(void* dfsname, uint32_t level, uint32_t prefmaxlen, void* buffer, void* entriesread, void* resumehandle);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsGetClientInfo(void* dfsentrypath, void* servername, void* sharename, uint32_t level, void* buffer);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsGetFtContainerSecurity(void* domainname, uint32_t securityinformation, void* ppsecuritydescriptor, void* lpcbsecuritydescriptor);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsGetInfo(void* dfsentrypath, void* servername, void* sharename, uint32_t level, void* buffer);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsGetSecurity(void* dfsentrypath, uint32_t securityinformation, void* ppsecuritydescriptor, void* lpcbsecuritydescriptor);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsGetStdContainerSecurity(void* machinename, uint32_t securityinformation, void* ppsecuritydescriptor, void* lpcbsecuritydescriptor);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsGetSupportedNamespaceVersion(int32_t origin, void* pname, void* ppversioninfo);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsMove(void* olddfsentrypath, void* newdfsentrypath, uint32_t flags);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsRemove(void* dfsentrypath, void* servername, void* sharename);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveFtRoot(void* servername, void* rootshare, void* ftdfsname, uint32_t flags);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveFtRootForced(void* domainname, void* servername, void* rootshare, void* ftdfsname, uint32_t flags);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveRootTarget(void* pdfspath, void* ptargetpath, uint32_t flags);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveStdRoot(void* servername, void* rootshare, uint32_t flags);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsSetClientInfo(void* dfsentrypath, void* servername, void* sharename, uint32_t level, void* buffer);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsSetFtContainerSecurity(void* domainname, uint32_t securityinformation, void* psecuritydescriptor);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsSetInfo(void* dfsentrypath, void* servername, void* sharename, uint32_t level, void* buffer);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsSetSecurity(void* dfsentrypath, uint32_t securityinformation, void* psecuritydescriptor);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_netDfsSetStdContainerSecurity(void* machinename, uint32_t securityinformation, void* psecuritydescriptor);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_DISTRIBUTEDFILESYSTEM_WINDOWS_WIN32_STORAGE_DISTRIBUTEDFILESYSTEM_WRAPPER_H */
