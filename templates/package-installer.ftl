<#-- template to create the options file for the jpackage tool to create the installer -->
--name WorkInProgressCalendar
<#if osName?upper_case?contains("WIN")>

<#elseif osName?upper_case?contains("MAC")>
--mac-package-name Foo
<#else>

</#if>