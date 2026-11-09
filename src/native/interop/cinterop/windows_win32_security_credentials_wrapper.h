#ifndef WINDOWSSYS_WINDOWS_WIN32_SECURITY_CREDENTIALS_WINDOWS_WIN32_SECURITY_CREDENTIALS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SECURITY_CREDENTIALS_WINDOWS_WIN32_SECURITY_CREDENTIALS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_security_credentials_CredDeleteA(void* targetname, uint32_t type, uint32_t flags);
int32_t windowssys_windows_win32_security_credentials_CredDeleteW(void* targetname, uint32_t type, uint32_t flags);
int32_t windowssys_windows_win32_security_credentials_CredEnumerateA(void* filter, uint32_t flags, void* count, void* credential);
int32_t windowssys_windows_win32_security_credentials_CredEnumerateW(void* filter, uint32_t flags, void* count, void* credential);
int32_t windowssys_windows_win32_security_credentials_CredFindBestCredentialA(void* targetname, uint32_t type, uint32_t flags, void* credential);
int32_t windowssys_windows_win32_security_credentials_CredFindBestCredentialW(void* targetname, uint32_t type, uint32_t flags, void* credential);
void windowssys_windows_win32_security_credentials_CredFree(void* buffer);
int32_t windowssys_windows_win32_security_credentials_CredGetSessionTypes(uint32_t maximumpersistcount, void* maximumpersist);
int32_t windowssys_windows_win32_security_credentials_CredGetTargetInfoA(void* targetname, uint32_t flags, void* targetinfo);
int32_t windowssys_windows_win32_security_credentials_CredGetTargetInfoW(void* targetname, uint32_t flags, void* targetinfo);
int32_t windowssys_windows_win32_security_credentials_CredIsMarshaledCredentialA(void* marshaledcredential);
int32_t windowssys_windows_win32_security_credentials_CredIsMarshaledCredentialW(void* marshaledcredential);
int32_t windowssys_windows_win32_security_credentials_CredIsProtectedA(void* pszprotectedcredentials, void* pprotectiontype);
int32_t windowssys_windows_win32_security_credentials_CredIsProtectedW(void* pszprotectedcredentials, void* pprotectiontype);
int32_t windowssys_windows_win32_security_credentials_CredMarshalCredentialA(int32_t credtype, void* credential, void* marshaledcredential);
int32_t windowssys_windows_win32_security_credentials_CredMarshalCredentialW(int32_t credtype, void* credential, void* marshaledcredential);
int32_t windowssys_windows_win32_security_credentials_CredPackAuthenticationBufferA(uint32_t dwflags, void* pszusername, void* pszpassword, void* ppackedcredentials, void* pcbpackedcredentials);
int32_t windowssys_windows_win32_security_credentials_CredPackAuthenticationBufferW(uint32_t dwflags, void* pszusername, void* pszpassword, void* ppackedcredentials, void* pcbpackedcredentials);
int32_t windowssys_windows_win32_security_credentials_CredProtectA(int32_t fasself, void* pszcredentials, uint32_t cchcredentials, void* pszprotectedcredentials, void* pcchmaxchars, void* protectiontype);
int32_t windowssys_windows_win32_security_credentials_CredProtectW(int32_t fasself, void* pszcredentials, uint32_t cchcredentials, void* pszprotectedcredentials, void* pcchmaxchars, void* protectiontype);
int32_t windowssys_windows_win32_security_credentials_CredReadA(void* targetname, uint32_t type, uint32_t flags, void* credential);
int32_t windowssys_windows_win32_security_credentials_CredReadDomainCredentialsA(void* targetinfo, uint32_t flags, void* count, void* credential);
int32_t windowssys_windows_win32_security_credentials_CredReadDomainCredentialsW(void* targetinfo, uint32_t flags, void* count, void* credential);
int32_t windowssys_windows_win32_security_credentials_CredReadW(void* targetname, uint32_t type, uint32_t flags, void* credential);
int32_t windowssys_windows_win32_security_credentials_CredRenameA(void* oldtargetname, void* newtargetname, uint32_t type, uint32_t flags);
int32_t windowssys_windows_win32_security_credentials_CredRenameW(void* oldtargetname, void* newtargetname, uint32_t type, uint32_t flags);
uint32_t windowssys_windows_win32_security_credentials_CredUICmdLinePromptForCredentialsA(void* psztargetname, void* pcontext, uint32_t dwautherror, void* username, uint32_t uluserbuffersize, void* pszpassword, uint32_t ulpasswordbuffersize, void* pfsave, uint32_t dwflags);
uint32_t windowssys_windows_win32_security_credentials_CredUICmdLinePromptForCredentialsW(void* psztargetname, void* pcontext, uint32_t dwautherror, void* username, uint32_t uluserbuffersize, void* pszpassword, uint32_t ulpasswordbuffersize, void* pfsave, uint32_t dwflags);
uint32_t windowssys_windows_win32_security_credentials_CredUIConfirmCredentialsA(void* psztargetname, int32_t bconfirm);
uint32_t windowssys_windows_win32_security_credentials_CredUIConfirmCredentialsW(void* psztargetname, int32_t bconfirm);
uint32_t windowssys_windows_win32_security_credentials_CredUIParseUserNameA(void* username, void* user, uint32_t userbuffersize, void* domain, uint32_t domainbuffersize);
uint32_t windowssys_windows_win32_security_credentials_CredUIParseUserNameW(void* username, void* user, uint32_t userbuffersize, void* domain, uint32_t domainbuffersize);
uint32_t windowssys_windows_win32_security_credentials_CredUIPromptForCredentialsA(void* puiinfo, void* psztargetname, void* pcontext, uint32_t dwautherror, void* pszusername, uint32_t ulusernamebuffersize, void* pszpassword, uint32_t ulpasswordbuffersize, void* save, uint32_t dwflags);
uint32_t windowssys_windows_win32_security_credentials_CredUIPromptForCredentialsW(void* puiinfo, void* psztargetname, void* pcontext, uint32_t dwautherror, void* pszusername, uint32_t ulusernamebuffersize, void* pszpassword, uint32_t ulpasswordbuffersize, void* save, uint32_t dwflags);
uint32_t windowssys_windows_win32_security_credentials_CredUIPromptForWindowsCredentialsA(void* puiinfo, uint32_t dwautherror, void* pulauthpackage, void* pvinauthbuffer, uint32_t ulinauthbuffersize, void* ppvoutauthbuffer, void* puloutauthbuffersize, void* pfsave, uint32_t dwflags);
uint32_t windowssys_windows_win32_security_credentials_CredUIPromptForWindowsCredentialsW(void* puiinfo, uint32_t dwautherror, void* pulauthpackage, void* pvinauthbuffer, uint32_t ulinauthbuffersize, void* ppvoutauthbuffer, void* puloutauthbuffersize, void* pfsave, uint32_t dwflags);
uint32_t windowssys_windows_win32_security_credentials_CredUIReadSSOCredW(void* pszrealm, void* ppszusername);
uint32_t windowssys_windows_win32_security_credentials_CredUIStoreSSOCredW(void* pszrealm, void* pszusername, void* pszpassword, int32_t bpersist);
int32_t windowssys_windows_win32_security_credentials_CredUnPackAuthenticationBufferA(uint32_t dwflags, void* pauthbuffer, uint32_t cbauthbuffer, void* pszusername, void* pcchlmaxusername, void* pszdomainname, void* pcchmaxdomainname, void* pszpassword, void* pcchmaxpassword);
int32_t windowssys_windows_win32_security_credentials_CredUnPackAuthenticationBufferW(uint32_t dwflags, void* pauthbuffer, uint32_t cbauthbuffer, void* pszusername, void* pcchmaxusername, void* pszdomainname, void* pcchmaxdomainname, void* pszpassword, void* pcchmaxpassword);
int32_t windowssys_windows_win32_security_credentials_CredUnmarshalCredentialA(void* marshaledcredential, void* credtype, void* credential);
int32_t windowssys_windows_win32_security_credentials_CredUnmarshalCredentialW(void* marshaledcredential, void* credtype, void* credential);
int32_t windowssys_windows_win32_security_credentials_CredUnprotectA(int32_t fasself, void* pszprotectedcredentials, uint32_t cchprotectedcredentials, void* pszcredentials, void* pcchmaxchars);
int32_t windowssys_windows_win32_security_credentials_CredUnprotectW(int32_t fasself, void* pszprotectedcredentials, uint32_t cchprotectedcredentials, void* pszcredentials, void* pcchmaxchars);
int32_t windowssys_windows_win32_security_credentials_CredWriteA(void* credential, uint32_t flags);
int32_t windowssys_windows_win32_security_credentials_CredWriteDomainCredentialsA(void* targetinfo, void* credential, uint32_t flags);
int32_t windowssys_windows_win32_security_credentials_CredWriteDomainCredentialsW(void* targetinfo, void* credential, uint32_t flags);
int32_t windowssys_windows_win32_security_credentials_CredWriteW(void* credential, uint32_t flags);
int32_t windowssys_windows_win32_security_credentials_GetOpenCardNameA(void* param0);
int32_t windowssys_windows_win32_security_credentials_GetOpenCardNameW(void* param0);
void windowssys_windows_win32_security_credentials_KeyCredentialManagerFreeInformation(void* keycredentialmanagerinfo);
int32_t windowssys_windows_win32_security_credentials_KeyCredentialManagerGetInformation(void* keycredentialmanagerinfo);
int32_t windowssys_windows_win32_security_credentials_KeyCredentialManagerGetOperationErrorStates(int32_t keycredentialmanageroperationtype, void* isready, void* keycredentialmanageroperationerrorstates);
int32_t windowssys_windows_win32_security_credentials_KeyCredentialManagerShowUIOperation(void* hwndowner, int32_t keycredentialmanageroperationtype);
void* windowssys_windows_win32_security_credentials_SCardAccessStartedEvent(void);
int32_t windowssys_windows_win32_security_credentials_SCardAddReaderToGroupA(uint64_t hcontext, void* szreadername, void* szgroupname);
int32_t windowssys_windows_win32_security_credentials_SCardAddReaderToGroupW(uint64_t hcontext, void* szreadername, void* szgroupname);
int32_t windowssys_windows_win32_security_credentials_SCardAudit(uint64_t hcontext, uint32_t dwevent);
int32_t windowssys_windows_win32_security_credentials_SCardBeginTransaction(uint64_t hcard);
int32_t windowssys_windows_win32_security_credentials_SCardCancel(uint64_t hcontext);
int32_t windowssys_windows_win32_security_credentials_SCardConnectA(uint64_t hcontext, void* szreader, uint32_t dwsharemode, uint32_t dwpreferredprotocols, void* phcard, void* pdwactiveprotocol);
int32_t windowssys_windows_win32_security_credentials_SCardConnectW(uint64_t hcontext, void* szreader, uint32_t dwsharemode, uint32_t dwpreferredprotocols, void* phcard, void* pdwactiveprotocol);
int32_t windowssys_windows_win32_security_credentials_SCardControl(uint64_t hcard, uint32_t dwcontrolcode, void* lpinbuffer, uint32_t cbinbuffersize, void* lpoutbuffer, uint32_t cboutbuffersize, void* lpbytesreturned);
int32_t windowssys_windows_win32_security_credentials_SCardDisconnect(uint64_t hcard, uint32_t dwdisposition);
int32_t windowssys_windows_win32_security_credentials_SCardDlgExtendedError(void);
int32_t windowssys_windows_win32_security_credentials_SCardEndTransaction(uint64_t hcard, uint32_t dwdisposition);
int32_t windowssys_windows_win32_security_credentials_SCardEstablishContext(uint32_t dwscope, void* pvreserved1, void* pvreserved2, void* phcontext);
int32_t windowssys_windows_win32_security_credentials_SCardForgetCardTypeA(uint64_t hcontext, void* szcardname);
int32_t windowssys_windows_win32_security_credentials_SCardForgetCardTypeW(uint64_t hcontext, void* szcardname);
int32_t windowssys_windows_win32_security_credentials_SCardForgetReaderA(uint64_t hcontext, void* szreadername);
int32_t windowssys_windows_win32_security_credentials_SCardForgetReaderGroupA(uint64_t hcontext, void* szgroupname);
int32_t windowssys_windows_win32_security_credentials_SCardForgetReaderGroupW(uint64_t hcontext, void* szgroupname);
int32_t windowssys_windows_win32_security_credentials_SCardForgetReaderW(uint64_t hcontext, void* szreadername);
int32_t windowssys_windows_win32_security_credentials_SCardFreeMemory(uint64_t hcontext, void* pvmem);
int32_t windowssys_windows_win32_security_credentials_SCardGetAttrib(uint64_t hcard, uint32_t dwattrid, void* pbattr, void* pcbattrlen);
int32_t windowssys_windows_win32_security_credentials_SCardGetCardTypeProviderNameA(uint64_t hcontext, void* szcardname, uint32_t dwproviderid, void* szprovider, void* pcchprovider);
int32_t windowssys_windows_win32_security_credentials_SCardGetCardTypeProviderNameW(uint64_t hcontext, void* szcardname, uint32_t dwproviderid, void* szprovider, void* pcchprovider);
int32_t windowssys_windows_win32_security_credentials_SCardGetDeviceTypeIdA(uint64_t hcontext, void* szreadername, void* pdwdevicetypeid);
int32_t windowssys_windows_win32_security_credentials_SCardGetDeviceTypeIdW(uint64_t hcontext, void* szreadername, void* pdwdevicetypeid);
int32_t windowssys_windows_win32_security_credentials_SCardGetProviderIdA(uint64_t hcontext, void* szcard, void* pguidproviderid);
int32_t windowssys_windows_win32_security_credentials_SCardGetProviderIdW(uint64_t hcontext, void* szcard, void* pguidproviderid);
int32_t windowssys_windows_win32_security_credentials_SCardGetReaderDeviceInstanceIdA(uint64_t hcontext, void* szreadername, void* szdeviceinstanceid, void* pcchdeviceinstanceid);
int32_t windowssys_windows_win32_security_credentials_SCardGetReaderDeviceInstanceIdW(uint64_t hcontext, void* szreadername, void* szdeviceinstanceid, void* pcchdeviceinstanceid);
int32_t windowssys_windows_win32_security_credentials_SCardGetReaderIconA(uint64_t hcontext, void* szreadername, void* pbicon, void* pcbicon);
int32_t windowssys_windows_win32_security_credentials_SCardGetReaderIconW(uint64_t hcontext, void* szreadername, void* pbicon, void* pcbicon);
int32_t windowssys_windows_win32_security_credentials_SCardGetStatusChangeA(uint64_t hcontext, uint32_t dwtimeout, void* rgreaderstates, uint32_t creaders);
int32_t windowssys_windows_win32_security_credentials_SCardGetStatusChangeW(uint64_t hcontext, uint32_t dwtimeout, void* rgreaderstates, uint32_t creaders);
int32_t windowssys_windows_win32_security_credentials_SCardGetTransmitCount(uint64_t hcard, void* pctransmitcount);
int32_t windowssys_windows_win32_security_credentials_SCardIntroduceCardTypeA(uint64_t hcontext, void* szcardname, void* pguidprimaryprovider, void* rgguidinterfaces, uint32_t dwinterfacecount, void* pbatr, void* pbatrmask, uint32_t cbatrlen);
int32_t windowssys_windows_win32_security_credentials_SCardIntroduceCardTypeW(uint64_t hcontext, void* szcardname, void* pguidprimaryprovider, void* rgguidinterfaces, uint32_t dwinterfacecount, void* pbatr, void* pbatrmask, uint32_t cbatrlen);
int32_t windowssys_windows_win32_security_credentials_SCardIntroduceReaderA(uint64_t hcontext, void* szreadername, void* szdevicename);
int32_t windowssys_windows_win32_security_credentials_SCardIntroduceReaderGroupA(uint64_t hcontext, void* szgroupname);
int32_t windowssys_windows_win32_security_credentials_SCardIntroduceReaderGroupW(uint64_t hcontext, void* szgroupname);
int32_t windowssys_windows_win32_security_credentials_SCardIntroduceReaderW(uint64_t hcontext, void* szreadername, void* szdevicename);
int32_t windowssys_windows_win32_security_credentials_SCardIsValidContext(uint64_t hcontext);
int32_t windowssys_windows_win32_security_credentials_SCardListCardsA(uint64_t hcontext, void* pbatr, void* rgquidinterfaces, uint32_t cguidinterfacecount, void* mszcards, void* pcchcards);
int32_t windowssys_windows_win32_security_credentials_SCardListCardsW(uint64_t hcontext, void* pbatr, void* rgquidinterfaces, uint32_t cguidinterfacecount, void* mszcards, void* pcchcards);
int32_t windowssys_windows_win32_security_credentials_SCardListInterfacesA(uint64_t hcontext, void* szcard, void* pguidinterfaces, void* pcguidinterfaces);
int32_t windowssys_windows_win32_security_credentials_SCardListInterfacesW(uint64_t hcontext, void* szcard, void* pguidinterfaces, void* pcguidinterfaces);
int32_t windowssys_windows_win32_security_credentials_SCardListReaderGroupsA(uint64_t hcontext, void* mszgroups, void* pcchgroups);
int32_t windowssys_windows_win32_security_credentials_SCardListReaderGroupsW(uint64_t hcontext, void* mszgroups, void* pcchgroups);
int32_t windowssys_windows_win32_security_credentials_SCardListReadersA(uint64_t hcontext, void* mszgroups, void* mszreaders, void* pcchreaders);
int32_t windowssys_windows_win32_security_credentials_SCardListReadersW(uint64_t hcontext, void* mszgroups, void* mszreaders, void* pcchreaders);
int32_t windowssys_windows_win32_security_credentials_SCardListReadersWithDeviceInstanceIdA(uint64_t hcontext, void* szdeviceinstanceid, void* mszreaders, void* pcchreaders);
int32_t windowssys_windows_win32_security_credentials_SCardListReadersWithDeviceInstanceIdW(uint64_t hcontext, void* szdeviceinstanceid, void* mszreaders, void* pcchreaders);
int32_t windowssys_windows_win32_security_credentials_SCardLocateCardsA(uint64_t hcontext, void* mszcards, void* rgreaderstates, uint32_t creaders);
int32_t windowssys_windows_win32_security_credentials_SCardLocateCardsByATRA(uint64_t hcontext, void* rgatrmasks, uint32_t catrs, void* rgreaderstates, uint32_t creaders);
int32_t windowssys_windows_win32_security_credentials_SCardLocateCardsByATRW(uint64_t hcontext, void* rgatrmasks, uint32_t catrs, void* rgreaderstates, uint32_t creaders);
int32_t windowssys_windows_win32_security_credentials_SCardLocateCardsW(uint64_t hcontext, void* mszcards, void* rgreaderstates, uint32_t creaders);
int32_t windowssys_windows_win32_security_credentials_SCardReadCacheA(uint64_t hcontext, void* cardidentifier, uint32_t freshnesscounter, void* lookupname, void* data, void* datalen);
int32_t windowssys_windows_win32_security_credentials_SCardReadCacheW(uint64_t hcontext, void* cardidentifier, uint32_t freshnesscounter, void* lookupname, void* data, void* datalen);
int32_t windowssys_windows_win32_security_credentials_SCardReconnect(uint64_t hcard, uint32_t dwsharemode, uint32_t dwpreferredprotocols, uint32_t dwinitialization, void* pdwactiveprotocol);
int32_t windowssys_windows_win32_security_credentials_SCardReleaseContext(uint64_t hcontext);
void windowssys_windows_win32_security_credentials_SCardReleaseStartedEvent(void);
int32_t windowssys_windows_win32_security_credentials_SCardRemoveReaderFromGroupA(uint64_t hcontext, void* szreadername, void* szgroupname);
int32_t windowssys_windows_win32_security_credentials_SCardRemoveReaderFromGroupW(uint64_t hcontext, void* szreadername, void* szgroupname);
int32_t windowssys_windows_win32_security_credentials_SCardSetAttrib(uint64_t hcard, uint32_t dwattrid, void* pbattr, uint32_t cbattrlen);
int32_t windowssys_windows_win32_security_credentials_SCardSetCardTypeProviderNameA(uint64_t hcontext, void* szcardname, uint32_t dwproviderid, void* szprovider);
int32_t windowssys_windows_win32_security_credentials_SCardSetCardTypeProviderNameW(uint64_t hcontext, void* szcardname, uint32_t dwproviderid, void* szprovider);
int32_t windowssys_windows_win32_security_credentials_SCardState(uint64_t hcard, void* pdwstate, void* pdwprotocol, void* pbatr, void* pcbatrlen);
int32_t windowssys_windows_win32_security_credentials_SCardStatusA(uint64_t hcard, void* mszreadernames, void* pcchreaderlen, void* pdwstate, void* pdwprotocol, void* pbatr, void* pcbatrlen);
int32_t windowssys_windows_win32_security_credentials_SCardStatusW(uint64_t hcard, void* mszreadernames, void* pcchreaderlen, void* pdwstate, void* pdwprotocol, void* pbatr, void* pcbatrlen);
int32_t windowssys_windows_win32_security_credentials_SCardTransmit(uint64_t hcard, void* piosendpci, void* pbsendbuffer, uint32_t cbsendlength, void* piorecvpci, void* pbrecvbuffer, void* pcbrecvlength);
int32_t windowssys_windows_win32_security_credentials_SCardUIDlgSelectCardA(void* param0);
int32_t windowssys_windows_win32_security_credentials_SCardUIDlgSelectCardW(void* param0);
int32_t windowssys_windows_win32_security_credentials_SCardWriteCacheA(uint64_t hcontext, void* cardidentifier, uint32_t freshnesscounter, void* lookupname, void* data, uint32_t datalen);
int32_t windowssys_windows_win32_security_credentials_SCardWriteCacheW(uint64_t hcontext, void* cardidentifier, uint32_t freshnesscounter, void* lookupname, void* data, uint32_t datalen);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SECURITY_CREDENTIALS_WINDOWS_WIN32_SECURITY_CREDENTIALS_WRAPPER_H */
