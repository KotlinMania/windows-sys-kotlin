#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_DISTRIBUTEDFILESYSTEM_WINDOWS_WIN32_STORAGE_DISTRIBUTEDFILESYSTEM_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_DISTRIBUTEDFILESYSTEM_WINDOWS_WIN32_STORAGE_DISTRIBUTEDFILESYSTEM_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_storage_distributedfilesystem_NetDfsAdd(void* dfsentrypath, void* servername, void* sharename, void* comment, uint32_t flags);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_NetDfsAddFtRoot(void* servername, void* rootshare, void* ftdfsname, void* comment, uint32_t flags);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_NetDfsAddRootTarget(void* pdfspath, void* ptargetpath, uint32_t majorversion, void* pcomment, uint32_t flags);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_NetDfsAddStdRoot(void* servername, void* rootshare, void* comment, uint32_t flags);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_NetDfsEnum(void* dfsname, uint32_t level, uint32_t prefmaxlen, void* buffer, void* entriesread, void* resumehandle);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetClientInfo(void* dfsentrypath, void* servername, void* sharename, uint32_t level, void* buffer);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetFtContainerSecurity(void* domainname, uint32_t securityinformation, void* ppsecuritydescriptor, void* lpcbsecuritydescriptor);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetInfo(void* dfsentrypath, void* servername, void* sharename, uint32_t level, void* buffer);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetSecurity(void* dfsentrypath, uint32_t securityinformation, void* ppsecuritydescriptor, void* lpcbsecuritydescriptor);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetStdContainerSecurity(void* machinename, uint32_t securityinformation, void* ppsecuritydescriptor, void* lpcbsecuritydescriptor);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetSupportedNamespaceVersion(int32_t origin, void* pname, void* ppversioninfo);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_NetDfsMove(void* olddfsentrypath, void* newdfsentrypath, uint32_t flags);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_NetDfsRemove(void* dfsentrypath, void* servername, void* sharename);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_NetDfsRemoveFtRoot(void* servername, void* rootshare, void* ftdfsname, uint32_t flags);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_NetDfsRemoveFtRootForced(void* domainname, void* servername, void* rootshare, void* ftdfsname, uint32_t flags);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_NetDfsRemoveRootTarget(void* pdfspath, void* ptargetpath, uint32_t flags);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_NetDfsRemoveStdRoot(void* servername, void* rootshare, uint32_t flags);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_NetDfsSetClientInfo(void* dfsentrypath, void* servername, void* sharename, uint32_t level, void* buffer);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_NetDfsSetFtContainerSecurity(void* domainname, uint32_t securityinformation, void* psecuritydescriptor);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_NetDfsSetInfo(void* dfsentrypath, void* servername, void* sharename, uint32_t level, void* buffer);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_NetDfsSetSecurity(void* dfsentrypath, uint32_t securityinformation, void* psecuritydescriptor);
uint32_t windowssys_windows_win32_storage_distributedfilesystem_NetDfsSetStdContainerSecurity(void* machinename, uint32_t securityinformation, void* psecuritydescriptor);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_DISTRIBUTEDFILESYSTEM_WINDOWS_WIN32_STORAGE_DISTRIBUTEDFILESYSTEM_WRAPPER_H */
