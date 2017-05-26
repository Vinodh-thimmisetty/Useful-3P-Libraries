<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.1" xmlns="http://www.w3.org/1999/xhtml"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format">

	<xsl:template match="summaryPage">
		<fo:root xmlns:fo="http://www.w3.org/1999/XSL/Format">
			<fo:layout-master-set>
				<fo:simple-page-master master-name="simpleA4"
					page-height="29.7cm" page-width="21cm" margin-top="2cm"
					margin-bottom="2cm" margin-left="2cm" margin-right="2cm">
					<fo:region-body />
				</fo:simple-page-master>
			</fo:layout-master-set>

			<fo:page-sequence master-reference="simpleA4">
				<fo:flow flow-name="xsl-region-body">
					<fo:block font-size="16pt" font-weight="bold" space-after="5mm">
						Product Return:
						<xsl:value-of select="@returnId" />
					</fo:block>
					<fo:block font-size="10pt">
						<fo:table table-layout="fixed" width="100%"
							border-collapse="separate">
							<fo:table-body>
								<fo:table-row>
									<fo:table-cell>
										<xsl:apply-templates select="myTiAccountDetails" />
									</fo:table-cell>
									<fo:table-cell>
										<xsl:apply-templates select="contactDetails" />
									</fo:table-cell>

								</fo:table-row>


								<fo:table-row>
									<fo:table-cell>
										<fo:block font-size="16pt" font-weight="bold"
											space-after="5mm">
											Orderable Part Number:
										</fo:block>
									</fo:table-cell>
									<fo:table-cell>
										<fo:block color="red" font-size="16pt" font-weight="bold"
											space-after="5mm">
											<xsl:value-of select="orderablePartNumber" />
										</fo:block>
									</fo:table-cell>

								</fo:table-row>
								<fo:table-row>
									<fo:table-cell>
										<fo:block font-size="16pt" font-weight="bold"
											space-after="5mm">
											Customer Part Number:
										</fo:block>
									</fo:table-cell>
									<fo:table-cell>
										<fo:block color="red" font-size="16pt" font-weight="bold"
											space-after="5mm">
											<xsl:value-of select="customerPartNumber" />
										</fo:block>
									</fo:table-cell>
								</fo:table-row>

								<xsl:apply-templates select="firstPage" />
								<xsl:apply-templates select="secondPage" />
								<xsl:apply-templates select="thirdPage" />
								<xsl:apply-templates select="fourthPage" />

								<xsl:apply-templates select="firstPage" />
								<xsl:apply-templates select="secondPage" />
								<xsl:apply-templates select="thirdPage" />
								<xsl:apply-templates select="fourthPage" />

								<xsl:apply-templates select="firstPage" />
								<xsl:apply-templates select="secondPage" />
								<xsl:apply-templates select="thirdPage" />
								<xsl:apply-templates select="fourthPage" />

								<xsl:apply-templates select="firstPage" />
								<xsl:apply-templates select="secondPage" />
								<xsl:apply-templates select="thirdPage" />
								<xsl:apply-templates select="fourthPage" />


							</fo:table-body>
						</fo:table>
					</fo:block>
				</fo:flow>
			</fo:page-sequence>
		</fo:root>
	</xsl:template>

	<xsl:template match="firstPage">
		<fo:table-row>
			<fo:table-cell>
				<fo:block font-size="16pt" font-weight="bold" space-after="5mm">
					Distributor Number:
				</fo:block>
			</fo:table-cell>
			<fo:table-cell>
				<fo:block color="red" font-size="16pt" font-weight="bold"
					space-after="5mm">
					<xsl:value-of select="distNumber" />
				</fo:block>
			</fo:table-cell>
		</fo:table-row>
		<fo:table-row>
			<fo:table-cell>
				<fo:block font-size="16pt" font-weight="bold" space-after="5mm">
					Is Manufactured by Third Party:
				</fo:block>
			</fo:table-cell>
			<fo:table-cell>
				<fo:block color="red" font-size="16pt" font-weight="bold"
					space-after="5mm">
					<xsl:value-of select="mfgThirdParty" />
				</fo:block>
			</fo:table-cell>
		</fo:table-row>
		<fo:table-row>
			<fo:table-cell>
				<fo:block font-size="16pt" font-weight="bold" space-after="5mm">
					Purchased From:
				</fo:block>
			</fo:table-cell>
			<fo:table-cell>
				<fo:block color="red" font-size="16pt" font-weight="bold"
					space-after="5mm">
					<xsl:value-of select="purchasedFrom" />
				</fo:block>
			</fo:table-cell>
		</fo:table-row>
		<fo:table-row>
			<fo:table-cell>
				<fo:block font-size="16pt" font-weight="bold" space-after="5mm">
					Sales Name:
				</fo:block>
			</fo:table-cell>
			<fo:table-cell>
				<fo:block color="red" font-size="16pt" font-weight="bold"
					space-after="5mm">
					<xsl:value-of select="salesName" />
				</fo:block>
			</fo:table-cell>
		</fo:table-row>
		<fo:table-row>
			<fo:table-cell>
				<fo:block font-size="16pt" font-weight="bold" space-after="5mm">
					Sales Order Number:
				</fo:block>
			</fo:table-cell>
			<fo:table-cell>
				<fo:block color="red" font-size="16pt" font-weight="bold"
					space-after="5mm">
					<xsl:value-of select="salesOrderNumber" />
				</fo:block>
			</fo:table-cell>
		</fo:table-row>

	</xsl:template>
	<xsl:template match="secondPage">
		<fo:table-row>
			<fo:table-cell>
				<fo:block font-size="16pt" font-weight="bold" space-after="5mm">
					Distributor Number2:
				</fo:block>
			</fo:table-cell>
			<fo:table-cell>
				<fo:block color="red" font-size="16pt" font-weight="bold"
					space-after="5mm">
					<xsl:value-of select="distNumber2" />
				</fo:block>
			</fo:table-cell>
		</fo:table-row>
		<fo:table-row>
			<fo:table-cell>
				<fo:block font-size="16pt" font-weight="bold" space-after="5mm">
					Is Manufactured by Third Party2:
				</fo:block>
			</fo:table-cell>
			<fo:table-cell>
				<fo:block color="red" font-size="16pt" font-weight="bold"
					space-after="5mm">
					<xsl:value-of select="mfgThirdParty2" />
				</fo:block>
			</fo:table-cell>
		</fo:table-row>
		<fo:table-row>
			<fo:table-cell>
				<fo:block font-size="16pt" font-weight="bold" space-after="5mm">
					Purchased From2:
				</fo:block>
			</fo:table-cell>
			<fo:table-cell>
				<fo:block color="red" font-size="16pt" font-weight="bold"
					space-after="5mm">
					<xsl:value-of select="purchasedFrom2" />
				</fo:block>
			</fo:table-cell>
		</fo:table-row>
		<fo:table-row>
			<fo:table-cell>
				<fo:block font-size="16pt" font-weight="bold" space-after="5mm">
					Sales Name2:
				</fo:block>
			</fo:table-cell>
			<fo:table-cell>
				<fo:block color="red" font-size="16pt" font-weight="bold"
					space-after="5mm">
					<xsl:value-of select="salesName2" />
				</fo:block>
			</fo:table-cell>
		</fo:table-row>
		<fo:table-row>
			<fo:table-cell>
				<fo:block font-size="16pt" font-weight="bold" space-after="5mm">
					Sales Order Number2:
				</fo:block>
			</fo:table-cell>
			<fo:table-cell>
				<fo:block color="red" font-size="16pt" font-weight="bold"
					space-after="5mm">
					<xsl:value-of select="salesOrderNumber2" />
				</fo:block>
			</fo:table-cell>
		</fo:table-row>

	</xsl:template>



	<xsl:template match="thirdPage">
		<fo:table-row>
			<fo:table-cell>
				<fo:block font-size="16pt" font-weight="bold" space-after="5mm">
					Distributor Number3:
				</fo:block>
			</fo:table-cell>
			<fo:table-cell>
				<fo:block color="red" font-size="16pt" font-weight="bold"
					space-after="5mm">
					<xsl:value-of select="distNumber3" />
				</fo:block>
			</fo:table-cell>
		</fo:table-row>
		<fo:table-row>
			<fo:table-cell>
				<fo:block font-size="16pt" font-weight="bold" space-after="5mm">
					Is Manufactured by Third Party3:
				</fo:block>
			</fo:table-cell>
			<fo:table-cell>
				<fo:block color="red" font-size="16pt" font-weight="bold"
					space-after="5mm">
					<xsl:value-of select="mfgThirdParty3" />
				</fo:block>
			</fo:table-cell>
		</fo:table-row>
		<fo:table-row>
			<fo:table-cell>
				<fo:block font-size="16pt" font-weight="bold" space-after="5mm">
					Purchased From3:
				</fo:block>
			</fo:table-cell>
			<fo:table-cell>
				<fo:block color="red" font-size="16pt" font-weight="bold"
					space-after="5mm">
					<xsl:value-of select="purchasedFrom3" />
				</fo:block>
			</fo:table-cell>
		</fo:table-row>
		<fo:table-row>
			<fo:table-cell>
				<fo:block font-size="16pt" font-weight="bold" space-after="5mm">
					Sales Name3:
				</fo:block>
			</fo:table-cell>
			<fo:table-cell>
				<fo:block color="red" font-size="16pt" font-weight="bold"
					space-after="5mm">
					<xsl:value-of select="salesName3" />
				</fo:block>
			</fo:table-cell>
		</fo:table-row>
		<fo:table-row>
			<fo:table-cell>
				<fo:block font-size="16pt" font-weight="bold" space-after="5mm">
					Sales Order Number3:
				</fo:block>
			</fo:table-cell>
			<fo:table-cell>
				<fo:block color="red" font-size="16pt" font-weight="bold"
					space-after="5mm">
					<xsl:value-of select="salesOrderNumber3" />
				</fo:block>
			</fo:table-cell>
		</fo:table-row>

	</xsl:template>
	<xsl:template match="fourthPage">
		<fo:table-row>
			<fo:table-cell>
				<fo:block font-size="16pt" font-weight="bold" space-after="5mm">
					Distributor Number4:
				</fo:block>
			</fo:table-cell>
			<fo:table-cell>
				<fo:block color="red" font-size="16pt" font-weight="bold"
					space-after="5mm">
					<xsl:value-of select="distNumber4" />
				</fo:block>
			</fo:table-cell>
		</fo:table-row>
		<fo:table-row>
			<fo:table-cell>
				<fo:block font-size="16pt" font-weight="bold" space-after="5mm">
					Is Manufactured by Third Party4:
				</fo:block>
			</fo:table-cell>
			<fo:table-cell>
				<fo:block color="red" font-size="16pt" font-weight="bold"
					space-after="5mm">
					<xsl:value-of select="mfgThirdParty4" />
				</fo:block>
			</fo:table-cell>
		</fo:table-row>
		<fo:table-row>
			<fo:table-cell>
				<fo:block font-size="16pt" font-weight="bold" space-after="5mm">
					Purchased From4:
				</fo:block>
			</fo:table-cell>
			<fo:table-cell>
				<fo:block color="red" font-size="16pt" font-weight="bold"
					space-after="5mm">
					<xsl:value-of select="purchasedFrom4" />
				</fo:block>
			</fo:table-cell>
		</fo:table-row>
		<fo:table-row>
			<fo:table-cell>
				<fo:block font-size="16pt" font-weight="bold" space-after="5mm">
					Sales Name4:
				</fo:block>
			</fo:table-cell>
			<fo:table-cell>
				<fo:block color="red" font-size="16pt" font-weight="bold"
					space-after="5mm">
					<xsl:value-of select="salesName4" />
				</fo:block>
			</fo:table-cell>
		</fo:table-row>
		<fo:table-row>
			<fo:table-cell>
				<fo:block font-size="16pt" font-weight="bold" space-after="5mm">
					Sales Order Number4:
				</fo:block>
			</fo:table-cell>
			<fo:table-cell>
				<fo:block color="red" font-size="16pt" font-weight="bold"
					space-after="5mm">
					<xsl:value-of select="salesOrderNumber4" />
				</fo:block>
			</fo:table-cell>
		</fo:table-row>

	</xsl:template>

	<xsl:template match="contactDetails">
		<fo:table>
			<fo:table-body>
				<fo:table-row>
					<fo:table-cell>
						<fo:block color="red" font-size="16pt" font-weight="bold"
							space-after="5mm">
							<xsl:value-of select="contactAddress" />
						</fo:block>
					</fo:table-cell>
				</fo:table-row>
				<fo:table-row>
					<fo:table-cell>
						<fo:block color="red" font-size="16pt" font-weight="bold"
							space-after="5mm">
							<xsl:value-of select="contactCity" />
						</fo:block>
					</fo:table-cell>
				</fo:table-row>
				<fo:table-row>
					<fo:table-cell>
						<fo:block color="red" font-size="16pt" font-weight="bold"
							space-after="5mm">
							<xsl:value-of select="contactEmail" />
						</fo:block>
					</fo:table-cell>
				</fo:table-row>
				<fo:table-row>

					<fo:table-cell>
						<fo:block color="red" font-size="16pt" font-weight="bold"
							space-after="5mm">
							<xsl:value-of select="contactEnemy" />
						</fo:block>
					</fo:table-cell>
				</fo:table-row>
				<fo:table-row>
					<fo:table-cell>
						<fo:block color="red" font-size="16pt" font-weight="bold"
							space-after="5mm">
							<xsl:value-of select="contactFriend" />
						</fo:block>
					</fo:table-cell>
				</fo:table-row>
				<fo:table-row>
					<fo:table-cell>
						<fo:block color="red" font-size="16pt" font-weight="bold"
							space-after="5mm">
							<xsl:value-of select="contactName" />
						</fo:block>
					</fo:table-cell>
				</fo:table-row>
				<fo:table-row>
					<fo:table-cell>
						<fo:block color="red" font-size="16pt" font-weight="bold"
							space-after="5mm">
							<xsl:value-of select="contactPhone" />
						</fo:block>
					</fo:table-cell>
				</fo:table-row>
			</fo:table-body>
		</fo:table>
	</xsl:template>
	<xsl:template match="myTiAccountDetails">
		<fo:table>
			<fo:table-body>
				<fo:table-row>
					<fo:table-cell>
						<fo:block color="red" font-size="16pt" font-weight="bold"
							space-after="5mm">
							<xsl:value-of select="dob" />
						</fo:block>
					</fo:table-cell>
				</fo:table-row>
				<fo:table-row>
					<fo:table-cell>
						<fo:block color="red" font-size="16pt" font-weight="bold"
							space-after="5mm">
							<xsl:value-of select="email" />
						</fo:block>
					</fo:table-cell>
				</fo:table-row>
				<fo:table-row>
					<fo:table-cell>
						<fo:block color="red" font-size="16pt" font-weight="bold"
							space-after="5mm">
							<xsl:value-of select="firstName" />
						</fo:block>
					</fo:table-cell>
				</fo:table-row>
				<fo:table-row>
					<fo:table-cell>
						<fo:block color="red" font-size="16pt" font-weight="bold"
							space-after="5mm">
							<xsl:value-of select="lastName" />
						</fo:block>
					</fo:table-cell>
				</fo:table-row>
				<fo:table-row>
					<fo:table-cell>
						<fo:block color="red" font-size="16pt" font-weight="bold"
							space-after="5mm">
							<xsl:value-of select="phone" />
						</fo:block>
					</fo:table-cell>
				</fo:table-row>
			</fo:table-body>
		</fo:table>
	</xsl:template>


</xsl:stylesheet>