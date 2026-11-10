package io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult

public fun interface WsAbandonMessageCallbackFn {
    public operator fun invoke(channelinstance: COpaquePointer?, message: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsAbandonMessageCallback = WsAbandonMessageCallbackFn?

public fun interface WsAbortChannelCallbackFn {
    public operator fun invoke(channelinstance: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsAbortChannelCallback = WsAbortChannelCallbackFn?

public fun interface WsAbortListenerCallbackFn {
    public operator fun invoke(listenerinstance: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsAbortListenerCallback = WsAbortListenerCallbackFn?

public fun interface WsAcceptChannelCallbackFn {
    public operator fun invoke(listenerinstance: COpaquePointer?, channelinstance: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsAcceptChannelCallback = WsAcceptChannelCallbackFn?

public typealias WsAddressingVersion = Int

public fun interface WsAsyncCallbackFn {
    public operator fun invoke(errorcode: Hresult, callbackmodel: WsCallbackModel, callbackstate: COpaquePointer?)
}

public typealias WsAsyncCallback = WsAsyncCallbackFn?

public fun interface WsAsyncFunctionFn {
    public operator fun invoke(hr: Hresult, callbackmodel: WsCallbackModel, callbackstate: COpaquePointer?, next: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsAsyncFunction = WsAsyncFunctionFn?

public typealias WsBindingTemplateType = Int

public typealias WsCallbackModel = Int

public typealias WsCallPropertyId = Int

public fun interface WsCertificateValidationCallbackFn {
    public operator fun invoke(certcontext: COpaquePointer?, state: COpaquePointer?): Hresult
}

public typealias WsCertificateValidationCallback = WsCertificateValidationCallbackFn?

public typealias WsCertCredentialType = Int

public fun interface WsCertIssuerListNotificationCallbackFn {
    public operator fun invoke(certissuerlistnotificationcallbackstate: COpaquePointer?, issuerlist: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsCertIssuerListNotificationCallback = WsCertIssuerListNotificationCallbackFn?

public typealias WsChannel = Long

public typealias WsChannelBinding = Int

public typealias WsChannelPropertyId = Int

public typealias WsChannelState = Int

public typealias WsChannelType = Int

public typealias WsCharset = Int

public fun interface WsCloseChannelCallbackFn {
    public operator fun invoke(channelinstance: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsCloseChannelCallback = WsCloseChannelCallbackFn?

public fun interface WsCloseListenerCallbackFn {
    public operator fun invoke(listenerinstance: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsCloseListenerCallback = WsCloseListenerCallbackFn?

public typealias WsCookieMode = Int

public fun interface WsCreateChannelCallbackFn {
    public operator fun invoke(channeltype: WsChannelType, channelparameters: COpaquePointer?, channelparameterssize: UInt, channelinstance: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsCreateChannelCallback = WsCreateChannelCallbackFn?

public fun interface WsCreateChannelForListenerCallbackFn {
    public operator fun invoke(listenerinstance: COpaquePointer?, channelparameters: COpaquePointer?, channelparameterssize: UInt, channelinstance: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsCreateChannelForListenerCallback = WsCreateChannelForListenerCallbackFn?

public fun interface WsCreateDecoderCallbackFn {
    public operator fun invoke(createcontext: COpaquePointer?, readcallback: WsReadCallback, readcontext: COpaquePointer?, decodercontext: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsCreateDecoderCallback = WsCreateDecoderCallbackFn?

public fun interface WsCreateEncoderCallbackFn {
    public operator fun invoke(createcontext: COpaquePointer?, writecallback: WsWriteCallback, writecontext: COpaquePointer?, encodercontext: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsCreateEncoderCallback = WsCreateEncoderCallbackFn?

public fun interface WsCreateListenerCallbackFn {
    public operator fun invoke(channeltype: WsChannelType, listenerparameters: COpaquePointer?, listenerparameterssize: UInt, listenerinstance: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsCreateListenerCallback = WsCreateListenerCallbackFn?

public typealias WsDatetimeFormat = Int

public fun interface WsDecoderDecodeCallbackFn {
    public operator fun invoke(encodercontext: COpaquePointer?, buffer: COpaquePointer?, maxlength: UInt, length: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsDecoderDecodeCallback = WsDecoderDecodeCallbackFn?

public fun interface WsDecoderEndCallbackFn {
    public operator fun invoke(encodercontext: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsDecoderEndCallback = WsDecoderEndCallbackFn?

public fun interface WsDecoderGetContentTypeCallbackFn {
    public operator fun invoke(decodercontext: COpaquePointer?, contenttype: COpaquePointer?, contentencoding: COpaquePointer?, newcontenttype: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsDecoderGetContentTypeCallback = WsDecoderGetContentTypeCallbackFn?

public fun interface WsDecoderStartCallbackFn {
    public operator fun invoke(encodercontext: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsDecoderStartCallback = WsDecoderStartCallbackFn?

public fun interface WsDurationComparisonCallbackFn {
    public operator fun invoke(duration1: COpaquePointer?, duration2: COpaquePointer?, result: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsDurationComparisonCallback = WsDurationComparisonCallbackFn?

public fun interface WsDynamicStringCallbackFn {
    public operator fun invoke(callbackstate: COpaquePointer?, string: COpaquePointer?, found: COpaquePointer?, id: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsDynamicStringCallback = WsDynamicStringCallbackFn?

public fun interface WsEncoderEncodeCallbackFn {
    public operator fun invoke(encodercontext: COpaquePointer?, buffers: COpaquePointer?, count: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsEncoderEncodeCallback = WsEncoderEncodeCallbackFn?

public fun interface WsEncoderEndCallbackFn {
    public operator fun invoke(encodercontext: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsEncoderEndCallback = WsEncoderEndCallbackFn?

public fun interface WsEncoderGetContentTypeCallbackFn {
    public operator fun invoke(encodercontext: COpaquePointer?, contenttype: COpaquePointer?, newcontenttype: COpaquePointer?, contentencoding: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsEncoderGetContentTypeCallback = WsEncoderGetContentTypeCallbackFn?

public fun interface WsEncoderStartCallbackFn {
    public operator fun invoke(encodercontext: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsEncoderStartCallback = WsEncoderStartCallbackFn?

public typealias WsEncoding = Int

public typealias WsEndpointAddressExtensionType = Int

public typealias WsEndpointIdentityType = Int

public typealias WsEnvelopeVersion = Int

public typealias WsError = Long

public typealias WsErrorPropertyId = Int

public typealias WsExceptionCode = Int

public typealias WsExtendedProtectionPolicy = Int

public typealias WsExtendedProtectionScenario = Int

public typealias WsFaultDisclosure = Int

public typealias WsFaultErrorPropertyId = Int

public typealias WsFieldMapping = Int

public fun interface WsFreeChannelCallbackFn {
    public operator fun invoke(channelinstance: COpaquePointer?)
}

public typealias WsFreeChannelCallback = WsFreeChannelCallbackFn?

public fun interface WsFreeDecoderCallbackFn {
    public operator fun invoke(decodercontext: COpaquePointer?)
}

public typealias WsFreeDecoderCallback = WsFreeDecoderCallbackFn?

public fun interface WsFreeEncoderCallbackFn {
    public operator fun invoke(encodercontext: COpaquePointer?)
}

public typealias WsFreeEncoderCallback = WsFreeEncoderCallbackFn?

public fun interface WsFreeListenerCallbackFn {
    public operator fun invoke(listenerinstance: COpaquePointer?)
}

public typealias WsFreeListenerCallback = WsFreeListenerCallbackFn?

public fun interface WsGetCertCallbackFn {
    public operator fun invoke(getcertcallbackstate: COpaquePointer?, targetaddress: COpaquePointer?, viauri: COpaquePointer?, cert: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsGetCertCallback = WsGetCertCallbackFn?

public fun interface WsGetChannelPropertyCallbackFn {
    public operator fun invoke(channelinstance: COpaquePointer?, id: WsChannelPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult
}

public typealias WsGetChannelPropertyCallback = WsGetChannelPropertyCallbackFn?

public fun interface WsGetListenerPropertyCallbackFn {
    public operator fun invoke(listenerinstance: COpaquePointer?, id: WsListenerPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult
}

public typealias WsGetListenerPropertyCallback = WsGetListenerPropertyCallbackFn?

public typealias WsHeaderType = Int

public typealias WsHeap = Long

public typealias WsHeapPropertyId = Int

public typealias WsHttpHeaderAuthTarget = Int

public typealias WsHttpProxySettingMode = Int

public fun interface WsHttpRedirectCallbackFn {
    public operator fun invoke(state: COpaquePointer?, originalurl: COpaquePointer?, newurl: COpaquePointer?): Hresult
}

public typealias WsHttpRedirectCallback = WsHttpRedirectCallbackFn?

public typealias WsIpVersion = Int

public fun interface WsIsDefaultValueCallbackFn {
    public operator fun invoke(descriptiondata: COpaquePointer?, value: COpaquePointer?, defaultvalue: COpaquePointer?, valuesize: UInt, isdefault: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsIsDefaultValueCallback = WsIsDefaultValueCallbackFn?

public typealias WsListener = Long

public typealias WsListenerPropertyId = Int

public typealias WsListenerState = Int

public typealias WsMessage = Long

public fun interface WsMessageDoneCallbackFn {
    public operator fun invoke(donecallbackstate: COpaquePointer?)
}

public typealias WsMessageDoneCallback = WsMessageDoneCallbackFn?

public typealias WsMessageInitialization = Int

public typealias WsMessagePropertyId = Int

public typealias WsMessageSecurityUsage = Int

public typealias WsMessageState = Int

public typealias WsMetadata = Long

public typealias WsMetadataExchangeType = Int

public typealias WsMetadataPropertyId = Int

public typealias WsMetadataState = Int

public typealias WsMoveTo = Int

public fun interface WsOpenChannelCallbackFn {
    public operator fun invoke(channelinstance: COpaquePointer?, endpointaddress: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsOpenChannelCallback = WsOpenChannelCallbackFn?

public fun interface WsOpenListenerCallbackFn {
    public operator fun invoke(listenerinstance: COpaquePointer?, url: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsOpenListenerCallback = WsOpenListenerCallbackFn?

public fun interface WsOperationCancelCallbackFn {
    public operator fun invoke(reason: WsServiceCancelReason, state: COpaquePointer?)
}

public typealias WsOperationCancelCallback = WsOperationCancelCallbackFn?

public typealias WsOperationContext = Long

public typealias WsOperationContextPropertyId = Int

public fun interface WsOperationFreeStateCallbackFn {
    public operator fun invoke(state: COpaquePointer?)
}

public typealias WsOperationFreeStateCallback = WsOperationFreeStateCallbackFn?

public typealias WsOperationStyle = Int

public typealias WsParameterType = Int

public typealias WsPolicy = Long

public typealias WsPolicyExtensionType = Int

public typealias WsPolicyPropertyId = Int

public typealias WsPolicyState = Int

public typealias WsProtectionLevel = Int

public fun interface WsProxyMessageCallbackFn {
    public operator fun invoke(message: COpaquePointer?, heap: COpaquePointer?, state: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsProxyMessageCallback = WsProxyMessageCallbackFn?

public typealias WsProxyPropertyId = Int

public fun interface WsPullBytesCallbackFn {
    public operator fun invoke(callbackstate: COpaquePointer?, bytes: COpaquePointer?, maxsize: UInt, actualsize: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsPullBytesCallback = WsPullBytesCallbackFn?

public fun interface WsPushBytesCallbackFn {
    public operator fun invoke(callbackstate: COpaquePointer?, writecallback: WsWriteCallback, writecallbackstate: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsPushBytesCallback = WsPushBytesCallbackFn?

public fun interface WsReadCallbackFn {
    public operator fun invoke(callbackstate: COpaquePointer?, bytes: COpaquePointer?, maxsize: UInt, actualsize: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsReadCallback = WsReadCallbackFn?

public fun interface WsReadMessageEndCallbackFn {
    public operator fun invoke(channelinstance: COpaquePointer?, message: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsReadMessageEndCallback = WsReadMessageEndCallbackFn?

public fun interface WsReadMessageStartCallbackFn {
    public operator fun invoke(channelinstance: COpaquePointer?, message: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsReadMessageStartCallback = WsReadMessageStartCallbackFn?

public typealias WsReadOption = Int

public fun interface WsReadTypeCallbackFn {
    public operator fun invoke(reader: COpaquePointer?, typemapping: WsTypeMapping, descriptiondata: COpaquePointer?, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult
}

public typealias WsReadTypeCallback = WsReadTypeCallbackFn?

public typealias WsReceiveOption = Int

public typealias WsRepeatingHeaderOption = Int

public typealias WsRequestSecurityTokenAction = Int

public typealias WsRequestSecurityTokenPropertyId = Int

public fun interface WsResetChannelCallbackFn {
    public operator fun invoke(channelinstance: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsResetChannelCallback = WsResetChannelCallbackFn?

public fun interface WsResetListenerCallbackFn {
    public operator fun invoke(listenerinstance: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsResetListenerCallback = WsResetListenerCallbackFn?

public typealias WsSamlAuthenticatorType = Int

public typealias WsSecureConversationVersion = Int

public typealias WsSecureProtocol = Int

public typealias WsSecurityAlgorithmId = Int

public typealias WsSecurityAlgorithmPropertyId = Int

public typealias WsSecurityAlgorithmSuiteName = Int

public typealias WsSecurityBearerKeyTypeVersion = Int

public typealias WsSecurityBindingConstraintType = Int

public typealias WsSecurityBindingPropertyId = Int

public typealias WsSecurityBindingType = Int

public typealias WsSecurityContext = Long

public typealias WsSecurityContextPropertyId = Int

public typealias WsSecurityHeaderLayout = Int

public typealias WsSecurityHeaderVersion = Int

public typealias WsSecurityKeyEntropyMode = Int

public typealias WsSecurityKeyHandleType = Int

public typealias WsSecurityKeyType = Int

public typealias WsSecurityPropertyId = Int

public typealias WsSecurityTimestampUsage = Int

public typealias WsSecurityToken = Long

public typealias WsSecurityTokenPropertyId = Int

public typealias WsSecurityTokenReferenceMode = Int

public fun interface WsServiceAcceptChannelCallbackFn {
    public operator fun invoke(context: COpaquePointer?, channelstate: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsServiceAcceptChannelCallback = WsServiceAcceptChannelCallbackFn?

public typealias WsServiceCancelReason = Int

public fun interface WsServiceCloseChannelCallbackFn {
    public operator fun invoke(context: COpaquePointer?, asynccontext: COpaquePointer?): Hresult
}

public typealias WsServiceCloseChannelCallback = WsServiceCloseChannelCallbackFn?

public typealias WsServiceEndpointPropertyId = Int

public typealias WsServiceHost = Long

public typealias WsServiceHostState = Int

public fun interface WsServiceMessageReceiveCallbackFn {
    public operator fun invoke(context: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsServiceMessageReceiveCallback = WsServiceMessageReceiveCallbackFn?

public typealias WsServicePropertyId = Int

public typealias WsServiceProxy = Long

public typealias WsServiceProxyState = Int

public fun interface WsServiceSecurityCallbackFn {
    public operator fun invoke(context: COpaquePointer?, authorized: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsServiceSecurityCallback = WsServiceSecurityCallbackFn?

public fun interface WsServiceStubCallbackFn {
    public operator fun invoke(context: COpaquePointer?, frame: COpaquePointer?, callback: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsServiceStubCallback = WsServiceStubCallbackFn?

public fun interface WsSetChannelPropertyCallbackFn {
    public operator fun invoke(channelinstance: COpaquePointer?, id: WsChannelPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult
}

public typealias WsSetChannelPropertyCallback = WsSetChannelPropertyCallbackFn?

public fun interface WsSetListenerPropertyCallbackFn {
    public operator fun invoke(listenerinstance: COpaquePointer?, id: WsListenerPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult
}

public typealias WsSetListenerPropertyCallback = WsSetListenerPropertyCallbackFn?

public fun interface WsShutdownSessionChannelCallbackFn {
    public operator fun invoke(channelinstance: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsShutdownSessionChannelCallback = WsShutdownSessionChannelCallbackFn?

public typealias WsTraceApi = Int

public typealias WsTransferMode = Int

public typealias WsTrustVersion = Int

public typealias WsType = Int

public typealias WsTypeMapping = Int

public typealias WsUrlSchemeType = Int

public typealias WsUsernameCredentialType = Int

public fun interface WsValidatePasswordCallbackFn {
    public operator fun invoke(passwordvalidatorcallbackstate: COpaquePointer?, username: COpaquePointer?, password: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsValidatePasswordCallback = WsValidatePasswordCallbackFn?

public fun interface WsValidateSamlCallbackFn {
    public operator fun invoke(samlvalidatorcallbackstate: COpaquePointer?, samlassertion: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsValidateSamlCallback = WsValidateSamlCallbackFn?

public typealias WsValueType = Int

public typealias WsWindowsIntegratedAuthCredentialType = Int

public typealias WsWindowsIntegratedAuthPackage = Int

public fun interface WsWriteCallbackFn {
    public operator fun invoke(callbackstate: COpaquePointer?, buffers: COpaquePointer?, count: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsWriteCallback = WsWriteCallbackFn?

public fun interface WsWriteMessageEndCallbackFn {
    public operator fun invoke(channelinstance: COpaquePointer?, message: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsWriteMessageEndCallback = WsWriteMessageEndCallbackFn?

public fun interface WsWriteMessageStartCallbackFn {
    public operator fun invoke(channelinstance: COpaquePointer?, message: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult
}

public typealias WsWriteMessageStartCallback = WsWriteMessageStartCallbackFn?

public typealias WsWriteOption = Int

public fun interface WsWriteTypeCallbackFn {
    public operator fun invoke(writer: COpaquePointer?, typemapping: WsTypeMapping, descriptiondata: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult
}

public typealias WsWriteTypeCallback = WsWriteTypeCallbackFn?

public typealias WsXmlBuffer = Long

public typealias WsXmlBufferPropertyId = Int

public typealias WsXmlCanonicalizationAlgorithm = Int

public typealias WsXmlCanonicalizationPropertyId = Int

public typealias WsXmlNodeType = Int

public typealias WsXmlReader = Long

public typealias WsXmlReaderEncodingType = Int

public typealias WsXmlReaderInputType = Int

public typealias WsXmlReaderPropertyId = Int

public typealias WsXmlSecurityTokenPropertyId = Int

public typealias WsXmlTextType = Int

public typealias WsXmlWriter = Long

public typealias WsXmlWriterEncodingType = Int

public typealias WsXmlWriterOutputType = Int

public typealias WsXmlWriterPropertyId = Int
