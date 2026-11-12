#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_DISTRIBUTEDFILESYSTEM_WINDOWS_WIN32_STORAGE_DISTRIBUTEDFILESYSTEM_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_DISTRIBUTEDFILESYSTEM_WINDOWS_WIN32_STORAGE_DISTRIBUTEDFILESYSTEM_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssysWindowsWin32StorageDistributedfilesystemNetDfsAdd(void* dfsentrypath, void* servername, void* sharename, void* comment, uint32_t flags);
uint32_t windowssysWindowsWin32StorageDistributedfilesystemNetDfsAddFtRoot(void* servername, void* rootshare, void* ftdfsname, void* comment, uint32_t flags);
uint32_t windowssysWindowsWin32StorageDistributedfilesystemNetDfsAddRootTarget(void* pdfspath, void* ptargetpath, uint32_t majorversion, void* pcomment, uint32_t flags);
uint32_t windowssysWindowsWin32StorageDistributedfilesystemNetDfsAddStdRoot(void* servername, void* rootshare, void* comment, uint32_t flags);
uint32_t windowssysWindowsWin32StorageDistributedfilesystemNetDfsEnum(void* dfsname, uint32_t level, uint32_t prefmaxlen, void* buffer, void* entriesread, void* resumehandle);
uint32_t windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetClientInfo(void* dfsentrypath, void* servername, void* sharename, uint32_t level, void* buffer);
uint32_t windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetFtContainerSecurity(void* domainname, uint32_t securityinformation, void* ppsecuritydescriptor, void* lpcbsecuritydescriptor);
uint32_t windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetInfo(void* dfsentrypath, void* servername, void* sharename, uint32_t level, void* buffer);
uint32_t windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetSecurity(void* dfsentrypath, uint32_t securityinformation, void* ppsecuritydescriptor, void* lpcbsecuritydescriptor);
uint32_t windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetStdContainerSecurity(void* machinename, uint32_t securityinformation, void* ppsecuritydescriptor, void* lpcbsecuritydescriptor);
uint32_t windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetSupportedNamespaceVersion(int32_t origin, void* pname, void* ppversioninfo);
uint32_t windowssysWindowsWin32StorageDistributedfilesystemNetDfsMove(void* olddfsentrypath, void* newdfsentrypath, uint32_t flags);
uint32_t windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemove(void* dfsentrypath, void* servername, void* sharename);
uint32_t windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveFtRoot(void* servername, void* rootshare, void* ftdfsname, uint32_t flags);
uint32_t windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveFtRootForced(void* domainname, void* servername, void* rootshare, void* ftdfsname, uint32_t flags);
uint32_t windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveRootTarget(void* pdfspath, void* ptargetpath, uint32_t flags);
uint32_t windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveStdRoot(void* servername, void* rootshare, uint32_t flags);
uint32_t windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetClientInfo(void* dfsentrypath, void* servername, void* sharename, uint32_t level, void* buffer);
uint32_t windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetFtContainerSecurity(void* domainname, uint32_t securityinformation, void* psecuritydescriptor);
uint32_t windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetInfo(void* dfsentrypath, void* servername, void* sharename, uint32_t level, void* buffer);
uint32_t windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetSecurity(void* dfsentrypath, uint32_t securityinformation, void* psecuritydescriptor);
uint32_t windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetStdContainerSecurity(void* machinename, uint32_t securityinformation, void* psecuritydescriptor);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_DISTRIBUTEDFILESYSTEM_WINDOWS_WIN32_STORAGE_DISTRIBUTEDFILESYSTEM_WRAPPER_H */
